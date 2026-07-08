package com.ss.android.ugc.aweme.service;

import X.AbstractC2136308Yn;
import X.C01GW;
import X.C05K9;
import X.C098200Yq;
import X.C09QD;
import X.C09QE;
import X.C09QF;
import X.C09QG;
import X.C09QK;
import X.C1125904an;
import X.C13BV;
import X.C1720106oR;
import X.C189200o6;
import X.C19719612Di;
import X.C2172608fE;
import X.C2172708fF;
import X.C2187451AjH;
import X.C2188561Al4;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C476250Ilz;
import X.C557050Lt1;
import X.InterfaceC2188711AlJ;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class PublishResourceFirstPolicyServiceImpl implements IPublishResourceFirstPolicyService {
    public final String LIZ = "PublishResourceFirstPolicy";
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C09QG(this));
    public final C01GW LIZJ = C452501pT.LIZIZ(new C09QF(this));
    public final C557050Lt1 LIZLLL = new C557050Lt1(false);
    public final C01GW LJ = C452501pT.LIZIZ(new C09QE());
    public final C01GW LJFF = C452501pT.LIZIZ(new C09QD());
    public final C01GW LJI = C452501pT.LIZIZ(new C05K9());

    public final void LIZJ() {
        int i = C2187451AjH.LIZ;
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear yield queue, queue size: ");
        sbLIZ.append(LIZLLL().size());
        C1720106oR.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        synchronized (LIZLLL()) {
            try {
                LIZLLL().clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZLLL.LIZJ(false);
    }

    public final ArrayList<C2172708fF> LIZLLL() {
        return (ArrayList) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService
    public final void start() {
        IAVPublishService iAVPublishService;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI(this.LIZ, "start");
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.Kg((SocialPublishCallback) this.LIZIZ.getValue(), new C1125904an());
        }
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        InterfaceC2188711AlJ interfaceC2188711AlJ = (InterfaceC2188711AlJ) this.LIZJ.getValue();
        c2188561Al4.getClass();
        C2188561Al4.LJII(interfaceC2188711AlJ);
        if (this.LIZLLL.LIZIZ() || (iAVPublishService = (IAVPublishService) this.LJFF.getValue()) == null || !iAVPublishService.isPublishing()) {
            return;
        }
        C1720106oR.LJI(this.LIZ, "compensate is publishing");
        this.LIZLLL.LIZJ(true);
    }

    @Override // com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService
    public final void stop() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI(this.LIZ, "stop");
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.f8((SocialPublishCallback) this.LIZIZ.getValue());
        }
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        InterfaceC2188711AlJ interfaceC2188711AlJ = (InterfaceC2188711AlJ) this.LIZJ.getValue();
        c2188561Al4.getClass();
        C09QK.LIZ(interfaceC2188711AlJ);
        LIZJ();
    }

    public final void LJ() {
        List arrayList;
        synchronized (LIZLLL()) {
            try {
                if (LIZLLL().isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList(LIZLLL());
                    LIZLLL().clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI(this.LIZ, "recover yield " + arrayList.size() + " task(s)");
        if (arrayList.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LJI.getValue(), null, null, new C2172608fE(arrayList, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService
    public final void LIZIZ(AbstractC2136308Yn abstractC2136308Yn) {
        int i = C2187451AjH.LIZ;
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quit all actions with type: ");
        sbLIZ.append(abstractC2136308Yn.LIZ);
        sbLIZ.append(", before size: ");
        sbLIZ.append(LIZLLL().size());
        C1720106oR.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        synchronized (LIZLLL()) {
            try {
                C19719612Di.LJJIIJ(LIZLLL(), new AwS582S0100000_3(abstractC2136308Yn, 49), true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        String str2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("quit all actions with type: ");
        sbLIZ2.append(abstractC2136308Yn.LIZ);
        sbLIZ2.append(", after size: ");
        sbLIZ2.append(LIZLLL().size());
        C1720106oR.LJI(str2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService
    public final void LIZ(AbstractC2136308Yn abstractC2136308Yn, Runnable runnable) {
        Object c098200Yq;
        if (!this.LIZLLL.LIZIZ()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not in publishing, no need to yield ");
            sbLIZ.append(abstractC2136308Yn);
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                runnable.run();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i2 = C2187451AjH.LIZ;
                String str = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("run action immediately with type: ");
                sbLIZ2.append(abstractC2136308Yn);
                sbLIZ2.append(" error");
                C1720106oR.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (LIZLLL()) {
            try {
                LIZLLL().add(new C2172708fF(abstractC2136308Yn, runnable, jCurrentTimeMillis));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        int i3 = C2187451AjH.LIZ;
        String str2 = this.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("start to yield action for type: ");
        sbLIZ3.append(abstractC2136308Yn.LIZ);
        sbLIZ3.append(" at ");
        sbLIZ3.append(jCurrentTimeMillis);
        sbLIZ3.append(", current size: ");
        sbLIZ3.append(LIZLLL().size());
        C1720106oR.LJI(str2, C2188811AlT.LIZIZ(sbLIZ3));
    }
}
