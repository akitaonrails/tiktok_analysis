package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BlockPageInfo implements Parcelable {

    @C09CT("block_code")
    public final Integer code;

    @C09CT("first_title")
    public final String firstTitle;

    @C09CT("block_reason")
    public final String message;

    @C09CT("second_title")
    public final String secondTitle;
    public static final Parcelable.Creator<BlockPageInfo> CREATOR = new Parcelable.Creator<BlockPageInfo>() { // from class: X.0vlk
        @Override // android.os.Parcelable.Creator
        public final BlockPageInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BlockPageInfo(numValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BlockPageInfo[] newArray(int i) {
            return new BlockPageInfo[i];
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
        if (!(obj instanceof BlockPageInfo)) {
            return false;
        }
        BlockPageInfo blockPageInfo = (BlockPageInfo) obj;
        return Intrinsics.LJFF(this.code, blockPageInfo.code) && Intrinsics.LJFF(this.message, blockPageInfo.message) && Intrinsics.LJFF(this.firstTitle, blockPageInfo.firstTitle) && Intrinsics.LJFF(this.secondTitle, blockPageInfo.secondTitle);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondTitle;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockPageInfo(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", firstTitle=");
        sbLIZ.append(this.firstTitle);
        sbLIZ.append(", secondTitle=");
        sbLIZ.append(this.secondTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.code;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.message);
        parcel.writeString(this.firstTitle);
        parcel.writeString(this.secondTitle);
    }

    public BlockPageInfo(Integer num, String str, String str2, String str3) {
        this.code = num;
        this.message = str;
        this.firstTitle = str2;
        this.secondTitle = str3;
    }
}
