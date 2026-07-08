package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ECommerceCreativeVideoParams implements Parcelable {
    public static final Parcelable.Creator<ECommerceCreativeVideoParams> CREATOR = new Parcelable.Creator<ECommerceCreativeVideoParams>() { // from class: X.0nYO
        @Override // android.os.Parcelable.Creator
        public final ECommerceCreativeVideoParams createFromParcel(Parcel parcel) {
            return new ECommerceCreativeVideoParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ECommerceCreativeVideoParams[] newArray(int i) {
            return new ECommerceCreativeVideoParams[i];
        }
    };

    @C09CT("music_id")
    public final String musicId;

    public ECommerceCreativeVideoParams() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ECommerceCreativeVideoParams) && Intrinsics.LJFF(this.musicId, ((ECommerceCreativeVideoParams) obj).musicId);
    }

    public final int hashCode() {
        String str = this.musicId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECommerceCreativeVideoParams(musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicId);
    }

    public ECommerceCreativeVideoParams(String str) {
        this.musicId = str;
    }
}
