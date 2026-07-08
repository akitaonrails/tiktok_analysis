package com.bytedance.ies.sdk.widgets;

import com.bytedance.ies.sdk.datachannel.NextLiveData;

/* JADX INFO: loaded from: classes18.dex */
public abstract class DataChannelSceneObserver<O, T extends com.bytedance.ies.sdk.datachannel.NextLiveData<O>> extends SceneObserver {
    public final boolean isSticky;

    public DataChannelSceneObserver() {
        this(true);
    }

    public abstract Class<T> getType();

    public abstract void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, O o);

    public final boolean isSticky() {
        return this.isSticky;
    }

    public DataChannelSceneObserver(boolean z) {
        this.isSticky = z;
    }
}
