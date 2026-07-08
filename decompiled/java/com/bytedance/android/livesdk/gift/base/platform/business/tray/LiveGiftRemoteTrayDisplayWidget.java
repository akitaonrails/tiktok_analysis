package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import X.AbstractC1136890fgt;
import X.AbstractC1138110fir;
import X.C1137050fh9;
import X.C1137560fhy;
import X.C1137600fi2;
import X.C1138090fip;
import X.C1138240fj4;
import X.C1138250fj5;
import X.C11NJ;
import X.C13E8;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC1137430fhl;
import X.InterfaceC1137450fhn;
import X.InterfaceC1138270fj7;
import Y.AfS186S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.GiftSmallTray;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.model.LiveGiftRemoteHideTrayEvent;
import com.bytedance.android.livesdk.livesetting.gift.GiftUseNewGiftTrayV3;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class LiveGiftRemoteTrayDisplayWidget extends LiveRecyclableWidget {
    public final boolean LL;
    public final ArrayList<InterfaceC1137450fhn> LLILLJJLI;
    public final Map<Integer, C1138090fip> LLILLL;
    public final Map<Integer, C13E8<AbstractC1136890fgt>> LLILZ;
    public final C11NJ LLILZIL;
    public C1137600fi2 LLILZLL;
    public boolean LLIZ;

    public LiveGiftRemoteTrayDisplayWidget() {
        this(false);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.hzl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public boolean A1() {
        return this.LL && LiveExtendedScreenGiftOptimizeSetting.INSTANCE.giftTraySpaceOptimize();
    }

    public final void B1() {
        for (InterfaceC1137450fhn interfaceC1137450fhn : this.LLILLJJLI) {
            interfaceC1137450fhn.release();
            interfaceC1137450fhn.LJIIJJI();
            C1138090fip c1138090fip = (C1138090fip) ((LinkedHashMap) this.LLILLL).get(Integer.valueOf(interfaceC1137450fhn.getTrayNum()));
            if (c1138090fip != null) {
                c1138090fip.LIZJ("dispose");
                c1138090fip.LIZIZ(new C1137560fhy(c1138090fip));
                c1138090fip.LIZ();
                c1138090fip.LJFF = null;
            }
            this.LLILLL.remove(Integer.valueOf(interfaceC1137450fhn.getTrayNum()));
        }
        ((LinkedHashMap) this.LLILZ).clear();
        this.LLILZIL.LJ();
    }

    public InterfaceC1137450fhn x1() {
        return new C1137050fh9(this.context);
    }

    public final void y1() {
        InterfaceC1138270fj7 interfaceC1138270fj7;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        this.LLILLJJLI.clear();
        ((LinkedHashMap) this.LLILLL).clear();
        ((LinkedHashMap) this.LLILZ).clear();
        View view = this.contentView;
        if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup2);
        }
        boolean zA1 = A1();
        int i = 0;
        do {
            InterfaceC1137450fhn interfaceC1137450fhnX1 = x1();
            C786410Ut5.LJLLLLLL(4, interfaceC1137450fhnX1.getView());
            interfaceC1137450fhnX1.LJIIJ(this.dataChannel, false);
            interfaceC1137450fhnX1.setTrayNum(i);
            int i2 = zA1 ? 1 - i : i;
            interfaceC1137450fhnX1.setTrackNum(i2);
            interfaceC1137450fhnX1.setViewGroup((ViewGroup) this.contentView);
            this.LLILLJJLI.add(interfaceC1137450fhnX1);
            View view2 = this.contentView;
            if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                viewGroup.addView(interfaceC1137450fhnX1.getView());
            }
            if (GiftUseNewGiftTrayV3.INSTANCE.isPhaseTwo() && (interfaceC1137450fhnX1 instanceof InterfaceC1138270fj7) && (interfaceC1138270fj7 = (InterfaceC1138270fj7) interfaceC1137450fhnX1) != null) {
                final int trayNum = interfaceC1137450fhnX1.getTrayNum();
                this.LLILLL.put(Integer.valueOf(interfaceC1137450fhnX1.getTrayNum()), new C1138090fip(interfaceC1138270fj7, new InterfaceC1137430fhl() { // from class: X.0fho
                    @Override // X.InterfaceC1137430fhl
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC1137430fhl
                    public final void LJ(C1135810ff9 c1135810ff9) {
                    }

                    @Override // X.InterfaceC1137430fhl
                    public final void LIZJ() {
                        this.LIZ.z1(trayNum);
                    }

                    @Override // X.InterfaceC1137430fhl
                    public final void LIZ(C1135810ff9 c1135810ff9) {
                        this.LIZ.z1(trayNum);
                    }

                    @Override // X.InterfaceC1137430fhl
                    public final void LIZIZ(C1135810ff9 c1135810ff9) {
                        this.LIZ.z1(trayNum);
                    }
                }, "remote", i2));
            }
            i++;
        } while (i < 2);
        this.LLILZIL.LIZ(C784440Upu.LIZ().LJ(C1137600fi2.class).LJJLJLI(new AfS186S0100000_17(this, 41)));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        B1();
    }

    public LiveGiftRemoteTrayDisplayWidget(boolean z) {
        this.LL = z;
        this.LLILLJJLI = new ArrayList<>(2);
        this.LLILLL = new LinkedHashMap();
        this.LLILZ = new LinkedHashMap();
        this.LLILZIL = new C11NJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        y1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveGiftRemoteHideTrayEvent.class, new AwS596S0100000_17(this, 151));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, GiftSmallTray.class, new AwS596S0100000_17(this, 152));
        }
    }

    public final void z1(int i) {
        AbstractC1136890fgt abstractC1136890fgt;
        C1138090fip c1138090fip = (C1138090fip) ((LinkedHashMap) this.LLILLL).get(Integer.valueOf(i));
        if (c1138090fip == null) {
            return;
        }
        AbstractC1138110fir abstractC1138110fir = c1138090fip.LJIIJ;
        if (!(abstractC1138110fir instanceof C1138240fj4) && !(abstractC1138110fir instanceof C1138250fj5)) {
            return;
        }
        C13E8 c13e8 = (C13E8) ((LinkedHashMap) this.LLILZ).get(Integer.valueOf(i));
        if (c13e8 == null || (abstractC1136890fgt = (AbstractC1136890fgt) c13e8.LJIILJJIL()) == null) {
            return;
        }
        c1138090fip.onEvent(abstractC1136890fgt);
    }
}
