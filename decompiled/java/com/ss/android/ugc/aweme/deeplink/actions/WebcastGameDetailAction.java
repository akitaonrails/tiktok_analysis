package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class WebcastGameDetailAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        if (u.LJJIIJZLJL(str, "snssdk1233://", false)) {
            str = u.LJJIII(str, "snssdk1233://", "aweme://", false);
        } else if (u.LJJIIJZLJL(str, "snssdk1180://", false)) {
            str = u.LJJIII(str, "snssdk1180://", "aweme://", false);
        }
        return new Pair<>(str, new HashMap());
    }
}
