package com.ss.android.ugc.aweme.creative.model.music;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.MemeSoundMusicParam;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MemeSoundMusicParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<MemeSoundMusicParam> CREATOR = new Parcelable.Creator<MemeSoundMusicParam>() { // from class: X.0mhR
        @Override // android.os.Parcelable.Creator
        public final MemeSoundMusicParam createFromParcel(Parcel parcel) {
            return new MemeSoundMusicParam(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MemeSoundMusicParam[] newArray(int i) {
            return new MemeSoundMusicParam[i];
        }
    };

    @C09CT("meme_sound_music_duration")
    public final long duration;

    @C09CT("meme_sound_music_id")
    public final String musicId;

    @C09CT("meme_sound_music_name")
    public final String musicName;

    @C09CT("meme_sound_music_path")
    public final String path;

    public MemeSoundMusicParam() {
        this(null, 0L, null, null);
    }

    public final MemeSoundMusicParam copy(String str, long j, String str2, String str3) {
        return new MemeSoundMusicParam(str, j, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeSoundMusicParam)) {
            return false;
        }
        MemeSoundMusicParam memeSoundMusicParam = (MemeSoundMusicParam) obj;
        return Intrinsics.LJFF(this.path, memeSoundMusicParam.path) && this.duration == memeSoundMusicParam.duration && Intrinsics.LJFF(this.musicId, memeSoundMusicParam.musicId) && Intrinsics.LJFF(this.musicName, memeSoundMusicParam.musicName);
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.duration)) * 31;
        String str2 = this.musicId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.musicName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemeSoundMusicParam(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", musicName=");
        sbLIZ.append(this.musicName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeLong(this.duration);
        parcel.writeString(this.musicId);
        parcel.writeString(this.musicName);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final String getPath() {
        return this.path;
    }

    public MemeSoundMusicParam(String str, long j, String str2, String str3) {
        this.path = str;
        this.duration = j;
        this.musicId = str2;
        this.musicName = str3;
    }
}
