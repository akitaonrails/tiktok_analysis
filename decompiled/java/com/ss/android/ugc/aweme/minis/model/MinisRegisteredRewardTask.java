package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisRegisteredRewardTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisRegisteredRewardTask implements Parcelable {

    @C09CT("config_version")
    public final Long configVersion;

    @C09CT("task_type")
    public final String taskType;
    public static final Parcelable.Creator<MinisRegisteredRewardTask> CREATOR = new Parcelable.Creator<MinisRegisteredRewardTask>() { // from class: X.0wSF
        @Override // android.os.Parcelable.Creator
        public final MinisRegisteredRewardTask createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new MinisRegisteredRewardTask(string, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisRegisteredRewardTask[] newArray(int i) {
            return new MinisRegisteredRewardTask[i];
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
        if (!(obj instanceof MinisRegisteredRewardTask)) {
            return false;
        }
        MinisRegisteredRewardTask minisRegisteredRewardTask = (MinisRegisteredRewardTask) obj;
        return Intrinsics.LJFF(this.taskType, minisRegisteredRewardTask.taskType) && Intrinsics.LJFF(this.configVersion, minisRegisteredRewardTask.configVersion);
    }

    public final int hashCode() {
        String str = this.taskType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.configVersion;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRegisteredRewardTask(taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", configVersion=");
        sbLIZ.append(this.configVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskType);
        Long l = this.configVersion;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public MinisRegisteredRewardTask(String str, Long l) {
        this.taskType = str;
        this.configVersion = l;
    }
}
