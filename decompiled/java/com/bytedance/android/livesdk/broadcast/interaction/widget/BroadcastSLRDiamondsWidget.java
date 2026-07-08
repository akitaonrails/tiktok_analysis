package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C1152780g6W;
import X.C1295960jpS;
import X.C12OR;
import X.C1529590puH;
import X.C1537060q6K;
import X.C214718191g;
import X.C786410Ut5;
import X.InterfaceC19748112Oh;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GiftTrayViewShowEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.SlrDiamondsPreloadSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS611S0100000_32;
import tikcast.api.anchor_data.HostFirstGiftInfo;

/* JADX INFO: loaded from: classes33.dex */
public final class BroadcastSLRDiamondsWidget extends LiveWidget {
    public C214718191g LL;
    public C1295960jpS LLILLL;
    public C1295960jpS LLILZ;
    public C214718191g LLILLJJLI = new C214718191g(0, 0, 0, 0);
    public boolean LLILZIL = true;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g1r;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static boolean x1() {
        HostFirstGiftInfo hostFirstGiftInfoLIZLLL;
        InterfaceC19748112Oh interfaceC19748112Oh = C12OR.LIZLLL;
        return (interfaceC19748112Oh == null || (hostFirstGiftInfoLIZLLL = interfaceC19748112Oh.LIZLLL()) == null || hostFirstGiftInfoLIZLLL.hostDiamondAnimationVersion != 2) ? false : true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        this.LLILLL = view != null ? (C1295960jpS) view.findViewById(R.id.nru) : null;
        View view2 = getView();
        this.LLILZ = view2 != null ? (C1295960jpS) view2.findViewById(R.id.q39) : null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GiftTrayViewShowEvent.class, new AwS611S0100000_32(this, 21));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1152780g6W.LIZ = false;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIILL("live_slr_diamonds");
        C1152780g6W.LIZIZ = SlrDiamondsPreloadSetting.INSTANCE.getPreloadSchema();
    }

    public static void y1(int i, C1295960jpS c1295960jpS) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if (c1295960jpS != null) {
            layoutParams = c1295960jpS.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
            C786410Ut5.W5(c1295960jpS, marginLayoutParams);
            c1295960jpS.requestLayout();
        }
    }
}
