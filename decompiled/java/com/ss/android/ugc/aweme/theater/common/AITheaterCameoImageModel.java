package com.ss.android.ugc.aweme.theater.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoImageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AITheaterCameoImageModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<AITheaterCameoImageModel> CREATOR = new Parcelable.Creator<AITheaterCameoImageModel>() { // from class: X.02yk
        @Override // android.os.Parcelable.Creator
        public final AITheaterCameoImageModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
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
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new AITheaterCameoImageModel(string, arrayListCreateStringArrayList, lValueOf, numValueOf, numValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterCameoImageModel[] newArray(int i) {
            return new AITheaterCameoImageModel[i];
        }
    };

    @C09CT("data_size")
    public final Long dataSize;

    @C09CT("file_cs")
    public final String fileChecksum;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("height")
    public final Integer height;

    @C09CT("player_access_key")
    public final String playerAccessKey;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String urlKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public AITheaterCameoImageModel() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final AITheaterCameoImageModel copy(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        return new AITheaterCameoImageModel(str, list, l, num, num2, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterCameoImageModel)) {
            return false;
        }
        AITheaterCameoImageModel aITheaterCameoImageModel = (AITheaterCameoImageModel) obj;
        return Intrinsics.LJFF(this.uri, aITheaterCameoImageModel.uri) && Intrinsics.LJFF(this.urlList, aITheaterCameoImageModel.urlList) && Intrinsics.LJFF(this.dataSize, aITheaterCameoImageModel.dataSize) && Intrinsics.LJFF(this.width, aITheaterCameoImageModel.width) && Intrinsics.LJFF(this.height, aITheaterCameoImageModel.height) && Intrinsics.LJFF(this.urlKey, aITheaterCameoImageModel.urlKey) && Intrinsics.LJFF(this.fileHash, aITheaterCameoImageModel.fileHash) && Intrinsics.LJFF(this.fileChecksum, aITheaterCameoImageModel.fileChecksum) && Intrinsics.LJFF(this.playerAccessKey, aITheaterCameoImageModel.playerAccessKey);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.dataSize;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.urlKey;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileChecksum;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.playerAccessKey;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCameoImageModel(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", dataSize=");
        sbLIZ.append(this.dataSize);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", urlKey=");
        sbLIZ.append(this.urlKey);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
        sbLIZ.append(", fileChecksum=");
        sbLIZ.append(this.fileChecksum);
        sbLIZ.append(", playerAccessKey=");
        sbLIZ.append(this.playerAccessKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urlList);
        Long l = this.dataSize;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
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
        parcel.writeString(this.urlKey);
        parcel.writeString(this.fileHash);
        parcel.writeString(this.fileChecksum);
        parcel.writeString(this.playerAccessKey);
    }

    public final Long getDataSize() {
        return this.dataSize;
    }

    public final String getFileChecksum() {
        return this.fileChecksum;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getPlayerAccessKey() {
        return this.playerAccessKey;
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

    public final Integer getWidth() {
        return this.width;
    }

    public AITheaterCameoImageModel(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        this.uri = str;
        this.urlList = list;
        this.dataSize = l;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.fileHash = str3;
        this.fileChecksum = str4;
        this.playerAccessKey = str5;
    }
}
