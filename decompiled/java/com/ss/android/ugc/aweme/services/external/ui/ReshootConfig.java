package com.ss.android.ugc.aweme.services.external.ui;

import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ReshootConfig implements Serializable {
    public Boolean backMain;
    public boolean enableReshoot;
    public Boolean reshootClear;

    public final Boolean getBackMain() {
        return this.backMain;
    }

    public final boolean getEnableReshoot() {
        return this.enableReshoot;
    }

    public final Boolean getReshootClear() {
        return this.reshootClear;
    }

    public final void setBackMain(Boolean bool) {
        this.backMain = bool;
    }

    public final void setEnableReshoot(boolean z) {
        this.enableReshoot = z;
    }

    public final void setReshootClear(Boolean bool) {
        this.reshootClear = bool;
    }

    public ReshootConfig(boolean z, Boolean bool) {
        this.enableReshoot = z;
        this.reshootClear = bool;
    }

    public ReshootConfig(boolean z, Boolean bool, boolean z2) {
        this.enableReshoot = z;
        this.reshootClear = bool;
        this.backMain = Boolean.valueOf(z2);
    }
}
