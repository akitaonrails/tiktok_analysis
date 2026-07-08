package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C018G;
import X.C11S5;
import X.C1388190mED;
import X.C1701940uOG;
import X.C19EG;
import X.C515801zg;
import X.C516201zk;
import X.C632140Oqq;
import X.C747640TUk;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidSurveyAPI;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchAidFeedbackAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        int i;
        C19EG c19egLIZIZ;
        Fragment fragment;
        String strLIZIZ = C018G.LIZIZ(str, "search_session_id");
        try {
            i = CastIntegerProtector.parseInt(C018G.LIZIZ(str, "page_type"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = 0;
        }
        String strLIZIZ2 = C018G.LIZIZ(str, "channel");
        String strLIZIZ3 = C018G.LIZIZ(str, "search_aid_issue_name");
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19egLIZIZ);
            dialogC1389620mGW.LJJLJ(2131835638);
            C786410Ut5.J4(dialogC1389620mGW);
            Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
            if (objLJIILLIIL != null) {
                fragment = (Fragment) objLJIILLIIL;
            } else {
                fragment = null;
            }
            SAFHelper.LIZ.getClass();
            C747640TUk c747640TUk = new C747640TUk(dialogC1389620mGW, c19egLIZIZ, strLIZIZ, strLIZIZ2, strLIZIZ3, i, SAFHelper.LJIILJJIL(fragment, c19egLIZIZ));
            AwS413S0200000_12 awS413S0200000_12 = new AwS413S0200000_12(dialogC1389620mGW, c19egLIZIZ, 23);
            C632140Oqq.LIZLLL(((SearchAidSurveyAPI.API) SearchAidSurveyAPI.LIZ.getValue()).LIZ(strLIZIZ, i), "/tiktok/v1/violation/search_aid_survey/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C515801zg(c747640TUk, awS413S0200000_12, 3), new C516201zk(awS413S0200000_12, 12));
        }
        return Boolean.TRUE;
    }
}
