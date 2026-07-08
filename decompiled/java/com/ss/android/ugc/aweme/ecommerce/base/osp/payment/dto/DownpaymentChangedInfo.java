package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.DownpaymentChangedInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DownpaymentChangedInfo implements Parcelable {

    @C09CT("content")
    public String content;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<DownpaymentChangedInfo> CREATOR = new Parcelable.Creator<DownpaymentChangedInfo>() { // from class: X.02mv
        @Override // android.os.Parcelable.Creator
        public final DownpaymentChangedInfo createFromParcel(Parcel parcel) {
            return new DownpaymentChangedInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DownpaymentChangedInfo[] newArray(int i) {
            return new DownpaymentChangedInfo[i];
        }
    };
    public static final int $stable = 8;

    public DownpaymentChangedInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownpaymentChangedInfo)) {
            return false;
        }
        DownpaymentChangedInfo downpaymentChangedInfo = (DownpaymentChangedInfo) obj;
        return Intrinsics.LJFF(this.title, downpaymentChangedInfo.title) && Intrinsics.LJFF(this.content, downpaymentChangedInfo.content);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownpaymentChangedInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
    }

    public DownpaymentChangedInfo(String str, String str2) {
        this.title = str;
        this.content = str2;
    }
}
