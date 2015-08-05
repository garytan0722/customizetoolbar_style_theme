package com.genglun.customizetoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,PopupMenu.OnMenuItemClickListener {
    ImageButton settingbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        settingbutton=(ImageButton)findViewById(R.id.settingsbutton);
        settingbutton.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        PopupMenu pop =new PopupMenu(MainActivity.this,settingbutton);
        pop.getMenuInflater().inflate(R.menu.menu_main,pop.getMenu());
        pop.setOnMenuItemClickListener(this);
        pop.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.action_settings:
                Toast.makeText(this,"Action Setting!!!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_edit:
                Toast.makeText(this,"Action Edit!!!",Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
