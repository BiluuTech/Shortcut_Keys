package com.biluutech.usamatech.shortcuttools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {


    private ImageView adobeIllustratorCV;
    private ImageView adobePhotoShopCV;
    private ImageView adobeReaderCV;
    private ImageView androidStudioCV;
    private ImageView anydeskCV;
    private ImageView googleCV;
    private ImageView windowsCV;
    private ImageView macCV;
    private ImageView notepadplusplusCV;
    private ImageView operaCV;
    private ImageView microsoftEdgeCV;
    private ImageView vlcCV;
    private ImageView msExclCV;
    private ImageView typingmasterCV;
    private ImageView msPowerPointCV;
    private ImageView msWordCV;
    private ImageView notePadCV;
    private ImageView paintsCV;
    private ImageView adobepremiereCV;
    private ImageView xdCV;
    private ImageView aftereffectCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }

    public void adobeReaderOnClick (View view){
        Intent nextActivity = new Intent(this, AdobeReaderActivity.class);
        startActivity(nextActivity);
    }

    public void anyDeskOnClick (View view){
        Intent nextActivity = new Intent(this, AnyDeskActivity.class);
        startActivity(nextActivity);
    }
    public void adobeIllustratortOnClick (View view){
        Intent nextActivity = new Intent(this, AdobeIllustratorActivity.class);
        startActivity(nextActivity);
    }
    public void adobePhotoshopOnClick (View view){
        Intent nextActivity = new Intent(this, AdobePhotoshopActivity.class);
        startActivity(nextActivity);
    }
    public void xdOnClick (View view){
        Intent nextActivity = new Intent(this, XDActivity.class);
        startActivity(nextActivity);
    }
    public void androidStudioOnClick (View view){
        Intent nextActivity = new Intent(this, AndroidStudioActivity.class);
        startActivity(nextActivity);
    }
    public void msWordOnClick (View view){
        Intent nextActivity = new Intent(this, MSWordActivity.class);
        startActivity(nextActivity);
    }
    public void msExcelOnClick (View view){
        Intent nextActivity = new Intent(this, MSExcelActivity.class);
        startActivity(nextActivity);
    }
    public void msPowerpointOnClick (View view){
        Intent nextActivity = new Intent(this, MSPowerPointActivity.class);
        startActivity(nextActivity);
    }
    public void operaOnClick (View view){
        Intent nextActivity = new Intent(this, OperaActivity.class);
        startActivity(nextActivity);
    }
    public void googleOnClick (View view){
        Intent nextActivity = new Intent(this, GoogleActivity.class);
        startActivity(nextActivity);
    }
    public void microsoftEdgeOnClick (View view){
        Intent nextActivity = new Intent(this, MicrosoftEdgeActivity.class);
        startActivity(nextActivity);
    }
    public void notepadeOnClick (View view){
        Intent nextActivity = new Intent(this, NotePadActivity.class);
        startActivity(nextActivity);
    }
    public void notepadePlusOnClick (View view){
        Intent nextActivity = new Intent(this, NotepadPlusPlusActivty.class);
        startActivity(nextActivity);
    }
    public void typingMasterOnClick (View view){
        Intent nextActivity = new Intent(this, TypingMasterActivity.class);
        startActivity(nextActivity);
    }
    public void windowsnClick (View view){
        Intent nextActivity = new Intent(this, WindowsActivity.class);
        startActivity(nextActivity);
    }
    public void paintsOnClick (View view){
        Intent nextActivity = new Intent(this, PaintsActivity.class);
        startActivity(nextActivity);
    }
    public void macOnClick (View view){
        Intent nextActivity = new Intent(this, MacActivity.class);
        startActivity(nextActivity);
    }
    public void vlcOnClick (View view){
        Intent nextActivity = new Intent(this, VLCActivity.class);
        startActivity(nextActivity);
    }
    public void adobePremiereOnClick (View view){
        Intent nextActivity = new Intent(this, AdobePremiereActivity.class);
        startActivity(nextActivity);
    }
    public void afterEffectOnClick (View view){
        Intent nextActivity = new Intent(this, AdobeAfterAffectActivity.class);
        startActivity(nextActivity);
    }


}