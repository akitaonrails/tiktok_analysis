package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class CampaignSchemaData {
    public static final TypeAdapter ADAPTER;

    @C09CT("full")
    public String full;

    @C09CT("popup")
    public String popup;

    static {
        NormalGson.singleton();
        ADAPTER = new CampaignSchemaData_OptTypeAdapter();
    }

    public CampaignSchemaData() {
        this("", "");
    }

    public CampaignSchemaData(String str, String str2) {
        this.full = str;
        this.popup = str2;
    }
}
