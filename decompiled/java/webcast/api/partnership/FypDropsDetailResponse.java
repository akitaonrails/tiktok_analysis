package webcast.api.partnership;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class FypDropsDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class DropsTaskGiftBriefInfo {

        @C09CT("gift_name")
        public String giftName = "";

        @C09CT("gift_icon_url")
        public String giftIconUrl = "";
    }

    public static final class ResponseData {

        @C09CT("card_display_task_gift")
        public DropsTaskGiftBriefInfo cardDisplayTaskGift;

        @C09CT("card_show_duration")
        public long cardShowDuration;

        @C09CT("drops_id")
        public String dropsId = "";

        @C09CT("pin_status")
        public int pinStatus;
    }
}
