package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C19262710Xp;
import X.C1950707kX;
import X.C2187451AjH;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class OutReachAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "outreach";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildInnerUrl: ");
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        return new Pair<>("//outreach", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doRealOpen: ");
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C19262710Xp.LIZ()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
