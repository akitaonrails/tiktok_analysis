package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TTSCategory implements Parcelable {
    public static final Parcelable.Creator<TTSCategory> CREATOR = new Parcelable.Creator<TTSCategory>() { // from class: X.092B
        @Override // android.os.Parcelable.Creator
        public final TTSCategory createFromParcel(Parcel parcel) {
            return new TTSCategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSCategory[] newArray(int i) {
            return new TTSCategory[i];
        }
    };
    public final String extra;
    public final String id;
    public final String key;
    public final String name;

    /* JADX WARN: Illegal instructions before constructor call */
    public TTSCategory() {
        String str = null;
        this(str, str, str, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSCategory)) {
            return false;
        }
        TTSCategory tTSCategory = (TTSCategory) obj;
        return Intrinsics.LJFF(this.id, tTSCategory.id) && Intrinsics.LJFF(this.name, tTSCategory.name) && Intrinsics.LJFF(this.key, tTSCategory.key) && Intrinsics.LJFF(this.extra, tTSCategory.extra);
    }

    public final int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.key.hashCode()) * 31;
        String str = this.extra;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTSCategory(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.extra);
    }

    public /* synthetic */ TTSCategory(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (String) null);
    }

    public TTSCategory(String str, String str2, String str3, String str4) {
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.extra = str4;
    }
}
