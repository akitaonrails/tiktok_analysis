package com.ss.android.ugc.aweme.aweme.optimize;

import X.C01GW;
import X.C04TD;
import X.C098200Yq;
import X.C0O2X;
import X.C0O2Y;
import X.C0O2Z;
import X.C0OGG;
import X.C0VL3;
import X.C13BV;
import X.C14EU;
import X.C1515120pWw;
import X.C189200o6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C486550J6f;
import X.C844470XAv;
import X.InterfaceC497601wk;
import X.InterfaceC612860O2a;
import X.InterfaceC612880O2c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class AwemeCacheService implements IAwemeCacheService {
    public AwemeCacheDatabase LIZJ;
    public InterfaceC612860O2a LIZLLL;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(190));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(191));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(55));

    public static IAwemeCacheService LJI() {
        Object objLIZ = C04TD.LIZ(IAwemeCacheService.class, false);
        if (objLIZ != null) {
            return (IAwemeCacheService) objLIZ;
        }
        if (C04TD.LLIILII == null) {
            synchronized (IAwemeCacheService.class) {
                if (C04TD.LLIILII == null) {
                    C04TD.LLIILII = new AwemeCacheService();
                }
            }
        }
        return C04TD.LLIILII;
    }

    @Override // com.ss.android.ugc.aweme.aweme.optimize.IAwemeCacheService
    public final void LIZ() {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C0O2Y(this, null), 3);
    }

    public final AwemeCacheConfigModel LJII() {
        return (AwemeCacheConfigModel) this.LJ.getValue();
    }

    public final InterfaceC612860O2a LJIIIIZZ() {
        if (this.LIZLLL == null) {
            C844470XAv.LIZ.getClass();
            AwemeCacheDatabase awemeCacheDatabase = (AwemeCacheDatabase) C0OGG.LIZ(C844470XAv.LIZ(), AwemeCacheDatabase.class, C0O2Z.LIZ()).LIZIZ();
            this.LIZJ = awemeCacheDatabase;
            this.LIZLLL = awemeCacheDatabase.LIZ();
        }
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.aweme.optimize.IAwemeCacheService
    public final void initialize() {
        EventBus.LIZLLL().LJIJJ(this);
        C1515120pWw.LIZIZ(new AwemeCacheNetworkInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.aweme.optimize.IAwemeCacheService
    public final InterfaceC612880O2c LIZIZ(String str) {
        return (InterfaceC612880O2c) ((Map) this.LIZIZ.getValue()).get(str);
    }

    @Override // com.ss.android.ugc.aweme.aweme.optimize.IAwemeCacheService
    public final List<C0VL3> LIZJ(String str) {
        List<C0VL3> listLIZIZ;
        InterfaceC612860O2a interfaceC612860O2aLJIIIIZZ = LJIIIIZZ();
        if (interfaceC612860O2aLJIIIIZZ == null || (listLIZIZ = interfaceC612860O2aLJIIIIZZ.LIZIZ(System.currentTimeMillis() - LJII().validPeriod, str)) == null) {
            return C13BV.INSTANCE;
        }
        return listLIZIZ;
    }

    public final void LJFF(String str) {
        int iLJFF;
        InterfaceC612860O2a interfaceC612860O2aLJIIIIZZ;
        InterfaceC612860O2a interfaceC612860O2aLJIIIIZZ2;
        InterfaceC612860O2a interfaceC612860O2aLJIIIIZZ3 = LJIIIIZZ();
        int iLJFF2 = 0;
        if (interfaceC612860O2aLJIIIIZZ3 != null) {
            iLJFF = interfaceC612860O2aLJIIIIZZ3.LJFF(str);
        } else {
            iLJFF = 0;
        }
        if (iLJFF > LJII().apiPathAwemeCleanThreshold && (interfaceC612860O2aLJIIIIZZ2 = LJIIIIZZ()) != null) {
            interfaceC612860O2aLJIIIIZZ2.LJ(System.currentTimeMillis() - LJII().validPeriod);
        }
        InterfaceC612860O2a interfaceC612860O2aLJIIIIZZ4 = LJIIIIZZ();
        if (interfaceC612860O2aLJIIIIZZ4 != null) {
            iLJFF2 = interfaceC612860O2aLJIIIIZZ4.LJFF(str);
        }
        if (iLJFF2 > LJII().apiPathMaxAweme && (interfaceC612860O2aLJIIIIZZ = LJIIIIZZ()) != null) {
            interfaceC612860O2aLJIIIIZZ.LIZLLL(LJII().apiPathMaxAweme, str);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        Object c098200Yq;
        AwemeCacheDatabase awemeCacheDatabase = this.LIZJ;
        if (awemeCacheDatabase != null) {
            try {
                if (awemeCacheDatabase.isOpen()) {
                    awemeCacheDatabase.close();
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset error: ");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.aweme.optimize.IAwemeCacheService
    public final void LIZLLL(String str, List<C0VL3> list) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C0O2X(this, list, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.aweme.optimize.IAwemeCacheService
    public final C0VL3 LJ(String str, String str2) {
        InterfaceC612860O2a interfaceC612860O2aLJIIIIZZ = LJIIIIZZ();
        if (interfaceC612860O2aLJIIIIZZ != null) {
            return interfaceC612860O2aLJIIIIZZ.LIZJ(System.currentTimeMillis() - LJII().validPeriod, str2, str);
        }
        return null;
    }
}
