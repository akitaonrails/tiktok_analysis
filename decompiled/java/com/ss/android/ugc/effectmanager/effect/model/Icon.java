package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class Icon implements Serializable, Parcelable {
    public static final Parcelable.Creator<Icon> CREATOR = new Creator();

    @C09CT("file_size")
    public final String file_size;

    @C09CT("file_type")
    public final String file_type;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> url_list;

    public static final class Creator implements Parcelable.Creator<Icon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Icon createFromParcel(Parcel parcel) {
            return new Icon(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Icon[] newArray(int i) {
            return new Icon[i];
        }
    }

    public final Icon copy(String str, String str2, String str3, List<String> list) {
        return new Icon(str, str2, str3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return Intrinsics.LJFF(this.uri, icon.uri) && Intrinsics.LJFF(this.file_size, icon.file_size) && Intrinsics.LJFF(this.file_type, icon.file_type) && Intrinsics.LJFF(this.url_list, icon.url_list);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.file_size;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.file_type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.url_list;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Icon(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", file_size=");
        sbLIZ.append(this.file_size);
        sbLIZ.append(", file_type=");
        sbLIZ.append(this.file_type);
        sbLIZ.append(", url_list=");
        sbLIZ.append(this.url_list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.file_size);
        parcel.writeString(this.file_type);
        parcel.writeStringList(this.url_list);
    }

    public final String getFile_size() {
        return this.file_size;
    }

    public final String getFile_type() {
        return this.file_type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrl_list() {
        return this.url_list;
    }

    public Icon(String str, String str2, String str3, List<String> list) {
        this.uri = str;
        this.file_size = str2;
        this.file_type = str3;
        this.url_list = list;
    }
}
