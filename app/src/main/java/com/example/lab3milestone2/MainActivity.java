package com.example.lab3milestone2;

        import android.app.Fragment;
        import android.app.FragmentManager;
        import androidx.appcompat.app.AppCompatActivity;
        import android.app.FragmentTransaction;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragement, secondFragement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get Reference of Buttons
        firstFragement = findViewById(R.id.firstFragment);
        secondFragement = findViewById(R.id.secondFragment);

        // perform setOnClickListener Event for First button
        firstFragement.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragement(new FirstFragment());
            }
        }));

        secondFragement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragement(new SecondFragment());
            }
        });

    }

    private void loadFragement(Fragment fragment){
        // create a FragmentManager
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
