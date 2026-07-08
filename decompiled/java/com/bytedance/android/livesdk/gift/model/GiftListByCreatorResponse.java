package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftListByCreatorResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("activity")
        public GiftActivityCreator activity;

        @C09CT("gifts_info")
        public GiftsInfoByCreator giftsInfo;

        @C09CT("pages")
        public List<GiftPageByCreator> pages = new ArrayList();

        @C09CT("recommendation_activities")
        public List<GiftActivityCreator> recommendationActivities = new ArrayList();
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
