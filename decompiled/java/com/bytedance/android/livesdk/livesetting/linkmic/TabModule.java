package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class TabModule {
    public static final TypeAdapter ADAPTER;

    @C09CT("innerFeedMgAggId")
    public long innerFeedMgAggId;

    @C09CT("name")
    public String name;

    @C09CT("title")
    public String title;

    static {
        NormalGson.singleton();
        ADAPTER = new TabModule_OptTypeAdapter();
    }

    public TabModule() {
        this("", "", 0L);
    }

    public TabModule(String str, String str2, long j) {
        this.name = str;
        this.title = str2;
        this.innerFeedMgAggId = j;
    }
}
