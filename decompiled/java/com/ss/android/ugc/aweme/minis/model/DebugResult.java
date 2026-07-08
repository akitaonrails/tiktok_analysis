package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisDebug;
import com.ss.android.ugc.aweme.minis.model.DebugResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class DebugResult implements Parcelable {

    @C09CT("debug_err_code")
    public Integer debugErrorCode;

    @C09CT("debug_err_reason")
    public String debugErrorReason;

    @C09CT("debug_source_info")
    public TiktokMinisDebug debugSourceInfo;
    public static final Parcelable.Creator<DebugResult> CREATOR = new Parcelable.Creator<DebugResult>() { // from class: X.0iMg
        @Override // android.os.Parcelable.Creator
        public final DebugResult createFromParcel(Parcel parcel) {
            TiktokMinisDebug tiktokMinisDebugCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                tiktokMinisDebugCreateFromParcel = null;
            } else {
                tiktokMinisDebugCreateFromParcel = TiktokMinisDebug.CREATOR.createFromParcel(parcel);
            }
            TiktokMinisDebug tiktokMinisDebug = tiktokMinisDebugCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new DebugResult(tiktokMinisDebug, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DebugResult[] newArray(int i) {
            return new DebugResult[i];
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
        if (!(obj instanceof DebugResult)) {
            return false;
        }
        DebugResult debugResult = (DebugResult) obj;
        return Intrinsics.LJFF(this.debugSourceInfo, debugResult.debugSourceInfo) && Intrinsics.LJFF(this.debugErrorCode, debugResult.debugErrorCode) && Intrinsics.LJFF(this.debugErrorReason, debugResult.debugErrorReason);
    }

    public final int hashCode() {
        TiktokMinisDebug tiktokMinisDebug = this.debugSourceInfo;
        int iHashCode = (tiktokMinisDebug == null ? 0 : tiktokMinisDebug.hashCode()) * 31;
        Integer num = this.debugErrorCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.debugErrorReason;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DebugResult(debugSourceInfo=");
        sbLIZ.append(this.debugSourceInfo);
        sbLIZ.append(", debugErrorCode=");
        sbLIZ.append(this.debugErrorCode);
        sbLIZ.append(", debugErrorReason=");
        sbLIZ.append(this.debugErrorReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TiktokMinisDebug tiktokMinisDebug = this.debugSourceInfo;
        if (tiktokMinisDebug == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tiktokMinisDebug.writeToParcel(parcel, i);
        }
        Integer num = this.debugErrorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.debugErrorReason);
    }

    public DebugResult(TiktokMinisDebug tiktokMinisDebug, Integer num, String str) {
        this.debugSourceInfo = tiktokMinisDebug;
        this.debugErrorCode = num;
        this.debugErrorReason = str;
    }
}
