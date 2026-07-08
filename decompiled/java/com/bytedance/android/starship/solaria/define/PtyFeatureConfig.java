package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class PtyFeatureConfig implements Serializable {

    @C09CT("pty_business_name")
    public String ptyBusinessName;

    @C09CT("trigger_type")
    public int triggerType;

    public PtyFeatureConfig() {
        this(null, 0);
    }

    public final void setPtyBusinessName(String str) {
        this.ptyBusinessName = str;
    }

    public final void setTriggerType(int i) {
        this.triggerType = i;
    }

    public PtyFeatureConfig(String str, int i) {
        this.ptyBusinessName = str;
        this.triggerType = i;
    }
}
