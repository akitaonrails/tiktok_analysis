package com.ss.android.ugc.aweme.main.homepageImpl;

import X.AbstractC1387200mCc;
import X.C1599650rjH;
import X.C1619110sEf;
import X.C1906580ziK;
import X.C1908480zlO;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainRootFragment;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveBubblePopServiceImpl implements ILiveBubblePopService {
    public C1599650rjH LIZ;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0025 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:8:0x0012, B:9:0x0014, B:16:0x001f, B:18:0x0025), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() {
        /*
            r5 = this;
            r4 = 0
            X.0mCc r3 = X.C1906580ziK.LIZIZ()     // Catch: java.lang.Exception -> L2a
            r2 = 0
            if (r3 == 0) goto L19
            android.app.Activity r0 = r3.LIZIZ()     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L19
            X.19EG r1 = X.C1388190mED.LIZIZ(r0)     // Catch: java.lang.Exception -> L2a
        L12:
            java.lang.Object r2 = r3.LIZ     // Catch: java.lang.Exception -> L2a
        L14:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.main.MainRootFragment     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L2e
            goto L1d
        L19:
            r1 = r2
            if (r3 == 0) goto L14
            goto L12
        L1d:
            if (r1 == 0) goto L2e
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = X.C1559110qft.LIZ(r1)     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L29
            boolean r4 = r0.Q6()     // Catch: java.lang.Exception -> L2a
        L29:
            return r4
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.homepageImpl.LiveBubblePopServiceImpl.LIZLLL():boolean");
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public final boolean LIZIZ() {
        return C1908480zlO.LIZIZ.LJIIIZ(false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0rjH] */
    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public final void LJ() {
        if (this.LIZ == null) {
            this.LIZ = new C1619110sEf() { // from class: X.0rjH
                @Override // X.C1619110sEf, X.InterfaceC20643015q8
                public final void LIZIZ(InnerPushMessage innerPushMessage) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJ();
                }
            };
        }
        C1599650rjH c1599650rjH = this.LIZ;
        if (c1599650rjH != null) {
            C1908480zlO.LIZIZ.LJIIIIZZ(c1599650rjH);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public final void LJFF() {
        C1599650rjH c1599650rjH = this.LIZ;
        if (c1599650rjH != null) {
            C1908480zlO.LIZIZ.LJIIZILJ(c1599650rjH);
            this.LIZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public final boolean LIZ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Object obj = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZ : null;
        return (obj instanceof MainRootFragment) && ((MainRootFragment) obj).isADShowing();
    }

    @Override // com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService
    public final boolean LIZJ() {
        return PopupManager.LJI();
    }
}
