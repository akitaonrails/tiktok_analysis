package com.ss.android.ugc.aweme.infoSticker.customsticker.model;

import X.C01GW;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import java.util.HashMap;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CustomStickerInfo implements Parcelable {
    public static final Parcelable.Creator<CustomStickerInfo> CREATOR = new Parcelable.Creator<CustomStickerInfo>() { // from class: X.0LvV
        @Override // android.os.Parcelable.Creator
        public final CustomStickerInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CustomStickerInfo(string, string2, i, i2, z, (AIGCInfo) parcel.readParcelable(CustomStickerInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CustomStickerInfo[] newArray(int i) {
            return new CustomStickerInfo[i];
        }
    };
    public final AIGCInfo aigcInfo;
    public final boolean cutout;
    public final int height;
    public final C01GW map$delegate;
    public final String path;
    public final String stickerId;
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStickerInfo)) {
            return false;
        }
        CustomStickerInfo customStickerInfo = (CustomStickerInfo) obj;
        return Intrinsics.LJFF(this.stickerId, customStickerInfo.stickerId) && Intrinsics.LJFF(this.path, customStickerInfo.path) && this.width == customStickerInfo.width && this.height == customStickerInfo.height && this.cutout == customStickerInfo.cutout && Intrinsics.LJFF(this.aigcInfo, customStickerInfo.aigcInfo);
    }

    public final int hashCode() {
        String str = this.stickerId;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.path.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Z2(this.cutout)) * 31;
        AIGCInfo aIGCInfo = this.aigcInfo;
        return iHashCode + (aIGCInfo != null ? aIGCInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomStickerInfo(stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", cutout=");
        sbLIZ.append(this.cutout);
        sbLIZ.append(", aigcInfo=");
        sbLIZ.append(this.aigcInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.cutout ? 1 : 0);
        parcel.writeParcelable(this.aigcInfo, i);
    }

    public final HashMap<String, String> LIZ() {
        return (HashMap) this.map$delegate.getValue();
    }

    public /* synthetic */ CustomStickerInfo(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, true, null);
    }

    public CustomStickerInfo(String str, String str2, int i, int i2, boolean z, AIGCInfo aIGCInfo) {
        this.stickerId = str;
        this.path = str2;
        this.width = i;
        this.height = i2;
        this.cutout = z;
        this.aigcInfo = aIGCInfo;
        this.map$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 147));
    }
}
