package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InitialTrimInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class InitialTrimInfo implements Parcelable, Serializable {

    @C09CT("in")
    public final long inTime;

    @C09CT("out")
    public final long outTime;
    public static final Parcelable.Creator<InitialTrimInfo> CREATOR = new Parcelable.Creator<InitialTrimInfo>() { // from class: X.0EP8
        @Override // android.os.Parcelable.Creator
        public final InitialTrimInfo createFromParcel(Parcel parcel) {
            return new InitialTrimInfo(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final InitialTrimInfo[] newArray(int i) {
            return new InitialTrimInfo[i];
        }
    };
    public static final int $stable = 8;

    public final InitialTrimInfo copy(long j, long j2) {
        return new InitialTrimInfo(j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialTrimInfo)) {
            return false;
        }
        InitialTrimInfo initialTrimInfo = (InitialTrimInfo) obj;
        return this.inTime == initialTrimInfo.inTime && this.outTime == initialTrimInfo.outTime;
    }

    public int hashCode() {
        return (C786410Ut5.Y2(this.inTime) * 31) + C786410Ut5.Y2(this.outTime);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitialTrimInfo(inTime=");
        sbLIZ.append(this.inTime);
        sbLIZ.append(", outTime=");
        sbLIZ.append(this.outTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.inTime);
        parcel.writeLong(this.outTime);
    }

    public final long getInTime() {
        return this.inTime;
    }

    public final long getOutTime() {
        return this.outTime;
    }

    public InitialTrimInfo(long j, long j2) {
        this.inTime = j;
        this.outTime = j2;
    }
}
