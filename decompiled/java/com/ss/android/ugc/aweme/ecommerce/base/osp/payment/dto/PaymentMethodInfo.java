package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("bank_code")
    public String bankCode;

    @C09CT("bank_name")
    public String bankName;

    @C09CT("consultation_id")
    public String consultationId;

    @C09CT("hide_marketing_amount")
    public final Boolean hideMarketingAmount;

    @C09CT("payment_method_id")
    public final String id;

    @C09CT("installment_option_id")
    public final String installmentOptionId;

    @C09CT("installment_plan")
    public PaymentInstallmentPlan installmentPlan;

    @C09CT("installment_plan_id")
    public String installmentPlanId;

    @C09CT("is_anchored")
    public Boolean isAnchored;

    @C09CT("is_choose_save")
    public Boolean isChooseSave;

    @C09CT("is_one_click_pay")
    public Boolean isOneClickPay;

    @C09CT("is_ocp_reselect")
    public Boolean isOneClickPayReselect;

    @C09CT("payment_elements")
    public List<PaymentElement> paymentElements;

    @C09CT("payment_price_param")
    public String paymentPriceParam;

    @C09CT("tenure")
    public String tenure;

    @C09CT("tenure_cycle")
    public String tenureCycle;

    @C09CT("payment_method_token")
    public final String token;

    public final PaymentMethodInfo copy(String str, String str2, List<PaymentElement> list, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, Boolean bool3, String str7, String str8, PaymentInstallmentPlan paymentInstallmentPlan, Boolean bool4, String str9, String str10, Boolean bool5) {
        return new PaymentMethodInfo(str, str2, list, bool, str3, str4, str5, str6, bool2, bool3, str7, str8, paymentInstallmentPlan, bool4, str9, str10, bool5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodInfo)) {
            return false;
        }
        PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) obj;
        return Intrinsics.LJFF(this.id, paymentMethodInfo.id) && Intrinsics.LJFF(this.token, paymentMethodInfo.token) && Intrinsics.LJFF(this.paymentElements, paymentMethodInfo.paymentElements) && Intrinsics.LJFF(this.isChooseSave, paymentMethodInfo.isChooseSave) && Intrinsics.LJFF(this.tenure, paymentMethodInfo.tenure) && Intrinsics.LJFF(this.installmentPlanId, paymentMethodInfo.installmentPlanId) && Intrinsics.LJFF(this.installmentOptionId, paymentMethodInfo.installmentOptionId) && Intrinsics.LJFF(this.consultationId, paymentMethodInfo.consultationId) && Intrinsics.LJFF(this.isOneClickPay, paymentMethodInfo.isOneClickPay) && Intrinsics.LJFF(this.isOneClickPayReselect, paymentMethodInfo.isOneClickPayReselect) && Intrinsics.LJFF(this.bankCode, paymentMethodInfo.bankCode) && Intrinsics.LJFF(this.bankName, paymentMethodInfo.bankName) && Intrinsics.LJFF(this.installmentPlan, paymentMethodInfo.installmentPlan) && Intrinsics.LJFF(this.hideMarketingAmount, paymentMethodInfo.hideMarketingAmount) && Intrinsics.LJFF(this.tenureCycle, paymentMethodInfo.tenureCycle) && Intrinsics.LJFF(this.paymentPriceParam, paymentMethodInfo.paymentPriceParam) && Intrinsics.LJFF(this.isAnchored, paymentMethodInfo.isAnchored);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PaymentElement> list = this.paymentElements;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isChooseSave;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.tenure;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.installmentPlanId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.installmentOptionId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.consultationId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.isOneClickPay;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOneClickPayReselect;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str7 = this.bankCode;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bankName;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PaymentInstallmentPlan paymentInstallmentPlan = this.installmentPlan;
        int iHashCode13 = (iHashCode12 + (paymentInstallmentPlan == null ? 0 : paymentInstallmentPlan.hashCode())) * 31;
        Boolean bool4 = this.hideMarketingAmount;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str9 = this.tenureCycle;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentPriceParam;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool5 = this.isAnchored;
        return iHashCode16 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodInfo(id=" + this.id + ", token=" + this.token + ", paymentElements=" + this.paymentElements + ", isChooseSave=" + this.isChooseSave + ", tenure=" + this.tenure + ", installmentPlanId=" + this.installmentPlanId + ", installmentOptionId=" + this.installmentOptionId + ", consultationId=" + this.consultationId + ", isOneClickPay=" + this.isOneClickPay + ", isOneClickPayReselect=" + this.isOneClickPayReselect + ", bankCode=" + this.bankCode + ", bankName=" + this.bankName + ", installmentPlan=" + this.installmentPlan + ", hideMarketingAmount=" + this.hideMarketingAmount + ", tenureCycle=" + this.tenureCycle + ", paymentPriceParam=" + this.paymentPriceParam + ", isAnchored=" + this.isAnchored + ')';
    }

    public final Boolean isAnchored() {
        return this.isAnchored;
    }

    public final Boolean isChooseSave() {
        return this.isChooseSave;
    }

    public final Boolean isOneClickPay() {
        return this.isOneClickPay;
    }

    public final Boolean isOneClickPayReselect() {
        return this.isOneClickPayReselect;
    }

    public final void setAnchored(Boolean bool) {
        this.isAnchored = bool;
    }

    public final void setBankCode(String str) {
        this.bankCode = str;
    }

    public final void setBankName(String str) {
        this.bankName = str;
    }

    public final void setChooseSave(Boolean bool) {
        this.isChooseSave = bool;
    }

    public final void setConsultationId(String str) {
        this.consultationId = str;
    }

    public final void setInstallmentPlan(PaymentInstallmentPlan paymentInstallmentPlan) {
        this.installmentPlan = paymentInstallmentPlan;
    }

    public final void setInstallmentPlanId(String str) {
        this.installmentPlanId = str;
    }

    public final void setOneClickPay(Boolean bool) {
        this.isOneClickPay = bool;
    }

    public final void setOneClickPayReselect(Boolean bool) {
        this.isOneClickPayReselect = bool;
    }

    public final void setPaymentElements(List<PaymentElement> list) {
        this.paymentElements = list;
    }

    public final void setPaymentPriceParam(String str) {
        this.paymentPriceParam = str;
    }

    public final void setTenure(String str) {
        this.tenure = str;
    }

    public final void setTenureCycle(String str) {
        this.tenureCycle = str;
    }

    public PaymentMethodInfo(String str, String str2, List<PaymentElement> list, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, Boolean bool3, String str7, String str8, PaymentInstallmentPlan paymentInstallmentPlan, Boolean bool4, String str9, String str10, Boolean bool5) {
        this.id = str;
        this.token = str2;
        this.paymentElements = list;
        this.isChooseSave = bool;
        this.tenure = str3;
        this.installmentPlanId = str4;
        this.installmentOptionId = str5;
        this.consultationId = str6;
        this.isOneClickPay = bool2;
        this.isOneClickPayReselect = bool3;
        this.bankCode = str7;
        this.bankName = str8;
        this.installmentPlan = paymentInstallmentPlan;
        this.hideMarketingAmount = bool4;
        this.tenureCycle = str9;
        this.paymentPriceParam = str10;
        this.isAnchored = bool5;
    }
}
