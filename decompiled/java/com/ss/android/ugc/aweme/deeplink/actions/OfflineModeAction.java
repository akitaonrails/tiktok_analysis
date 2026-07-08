package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C19262710Xp;
import X.C1950707kX;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class OfflineModeAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        HashMap map2 = new HashMap(map);
        map2.put("video_type", 50);
        map2.put("video_from", "from_offline_mode");
        map2.put("enter_from", "offline_mode_page");
        map2.put("refer", "offline_mode_page");
        if (!map2.containsKey("event_type")) {
            map2.put("event_type", "homepage_hot");
        }
        if (!map2.containsKey("enter_method")) {
            map2.put("enter_method", "click_push");
        }
        return new Pair<>("//aweme/detail", map2);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        if (!C19262710Xp.LIZ()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
