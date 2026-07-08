package com.ss.android.socialbase.downloader.model;

import X.C1554390qYH;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes24.dex */
public class HttpHeader implements Parcelable, Comparable {
    public static final Parcelable.Creator<HttpHeader> CREATOR = new C1554390qYH(2);
    public final String name;
    public final String value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HttpHeader{name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", value='");
        sbLIZ.append(this.value);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HttpHeader(Parcel parcel) {
        this.name = parcel.readString();
        this.value = parcel.readString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (!(obj instanceof HttpHeader)) {
            return 1;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.name, httpHeader.name)) {
            return 0;
        }
        String str = this.name;
        if (str == null) {
            return -1;
        }
        int iCompareTo = str.compareTo(httpHeader.name);
        if (iCompareTo > 0) {
            return 1;
        }
        if (iCompareTo >= 0) {
            return 0;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.name, httpHeader.name) && TextUtils.equals(this.value, httpHeader.value)) {
            return true;
        }
        return false;
    }

    public HttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }
}
