package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentTenureInterestDetail;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPaymentInstallmentPlan implements Parcelable {

    @C09CT("cci_interest_title")
    public final ECRichText cciInterestTitle;

    @C09CT("interest_has_promotion")
    public final Boolean interestHasPromotion;

    @C09CT("interest_is_free")
    public final Boolean interestIsFree;

    @C09CT("monthly_repayment")
    public final String monthlyRepayment;

    @C09CT("plan_title")
    public final String planTitle;

    @C09CT("tenure")
    public final Integer tenure;

    @C09CT("tenure_interest")
    public final String tenureInterest;

    @C09CT("tenure_interest_actual")
    public final String tenureInterestActual;

    @C09CT("tenure_interest_detail")
    public final SeaPaymentTenureInterestDetail tenureInterestDetail;

    @C09CT("total_interest")
    public final String totalInterest;

    @C09CT("total_interest_actual")
    public final String totalInterestActual;

    @C09CT("total_repayment")
    public final String totalRepayment;

    @C09CT("total_repayment_str")
    public final String totalRepaymentStr;
    public static final Parcelable.Creator<SeaPaymentInstallmentPlan> CREATOR = new Parcelable.Creator<SeaPaymentInstallmentPlan>() { // from class: X.047s
        @Override // android.os.Parcelable.Creator
        public final SeaPaymentInstallmentPlan createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            SeaPaymentTenureInterestDetail seaPaymentTenureInterestDetailCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
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
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                seaPaymentTenureInterestDetailCreateFromParcel = SeaPaymentTenureInterestDetail.CREATOR.createFromParcel(parcel);
            }
            return new SeaPaymentInstallmentPlan(numValueOf, string, boolValueOf, string2, string3, boolValueOf2, string4, string5, string6, string7, string8, seaPaymentTenureInterestDetailCreateFromParcel, (ECRichText) parcel.readParcelable(SeaPaymentInstallmentPlan.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPaymentInstallmentPlan[] newArray(int i) {
            return new SeaPaymentInstallmentPlan[i];
        }
    };
    public static final int $stable = 8;

    public SeaPaymentInstallmentPlan() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPaymentInstallmentPlan)) {
            return false;
        }
        SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = (SeaPaymentInstallmentPlan) obj;
        return Intrinsics.LJFF(this.tenure, seaPaymentInstallmentPlan.tenure) && Intrinsics.LJFF(this.monthlyRepayment, seaPaymentInstallmentPlan.monthlyRepayment) && Intrinsics.LJFF(this.interestIsFree, seaPaymentInstallmentPlan.interestIsFree) && Intrinsics.LJFF(this.totalInterest, seaPaymentInstallmentPlan.totalInterest) && Intrinsics.LJFF(this.totalInterestActual, seaPaymentInstallmentPlan.totalInterestActual) && Intrinsics.LJFF(this.interestHasPromotion, seaPaymentInstallmentPlan.interestHasPromotion) && Intrinsics.LJFF(this.totalRepayment, seaPaymentInstallmentPlan.totalRepayment) && Intrinsics.LJFF(this.totalRepaymentStr, seaPaymentInstallmentPlan.totalRepaymentStr) && Intrinsics.LJFF(this.tenureInterest, seaPaymentInstallmentPlan.tenureInterest) && Intrinsics.LJFF(this.tenureInterestActual, seaPaymentInstallmentPlan.tenureInterestActual) && Intrinsics.LJFF(this.planTitle, seaPaymentInstallmentPlan.planTitle) && Intrinsics.LJFF(this.tenureInterestDetail, seaPaymentInstallmentPlan.tenureInterestDetail) && Intrinsics.LJFF(this.cciInterestTitle, seaPaymentInstallmentPlan.cciInterestTitle);
    }

    public final int hashCode() {
        Integer num = this.tenure;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.monthlyRepayment;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.interestIsFree;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.totalInterest;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalInterestActual;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.interestHasPromotion;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.totalRepayment;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalRepaymentStr;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tenureInterest;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tenureInterestActual;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.planTitle;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        SeaPaymentTenureInterestDetail seaPaymentTenureInterestDetail = this.tenureInterestDetail;
        int iHashCode12 = (iHashCode11 + (seaPaymentTenureInterestDetail == null ? 0 : seaPaymentTenureInterestDetail.hashCode())) * 31;
        ECRichText eCRichText = this.cciInterestTitle;
        return iHashCode12 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        return "SeaPaymentInstallmentPlan(tenure=" + this.tenure + ", monthlyRepayment=" + this.monthlyRepayment + ", interestIsFree=" + this.interestIsFree + ", totalInterest=" + this.totalInterest + ", totalInterestActual=" + this.totalInterestActual + ", interestHasPromotion=" + this.interestHasPromotion + ", totalRepayment=" + this.totalRepayment + ", totalRepaymentStr=" + this.totalRepaymentStr + ", tenureInterest=" + this.tenureInterest + ", tenureInterestActual=" + this.tenureInterestActual + ", planTitle=" + this.planTitle + ", tenureInterestDetail=" + this.tenureInterestDetail + ", cciInterestTitle=" + this.cciInterestTitle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.tenure;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.monthlyRepayment);
        Boolean bool = this.interestIsFree;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.totalInterest);
        parcel.writeString(this.totalInterestActual);
        Boolean bool2 = this.interestHasPromotion;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.totalRepayment);
        parcel.writeString(this.totalRepaymentStr);
        parcel.writeString(this.tenureInterest);
        parcel.writeString(this.tenureInterestActual);
        parcel.writeString(this.planTitle);
        SeaPaymentTenureInterestDetail seaPaymentTenureInterestDetail = this.tenureInterestDetail;
        if (seaPaymentTenureInterestDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPaymentTenureInterestDetail.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.cciInterestTitle, i);
    }

    public SeaPaymentInstallmentPlan(Integer num, String str, Boolean bool, String str2, String str3, Boolean bool2, String str4, String str5, String str6, String str7, String str8, SeaPaymentTenureInterestDetail seaPaymentTenureInterestDetail, ECRichText eCRichText) {
        this.tenure = num;
        this.monthlyRepayment = str;
        this.interestIsFree = bool;
        this.totalInterest = str2;
        this.totalInterestActual = str3;
        this.interestHasPromotion = bool2;
        this.totalRepayment = str4;
        this.totalRepaymentStr = str5;
        this.tenureInterest = str6;
        this.tenureInterestActual = str7;
        this.planTitle = str8;
        this.tenureInterestDetail = seaPaymentTenureInterestDetail;
        this.cciInterestTitle = eCRichText;
    }
}
