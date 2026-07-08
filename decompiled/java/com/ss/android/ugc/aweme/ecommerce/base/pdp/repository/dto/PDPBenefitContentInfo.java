package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitContentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PDPBenefitContentInfo implements Parcelable {

    @C09CT("btm")
    public final String btm;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("delay_show_second")
    public final Integer delayShowSecond;

    @C09CT("description")
    public final String desc;

    @C09CT("dynamic_duration_second")
    public final Integer dynamicDurationSecond;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<PDPBenefitContentInfo> CREATOR = new Parcelable.Creator<PDPBenefitContentInfo>() { // from class: X.0mgh
        @Override // android.os.Parcelable.Creator
        public final PDPBenefitContentInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Icon icon = (Icon) parcel.readParcelable(PDPBenefitContentInfo.class.getClassLoader());
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new PDPBenefitContentInfo(icon, string, numValueOf, numValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPBenefitContentInfo[] newArray(int i) {
            return new PDPBenefitContentInfo[i];
        }
    };
    public static final int $stable = 8;

    public PDPBenefitContentInfo() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPBenefitContentInfo)) {
            return false;
        }
        PDPBenefitContentInfo pDPBenefitContentInfo = (PDPBenefitContentInfo) obj;
        return Intrinsics.LJFF(this.icon, pDPBenefitContentInfo.icon) && Intrinsics.LJFF(this.desc, pDPBenefitContentInfo.desc) && Intrinsics.LJFF(this.delayShowSecond, pDPBenefitContentInfo.delayShowSecond) && Intrinsics.LJFF(this.dynamicDurationSecond, pDPBenefitContentInfo.dynamicDurationSecond) && Intrinsics.LJFF(this.schema, pDPBenefitContentInfo.schema) && Intrinsics.LJFF(this.btm, pDPBenefitContentInfo.btm) && Intrinsics.LJFF(this.daInfo, pDPBenefitContentInfo.daInfo);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.delayShowSecond;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dynamicDurationSecond;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.schema;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btm;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPBenefitContentInfo(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", delayShowSecond=");
        sbLIZ.append(this.delayShowSecond);
        sbLIZ.append(", dynamicDurationSecond=");
        sbLIZ.append(this.dynamicDurationSecond);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.btm);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.desc);
        Integer num = this.delayShowSecond;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.dynamicDurationSecond;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.schema);
        parcel.writeString(this.btm);
        parcel.writeString(this.daInfo);
    }

    public PDPBenefitContentInfo(Icon icon, String str, Integer num, Integer num2, String str2, String str3, String str4) {
        this.icon = icon;
        this.desc = str;
        this.delayShowSecond = num;
        this.dynamicDurationSecond = num2;
        this.schema = str2;
        this.btm = str3;
        this.daInfo = str4;
    }
}
