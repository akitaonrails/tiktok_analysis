package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1720106oR;
import X.C1949907kP;
import X.C1950707kX;
import X.C2187451AjH;
import X.C2188811AlT;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class BulletinBoardPageAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "bulletin_board";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        if (C1949907kP.LIZ()) {
            map.put("previous_page", "share_reflow_page");
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildInnerUrl: outerUrl:");
            sbLIZ.append(str);
            C1720106oR.LJI("bulletin_board", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("buildInnerUrl: originalQueryMap:");
            sbLIZ2.append(map);
            C1720106oR.LJI("bulletin_board", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("buildInnerUrl: deepLinkData:");
            sbLIZ3.append(c1950707kX);
            C1720106oR.LJI("bulletin_board", C2188811AlT.LIZIZ(sbLIZ3));
            return new Pair<>("aweme://inbox/bulletin_board", map);
        }
        return new Pair<>("//main", map);
    }
}
