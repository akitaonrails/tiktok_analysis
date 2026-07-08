package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SubscribePeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseMethodItem implements Parcelable {

    @C09CT("collapse_subtitle")
    public final ECRichText collapseSubtitle;

    @C09CT("discount_percentage")
    public final Integer discountPercentage;

    @C09CT("expand_subtitle")
    public final ECRichText expandSubtitle;

    @C09CT("hide_original_price")
    public final Boolean hideOriginalPrice;

    @C09CT("period_info")
    public final SubscribePeriodInfo periodInfo;

    @C09CT("purchase_method_type")
    public final Integer purchaseMethodType;

    @C09CT("title")
    public final ECRichText title;
    public static final Parcelable.Creator<PurchaseMethodItem> CREATOR = new Parcelable.Creator<PurchaseMethodItem>() { // from class: X.040e
        @Override // android.os.Parcelable.Creator
        public final PurchaseMethodItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            SubscribePeriodInfo subscribePeriodInfoCreateFromParcel;
            Integer numValueOf2;
            boolean z;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PurchaseMethodItem.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(PurchaseMethodItem.class.getClassLoader());
            ECRichText eCRichText3 = (ECRichText) parcel.readParcelable(PurchaseMethodItem.class.getClassLoader());
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                subscribePeriodInfoCreateFromParcel = null;
            } else {
                subscribePeriodInfoCreateFromParcel = SubscribePeriodInfo.CREATOR.createFromParcel(parcel);
            }
            SubscribePeriodInfo subscribePeriodInfo = subscribePeriodInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new PurchaseMethodItem(eCRichText, eCRichText2, eCRichText3, numValueOf, subscribePeriodInfo, numValueOf2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PurchaseMethodItem[] newArray(int i) {
            return new PurchaseMethodItem[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseMethodItem)) {
            return false;
        }
        PurchaseMethodItem purchaseMethodItem = (PurchaseMethodItem) obj;
        return Intrinsics.LJFF(this.title, purchaseMethodItem.title) && Intrinsics.LJFF(this.expandSubtitle, purchaseMethodItem.expandSubtitle) && Intrinsics.LJFF(this.collapseSubtitle, purchaseMethodItem.collapseSubtitle) && Intrinsics.LJFF(this.purchaseMethodType, purchaseMethodItem.purchaseMethodType) && Intrinsics.LJFF(this.periodInfo, purchaseMethodItem.periodInfo) && Intrinsics.LJFF(this.discountPercentage, purchaseMethodItem.discountPercentage) && Intrinsics.LJFF(this.hideOriginalPrice, purchaseMethodItem.hideOriginalPrice);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        ECRichText eCRichText = this.expandSubtitle;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.collapseSubtitle;
        int iHashCode3 = (iHashCode2 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Integer num = this.purchaseMethodType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SubscribePeriodInfo subscribePeriodInfo = this.periodInfo;
        int iHashCode5 = (iHashCode4 + (subscribePeriodInfo == null ? 0 : subscribePeriodInfo.hashCode())) * 31;
        Integer num2 = this.discountPercentage;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hideOriginalPrice;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseMethodItem(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", expandSubtitle=");
        sbLIZ.append(this.expandSubtitle);
        sbLIZ.append(", collapseSubtitle=");
        sbLIZ.append(this.collapseSubtitle);
        sbLIZ.append(", purchaseMethodType=");
        sbLIZ.append(this.purchaseMethodType);
        sbLIZ.append(", periodInfo=");
        sbLIZ.append(this.periodInfo);
        sbLIZ.append(", discountPercentage=");
        sbLIZ.append(this.discountPercentage);
        sbLIZ.append(", hideOriginalPrice=");
        sbLIZ.append(this.hideOriginalPrice);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.expandSubtitle, i);
        parcel.writeParcelable(this.collapseSubtitle, i);
        Integer num = this.purchaseMethodType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        SubscribePeriodInfo subscribePeriodInfo = this.periodInfo;
        if (subscribePeriodInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subscribePeriodInfo.writeToParcel(parcel, i);
        }
        Integer num2 = this.discountPercentage;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.hideOriginalPrice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public PurchaseMethodItem(ECRichText eCRichText, ECRichText eCRichText2, ECRichText eCRichText3, Integer num, SubscribePeriodInfo subscribePeriodInfo, Integer num2, Boolean bool) {
        this.title = eCRichText;
        this.expandSubtitle = eCRichText2;
        this.collapseSubtitle = eCRichText3;
        this.purchaseMethodType = num;
        this.periodInfo = subscribePeriodInfo;
        this.discountPercentage = num2;
        this.hideOriginalPrice = bool;
    }
}
