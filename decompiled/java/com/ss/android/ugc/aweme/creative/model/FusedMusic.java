package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0L81;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class FusedMusic implements Parcelable, Serializable {
    public static final C0L81 CREATOR = new C0L81();

    @C09CT("end_time_in_ms")
    public final long endTimeInMs;

    @C09CT("index")
    public final int index;

    @C09CT("is_main_song")
    public final boolean isMainSong;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("play_start_time_in_ms")
    public final long playStartTimeInMs;

    @C09CT("start_time_in_ms")
    public final long startTimeInMs;

    @C09CT("volume")
    public final Double volume;

    public FusedMusic() {
        this(-1, 0L, 0L, "", 0L, false, null);
    }

    public final FusedMusic copy(int i, long j, long j2, String str, long j3, boolean z, Double d) {
        return new FusedMusic(i, j, j2, str, j3, z, d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FusedMusic)) {
            return false;
        }
        FusedMusic fusedMusic = (FusedMusic) obj;
        return this.index == fusedMusic.index && this.startTimeInMs == fusedMusic.startTimeInMs && this.endTimeInMs == fusedMusic.endTimeInMs && Intrinsics.LJFF(this.musicId, fusedMusic.musicId) && this.playStartTimeInMs == fusedMusic.playStartTimeInMs && this.isMainSong == fusedMusic.isMainSong && Intrinsics.LJFF(this.volume, fusedMusic.volume);
    }

    public int hashCode() {
        int iY2 = ((((((((((this.index * 31) + C786410Ut5.Y2(this.startTimeInMs)) * 31) + C786410Ut5.Y2(this.endTimeInMs)) * 31) + this.musicId.hashCode()) * 31) + C786410Ut5.Y2(this.playStartTimeInMs)) * 31) + C786410Ut5.Z2(this.isMainSong)) * 31;
        Double d = this.volume;
        return iY2 + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FusedMusic(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", startTimeInMs=");
        sbLIZ.append(this.startTimeInMs);
        sbLIZ.append(", endTimeInMs=");
        sbLIZ.append(this.endTimeInMs);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", playStartTimeInMs=");
        sbLIZ.append(this.playStartTimeInMs);
        sbLIZ.append(", isMainSong=");
        sbLIZ.append(this.isMainSong);
        sbLIZ.append(", volume=");
        sbLIZ.append(this.volume);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getEndTimeInMs() {
        return this.endTimeInMs;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final long getPlayStartTimeInMs() {
        return this.playStartTimeInMs;
    }

    public final long getStartTimeInMs() {
        return this.startTimeInMs;
    }

    public final Double getVolume() {
        return this.volume;
    }

    public final boolean isMainSong() {
        return this.isMainSong;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeLong(this.startTimeInMs);
        parcel.writeLong(this.endTimeInMs);
        parcel.writeString(this.musicId);
        parcel.writeLong(this.playStartTimeInMs);
        parcel.writeInt(this.isMainSong ? 1 : 0);
        parcel.writeValue(this.volume);
    }

    public FusedMusic(int i, long j, long j2, String str, long j3, boolean z, Double d) {
        this.index = i;
        this.startTimeInMs = j;
        this.endTimeInMs = j2;
        this.musicId = str;
        this.playStartTimeInMs = j3;
        this.isMainSong = z;
        this.volume = d;
    }
}
