package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSourceInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageSourceInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageSourceInfo> CREATOR = new Parcelable.Creator<ImageSourceInfo>() { // from class: X.0ngd
        @Override // android.os.Parcelable.Creator
        public final ImageSourceInfo createFromParcel(Parcel parcel) {
            return new ImageSourceInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageSourceInfo[] newArray(int i) {
            return new ImageSourceInfo[i];
        }
    };

    @C09CT("path")
    public String path;

    @C09CT("source_bit_depth")
    public final String sourceBitDepth;

    @C09CT("source_color_format")
    public final String sourceColorFormat;

    @C09CT("source_color_space")
    public final String sourceColorSpace;

    @C09CT("source_degree")
    public final int sourceDegree;

    @C09CT("source_encode_type")
    public final String sourceEncodeType;

    @C09CT("source_file_size")
    public final long sourceFileSize;

    @C09CT("source_height")
    public final int sourceHeight;

    @C09CT("source_width")
    public final int sourceWidth;

    public ImageSourceInfo() {
        this(null, null, 0, 0, null, 0L, null, null, 0);
    }

    public final ImageSourceInfo copy(String str, String str2, int i, int i2, String str3, long j, String str4, String str5, int i3) {
        return new ImageSourceInfo(str, str2, i, i2, str3, j, str4, str5, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSourceInfo)) {
            return false;
        }
        ImageSourceInfo imageSourceInfo = (ImageSourceInfo) obj;
        return Intrinsics.LJFF(this.path, imageSourceInfo.path) && Intrinsics.LJFF(this.sourceBitDepth, imageSourceInfo.sourceBitDepth) && this.sourceWidth == imageSourceInfo.sourceWidth && this.sourceHeight == imageSourceInfo.sourceHeight && Intrinsics.LJFF(this.sourceEncodeType, imageSourceInfo.sourceEncodeType) && this.sourceFileSize == imageSourceInfo.sourceFileSize && Intrinsics.LJFF(this.sourceColorFormat, imageSourceInfo.sourceColorFormat) && Intrinsics.LJFF(this.sourceColorSpace, imageSourceInfo.sourceColorSpace) && this.sourceDegree == imageSourceInfo.sourceDegree;
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceBitDepth;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sourceWidth) * 31) + this.sourceHeight) * 31;
        String str3 = this.sourceEncodeType;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Y2(this.sourceFileSize)) * 31;
        String str4 = this.sourceColorFormat;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sourceColorSpace;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.sourceDegree;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageSourceInfo(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", sourceBitDepth=");
        sbLIZ.append(this.sourceBitDepth);
        sbLIZ.append(", sourceWidth=");
        sbLIZ.append(this.sourceWidth);
        sbLIZ.append(", sourceHeight=");
        sbLIZ.append(this.sourceHeight);
        sbLIZ.append(", sourceEncodeType=");
        sbLIZ.append(this.sourceEncodeType);
        sbLIZ.append(", sourceFileSize=");
        sbLIZ.append(this.sourceFileSize);
        sbLIZ.append(", sourceColorFormat=");
        sbLIZ.append(this.sourceColorFormat);
        sbLIZ.append(", sourceColorSpace=");
        sbLIZ.append(this.sourceColorSpace);
        sbLIZ.append(", sourceDegree=");
        sbLIZ.append(this.sourceDegree);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.sourceBitDepth);
        parcel.writeInt(this.sourceWidth);
        parcel.writeInt(this.sourceHeight);
        parcel.writeString(this.sourceEncodeType);
        parcel.writeLong(this.sourceFileSize);
        parcel.writeString(this.sourceColorFormat);
        parcel.writeString(this.sourceColorSpace);
        parcel.writeInt(this.sourceDegree);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSourceBitDepth() {
        return this.sourceBitDepth;
    }

    public final String getSourceColorFormat() {
        return this.sourceColorFormat;
    }

    public final String getSourceColorSpace() {
        return this.sourceColorSpace;
    }

    public final int getSourceDegree() {
        return this.sourceDegree;
    }

    public final String getSourceEncodeType() {
        return this.sourceEncodeType;
    }

    public final long getSourceFileSize() {
        return this.sourceFileSize;
    }

    public final int getSourceHeight() {
        return this.sourceHeight;
    }

    public final int getSourceWidth() {
        return this.sourceWidth;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public ImageSourceInfo(String str, String str2, int i, int i2, String str3, long j, String str4, String str5, int i3) {
        this.path = str;
        this.sourceBitDepth = str2;
        this.sourceWidth = i;
        this.sourceHeight = i2;
        this.sourceEncodeType = str3;
        this.sourceFileSize = j;
        this.sourceColorFormat = str4;
        this.sourceColorSpace = str5;
        this.sourceDegree = i3;
    }
}
