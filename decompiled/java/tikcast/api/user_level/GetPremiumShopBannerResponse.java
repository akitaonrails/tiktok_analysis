package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes29.dex */
public final class GetPremiumShopBannerResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("activated")
        public boolean activated;

        @C09CT("content_text")
        public Text contentText;

        @C09CT("end_time_ms")
        public long endTimeMs;

        @C09CT("invitation_info")
        public InvitationDetailInfo invitationInfo;

        @C09CT("joined")
        public boolean joined;

        @C09CT("open_time_ms")
        public long openTimeMs;

        @C09CT("premium_gift_info")
        public PremiumShopGiftBannerInfo premiumGiftInfo;

        @C09CT("shop_progress_score")
        public int shopProgressScore;

        @C09CT("shop_id")
        public String shopId = "";

        @C09CT("banner_schema")
        public String bannerSchema = "";
    }
}
