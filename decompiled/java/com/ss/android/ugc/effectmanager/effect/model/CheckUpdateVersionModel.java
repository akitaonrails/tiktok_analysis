package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public class CheckUpdateVersionModel implements Serializable {
    public String cursor;
    public String sorting_position;
    public String version;

    public CheckUpdateVersionModel() {
        this(null, null, null);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getSorting_position() {
        return this.sorting_position;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setCursor(String str) {
        this.cursor = str;
    }

    public final void setSorting_position(String str) {
        this.sorting_position = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public CheckUpdateVersionModel(String str, String str2, String str3) {
        this.version = str;
        this.cursor = str2;
        this.sorting_position = str3;
    }
}
