package webcast.api.goody_bag;

import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.ParticipateThresholdSelected;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetGoodyBagHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class CoinHistoryItem {

        @C09CT("refunded_coin")
        public int refundedCoin;

        @C09CT("total_coin")
        public int totalCoin;
    }

    public static final class HistoryItem {

        @C09CT("actual_winner_headcount")
        public int actualWinnerHeadcount;

        @C09CT("biz")
        public int biz;

        @C09CT("coin_history_item")
        public CoinHistoryItem coinHistoryItem;

        @C09CT("expect_winner_headcount")
        public int expectWinnerHeadcount;

        @C09CT("goody_bag_id")
        public String goodyBagId = "";

        @C09CT("participate_method")
        public int participateMethod;

        @C09CT("participate_threshold_selected")
        public ParticipateThresholdSelected participateThresholdSelected;

        @C09CT("sent_timestamp_sec")
        public int sentTimestampSec;
    }

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("history")
        public List<HistoryItem> history = new ArrayList();

        @C09CT("next_offset")
        public long nextOffset;
    }
}
