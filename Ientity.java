package com.Data;



import java.sql.ResultSet;

/**
 * @author Plus
 * @date 2019年7月18日
 * @param <T>
 */
public abstract interface Ientity<T>
{
  public abstract T getentity(ResultSet paramResultSet);
}
