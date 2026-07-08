package com.bytedance.pumbaa.utility.service;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoDFIDConfig {

    @C09CT("enable")
    public final boolean enable;

    public AutoDFIDConfig() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoDFIDConfig) && this.enable == ((AutoDFIDConfig) obj).enable;
    }

    public AutoDFIDConfig(boolean z) {
        this.enable = z;
    }
}
