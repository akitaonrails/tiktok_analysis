package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1697810uHb;
import X.C19262710Xp;
import X.C1950707kX;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionBusinessUnifyAction extends AbstractC1950107kR<Unit> {
    public final List<String> LIZLLL = C1697810uHb.LJIIJJI("privilege_page", "settings", "allinone");

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        String str2;
        String strLIZIZ;
        Object obj = map.get("biz_destination_page");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (a0.LJJIIZI(str2, "..", false) || !this.LIZLLL.contains(str2)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sslocal://webcast_subscribe/");
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(strLIZIZ, "")) {
            return new Pair<>("", map);
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(strLIZIZ).buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
        }
        return new Pair<>(builderBuildUpon.build().toString(), map);
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
