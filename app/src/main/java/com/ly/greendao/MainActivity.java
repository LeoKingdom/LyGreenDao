package com.ly.greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.ly.mydb.history.bean.DaoMaster;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "history");
//        Datab db = helper.getWritableDb();
//        daoSession = new DaoMaster(db).newSession();
    }
}
