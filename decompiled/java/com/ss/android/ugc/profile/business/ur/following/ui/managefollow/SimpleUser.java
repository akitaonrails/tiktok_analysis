package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SimpleUser implements Parcelable {
    public final String secUid;
    public final String uid;
    public static final Parcelable.Creator<SimpleUser> CREATOR = new Parcelable.Creator<SimpleUser>() { // from class: X.15jX
        @Override // android.os.Parcelable.Creator
        public final SimpleUser createFromParcel(Parcel parcel) {
            return new SimpleUser(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleUser[] newArray(int i) {
            return new SimpleUser[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleUser(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
    }

    public final int hashCode() {
        return this.uid.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        SimpleUser simpleUser;
        if (this == obj) {
            return true;
        }
        String str = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(SimpleUser.class, cls)) {
            return false;
        }
        String str2 = this.uid;
        if ((obj instanceof SimpleUser) && (simpleUser = (SimpleUser) obj) != null) {
            str = simpleUser.uid;
        }
        return Intrinsics.LJFF(str2, str);
    }

    public SimpleUser(String str, String str2) {
        this.uid = str;
        this.secUid = str2;
    }
}
