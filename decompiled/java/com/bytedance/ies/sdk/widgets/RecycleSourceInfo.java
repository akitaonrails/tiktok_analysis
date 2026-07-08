package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes18.dex */
public final class RecycleSourceInfo {
    public RecycleSource loadFrom;
    public RecycleSource unloadFrom;

    public RecycleSourceInfo() {
        this(RecycleSource.FROM_ROOM_CHANGE, RecycleSource.FROM_ROOM_CHANGE);
    }

    public final void setLoadFrom(RecycleSource recycleSource) {
        this.loadFrom = recycleSource;
    }

    public final void setUnloadFrom(RecycleSource recycleSource) {
        this.unloadFrom = recycleSource;
    }

    public RecycleSourceInfo(RecycleSource recycleSource, RecycleSource recycleSource2) {
        this.loadFrom = recycleSource;
        this.unloadFrom = recycleSource2;
    }
}
