package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.helper;

/* JADX INFO: loaded from: classes24.dex */
public final class SettingInfo {
    public static final int $stable = 0;
    public final String biz;
    public final boolean exposure;
    public final String key;
    public final String type;

    public final String getBiz() {
        return this.biz;
    }

    public final boolean getExposure() {
        return this.exposure;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getType() {
        return this.type;
    }

    public SettingInfo(String str, String str2, boolean z, String str3) {
        this.key = str;
        this.type = str2;
        this.exposure = z;
        this.biz = str3;
    }
}
