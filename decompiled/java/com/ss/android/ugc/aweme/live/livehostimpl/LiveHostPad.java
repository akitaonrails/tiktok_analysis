package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C1161920gLG;
import X.C1389340mG4;
import X.C1389350mG5;
import X.C14KS;
import X.C1BWL;
import X.C20441214yg;
import X.C20593115i5;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500260Jjc;
import X.InterfaceC469390Iav;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectPadSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveCenterLiveStreamSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveFoldLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.message.LivePadScreenSizeSetting;
import com.bytedance.android.livesdk.pad.IPadMultiScreenService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveHostPad implements IHostPad {
    public float LL = -1.0f;

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean Fi() {
        C20593115i5.LIZ.getClass();
        return C20593115i5.LJIIIIZZ(null) || C20593115i5.LJIILIIL() || C20593115i5.LJIIJ(C20593115i5.LJ(), "ec");
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean St() {
        InterfaceC469390Iav interfaceC469390Iav = ((IPadMultiScreenService) C1161920gLG.LIZJ(IPadMultiScreenService.class)).MR().get();
        return interfaceC469390Iav != null && interfaceC469390Iav.St();
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final float VZ() {
        try {
            if (this.LL < 0.0f) {
                float f = C1BWL.LIZJ().getDisplayMetrics().widthPixels / C1BWL.LIZJ().getDisplayMetrics().xdpi;
                float f2 = C1BWL.LIZJ().getDisplayMetrics().heightPixels / C1BWL.LIZJ().getDisplayMetrics().ydpi;
                this.LL = (float) Math.sqrt((f * f) + (f2 * f2));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("screen inch size:");
                sbLIZ.append(this.LL);
                C20441214yg.LJIIIZ("LiveHostPad", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return this.LL;
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean Yd2() {
        C20593115i5.LIZ.getClass();
        return C20593115i5.LJIIIIZZ(null);
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean eG0() {
        return LiveCenterLiveStreamSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean o4() {
        C20593115i5.LIZ.getClass();
        return C20593115i5.LJIIJ(C20593115i5.LJ(), "ec");
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean Nx() {
        boolean z = isPad() || XM(null) == 1;
        if (!C500260Jjc.LJJIII(C497740JfY.LIZ)) {
            return z;
        }
        if (!z) {
            return false;
        }
        C20593115i5 c20593115i5 = C20593115i5.LIZ;
        int iLJJI = (int) C497740JfY.LJJI(C14KS.LJFF());
        int iLJJI2 = (int) C497740JfY.LJJI(C14KS.LIZLLL());
        c20593115i5.getClass();
        return C20593115i5.LJIIJ(C20593115i5.LJFF(iLJJI, iLJJI2), "ec");
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean isPad() {
        if (rB()) {
            return XM(null) == 1;
        }
        if (!o4()) {
            return false;
        }
        C20593115i5.LIZ.getClass();
        return !C20593115i5.LJIIIIZZ(null) && LivePadScreenSizeSetting.INSTANCE.getValue() <= VZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean rB() {
        return Yd2() && LiveFoldLandscapeSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final boolean w02() {
        return isPad() && LiveGiftEffectPadSetting.getValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.user.IHostPad
    public final int XM(Context context) {
        IHostAction iHostAction;
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2()) {
            if (context == null && ((iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) == null || (context = iHostAction.getTopContext()) == null)) {
                return -1;
            }
            C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(context, null);
            int iLIZIZ = c1389350mG5LIZJ.LIZIZ();
            int iLIZ = c1389350mG5LIZJ.LIZ();
            C20593115i5.LIZ.getClass();
            if (!C20593115i5.LJIIIIZZ(context)) {
                return -1;
            }
            if (!C20593115i5.LJIIJ(C20593115i5.LJFF(iLIZIZ, iLIZ), "ec")) {
                float f = iLIZ / iLIZIZ;
                if (0.75f <= f && f <= 1.33f) {
                    return 1;
                }
                return 0;
            }
            return 1;
        }
        return -1;
    }
}
