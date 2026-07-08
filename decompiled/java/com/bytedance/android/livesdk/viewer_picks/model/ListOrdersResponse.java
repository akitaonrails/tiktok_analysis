package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class ListOrdersResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("orders")
        public List<ViewerPicksOrder> orders = new ArrayList();

        @C09CT("total")
        public long total;
    }
}
