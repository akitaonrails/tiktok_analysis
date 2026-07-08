package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.model.CameoAssetInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoAssetInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CameoAssetInfo> CREATOR = new Parcelable.Creator<CameoAssetInfo>() { // from class: X.02tq
        @Override // android.os.Parcelable.Creator
        public final CameoAssetInfo createFromParcel(Parcel parcel) {
            return new CameoAssetInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CameoAssetInfo[] newArray(int i) {
            return new CameoAssetInfo[i];
        }
    };

    @C09CT("cameo_id")
    public final String cameoId;

    public CameoAssetInfo() {
        this(null);
    }

    public final CameoAssetInfo copy(String str) {
        return new CameoAssetInfo(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameoAssetInfo) && Intrinsics.LJFF(this.cameoId, ((CameoAssetInfo) obj).cameoId);
    }

    public int hashCode() {
        String str = this.cameoId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoAssetInfo(cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cameoId);
    }

    public final String getCameoId() {
        return this.cameoId;
    }

    public CameoAssetInfo(String str) {
        this.cameoId = str;
    }
}
