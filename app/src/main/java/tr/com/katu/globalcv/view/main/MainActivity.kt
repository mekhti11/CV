package tr.com.katu.globalcv.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tr.com.katu.globalcv.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        NavOptions navOptions = new NavOptions.Builder()
//            .setPopUpTo(R.id.firstFragment, true)
//            .build();
//        And use them for the navigation:
//
//        Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment, bundle, navOptions);
    }
}