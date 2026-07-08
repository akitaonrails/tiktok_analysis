package com.bytedance.geckox.policy.meta;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class MetaDataItem implements Serializable {
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

    public MetaDataItem(long j, boolean z) {
        this.lastReadTimeStamp = j;
        this.allowUpdate = z;
    }
}
