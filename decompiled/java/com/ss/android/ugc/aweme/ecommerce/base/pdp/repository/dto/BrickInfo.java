package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C04GA;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BrickInfo implements Parcelable {
    public static final int $stable = 0;

    @C09CT("brick_biz_data")
    public final String brickBizData;

    @C09CT("brick_biz_extra")
    public final String brickBizExtra;

    @C09CT("brick_lynx_schema")
    public final String brickLynxSchema;

    @C09CT("brick_name")
    public final int brickName;

    @C09CT("brick_option")
    public final Integer brickOption;

    @C09CT("brick_style")
    public final BrickStyle brickStyle;

    @C09CT("brick_type")
    public final Integer brickType;

    @C09CT("brick_version")
    public final String brickVersion;
    public static final C04GA Companion = new Object() { // from class: X.04GA
    };
    public static final Parcelable.Creator<BrickInfo> CREATOR = new Parcelable.Creator<BrickInfo>() { // from class: X.03zY
        @Override // android.os.Parcelable.Creator
        public final BrickInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            BrickStyle brickStyleCreateFromParcel = null;
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
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                brickStyleCreateFromParcel = BrickStyle.CREATOR.createFromParcel(parcel);
            }
            return new BrickInfo(string, string2, string3, i, numValueOf, numValueOf2, string4, brickStyleCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BrickInfo[] newArray(int i) {
            return new BrickInfo[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrickInfo)) {
            return false;
        }
        BrickInfo brickInfo = (BrickInfo) obj;
        return Intrinsics.LJFF(this.brickBizData, brickInfo.brickBizData) && Intrinsics.LJFF(this.brickBizExtra, brickInfo.brickBizExtra) && Intrinsics.LJFF(this.brickLynxSchema, brickInfo.brickLynxSchema) && this.brickName == brickInfo.brickName && Intrinsics.LJFF(this.brickOption, brickInfo.brickOption) && Intrinsics.LJFF(this.brickType, brickInfo.brickType) && Intrinsics.LJFF(this.brickVersion, brickInfo.brickVersion) && Intrinsics.LJFF(this.brickStyle, brickInfo.brickStyle);
    }

    public final int hashCode() {
        String str = this.brickBizData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brickBizExtra;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brickLynxSchema;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.brickName) * 31;
        Integer num = this.brickOption;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.brickType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.brickVersion;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BrickStyle brickStyle = this.brickStyle;
        return iHashCode6 + (brickStyle != null ? brickStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrickInfo(brickBizData=");
        sbLIZ.append(this.brickBizData);
        sbLIZ.append(", brickBizExtra=");
        sbLIZ.append(this.brickBizExtra);
        sbLIZ.append(", brickLynxSchema=");
        sbLIZ.append(this.brickLynxSchema);
        sbLIZ.append(", brickName=");
        sbLIZ.append(this.brickName);
        sbLIZ.append(", brickOption=");
        sbLIZ.append(this.brickOption);
        sbLIZ.append(", brickType=");
        sbLIZ.append(this.brickType);
        sbLIZ.append(", brickVersion=");
        sbLIZ.append(this.brickVersion);
        sbLIZ.append(", brickStyle=");
        sbLIZ.append(this.brickStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.brickBizData);
        parcel.writeString(this.brickBizExtra);
        parcel.writeString(this.brickLynxSchema);
        parcel.writeInt(this.brickName);
        Integer num = this.brickOption;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.brickType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.brickVersion);
        BrickStyle brickStyle = this.brickStyle;
        if (brickStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            brickStyle.writeToParcel(parcel, i);
        }
    }

    public BrickInfo(String str, String str2, String str3, int i, Integer num, Integer num2, String str4, BrickStyle brickStyle) {
        this.brickBizData = str;
        this.brickBizExtra = str2;
        this.brickLynxSchema = str3;
        this.brickName = i;
        this.brickOption = num;
        this.brickType = num2;
        this.brickVersion = str4;
        this.brickStyle = brickStyle;
    }
}
