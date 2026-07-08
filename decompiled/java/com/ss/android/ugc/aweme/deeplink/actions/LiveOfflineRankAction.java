package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C10Y9;
import X.C1950707kX;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveOfflineRankAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//offline_rank_activity", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        if (!C10Y9.LIZJ()) {
            try {
                SmartRouter.buildRoute(context, "//main").open();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
