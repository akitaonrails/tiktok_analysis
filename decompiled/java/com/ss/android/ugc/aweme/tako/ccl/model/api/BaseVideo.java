package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BaseVideo implements Parcelable {
    public static final Parcelable.Creator<BaseVideo> CREATOR = new Parcelable.Creator<BaseVideo>() { // from class: X.0mfQ
        @Override // android.os.Parcelable.Creator
        public final BaseVideo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Double dValueOf;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Long lValueOf = null;
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
            if (parcel.readInt() == 0) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new BaseVideo(string, arrayListCreateStringArrayList, numValueOf, numValueOf2, string2, dValueOf, string3, string4, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseVideo[] newArray(int i) {
            return new BaseVideo[i];
        }
    };

    @C09CT("duration")
    public final Double duration;

    @C09CT("expire_time")
    public final Long expireTime;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("height")
    public final Integer height;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("vid")
    public final String vid;

    @C09CT("video_model")
    public final String videoModel;

    @C09CT("video_url")
    public final String videoUrl;

    @C09CT("width")
    public final Integer width;

    public BaseVideo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseVideo)) {
            return false;
        }
        BaseVideo baseVideo = (BaseVideo) obj;
        return Intrinsics.LJFF(this.vid, baseVideo.vid) && Intrinsics.LJFF(this.urlList, baseVideo.urlList) && Intrinsics.LJFF(this.width, baseVideo.width) && Intrinsics.LJFF(this.height, baseVideo.height) && Intrinsics.LJFF(this.videoUrl, baseVideo.videoUrl) && Intrinsics.LJFF(this.duration, baseVideo.duration) && Intrinsics.LJFF(this.videoModel, baseVideo.videoModel) && Intrinsics.LJFF(this.fileHash, baseVideo.fileHash) && Intrinsics.LJFF(this.expireTime, baseVideo.expireTime);
    }

    public final int hashCode() {
        int iHashCode = ((this.vid.hashCode() * 31) + this.urlList.hashCode()) * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.videoUrl;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.duration;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.videoModel;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.expireTime;
        return iHashCode7 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseVideo(vid=");
        sbLIZ.append(this.vid);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(this.videoUrl);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", videoModel=");
        sbLIZ.append(this.videoModel);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.vid);
        parcel.writeStringList(this.urlList);
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.videoUrl);
        Double d = this.duration;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.videoModel);
        parcel.writeString(this.fileHash);
        Long l = this.expireTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public BaseVideo(String str, List<String> list, Integer num, Integer num2, String str2, Double d, String str3, String str4, Long l) {
        this.vid = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.videoUrl = str2;
        this.duration = d;
        this.videoModel = str3;
        this.fileHash = str4;
        this.expireTime = l;
    }

    public BaseVideo(String str, List list, Integer num, Integer num2, String str2, Double d, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? 0 : num2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? Double.valueOf(0.0d) : d, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? str4 : "", (i & 256) != 0 ? null : l);
    }
}
