package com.developer.dinhduy.navigationviewtutorial;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;
    private DrawerLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView=(NavigationView) findViewById(R.id.navigation_id);
        layout=(DrawerLayout) findViewById(R.id.waaa);
        toggle=new ActionBarDrawerToggle(this,layout,R.string.Open,R.string.Close);
        layout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.king_id){
                    Toast.makeText(MainActivity.this, "King Item", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId()==R.id.notification_id){
                    Toast.makeText(MainActivity.this, "Notifiaition Item", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId()==R.id.setting_id){
                    Toast.makeText(MainActivity.this, "Setting Item", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId()==R.id.upload_id){
                    Toast.makeText(MainActivity.this, "Upload Item", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId()==R.id.support_id){
                    Toast.makeText(MainActivity.this, "Support Item", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){

        }
        return super.onOptionsItemSelected(item);
    }
}
