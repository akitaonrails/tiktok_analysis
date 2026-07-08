package com.ss.android.ugc.asve.recorder;

import X.C1405320mfq;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;

/* JADX INFO: loaded from: classes23.dex */
public final class ASMediaSegment implements Parcelable {
    public static final C1405320mfq CREATOR = new Parcelable.Creator<ASMediaSegment>() { // from class: X.0mfq
        @Override // android.os.Parcelable.Creator
        public final ASMediaSegment createFromParcel(Parcel parcel) {
            return new ASMediaSegment(parcel.readDouble(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ASMediaSegment[] newArray(int i) {
            return new ASMediaSegment[i];
        }
    };
    public final long duration;
    public final double speed;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ASMediaSegment)) {
            return false;
        }
        ASMediaSegment aSMediaSegment = (ASMediaSegment) obj;
        return this.duration == aSMediaSegment.duration && Double.compare(this.speed, aSMediaSegment.speed) == 0;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.duration) * 31) + C786410Ut5.X2(this.speed);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASMediaSegment(duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ASMediaSegment(double d, long j) {
        this.duration = j;
        this.speed = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.duration);
        parcel.writeDouble(this.speed);
    }
}
