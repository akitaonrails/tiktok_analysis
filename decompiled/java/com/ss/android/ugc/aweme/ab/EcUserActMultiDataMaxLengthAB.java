package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EcUserActMultiDataMaxLengthAB {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(776));

    public static final class Config {

        @C09CT("live_view_action_product_list")
        public final int liveProductList;

        @C09CT("search_action_query")
        public final int searchActionQuery;

        @C09CT("video_view_action_product_list")
        public final int videoProductList;

        public Config() {
            this(0, 0, 0);
        }

        public Config(int i, int i2, int i3) {
            this.searchActionQuery = i;
            this.liveProductList = i2;
            this.videoProductList = i3;
        }
    }
}
