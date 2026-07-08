package com.ss.android.ugc.aweme.fangroup.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinCheckResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupJoinCheckResult implements Parcelable {
    public static final Parcelable.Creator<GroupJoinCheckResult> CREATOR = new Parcelable.Creator<GroupJoinCheckResult>() { // from class: X.0i90
        @Override // android.os.Parcelable.Creator
        public final GroupJoinCheckResult createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new GroupJoinCheckResult(i, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupJoinCheckResult[] newArray(int i) {
            return new GroupJoinCheckResult[i];
        }
    };

    @C09CT("check_code")
    public final int checkCode;

    @C09CT("check_message")
    public final String checkMessage;

    @C09CT("pass")
    public final boolean pass;

    public GroupJoinCheckResult() {
        this(0, false, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupJoinCheckResult)) {
            return false;
        }
        GroupJoinCheckResult groupJoinCheckResult = (GroupJoinCheckResult) obj;
        return this.checkCode == groupJoinCheckResult.checkCode && this.pass == groupJoinCheckResult.pass && Intrinsics.LJFF(this.checkMessage, groupJoinCheckResult.checkMessage);
    }

    public final int hashCode() {
        return (((this.checkCode * 31) + C786410Ut5.Z2(this.pass)) * 31) + this.checkMessage.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupJoinCheckResult(checkCode=");
        sbLIZ.append(this.checkCode);
        sbLIZ.append(", pass=");
        sbLIZ.append(this.pass);
        sbLIZ.append(", checkMessage=");
        sbLIZ.append(this.checkMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.checkCode);
        parcel.writeInt(this.pass ? 1 : 0);
        parcel.writeString(this.checkMessage);
    }

    public GroupJoinCheckResult(int i, boolean z, String str) {
        this.checkCode = i;
        this.pass = z;
        this.checkMessage = str;
    }
}
