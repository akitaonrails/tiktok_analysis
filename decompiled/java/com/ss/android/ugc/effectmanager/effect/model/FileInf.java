package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class FileInf implements Serializable, Parcelable {
    public static final Parcelable.Creator<FileInf> CREATOR = new Creator();

    @C09CT("extra")
    @C09CS(FileInfExtraAdapter.class)
    public final FileInfExtra extra;

    @C09CT("file_size")
    public final String file_size;

    @C09CT("file_type")
    public final String file_type;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> url_list;

    public static final class Creator implements Parcelable.Creator<FileInf> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileInf createFromParcel(Parcel parcel) {
            return new FileInf(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : FileInfExtra.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileInf[] newArray(int i) {
            return new FileInf[i];
        }
    }

    public final FileInf copy(String str, String str2, String str3, List<String> list, FileInfExtra fileInfExtra) {
        return new FileInf(str, str2, str3, list, fileInfExtra);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileInf)) {
            return false;
        }
        FileInf fileInf = (FileInf) obj;
        return Intrinsics.LJFF(this.uri, fileInf.uri) && Intrinsics.LJFF(this.file_size, fileInf.file_size) && Intrinsics.LJFF(this.file_type, fileInf.file_type) && Intrinsics.LJFF(this.url_list, fileInf.url_list) && Intrinsics.LJFF(this.extra, fileInf.extra);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.file_size;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.file_type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.url_list;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        FileInfExtra fileInfExtra = this.extra;
        return iHashCode4 + (fileInfExtra != null ? fileInfExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FileInf(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", file_size=");
        sbLIZ.append(this.file_size);
        sbLIZ.append(", file_type=");
        sbLIZ.append(this.file_type);
        sbLIZ.append(", url_list=");
        sbLIZ.append(this.url_list);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.file_size);
        parcel.writeString(this.file_type);
        parcel.writeStringList(this.url_list);
        FileInfExtra fileInfExtra = this.extra;
        if (fileInfExtra == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fileInfExtra.writeToParcel(parcel, i);
        }
    }

    public final FileInfExtra getExtra() {
        return this.extra;
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

    public FileInf(String str, String str2, String str3, List<String> list, FileInfExtra fileInfExtra) {
        this.uri = str;
        this.file_size = str2;
        this.file_type = str3;
        this.url_list = list;
        this.extra = fileInfExtra;
    }
}
