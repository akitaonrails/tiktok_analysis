package com.ss.android.ugc.aweme.deeplink.actions.story;

import X.AbstractC1950107kR;
import X.C01GW;
import X.C1950707kX;
import X.C2188811AlT;
import X.C452501pT;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class CelebrationPushAction extends AbstractC1950107kR<Unit> {
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(381));

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//celebration/create", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        Object obj = map.get("unique_id");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        Object obj3 = map.get("celebration_type");
        if (obj3 != null) {
            obj2 = obj3;
        }
        Object obj4 = map.get("enter_method");
        if (obj4 == null) {
            obj4 = "out_push";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("?unique_id=");
        sbLIZ.append(obj);
        sbLIZ.append("&celebration_type=");
        sbLIZ.append(obj2);
        sbLIZ.append("&enter_method=");
        sbLIZ.append(obj4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        map.put("is_from_celebration_push", Boolean.TRUE);
        super.LIZ(context, strLIZIZ, map, arrayList);
        return true;
    }
}
