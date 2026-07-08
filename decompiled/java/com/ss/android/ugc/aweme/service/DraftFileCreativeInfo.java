package com.ss.android.ugc.aweme.service;

import X.C09CT;
import X.C123100dR;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.service.DraftFileCreativeInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class DraftFileCreativeInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<DraftFileCreativeInfo> CREATOR = new Parcelable.Creator<DraftFileCreativeInfo>() { // from class: X.0Ji1
        @Override // android.os.Parcelable.Creator
        public final DraftFileCreativeInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new DraftFileCreativeInfo(string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftFileCreativeInfo[] newArray(int i) {
            return new DraftFileCreativeInfo[i];
        }
    };

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("version")
    public final Integer version;

    public final DraftFileCreativeInfo copy(String str, Integer num, String str2) {
        return new DraftFileCreativeInfo(str, num, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileCreativeInfo)) {
            return false;
        }
        DraftFileCreativeInfo draftFileCreativeInfo = (DraftFileCreativeInfo) obj;
        return Intrinsics.LJFF(this.creationId, draftFileCreativeInfo.creationId) && Intrinsics.LJFF(this.version, draftFileCreativeInfo.version) && Intrinsics.LJFF(this.sessionId, draftFileCreativeInfo.sessionId);
    }

    public int hashCode() {
        String str = this.creationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.version;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.sessionId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftFileCreativeInfo(creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.sessionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.creationId);
        Integer num = this.version;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.sessionId);
    }

    public final boolean isValid() {
        return C123100dR.LIZ(this.creationId);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public DraftFileCreativeInfo(String str, Integer num, String str2) {
        this.creationId = str;
        this.version = num;
        this.sessionId = str2;
    }
}
