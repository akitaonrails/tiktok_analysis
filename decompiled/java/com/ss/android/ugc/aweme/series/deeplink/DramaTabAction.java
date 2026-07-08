package com.ss.android.ugc.aweme.series.deeplink;

import X.AbstractC1950107kR;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class DramaTabAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.put("enter_method", "deeplink");
        return new Pair<>("aweme://drama/tab", map2);
    }
}
