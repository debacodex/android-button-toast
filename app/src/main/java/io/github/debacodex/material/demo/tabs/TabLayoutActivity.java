package io.github.debacodex.material.demo.tabs;
 
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import io.github.debacodex.material.demo.R;
import android.view.View;
import android.content.Intent;
import io.github.debacodex.material.toast.DnToast;

public class TabLayoutActivity extends AppCompatActivity { 
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
     
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        
    

    }
	public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.Button1:
				startActivity(new Intent(this, ScrollableTabActivity.class));
                DnToast.dn(this, "Love", DnToast.LENGTH_SHORT, DnToast.SUCCESS, false).show();
                break;

            case R.id.Button2:
				startActivity(new Intent(this, FixedTabActivity.class));
                DnToast.dn(this, "Java", DnToast.LENGTH_SHORT, DnToast.SUCCESS, R.drawable.language_java).show();
                break;

            case R.id.Button3:
				//startActivity(new Intent(this, DynamicTabActivity.class));
                DnToast.dn(this, "Python", DnToast.LENGTH_SHORT, DnToast.ERROR, R.drawable.language_python).show();
                break;   

            case R.id.Button4:
				startActivity(new Intent(this, ScrollableTabActivity.class));
                DnToast.dn(this, "Xml", DnToast.LENGTH_SHORT, DnToast.ERROR, R.drawable.xml).show();
                break;

            case R.id.Button5:
				startActivity(new Intent(this, ScrollableTabActivity.class));
                DnToast.dn(this, "Kotlin", DnToast.LENGTH_SHORT, DnToast.NORMAL, R.drawable.language_kotlin).show();
                break;

            case R.id.Button6:
				//startActivity(new Intent(this, BadgeTabActivity.class));
                DnToast.dn(this, "Swift", DnToast.LENGTH_SHORT, DnToast.NORMAL, R.drawable.language_swift).show();
                break;

            case R.id.Button7:
				startActivity(new Intent(this, ScrollableTabActivity.class));
                DnToast.dn(this, "Debashis", DnToast.LENGTH_SHORT, DnToast.SUCCESS, false).show();
                break;

            case R.id.Button8:
				startActivity(new Intent(this, ScrollableTabActivity.class));
                DnToast.dn(this, "Html5", DnToast.LENGTH_SHORT, DnToast.SUCCESS, R.drawable.language_html5).show();
				break;

            case R.id.DnButton9:
				startActivity(new Intent(this, ScrollableTabActivity.class));
                DnToast.dn(this, "Github", DnToast.LENGTH_SHORT, DnToast.WARN, R.drawable.github).show();
                break;

            case R.id.DnButton10:
                DnToast.dn(this, "React", DnToast.LENGTH_SHORT, DnToast.WARN, R.drawable.react).show();
                break;

            case R.id.textView1:
				startActivity(new Intent(this, TabLayoutActivity.class));
                DnToast.dn(this, "Material Button Development Debashis", DnToast.LENGTH_SHORT, DnToast.SUCCESS, R.drawable.xml).show();
            default:
                break;
        }
    } 






} 

 // modded by nnamspro suppourt my youtube channel for more mod
