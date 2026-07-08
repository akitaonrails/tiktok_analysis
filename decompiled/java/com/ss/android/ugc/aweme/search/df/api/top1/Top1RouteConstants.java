package com.ss.android.ugc.aweme.search.df.api.top1;

import X.C1697810uHb;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class Top1RouteConstants {
    public static final Top1RouteConstants INSTANCE = new Top1RouteConstants();
    public static final List<String> ALL_PREFIXES = C1697810uHb.LJIIJJI("//search/search_pov_landing_page", "aweme://search/entity_card/landing", "aweme://search/review_aggregation/landing");

    public static final boolean isTop1Schema(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        List<String> list = ALL_PREFIXES;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
