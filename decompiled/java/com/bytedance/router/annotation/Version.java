package com.bytedance.router.annotation;

import X.C08FF;

/* JADX INFO: loaded from: classes28.dex */
public enum Version {
    V0(0),
    V1(1);

    public final int versionCode;

    public int getVersionCode() {
        return this.versionCode;
    }

    public static Version valueOf(String str) {
        return (Version) C08FF.LIZ(Version.class, str);
    }

    Version(int i) {
        this.versionCode = i;
    }
}
