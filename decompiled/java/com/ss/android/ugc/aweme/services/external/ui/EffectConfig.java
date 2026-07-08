package com.ss.android.ugc.aweme.services.external.ui;

import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectConfig implements Serializable {
    public String effectImage;
    public String effectMetaInfo;

    public final String getEffectImage() {
        return this.effectImage;
    }

    public final String getEffectMetaInfo() {
        return this.effectMetaInfo;
    }

    public final void setEffectImage(String str) {
        this.effectImage = str;
    }

    public final void setEffectMetaInfo(String str) {
        this.effectMetaInfo = str;
    }
}
