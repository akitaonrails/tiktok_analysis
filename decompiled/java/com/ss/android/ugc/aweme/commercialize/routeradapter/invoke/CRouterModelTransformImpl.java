package com.ss.android.ugc.aweme.commercialize.routeradapter.invoke;

import X.C098200Yq;
import X.C1216604pQ;
import X.C189200o6;
import X.C2188811AlT;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes3.dex */
public final class CRouterModelTransformImpl implements ICRouterModelTransform {
    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform
    public final GMTBaseModel LIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return null;
        }
        try {
            System.currentTimeMillis();
            String json = GsonProtectorUtils.toJson(C1216604pQ.LIZ(), awemeRawAd);
            if (json == null) {
                json = "";
            }
            try {
                System.currentTimeMillis();
                return (GMTBaseModel) C1216604pQ.LIZ().LJII(json, GMTBaseModel.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rawAdToBaseModel(), exception message = ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            return null;
        }
    }
}
