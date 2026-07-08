package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C465690INz;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.WidgetP1LoadedEvent;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class EndWidgetP1 extends LiveWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hy_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(72103);
        super.onCreate();
        if (isViewValid()) {
            this.dataChannel.LC0(WidgetP1LoadedEvent.class, new C465690INz());
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }
}
