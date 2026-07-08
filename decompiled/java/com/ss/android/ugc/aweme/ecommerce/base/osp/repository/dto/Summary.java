package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Summary {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("addon_discount_desc")
    public String addonDiscountDesc;

    @C09CT("bill_items")
    public List<BillItem> billItems;

    @C09CT("bonus_info")
    public BonusInfoForBillSummary bonusInfoForBillSummary;

    @C09CT("checkout_bottom_bar_info")
    public CheckoutBottomBarInfo checkoutBottomBarInfo;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("desc")
    public String desc;

    @C09CT("desc_rich_text")
    public ECRichText descRichText;

    @C09CT("desc_type")
    public Integer descType;

    @C09CT("invisible_params")
    public String invisibleParams;

    @C09CT("membership_module_checkout")
    public MemberShipModule memberShipModule;

    @C09CT("origin")
    public Price origin;

    @C09CT("payment_before_pay_promotion")
    public Price paymentBeforePayPromotion;

    @C09CT("product_tax_desc")
    public String productTaxDesc;

    @C09CT("sku_total_quantity")
    public Integer skuTotalQuantity;

    @C09CT("style")
    public Integer style;

    @C09CT("tips")
    public Integer tips;

    @C09CT("title")
    public String title;

    @C09CT("total")
    public Price total;

    @C09CT("total_bill_item")
    public BillItem totalBillItem;

    @C09CT("total_discount")
    public Price totalDiscount;

    @C09CT("total_discount_benefit_text")
    public String totalDiscountBenefitText;

    @C09CT("total_icon_info")
    public String totalIconInfo;

    @C09CT("total_price_sub_text")
    public PriceSubText totalPriceSubText;

    @C09CT("total_price_sub_text_list")
    public List<PriceSubText> totalPriceSubTextList;

    public Summary() {
    }

    public Summary(List<BillItem> list, Price price, Price price2, String str, String str2, Price price3, Integer num, Integer num2, Price price4, String str3, String str4, BillItem billItem, CheckoutBottomBarInfo checkoutBottomBarInfo, PriceSubText priceSubText, Integer num3, Integer num4, String str5, String str6, String str7, List<PriceSubText> list2, BonusInfoForBillSummary bonusInfoForBillSummary, String str8, MemberShipModule memberShipModule, ECRichText eCRichText) {
        this.billItems = list;
        this.total = price;
        this.totalDiscount = price2;
        this.totalIconInfo = str;
        this.desc = str2;
        this.origin = price3;
        this.tips = num;
        this.skuTotalQuantity = num2;
        this.paymentBeforePayPromotion = price4;
        this.addonDiscountDesc = str3;
        this.productTaxDesc = str4;
        this.totalBillItem = billItem;
        this.checkoutBottomBarInfo = checkoutBottomBarInfo;
        this.totalPriceSubText = priceSubText;
        this.style = num3;
        this.descType = num4;
        this.daInfo = str5;
        this.invisibleParams = str6;
        this.totalDiscountBenefitText = str7;
        this.totalPriceSubTextList = list2;
        this.bonusInfoForBillSummary = bonusInfoForBillSummary;
        this.title = str8;
        this.memberShipModule = memberShipModule;
        this.descRichText = eCRichText;
    }
}
