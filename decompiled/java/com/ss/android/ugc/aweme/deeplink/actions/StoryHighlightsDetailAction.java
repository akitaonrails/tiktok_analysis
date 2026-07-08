package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C19262710Xp;
import X.C1950707kX;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class StoryHighlightsDetailAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        return new Pair<>("//aweme/detail", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        if (C19262710Xp.LIZ() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            super.LIZ(context, str, map, arrayList);
            return true;
        }
        try {
            SmartRouter.buildRoute(context, "//main").open();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }
}
