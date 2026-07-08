package com.ss.ugc.android.editor.base.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.android.editor.base.data.CoverUrl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CoverUrl implements Parcelable {
    public static final Parcelable.Creator<CoverUrl> CREATOR = new Parcelable.Creator<CoverUrl>() { // from class: X.0wPJ
        @Override // android.os.Parcelable.Creator
        public final CoverUrl createFromParcel(Parcel parcel) {
            return new CoverUrl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CoverUrl[] newArray(int i) {
            return new CoverUrl[i];
        }
    };
    public String cover_hd;
    public String cover_large;
    public String cover_medium;
    public String cover_thumb;

    public final CoverUrl copy(String str, String str2, String str3, String str4) {
        return new CoverUrl(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverUrl)) {
            return false;
        }
        CoverUrl coverUrl = (CoverUrl) obj;
        return Intrinsics.LJFF(this.cover_hd, coverUrl.cover_hd) && Intrinsics.LJFF(this.cover_thumb, coverUrl.cover_thumb) && Intrinsics.LJFF(this.cover_medium, coverUrl.cover_medium) && Intrinsics.LJFF(this.cover_large, coverUrl.cover_large);
    }

    public int hashCode() {
        return (((((this.cover_hd.hashCode() * 31) + this.cover_thumb.hashCode()) * 31) + this.cover_medium.hashCode()) * 31) + this.cover_large.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverUrl(cover_hd=");
        sbLIZ.append(this.cover_hd);
        sbLIZ.append(", cover_thumb=");
        sbLIZ.append(this.cover_thumb);
        sbLIZ.append(", cover_medium=");
        sbLIZ.append(this.cover_medium);
        sbLIZ.append(", cover_large=");
        sbLIZ.append(this.cover_large);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cover_hd);
        parcel.writeString(this.cover_thumb);
        parcel.writeString(this.cover_medium);
        parcel.writeString(this.cover_large);
    }

    public CoverUrl() {
        this("", "", "", "");
    }

    public final String getCover_hd() {
        return this.cover_hd;
    }

    public final String getCover_large() {
        return this.cover_large;
    }

    public final String getCover_medium() {
        return this.cover_medium;
    }

    public final String getCover_thumb() {
        return this.cover_thumb;
    }

    public final void setCover_hd(String str) {
        this.cover_hd = str;
    }

    public final void setCover_large(String str) {
        this.cover_large = str;
    }

    public final void setCover_medium(String str) {
        this.cover_medium = str;
    }

    public final void setCover_thumb(String str) {
        this.cover_thumb = str;
    }

    public CoverUrl(String str, String str2, String str3, String str4) {
        this.cover_hd = str;
        this.cover_thumb = str2;
        this.cover_medium = str3;
        this.cover_large = str4;
    }
}
