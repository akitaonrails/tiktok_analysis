package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.C500260Jjc;
import X.C760180Trs;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.GameRewardsNoticeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewGameDropsRevisionWidget extends PreviewGameDropsWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i1y : R.layout.i1x;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "game_reward");
        }
        this.dataChannel.EQ2(this, GameRewardsNoticeChannel.class, new AwS586S0100000_7(this, 50));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(R.raw.icon_game_drops);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        super.onShow();
        C760180Trs.LJIIJJI(this.dataChannel, "game_reward");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        super.onClick(view);
        C760180Trs.LJIIIZ(this.dataChannel, "game_reward");
    }
}
