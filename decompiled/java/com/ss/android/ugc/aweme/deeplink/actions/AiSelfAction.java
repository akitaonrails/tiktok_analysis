package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class AiSelfAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "aiself";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>(str.substring(a0.LJJJ(str, "//aime", 0, false, 6)), map);
    }
}
