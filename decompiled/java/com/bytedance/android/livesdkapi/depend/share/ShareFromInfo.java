package com.bytedance.android.livesdkapi.depend.share;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ShareFromInfo implements Parcelable {
    public static final Parcelable.Creator<ShareFromInfo> CREATOR = new Parcelable.Creator<ShareFromInfo>() { // from class: X.0IWU
        @Override // android.os.Parcelable.Creator
        public final ShareFromInfo createFromParcel(Parcel parcel) {
            return new ShareFromInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShareFromInfo[] newArray(int i) {
            return new ShareFromInfo[i];
        }
    };
    public final String shareFromUserId;
    public final String traceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareFromInfo)) {
            return false;
        }
        ShareFromInfo shareFromInfo = (ShareFromInfo) obj;
        return Intrinsics.LJFF(this.shareFromUserId, shareFromInfo.shareFromUserId) && Intrinsics.LJFF(this.traceId, shareFromInfo.traceId);
    }

    public final int hashCode() {
        String str = this.shareFromUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.traceId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareFromInfo(shareFromUserId=");
        sbLIZ.append(this.shareFromUserId);
        sbLIZ.append(", traceId=");
        sbLIZ.append(this.traceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shareFromUserId);
        parcel.writeString(this.traceId);
    }

    public ShareFromInfo(String str, String str2) {
        this.shareFromUserId = str;
        this.traceId = str2;
    }
}
