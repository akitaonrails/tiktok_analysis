package webcast.api.pgc_sub;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCTemplateInfo {

    @C09CT("coins")
    public long coins;

    @C09CT("confirmed_price")
    public boolean confirmedPrice;

    @C09CT("create_contract_intent")
    public int createContractIntent;

    @C09CT("is_channel_active")
    public boolean isChannelActive;

    @C09CT("is_default_package")
    public boolean isDefaultPackage;

    @C09CT("offer_info")
    public PGCOfferInfo offerInfo;

    @C09CT("pay_channel")
    public int payChannel;

    @C09CT("renewal_period")
    public int renewalPeriod;

    @C09CT("should_display")
    public boolean shouldDisplay;

    @C09CT("sub_circle")
    public int subCircle;

    @C09CT("tag_info")
    public PGCTagInfo tagInfo;

    @C09CT("tpl_type")
    public int tplType;

    @C09CT("usd_price_amount_micros")
    public long usdPriceAmountMicros;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("iap_id")
    public String iapId = "";

    @C09CT("tpl_name")
    public String tplName = "";

    @C09CT("currency")
    public String currency = "";

    @C09CT("amount")
    public String amount = "";

    @C09CT("money_display")
    public String moneyDisplay = "";

    @C09CT("product_title")
    public String productTitle = "";

    @C09CT("product_desc")
    public String productDesc = "";

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("base_plan_id")
    public String basePlanId = "";

    @C09CT("tax_display")
    public String taxDisplay = "";

    @C09CT("total_money_display")
    public String totalMoneyDisplay = "";

    @C09CT("gst_hst_tax_display")
    public String gstHstTaxDisplay = "";

    @C09CT("pst_qst_tax_display")
    public String pstQstTaxDisplay = "";

    @C09CT("internal_iap_id")
    public String internalIapId = "";

    @C09CT("price_description")
    public String priceDescription = "";

    @C09CT("plan_money_display")
    public String planMoneyDisplay = "";
}
