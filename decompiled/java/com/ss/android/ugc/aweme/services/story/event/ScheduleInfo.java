package com.ss.android.ugc.aweme.services.story.event;

import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class ScheduleInfo implements Parcelable {
    public static final Parcelable.Creator<ScheduleInfo> CREATOR = new Creator();
    public final String scheduleId;
    public final Bundle scheduleParam;

    public static final class Creator implements Parcelable.Creator<ScheduleInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo createFromParcel(Parcel parcel) {
            return new ScheduleInfo(parcel.readString(), parcel.readBundle(ScheduleInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo[] newArray(int i) {
            return new ScheduleInfo[i];
        }
    }

    public final ScheduleInfo copy(String str, Bundle bundle) {
        return new ScheduleInfo(str, bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleInfo)) {
            return false;
        }
        ScheduleInfo scheduleInfo = (ScheduleInfo) obj;
        return Intrinsics.LJFF(this.scheduleId, scheduleInfo.scheduleId) && Intrinsics.LJFF(this.scheduleParam, scheduleInfo.scheduleParam);
    }

    public int hashCode() {
        return (this.scheduleId.hashCode() * 31) + this.scheduleParam.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScheduleInfo(scheduleId=");
        sbLIZ.append(this.scheduleId);
        sbLIZ.append(", scheduleParam=");
        sbLIZ.append(this.scheduleParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scheduleId);
        parcel.writeBundle(this.scheduleParam);
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public final Bundle getScheduleParam() {
        return this.scheduleParam;
    }

    public ScheduleInfo(String str, Bundle bundle) {
        this.scheduleId = str;
        this.scheduleParam = bundle;
    }
}
