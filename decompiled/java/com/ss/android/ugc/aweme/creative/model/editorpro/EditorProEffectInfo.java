package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProEffectInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditorProEffectInfo> CREATOR = new Parcelable.Creator<EditorProEffectInfo>() { // from class: X.0EWY
        @Override // android.os.Parcelable.Creator
        public final EditorProEffectInfo createFromParcel(Parcel parcel) {
            return new EditorProEffectInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProEffectInfo[] newArray(int i) {
            return new EditorProEffectInfo[i];
        }
    };

    @C09CT("key")
    public final String key;

    @C09CT("name")
    public final String name;

    @InterfaceC2270908v5
    @C09CT("res_dir")
    public final String resDir;

    public final EditorProEffectInfo copy(String str, String str2, String str3) {
        return new EditorProEffectInfo(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorProEffectInfo)) {
            return false;
        }
        EditorProEffectInfo editorProEffectInfo = (EditorProEffectInfo) obj;
        return Intrinsics.LJFF(this.key, editorProEffectInfo.key) && Intrinsics.LJFF(this.name, editorProEffectInfo.name) && Intrinsics.LJFF(this.resDir, editorProEffectInfo.resDir);
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resDir;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProEffectInfo(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", resDir=");
        sbLIZ.append(this.resDir);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        parcel.writeString(this.resDir);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getResDir() {
        return this.resDir;
    }

    public EditorProEffectInfo(String str, String str2, String str3) {
        this.key = str;
        this.name = str2;
        this.resDir = str3;
    }
}
