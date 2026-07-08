package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class QuantityNoticeInfo implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("desc_rich_text")
    public ECRichText desc;

    @C09CT("desc_text")
    public String descText;

    @C09CT("location")
    public Integer location;

    @C09CT("priority")
    public Integer priority;

    @C09CT("toast_text")
    public String toastText;

    @C09CT("type")
    public Integer type;
    public static final Parcelable.Creator<QuantityNoticeInfo> CREATOR = new Parcelable.Creator<QuantityNoticeInfo>() { // from class: X.02oX
        @Override // android.os.Parcelable.Creator
        public final QuantityNoticeInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(QuantityNoticeInfo.class.getClassLoader());
            Integer numValueOf3 = null;
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
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new QuantityNoticeInfo(string, eCRichText, numValueOf, numValueOf2, string2, numValueOf3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final QuantityNoticeInfo[] newArray(int i) {
            return new QuantityNoticeInfo[i];
        }
    };
    public static final int $stable = 8;

    public QuantityNoticeInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuantityNoticeInfo)) {
            return false;
        }
        QuantityNoticeInfo quantityNoticeInfo = (QuantityNoticeInfo) obj;
        return Intrinsics.LJFF(this.descText, quantityNoticeInfo.descText) && Intrinsics.LJFF(this.desc, quantityNoticeInfo.desc) && Intrinsics.LJFF(this.location, quantityNoticeInfo.location) && Intrinsics.LJFF(this.type, quantityNoticeInfo.type) && Intrinsics.LJFF(this.toastText, quantityNoticeInfo.toastText) && Intrinsics.LJFF(this.priority, quantityNoticeInfo.priority) && Intrinsics.LJFF(this.daInfo, quantityNoticeInfo.daInfo);
    }

    public final int hashCode() {
        String str = this.descText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.desc;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Integer num = this.location;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.type;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.toastText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.priority;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuantityNoticeInfo(descText=");
        sbLIZ.append(this.descText);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", location=");
        sbLIZ.append(this.location);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", toastText=");
        sbLIZ.append(this.toastText);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.descText);
        parcel.writeParcelable(this.desc, i);
        Integer num = this.location;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.toastText);
        Integer num3 = this.priority;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.daInfo);
    }

    public QuantityNoticeInfo(String str, ECRichText eCRichText, Integer num, Integer num2, String str2, Integer num3, String str3) {
        this.descText = str;
        this.desc = eCRichText;
        this.location = num;
        this.type = num2;
        this.toastText = str2;
        this.priority = num3;
        this.daInfo = str3;
    }
}
