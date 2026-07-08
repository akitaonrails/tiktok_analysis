package com.ss.android.ugc.aweme.ecommerce.base.pdp.utils;

import X.C0C64;
import X.C1059860dge;
import X.C1388190mED;
import X.C1508090pLb;
import X.C1529870puj;
import X.C1607950rwf;
import X.C1741890vQh;
import X.C1758420vrM;
import X.C1766540w4S;
import X.C1AF0;
import X.C2188811AlT;
import X.C756302xN;
import X.InterfaceC1052500dUm;
import X.InterfaceC1541990qEH;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpEnterAnimModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEComRouterHandlerInternalService;
import java.util.HashMap;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpRouterHandler implements IEComRouterHandlerInternalService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComRouterHandlerInternalService
    public final void LIZ(String str, Context context, C1059860dge c1059860dge) {
        boolean z;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Object obj;
        String str2;
        InterfaceC1052500dUm interfaceC1052500dUm;
        String strLIZ;
        LynxView lynxView;
        View viewFindViewByName;
        Activity activityLIZ;
        try {
            if (!u.LJJIIJZLJL(str, "aweme://ec/pdp", false)) {
                return;
            }
            if (C1508090pLb.LIZ() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                PdpEnterAnimModel pdpEnterAnimModel = C1766540w4S.LIZ;
                PdpEnterAnimModel pdpEnterAnimModel2 = (PdpEnterAnimModel) c0c64LJIILLIIL.LJJII(PdpEnterAnimModel.class, pdpEnterAnimModel, "pdp_enter_anim", true);
                if (pdpEnterAnimModel2 != null) {
                    pdpEnterAnimModel = pdpEnterAnimModel2;
                }
                if (!C756302xN.LIZ(pdpEnterAnimModel.scenes) || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((uri = UriProtector.parse(str)), "enter_view_name")) == null) {
                    return;
                }
                HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(uri, "trackParams");
                View viewE1 = null;
                if (mapLIZJ != null) {
                    obj = mapLIZJ.get("previous_page");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                if (c1059860dge != null && (interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class)) != null && (strLIZ = interfaceC1052500dUm.LIZ()) != null) {
                    C1529870puj.LIZ.getClass();
                    InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(strLIZ);
                    if (interfaceC1541990qEHLJFF != null) {
                        viewE1 = interfaceC1541990qEHLJFF.e1();
                    }
                    if ((viewE1 instanceof LynxView) && (lynxView = (LynxView) viewE1) != null && (viewFindViewByName = lynxView.findViewByName(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null && context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && str2 != null && C1508090pLb.LIZ() == 3) {
                        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
                        PdpEnterAnimModel pdpEnterAnimModel3 = C1766540w4S.LIZ;
                        PdpEnterAnimModel pdpEnterAnimModel4 = (PdpEnterAnimModel) c0c64LJIILLIIL2.LJJII(PdpEnterAnimModel.class, pdpEnterAnimModel3, "pdp_enter_anim", true);
                        if (pdpEnterAnimModel4 != null) {
                            pdpEnterAnimModel3 = pdpEnterAnimModel4;
                        }
                        List<String> list = pdpEnterAnimModel3.scenes;
                        if (list != null && list.contains(str2)) {
                            C1758420vrM.LIZ.put(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, C1607950rwf.LIZLLL(activityLIZ, viewFindViewByName, "ec_pdp"));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pdp router handler error: ");
            sbLIZ.append(th);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
