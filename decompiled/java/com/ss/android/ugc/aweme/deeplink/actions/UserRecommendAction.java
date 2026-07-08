package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import X.C2097608Jq;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class UserRecommendAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        Object obj = map.get("push_id");
        if (obj == null) {
            obj = "";
        }
        return new Pair<>("//user/profile", C2097608Jq.LJI(new Pair("uid", obj)));
    }
}
