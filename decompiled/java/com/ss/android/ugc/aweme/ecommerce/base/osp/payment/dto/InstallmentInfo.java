package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BnplUpgradeData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.DownpaymentChangedInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentInfo implements Parcelable {

    @C09CT("available_credit")
    public String availableCredit;

    @C09CT("bank_code")
    public String bankCode;

    @C09CT("bank_name")
    public String bankName;

    @C09CT("bnpl_data")
    public BnplUpgradeData bnplUpgradeData;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("disclaimer")
    public String disclaimer;

    @C09CT("display_name")
    public String displayName;

    @C09CT("downpayment_changed_info")
    public DownpaymentChangedInfo downpaymentChangedInfo;

    @C09CT("has_financing")
    public Boolean hasFinancing;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("icon_url_dark")
    public String iconUrlDark;

    @C09CT("installment_disclaimer")
    public String installmentDisclaimer;

    @C09CT("installment_fold_num")
    public Integer installmentFoldNum;

    @C09CT("installment_plans")
    public List<InstallmentPlan> installmentPlans;

    @C09CT("interest_fee_promotion")
    public InterestFeePromotion interestFeePromotion;

    @C09CT("interest_fee_promotion_desc")
    public String interestFeePromotionDesc;

    @C09CT("no_preselect_tenure")
    public Boolean noPreselectTenure;

    @C09CT("order_amount")
    public Amount orderAmount;

    @C09CT("prequalified_installment_plan_id")
    public String prequalifiedInstallmentPlanId;

    @C09CT("promotion_info")
    public PaymentPromotion promotionInfo;
    public static final Parcelable.Creator<InstallmentInfo> CREATOR = new Parcelable.Creator<InstallmentInfo>() { // from class: X.02pa
        @Override // android.os.Parcelable.Creator
        public final InstallmentInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Amount amountCreateFromParcel;
            Integer numValueOf;
            InterestFeePromotion interestFeePromotionCreateFromParcel;
            PaymentPromotion paymentPromotionCreateFromParcel;
            DownpaymentChangedInfo downpaymentChangedInfoCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            BnplUpgradeData bnplUpgradeDataCreateFromParcel;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InstallmentPlan.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                amountCreateFromParcel = null;
            } else {
                amountCreateFromParcel = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount = amountCreateFromParcel;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string8 = parcel.readString();
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
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                downpaymentChangedInfoCreateFromParcel = null;
            } else {
                downpaymentChangedInfoCreateFromParcel = DownpaymentChangedInfo.CREATOR.createFromParcel(parcel);
            }
            DownpaymentChangedInfo downpaymentChangedInfo = downpaymentChangedInfoCreateFromParcel;
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
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                bnplUpgradeDataCreateFromParcel = null;
            } else {
                bnplUpgradeDataCreateFromParcel = BnplUpgradeData.CREATOR.createFromParcel(parcel);
            }
            BnplUpgradeData bnplUpgradeData = bnplUpgradeDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new InstallmentInfo(string, string2, arrayList, amount, string3, string4, string5, string6, string7, numValueOf, string8, interestFeePromotion, paymentPromotion, string9, downpaymentChangedInfo, boolValueOf, string10, string11, bnplUpgradeData, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentInfo[] newArray(int i) {
            return new InstallmentInfo[i];
        }
    };
    public static final int $stable = 8;

    public InstallmentInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentInfo)) {
            return false;
        }
        InstallmentInfo installmentInfo = (InstallmentInfo) obj;
        return Intrinsics.LJFF(this.availableCredit, installmentInfo.availableCredit) && Intrinsics.LJFF(this.disclaimer, installmentInfo.disclaimer) && Intrinsics.LJFF(this.installmentPlans, installmentInfo.installmentPlans) && Intrinsics.LJFF(this.orderAmount, installmentInfo.orderAmount) && Intrinsics.LJFF(this.displayName, installmentInfo.displayName) && Intrinsics.LJFF(this.bankName, installmentInfo.bankName) && Intrinsics.LJFF(this.bankCode, installmentInfo.bankCode) && Intrinsics.LJFF(this.iconUrl, installmentInfo.iconUrl) && Intrinsics.LJFF(this.iconUrlDark, installmentInfo.iconUrlDark) && Intrinsics.LJFF(this.installmentFoldNum, installmentInfo.installmentFoldNum) && Intrinsics.LJFF(this.interestFeePromotionDesc, installmentInfo.interestFeePromotionDesc) && Intrinsics.LJFF(this.interestFeePromotion, installmentInfo.interestFeePromotion) && Intrinsics.LJFF(this.promotionInfo, installmentInfo.promotionInfo) && Intrinsics.LJFF(this.daInfo, installmentInfo.daInfo) && Intrinsics.LJFF(this.downpaymentChangedInfo, installmentInfo.downpaymentChangedInfo) && Intrinsics.LJFF(this.hasFinancing, installmentInfo.hasFinancing) && Intrinsics.LJFF(this.installmentDisclaimer, installmentInfo.installmentDisclaimer) && Intrinsics.LJFF(this.prequalifiedInstallmentPlanId, installmentInfo.prequalifiedInstallmentPlanId) && Intrinsics.LJFF(this.bnplUpgradeData, installmentInfo.bnplUpgradeData) && Intrinsics.LJFF(this.noPreselectTenure, installmentInfo.noPreselectTenure);
    }

    public final int hashCode() {
        String str = this.availableCredit;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.disclaimer;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<InstallmentPlan> list = this.installmentPlans;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Amount amount = this.orderAmount;
        int iHashCode4 = (iHashCode3 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bankCode;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconUrl;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.iconUrlDark;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.installmentFoldNum;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.interestFeePromotionDesc;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        InterestFeePromotion interestFeePromotion = this.interestFeePromotion;
        int iHashCode12 = (iHashCode11 + (interestFeePromotion == null ? 0 : interestFeePromotion.hashCode())) * 31;
        PaymentPromotion paymentPromotion = this.promotionInfo;
        int iHashCode13 = (iHashCode12 + (paymentPromotion == null ? 0 : paymentPromotion.hashCode())) * 31;
        String str9 = this.daInfo;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        DownpaymentChangedInfo downpaymentChangedInfo = this.downpaymentChangedInfo;
        int iHashCode15 = (iHashCode14 + (downpaymentChangedInfo == null ? 0 : downpaymentChangedInfo.hashCode())) * 31;
        Boolean bool = this.hasFinancing;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.installmentDisclaimer;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.prequalifiedInstallmentPlanId;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        BnplUpgradeData bnplUpgradeData = this.bnplUpgradeData;
        int iHashCode19 = (iHashCode18 + (bnplUpgradeData == null ? 0 : bnplUpgradeData.hashCode())) * 31;
        Boolean bool2 = this.noPreselectTenure;
        return iHashCode19 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "InstallmentInfo(availableCredit=" + this.availableCredit + ", disclaimer=" + this.disclaimer + ", installmentPlans=" + this.installmentPlans + ", orderAmount=" + this.orderAmount + ", displayName=" + this.displayName + ", bankName=" + this.bankName + ", bankCode=" + this.bankCode + ", iconUrl=" + this.iconUrl + ", iconUrlDark=" + this.iconUrlDark + ", installmentFoldNum=" + this.installmentFoldNum + ", interestFeePromotionDesc=" + this.interestFeePromotionDesc + ", interestFeePromotion=" + this.interestFeePromotion + ", promotionInfo=" + this.promotionInfo + ", daInfo=" + this.daInfo + ", downpaymentChangedInfo=" + this.downpaymentChangedInfo + ", hasFinancing=" + this.hasFinancing + ", installmentDisclaimer=" + this.installmentDisclaimer + ", prequalifiedInstallmentPlanId=" + this.prequalifiedInstallmentPlanId + ", bnplUpgradeData=" + this.bnplUpgradeData + ", noPreselectTenure=" + this.noPreselectTenure + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.availableCredit);
        parcel.writeString(this.disclaimer);
        List<InstallmentPlan> list = this.installmentPlans;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InstallmentPlan> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Amount amount = this.orderAmount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, i);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.bankName);
        parcel.writeString(this.bankCode);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.iconUrlDark);
        Integer num = this.installmentFoldNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.interestFeePromotionDesc);
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
        parcel.writeString(this.daInfo);
        DownpaymentChangedInfo downpaymentChangedInfo = this.downpaymentChangedInfo;
        if (downpaymentChangedInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            downpaymentChangedInfo.writeToParcel(parcel, i);
        }
        Boolean bool = this.hasFinancing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.installmentDisclaimer);
        parcel.writeString(this.prequalifiedInstallmentPlanId);
        BnplUpgradeData bnplUpgradeData = this.bnplUpgradeData;
        if (bnplUpgradeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bnplUpgradeData.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.noPreselectTenure;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
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

    public static InstallmentInfo LIZIZ(InstallmentInfo installmentInfo) {
        String str = installmentInfo.availableCredit;
        String str2 = installmentInfo.disclaimer;
        List<InstallmentPlan> list = installmentInfo.installmentPlans;
        Amount amount = installmentInfo.orderAmount;
        String str3 = installmentInfo.displayName;
        String str4 = installmentInfo.bankName;
        String str5 = installmentInfo.bankCode;
        String str6 = installmentInfo.iconUrl;
        String str7 = installmentInfo.iconUrlDark;
        Integer num = installmentInfo.installmentFoldNum;
        String str8 = installmentInfo.interestFeePromotionDesc;
        InterestFeePromotion interestFeePromotion = installmentInfo.interestFeePromotion;
        PaymentPromotion paymentPromotion = installmentInfo.promotionInfo;
        String str9 = installmentInfo.daInfo;
        DownpaymentChangedInfo downpaymentChangedInfo = installmentInfo.downpaymentChangedInfo;
        Boolean bool = installmentInfo.hasFinancing;
        String str10 = installmentInfo.installmentDisclaimer;
        String str11 = installmentInfo.prequalifiedInstallmentPlanId;
        BnplUpgradeData bnplUpgradeData = installmentInfo.bnplUpgradeData;
        Boolean bool2 = installmentInfo.noPreselectTenure;
        installmentInfo.getClass();
        return new InstallmentInfo(str, str2, list, amount, str3, str4, str5, str6, str7, num, str8, interestFeePromotion, paymentPromotion, str9, downpaymentChangedInfo, bool, str10, str11, bnplUpgradeData, bool2);
    }

    public InstallmentInfo(String str, String str2, List<InstallmentPlan> list, Amount amount, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, InterestFeePromotion interestFeePromotion, PaymentPromotion paymentPromotion, String str9, DownpaymentChangedInfo downpaymentChangedInfo, Boolean bool, String str10, String str11, BnplUpgradeData bnplUpgradeData, Boolean bool2) {
        this.availableCredit = str;
        this.disclaimer = str2;
        this.installmentPlans = list;
        this.orderAmount = amount;
        this.displayName = str3;
        this.bankName = str4;
        this.bankCode = str5;
        this.iconUrl = str6;
        this.iconUrlDark = str7;
        this.installmentFoldNum = num;
        this.interestFeePromotionDesc = str8;
        this.interestFeePromotion = interestFeePromotion;
        this.promotionInfo = paymentPromotion;
        this.daInfo = str9;
        this.downpaymentChangedInfo = downpaymentChangedInfo;
        this.hasFinancing = bool;
        this.installmentDisclaimer = str10;
        this.prequalifiedInstallmentPlanId = str11;
        this.bnplUpgradeData = bnplUpgradeData;
        this.noPreselectTenure = bool2;
    }
}
