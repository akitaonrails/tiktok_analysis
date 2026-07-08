package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterestItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomBtnInterestItem implements Parcelable {

    @C09CT("placeholder_keys")
    public final List<String> placeholderKeys;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;
    public static final Parcelable.Creator<SeaPdpBottomBtnInterestItem> CREATOR = new Parcelable.Creator<SeaPdpBottomBtnInterestItem>() { // from class: X.048o
        @Override // android.os.Parcelable.Creator
        public final SeaPdpBottomBtnInterestItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SeaPdpBottomBtnInterestItem(numValueOf, parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpBottomBtnInterestItem[] newArray(int i) {
            return new SeaPdpBottomBtnInterestItem[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpBottomBtnInterestItem() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBtnInterestItem)) {
            return false;
        }
        SeaPdpBottomBtnInterestItem seaPdpBottomBtnInterestItem = (SeaPdpBottomBtnInterestItem) obj;
        return Intrinsics.LJFF(this.type, seaPdpBottomBtnInterestItem.type) && Intrinsics.LJFF(this.text, seaPdpBottomBtnInterestItem.text) && Intrinsics.LJFF(this.placeholderKeys, seaPdpBottomBtnInterestItem.placeholderKeys);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.placeholderKeys;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBtnInterestItem(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", placeholderKeys=");
        sbLIZ.append(this.placeholderKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.text);
        parcel.writeStringList(this.placeholderKeys);
    }

    public SeaPdpBottomBtnInterestItem(Integer num, String str, List<String> list) {
        this.type = num;
        this.text = str;
        this.placeholderKeys = list;
    }
}
