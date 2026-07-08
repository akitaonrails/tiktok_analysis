package com.ss.android.ugc.aweme.ecommerce.video.settings;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ECVideoListOperatorWhiteList {
    public static final ECVideoListOperatorWhiteListConfig LIZ = new ECVideoListOperatorWhiteListConfig(new ArrayList());

    public static final class ECVideoListOperatorWhiteListConfig {

        @C09CT("from_white_list")
        public List<String> fromWhiteList;

        public ECVideoListOperatorWhiteListConfig() {
            this(new ArrayList());
        }

        public ECVideoListOperatorWhiteListConfig(List<String> list) {
            this.fromWhiteList = list;
        }
    }
}
