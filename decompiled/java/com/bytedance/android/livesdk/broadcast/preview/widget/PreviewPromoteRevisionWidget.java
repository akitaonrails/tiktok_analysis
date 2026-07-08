package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C500260Jjc;
import X.C760180Trs;
import X.InterfaceC770570UKp;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewPromoteRevisionWidget extends PreviewPromoteWidget implements InterfaceC770570UKp {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final InterfaceC770570UKp I1() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget, com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC770570UKp
    public final void LIZIZ() {
        C760180Trs.LJIIIZ(this.dataChannel, "promote");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "promote");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        C760180Trs.LJIIJJI(this.dataChannel, "promote");
    }
}
