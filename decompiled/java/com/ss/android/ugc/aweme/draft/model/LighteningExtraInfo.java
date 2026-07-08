package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LighteningExtraInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<LighteningExtraInfo> CREATOR = new Parcelable.Creator<LighteningExtraInfo>() { // from class: X.0MSR
        @Override // android.os.Parcelable.Creator
        public final LighteningExtraInfo createFromParcel(Parcel parcel) {
            return new LighteningExtraInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LighteningExtraInfo[] newArray(int i) {
            return new LighteningExtraInfo[i];
        }
    };

    @C09CT("scheduleId")
    public final String scheduleId;

    public final LighteningExtraInfo copy(String str) {
        return new LighteningExtraInfo(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LighteningExtraInfo) && Intrinsics.LJFF(this.scheduleId, ((LighteningExtraInfo) obj).scheduleId);
    }

    public int hashCode() {
        return this.scheduleId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LighteningExtraInfo(scheduleId=");
        sbLIZ.append(this.scheduleId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scheduleId);
    }

    public LighteningExtraInfo() {
        this("");
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public LighteningExtraInfo(String str) {
        this.scheduleId = str;
    }
}
