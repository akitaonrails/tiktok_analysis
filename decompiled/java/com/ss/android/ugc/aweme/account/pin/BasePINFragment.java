package com.ss.android.ugc.aweme.account.pin;

import X.C01GW;
import X.C1389890mGx;
import X.C13ZC;
import X.C1680190tpB;
import X.C1680510tph;
import X.C1682520tsw;
import X.C1682680ttC;
import X.C1685190txF;
import X.C1692220u8a;
import X.C1692230u8b;
import X.C1693020u9s;
import X.C1693430uAX;
import X.C1693450uAZ;
import X.C19EG;
import X.C19EH;
import X.C20030013Ys;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1693170uA7;
import androidx.compose.foundation.layout.c;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes26.dex */
public class BasePINFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvHELIOSKiAmJjFiOSY9ZgctOioDAQsKOy40JSAiPQ==";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 48));

    public final String getEnterFrom() {
        return (String) this.LLIZ.getValue();
    }

    public final void VR() {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || supportFragmentManager.LJJLIIIIJ() <= 0) {
            UR(null);
            return;
        }
        C19EG activity2 = getActivity();
        if (activity2 == null || (supportFragmentManager2 = activity2.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager2.LJLLILLLL();
    }

    public final void UR(String str) {
        C19EG activity = getActivity();
        if (activity != null) {
            if (str != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.ee);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
            activity.finish();
        }
    }

    public final void WR(CreateOrResetPINFragment createOrResetPINFragment) {
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LJIJJLI(R.anim.fv, R.anim.g0, R.anim.ft, R.anim.g2);
            c19ehLJIIJ.LJIJ(R.id.iiv, createOrResetPINFragment, null);
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    public final void SR(String str, long j, long j2, C1693430uAX c1693430uAX, int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1612309445);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJJ(j2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1053824739);
            C1692230u8b c1692230u8b = new C1692230u8b();
            c1692230u8b.LIZLLL(str);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new InterfaceC1693170uA7() { // from class: X.0ttB
                    @Override // X.InterfaceC1693170uA7
                    public final void LIZIZ() {
                        C844470XAv.LIZ.getClass();
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "//webview");
                        smartRouteBuildRoute.withParam("url", "https://ads.tiktok.com/help/article/about-pin-verification-for-organization-accounts");
                        smartRouteBuildRoute.open();
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            c1692230u8b.LJIIIIZZ(new C1693020u9s("learn more", null, (InterfaceC1693170uA7) objLJJ));
            int iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(j2, 0L, C1680190tpB.LLJ, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(getString(2131838968));
                c1692230u8b.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                c1692230u8b.LJII(iLJIIJJI);
                c1692230u8b.LJI();
                C1692220u8a c1692220u8aLJIIL = c1692230u8b.LJIIL();
                c13zcLJIIJ.LJJJJL(false);
                float f = 32;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), f, 16, f, 0.0f, 8);
                int i10 = i3 << 3;
                C1685190txF.LIZIZ(c1692220u8aLJIIL, interfaceC1685750ty9LJIIL, j, c1693430uAX, 0L, i, 0, false, 0, null, null, c13zcLJIIJ, (i3 & 7168) | (i10 & 896) | 48 | (i10 & 458752), 0, 2000);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1692230u8b.LJII(iLJIIJJI);
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1682680ttC(this, str, j, j2, c1693430uAX, i, i2);
        }
    }
}
