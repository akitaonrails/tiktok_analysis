package webcast.data.oec_msg;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CommerceInfo {

    @C09CT("auction_info")
    public AuctionInfo auctionInfo;

    @C09CT("pop_card_info")
    public PopCardInfo popCardInfo;

    @C09CT("popup_window_info")
    public PopupWindowInfo popupWindowInfo;

    @C09CT("product_info")
    public Map<Long, ProductItem> productInfo = new LinkedHashMap();

    @C09CT("voucher_info")
    public Map<Long, VoucherItem> voucherInfo = new LinkedHashMap();
}
