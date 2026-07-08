package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.SongInfo;

/* JADX INFO: loaded from: classes15.dex */
public final class SongInfo implements Parcelable {
    public static final Parcelable.Creator<SongInfo> CREATOR = new Parcelable.Creator<SongInfo>() { // from class: X.0ZBk
        @Override // android.os.Parcelable.Creator
        public final SongInfo createFromParcel(Parcel parcel) {
            return new SongInfo(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SongInfo[] newArray(int i) {
            return new SongInfo[i];
        }
    };

    @C040H
    @C09CT("music_id")
    public final long musicId;

    @C040H
    @C09CT("name")
    public final String name;

    @C040H
    @C09CT("song_id")
    public final long songId;

    @C040H
    @C09CT("url")
    public final String url;

    @C040H
    @C09CT("vid")
    public final String vid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.songId);
        parcel.writeString(this.name);
        parcel.writeString(this.vid);
        parcel.writeString(this.url);
        parcel.writeLong(this.musicId);
    }

    public SongInfo() {
        this(0L, "", "", "", 0L);
    }

    public SongInfo(long j, String str, String str2, String str3, long j2) {
        this.songId = j;
        this.name = str;
        this.vid = str2;
        this.url = str3;
        this.musicId = j2;
    }
}
