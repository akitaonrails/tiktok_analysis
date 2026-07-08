package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserVirtualInfo implements Parcelable {

    @C09CT("user_virtual_info_id")
    public String userVirtualInfoId;

    @C09CT("user_virtual_info_str")
    public String userVirtualInfoStr;
    public static final Parcelable.Creator<UserVirtualInfo> CREATOR = new Parcelable.Creator<UserVirtualInfo>() { // from class: X.02iN
        @Override // android.os.Parcelable.Creator
        public final UserVirtualInfo createFromParcel(Parcel parcel) {
            return new UserVirtualInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserVirtualInfo[] newArray(int i) {
            return new UserVirtualInfo[i];
        }
    };
    public static final int $stable = 8;

    public UserVirtualInfo() {
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
        if (!(obj instanceof UserVirtualInfo)) {
            return false;
        }
        UserVirtualInfo userVirtualInfo = (UserVirtualInfo) obj;
        return Intrinsics.LJFF(this.userVirtualInfoId, userVirtualInfo.userVirtualInfoId) && Intrinsics.LJFF(this.userVirtualInfoStr, userVirtualInfo.userVirtualInfoStr);
    }

    public final int hashCode() {
        String str = this.userVirtualInfoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userVirtualInfoStr;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserVirtualInfo(userVirtualInfoId=");
        sbLIZ.append(this.userVirtualInfoId);
        sbLIZ.append(", userVirtualInfoStr=");
        sbLIZ.append(this.userVirtualInfoStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userVirtualInfoId);
        parcel.writeString(this.userVirtualInfoStr);
    }

    public UserVirtualInfo(String str, String str2) {
        this.userVirtualInfoId = str;
        this.userVirtualInfoStr = str2;
    }
}
