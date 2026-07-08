package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C500260Jjc;
import X.C760180Trs;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.PreviewCastWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCastRevisionWidget extends PreviewCastWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.PreviewCastWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i1y : R.layout.i1x;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C760180Trs.LJIIJJI(this.dataChannel, "cast");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "cast");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(R.raw.icon_chromecast);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.PreviewCastWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        super.onClick(view);
        C760180Trs.LJIIIZ(this.dataChannel, "cast");
    }
}
