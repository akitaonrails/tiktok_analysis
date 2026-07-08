package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LiveInfo implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("jump_action")
    public Integer jumpAction;

    @C09CT("schema")
    public String link;
    public static final Parcelable.Creator<LiveInfo> CREATOR = new Parcelable.Creator<LiveInfo>() { // from class: X.02oA
        @Override // android.os.Parcelable.Creator
        public final LiveInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new LiveInfo(numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveInfo[] newArray(int i) {
            return new LiveInfo[i];
        }
    };
    public static final int $stable = 8;

    public LiveInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveInfo)) {
            return false;
        }
        LiveInfo liveInfo = (LiveInfo) obj;
        return Intrinsics.LJFF(this.jumpAction, liveInfo.jumpAction) && Intrinsics.LJFF(this.link, liveInfo.link) && Intrinsics.LJFF(this.daInfo, liveInfo.daInfo);
    }

    public final int hashCode() {
        Integer num = this.jumpAction;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.link;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveInfo(jumpAction=");
        sbLIZ.append(this.jumpAction);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.jumpAction;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.link);
        parcel.writeString(this.daInfo);
    }

    public LiveInfo(Integer num, String str, String str2) {
        this.jumpAction = num;
        this.link = str;
        this.daInfo = str2;
    }
}
