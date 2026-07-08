package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MarketingTool;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MarketingTool implements Parcelable {

    @C09CT("country_or_region")
    public String countryOrRegion;

    @C09CT("hide_marketing_amount")
    public Boolean hideMarketingAmount;

    @C09CT("marketing_amount")
    public String marketingAmount;

    @C09CT("marketing_batch_id")
    public String marketingBatchId;

    @C09CT("marketing_batch_type")
    public String marketingBatchType;

    @C09CT("marketing_currency")
    public String marketingCurrency;

    @C09CT("marketing_id")
    public String marketingId;

    @C09CT("marketing_name")
    public String marketingName;

    @C09CT("reduction_type")
    public String reductionType;

    @C09CT("text_selected")
    public String selectedText;

    @C09CT("text")
    public String text;
    public static final Parcelable.Creator<MarketingTool> CREATOR = new Parcelable.Creator<MarketingTool>() { // from class: X.02hP
        @Override // android.os.Parcelable.Creator
        public final MarketingTool createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
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
            return new MarketingTool(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketingTool[] newArray(int i) {
            return new MarketingTool[i];
        }
    };
    public static final int $stable = 8;

    public MarketingTool() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingTool)) {
            return false;
        }
        MarketingTool marketingTool = (MarketingTool) obj;
        return Intrinsics.LJFF(this.marketingId, marketingTool.marketingId) && Intrinsics.LJFF(this.marketingBatchId, marketingTool.marketingBatchId) && Intrinsics.LJFF(this.reductionType, marketingTool.reductionType) && Intrinsics.LJFF(this.marketingName, marketingTool.marketingName) && Intrinsics.LJFF(this.marketingCurrency, marketingTool.marketingCurrency) && Intrinsics.LJFF(this.marketingAmount, marketingTool.marketingAmount) && Intrinsics.LJFF(this.countryOrRegion, marketingTool.countryOrRegion) && Intrinsics.LJFF(this.marketingBatchType, marketingTool.marketingBatchType) && Intrinsics.LJFF(this.text, marketingTool.text) && Intrinsics.LJFF(this.selectedText, marketingTool.selectedText) && Intrinsics.LJFF(this.hideMarketingAmount, marketingTool.hideMarketingAmount);
    }

    public final int hashCode() {
        String str = this.marketingId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketingBatchId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reductionType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketingName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.marketingCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.marketingAmount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.countryOrRegion;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.marketingBatchType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.text;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.selectedText;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.hideMarketingAmount;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "MarketingTool(marketingId=" + this.marketingId + ", marketingBatchId=" + this.marketingBatchId + ", reductionType=" + this.reductionType + ", marketingName=" + this.marketingName + ", marketingCurrency=" + this.marketingCurrency + ", marketingAmount=" + this.marketingAmount + ", countryOrRegion=" + this.countryOrRegion + ", marketingBatchType=" + this.marketingBatchType + ", text=" + this.text + ", selectedText=" + this.selectedText + ", hideMarketingAmount=" + this.hideMarketingAmount + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.marketingId);
        parcel.writeString(this.marketingBatchId);
        parcel.writeString(this.reductionType);
        parcel.writeString(this.marketingName);
        parcel.writeString(this.marketingCurrency);
        parcel.writeString(this.marketingAmount);
        parcel.writeString(this.countryOrRegion);
        parcel.writeString(this.marketingBatchType);
        parcel.writeString(this.text);
        parcel.writeString(this.selectedText);
        Boolean bool = this.hideMarketingAmount;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public MarketingTool(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool) {
        this.marketingId = str;
        this.marketingBatchId = str2;
        this.reductionType = str3;
        this.marketingName = str4;
        this.marketingCurrency = str5;
        this.marketingAmount = str6;
        this.countryOrRegion = str7;
        this.marketingBatchType = str8;
        this.text = str9;
        this.selectedText = str10;
        this.hideMarketingAmount = bool;
    }
}
