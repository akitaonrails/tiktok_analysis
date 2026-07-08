package com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash;

import X.C04TD;
import X.C1030890cvv;
import X.C1030920cvy;
import X.C1030960cw2;
import X.C2472609mW;
import X.EnumC1030940cw0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class RealTimeSplashManagerImpl implements IRealTimeSplashManager {
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final void release() {
        C1030920cvy.LIZJ = null;
        try {
            C2472609mW c2472609mW = C1030920cvy.LIZ;
            if (c2472609mW != null) {
                c2472609mW.cancel();
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1030920cvy.LIZ = null;
        C1030920cvy.LIZIZ = null;
        C1030920cvy.LJ = EnumC1030940cw0.DEFAULT;
    }

    public static IRealTimeSplashManager LJFF() {
        Object objLIZ = C04TD.LIZ(IRealTimeSplashManager.class, false);
        if (objLIZ != null) {
            return (IRealTimeSplashManager) objLIZ;
        }
        if (C04TD.LJJIJ == null) {
            synchronized (IRealTimeSplashManager.class) {
                if (C04TD.LJJIJ == null) {
                    C04TD.LJJIJ = new RealTimeSplashManagerImpl();
                }
            }
        }
        return C04TD.LJJIJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final Pair<String, EnumC1030940cw0> LIZ() {
        C2472609mW c2472609mW = C1030920cvy.LIZ;
        return new Pair<>(C1030920cvy.LIZIZ, C1030920cvy.LJ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final boolean LIZJ() {
        C2472609mW c2472609mW = C1030920cvy.LIZ;
        return C1030920cvy.LJII;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final long LJ() {
        return C1030960cw2.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final void LIZIZ(boolean z) {
        C1030920cvy.LJII = z;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager
    public final void LIZLLL(C1030890cvv c1030890cvv) {
        C1030920cvy.LIZJ = null;
        if (C1030920cvy.LJ == EnumC1030940cw0.DEFAULT) {
            C1030920cvy.LIZIZ();
        }
        if (C1030920cvy.LJ == EnumC1030940cw0.REQUEST_START) {
            C1030920cvy.LIZJ = c1030890cvv;
        } else {
            c1030890cvv.LIZ();
        }
    }
}
