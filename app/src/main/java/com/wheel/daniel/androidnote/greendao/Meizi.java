package com.wheel.daniel.androidnote.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * @author danielwang
 * @Description:
 * @date 2018/9/3 14:48
 */

/**
 * 1.@Entity：将我们的java普通类变为一个能够被greenDAO识别的数据库类型的实体类;
 * 2.@nameInDb：在数据库中的名字，如不写则为实体中类名；
 * 3.@Id：选择一个long / Long属性作为实体ID。 在数据库方面，它是主键。 参数autoincrement是设置ID值自增；
 * 4.@NotNull：使该属性在数据库端成为“NOT NULL”列。 通常使用@NotNull标记原始类型（long，int，short，byte）是有意义的；
 * 5.@Transient：表明这个字段不会被写入数据库，只是作为一个普通的java类字段，用来临时存储数据的，不会被持久化。
 */
@Entity
public class Meizi {
    @Id(autoincrement = true)
    private long _id;
    private String source;
    @NotNull
    private String url;

    @Keep
    public Meizi(long _id, String source, String url) {
        this._id = _id;
        this.source = source;
        this.url = url;
    }

    @Keep
    public Meizi() {

    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
