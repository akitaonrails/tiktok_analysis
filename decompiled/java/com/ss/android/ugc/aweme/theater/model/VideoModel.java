package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.model.VideoModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<VideoModel> CREATOR = new Parcelable.Creator<VideoModel>() { // from class: X.02tn
        @Override // android.os.Parcelable.Creator
        public final VideoModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new VideoModel(lValueOf, numValueOf, string, arrayListCreateStringArrayList, string2, numValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoModel[] newArray(int i) {
            return new VideoModel[i];
        }
    };

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("file_cs")
    public final String fileCs;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final String urlPrefix;

    @C09CT("width")
    public final Integer width;

    public VideoModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final VideoModel copy(Long l, Integer num, String str, List<String> list, String str2, Integer num2, String str3, String str4, String str5) {
        return new VideoModel(l, num, str, list, str2, num2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoModel)) {
            return false;
        }
        VideoModel videoModel = (VideoModel) obj;
        return Intrinsics.LJFF(this.dataSize, videoModel.dataSize) && Intrinsics.LJFF(this.height, videoModel.height) && Intrinsics.LJFF(this.urlKey, videoModel.urlKey) && Intrinsics.LJFF(this.urlList, videoModel.urlList) && Intrinsics.LJFF(this.fileHash, videoModel.fileHash) && Intrinsics.LJFF(this.width, videoModel.width) && Intrinsics.LJFF(this.urlPrefix, videoModel.urlPrefix) && Intrinsics.LJFF(this.fileCs, videoModel.fileCs) && Intrinsics.LJFF(this.uri, videoModel.uri);
    }

    public int hashCode() {
        Long l = this.dataSize;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.urlKey;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.urlList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.fileHash;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.urlPrefix;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileCs;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.uri;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoModel(dataSize=");
        sbLIZ.append(this.dataSize);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", urlKey=");
        sbLIZ.append(this.urlKey);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", urlPrefix=");
        sbLIZ.append(this.urlPrefix);
        sbLIZ.append(", fileCs=");
        sbLIZ.append(this.fileCs);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.dataSize;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.urlKey);
        parcel.writeStringList(this.urlList);
        parcel.writeString(this.fileHash);
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.urlPrefix);
        parcel.writeString(this.fileCs);
        parcel.writeString(this.uri);
    }

    public final Long getDataSize() {
        return this.dataSize;
    }

    public final String getFileCs() {
        return this.fileCs;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrlKey() {
        return this.urlKey;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final String getUrlPrefix() {
        return this.urlPrefix;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public VideoModel(Long l, Integer num, String str, List<String> list, String str2, Integer num2, String str3, String str4, String str5) {
        this.dataSize = l;
        this.height = num;
        this.urlKey = str;
        this.urlList = list;
        this.fileHash = str2;
        this.width = num2;
        this.urlPrefix = str3;
        this.fileCs = str4;
        this.uri = str5;
    }

    public VideoModel(Long l, Integer num, String str, List list, String str2, Integer num2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? 0 : num2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
