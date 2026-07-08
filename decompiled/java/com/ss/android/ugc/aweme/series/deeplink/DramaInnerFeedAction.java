package com.ss.android.ugc.aweme.series.deeplink;

import X.AbstractC1950107kR;
import X.C1950707kX;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class DramaInnerFeedAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        Object objRemove = map2.remove(FollowStatusChangeMethod.PARAM_UID);
        if (objRemove == null) {
            objRemove = "";
        }
        map2.put("collection_id", objRemove);
        map2.put("series_category", "MINI_DRAMA");
        map2.put("enter_from", "deeplink");
        map2.put("enter_method", "deep_link");
        return new Pair<>("aweme://paidcontent/innerfeed", map2);
    }
}
