package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PlayAddress implements Serializable, Parcelable {
    public static final Parcelable.Creator<PlayAddress> CREATOR = new Creator();

    @C09CT("data_size")
    public final Long data_size;

    @C09CT("file_cs")
    public final String file_cs;

    @C09CT("file_hash")
    public final String file_hash;

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_key")
    public final String url_key;

    @C09CT("url_list")
    public final List<String> url_list;

    @C09CT("width")
    public final Integer width;

    public static final class Creator implements Parcelable.Creator<PlayAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlayAddress createFromParcel(Parcel parcel) {
            return new PlayAddress(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlayAddress[] newArray(int i) {
            return new PlayAddress[i];
        }
    }

    public final PlayAddress copy(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4) {
        return new PlayAddress(str, list, l, num, num2, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayAddress)) {
            return false;
        }
        PlayAddress playAddress = (PlayAddress) obj;
        return Intrinsics.LJFF(this.uri, playAddress.uri) && Intrinsics.LJFF(this.url_list, playAddress.url_list) && Intrinsics.LJFF(this.data_size, playAddress.data_size) && Intrinsics.LJFF(this.width, playAddress.width) && Intrinsics.LJFF(this.height, playAddress.height) && Intrinsics.LJFF(this.url_key, playAddress.url_key) && Intrinsics.LJFF(this.file_hash, playAddress.file_hash) && Intrinsics.LJFF(this.file_cs, playAddress.file_cs);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.url_list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.data_size;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.url_key;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.file_hash;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.file_cs;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayAddress(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", url_list=");
        sbLIZ.append(this.url_list);
        sbLIZ.append(", data_size=");
        sbLIZ.append(this.data_size);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", url_key=");
        sbLIZ.append(this.url_key);
        sbLIZ.append(", file_hash=");
        sbLIZ.append(this.file_hash);
        sbLIZ.append(", file_cs=");
        sbLIZ.append(this.file_cs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeStringList(this.url_list);
        Long l = this.data_size;
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
        parcel.writeString(this.url_key);
        parcel.writeString(this.file_hash);
        parcel.writeString(this.file_cs);
    }

    public final Long getData_size() {
        return this.data_size;
    }

    public final String getFile_cs() {
        return this.file_cs;
    }

    public final String getFile_hash() {
        return this.file_hash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrl_key() {
        return this.url_key;
    }

    public final List<String> getUrl_list() {
        return this.url_list;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public PlayAddress(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4) {
        this.uri = str;
        this.url_list = list;
        this.data_size = l;
        this.width = num;
        this.height = num2;
        this.url_key = str2;
        this.file_hash = str3;
        this.file_cs = str4;
    }
}
