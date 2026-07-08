package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlStruct implements Serializable, Parcelable {
    public static final Parcelable.Creator<UrlStruct> CREATOR = new Creator();

    @C09CT("data_size")
    public Long dataSize;

    @C09CT("file_cs")
    public String fileCs;

    @C09CT("file_hash")
    public String fileHash;

    @C09CT("height")
    public Integer height;

    @C09CT("player_access_key")
    public String playerAccessKey;

    @C09CT("uri")
    public String uri;

    @C09CT("url_key")
    public String urlKey;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public Integer width;

    public static final class Creator implements Parcelable.Creator<UrlStruct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlStruct createFromParcel(Parcel parcel) {
            return new UrlStruct(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlStruct[] newArray(int i) {
            return new UrlStruct[i];
        }
    }

    public UrlStruct() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final UrlStruct copy(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        return new UrlStruct(str, list, l, num, num2, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlStruct)) {
            return false;
        }
        UrlStruct urlStruct = (UrlStruct) obj;
        return Intrinsics.LJFF(this.uri, urlStruct.uri) && Intrinsics.LJFF(this.urlList, urlStruct.urlList) && Intrinsics.LJFF(this.dataSize, urlStruct.dataSize) && Intrinsics.LJFF(this.width, urlStruct.width) && Intrinsics.LJFF(this.height, urlStruct.height) && Intrinsics.LJFF(this.urlKey, urlStruct.urlKey) && Intrinsics.LJFF(this.fileHash, urlStruct.fileHash) && Intrinsics.LJFF(this.fileCs, urlStruct.fileCs) && Intrinsics.LJFF(this.playerAccessKey, urlStruct.playerAccessKey);
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
        String str4 = this.fileCs;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.playerAccessKey;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlStruct(uri=");
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
        sbLIZ.append(", fileCs=");
        sbLIZ.append(this.fileCs);
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
        parcel.writeString(this.fileCs);
        parcel.writeString(this.playerAccessKey);
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

    public UrlStruct(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        this.uri = str;
        this.urlList = list;
        this.dataSize = l;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.fileHash = str3;
        this.fileCs = str4;
        this.playerAccessKey = str5;
    }
}
