package com.ss.android.ugc.aweme.item;

import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryCacheExtra implements Serializable {
    public final int dataFrom;
    public final long timestamp;
    public final String uid;

    public final StoryCacheExtra copy(long j, String str, int i) {
        return new StoryCacheExtra(j, str, i);
    }

    public StoryCacheExtra(long j, String str, int i) {
        this.timestamp = j;
        this.uid = str;
        this.dataFrom = i;
    }
}
