package com.tiktok.myna.render.render.bindinfo;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class MynaBindForConfig {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("item_key")
    public final String diffKey;

    @C09CT("end")
    public final String end;

    @C09CT("index")
    public final String indexKey;

    @C09CT("item")
    public final String itemKey;

    @C09CT("start")
    public final String start;

    @C09CT("items")
    public final String target;

    public MynaBindForConfig() {
        this("", "", "", "", "", "");
    }

    public MynaBindForConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        this.indexKey = str;
        this.itemKey = str2;
        this.target = str3;
        this.start = str4;
        this.end = str5;
        this.diffKey = str6;
    }
}
