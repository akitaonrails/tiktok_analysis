package com.ss.android.ugc.aweme.composer.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicShareStoryInputData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicShareStoryInputData> CREATOR = new Parcelable.Creator<MusicShareStoryInputData>() { // from class: X.0MOt
        @Override // android.os.Parcelable.Creator
        public final MusicShareStoryInputData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String string = parcel.readString();
            MusicModel musicModel = (MusicModel) parcel.readSerializable();
            String string2 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new MusicShareStoryInputData(urlModel, string, musicModel, string2, numValueOf, numValueOf2, (LyricStickerStruct) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicShareStoryInputData[] newArray(int i) {
            return new MusicShareStoryInputData[i];
        }
    };

    @C09CT("cover_uri")
    public String coverUri;

    @C09CT("cover_url")
    public UrlModel coverUrl;

    @C09CT("is_music_pop")
    public Integer isMusicPop;

    @C09CT("landing_back")
    public Integer landingBack;

    @C09CT("lyric_sticker")
    public LyricStickerStruct lyricStickerStruct;

    @C09CT("music")
    public MusicModel music;

    @C09CT("song_name")
    public String songName;

    public MusicShareStoryInputData() {
        this(null, null, new MusicModel(), null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.coverUrl);
        parcel.writeString(this.coverUri);
        parcel.writeSerializable(this.music);
        parcel.writeString(this.songName);
        Integer num = this.isMusicPop;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.landingBack;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeSerializable(this.lyricStickerStruct);
    }

    public final String getCoverUri() {
        return this.coverUri;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final Integer getLandingBack() {
        return this.landingBack;
    }

    public final LyricStickerStruct getLyricStickerStruct() {
        return this.lyricStickerStruct;
    }

    public final MusicModel getMusic() {
        return this.music;
    }

    public final String getSongName() {
        return this.songName;
    }

    public final Integer isMusicPop() {
        return this.isMusicPop;
    }

    public final void setCoverUri(String str) {
        this.coverUri = str;
    }

    public final void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public final void setLandingBack(Integer num) {
        this.landingBack = num;
    }

    public final void setLyricStickerStruct(LyricStickerStruct lyricStickerStruct) {
        this.lyricStickerStruct = lyricStickerStruct;
    }

    public final void setMusic(MusicModel musicModel) {
        this.music = musicModel;
    }

    public final void setMusicPop(Integer num) {
        this.isMusicPop = num;
    }

    public final void setSongName(String str) {
        this.songName = str;
    }

    public MusicShareStoryInputData(UrlModel urlModel, String str, MusicModel musicModel, String str2, Integer num, Integer num2, LyricStickerStruct lyricStickerStruct) {
        this.coverUrl = urlModel;
        this.coverUri = str;
        this.music = musicModel;
        this.songName = str2;
        this.isMusicPop = num;
        this.landingBack = num2;
        this.lyricStickerStruct = lyricStickerStruct;
    }
}
