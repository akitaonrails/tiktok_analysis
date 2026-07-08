package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorNoticeBoard;

/* JADX INFO: loaded from: classes29.dex */
public final class GetAnchorSubDataIncomeResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("in_periodic_payout_region")
        public boolean inPeriodicPayoutRegion;

        @C09CT("income_overview")
        public SuperFanIncomeOverview incomeOverview;

        @C09CT("is_anchor_confirm")
        public boolean isAnchorConfirm;

        @C09CT("notice_board")
        public AnchorNoticeBoard noticeBoard;

        @C09CT("total_super_fan_count")
        public long totalSuperFanCount;

        @C09CT("income_list")
        public List<SuperFanDailyData> incomeList = new ArrayList();

        @C09CT("subscriber_list")
        public List<SuperFanDailyData> subscriberList = new ArrayList();
    }
}
