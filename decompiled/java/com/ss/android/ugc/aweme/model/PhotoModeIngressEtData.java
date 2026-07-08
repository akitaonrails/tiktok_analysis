package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeIngressEtData implements Parcelable {
    public static final Parcelable.Creator<PhotoModeIngressEtData> CREATOR = new Parcelable.Creator<PhotoModeIngressEtData>() { // from class: X.0SB5
        @Override // android.os.Parcelable.Creator
        public final PhotoModeIngressEtData createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PhotoModeIngressEtData(z, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeIngressEtData[] newArray(int i) {
            return new PhotoModeIngressEtData[i];
        }
    };
    public String exploreFromGroupId;
    public boolean isVideoPlayFinishReported;
    public String paramsEventType;
    public long photoModeDuration;
    public long postModeDuration;
    public int remainingWordCountWithoutHashTag;
    public double startVolumeValue;
    public long timeStamp;
    public long videoPlayTimeAccumulated;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeIngressEtData)) {
            return false;
        }
        PhotoModeIngressEtData photoModeIngressEtData = (PhotoModeIngressEtData) obj;
        return this.isVideoPlayFinishReported == photoModeIngressEtData.isVideoPlayFinishReported && this.videoPlayTimeAccumulated == photoModeIngressEtData.videoPlayTimeAccumulated && this.photoModeDuration == photoModeIngressEtData.photoModeDuration && this.postModeDuration == photoModeIngressEtData.postModeDuration && Intrinsics.LJFF(this.paramsEventType, photoModeIngressEtData.paramsEventType) && Double.compare(this.startVolumeValue, photoModeIngressEtData.startVolumeValue) == 0 && this.remainingWordCountWithoutHashTag == photoModeIngressEtData.remainingWordCountWithoutHashTag && this.timeStamp == photoModeIngressEtData.timeStamp && Intrinsics.LJFF(this.exploreFromGroupId, photoModeIngressEtData.exploreFromGroupId);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((C786410Ut5.Z2(this.isVideoPlayFinishReported) * 31) + C786410Ut5.Y2(this.videoPlayTimeAccumulated)) * 31) + C786410Ut5.Y2(this.photoModeDuration)) * 31) + C786410Ut5.Y2(this.postModeDuration)) * 31) + this.paramsEventType.hashCode()) * 31) + C786410Ut5.X2(this.startVolumeValue)) * 31) + this.remainingWordCountWithoutHashTag) * 31) + C786410Ut5.Y2(this.timeStamp)) * 31;
        String str = this.exploreFromGroupId;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeIngressEtData(isVideoPlayFinishReported=");
        sbLIZ.append(this.isVideoPlayFinishReported);
        sbLIZ.append(", videoPlayTimeAccumulated=");
        sbLIZ.append(this.videoPlayTimeAccumulated);
        sbLIZ.append(", photoModeDuration=");
        sbLIZ.append(this.photoModeDuration);
        sbLIZ.append(", postModeDuration=");
        sbLIZ.append(this.postModeDuration);
        sbLIZ.append(", paramsEventType=");
        sbLIZ.append(this.paramsEventType);
        sbLIZ.append(", startVolumeValue=");
        sbLIZ.append(this.startVolumeValue);
        sbLIZ.append(", remainingWordCountWithoutHashTag=");
        sbLIZ.append(this.remainingWordCountWithoutHashTag);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.timeStamp);
        sbLIZ.append(", exploreFromGroupId=");
        sbLIZ.append(this.exploreFromGroupId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isVideoPlayFinishReported ? 1 : 0);
        parcel.writeLong(this.videoPlayTimeAccumulated);
        parcel.writeLong(this.photoModeDuration);
        parcel.writeLong(this.postModeDuration);
        parcel.writeString(this.paramsEventType);
        parcel.writeDouble(this.startVolumeValue);
        parcel.writeInt(this.remainingWordCountWithoutHashTag);
        parcel.writeLong(this.timeStamp);
        parcel.writeString(this.exploreFromGroupId);
    }

    public /* synthetic */ PhotoModeIngressEtData(String str, double d, long j) {
        this(false, 0L, 0L, 0L, str, d, 0, j, null);
    }

    public PhotoModeIngressEtData(boolean z, long j, long j2, long j3, String str, double d, int i, long j4, String str2) {
        this.isVideoPlayFinishReported = z;
        this.videoPlayTimeAccumulated = j;
        this.photoModeDuration = j2;
        this.postModeDuration = j3;
        this.paramsEventType = str;
        this.startVolumeValue = d;
        this.remainingWordCountWithoutHashTag = i;
        this.timeStamp = j4;
        this.exploreFromGroupId = str2;
    }
}
