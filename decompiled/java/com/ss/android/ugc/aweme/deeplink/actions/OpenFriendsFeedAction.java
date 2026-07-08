package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.AbstractC848400XPy;
import X.C0AIC;
import X.C0XQ7;
import X.C13LP;
import X.C15438062q;
import X.C1589640rT8;
import X.C1697810uHb;
import X.C1950707kX;
import X.C2081008Dg;
import X.C2095008Iq;
import X.C259870AGj;
import X.C319860CgK;
import X.EnumC1570580qyO;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenFriendsFeedAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final ArrayList<Integer> LJ() {
        if (C2081008Dg.LIZ()) {
            return C1697810uHb.LJ(67108864, 268435456);
        }
        return null;
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        boolean z;
        String str2;
        String str3;
        List listLJJLIIIJILLIZJL;
        Boolean bool;
        String str4;
        Integer num;
        String str5;
        String str6;
        Object obj = map.get("insert_relation");
        Integer numLJIIJJI = null;
        if ((obj instanceof String) && (str6 = (String) obj) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str6);
        }
        boolean z2 = false;
        if (numLJIIJJI == null || (numLJIIJJI.intValue() != 2 && numLJIIJJI.intValue() != 1) ? !(!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !C1589640rT8.LIZIZ.shouldShowFriendsTab() || (C319860CgK.LIZ() && !((Boolean) C0AIC.LIZ.getValue()).booleanValue())) : !(!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !C1589640rT8.LIZIZ.shouldShowFriendsTab())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj2 = map.get("insert_ids");
            if ((obj2 instanceof String) && (str4 = (String) obj2) != null) {
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str4, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
                Iterator it2 = listLJJLIIIJILLIZJL2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                c1589640rT8.k2(arrayList, false);
                Object obj3 = map.get("insert_relation");
                if ((obj3 instanceof String) && (str5 = (String) obj3) != null) {
                    c1589640rT8.o2(str5, arrayList);
                }
                Object obj4 = map.get("with_filter_code");
                if ((obj4 instanceof Integer) && (num = (Integer) obj4) != null) {
                    if (num.intValue() == 1) {
                        z2 = true;
                    }
                    c1589640rT8.p2(z2);
                }
            }
            Object obj5 = map.get("insert_asc");
            if ((obj5 instanceof Boolean) && (bool = (Boolean) obj5) != null) {
                C1589640rT8.LIZIZ.R2(bool.booleanValue());
            }
            map.put("extra_push_flag", 2);
            if (C2081008Dg.LIZ()) {
                map.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
                if (C1589640rT8.LIZIZ.F2()) {
                    map.put("tab", Integer.valueOf(EnumC1570580qyO.FRIENDS.getValue()));
                }
            } else if (C1589640rT8.LIZIZ.F2()) {
                map.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                map.put("tab", Integer.valueOf(EnumC1570580qyO.FRIENDS.getValue()));
            } else {
                map.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
            }
        } else {
            Object obj6 = map.get("insert_ids");
            if (!(obj6 instanceof String) || (str3 = (String) obj6) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6)) == null || (str2 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL)) == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                map.put(FollowStatusChangeMethod.PARAM_UID, str2);
                return new Pair<>("//aweme/detail", map);
            }
        }
        map.put("enter_method", "push_landing");
        return new Pair<>("//main", map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        if (Intrinsics.LJFF(str, "//aweme/detail") && !C2081008Dg.LIZ() && C319860CgK.LIZ() && ((Boolean) C259870AGj.LIZ.getValue()).booleanValue()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        super.LIZ(context, str, map, arrayList);
        return true;
    }
}
