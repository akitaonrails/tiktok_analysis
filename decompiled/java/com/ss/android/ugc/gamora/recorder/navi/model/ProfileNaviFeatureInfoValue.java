package com.ss.android.ugc.gamora.recorder.navi.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviFeatureInfoValue implements Serializable {
    public static final int $stable = 8;

    @C09CT("key")
    public String key;

    @C09CT("value")
    public Long value;

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setValue(Long l) {
        this.value = l;
    }

    public ProfileNaviFeatureInfoValue(String str, Long l) {
        this.key = str;
        this.value = l;
    }
}
