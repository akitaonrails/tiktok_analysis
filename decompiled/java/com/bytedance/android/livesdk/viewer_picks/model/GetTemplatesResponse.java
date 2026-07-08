package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetTemplatesResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("tab_index")
        public long tabIndex;

        @C09CT("combinations")
        public List<Combination> combinations = new ArrayList();

        @C09CT("tabs")
        public List<Tab> tabs = new ArrayList();
    }

    public static final class Tab {

        @C09CT("name")
        public String name = "";

        @C09CT("gifts")
        public List<GiftPickTemplate> gifts = new ArrayList();
    }
}
