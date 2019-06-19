package com.ly.mydb.history.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.ly.mydb.history.bean.MyLatLng;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "MY_LAT_LNG".
*/
public class MyLatLngDao extends AbstractDao<MyLatLng, Long> {

    public static final String TABLENAME = "MY_LAT_LNG";

    /**
     * Properties of entity MyLatLng.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property ListId = new Property(1, String.class, "listId", false, "LIST_ID");
        public final static Property DeviceId = new Property(2, String.class, "deviceId", false, "DEVICE_ID");
        public final static Property Lat = new Property(3, double.class, "lat", false, "LAT");
        public final static Property Lng = new Property(4, double.class, "lng", false, "LNG");
        public final static Property Address = new Property(5, String.class, "address", false, "ADDRESS");
    }


    public MyLatLngDao(DaoConfig config) {
        super(config);
    }
    
    public MyLatLngDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MY_LAT_LNG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: id
                "\"LIST_ID\" TEXT," + // 1: listId
                "\"DEVICE_ID\" TEXT," + // 2: deviceId
                "\"LAT\" REAL NOT NULL ," + // 3: lat
                "\"LNG\" REAL NOT NULL ," + // 4: lng
                "\"ADDRESS\" TEXT);"); // 5: address
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MY_LAT_LNG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MyLatLng entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String listId = entity.getListId();
        if (listId != null) {
            stmt.bindString(2, listId);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(3, deviceId);
        }
        stmt.bindDouble(4, entity.getLat());
        stmt.bindDouble(5, entity.getLng());
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(6, address);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MyLatLng entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String listId = entity.getListId();
        if (listId != null) {
            stmt.bindString(2, listId);
        }
 
        String deviceId = entity.getDeviceId();
        if (deviceId != null) {
            stmt.bindString(3, deviceId);
        }
        stmt.bindDouble(4, entity.getLat());
        stmt.bindDouble(5, entity.getLng());
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(6, address);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public MyLatLng readEntity(Cursor cursor, int offset) {
        MyLatLng entity = new MyLatLng( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // listId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // deviceId
            cursor.getDouble(offset + 3), // lat
            cursor.getDouble(offset + 4), // lng
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // address
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MyLatLng entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setListId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDeviceId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLat(cursor.getDouble(offset + 3));
        entity.setLng(cursor.getDouble(offset + 4));
        entity.setAddress(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MyLatLng entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MyLatLng entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MyLatLng entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
