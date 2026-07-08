package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C098200Yq;
import X.C10Y9;
import X.C189200o6;
import X.C1950707kX;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class EditorProLinkAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "editor_pro_page";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        map.put("is_ep_deeplink", Boolean.TRUE);
        return new Pair<>("//studio/editor_pro", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        if (!C10Y9.LIZJ()) {
            try {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
                smartRouteBuildRoute.withParam("is_ep_deeplink", true);
                smartRouteBuildRoute.open();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
