package com.ss.android.ugc.aweme.ecommerce.base.osp.dto;

import X.C03CX;
import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class InsuranceInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("abnormal_description")
    public String abnormalDescription;

    @C09CT("bill_pre_split_sku_sale_price")
    public String billPreSpiltSkuSalePrice;

    @C09CT("currency")
    public String currency;

    @C09CT("currency_symbol")
    public String currencySymbol;

    @C09CT("description")
    public String description;

    @C09CT("insurance_partner_id")
    public String insurancePartnerId;

    @C09CT("insurance_partner_name")
    public String insurancePartnerName;

    @C09CT("insurance_pay_type")
    public String insurancePayType;

    @C09CT("insurance_premium")
    public Price insurancePremium;

    @C09CT("insurance_premium_before_promotion")
    public Price insurancePremiumBeforePromotion;

    @C09CT("insurance_premium_payment")
    public Price insurancePremiumPayment;

    @C09CT("insurance_price")
    public String insurancePrice;

    @C09CT("insurance_product_id")
    public Long insuranceProductId;

    @C09CT("insurance_product_name")
    public String insuranceProductName;

    @C09CT("insurance_product_name_en")
    public String insuranceProductNameEn;

    @C09CT("insurance_product_name_locale")
    public String insuranceProductNameLocale;

    @C09CT("insurance_protection_code")
    public String insuranceProtectionCode;

    @C09CT("insurance_protection_type")
    public String insuranceProtectionType;

    @C09CT("insurance_selected")
    public Integer insuranceSelected;

    @C09CT("insurance_type")
    public String insuranceType;

    @C09CT("introduce_url")
    public String introduceUrl;

    @C09CT("priority")
    public Integer priority;

    @C09CT("promotion_id")
    public String promotionId;

    @C09CT("protection_priority")
    public Integer protectionPriority;

    @C09CT("toast")
    public ToastContent toast;

    public InsuranceInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final InsuranceInfo copy(String str, String str2, String str3, String str4, String str5, Integer num, Long l, String str6, String str7, Integer num2, String str8, Price price, Price price2, Price price3, String str9, String str10, String str11, String str12, String str13, String str14, Integer num3, String str15, ToastContent toastContent, String str16, String str17) {
        return new InsuranceInfo(str, str2, str3, str4, str5, num, l, str6, str7, num2, str8, price, price2, price3, str9, str10, str11, str12, str13, str14, num3, str15, toastContent, str16, str17);
    }

    public int hashCode() {
        String str = this.insuranceType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.insuranceProtectionCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.insuranceProtectionType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.introduceUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.insuranceProductId;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.insuranceProductName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.insuranceProductNameEn;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.insuranceSelected;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.insuranceProductNameLocale;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Price price = this.insurancePremiumPayment;
        int iHashCode12 = (iHashCode11 + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.insurancePremium;
        int iHashCode13 = (iHashCode12 + (price2 == null ? 0 : price2.hashCode())) * 31;
        Price price3 = this.insurancePremiumBeforePromotion;
        int iHashCode14 = (iHashCode13 + (price3 == null ? 0 : price3.hashCode())) * 31;
        String str9 = this.insurancePrice;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currency;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.insurancePartnerId;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.insurancePartnerName;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.promotionId;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.insurancePayType;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num3 = this.protectionPriority;
        int iHashCode21 = (iHashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str15 = this.abnormalDescription;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        ToastContent toastContent = this.toast;
        int iHashCode23 = (iHashCode22 + (toastContent == null ? 0 : toastContent.hashCode())) * 31;
        String str16 = this.billPreSpiltSkuSalePrice;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.currencySymbol;
        return iHashCode24 + (str17 != null ? str17.hashCode() : 0);
    }

    public String toString() {
        return "InsuranceInfo(insuranceType=" + this.insuranceType + ", insuranceProtectionCode=" + this.insuranceProtectionCode + ", insuranceProtectionType=" + this.insuranceProtectionType + ", description=" + this.description + ", introduceUrl=" + this.introduceUrl + ", priority=" + this.priority + ", insuranceProductId=" + this.insuranceProductId + ", insuranceProductName=" + this.insuranceProductName + ", insuranceProductNameEn=" + this.insuranceProductNameEn + ", insuranceSelected=" + this.insuranceSelected + ", insuranceProductNameLocale=" + this.insuranceProductNameLocale + ", insurancePremiumPayment=" + this.insurancePremiumPayment + ", insurancePremium=" + this.insurancePremium + ", insurancePremiumBeforePromotion=" + this.insurancePremiumBeforePromotion + ", insurancePrice=" + this.insurancePrice + ", currency=" + this.currency + ", insurancePartnerId=" + this.insurancePartnerId + ", insurancePartnerName=" + this.insurancePartnerName + ", promotionId=" + this.promotionId + ", insurancePayType=" + this.insurancePayType + ", protectionPriority=" + this.protectionPriority + ", abnormalDescription=" + this.abnormalDescription + ", toast=" + this.toast + ", billPreSpiltSkuSalePrice=" + this.billPreSpiltSkuSalePrice + ", currencySymbol=" + this.currencySymbol + ')';
    }

    public final boolean checkInsurance() {
        Integer num = this.insuranceSelected;
        int value = C03CX.DEFAULT_SELECTED.getValue();
        if (num == null || num.intValue() != value) {
            return num != null && num.intValue() == C03CX.USER_SELECTED.getValue();
        }
        return true;
    }

    public final boolean hasDefaultSelected() {
        Integer num = this.insuranceSelected;
        return num != null && num.intValue() == C03CX.DEFAULT_SELECTED.getValue();
    }

    public final boolean secondRefreshInsurance() {
        Integer num = this.insuranceSelected;
        int value = C03CX.DEFAULT_SELECTED.getValue();
        if (num != null && num.intValue() == value) {
            return true;
        }
        int value2 = C03CX.USER_SELECTED.getValue();
        if (num == null || num.intValue() != value2) {
            return num != null && num.intValue() == C03CX.INVERT_SELECTED.getValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String selectInsuranceStatus(boolean r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.abnormalDescription
            boolean r0 = X.C703302op.LIZ(r0)
            if (r0 == 0) goto Lf
            com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent r0 = r5.toast
            if (r0 == 0) goto Lf
            java.lang.String r0 = "unavailable"
            return r0
        Lf:
            java.lang.Integer r4 = r5.insuranceSelected
            X.03CX r0 = X.C03CX.DEFAULT_SELECTED
            int r1 = r0.getValue()
            java.lang.String r3 = "selected"
            java.lang.String r2 = "unselected"
            if (r4 == 0) goto L23
            int r0 = r4.intValue()
            if (r0 == r1) goto L31
        L23:
            X.03CX r0 = X.C03CX.USER_SELECTED
            int r1 = r0.getValue()
            if (r4 == 0) goto L34
            int r0 = r4.intValue()
            if (r0 != r1) goto L34
        L31:
            if (r6 == 0) goto L52
        L33:
            return r3
        L34:
            X.03CX r0 = X.C03CX.UNSELECTED
            int r1 = r0.getValue()
            if (r4 == 0) goto L42
            int r0 = r4.intValue()
            if (r0 == r1) goto L50
        L42:
            X.03CX r0 = X.C03CX.INVERT_SELECTED
            int r1 = r0.getValue()
            if (r4 == 0) goto L53
            int r0 = r4.intValue()
            if (r0 != r1) goto L53
        L50:
            if (r6 == 0) goto L33
        L52:
            return r2
        L53:
            java.lang.String r3 = "unknown"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo.selectInsuranceStatus(boolean):java.lang.String");
    }

    public InsuranceInfo(String str, String str2, String str3, String str4, String str5, Integer num, Long l, String str6, String str7, Integer num2, String str8, Price price, Price price2, Price price3, String str9, String str10, String str11, String str12, String str13, String str14, Integer num3, String str15, ToastContent toastContent, String str16, String str17) {
        this.insuranceType = str;
        this.insuranceProtectionCode = str2;
        this.insuranceProtectionType = str3;
        this.description = str4;
        this.introduceUrl = str5;
        this.priority = num;
        this.insuranceProductId = l;
        this.insuranceProductName = str6;
        this.insuranceProductNameEn = str7;
        this.insuranceSelected = num2;
        this.insuranceProductNameLocale = str8;
        this.insurancePremiumPayment = price;
        this.insurancePremium = price2;
        this.insurancePremiumBeforePromotion = price3;
        this.insurancePrice = str9;
        this.currency = str10;
        this.insurancePartnerId = str11;
        this.insurancePartnerName = str12;
        this.promotionId = str13;
        this.insurancePayType = str14;
        this.protectionPriority = num3;
        this.abnormalDescription = str15;
        this.toast = toastContent;
        this.billPreSpiltSkuSalePrice = str16;
        this.currencySymbol = str17;
    }
}
