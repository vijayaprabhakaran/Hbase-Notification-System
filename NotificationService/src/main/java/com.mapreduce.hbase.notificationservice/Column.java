package com.mapreduce.hbase.notificationservice;

public class Column {

    public String ColumnFamily;
    public String Column;
    public String value;

    public Column(String columnFamily, String column, String value) {
        this.ColumnFamily = columnFamily;
        this.Column = column;
        this.value = value;
    }

    public void setColumnFamily(String columnFamily) {
        this.ColumnFamily = columnFamily;
    }


    public String getColumnFamily() {
        return this.ColumnFamily;
    }

    public void setColumn(String column) {
        this.Column = column;
    }

    public String getColumn() {
        return this.Column;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }











}
