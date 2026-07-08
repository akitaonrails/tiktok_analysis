package com.ss.android.ugc.aweme.solaria;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SolariaProfile implements Serializable {

    @C09CT("profile")
    public String profile;
    public transient Object transientData;

    public SolariaProfile() {
        this(null);
    }

    public SolariaProfile(String str) {
        this.profile = str;
    }

    public final void setTransientData(Object obj) {
        this.transientData = obj;
    }
}
