package com.ss.android.ugc.aweme.ecommerce.base.sku;

import X.C09CT;
import X.C1000703vh;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SelectedSKCInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectedSKCInfo implements Parcelable {

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("checked_spec_ids")
    public final List<String> checkedSpecIds;

    @C09CT("close_type")
    public final Integer closeType;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("post_sku_count")
    public final Integer postSkuCount;

    @C09CT("pre_sku_count")
    public final Integer preSkuCount;

    @C09CT("product_id")
    public final String productId;

    @C09CT("quantity")
    public final Integer quantity;
    public static final C1000703vh Companion = new Object() { // from class: X.03vh
    };
    public static final Parcelable.Creator<SelectedSKCInfo> CREATOR = new Parcelable.Creator<SelectedSKCInfo>() { // from class: X.03vg
        @Override // android.os.Parcelable.Creator
        public final SelectedSKCInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf4 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new SelectedSKCInfo(arrayListCreateStringArrayList, numValueOf, numValueOf2, numValueOf3, string, string2, numValueOf4, (CartEntry) parcel.readParcelable(SelectedSKCInfo.class.getClassLoader()), (ExceptionUX) parcel.readParcelable(SelectedSKCInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedSKCInfo[] newArray(int i) {
            return new SelectedSKCInfo[i];
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
        if (!(obj instanceof SelectedSKCInfo)) {
            return false;
        }
        SelectedSKCInfo selectedSKCInfo = (SelectedSKCInfo) obj;
        return Intrinsics.LJFF(this.checkedSpecIds, selectedSKCInfo.checkedSpecIds) && Intrinsics.LJFF(this.postSkuCount, selectedSKCInfo.postSkuCount) && Intrinsics.LJFF(this.quantity, selectedSKCInfo.quantity) && Intrinsics.LJFF(this.preSkuCount, selectedSKCInfo.preSkuCount) && Intrinsics.LJFF(this.productId, selectedSKCInfo.productId) && Intrinsics.LJFF(this.cartItemId, selectedSKCInfo.cartItemId) && Intrinsics.LJFF(this.closeType, selectedSKCInfo.closeType) && Intrinsics.LJFF(this.cartEntry, selectedSKCInfo.cartEntry) && Intrinsics.LJFF(this.exceptionUX, selectedSKCInfo.exceptionUX);
    }

    public final int hashCode() {
        List<String> list = this.checkedSpecIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.postSkuCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.quantity;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.preSkuCount;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.productId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cartItemId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.closeType;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int iHashCode8 = (iHashCode7 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        return iHashCode8 + (exceptionUX != null ? exceptionUX.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectedSKCInfo(checkedSpecIds=");
        sbLIZ.append(this.checkedSpecIds);
        sbLIZ.append(", postSkuCount=");
        sbLIZ.append(this.postSkuCount);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.quantity);
        sbLIZ.append(", preSkuCount=");
        sbLIZ.append(this.preSkuCount);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", cartItemId=");
        sbLIZ.append(this.cartItemId);
        sbLIZ.append(", closeType=");
        sbLIZ.append(this.closeType);
        sbLIZ.append(", cartEntry=");
        sbLIZ.append(this.cartEntry);
        sbLIZ.append(", exceptionUX=");
        sbLIZ.append(this.exceptionUX);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.checkedSpecIds);
        Integer num = this.postSkuCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.quantity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.preSkuCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.productId);
        parcel.writeString(this.cartItemId);
        Integer num4 = this.closeType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeParcelable(this.cartEntry, i);
        parcel.writeParcelable(this.exceptionUX, i);
    }

    public SelectedSKCInfo(List<String> list, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, CartEntry cartEntry, ExceptionUX exceptionUX) {
        this.checkedSpecIds = list;
        this.postSkuCount = num;
        this.quantity = num2;
        this.preSkuCount = num3;
        this.productId = str;
        this.cartItemId = str2;
        this.closeType = num4;
        this.cartEntry = cartEntry;
        this.exceptionUX = exceptionUX;
    }
}
