package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TimeRange;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class TimeRange implements Parcelable, Serializable {

    @C09CT("duration")
    public final long duration;

    @C09CT("start")
    public final long start;
    public static final Parcelable.Creator<TimeRange> CREATOR = new Parcelable.Creator<TimeRange>() { // from class: X.0EMg
        @Override // android.os.Parcelable.Creator
        public final TimeRange createFromParcel(Parcel parcel) {
            return new TimeRange(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeRange[] newArray(int i) {
            return new TimeRange[i];
        }
    };
    public static final int $stable = 8;

    public final TimeRange copy(long j, long j2) {
        return new TimeRange(j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeRange)) {
            return false;
        }
        TimeRange timeRange = (TimeRange) obj;
        return this.start == timeRange.start && this.duration == timeRange.duration;
    }

    public int hashCode() {
        return (C786410Ut5.Y2(this.start) * 31) + C786410Ut5.Y2(this.duration);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeRange(start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.start);
        parcel.writeLong(this.duration);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getStart() {
        return this.start;
    }

    public TimeRange(long j, long j2) {
        this.start = j;
        this.duration = j2;
    }
}
