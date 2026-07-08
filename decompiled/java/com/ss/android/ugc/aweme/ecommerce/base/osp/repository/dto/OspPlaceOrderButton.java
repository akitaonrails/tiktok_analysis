package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OspPlaceOrderButton {

    @C09CT("benefit_emphasis_style")
    public Integer benefitEmphasisStyle;

    @C09CT("button_style")
    public PlaceOrderButtonStyle buttonStyle;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("button_text_list")
    public List<ButtonTextInfo> buttonTextList;

    @C09CT("click_action")
    public Integer clickAction;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("disable")
    public Boolean disable;

    @C09CT("disable_toast")
    public String disableToast;

    @C09CT("hide_price_sub_text_savings")
    public Boolean hidePriceSubTextSavings;

    @C09CT("hide_total_price")
    public Boolean hideTotalPrice;

    @C09CT("payment_place_order_button")
    public PaymentPlaceOrderButton paymentPlaceOrderButton;

    @C09CT("place_order_button_by_scene")
    public Map<String, PlaceOrderButtonInfo> placeOrderButtonByScene;

    @C09CT("subtext_area")
    public SubtextArea subtextArea;

    @C09CT("tooltips")
    public ToolTips tooltips;

    public OspPlaceOrderButton() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public OspPlaceOrderButton(Boolean bool, String str, Integer num, SubtextArea subtextArea, ToolTips toolTips, String str2, PlaceOrderButtonStyle placeOrderButtonStyle, String str3, Boolean bool2, Map<String, PlaceOrderButtonInfo> map, List<ButtonTextInfo> list, Boolean bool3, PaymentPlaceOrderButton paymentPlaceOrderButton, Integer num2) {
        this.disable = bool;
        this.disableToast = str;
        this.benefitEmphasisStyle = num;
        this.subtextArea = subtextArea;
        this.tooltips = toolTips;
        this.daInfo = str2;
        this.buttonStyle = placeOrderButtonStyle;
        this.buttonText = str3;
        this.hideTotalPrice = bool2;
        this.placeOrderButtonByScene = map;
        this.buttonTextList = list;
        this.hidePriceSubTextSavings = bool3;
        this.paymentPlaceOrderButton = paymentPlaceOrderButton;
        this.clickAction = num2;
    }
}
