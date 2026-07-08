package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.VideoInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoInfo implements Parcelable {

    @C09CT("backup_url")
    public String backupUrl;

    @C09CT("bitrate")
    public Integer bitrate;

    @C09CT("file_hash")
    public String fileHash;

    @C09CT("format")
    public String format;

    @C09CT("height")
    public Integer height;

    @C09CT("main_url")
    public String mainUrl;

    @C09CT("size")
    public Integer size;

    @C09CT("url_expire")
    public Integer urlExpire;

    @C09CT("width")
    public Integer width;
    public static final Parcelable.Creator<VideoInfo> CREATOR = new Parcelable.Creator<VideoInfo>() { // from class: X.02ok
        @Override // android.os.Parcelable.Creator
        public final VideoInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf5 = null;
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
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            return new VideoInfo(string, string2, numValueOf, numValueOf2, numValueOf3, string3, string4, numValueOf4, numValueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInfo[] newArray(int i) {
            return new VideoInfo[i];
        }
    };
    public static final int $stable = 8;

    public VideoInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return Intrinsics.LJFF(this.mainUrl, videoInfo.mainUrl) && Intrinsics.LJFF(this.backupUrl, videoInfo.backupUrl) && Intrinsics.LJFF(this.urlExpire, videoInfo.urlExpire) && Intrinsics.LJFF(this.width, videoInfo.width) && Intrinsics.LJFF(this.height, videoInfo.height) && Intrinsics.LJFF(this.fileHash, videoInfo.fileHash) && Intrinsics.LJFF(this.format, videoInfo.format) && Intrinsics.LJFF(this.size, videoInfo.size) && Intrinsics.LJFF(this.bitrate, videoInfo.bitrate);
    }

    public final int hashCode() {
        String str = this.mainUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backupUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.urlExpire;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.format;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.size;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.bitrate;
        return iHashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoInfo(mainUrl=");
        sbLIZ.append(this.mainUrl);
        sbLIZ.append(", backupUrl=");
        sbLIZ.append(this.backupUrl);
        sbLIZ.append(", urlExpire=");
        sbLIZ.append(this.urlExpire);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
        sbLIZ.append(", format=");
        sbLIZ.append(this.format);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mainUrl);
        parcel.writeString(this.backupUrl);
        Integer num = this.urlExpire;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.height;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.fileHash);
        parcel.writeString(this.format);
        Integer num4 = this.size;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.bitrate;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public VideoInfo(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, Integer num4, Integer num5) {
        this.mainUrl = str;
        this.backupUrl = str2;
        this.urlExpire = num;
        this.width = num2;
        this.height = num3;
        this.fileHash = str3;
        this.format = str4;
        this.size = num4;
        this.bitrate = num5;
    }
}
