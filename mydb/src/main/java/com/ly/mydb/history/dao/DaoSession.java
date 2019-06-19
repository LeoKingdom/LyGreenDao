package com.ly.mydb.history.dao;

import com.ly.mydb.history.bean.HistorySaveLocalBean;
import com.ly.mydb.history.bean.MyLatLng;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig historySaveLocalBeanDaoConfig;
    private final DaoConfig myLatLngDaoConfig;

    private final HistorySaveLocalBeanDao historySaveLocalBeanDao;
    private final MyLatLngDao myLatLngDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        historySaveLocalBeanDaoConfig = daoConfigMap.get(HistorySaveLocalBeanDao.class).clone();
        historySaveLocalBeanDaoConfig.initIdentityScope(type);

        myLatLngDaoConfig = daoConfigMap.get(MyLatLngDao.class).clone();
        myLatLngDaoConfig.initIdentityScope(type);

        historySaveLocalBeanDao = new HistorySaveLocalBeanDao(historySaveLocalBeanDaoConfig, this);
        myLatLngDao = new MyLatLngDao(myLatLngDaoConfig, this);

        registerDao(HistorySaveLocalBean.class, historySaveLocalBeanDao);
        registerDao(MyLatLng.class, myLatLngDao);
    }
    
    public void clear() {
        historySaveLocalBeanDaoConfig.clearIdentityScope();
        myLatLngDaoConfig.clearIdentityScope();
    }

    public HistorySaveLocalBeanDao getHistorySaveLocalBeanDao() {
        return historySaveLocalBeanDao;
    }

    public MyLatLngDao getMyLatLngDao() {
        return myLatLngDao;
    }

}
