package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEncodeInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageEncodeInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageEncodeInfo> CREATOR = new Parcelable.Creator<ImageEncodeInfo>() { // from class: X.0ngc
        @Override // android.os.Parcelable.Creator
        public final ImageEncodeInfo createFromParcel(Parcel parcel) {
            return new ImageEncodeInfo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageEncodeInfo[] newArray(int i) {
            return new ImageEncodeInfo[i];
        }
    };

    @C09CT("encode_api")
    public String encodeApi;

    @C09CT("encode_color_format")
    public String encodeColorFormat;

    @C09CT("encode_color_space")
    public String encodeColorSpace;

    @C09CT("encode_depth")
    public String encodeDepth;

    @C09CT("encode_quality")
    public int encodeQuality;

    @C09CT("encode_quality_ori")
    public int encodeQualityOri;

    @C09CT("encode_type")
    public String encodeType;

    @C09CT("file_size")
    public long fileSize;

    @C09CT("height")
    public int height;

    @C09CT("isreencode")
    public int isreencode;

    @C09CT("path")
    public String path;

    @C09CT("width")
    public int width;

    public ImageEncodeInfo() {
        this(null, 0, 0, 0L, null, null, null, null, null, 1, 0, 0);
    }

    public final ImageEncodeInfo copy(String str, int i, int i2, long j, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5) {
        return new ImageEncodeInfo(str, i, i2, j, str2, str3, str4, str5, str6, i3, i4, i5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageEncodeInfo)) {
            return false;
        }
        ImageEncodeInfo imageEncodeInfo = (ImageEncodeInfo) obj;
        return Intrinsics.LJFF(this.path, imageEncodeInfo.path) && this.width == imageEncodeInfo.width && this.height == imageEncodeInfo.height && this.fileSize == imageEncodeInfo.fileSize && Intrinsics.LJFF(this.encodeType, imageEncodeInfo.encodeType) && Intrinsics.LJFF(this.encodeDepth, imageEncodeInfo.encodeDepth) && Intrinsics.LJFF(this.encodeColorFormat, imageEncodeInfo.encodeColorFormat) && Intrinsics.LJFF(this.encodeColorSpace, imageEncodeInfo.encodeColorSpace) && Intrinsics.LJFF(this.encodeApi, imageEncodeInfo.encodeApi) && this.isreencode == imageEncodeInfo.isreencode && this.encodeQuality == imageEncodeInfo.encodeQuality && this.encodeQualityOri == imageEncodeInfo.encodeQualityOri;
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Y2(this.fileSize)) * 31;
        String str2 = this.encodeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encodeDepth;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encodeColorFormat;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.encodeColorSpace;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.encodeApi;
        return ((((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.isreencode) * 31) + this.encodeQuality) * 31) + this.encodeQualityOri;
    }

    public String toString() {
        return "ImageEncodeInfo(path=" + this.path + ", width=" + this.width + ", height=" + this.height + ", fileSize=" + this.fileSize + ", encodeType=" + this.encodeType + ", encodeDepth=" + this.encodeDepth + ", encodeColorFormat=" + this.encodeColorFormat + ", encodeColorSpace=" + this.encodeColorSpace + ", encodeApi=" + this.encodeApi + ", isreencode=" + this.isreencode + ", encodeQuality=" + this.encodeQuality + ", encodeQualityOri=" + this.encodeQualityOri + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.fileSize);
        parcel.writeString(this.encodeType);
        parcel.writeString(this.encodeDepth);
        parcel.writeString(this.encodeColorFormat);
        parcel.writeString(this.encodeColorSpace);
        parcel.writeString(this.encodeApi);
        parcel.writeInt(this.isreencode);
        parcel.writeInt(this.encodeQuality);
        parcel.writeInt(this.encodeQualityOri);
    }

    public final String getEncodeApi() {
        return this.encodeApi;
    }

    public final String getEncodeColorFormat() {
        return this.encodeColorFormat;
    }

    public final String getEncodeColorSpace() {
        return this.encodeColorSpace;
    }

    public final String getEncodeDepth() {
        return this.encodeDepth;
    }

    public final int getEncodeQuality() {
        return this.encodeQuality;
    }

    public final int getEncodeQualityOri() {
        return this.encodeQualityOri;
    }

    public final String getEncodeType() {
        return this.encodeType;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getIsreencode() {
        return this.isreencode;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setEncodeApi(String str) {
        this.encodeApi = str;
    }

    public final void setEncodeColorFormat(String str) {
        this.encodeColorFormat = str;
    }

    public final void setEncodeColorSpace(String str) {
        this.encodeColorSpace = str;
    }

    public final void setEncodeDepth(String str) {
        this.encodeDepth = str;
    }

    public final void setEncodeQuality(int i) {
        this.encodeQuality = i;
    }

    public final void setEncodeQualityOri(int i) {
        this.encodeQualityOri = i;
    }

    public final void setEncodeType(String str) {
        this.encodeType = str;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setIsreencode(int i) {
        this.isreencode = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public ImageEncodeInfo(String str, int i, int i2, long j, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.fileSize = j;
        this.encodeType = str2;
        this.encodeDepth = str3;
        this.encodeColorFormat = str4;
        this.encodeColorSpace = str5;
        this.encodeApi = str6;
        this.isreencode = i3;
        this.encodeQuality = i4;
        this.encodeQualityOri = i5;
    }
}
