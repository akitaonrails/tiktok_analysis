package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.tcm.AVTagBAUser;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AVTagBAUser implements Serializable, Parcelable {
    public static final Parcelable.Creator<AVTagBAUser> CREATOR = new Parcelable.Creator<AVTagBAUser>() { // from class: X.02xs
        @Override // android.os.Parcelable.Creator
        public final AVTagBAUser createFromParcel(Parcel parcel) {
            return new AVTagBAUser(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AVTagBAUser[] newArray(int i) {
            return new AVTagBAUser[i];
        }
    };

    @C09CT("handle_name")
    public final String handleName;

    @C09CT("uid")
    public final String uid;

    public AVTagBAUser() {
        this(null, null);
    }

    public final AVTagBAUser copy(String str, String str2) {
        return new AVTagBAUser(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVTagBAUser)) {
            return false;
        }
        AVTagBAUser aVTagBAUser = (AVTagBAUser) obj;
        return Intrinsics.LJFF(this.uid, aVTagBAUser.uid) && Intrinsics.LJFF(this.handleName, aVTagBAUser.handleName);
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.handleName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVTagBAUser(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", handleName=");
        sbLIZ.append(this.handleName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.handleName);
    }

    public final String getHandleName() {
        return this.handleName;
    }

    public final String getUid() {
        return this.uid;
    }

    public AVTagBAUser(String str, String str2) {
        this.uid = str;
        this.handleName = str2;
    }
}
