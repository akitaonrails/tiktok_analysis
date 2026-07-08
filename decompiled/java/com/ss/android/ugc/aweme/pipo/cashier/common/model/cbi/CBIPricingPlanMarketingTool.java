package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPricingPlanMarketingTool;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CBIPricingPlanMarketingTool implements Parcelable {
    public static final Parcelable.Creator<CBIPricingPlanMarketingTool> CREATOR = new Parcelable.Creator<CBIPricingPlanMarketingTool>() { // from class: X.02hQ
        @Override // android.os.Parcelable.Creator
        public final CBIPricingPlanMarketingTool createFromParcel(Parcel parcel) {
            return new CBIPricingPlanMarketingTool(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CBIPricingPlanMarketingTool[] newArray(int i) {
            return new CBIPricingPlanMarketingTool[i];
        }
    };

    @C09CT("marketing_amount")
    public final String marketingAmount;

    @C09CT("batch_id")
    public final String marketingBatchId;

    @C09CT("marketing_currency")
    public final String marketingCurrency;

    @C09CT("marketing_id")
    public final String marketingId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CBIPricingPlanMarketingTool)) {
            return false;
        }
        CBIPricingPlanMarketingTool cBIPricingPlanMarketingTool = (CBIPricingPlanMarketingTool) obj;
        return Intrinsics.LJFF(this.marketingId, cBIPricingPlanMarketingTool.marketingId) && Intrinsics.LJFF(this.marketingBatchId, cBIPricingPlanMarketingTool.marketingBatchId) && Intrinsics.LJFF(this.marketingCurrency, cBIPricingPlanMarketingTool.marketingCurrency) && Intrinsics.LJFF(this.marketingAmount, cBIPricingPlanMarketingTool.marketingAmount);
    }

    public final int hashCode() {
        String str = this.marketingId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketingBatchId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marketingCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketingAmount;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CBIPricingPlanMarketingTool(marketingId=");
        sbLIZ.append(this.marketingId);
        sbLIZ.append(", marketingBatchId=");
        sbLIZ.append(this.marketingBatchId);
        sbLIZ.append(", marketingCurrency=");
        sbLIZ.append(this.marketingCurrency);
        sbLIZ.append(", marketingAmount=");
        sbLIZ.append(this.marketingAmount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.marketingId);
        parcel.writeString(this.marketingBatchId);
        parcel.writeString(this.marketingCurrency);
        parcel.writeString(this.marketingAmount);
    }

    public CBIPricingPlanMarketingTool(String str, String str2, String str3, String str4) {
        this.marketingId = str;
        this.marketingBatchId = str2;
        this.marketingCurrency = str3;
        this.marketingAmount = str4;
    }
}
