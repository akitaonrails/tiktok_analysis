package com.ss.android.ugc.aweme.tools.policysecurity;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class OriginalSoundUploadTask implements Parcelable {
    public transient String audioVid;
    public final String awemeId;
    public boolean isBackup;
    public boolean isDraft;
    public int matchFactors;
    public int origin;
    public final String originalSoundPath;
    public int queryTimes;
    public final String unionId;
    public final long updateTime;
    public final String vid;
    public static final Parcelable.Creator<OriginalSoundUploadTask> CREATOR = new Parcelable.Creator<OriginalSoundUploadTask>() { // from class: X.0ncJ
        @Override // android.os.Parcelable.Creator
        public final OriginalSoundUploadTask createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new OriginalSoundUploadTask(string, string2, string3, j, string4, string5, i, z, i2, z2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OriginalSoundUploadTask[] newArray(int i) {
            return new OriginalSoundUploadTask[i];
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
        if (!(obj instanceof OriginalSoundUploadTask)) {
            return false;
        }
        OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) obj;
        return Intrinsics.LJFF(this.awemeId, originalSoundUploadTask.awemeId) && Intrinsics.LJFF(this.vid, originalSoundUploadTask.vid) && Intrinsics.LJFF(this.originalSoundPath, originalSoundUploadTask.originalSoundPath) && this.updateTime == originalSoundUploadTask.updateTime && Intrinsics.LJFF(this.unionId, originalSoundUploadTask.unionId) && Intrinsics.LJFF(this.audioVid, originalSoundUploadTask.audioVid) && this.matchFactors == originalSoundUploadTask.matchFactors && this.isDraft == originalSoundUploadTask.isDraft && this.origin == originalSoundUploadTask.origin && this.isBackup == originalSoundUploadTask.isBackup && this.queryTimes == originalSoundUploadTask.queryTimes;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.awemeId.hashCode() * 31) + this.vid.hashCode()) * 31) + this.originalSoundPath.hashCode()) * 31) + C786410Ut5.Y2(this.updateTime)) * 31;
        String str = this.unionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioVid;
        return ((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.matchFactors) * 31) + C786410Ut5.Z2(this.isDraft)) * 31) + this.origin) * 31) + C786410Ut5.Z2(this.isBackup)) * 31) + this.queryTimes;
    }

    public final String toString() {
        return "OriginalSoundUploadTask(awemeId=" + this.awemeId + ", vid=" + this.vid + ", originalSoundPath=" + this.originalSoundPath + ", updateTime=" + this.updateTime + ", unionId=" + this.unionId + ", audioVid=" + this.audioVid + ", matchFactors=" + this.matchFactors + ", isDraft=" + this.isDraft + ", origin=" + this.origin + ", isBackup=" + this.isBackup + ", queryTimes=" + this.queryTimes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.awemeId);
        parcel.writeString(this.vid);
        parcel.writeString(this.originalSoundPath);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.unionId);
        parcel.writeString(this.audioVid);
        parcel.writeInt(this.matchFactors);
        parcel.writeInt(this.isDraft ? 1 : 0);
        parcel.writeInt(this.origin);
        parcel.writeInt(this.isBackup ? 1 : 0);
        parcel.writeInt(this.queryTimes);
    }

    public OriginalSoundUploadTask(String str, String str2, String str3, long j, String str4, String str5, int i, boolean z, int i2, boolean z2, int i3) {
        this.awemeId = str;
        this.vid = str2;
        this.originalSoundPath = str3;
        this.updateTime = j;
        this.unionId = str4;
        this.audioVid = str5;
        this.matchFactors = i;
        this.isDraft = z;
        this.origin = i2;
        this.isBackup = z2;
        this.queryTimes = i3;
    }
}
