package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RichTextExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RichTextExtraInfo implements Parcelable {

    @C09CT("da_info")
    public String daInfo;
    public static final Parcelable.Creator<RichTextExtraInfo> CREATOR = new Parcelable.Creator<RichTextExtraInfo>() { // from class: X.02mO
        @Override // android.os.Parcelable.Creator
        public final RichTextExtraInfo createFromParcel(Parcel parcel) {
            return new RichTextExtraInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RichTextExtraInfo[] newArray(int i) {
            return new RichTextExtraInfo[i];
        }
    };
    public static final int $stable = 8;

    public RichTextExtraInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RichTextExtraInfo) && Intrinsics.LJFF(this.daInfo, ((RichTextExtraInfo) obj).daInfo);
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
        sbLIZ.append("RichTextExtraInfo(daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.daInfo);
    }

    public RichTextExtraInfo(String str) {
        this.daInfo = str;
    }
}
