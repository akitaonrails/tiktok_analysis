package com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed;

import X.C01GW;
import X.C0J9Y;
import X.C1338270kvh;
import X.C2220311BvB;
import X.C452501pT;
import X.C497740JfY;
import X.C780890UkB;
import X.C786410Ut5;
import X.C804420Vh2;
import X.EnumC804620VhM;
import X.InterfaceC473790Ii1;
import X.RunnableC2220281Bv8;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorNetworkMonitorDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public class NetSpeedMonitorWidget extends LiveRecyclableWidget {
    public ImageView LL;
    public TextView LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public LiveMode LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 9));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 10));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(14));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 7));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(15));
    public EnumC804620VhM LLJIJIL = C804420Vh2.LJ(C497740JfY.LJII());
    public EnumC804620VhM LLJILJIL = C804420Vh2.LJ(C497740JfY.LJII());
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(16));
    public final C2220311BvB LLJILLL = new InterfaceC473790Ii1() { // from class: X.1BvB
        @Override // X.InterfaceC473790Ii1
        public final void LIZ(EnumC804620VhM enumC804620VhM) {
            if (enumC804620VhM != EnumC804620VhM.NONE) {
                C2220261Bv6 c2220261Bv6 = (C2220261Bv6) this.LIZ.LLJI.getValue();
                NetSpeedMonitorWidget netSpeedMonitorWidget = this.LIZ;
                EnumC804620VhM enumC804620VhM2 = netSpeedMonitorWidget.LLJILJIL;
                int i = netSpeedMonitorWidget.LLILLL;
                AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(netSpeedMonitorWidget, 8);
                c2220261Bv6.getClass();
                if (System.currentTimeMillis() - c2220261Bv6.LIZ < ((long) LiveAnchorNetworkMonitorDurationSetting.INSTANCE.getValue()) * 1000) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_change_network");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(C2220261Bv6.LIZIZ(enumC804620VhM2), "before_net_status");
                    c474500IjALIZ.LJJII(C2220261Bv6.LIZIZ(enumC804620VhM), "after_net_status");
                    c474500IjALIZ.LJJII(C2220261Bv6.LIZ(i), "before_net_speed");
                    c474500IjALIZ.LIZ();
                    System.currentTimeMillis();
                    awS578S0100000_34.invoke();
                }
                this.LIZ.LLJILJIL = enumC804620VhM;
            }
            this.LIZ.LLJIJIL = enumC804620VhM;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("networkStatusListener: ");
            sbLIZ.append(this.LIZ.LLJIJIL);
            C20441214yg.LJIIIZ("NetSpeedMonitorWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hzu;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C0J9Y c0j9y = (C0J9Y) this.LLJILJILJ.getValue();
        c0j9y.LIZLLL(this.LLJILLL);
        c0j9y.LJ();
        ((Handler) this.LLIZLLLIL.getValue()).removeCallbacksAndMessages(null);
    }

    public void x1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, NetworkStatus.class, new AwS613S0100000_34(this, 2));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        this.LLILZIL = liveMode;
        this.LL = (ImageView) findViewById(R.id.w1a);
        this.LLILLJJLI = (TextView) findViewById(R.id.w25);
        x1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
        }
        C0J9Y c0j9y = (C0J9Y) this.LLJILJILJ.getValue();
        c0j9y.LIZIZ(this.context);
        c0j9y.LIZ(this.LLJILLL);
        C786410Ut5.LJLIIL(3000L, (Handler) this.LLIZLLLIL.getValue(), (RunnableC2220281Bv8) this.LLILZLL.getValue());
    }

    public void y1(int i) {
        LiveMode liveMode = this.LLILZIL;
        if (liveMode != null && C780890UkB.LIZ[liveMode.ordinal()] == 1) {
            this.LLILLL = i;
        } else if (this.LLJIJIL == EnumC804620VhM.NONE) {
            this.LLILLL = 3;
        } else if (i != 0) {
            this.LLILLL = i;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        int i2 = this.LLILZ;
        int i3 = this.LLILLL;
        if (i2 != i3) {
            this.LLILZ = i3;
        }
    }
}
