package com.tiktok.myna.render.render;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class MynaTemplateProtocolConfig implements Serializable, Cloneable {

    @C09CT("target_sdk_version")
    public final String targetSDKVersion;

    public MynaTemplateProtocolConfig() {
        this("");
    }

    public Object clone() {
        return super.clone();
    }

    public final String getTargetSDKVersion() {
        return this.targetSDKVersion;
    }

    public MynaTemplateProtocolConfig(String str) {
        this.targetSDKVersion = str;
    }
}
