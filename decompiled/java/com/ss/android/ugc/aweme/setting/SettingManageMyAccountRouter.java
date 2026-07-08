package com.ss.android.ugc.aweme.setting;

import X.C11S5;
import X.C123100dR;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C312940COm;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC313170CPj;
import Y.AfS0S0000100_4;
import Y.AfS140S0200000_4;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import java.net.URI;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingManageMyAccountRouter implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String strLIZIZ;
        boolean zLJI = MethodIDManager.LJI(202140);
        if (context == null) {
            Boolean bool = Boolean.TRUE;
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return bool;
        }
        String query = new URI(str).getQuery();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("//account/setting/self");
        if (C123100dR.LIZ(query)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('?');
            sbLIZ2.append(query);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        C786410Ut5.J4(dialogC1389620mGW);
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC313170CPj.LIZ.getClass();
        C312940COm.LIZIZ.getDoBStatus().LJL(C11S5.LIZ()).LJJIJIIJIL(new AfS0S0000100_4(jCurrentTimeMillis, 6)).LJJIJIIJI(new AfS0S0000100_4(jCurrentTimeMillis, 7)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS140S0200000_4(smartRouteBuildRoute, dialogC1389620mGW, 0), new AfS140S0200000_4(smartRouteBuildRoute, dialogC1389620mGW, 1));
        Boolean bool2 = Boolean.TRUE;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return bool2;
    }
}
