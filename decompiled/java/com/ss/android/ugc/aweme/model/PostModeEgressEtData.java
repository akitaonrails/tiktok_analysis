package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC721170SQp;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeEgressEtData implements Parcelable {
    public static final Parcelable.Creator<PostModeEgressEtData> CREATOR = new Parcelable.Creator<PostModeEgressEtData>() { // from class: X.0SAu
        @Override // android.os.Parcelable.Creator
        public final PostModeEgressEtData createFromParcel(Parcel parcel) {
            boolean z;
            EnumC721170SQp enumC721170SQpValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            long j = parcel.readLong();
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                enumC721170SQpValueOf = null;
            } else {
                enumC721170SQpValueOf = EnumC721170SQp.valueOf(parcel.readString());
            }
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new PostModeEgressEtData(z, j, enumC721170SQpValueOf, j2, j3, j4, lValueOf, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PostModeEgressEtData[] newArray(int i) {
            return new PostModeEgressEtData[i];
        }
    };
    public EnumC721170SQp exitMethod;
    public boolean isVideoPlayFinishReported;
    public final Long leaveFullPageTime;
    public final int loopTimesInDetailPage;
    public long photoModeDuration;
    public long postModeDuration;
    public long timePlayerIsPaused;
    public long videoPlayTimeAccumulated;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PostModeEgressEtData() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        this(false, (EnumC721170SQp) null, j, j, j, (Long) (0 == true ? 1 : 0), (int) objArr, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModeEgressEtData)) {
            return false;
        }
        PostModeEgressEtData postModeEgressEtData = (PostModeEgressEtData) obj;
        return this.isVideoPlayFinishReported == postModeEgressEtData.isVideoPlayFinishReported && this.timePlayerIsPaused == postModeEgressEtData.timePlayerIsPaused && this.exitMethod == postModeEgressEtData.exitMethod && this.photoModeDuration == postModeEgressEtData.photoModeDuration && this.postModeDuration == postModeEgressEtData.postModeDuration && this.videoPlayTimeAccumulated == postModeEgressEtData.videoPlayTimeAccumulated && Intrinsics.LJFF(this.leaveFullPageTime, postModeEgressEtData.leaveFullPageTime) && this.loopTimesInDetailPage == postModeEgressEtData.loopTimesInDetailPage;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.isVideoPlayFinishReported) * 31) + C786410Ut5.Y2(this.timePlayerIsPaused)) * 31;
        EnumC721170SQp enumC721170SQp = this.exitMethod;
        int iHashCode = (((((((iZ2 + (enumC721170SQp == null ? 0 : enumC721170SQp.hashCode())) * 31) + C786410Ut5.Y2(this.photoModeDuration)) * 31) + C786410Ut5.Y2(this.postModeDuration)) * 31) + C786410Ut5.Y2(this.videoPlayTimeAccumulated)) * 31;
        Long l = this.leaveFullPageTime;
        return ((iHashCode + (l != null ? l.hashCode() : 0)) * 31) + this.loopTimesInDetailPage;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeEgressEtData(isVideoPlayFinishReported=");
        sbLIZ.append(this.isVideoPlayFinishReported);
        sbLIZ.append(", timePlayerIsPaused=");
        sbLIZ.append(this.timePlayerIsPaused);
        sbLIZ.append(", exitMethod=");
        sbLIZ.append(this.exitMethod);
        sbLIZ.append(", photoModeDuration=");
        sbLIZ.append(this.photoModeDuration);
        sbLIZ.append(", postModeDuration=");
        sbLIZ.append(this.postModeDuration);
        sbLIZ.append(", videoPlayTimeAccumulated=");
        sbLIZ.append(this.videoPlayTimeAccumulated);
        sbLIZ.append(", leaveFullPageTime=");
        sbLIZ.append(this.leaveFullPageTime);
        sbLIZ.append(", loopTimesInDetailPage=");
        sbLIZ.append(this.loopTimesInDetailPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isVideoPlayFinishReported ? 1 : 0);
        parcel.writeLong(this.timePlayerIsPaused);
        EnumC721170SQp enumC721170SQp = this.exitMethod;
        if (enumC721170SQp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC721170SQp.name());
        }
        parcel.writeLong(this.photoModeDuration);
        parcel.writeLong(this.postModeDuration);
        parcel.writeLong(this.videoPlayTimeAccumulated);
        Long l = this.leaveFullPageTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.loopTimesInDetailPage);
    }

    public /* synthetic */ PostModeEgressEtData(boolean z, EnumC721170SQp enumC721170SQp, long j, long j2, long j3, Long l, int i, int i2) {
        this((i2 & 1) != 0 ? false : z, 0L, (i2 & 4) != 0 ? null : enumC721170SQp, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? 0L : j3, (i2 & 64) == 0 ? l : null, (i2 & 128) == 0 ? i : 0);
    }

    public PostModeEgressEtData(boolean z, long j, EnumC721170SQp enumC721170SQp, long j2, long j3, long j4, Long l, int i) {
        this.isVideoPlayFinishReported = z;
        this.timePlayerIsPaused = j;
        this.exitMethod = enumC721170SQp;
        this.photoModeDuration = j2;
        this.postModeDuration = j3;
        this.videoPlayTimeAccumulated = j4;
        this.leaveFullPageTime = l;
        this.loopTimesInDetailPage = i;
    }
}
