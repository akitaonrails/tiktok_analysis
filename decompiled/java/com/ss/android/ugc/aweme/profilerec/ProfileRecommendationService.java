package com.ss.android.ugc.aweme.profilerec;

import X.AbstractC1387200mCc;
import X.C0PEM;
import X.C0S78;
import X.C123100dR;
import X.C1296730jqh;
import X.C1296740jqi;
import X.C1565500qqC;
import X.C1593950ra5;
import X.C1593960ra6;
import X.C1906580ziK;
import X.C19EG;
import X.C1BNE;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C632880Os2;
import X.C844470XAv;
import X.EnumC1286380ja0;
import X.InterfaceC1603190roz;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class ProfileRecommendationService implements IProfileRecommendationService {
    public C1593950ra5 LIZ = new C1593950ra5(null, null, 15);
    public final C2252321DDq LIZIZ = C1BNE.LIZ(new C1296740jqi((EnumC1286380ja0) null, 3));
    public C632880Os2 LIZJ = new C632880Os2();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public boolean LJFF;

    @Override // com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService
    public final void LIZ() {
        String str = a0.LJJJIL(this.LIZJ.LIZ) ^ true ? this.LIZJ.LIZ : this.LIZ.LIZ;
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://user/profile/");
        smartRouteBuildRoute.withParam("sec_userid", this.LIZJ.LIZJ);
        smartRouteBuildRoute.withParam("enter_from", "from_deep_link");
        if (C123100dR.LIZ(str)) {
            smartRouteBuildRoute.withParam("uid", str);
        } else if (!a0.LJJJIL(this.LIZ.LIZIZ)) {
            smartRouteBuildRoute.withParam("unique_id", this.LIZ.LIZIZ);
        }
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService
    public final boolean LIZIZ() {
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1603190roz) {
                return false;
            }
        }
        return C1593960ra6.LIZ.isEnabled;
    }

    @Override // com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService
    public final C632880Os2 LIZJ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService
    public final void LIZLLL(C19EG c19eg) {
        if (c19eg == null) {
            return;
        }
        C0S78.LIZ(new C1565500qqC(c19eg, this), true);
    }

    @Override // com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService
    public final void LJ(C1593950ra5 c1593950ra5) {
        C1593950ra5 c1593950ra52 = this.LIZ;
        String str = c1593950ra5.LIZIZ;
        String str2 = c1593950ra5.LIZ;
        this.LIZ = new C1593950ra5(str2, str, c1593950ra52.LIZJ, c1593950ra52.LIZLLL);
        this.LIZJ = C632880Os2.LIZ(this.LIZJ, str2, 0, 510);
        this.LJFF = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1296730jqh(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.service.profilerec.IProfileRecommendationService
    public final void LJFF(String str) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://aweme/detail/");
        sbLIZ.append(str);
        SmartRouter.buildRoute(contextLIZ, C2188811AlT.LIZIZ(sbLIZ)).open();
    }

    public final void LJI(String str) {
        if (this.LJ.getAndSet(true)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("exit_method", str);
        C20684815ws.LJIILLIIL("follow_success_card_disappear", c2344009Gk.LIZ);
    }
}
