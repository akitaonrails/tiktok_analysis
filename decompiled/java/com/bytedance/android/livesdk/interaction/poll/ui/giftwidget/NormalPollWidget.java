package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.C0IPN;
import X.C1086790eO5;
import X.C1086830eO9;
import X.C1086900eOG;
import X.C1143680frq;
import X.C16FS;
import X.C1954807lC;
import X.C497740JfY;
import X.C766270U4b;
import X.EnumC1086890eOF;
import X.EnumC1086920eOI;
import X.InterfaceC1086910eOH;
import Y.ARunnableS117S0100000_17;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class NormalPollWidget extends AbsPollWidget {
    public final InterfaceC1086910eOH LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hu_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void B1() {
        C1086790eO5.LIZ(this.dataChannel, EnumC1086920eOI.NORMAL);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void D1() {
        C16FS c16fs = (C16FS) this.contentView.findViewById(R.id.a24);
        c16fs.LJ();
        if (C1086830eO9.LIZJ()) {
            C1086790eO5.LIZJ(EnumC1086920eOI.NORMAL, 0);
            C1086790eO5.LJIIJ("is_ongoing");
            C766270U4b.LIZLLL(2131841952);
        } else {
            EnumC1086920eOI enumC1086920eOI = EnumC1086920eOI.NORMAL;
            C1086790eO5.LIZJ(enumC1086920eOI, 1);
            InterfaceC1086910eOH interfaceC1086910eOH = this.LL;
            if (interfaceC1086910eOH != null) {
                interfaceC1086910eOH.X3(enumC1086920eOI);
            }
        }
        c16fs.LJIIL();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final boolean x1() {
        boolean zX1 = super.x1();
        if (zX1) {
            C1086790eO5.LJII(this.dataChannel, EnumC1086920eOI.NORMAL);
        }
        return zX1;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void z1() {
        super.z1();
        this.subWidgetManager.load(R.id.rfi, new LiveNormalPollEffectWidget(259));
        C1086790eO5.LJIIIZ(this.dataChannel, EnumC1086920eOI.NORMAL);
    }

    public NormalPollWidget(InterfaceC1086910eOH interfaceC1086910eOH) {
        this.LL = interfaceC1086910eOH;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void C1(String str) {
        C1086790eO5.LJI(this.dataChannel, str, EnumC1086920eOI.NORMAL);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        EnumC1086890eOF enumC1086890eOF;
        String str;
        super.onLoad(objArr);
        if (C1086830eO9.LIZLLL()) {
            enumC1086890eOF = EnumC1086890eOF.POLLING;
        } else if (C1086830eO9.LIZ(this.dataChannel, EnumC1086920eOI.NORMAL) == null) {
            enumC1086890eOF = EnumC1086890eOF.FIRST;
        } else {
            enumC1086890eOF = EnumC1086890eOF.NOT_POLLING;
        }
        int i = C1086900eOG.LIZ[enumC1086890eOF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    z1();
                    return;
                }
                throw new C1954807lC();
            }
            super.A1();
            this.subWidgetManager.load(R.id.rfi, new LiveNormalPollEffectWidget(258));
            C1086790eO5.LJIIIZ(this.dataChannel, EnumC1086920eOI.NORMAL);
            return;
        }
        super.y1();
        TextView textView = (TextView) this.contentView.findViewById(R.id.fo7);
        if (textView != null) {
            LivePollSetting livePollSetting = LivePollSetting.INSTANCE;
            textView.setText(C497740JfY.LJIJJ(2131843818, livePollSetting.getFirstOption(), livePollSetting.getSecondOption()));
        }
        if (LiveBroadcastPictureMemOpt.frescoLoadPicEnableInSample()) {
            HandlerHook.viewPost(this.contentView, new ARunnableS117S0100000_17(this, 174));
            return;
        }
        View viewFindViewById = this.contentView.findViewById(R.id.hzy);
        String strLIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
        if (C497740JfY.LJJ()) {
            str = "ttlive_bg_poll_first_guide_rtl.png";
        } else {
            str = "ttlive_bg_poll_first_guide.png";
        }
        C1143680frq.LIZLLL(viewFindViewById, strLIZ, str);
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager == null) {
            return;
        }
        recyclableWidgetManager.load(R.id.ulf, NormalSelectPollWidget.class, false);
    }
}
