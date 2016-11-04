package arend.arendvandormalen_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayImage(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkArms:
                ImageView armsView = (ImageView)findViewById(R.id.imgArms);
                if (checked)
                    armsView.setVisibility(View.VISIBLE);
                else
                    armsView.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEars:
                ImageView earsView = (ImageView)findViewById(R.id.imgEars);
                if (checked)
                    earsView.setVisibility(View.VISIBLE);
                else
                    earsView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkEyebrows:
                ImageView eyebrowsView = (ImageView)findViewById(R.id.imgEyebrows);
                if (checked)
                    eyebrowsView.setVisibility(View.VISIBLE);
                else
                    eyebrowsView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkEyes:
                ImageView eyesView = (ImageView)findViewById(R.id.imgEyes);
                if (checked)
                    eyesView.setVisibility(View.VISIBLE);
                else
                    eyesView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkGlasses:
                ImageView glassesView = (ImageView)findViewById(R.id.imgGlasses);
                if (checked)
                    glassesView.setVisibility(View.VISIBLE);
                else
                    glassesView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkHat:
                ImageView hatView = (ImageView)findViewById(R.id.imgHat);
                if (checked)
                    hatView.setVisibility(View.VISIBLE);
                else
                    hatView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkMoustache:
                ImageView moustacheView = (ImageView)findViewById(R.id.imgMoustache);
                if (checked)
                    moustacheView.setVisibility(View.VISIBLE);
                else
                    moustacheView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkMouth:
                ImageView mouthView = (ImageView)findViewById(R.id.imgMouth);
                if (checked)
                    mouthView.setVisibility(View.VISIBLE);
                else
                    mouthView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkNose:
                ImageView noseView = (ImageView)findViewById(R.id.imgNose);
                if (checked)
                    noseView.setVisibility(View.VISIBLE);
                else
                    noseView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkShoes:
                ImageView shoesView = (ImageView)findViewById(R.id.imgShoes);
                if (checked)
                    shoesView.setVisibility(View.VISIBLE);
                else
                    shoesView.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
