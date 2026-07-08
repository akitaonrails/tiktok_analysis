package com.bytedance.android.livesdk.performancetune.feature;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureFetchInputParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("dataSourceType")
    public String dataSourceType;

    @C09CT("group")
    public String group;

    @C09CT("key")
    public String key;

    static {
        NormalGson.singleton();
        ADAPTER = new FeatureFetchInputParams_OptTypeAdapter();
    }

    public FeatureFetchInputParams() {
        this("default", "", "");
    }

    public final String getDataSourceType() {
        return this.dataSourceType;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setDataSourceType(String str) {
        this.dataSourceType = str;
    }

    public final void setGroup(String str) {
        this.group = str;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public FeatureFetchInputParams(String str, String str2, String str3) {
        this.dataSourceType = str;
        this.group = str2;
        this.key = str3;
    }
}
