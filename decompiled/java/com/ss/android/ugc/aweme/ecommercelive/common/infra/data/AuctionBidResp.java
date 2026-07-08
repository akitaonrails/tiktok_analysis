package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public final class AuctionBidResp {

    @C09CT("address_payment_schema")
    public final String addressPaymentSchema;

    @C09CT("auction_agreement")
    public final Map<String, Object> auctionAgreement;

    @C09CT("auction_data")
    public final AuctionData auctionData;

    @C09CT("need_otp")
    public final Boolean needOtp;

    @C09CT("need_show_address_payment_schema")
    public final Boolean needShowAddressPaymentSchema;

    @C09CT("need_show_auction_agreement")
    public final Boolean needShowAuctionAgreement;

    @C09CT("price_validation_text")
    public final String priceValidationText;

    @C09CT("verify_info")
    public final String verifyInfo;

    public AuctionBidResp() {
        this(null, null, null, Boolean.FALSE, null, null, null, null);
    }

    public AuctionBidResp(AuctionData auctionData, String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3, Map<String, ? extends Object> map) {
        this.auctionData = auctionData;
        this.priceValidationText = str;
        this.verifyInfo = str2;
        this.needOtp = bool;
        this.needShowAddressPaymentSchema = bool2;
        this.addressPaymentSchema = str3;
        this.needShowAuctionAgreement = bool3;
        this.auctionAgreement = map;
    }
}
