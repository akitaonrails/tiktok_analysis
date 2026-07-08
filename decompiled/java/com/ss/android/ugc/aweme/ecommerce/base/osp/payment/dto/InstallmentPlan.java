package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C098200Yq;
import X.C09CT;
import X.C13LP;
import X.C189200o6;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.DiscountInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MarketingTool;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentPlan implements Parcelable {

    @C09CT("additional_clarification")
    public String additionalClarification;

    @C09CT("apr_description")
    public String aprDescription;

    @C09CT("availability")
    public Availability availability;

    @C09CT("installment_breakdown")
    public InstallmentBreakdown breakdown;

    @C09CT("cci_no_promo_installment_plan")
    public InstallmentPlan cciNoPromoInstallmentPlan;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("display_installment_plan")
    public InstallmentPlan displayInstallmentPlan;

    @C09CT("display_statement")
    public ExtraFeeStatement displayStatement;

    @C09CT("downpayment")
    public Amount downpayment;

    @C09CT("extra_description")
    public String extraDescription;

    @C09CT("hybrid_payment_info")
    public HybridPaymentInfo hybridPaymentInfo;

    @C09CT("installment_plan_id")
    public String id;

    @C09CT("installment_option_id")
    public String installmentOptionId;

    @C09CT("interest_fee_promotion")
    public InterestFeePromotion interestFeePromotion;

    @C09CT("is_default")
    public Boolean isDefault;

    @C09CT("is_recommended")
    public Boolean isRecommend;

    @C09CT("marketing_tool")
    public MarketingTool marketingTool;

    @C09CT("monthly_fee")
    public Amount monthlyFee;

    @C09CT("monthly_fee_rate")
    public Double monthlyFeeRate;

    @C09CT("monthly_repayment")
    public Amount monthlyRepayment;

    @C09CT("payment_methods")
    public List<PaymentMethod> paymentMethods;

    @C09CT("payment_price_version_id")
    public String paymentPriceVersionId;

    @C09CT("payment_service_fee_info")
    public PaymentServiceFeeInfo paymentServiceFeeInfo;

    @C09CT("payment_tips")
    public PaymentTip paymentTip;

    @C09CT("payment_unit_id")
    public String paymentUnitId;

    @C09CT("plan_description")
    public String planDescription;

    @C09CT("promo_text")
    public String promoText;

    @C09CT("promotion_info")
    public PaymentPromotion promotionInfo;

    @C09CT("remain_amount_tips")
    public PaymentTip remainAmountTips;

    @C09CT("remained_amount")
    public Amount remainedAmount;

    @C09CT("ecrich_installment_desc")
    public ECRichText richDesc;

    @C09CT("sign_agreement_link")
    public String signAgreementLink;

    @C09CT("tenure")
    public String tenure;

    @C09CT("tenure_cycle")
    public String tenureCycle;

    @C09CT("total_discount_info")
    public DiscountInfo totalDiscountInfo;

    @C09CT("total_fee")
    public Amount totalFee;

    @C09CT("total_fee_text")
    public String totalFeeText;

    @C09CT("total_repayment")
    public Amount totalRepayment;
    public static final Parcelable.Creator<InstallmentPlan> CREATOR = new Parcelable.Creator<InstallmentPlan>() { // from class: X.02pb
        @Override // android.os.Parcelable.Creator
        public final InstallmentPlan createFromParcel(Parcel parcel) {
            Amount amountCreateFromParcel;
            Amount amountCreateFromParcel2;
            Amount amountCreateFromParcel3;
            Amount amountCreateFromParcel4;
            Double dValueOf;
            DiscountInfo discountInfoCreateFromParcel;
            InstallmentBreakdown installmentBreakdownCreateFromParcel;
            MarketingTool marketingToolCreateFromParcel;
            HybridPaymentInfo hybridPaymentInfoCreateFromParcel;
            InterestFeePromotion interestFeePromotionCreateFromParcel;
            PaymentPromotion paymentPromotionCreateFromParcel;
            InstallmentPlan installmentPlanCreateFromParcel;
            InstallmentPlan installmentPlanCreateFromParcel2;
            Amount amountCreateFromParcel5;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            PaymentTip paymentTipCreateFromParcel;
            ArrayList arrayList;
            Amount amountCreateFromParcel6;
            PaymentTip paymentTipCreateFromParcel2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                amountCreateFromParcel = null;
            } else {
                amountCreateFromParcel = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount = amountCreateFromParcel;
            if (parcel.readInt() == 0) {
                amountCreateFromParcel2 = null;
            } else {
                amountCreateFromParcel2 = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount2 = amountCreateFromParcel2;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                amountCreateFromParcel3 = null;
            } else {
                amountCreateFromParcel3 = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount3 = amountCreateFromParcel3;
            if (parcel.readInt() == 0) {
                amountCreateFromParcel4 = null;
            } else {
                amountCreateFromParcel4 = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount4 = amountCreateFromParcel4;
            if (parcel.readInt() == 0) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(InstallmentPlan.class.getClassLoader());
            if (parcel.readInt() == 0) {
                discountInfoCreateFromParcel = null;
            } else {
                discountInfoCreateFromParcel = DiscountInfo.CREATOR.createFromParcel(parcel);
            }
            DiscountInfo discountInfo = discountInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                installmentBreakdownCreateFromParcel = null;
            } else {
                installmentBreakdownCreateFromParcel = InstallmentBreakdown.CREATOR.createFromParcel(parcel);
            }
            InstallmentBreakdown installmentBreakdown = installmentBreakdownCreateFromParcel;
            if (parcel.readInt() == 0) {
                marketingToolCreateFromParcel = null;
            } else {
                marketingToolCreateFromParcel = MarketingTool.CREATOR.createFromParcel(parcel);
            }
            MarketingTool marketingTool = marketingToolCreateFromParcel;
            if (parcel.readInt() == 0) {
                hybridPaymentInfoCreateFromParcel = null;
            } else {
                hybridPaymentInfoCreateFromParcel = HybridPaymentInfo.CREATOR.createFromParcel(parcel);
            }
            HybridPaymentInfo hybridPaymentInfo = hybridPaymentInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                interestFeePromotionCreateFromParcel = null;
            } else {
                interestFeePromotionCreateFromParcel = InterestFeePromotion.CREATOR.createFromParcel(parcel);
            }
            InterestFeePromotion interestFeePromotion = interestFeePromotionCreateFromParcel;
            if (parcel.readInt() == 0) {
                paymentPromotionCreateFromParcel = null;
            } else {
                paymentPromotionCreateFromParcel = PaymentPromotion.CREATOR.createFromParcel(parcel);
            }
            PaymentPromotion paymentPromotion = paymentPromotionCreateFromParcel;
            if (parcel.readInt() == 0) {
                installmentPlanCreateFromParcel = null;
            } else {
                installmentPlanCreateFromParcel = InstallmentPlan.CREATOR.createFromParcel(parcel);
            }
            InstallmentPlan installmentPlan = installmentPlanCreateFromParcel;
            if (parcel.readInt() == 0) {
                installmentPlanCreateFromParcel2 = null;
            } else {
                installmentPlanCreateFromParcel2 = InstallmentPlan.CREATOR.createFromParcel(parcel);
            }
            InstallmentPlan installmentPlan2 = installmentPlanCreateFromParcel2;
            String string8 = parcel.readString();
            ExtraFeeStatement extraFeeStatement = (ExtraFeeStatement) parcel.readValue(InstallmentPlan.class.getClassLoader());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            PaymentServiceFeeInfo paymentServiceFeeInfo = (PaymentServiceFeeInfo) parcel.readSerializable();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                amountCreateFromParcel5 = null;
            } else {
                amountCreateFromParcel5 = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount5 = amountCreateFromParcel5;
            boolean z2 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            Availability availability = (Availability) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                paymentTipCreateFromParcel = null;
            } else {
                paymentTipCreateFromParcel = PaymentTip.CREATOR.createFromParcel(parcel);
            }
            PaymentTip paymentTip = paymentTipCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readValue(InstallmentPlan.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                amountCreateFromParcel6 = null;
            } else {
                amountCreateFromParcel6 = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount6 = amountCreateFromParcel6;
            if (parcel.readInt() == 0) {
                paymentTipCreateFromParcel2 = null;
            } else {
                paymentTipCreateFromParcel2 = PaymentTip.CREATOR.createFromParcel(parcel);
            }
            return new InstallmentPlan(string, string2, string3, amount, amount2, string4, string5, string6, string7, amount3, amount4, dValueOf, eCRichText, discountInfo, installmentBreakdown, marketingTool, hybridPaymentInfo, interestFeePromotion, paymentPromotion, installmentPlan, installmentPlan2, string8, extraFeeStatement, string9, string10, string11, paymentServiceFeeInfo, string12, string13, amount5, boolValueOf, boolValueOf2, availability, paymentTip, arrayList, amount6, paymentTipCreateFromParcel2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentPlan[] newArray(int i) {
            return new InstallmentPlan[i];
        }
    };
    public static final int $stable = 8;

    public InstallmentPlan() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentPlan)) {
            return false;
        }
        InstallmentPlan installmentPlan = (InstallmentPlan) obj;
        return Intrinsics.LJFF(this.tenure, installmentPlan.tenure) && Intrinsics.LJFF(this.id, installmentPlan.id) && Intrinsics.LJFF(this.installmentOptionId, installmentPlan.installmentOptionId) && Intrinsics.LJFF(this.totalFee, installmentPlan.totalFee) && Intrinsics.LJFF(this.monthlyRepayment, installmentPlan.monthlyRepayment) && Intrinsics.LJFF(this.extraDescription, installmentPlan.extraDescription) && Intrinsics.LJFF(this.promoText, installmentPlan.promoText) && Intrinsics.LJFF(this.planDescription, installmentPlan.planDescription) && Intrinsics.LJFF(this.totalFeeText, installmentPlan.totalFeeText) && Intrinsics.LJFF(this.totalRepayment, installmentPlan.totalRepayment) && Intrinsics.LJFF(this.monthlyFee, installmentPlan.monthlyFee) && Intrinsics.LJFF(this.monthlyFeeRate, installmentPlan.monthlyFeeRate) && Intrinsics.LJFF(this.richDesc, installmentPlan.richDesc) && Intrinsics.LJFF(this.totalDiscountInfo, installmentPlan.totalDiscountInfo) && Intrinsics.LJFF(this.breakdown, installmentPlan.breakdown) && Intrinsics.LJFF(this.marketingTool, installmentPlan.marketingTool) && Intrinsics.LJFF(this.hybridPaymentInfo, installmentPlan.hybridPaymentInfo) && Intrinsics.LJFF(this.interestFeePromotion, installmentPlan.interestFeePromotion) && Intrinsics.LJFF(this.promotionInfo, installmentPlan.promotionInfo) && Intrinsics.LJFF(this.displayInstallmentPlan, installmentPlan.displayInstallmentPlan) && Intrinsics.LJFF(this.cciNoPromoInstallmentPlan, installmentPlan.cciNoPromoInstallmentPlan) && Intrinsics.LJFF(this.tenureCycle, installmentPlan.tenureCycle) && Intrinsics.LJFF(this.displayStatement, installmentPlan.displayStatement) && Intrinsics.LJFF(this.signAgreementLink, installmentPlan.signAgreementLink) && Intrinsics.LJFF(this.paymentPriceVersionId, installmentPlan.paymentPriceVersionId) && Intrinsics.LJFF(this.paymentUnitId, installmentPlan.paymentUnitId) && Intrinsics.LJFF(this.paymentServiceFeeInfo, installmentPlan.paymentServiceFeeInfo) && Intrinsics.LJFF(this.daInfo, installmentPlan.daInfo) && Intrinsics.LJFF(this.aprDescription, installmentPlan.aprDescription) && Intrinsics.LJFF(this.downpayment, installmentPlan.downpayment) && Intrinsics.LJFF(this.isDefault, installmentPlan.isDefault) && Intrinsics.LJFF(this.isRecommend, installmentPlan.isRecommend) && Intrinsics.LJFF(this.availability, installmentPlan.availability) && Intrinsics.LJFF(this.paymentTip, installmentPlan.paymentTip) && Intrinsics.LJFF(this.paymentMethods, installmentPlan.paymentMethods) && Intrinsics.LJFF(this.remainedAmount, installmentPlan.remainedAmount) && Intrinsics.LJFF(this.remainAmountTips, installmentPlan.remainAmountTips) && Intrinsics.LJFF(this.additionalClarification, installmentPlan.additionalClarification);
    }

    public final int hashCode() {
        String str = this.tenure;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.installmentOptionId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Amount amount = this.totalFee;
        int iHashCode4 = (iHashCode3 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.monthlyRepayment;
        int iHashCode5 = (iHashCode4 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        String str4 = this.extraDescription;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promoText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.planDescription;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.totalFeeText;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Amount amount3 = this.totalRepayment;
        int iHashCode10 = (iHashCode9 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        Amount amount4 = this.monthlyFee;
        int iHashCode11 = (iHashCode10 + (amount4 == null ? 0 : amount4.hashCode())) * 31;
        Double d = this.monthlyFeeRate;
        int iHashCode12 = (iHashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        ECRichText eCRichText = this.richDesc;
        int iHashCode13 = (iHashCode12 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        DiscountInfo discountInfo = this.totalDiscountInfo;
        int iHashCode14 = (iHashCode13 + (discountInfo == null ? 0 : discountInfo.hashCode())) * 31;
        InstallmentBreakdown installmentBreakdown = this.breakdown;
        int iHashCode15 = (iHashCode14 + (installmentBreakdown == null ? 0 : installmentBreakdown.hashCode())) * 31;
        MarketingTool marketingTool = this.marketingTool;
        int iHashCode16 = (iHashCode15 + (marketingTool == null ? 0 : marketingTool.hashCode())) * 31;
        HybridPaymentInfo hybridPaymentInfo = this.hybridPaymentInfo;
        int iHashCode17 = (iHashCode16 + (hybridPaymentInfo == null ? 0 : hybridPaymentInfo.hashCode())) * 31;
        InterestFeePromotion interestFeePromotion = this.interestFeePromotion;
        int iHashCode18 = (iHashCode17 + (interestFeePromotion == null ? 0 : interestFeePromotion.hashCode())) * 31;
        PaymentPromotion paymentPromotion = this.promotionInfo;
        int iHashCode19 = (iHashCode18 + (paymentPromotion == null ? 0 : paymentPromotion.hashCode())) * 31;
        InstallmentPlan installmentPlan = this.displayInstallmentPlan;
        int iHashCode20 = (iHashCode19 + (installmentPlan == null ? 0 : installmentPlan.hashCode())) * 31;
        InstallmentPlan installmentPlan2 = this.cciNoPromoInstallmentPlan;
        int iHashCode21 = (iHashCode20 + (installmentPlan2 == null ? 0 : installmentPlan2.hashCode())) * 31;
        String str8 = this.tenureCycle;
        int iHashCode22 = (iHashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ExtraFeeStatement extraFeeStatement = this.displayStatement;
        int iHashCode23 = (iHashCode22 + (extraFeeStatement == null ? 0 : extraFeeStatement.hashCode())) * 31;
        String str9 = this.signAgreementLink;
        int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentPriceVersionId;
        int iHashCode25 = (iHashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.paymentUnitId;
        int iHashCode26 = (iHashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        PaymentServiceFeeInfo paymentServiceFeeInfo = this.paymentServiceFeeInfo;
        int iHashCode27 = (iHashCode26 + (paymentServiceFeeInfo == null ? 0 : paymentServiceFeeInfo.hashCode())) * 31;
        String str12 = this.daInfo;
        int iHashCode28 = (iHashCode27 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.aprDescription;
        int iHashCode29 = (iHashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Amount amount5 = this.downpayment;
        int iHashCode30 = (iHashCode29 + (amount5 == null ? 0 : amount5.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode31 = (iHashCode30 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRecommend;
        int iHashCode32 = (iHashCode31 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Availability availability = this.availability;
        int iHashCode33 = (iHashCode32 + (availability == null ? 0 : availability.hashCode())) * 31;
        PaymentTip paymentTip = this.paymentTip;
        int iHashCode34 = (iHashCode33 + (paymentTip == null ? 0 : paymentTip.hashCode())) * 31;
        List<PaymentMethod> list = this.paymentMethods;
        int iHashCode35 = (iHashCode34 + (list == null ? 0 : list.hashCode())) * 31;
        Amount amount6 = this.remainedAmount;
        int iHashCode36 = (iHashCode35 + (amount6 == null ? 0 : amount6.hashCode())) * 31;
        PaymentTip paymentTip2 = this.remainAmountTips;
        int iHashCode37 = (iHashCode36 + (paymentTip2 == null ? 0 : paymentTip2.hashCode())) * 31;
        String str14 = this.additionalClarification;
        return iHashCode37 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        return "InstallmentPlan(tenure=" + this.tenure + ", id=" + this.id + ", installmentOptionId=" + this.installmentOptionId + ", totalFee=" + this.totalFee + ", monthlyRepayment=" + this.monthlyRepayment + ", extraDescription=" + this.extraDescription + ", promoText=" + this.promoText + ", planDescription=" + this.planDescription + ", totalFeeText=" + this.totalFeeText + ", totalRepayment=" + this.totalRepayment + ", monthlyFee=" + this.monthlyFee + ", monthlyFeeRate=" + this.monthlyFeeRate + ", richDesc=" + this.richDesc + ", totalDiscountInfo=" + this.totalDiscountInfo + ", breakdown=" + this.breakdown + ", marketingTool=" + this.marketingTool + ", hybridPaymentInfo=" + this.hybridPaymentInfo + ", interestFeePromotion=" + this.interestFeePromotion + ", promotionInfo=" + this.promotionInfo + ", displayInstallmentPlan=" + this.displayInstallmentPlan + ", cciNoPromoInstallmentPlan=" + this.cciNoPromoInstallmentPlan + ", tenureCycle=" + this.tenureCycle + ", displayStatement=" + this.displayStatement + ", signAgreementLink=" + this.signAgreementLink + ", paymentPriceVersionId=" + this.paymentPriceVersionId + ", paymentUnitId=" + this.paymentUnitId + ", paymentServiceFeeInfo=" + this.paymentServiceFeeInfo + ", daInfo=" + this.daInfo + ", aprDescription=" + this.aprDescription + ", downpayment=" + this.downpayment + ", isDefault=" + this.isDefault + ", isRecommend=" + this.isRecommend + ", availability=" + this.availability + ", paymentTip=" + this.paymentTip + ", paymentMethods=" + this.paymentMethods + ", remainedAmount=" + this.remainedAmount + ", remainAmountTips=" + this.remainAmountTips + ", additionalClarification=" + this.additionalClarification + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tenure);
        parcel.writeString(this.id);
        parcel.writeString(this.installmentOptionId);
        Amount amount = this.totalFee;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, i);
        }
        Amount amount2 = this.monthlyRepayment;
        if (amount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.extraDescription);
        parcel.writeString(this.promoText);
        parcel.writeString(this.planDescription);
        parcel.writeString(this.totalFeeText);
        Amount amount3 = this.totalRepayment;
        if (amount3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount3.writeToParcel(parcel, i);
        }
        Amount amount4 = this.monthlyFee;
        if (amount4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount4.writeToParcel(parcel, i);
        }
        Double d = this.monthlyFeeRate;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeParcelable(this.richDesc, i);
        DiscountInfo discountInfo = this.totalDiscountInfo;
        if (discountInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discountInfo.writeToParcel(parcel, i);
        }
        InstallmentBreakdown installmentBreakdown = this.breakdown;
        if (installmentBreakdown == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentBreakdown.writeToParcel(parcel, i);
        }
        MarketingTool marketingTool = this.marketingTool;
        if (marketingTool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketingTool.writeToParcel(parcel, i);
        }
        HybridPaymentInfo hybridPaymentInfo = this.hybridPaymentInfo;
        if (hybridPaymentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hybridPaymentInfo.writeToParcel(parcel, i);
        }
        InterestFeePromotion interestFeePromotion = this.interestFeePromotion;
        if (interestFeePromotion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            interestFeePromotion.writeToParcel(parcel, i);
        }
        PaymentPromotion paymentPromotion = this.promotionInfo;
        if (paymentPromotion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentPromotion.writeToParcel(parcel, i);
        }
        InstallmentPlan installmentPlan = this.displayInstallmentPlan;
        if (installmentPlan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentPlan.writeToParcel(parcel, i);
        }
        InstallmentPlan installmentPlan2 = this.cciNoPromoInstallmentPlan;
        if (installmentPlan2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentPlan2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tenureCycle);
        parcel.writeValue(this.displayStatement);
        parcel.writeString(this.signAgreementLink);
        parcel.writeString(this.paymentPriceVersionId);
        parcel.writeString(this.paymentUnitId);
        parcel.writeSerializable(this.paymentServiceFeeInfo);
        parcel.writeString(this.daInfo);
        parcel.writeString(this.aprDescription);
        Amount amount5 = this.downpayment;
        if (amount5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount5.writeToParcel(parcel, i);
        }
        Boolean bool = this.isDefault;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isRecommend;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeSerializable(this.availability);
        PaymentTip paymentTip = this.paymentTip;
        if (paymentTip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentTip.writeToParcel(parcel, i);
        }
        List<PaymentMethod> list = this.paymentMethods;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PaymentMethod> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeValue(it2.next());
            }
        }
        Amount amount6 = this.remainedAmount;
        if (amount6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount6.writeToParcel(parcel, i);
        }
        PaymentTip paymentTip2 = this.remainAmountTips;
        if (paymentTip2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentTip2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.additionalClarification);
    }

    public final Map<String, Object> LIZ() {
        Object obj;
        String str = this.daInfo;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject(this.daInfo);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                    linkedHashMap.put(next, objOpt);
                }
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (Map) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    public final String LIZIZ() {
        ArrayList arrayList = new ArrayList();
        if (this.promotionInfo != null) {
            arrayList.add("instant_discount");
        }
        if (this.interestFeePromotion != null) {
            arrayList.add("interest_fee");
        }
        if (!arrayList.isEmpty()) {
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    public final String LIZJ() {
        InterestFeePromotion interestFeePromotion = this.interestFeePromotion;
        if (interestFeePromotion != null) {
            return interestFeePromotion.desc;
        }
        return null;
    }

    public final boolean LJ() {
        String str;
        PaymentPromotion paymentPromotion = this.promotionInfo;
        String desc = paymentPromotion != null ? paymentPromotion.getDesc() : null;
        if (desc != null && !a0.LJJJIL(desc)) {
            return true;
        }
        InterestFeePromotion interestFeePromotion = this.interestFeePromotion;
        return (interestFeePromotion == null || (str = interestFeePromotion.desc) == null || a0.LJJJIL(str)) ? false : true;
    }

    public final PaymentInstallmentPlan LJFF() {
        DiscountInfo discountInfo = this.totalDiscountInfo;
        if (discountInfo == null) {
            return null;
        }
        String str = discountInfo.discountType;
        String str2 = discountInfo.discountSourceId;
        Amount amount = discountInfo.discountAmount;
        String amount2 = amount != null ? amount.getAmount() : null;
        Amount amount3 = discountInfo.discountAmount;
        return new PaymentInstallmentPlan(new PaymentDiscountInfo(str, str2, amount2, amount3 != null ? amount3.getCurrency() : null));
    }

    public final String LIZLLL(boolean z) {
        PaymentPromotion paymentPromotion = this.promotionInfo;
        if (paymentPromotion != null) {
            if (z) {
                String selectedDescByCondition = paymentPromotion.getSelectedDescByCondition();
                if (selectedDescByCondition == null) {
                    return paymentPromotion.getDescByCondition();
                }
                return selectedDescByCondition;
            }
            return paymentPromotion.getDescByCondition();
        }
        return null;
    }

    public InstallmentPlan(String str, String str2, String str3, Amount amount, Amount amount2, String str4, String str5, String str6, String str7, Amount amount3, Amount amount4, Double d, ECRichText eCRichText, DiscountInfo discountInfo, InstallmentBreakdown installmentBreakdown, MarketingTool marketingTool, HybridPaymentInfo hybridPaymentInfo, InterestFeePromotion interestFeePromotion, PaymentPromotion paymentPromotion, InstallmentPlan installmentPlan, InstallmentPlan installmentPlan2, String str8, ExtraFeeStatement extraFeeStatement, String str9, String str10, String str11, PaymentServiceFeeInfo paymentServiceFeeInfo, String str12, String str13, Amount amount5, Boolean bool, Boolean bool2, Availability availability, PaymentTip paymentTip, List<PaymentMethod> list, Amount amount6, PaymentTip paymentTip2, String str14) {
        this.tenure = str;
        this.id = str2;
        this.installmentOptionId = str3;
        this.totalFee = amount;
        this.monthlyRepayment = amount2;
        this.extraDescription = str4;
        this.promoText = str5;
        this.planDescription = str6;
        this.totalFeeText = str7;
        this.totalRepayment = amount3;
        this.monthlyFee = amount4;
        this.monthlyFeeRate = d;
        this.richDesc = eCRichText;
        this.totalDiscountInfo = discountInfo;
        this.breakdown = installmentBreakdown;
        this.marketingTool = marketingTool;
        this.hybridPaymentInfo = hybridPaymentInfo;
        this.interestFeePromotion = interestFeePromotion;
        this.promotionInfo = paymentPromotion;
        this.displayInstallmentPlan = installmentPlan;
        this.cciNoPromoInstallmentPlan = installmentPlan2;
        this.tenureCycle = str8;
        this.displayStatement = extraFeeStatement;
        this.signAgreementLink = str9;
        this.paymentPriceVersionId = str10;
        this.paymentUnitId = str11;
        this.paymentServiceFeeInfo = paymentServiceFeeInfo;
        this.daInfo = str12;
        this.aprDescription = str13;
        this.downpayment = amount5;
        this.isDefault = bool;
        this.isRecommend = bool2;
        this.availability = availability;
        this.paymentTip = paymentTip;
        this.paymentMethods = list;
        this.remainedAmount = amount6;
        this.remainAmountTips = paymentTip2;
        this.additionalClarification = str14;
    }
}
