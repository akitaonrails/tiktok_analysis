package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C746800TRe;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class MapLocateEvent implements Parcelable {

    @C09CT("errorCode")
    public final String errorCode;

    @C09CT("locateMsg")
    public final Integer locateMsg;

    @C09CT("locateStatus")
    public final int locateStatus;
    public static final C746800TRe Companion = new Object() { // from class: X.0TRe
    };
    public static final Parcelable.Creator<MapLocateEvent> CREATOR = new Parcelable.Creator<MapLocateEvent>() { // from class: X.0TRd
        @Override // android.os.Parcelable.Creator
        public final MapLocateEvent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MapLocateEvent(i, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MapLocateEvent[] newArray(int i) {
            return new MapLocateEvent[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLocateEvent)) {
            return false;
        }
        MapLocateEvent mapLocateEvent = (MapLocateEvent) obj;
        return this.locateStatus == mapLocateEvent.locateStatus && Intrinsics.LJFF(this.locateMsg, mapLocateEvent.locateMsg) && Intrinsics.LJFF(this.errorCode, mapLocateEvent.errorCode);
    }

    public final int hashCode() {
        int i = this.locateStatus * 31;
        Integer num = this.locateMsg;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapLocateEvent(locateStatus=");
        sbLIZ.append(this.locateStatus);
        sbLIZ.append(", locateMsg=");
        sbLIZ.append(this.locateMsg);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.locateStatus);
        Integer num = this.locateMsg;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.errorCode);
    }

    public MapLocateEvent(int i, Integer num, String str) {
        this.locateStatus = i;
        this.locateMsg = num;
        this.errorCode = str;
    }
}
