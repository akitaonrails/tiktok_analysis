package com.ss.android.ugc.aweme.minis.route.deeplink;

import X.AbstractC1950107kR;
import X.C1227904rF;
import X.C1918407fK;
import X.C1950707kX;
import X.C2187451AjH;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.route.MinisTokenRouteAction;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisLinkHandler extends AbstractC1950107kR<Unit> {
    public static final /* synthetic */ int LIZLLL = 0;

    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "minis";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildInnerUrl, outerUrl:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        String string = c1950707kX.LIZLLL.toString();
        if (u.LJJIIJZLJL(string, "http", false)) {
            C1918407fK c1918407fK = MinisTokenRouteAction.Companion;
            Uri uri = c1950707kX.LIZLLL;
            c1918407fK.getClass();
            map.put("minis_token", C1918407fK.LIZ(uri));
            map.put("minis_scene", "applink");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleMinisAppLinkThird, ");
            C1227904rF.LIZ.getClass();
            sbLIZ2.append(C1227904rF.LJI(map));
            C2188811AlT.LIZIZ(sbLIZ2);
            Pair<String, HashMap<String, Object>> pair = new Pair<>("//minis_internal/token", map);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("buildInnerUrl, data:");
            sbLIZ3.append(C1227904rF.LJI(pair));
            C2188811AlT.LIZIZ(sbLIZ3);
            return pair;
        }
        if (u.LJJIIJZLJL(string, "snssdk", false)) {
            String string2 = c1950707kX.LIZLLL.buildUpon().scheme("").clearQuery().build().toString();
            map.put("enter_method", "minis_link");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("buildInnerUrl, convertedInnerUri:");
            sbLIZ4.append(string2);
            C2188811AlT.LIZIZ(sbLIZ4);
            return new Pair<>(string2, map);
        }
        return new Pair<>("//minis", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
