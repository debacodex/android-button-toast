package io.github.debacodex.material.demo;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import io.github.debacodex.material.toast.DnToast;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.AppBarLayout;
import io.github.debacodex.material.demo.tabs.TabLayoutActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);


    }
	public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.DnButton1:
                DnToast.dn(this, "Love", DnToast.LENGTH_SHORT, DnToast.SUCCESS, false).show();
                break;

            case R.id.DnButton2:
                DnToast.dn(this, "Java", DnToast.LENGTH_SHORT, DnToast.SUCCESS, R.drawable.language_java).show();
                break;

            case R.id.DnButton3:
                DnToast.dn(this, "Python", DnToast.LENGTH_SHORT, DnToast.ERROR, R.drawable.language_python).show();
                break;   

            case R.id.DnButton4:
                DnToast.dn(this, "Xml", DnToast.LENGTH_SHORT, DnToast.ERROR, R.drawable.xml).show();
                break;

            case R.id.DnButton5:
                DnToast.dn(this, "Kotlin", DnToast.LENGTH_SHORT, DnToast.NORMAL, R.drawable.language_kotlin).show();
                break;

            case R.id.DnButton6:
                DnToast.dn(this, "Swift", DnToast.LENGTH_SHORT, DnToast.NORMAL, R.drawable.language_swift).show();
                break;

            case R.id.DnButton7:
                DnToast.dn(this, "Debashis", DnToast.LENGTH_SHORT, DnToast.SUCCESS, false).show();
                break;

            case R.id.DnButton8:
                DnToast.dn(this, "Html5", DnToast.LENGTH_SHORT, DnToast.SUCCESS, R.drawable.language_html5).show();
				break;

            case R.id.DnButton9:
                DnToast.dn(this, "Github", DnToast.LENGTH_SHORT, DnToast.WARN, R.drawable.github).show();
                break;

            case R.id.DnButton10:
                DnToast.dn(this, "React", DnToast.LENGTH_SHORT, DnToast.WARN, R.drawable.react).show();
                break;

            case R.id.TLButton:
				startActivity(new Intent(this, TabLayoutActivity.class));
                DnToast.dn(this, "Material Button Development Debashis", DnToast.LENGTH_SHORT, DnToast.SUCCESS, R.drawable.xml).show();
            default:
                break;
        }
    } 
}


