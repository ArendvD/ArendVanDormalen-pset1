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

        ImageView imgView = (ImageView)findViewById(R.id.custom);

        switch(view.getId()) {
            case R.id.checkArms:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEars:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkEyebrows:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkEyes:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkGlasses:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkHat:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkMoustache:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkMouth:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkNose:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkShoes:
                if (checked)
                    imgView.setVisibility(View.VISIBLE);
                else
                    imgView.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
