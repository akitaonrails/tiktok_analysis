package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenVideoEditAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        map.put("from_deeplink", Boolean.TRUE);
        map.put("type", "normal");
        return new Pair<>("//open_eit_page_handle", map);
    }
}
