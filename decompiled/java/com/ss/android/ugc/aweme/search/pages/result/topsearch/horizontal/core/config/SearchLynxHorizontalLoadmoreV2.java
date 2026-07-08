package com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLynxHorizontalLoadmoreV2 {
    public static final LoadmoreWhiteList LIZ = new LoadmoreWhiteList(Collections.singletonList("tt_inspire_gallery"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(337));

    public static final class LoadmoreWhiteList {

        @C09CT("loadmore_white_list")
        public final List<String> loadmoreWhiteList;

        public LoadmoreWhiteList(List<String> list) {
            this.loadmoreWhiteList = list;
        }
    }
}
