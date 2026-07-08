package com.ss.android.ugc.aweme.shortvideo;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.NaviContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class NaviContext implements Parcelable {
    public static final Parcelable.Creator<NaviContext> CREATOR = new Parcelable.Creator<NaviContext>() { // from class: X.0nnP
        @Override // android.os.Parcelable.Creator
        public final NaviContext createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new NaviContext(lValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NaviContext[] newArray(int i) {
            return new NaviContext[i];
        }
    };
    public Long avatarId;
    public Boolean avatarIsNew;

    public NaviContext() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NaviContext)) {
            return false;
        }
        NaviContext naviContext = (NaviContext) obj;
        return Intrinsics.LJFF(this.avatarId, naviContext.avatarId) && Intrinsics.LJFF(this.avatarIsNew, naviContext.avatarIsNew);
    }

    public final int hashCode() {
        Long l = this.avatarId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.avatarIsNew;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NaviContext(avatarId=");
        sbLIZ.append(this.avatarId);
        sbLIZ.append(", avatarIsNew=");
        sbLIZ.append(this.avatarIsNew);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.avatarId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.avatarIsNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ NaviContext(int i) {
        this(null, Boolean.FALSE);
    }

    public NaviContext(Long l, Boolean bool) {
        this.avatarId = l;
        this.avatarIsNew = bool;
    }
}
