package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C05RV;
import X.C0I0B;
import X.C0NY2;
import X.C0XIR;
import X.C0XK4;
import X.C0Y8T;
import X.C0ZFG;
import X.C0ZJ0;
import X.C1247000iYU;
import X.C1336205Ku;
import X.C1389340mG4;
import X.C1494430ozZ;
import X.C1494690ozz;
import X.C15511065l;
import X.C1908480zlO;
import X.C1910990zpR;
import X.C19328310jZ;
import X.C2222691Bz1;
import X.C318400Cdy;
import X.C894660Z7w;
import X.C896420ZEq;
import X.InterfaceC19330810jy;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class IMHostService implements IMHostApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final void LJIILL() {
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final boolean LIZ() {
        C0I0B.LJFF.LIZJ();
        return C1389340mG4.LIZJ(C894660Z7w.LIZ(), null).LJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final boolean LIZJ() {
        return C19328310jZ.LIZIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final C0ZFG LIZLLL() {
        return C0ZFG.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final C15511065l LJFF() {
        return new C15511065l(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZJ0] */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final C0ZJ0 LJII() {
        return new Object() { // from class: X.0ZJ0
            {
                C1E8E c1e8e = C1E8E.LIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final C0NY2 LJIIJJI() {
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        InterfaceC19330810jy interfaceC19330810jyLJIJ = c1908480zlO.LJIJ(27);
        if (interfaceC19330810jyLJIJ == null) {
            C896420ZEq c896420ZEq = new C896420ZEq(0);
            c1908480zlO.LJ(c896420ZEq);
            return c896420ZEq;
        }
        if (interfaceC19330810jyLJIJ instanceof C896420ZEq) {
            return (C0NY2) interfaceC19330810jyLJIJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final long LIZIZ() {
        return NetworkUtils.getServerTimeMills();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final boolean LJIIL() {
        String strLIZIZ = C2222691Bz1.LIZIZ();
        if (a0.LJJJIL(strLIZIZ)) {
            strLIZIZ = C2222691Bz1.LJFF();
        }
        SettingsManager.LIZLLL().getClass();
        return strLIZIZ.length() > 0 && a0.LJJIIZI(SettingsManager.LJI("activity_status_guide_region_set_string", "AL,AD,AT,BE,BG,HR,CZ,DK,BG,HR,CZ,DK,BG,HR,CZ,DK,BG,HR,CZ,DK,EE,FO,FI,FR,DE,GI,GR,GG,VA,HU,IS,IE,IM,IT,JE,LV,LI,LT,LU,MT,MC,NL,MK,NO,PL,PT,RO,SM,RS,SK,SI,ES,SJ,SE,CH,GB,AX"), strLIZIZ, false);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final int getServerTime() {
        return C0XK4.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final boolean LJI(Object obj) {
        return obj instanceof AvatarComponentView;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final int LJIIIIZZ(byte[] bArr) {
        return C318400Cdy.LIZIZ(bArr);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final String LJIIIZ(String str) {
        if (str != null) {
            return C1247000iYU.LIZJ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final Pair<Integer, String> LJIILIIL(Throwable th) {
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            return new Pair<>(Integer.valueOf(c0xir.getErrorCode()), c0xir.getErrorMsg());
        }
        if (th instanceof C1494690ozz) {
            return new Pair<>(Integer.valueOf(((C1494690ozz) th).getStatusCode()), th.getMessage());
        }
        if (th instanceof C1494430ozZ) {
            return new Pair<>(Integer.valueOf(((C1494430ozZ) th).getStatusCode()), th.getMessage());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi
    public final boolean LJIILJJIL(Object obj) {
        if (!(obj instanceof C0Y8T)) {
            return false;
        }
        C0Y8T c0y8t = (C0Y8T) obj;
        if ((!c0y8t.isStranger() || C1910990zpR.LIZIZ.LIZJ() == C05RV.BUSINESS_INBOX) && (!c0y8t.isRisky() || !C1336205Ku.LIZ(false).getImPrivacySettings().LJIJJLI(true))) {
            return false;
        }
        return true;
    }
}
