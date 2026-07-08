package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpMediaWindow;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpMediaWindowInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpMediaWindow implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("media_window_info")
    public final SeaPdpMediaWindowInfo mediaWindowInfo;

    @C09CT("type")
    public final String type;
    public static final Parcelable.Creator<SeaPdpMediaWindow> CREATOR = new Parcelable.Creator<SeaPdpMediaWindow>() { // from class: X.0vs3
        @Override // android.os.Parcelable.Creator
        public final SeaPdpMediaWindow createFromParcel(Parcel parcel) {
            SeaPdpMediaWindowInfo seaPdpMediaWindowInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                seaPdpMediaWindowInfoCreateFromParcel = null;
            } else {
                seaPdpMediaWindowInfoCreateFromParcel = SeaPdpMediaWindowInfo.CREATOR.createFromParcel(parcel);
            }
            return new SeaPdpMediaWindow(seaPdpMediaWindowInfoCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpMediaWindow[] newArray(int i) {
            return new SeaPdpMediaWindow[i];
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
        if (!(obj instanceof SeaPdpMediaWindow)) {
            return false;
        }
        SeaPdpMediaWindow seaPdpMediaWindow = (SeaPdpMediaWindow) obj;
        return Intrinsics.LJFF(this.mediaWindowInfo, seaPdpMediaWindow.mediaWindowInfo) && Intrinsics.LJFF(this.type, seaPdpMediaWindow.type) && Intrinsics.LJFF(this.daInfo, seaPdpMediaWindow.daInfo);
    }

    public final int hashCode() {
        SeaPdpMediaWindowInfo seaPdpMediaWindowInfo = this.mediaWindowInfo;
        int iHashCode = (seaPdpMediaWindowInfo == null ? 0 : seaPdpMediaWindowInfo.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpMediaWindow(mediaWindowInfo=");
        sbLIZ.append(this.mediaWindowInfo);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SeaPdpMediaWindowInfo seaPdpMediaWindowInfo = this.mediaWindowInfo;
        if (seaPdpMediaWindowInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpMediaWindowInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.type);
        parcel.writeString(this.daInfo);
    }

    public SeaPdpMediaWindow(SeaPdpMediaWindowInfo seaPdpMediaWindowInfo, String str, String str2) {
        this.mediaWindowInfo = seaPdpMediaWindowInfo;
        this.type = str;
        this.daInfo = str2;
    }
}
