package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1697810uHb;
import X.C1950707kX;
import X.C2081008Dg;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenChatPageAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final ArrayList<Integer> LJ() {
        if (C2081008Dg.LIZ()) {
            return C1697810uHb.LJ(67108864, 268435456);
        }
        return null;
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        map.put("tab", 1);
        return new Pair<>("aweme://main", map);
    }
}
