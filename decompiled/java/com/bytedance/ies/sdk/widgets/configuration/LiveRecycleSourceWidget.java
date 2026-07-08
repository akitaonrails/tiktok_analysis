package com.bytedance.ies.sdk.widgets.configuration;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.RecycleSourceInfo;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LiveRecycleSourceWidget extends LiveRecyclableWidget {
    public abstract void onLoad(RecycleSource recycleSource, Object[] objArr);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void onUnload(RecycleSource recycleSource);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        RecycleSourceInfo recycleSourceInfo = getRecycleSourceInfo();
        onUnload(recycleSourceInfo != null ? recycleSourceInfo.unloadFrom : null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        RecycleSource recycleSource;
        RecycleSourceInfo recycleSourceInfo = getRecycleSourceInfo();
        if (recycleSourceInfo != null) {
            recycleSource = recycleSourceInfo.loadFrom;
        } else {
            recycleSource = null;
        }
        onLoad(recycleSource, objArr);
    }
}
