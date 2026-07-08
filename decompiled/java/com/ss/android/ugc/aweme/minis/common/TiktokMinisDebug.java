package com.ss.android.ugc.aweme.minis.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisDebug;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TiktokMinisDebug implements Parcelable {

    @C09CT("debug_port")
    public final String debugPort;

    @C09CT("debug_url")
    public final String debugUrl;

    @C09CT("local_url")
    public String localUrl;

    @C09CT("runtime_url")
    public String runtimeUrl;
    public static final Parcelable.Creator<TiktokMinisDebug> CREATOR = new Parcelable.Creator<TiktokMinisDebug>() { // from class: X.1AxZ
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisDebug createFromParcel(Parcel parcel) {
            return new TiktokMinisDebug(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisDebug[] newArray(int i) {
            return new TiktokMinisDebug[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisDebug)) {
            return false;
        }
        TiktokMinisDebug tiktokMinisDebug = (TiktokMinisDebug) obj;
        return Intrinsics.LJFF(this.runtimeUrl, tiktokMinisDebug.runtimeUrl) && Intrinsics.LJFF(this.localUrl, tiktokMinisDebug.localUrl) && Intrinsics.LJFF(this.debugPort, tiktokMinisDebug.debugPort) && Intrinsics.LJFF(this.debugUrl, tiktokMinisDebug.debugUrl);
    }

    public final int hashCode() {
        String str = this.runtimeUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.localUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.debugPort;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.debugUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisDebug(runtimeUrl=");
        sbLIZ.append(this.runtimeUrl);
        sbLIZ.append(", localUrl=");
        sbLIZ.append(this.localUrl);
        sbLIZ.append(", debugPort=");
        sbLIZ.append(this.debugPort);
        sbLIZ.append(", debugUrl=");
        sbLIZ.append(this.debugUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.runtimeUrl);
        parcel.writeString(this.localUrl);
        parcel.writeString(this.debugPort);
        parcel.writeString(this.debugUrl);
    }

    public TiktokMinisDebug(String str, String str2, String str3, String str4) {
        this.runtimeUrl = str;
        this.localUrl = str2;
        this.debugPort = str3;
        this.debugUrl = str4;
    }
}
