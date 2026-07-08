package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubbleExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EntranceBubbleExtraInfo implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;
    public static final Parcelable.Creator<EntranceBubbleExtraInfo> CREATOR = new Parcelable.Creator<EntranceBubbleExtraInfo>() { // from class: X.0vbM
        @Override // android.os.Parcelable.Creator
        public final EntranceBubbleExtraInfo createFromParcel(Parcel parcel) {
            return new EntranceBubbleExtraInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EntranceBubbleExtraInfo[] newArray(int i) {
            return new EntranceBubbleExtraInfo[i];
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
        return (obj instanceof EntranceBubbleExtraInfo) && Intrinsics.LJFF(this.daInfo, ((EntranceBubbleExtraInfo) obj).daInfo);
    }

    public final int hashCode() {
        String str = this.daInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceBubbleExtraInfo(daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.daInfo);
    }

    public EntranceBubbleExtraInfo(String str) {
        this.daInfo = str;
    }
}
