package com.bytedance.android.livesdk.game.chatroom.widget;

import X.C01GW;
import X.C0J1N;
import X.C0TDF;
import X.C1143680frq;
import X.C11PQ;
import X.C11RD;
import X.C1701940uOG;
import X.C20441214yg;
import X.C452501pT;
import X.C743550TEr;
import X.C743580TEu;
import X.C786410Ut5;
import X.InterfaceC1097170eep;
import X.InterfaceC772390URp;
import Y.ACListenerS116S0200000_12;
import Y.AfS181S0100000_12;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDualDeviceQRCodeCacheSetting;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceWidget extends LiveRecyclableWidget {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(134));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(133));
    public LiveIconView LLILZIL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LL ? R.layout.g1u : R.layout.g1t;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (LiveDualDeviceQRCodeCacheSetting.INSTANCE.isExperimentGroup()) {
            C743550TEr.LIZIZ = null;
            C743550TEr.LIZJ = null;
            C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "release cache bitmap");
            C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
            C743580TEu.LIZJ.set(false);
            C743580TEu.LIZLLL.set(false);
            C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "release cache tips");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LiveIconView liveIconView;
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, view, 30), view);
        }
        View view2 = getView();
        if (view2 != null) {
            liveIconView = (LiveIconView) view2.findViewById(R.id.k08);
        } else {
            liveIconView = null;
        }
        this.LLILZIL = liveIconView;
        if (this.LLILLJJLI) {
            LiveIconView liveIconView2 = this.LLILZIL;
            if (liveIconView2 != null) {
                C1143680frq.LJ(liveIconView2, "tiktok_live_game_demand_1", "ttlive_game_dual_device_camera_icon.png", ImageView.ScaleType.FIT_XY);
            }
            View view3 = getView();
            if (view3 != null) {
                C786410Ut5.T4(view3, 0.34f);
                return;
            }
            return;
        }
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS181S0100000_12(this, 107));
        InterfaceC772390URp.F.LJFF(Boolean.TRUE);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Fragment fragment;
        if (LiveDualDeviceQRCodeCacheSetting.INSTANCE.isExperimentGroup()) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
                C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
                C743580TEu.LIZJ(fragment);
            }
            C11PQ<SpannableStringBuilder> c11pq2 = C743580TEu.LIZ;
            C743580TEu.LIZIZ();
        }
    }

    public GameDualDeviceWidget(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
