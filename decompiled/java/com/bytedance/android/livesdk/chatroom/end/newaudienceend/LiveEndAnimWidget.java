package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import X.C0IH6;
import X.C0III;
import X.C1324720kZq;
import X.C786410Ut5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEndAnimWidget extends LiveRecyclableWidget {
    public float LL;
    public C1324720kZq LLILLJJLI;
    public View LLILLL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.ed(view, 0.0f);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C0IH6.LIZ(C0III.FINISH_WIDGET_MOCK_LOADED);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        show();
    }
}
