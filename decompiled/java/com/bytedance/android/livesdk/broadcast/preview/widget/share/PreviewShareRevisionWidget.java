package com.bytedance.android.livesdk.broadcast.preview.widget.share;

import X.C0UJW;
import X.C500260Jjc;
import X.C760180Trs;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewShareRevisionWidget extends PreviewShareWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String M1() {
        return C0UJW.LIZJ(11);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String P1() {
        return C0UJW.LIZLLL(11);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer R1() {
        return 11;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i1y : R.layout.i1x;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "share");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(R.raw.icon_arrow_turn_up_right);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        W1();
        C760180Trs.LJIIJJI(this.dataChannel, "share");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        X1(false);
        C760180Trs.LJIIIZ(this.dataChannel, "share");
    }
}
