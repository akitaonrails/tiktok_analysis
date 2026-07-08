package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class InteractionModule {
    public static final TypeAdapter ADAPTER;

    @C09CT("backgroundColor")
    public String backgroundColor;

    @C09CT("btnTitle")
    public String btnTitle;

    @C09CT("enterMethod")
    public String enterMethod;

    @C09CT("innerFeedMgAggId")
    public long innerFeedMgAggId;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public int type;

    static {
        NormalGson.singleton();
        ADAPTER = new InteractionModule_OptTypeAdapter();
    }

    public InteractionModule() {
        this(0, "", "", "", 0L, "");
    }

    public InteractionModule(int i, String str, String str2, String str3, long j, String str4) {
        this.type = i;
        this.title = str;
        this.btnTitle = str2;
        this.backgroundColor = str3;
        this.innerFeedMgAggId = j;
        this.enterMethod = str4;
    }
}
