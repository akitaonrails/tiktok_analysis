package com.ss.android.ugc.aweme.creative.model.edit.multiedit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditTrimState;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MultiEditTrimState implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditTrimState> CREATOR = new Parcelable.Creator<MultiEditTrimState>() { // from class: X.0MgZ
        @Override // android.os.Parcelable.Creator
        public final MultiEditTrimState createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MultiEditTrimState(z, parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiEditTrimState[] newArray(int i) {
            return new MultiEditTrimState[i];
        }
    };

    @C09CT(alternate = {"a"}, value = "enable")
    public final boolean enable;

    @C09CT(alternate = {"c"}, value = "endTime")
    public final long endTime;

    @C09CT(alternate = {"b"}, value = "startTime")
    public final long startTime;

    public final MultiEditTrimState copy(boolean z, long j, long j2) {
        return new MultiEditTrimState(z, j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiEditTrimState)) {
            return false;
        }
        MultiEditTrimState multiEditTrimState = (MultiEditTrimState) obj;
        return this.enable == multiEditTrimState.enable && this.startTime == multiEditTrimState.startTime && this.endTime == multiEditTrimState.endTime;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiEditTrimState(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public MultiEditTrimState() {
        this(true, 0L, -1L);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public MultiEditTrimState(boolean z, long j, long j2) {
        this.enable = z;
        this.startTime = j;
        this.endTime = j2;
    }
}
