package com.bytedance.android.livesdk.broadcast.feedback;

import X.C01GW;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1151950g5B;
import X.C1322110kVd;
import X.C292401Bi;
import X.C473410IhP;
import X.C497740JfY;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.FeedbackAnimChannel;
import com.bytedance.android.live.FeedbackAnimVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS125S0101000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class FeedbackAnimWidget extends LiveWidget {
    public C1143920fsE LL;
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 112));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gzi;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FeedbackAnimVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        int iLIZIZ = (int) C497740JfY.LIZIZ(225.0f);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, FeedbackAnimChannel.class, new AwS125S0101000_17(this, iLIZIZ, 0));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1143920fsE c1143920fsE = this.LL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        if (LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache()) {
            this.LL = null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FeedbackAnimVisibilityChannel.class, Boolean.TRUE);
        }
    }

    public final void x1() {
        C473410IhP.LJFF(LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask(), LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache());
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LJIILJJIL = true;
        c1143920fsE.LIZ = (C1322110kVd) this.LLILLJJLI.getValue();
        c1143920fsE.LIZIZ = "tiktok_live_broadcast_demand_1";
        c1143920fsE.LIZJ = "ttlive_anchor_feedback.webp";
        c1143920fsE.LJ = new C1151950g5B(this, 0);
        this.LL = c1143920fsE;
        C1143680frq.LJIIIIZZ(c1143920fsE);
    }
}
