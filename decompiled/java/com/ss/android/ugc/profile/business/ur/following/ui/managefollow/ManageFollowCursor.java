package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1155170gAN;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCursor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ManageFollowCursor implements Parcelable {
    public final long maxTime;
    public final int offset;
    public final String pageToken;
    public final int sortBy;
    public static final Parcelable.Creator<ManageFollowCursor> CREATOR = new Parcelable.Creator<ManageFollowCursor>() { // from class: X.15jU
        @Override // android.os.Parcelable.Creator
        public final ManageFollowCursor createFromParcel(Parcel parcel) {
            return new ManageFollowCursor(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ManageFollowCursor[] newArray(int i) {
            return new ManageFollowCursor[i];
        }
    };
    public static final int $stable = 8;

    public ManageFollowCursor() {
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
        if (!(obj instanceof ManageFollowCursor)) {
            return false;
        }
        ManageFollowCursor manageFollowCursor = (ManageFollowCursor) obj;
        return this.maxTime == manageFollowCursor.maxTime && this.offset == manageFollowCursor.offset && Intrinsics.LJFF(this.pageToken, manageFollowCursor.pageToken) && this.sortBy == manageFollowCursor.sortBy;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.maxTime) * 31) + this.offset) * 31) + this.pageToken.hashCode()) * 31) + this.sortBy;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageFollowCursor(maxTime=");
        sbLIZ.append(this.maxTime);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.offset);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.pageToken);
        sbLIZ.append(", sortBy=");
        sbLIZ.append(this.sortBy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.maxTime);
        parcel.writeInt(this.offset);
        parcel.writeString(this.pageToken);
        parcel.writeInt(this.sortBy);
    }

    public /* synthetic */ ManageFollowCursor(int i) {
        this(0L, 0, "", EnumC1155170gAN.DEFAULT.getValue());
    }

    public ManageFollowCursor(long j, int i, String str, int i2) {
        this.maxTime = j;
        this.offset = i;
        this.pageToken = str;
        this.sortBy = i2;
    }
}
