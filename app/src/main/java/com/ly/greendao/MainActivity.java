package com.ly.greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ly.mydb.history.bean.HistorySaveLocalBean;
import com.ly.mydb.history.bean.MyLatLng;
import com.ly.mydb.history.dao.DaoMaster;
import com.ly.mydb.history.dao.DaoSession;
import com.ly.mydb.history.dao.HistorySaveLocalBeanDao;
import com.ly.mydb.history.dao.MyLatLngDao;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "history");
        Database db = helper.getWritableDb();
        DaoSession daoSession = new DaoMaster(db).newSession();
        HistorySaveLocalBeanDao historyLocalDao = daoSession.getHistorySaveLocalBeanDao();
        MyLatLngDao latlngDao = daoSession.getMyLatLngDao();
        QueryBuilder<MyLatLng> queryBuilder = latlngDao.queryBuilder();
        queryBuilder.join(HistorySaveLocalBean.class, HistorySaveLocalBeanDao.Properties.DeviceId)
                .where(HistorySaveLocalBeanDao.Properties.DeviceId.eq(""));
        List<MyLatLng> list = queryBuilder.list();
    }
}
