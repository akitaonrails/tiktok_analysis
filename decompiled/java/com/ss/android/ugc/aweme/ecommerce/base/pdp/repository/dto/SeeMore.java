package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeeMore;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeeMore implements Parcelable {

    @C09CT("description")
    public final String desc;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<SeeMore> CREATOR = new Parcelable.Creator<SeeMore>() { // from class: X.043X
        @Override // android.os.Parcelable.Creator
        public final SeeMore createFromParcel(Parcel parcel) {
            return new SeeMore(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeeMore[] newArray(int i) {
            return new SeeMore[i];
        }
    };
    public static final int $stable = 8;

    public SeeMore() {
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
        if (!(obj instanceof SeeMore)) {
            return false;
        }
        SeeMore seeMore = (SeeMore) obj;
        return Intrinsics.LJFF(this.title, seeMore.title) && Intrinsics.LJFF(this.desc, seeMore.desc);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeeMore(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
    }

    public SeeMore(String str, String str2) {
        this.title = str;
        this.desc = str2;
    }
}
