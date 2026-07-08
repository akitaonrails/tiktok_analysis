package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.SchedulePostTime;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SchedulePostTime implements Parcelable, Serializable {
    public static final Parcelable.Creator<SchedulePostTime> CREATOR = new Parcelable.Creator<SchedulePostTime>() { // from class: X.0mcL
        @Override // android.os.Parcelable.Creator
        public final SchedulePostTime createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new SchedulePostTime(lValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SchedulePostTime[] newArray(int i) {
            return new SchedulePostTime[i];
        }
    };

    @C09CT("is_schedule_from_preset")
    public Boolean isFromPreset;

    @C09CT("schedule_post_time_sec")
    public Long timeSec;

    public SchedulePostTime() {
        this(null, null);
    }

    public final SchedulePostTime copy(Long l, Boolean bool) {
        return new SchedulePostTime(l, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchedulePostTime)) {
            return false;
        }
        SchedulePostTime schedulePostTime = (SchedulePostTime) obj;
        return Intrinsics.LJFF(this.timeSec, schedulePostTime.timeSec) && Intrinsics.LJFF(this.isFromPreset, schedulePostTime.isFromPreset);
    }

    public int hashCode() {
        Long l = this.timeSec;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.isFromPreset;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchedulePostTime(timeSec=");
        sbLIZ.append(this.timeSec);
        sbLIZ.append(", isFromPreset=");
        sbLIZ.append(this.isFromPreset);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.timeSec;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.isFromPreset;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public final Long getTimeSec() {
        return this.timeSec;
    }

    public final Boolean isFromPreset() {
        return this.isFromPreset;
    }

    public final void setFromPreset(Boolean bool) {
        this.isFromPreset = bool;
    }

    public final void setTimeSec(Long l) {
        this.timeSec = l;
    }

    public SchedulePostTime(Long l, Boolean bool) {
        this.timeSec = l;
        this.isFromPreset = bool;
    }
}
