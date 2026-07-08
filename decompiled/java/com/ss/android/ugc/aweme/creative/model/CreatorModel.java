package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreatorModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CreatorModel implements Parcelable {
    public static final Parcelable.Creator<CreatorModel> CREATOR = new Parcelable.Creator<CreatorModel>() { // from class: X.0nWj
        @Override // android.os.Parcelable.Creator
        public final CreatorModel createFromParcel(Parcel parcel) {
            return new CreatorModel(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CreatorModel[] newArray(int i) {
            return new CreatorModel[i];
        }
    };

    @C09CT("schedule_time")
    public long scheduleTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatorModel) && this.scheduleTime == ((CreatorModel) obj).scheduleTime;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.scheduleTime);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorModel(scheduleTime=");
        sbLIZ.append(this.scheduleTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.scheduleTime);
    }

    public CreatorModel() {
        this(0L);
    }

    public CreatorModel(long j) {
        this.scheduleTime = j;
    }
}
