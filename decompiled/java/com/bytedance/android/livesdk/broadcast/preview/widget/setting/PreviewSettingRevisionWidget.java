package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0UJW;
import X.C500260Jjc;
import X.C760180Trs;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.ShowAiSummaryBoard;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewSettingRevisionWidget extends PreviewSettingWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String M1() {
        return C0UJW.LIZJ(7);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final String P1() {
        return C0UJW.LIZLLL(7);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer R1() {
        return 7;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i1y : R.layout.i1x;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "setting");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(R.raw.icon_gear);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        C760180Trs.LJIIJJI(this.dataChannel, "setting");
        this.dataChannel.EQ2(this, ShowAiSummaryBoard.class, new AwS591S0100000_12(this, 416));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        a2();
        C760180Trs.LJIIIZ(this.dataChannel, "setting");
    }
}
