package com.ss.android.ugc.aweme.video.simplayer.tt;

import X.AbstractC1284860jXY;
import X.C1284800jXS;
import X.C1284840jXW;
import X.C1287200jbK;
import X.C1471670oOr;
import X.C1471680oOs;
import X.C1472280oPq;
import X.C1474810oTv;
import X.C1476530oWh;
import X.C1476540oWi;
import X.C1476570oWl;
import X.C1479300obA;
import X.C1479490obT;
import X.C1480100ocS;
import X.C1480700odQ;
import X.C607330Nrv;
import X.EnumC1479760obu;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.impl.SimplifyAsyncPlayer;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes24.dex */
public class TTSimPlayerServiceImpl implements ISimPlayerService {
    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void LJIIIZ() {
        TTVideoEngine.LJFF = false;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C1476530oWh LIZ() {
        if (C1476530oWh.LIZ == null) {
            synchronized (C1476530oWh.class) {
                try {
                    if (C1476530oWh.LIZ == null) {
                        C1476530oWh.LIZ = new C1476530oWh();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1476530oWh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C1480100ocS LIZJ() {
        return new C1480100ocS(false);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C1479300obA LJFF() {
        EnumC1479760obu enumC1479760obu = EnumC1479760obu.TT;
        return new C1479300obA(((Number) C1474810oTv.LLJJIII.getValue()).intValue() == 3 ? new C1480700odQ(enumC1479760obu, C607330Nrv.LIZ.LIZ().getISimPlayerPlaySessionConfig(false)) : new SimplifyAsyncPlayer(new C1479490obT(enumC1479760obu, -1)), new C1476570oWl());
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C1479300obA LJII() {
        C1476570oWl c1476570oWl = new C1476570oWl();
        c1476570oWl.LIZJ = true;
        c1476570oWl.LIZ = false;
        return new C1476540oWi(c1476570oWl).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C1479300obA LIZIZ() {
        return LJII();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final AbstractC1284860jXY LJI() {
        return C1472280oPq.LIZJ() ? new C1287200jbK() : ((Boolean) C1474810oTv.q5.getValue()).booleanValue() ? new C1284800jXS() : new C1284840jXW();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void LIZLLL(C1471680oOs c1471680oOs) {
        TTVideoEngineLog.setListener(new C1471670oOr(c1471680oOs));
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void LJ(ExecutorService executorService) {
        TTVideoEngine.LLIIL(executorService);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final C1479300obA LJIIIIZZ(C1476570oWl c1476570oWl) {
        return new C1476540oWi(c1476570oWl).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void setLogLevel(int i) {
        int i2;
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TTVideoEngineLog.turnOn(1, i2);
    }
}
