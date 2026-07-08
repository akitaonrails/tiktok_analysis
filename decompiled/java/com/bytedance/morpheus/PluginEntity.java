package com.bytedance.morpheus;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class PluginEntity {

    @C09CT("aabName")
    public final String aabName;

    @C09CT("packageName")
    public final String packageName;

    public final String getAabName() {
        return this.aabName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public PluginEntity(String str, String str2) {
        this.packageName = str;
        this.aabName = str2;
    }
}
