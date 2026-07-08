package com.ss.android.ugc.aweme.shortvideo.upload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class UploadSpeedInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<UploadSpeedInfo> CREATOR = new Parcelable.Creator<UploadSpeedInfo>() { // from class: X.0me9
        @Override // android.os.Parcelable.Creator
        public final UploadSpeedInfo createFromParcel(Parcel parcel) {
            return new UploadSpeedInfo(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadSpeedInfo[] newArray(int i) {
            return new UploadSpeedInfo[i];
        }
    };
    public final long endTime;
    public String probeContext;
    public final long speed;
    public final long startTime;
    public int usedCompilerSettingGroup;

    public final UploadSpeedInfo copy(long j, String str, long j2, long j3, int i) {
        return new UploadSpeedInfo(j, str, j2, j3, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadSpeedInfo)) {
            return false;
        }
        UploadSpeedInfo uploadSpeedInfo = (UploadSpeedInfo) obj;
        return this.speed == uploadSpeedInfo.speed && Intrinsics.LJFF(this.probeContext, uploadSpeedInfo.probeContext) && this.startTime == uploadSpeedInfo.startTime && this.endTime == uploadSpeedInfo.endTime && this.usedCompilerSettingGroup == uploadSpeedInfo.usedCompilerSettingGroup;
    }

    public int hashCode() {
        return (((((((C786410Ut5.Y2(this.speed) * 31) + this.probeContext.hashCode()) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + this.usedCompilerSettingGroup;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadSpeedInfo(speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", probeContext=");
        sbLIZ.append(this.probeContext);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", usedCompilerSettingGroup=");
        sbLIZ.append(this.usedCompilerSettingGroup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.speed);
        parcel.writeString(this.probeContext);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.usedCompilerSettingGroup);
    }

    public UploadSpeedInfo() {
        this(-6L, "", -6L, -6L, -1);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getProbeContext() {
        return this.probeContext;
    }

    public final long getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getUsedCompilerSettingGroup() {
        return this.usedCompilerSettingGroup;
    }

    public UploadSpeedInfo(long j) {
        this(j, "", -6L, -6L, -1);
    }

    public final void setProbeContext(String str) {
        this.probeContext = str;
    }

    public final void setUsedCompilerSettingGroup(int i) {
        this.usedCompilerSettingGroup = i;
    }

    public UploadSpeedInfo(long j, String str) {
        this(j, str, -6L, -6L, -1);
    }

    public UploadSpeedInfo(long j, String str, long j2) {
        this(j, str, j2, -6L, -1);
    }

    public UploadSpeedInfo(long j, String str, long j2, long j3) {
        this(j, str, j2, j3, -1);
    }

    public UploadSpeedInfo(long j, String str, long j2, long j3, int i) {
        this.speed = j;
        this.probeContext = str;
        this.startTime = j2;
        this.endTime = j3;
        this.usedCompilerSettingGroup = i;
    }
}
