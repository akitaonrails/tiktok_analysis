package com.ss.android.ugc.aweme.log;

import X.C1023960ckk;
import X.C1035880d3y;
import X.C1039550d9t;
import X.C1040580dBY;
import X.C1040750dBp;
import X.C1043510dGH;
import X.InterfaceC1009950cO9;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebViewBlankLogRouter implements IRouteAction {
    public final boolean isAd(AdWebLogModel adWebLogModel) {
        String cid;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || CastLongProtector.parseLong(cid) <= 0) {
            return false;
        }
        return true;
    }

    public final boolean isAd(C1035880d3y c1035880d3y) {
        if (c1035880d3y == null || c1035880d3y.getRealCreativeId() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        AdWebLogModel adWebLogModel = C1039550d9t.LIZ;
        if (adWebLogModel != null) {
            if (isAd(adWebLogModel)) {
                InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
                C1023960ckk c1023960ckk = C1043510dGH.LJIIIZ;
                String cid = adWebLogModel.getCid();
                if (cid == null) {
                    cid = "";
                }
                interfaceC1009950cO9.logAd(c1023960ckk, cid, adWebLogModel.getLogExtra(), null, new AwS382S0200000_16(adWebLogModel, bundle, 28));
            }
            if (adWebLogModel.getNonAdWebModel() != null) {
                C1040580dBY c1040580dBY = new C1040580dBY(adWebLogModel);
                C1040750dBp.LIZ.getClass();
                c1040580dBY.log(C1040750dBp.LJIIL, new AwS595S0100000_16(bundle, 105));
            }
        }
        C1035880d3y c1035880d3y = C1039550d9t.LIZIZ;
        if (c1035880d3y != null) {
            if (isAd(c1035880d3y)) {
                ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C1043510dGH.LJIIIZ, c1035880d3y.getRealCreativeIdStr(), c1035880d3y.getRealLogExtra(), null, new AwS382S0200000_16(c1035880d3y, bundle, 29));
            }
            if (c1035880d3y.getNonAdWebModel() != null) {
                C1040580dBY c1040580dBY2 = new C1040580dBY(c1035880d3y);
                C1040750dBp.LIZ.getClass();
                c1040580dBY2.log(C1040750dBp.LJIIL, new AwS595S0100000_16(bundle, 106));
            }
        }
        return Boolean.TRUE;
    }
}
