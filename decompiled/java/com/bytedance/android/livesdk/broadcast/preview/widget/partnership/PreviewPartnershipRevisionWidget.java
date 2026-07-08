package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C760180Trs;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.GamePartnershipNoticeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewPartnershipRevisionWidget extends PreviewPartnershipWidget {
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return PreviewEnterFpsOptSetting.INSTANCE.enable() ? R.layout.i1y : R.layout.i1x;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C760180Trs.LJIIJJI(this.dataChannel, "partnership");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "partnership");
        }
        this.dataChannel.EQ2(this, GamePartnershipNoticeChannel.class, new AwS586S0100000_7(this, 51));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer L1() {
        return Integer.valueOf(R.raw.icon_game_controller);
    }

    public final long Y1(String str) {
        Long lValueOf = -1L;
        if (str == null) {
            return -1L;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gameId is not number, e:");
            sbLIZ.append(e);
            C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (lValueOf == null) {
            return -1L;
        }
        return lValueOf.longValue();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        super.onClick(view);
        C760180Trs.LJIIIZ(this.dataChannel, "partnership");
    }
}
