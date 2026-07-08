package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageResizeInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageResizeInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageResizeInfo> CREATOR = new Parcelable.Creator<ImageResizeInfo>() { // from class: X.0nge
        @Override // android.os.Parcelable.Creator
        public final ImageResizeInfo createFromParcel(Parcel parcel) {
            return new ImageResizeInfo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageResizeInfo[] newArray(int i) {
            return new ImageResizeInfo[i];
        }
    };

    @C09CT("resize_decode_type")
    public final String resizeDecodeType;

    @C09CT("resize_format")
    public final String resizeFormat;

    @C09CT("resize_height")
    public final int resizeHeight;

    @C09CT("resize_mode")
    public final String resizeMode;

    @C09CT("resize_width")
    public final int resizeWidth;

    public ImageResizeInfo() {
        this(0, 0, null, null, null);
    }

    public final ImageResizeInfo copy(int i, int i2, String str, String str2, String str3) {
        return new ImageResizeInfo(i, i2, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageResizeInfo)) {
            return false;
        }
        ImageResizeInfo imageResizeInfo = (ImageResizeInfo) obj;
        return this.resizeWidth == imageResizeInfo.resizeWidth && this.resizeHeight == imageResizeInfo.resizeHeight && Intrinsics.LJFF(this.resizeFormat, imageResizeInfo.resizeFormat) && Intrinsics.LJFF(this.resizeDecodeType, imageResizeInfo.resizeDecodeType) && Intrinsics.LJFF(this.resizeMode, imageResizeInfo.resizeMode);
    }

    public int hashCode() {
        int i = ((this.resizeWidth * 31) + this.resizeHeight) * 31;
        String str = this.resizeFormat;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resizeDecodeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resizeMode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageResizeInfo(resizeWidth=");
        sbLIZ.append(this.resizeWidth);
        sbLIZ.append(", resizeHeight=");
        sbLIZ.append(this.resizeHeight);
        sbLIZ.append(", resizeFormat=");
        sbLIZ.append(this.resizeFormat);
        sbLIZ.append(", resizeDecodeType=");
        sbLIZ.append(this.resizeDecodeType);
        sbLIZ.append(", resizeMode=");
        sbLIZ.append(this.resizeMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.resizeWidth);
        parcel.writeInt(this.resizeHeight);
        parcel.writeString(this.resizeFormat);
        parcel.writeString(this.resizeDecodeType);
        parcel.writeString(this.resizeMode);
    }

    public final String getResizeDecodeType() {
        return this.resizeDecodeType;
    }

    public final String getResizeFormat() {
        return this.resizeFormat;
    }

    public final int getResizeHeight() {
        return this.resizeHeight;
    }

    public final String getResizeMode() {
        return this.resizeMode;
    }

    public final int getResizeWidth() {
        return this.resizeWidth;
    }

    public ImageResizeInfo(int i, int i2, String str, String str2, String str3) {
        this.resizeWidth = i;
        this.resizeHeight = i2;
        this.resizeFormat = str;
        this.resizeDecodeType = str2;
        this.resizeMode = str3;
    }
}
