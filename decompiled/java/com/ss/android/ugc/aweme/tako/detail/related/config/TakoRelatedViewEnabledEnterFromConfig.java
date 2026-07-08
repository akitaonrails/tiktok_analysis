package com.ss.android.ugc.aweme.tako.detail.related.config;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoRelatedViewEnabledEnterFromConfig {
    public static final TakoCommentTopEntranceListModel LIZ = new TakoCommentTopEntranceListModel(C1697810uHb.LJIIJJI("homepage_hot", "general_search"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(143));

    public static final class TakoCommentTopEntranceListModel implements Serializable {

        @C09CT("entrance_list")
        public final List<String> enterFromList;

        public TakoCommentTopEntranceListModel(List<String> list) {
            this.enterFromList = list;
        }
    }

    public static boolean LIZ(String str) {
        List<String> list = ((TakoCommentTopEntranceListModel) LIZIZ.getValue()).enterFromList;
        if (list != null && list.contains(str)) {
            return true;
        }
        return false;
    }
}
