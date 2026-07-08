package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C09JN;
import X.C11S5;
import X.C1701940uOG;
import X.C1950707kX;
import X.C312940COm;
import X.InterfaceC313170CPj;
import Y.AfS0S0000100_4;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountSettingAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "page_account_settings";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//account/setting/self", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(final Context context, final String str, final HashMap<String, Object> map, final ArrayList<Integer> arrayList) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC313170CPj.LIZ.getClass();
        C312940COm.LIZIZ.getDoBStatus().LJL(C11S5.LIZ()).LJJIJIIJIL(new AfS0S0000100_4(jCurrentTimeMillis, 2)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0CQe
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AccountSettingAction@cdcf.doRealOpen$2");
                linkedHashMap.put("dob_status", obj);
                super/*X.07ka*/.LIZ(context, str, new HashMap(C2097608Jq.LJIIL(map, linkedHashMap)), arrayList);
                C1C7U.LIZIZ("AccountSettingAction@cdcf.doRealOpen$2");
            }
        }, new C09JN() { // from class: X.0CQd
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AccountSettingAction@cdcf.doRealOpen$3");
                super/*X.07ka*/.LIZ(context, str, map, arrayList);
                C1C7U.LIZIZ("AccountSettingAction@cdcf.doRealOpen$3");
            }
        });
        return true;
    }
}
