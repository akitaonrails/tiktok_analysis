package com.ss.android.ugc.aweme.creative.model.edit.multiedit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MusicSyncData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class MusicSyncData implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicSyncData> CREATOR = new Parcelable.Creator<MusicSyncData>() { // from class: X.0FP3
        @Override // android.os.Parcelable.Creator
        public final MusicSyncData createFromParcel(Parcel parcel) {
            return new MusicSyncData(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicSyncData[] newArray(int i) {
            return new MusicSyncData[i];
        }
    };

    @C09CT("music_sync_video_duration")
    public final long videoDuration;

    @C09CT("music_sync_end")
    public final long videoEnd;

    @C09CT("music_sync_start")
    public final long videoStart;

    public final MusicSyncData copy(long j, long j2, long j3) {
        return new MusicSyncData(j, j2, j3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicSyncData)) {
            return false;
        }
        MusicSyncData musicSyncData = (MusicSyncData) obj;
        return this.videoStart == musicSyncData.videoStart && this.videoEnd == musicSyncData.videoEnd && this.videoDuration == musicSyncData.videoDuration;
    }

    public int hashCode() {
        return (((C786410Ut5.Y2(this.videoStart) * 31) + C786410Ut5.Y2(this.videoEnd)) * 31) + C786410Ut5.Y2(this.videoDuration);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicSyncData(videoStart=");
        sbLIZ.append(this.videoStart);
        sbLIZ.append(", videoEnd=");
        sbLIZ.append(this.videoEnd);
        sbLIZ.append(", videoDuration=");
        sbLIZ.append(this.videoDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.videoStart);
        parcel.writeLong(this.videoEnd);
        parcel.writeLong(this.videoDuration);
    }

    public MusicSyncData() {
        this(0L, 0L, 0L);
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoEnd() {
        return this.videoEnd;
    }

    public final long getVideoStart() {
        return this.videoStart;
    }

    public MusicSyncData(long j, long j2, long j3) {
        this.videoStart = j;
        this.videoEnd = j2;
        this.videoDuration = j3;
    }
}
