package webcast.data.oec_msg;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionWinnerPopup {

    @C09CT("notify_type")
    public int notifyType;

    @C09CT("product_img")
    public ImageModel productImg;

    @C09CT("auction_id")
    public String auctionId = "";

    @C09CT("winner_user_id")
    public String winnerUserId = "";

    @C09CT("product_id")
    public String productId = "";

    @C09CT("payment_expire_timestamp")
    public String paymentExpireTimestamp = "";

    @C09CT("schema")
    public String schema = "";
}
