package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PermissionConfiguration {
    public static final TypeAdapter ADAPTER;

    @C09CT("permission_property_key")
    public String permissionPropertyKey;

    static {
        NormalGson.singleton();
        ADAPTER = new PermissionConfiguration_OptTypeAdapter();
    }

    public PermissionConfiguration() {
        this("");
    }

    public PermissionConfiguration(String str) {
        this.permissionPropertyKey = str;
    }
}
