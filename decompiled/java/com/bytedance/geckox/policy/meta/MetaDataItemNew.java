package com.bytedance.geckox.policy.meta;

import X.C1551340qTM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class MetaDataItemNew implements Serializable {
    public static final C1551340qTM Companion = new Object() { // from class: X.0qTM
    };
    public static final long serialVersionUID = 2;
    public boolean allowUpdate;
    public long lastReadTimeStamp;

    public final boolean getAllowUpdate() {
        return this.allowUpdate;
    }

    public final long getLastReadTimeStamp() {
        return this.lastReadTimeStamp;
    }

    public final void setAllowUpdate(boolean z) {
        this.allowUpdate = z;
    }

    public final void setLastReadTimeStamp(long j) {
        this.lastReadTimeStamp = j;
    }

    public MetaDataItemNew(long j, boolean z) {
        this.lastReadTimeStamp = j;
        this.allowUpdate = z;
    }
}
