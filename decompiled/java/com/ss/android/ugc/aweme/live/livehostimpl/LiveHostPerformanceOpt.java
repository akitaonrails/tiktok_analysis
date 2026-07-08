package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C01GW;
import X.C0CN5;
import X.C0VWW;
import X.C0VX4;
import X.C0XAK;
import X.C1565340qpw;
import X.C1782306yT;
import X.C1827607Du;
import X.C20742916Ex;
import X.C21146717pB;
import X.C2187451AjH;
import X.C452501pT;
import X.InterfaceC1488720oqM;
import X.InterfaceC466670IRt;
import X.InterfaceC774480UZq;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerRoomJITBlockOpt;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveHostPerformanceOpt implements IHostPerformanceOpt {
    public final C01GW LL = C452501pT.LIZIZ(new C0VX4());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C0XAK());

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void OC2() {
        C2187451AjH.LJII(1500L, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void ue1() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final InterfaceC774480UZq GX0() {
        return (InterfaceC774480UZq) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void TY() {
        C2187451AjH.LJII(1500L, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final int Yc() {
        InterfaceC1488720oqM interfaceC1488720oqMW4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC1488720oqMW4 = iLiveOuterService.w4()) == null) {
            return 0;
        }
        return interfaceC1488720oqMW4.Yc();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final InterfaceC466670IRt jG0() {
        return (InterfaceC466670IRt) this.LL.getValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final boolean fN2() {
        return C1565340qpw.LIZ().getOptLiveTimeReport() && !C0CN5.LJII();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void kE2() {
        ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).release();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void MS1(long j) {
        if (LiveInnerRoomJITBlockOpt.INSTANCE.enable()) {
            C2187451AjH.LJJIFFI(j);
        } else {
            int i = C2187451AjH.LIZ;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void iG1(String str) {
        C0VWW.LIZIZ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void sh(String str) {
        C0VWW.LJI(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final Object JW(AFwS193S0000000_7 aFwS193S0000000_7, Object obj) {
        return C1827607Du.LIZJ(C1782306yT.LIZ(), obj, aFwS193S0000000_7);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void SV1(int i, Context context) {
        C21146717pB.LIZJ(context, i);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final View jH0(Context context, int i, ViewGroup viewGroup, boolean z) {
        if (viewGroup != null) {
            return C20742916Ex.LIZIZ(context, i, viewGroup, z, -1, true);
        }
        return C20742916Ex.LIZIZ(context, i, new FrameLayout(context), false, -1, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final View uK2(Context context, int i, ViewGroup viewGroup, boolean z) {
        return C21146717pB.LIZIZ(context, i, viewGroup, z);
    }
}
