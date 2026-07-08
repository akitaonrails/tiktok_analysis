package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POIcon;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RawTextAndIcon {

    @C09CT("billing_address_title")
    public final String billingAddressTitle;

    @C09CT("ccdc_card_expiration_date_invalid")
    public final String ccdcCardDateInvalid;

    @C09CT("ccdc_card_card_expired")
    public final String ccdcCardExpired;

    @C09CT("ccdc_card_form_unsupported")
    public final String ccdcCardFormUnsupported;

    @C09CT("ccdc_card_number_invalid")
    public final String ccdcCardNumInvalid;

    @C09CT("cvv_hint_info")
    public final CVVHintInfo cvvHintInfo;

    @C09CT("discount_amount_display_text")
    public final String discountAmountDisplayText;

    @C09CT("payment_method_title")
    public final String paymentMethodTitle;

    @C09CT("payment_total_items_desc")
    public final String paymentTotalItemsDesc;

    @C09CT("payment_total_pre_price_desc")
    public final String paymentTotalPrePriceDesc;

    @C09CT("payment_total_price_desc")
    public final String paymentTotalPriceDesc;

    @C09CT("save_display_text")
    public final String saveDisplayText;

    @C09CT("security_info")
    public final SecurityInfo securityInfo;

    @C09CT("select_payment_method_title")
    public final String selectOneMethodTitle;

    @C09CT("no_payment_method_tip_text")
    public final String selectPMText;

    @C09CT("show_more_methods_dark_mode_icon_url")
    public final String showMoreMethodsDarkModeIconUrl;

    @C09CT("show_more_methods_icon_list")
    public final List<POIcon> showMoreMethodsIconList;

    @C09CT("show_more_methods_icon_url")
    public final String showMoreMethodsIconUrl;

    @C09CT("show_more_methods_title")
    public final String showMoreMethodsTitle;

    public RawTextAndIcon() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public RawTextAndIcon(String str, String str2, List<POIcon> list, String str3, String str4, String str5, String str6, String str7, String str8, SecurityInfo securityInfo, CVVHintInfo cVVHintInfo, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.paymentMethodTitle = str;
        this.showMoreMethodsTitle = str2;
        this.showMoreMethodsIconList = list;
        this.showMoreMethodsIconUrl = str3;
        this.showMoreMethodsDarkModeIconUrl = str4;
        this.paymentTotalItemsDesc = str5;
        this.paymentTotalPriceDesc = str6;
        this.paymentTotalPrePriceDesc = str7;
        this.discountAmountDisplayText = str8;
        this.securityInfo = securityInfo;
        this.cvvHintInfo = cVVHintInfo;
        this.ccdcCardFormUnsupported = str9;
        this.ccdcCardNumInvalid = str10;
        this.ccdcCardDateInvalid = str11;
        this.ccdcCardExpired = str12;
        this.selectPMText = str13;
        this.selectOneMethodTitle = str14;
        this.billingAddressTitle = str15;
        this.saveDisplayText = str16;
    }
}
