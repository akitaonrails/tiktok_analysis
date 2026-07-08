package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CoverInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<CoverInfo> CREATOR = new Creator();

    @C09CT("file_size")
    public final String file_size;

    @C09CT("file_type")
    public final String file_type;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> url_list;

    public static final class Creator implements Parcelable.Creator<CoverInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoverInfo createFromParcel(Parcel parcel) {
            return new CoverInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoverInfo[] newArray(int i) {
            return new CoverInfo[i];
        }
    }

    public final CoverInfo copy(String str, String str2, String str3, List<String> list, String str4) {
        return new CoverInfo(str, str2, str3, list, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverInfo)) {
            return false;
        }
        CoverInfo coverInfo = (CoverInfo) obj;
        return Intrinsics.LJFF(this.uri, coverInfo.uri) && Intrinsics.LJFF(this.file_size, coverInfo.file_size) && Intrinsics.LJFF(this.file_type, coverInfo.file_type) && Intrinsics.LJFF(this.url_list, coverInfo.url_list) && Intrinsics.LJFF(this.scene, coverInfo.scene);
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
        String str4 = this.scene;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverInfo(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", file_size=");
        sbLIZ.append(this.file_size);
        sbLIZ.append(", file_type=");
        sbLIZ.append(this.file_type);
        sbLIZ.append(", url_list=");
        sbLIZ.append(this.url_list);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.file_size);
        parcel.writeString(this.file_type);
        parcel.writeStringList(this.url_list);
        parcel.writeString(this.scene);
    }

    public final String getFile_size() {
        return this.file_size;
    }

    public final String getFile_type() {
        return this.file_type;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrl_list() {
        return this.url_list;
    }

    public CoverInfo(String str, String str2, String str3, List<String> list, String str4) {
        this.uri = str;
        this.file_size = str2;
        this.file_type = str3;
        this.url_list = list;
        this.scene = str4;
    }
}
