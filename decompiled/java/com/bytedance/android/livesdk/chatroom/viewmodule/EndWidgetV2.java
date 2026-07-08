package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C465690INz;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.WidgetLoadedEvent;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class EndWidgetV2 extends LiveRecyclableWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hy_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (isViewValid()) {
            this.dataChannel.LC0(WidgetLoadedEvent.class, new C465690INz());
        }
    }
}
