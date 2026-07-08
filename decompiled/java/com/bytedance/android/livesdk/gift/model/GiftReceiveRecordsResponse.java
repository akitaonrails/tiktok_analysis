package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftReceiveRecordsResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("gift_records")
        public List<GiftRecord> giftRecords = new ArrayList();

        @C09CT("has_next")
        public boolean hasNext;

        @C09CT("ref_timestamp")
        public long refTimestamp;

        @C09CT("show_total_diamonds")
        public boolean showTotalDiamonds;

        @C09CT("total_diamonds")
        public long totalDiamonds;
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
