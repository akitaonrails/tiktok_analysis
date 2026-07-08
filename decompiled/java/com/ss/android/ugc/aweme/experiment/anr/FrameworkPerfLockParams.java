package com.ss.android.ugc.aweme.experiment.anr;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class FrameworkPerfLockParams {

    @C09CT("enable")
    public boolean enable;

    @C09CT("perflock_param_string")
    public String perflockParmaString;

    @C09CT("timeout")
    public int timeout;

    @C09CT("type")
    public int type;

    public FrameworkPerfLockParams() {
        this(false, 0, null, 0);
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setPerflockParmaString(String str) {
        this.perflockParmaString = str;
    }

    public final void setTimeout(int i) {
        this.timeout = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public FrameworkPerfLockParams(boolean z, int i, String str, int i2) {
        this.enable = z;
        this.type = i;
        this.perflockParmaString = str;
        this.timeout = i2;
    }
}
