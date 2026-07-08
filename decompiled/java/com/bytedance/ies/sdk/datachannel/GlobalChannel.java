package com.bytedance.ies.sdk.datachannel;

import X.AnonymousClass1686;

/* JADX INFO: loaded from: classes18.dex */
public class GlobalChannel<O> extends NextLiveData<O> implements AnonymousClass1686<O> {
    public final boolean keepInMemory;

    public final boolean getKeepInMemory$live_datachannel_release() {
        return this.keepInMemory;
    }

    public GlobalChannel(boolean z) {
        this.keepInMemory = z;
    }

    public GlobalChannel(O o, boolean z) {
        super(o);
        this.keepInMemory = z;
    }
}
