package com.bytedance.android.livesdkapi.session.deeplink;

import X.C0IT2;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC467200ITu;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class DeepLinkData implements Parcelable {
    public static final C0IT2 CREATOR = new Parcelable.Creator<DeepLinkData>() { // from class: X.0IT2
        @Override // android.os.Parcelable.Creator
        public final DeepLinkData createFromParcel(Parcel parcel) {
            return new DeepLinkData(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeepLinkData[] newArray(int i) {
            return new DeepLinkData[i];
        }
    };
    public final long bizType;
    public final String displayId;
    public final String openUrl;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkData)) {
            return false;
        }
        DeepLinkData deepLinkData = (DeepLinkData) obj;
        return Intrinsics.LJFF(this.openUrl, deepLinkData.openUrl) && this.bizType == deepLinkData.bizType && Intrinsics.LJFF(this.displayId, deepLinkData.displayId);
    }

    public final int hashCode() {
        String str = this.openUrl;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.bizType)) * 31;
        String str2 = this.displayId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeepLinkData(openUrl=");
        sbLIZ.append(this.openUrl);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", displayId=");
        sbLIZ.append(this.displayId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeepLinkData() {
        this(null, EnumC467200ITu.Unknown.getScene(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.openUrl);
        parcel.writeLong(this.bizType);
        parcel.writeString(this.displayId);
    }

    public DeepLinkData(String str, long j, String str2) {
        this.openUrl = str;
        this.bizType = j;
        this.displayId = str2;
    }
}
