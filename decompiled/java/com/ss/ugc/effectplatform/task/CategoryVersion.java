package com.ss.ugc.effectplatform.task;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class CategoryVersion implements Serializable {
    public final int cursor;
    public final String logId;
    public final int sorting_position;
    public final String version;

    public CategoryVersion(String str, int i, int i2, String str2) {
        this.version = str;
        this.cursor = i;
        this.sorting_position = i2;
        this.logId = str2;
    }
}
