package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicShareStoryData implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicShareStoryData> CREATOR = new Parcelable.Creator<MusicShareStoryData>() { // from class: X.0MOb
        @Override // android.os.Parcelable.Creator
        public final MusicShareStoryData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            String string = parcel.readString();
            Effect effect = (Effect) parcel.readParcelable(MusicShareStoryData.class.getClassLoader());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            Integer numValueOf5 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            return new MusicShareStoryData(string, effect, i, i2, numValueOf, numValueOf2, numValueOf3, string2, string3, numValueOf4, numValueOf5, (LyricStickerStruct) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicShareStoryData[] newArray(int i) {
            return new MusicShareStoryData[i];
        }
    };

    @C09CT("artist_name")
    public final String artistName;

    @C09CT("bg_end_color")
    public final int bgEndColor;

    @C09CT("bg_start_color")
    public final int bgStartColor;

    @C09CT("card_bg_color")
    public final Integer cardBgColor;

    @C09CT("cover_path")
    @C0MY0
    public final String coverPath;

    @C09CT("is_music_pop")
    public final Integer isMusicPop;

    @C040H
    public final Integer landingBack;

    @C040H
    public final LyricStickerStruct lyricStickerStruct;

    @C09CT("song_name")
    public final String songName;

    @C040H
    public final Effect sticker;

    @C09CT("text_color")
    public final Integer textColor;

    @C09CT("volume_color")
    public final Integer waveColor;

    public MusicShareStoryData() {
        this(null, null, -16777216, -16777216, null, null, null, null, null, null, null, null);
    }

    public final MusicShareStoryData copy(String str, Effect effect, int i, int i2, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Integer num5, LyricStickerStruct lyricStickerStruct) {
        return new MusicShareStoryData(str, effect, i, i2, num, num2, num3, str2, str3, num4, num5, lyricStickerStruct);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicShareStoryData)) {
            return false;
        }
        MusicShareStoryData musicShareStoryData = (MusicShareStoryData) obj;
        return Intrinsics.LJFF(this.coverPath, musicShareStoryData.coverPath) && Intrinsics.LJFF(this.sticker, musicShareStoryData.sticker) && this.bgStartColor == musicShareStoryData.bgStartColor && this.bgEndColor == musicShareStoryData.bgEndColor && Intrinsics.LJFF(this.cardBgColor, musicShareStoryData.cardBgColor) && Intrinsics.LJFF(this.textColor, musicShareStoryData.textColor) && Intrinsics.LJFF(this.waveColor, musicShareStoryData.waveColor) && Intrinsics.LJFF(this.songName, musicShareStoryData.songName) && Intrinsics.LJFF(this.artistName, musicShareStoryData.artistName) && Intrinsics.LJFF(this.isMusicPop, musicShareStoryData.isMusicPop) && Intrinsics.LJFF(this.landingBack, musicShareStoryData.landingBack) && Intrinsics.LJFF(this.lyricStickerStruct, musicShareStoryData.lyricStickerStruct);
    }

    public int hashCode() {
        String str = this.coverPath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Effect effect = this.sticker;
        int iHashCode2 = (((((iHashCode + (effect == null ? 0 : effect.hashCode())) * 31) + this.bgStartColor) * 31) + this.bgEndColor) * 31;
        Integer num = this.cardBgColor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColor;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.waveColor;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.songName;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.artistName;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.isMusicPop;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.landingBack;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        LyricStickerStruct lyricStickerStruct = this.lyricStickerStruct;
        return iHashCode9 + (lyricStickerStruct != null ? lyricStickerStruct.hashCode() : 0);
    }

    public String toString() {
        return "MusicShareStoryData(coverPath=" + this.coverPath + ", sticker=" + this.sticker + ", bgStartColor=" + this.bgStartColor + ", bgEndColor=" + this.bgEndColor + ", cardBgColor=" + this.cardBgColor + ", textColor=" + this.textColor + ", waveColor=" + this.waveColor + ", songName=" + this.songName + ", artistName=" + this.artistName + ", isMusicPop=" + this.isMusicPop + ", landingBack=" + this.landingBack + ", lyricStickerStruct=" + this.lyricStickerStruct + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.coverPath);
        parcel.writeParcelable(this.sticker, i);
        parcel.writeInt(this.bgStartColor);
        parcel.writeInt(this.bgEndColor);
        Integer num = this.cardBgColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.textColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.waveColor;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.songName);
        parcel.writeString(this.artistName);
        Integer num4 = this.isMusicPop;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.landingBack;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeSerializable(this.lyricStickerStruct);
    }

    public final String getArtistName() {
        return this.artistName;
    }

    public final int getBgEndColor() {
        return this.bgEndColor;
    }

    public final int getBgStartColor() {
        return this.bgStartColor;
    }

    public final Integer getCardBgColor() {
        return this.cardBgColor;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final Integer getLandingBack() {
        return this.landingBack;
    }

    public final LyricStickerStruct getLyricStickerStruct() {
        return this.lyricStickerStruct;
    }

    public final String getSongName() {
        return this.songName;
    }

    public final Effect getSticker() {
        return this.sticker;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final Integer getWaveColor() {
        return this.waveColor;
    }

    public final Integer isMusicPop() {
        return this.isMusicPop;
    }

    public MusicShareStoryData(String str, Effect effect, int i, int i2, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Integer num5, LyricStickerStruct lyricStickerStruct) {
        this.coverPath = str;
        this.sticker = effect;
        this.bgStartColor = i;
        this.bgEndColor = i2;
        this.cardBgColor = num;
        this.textColor = num2;
        this.waveColor = num3;
        this.songName = str2;
        this.artistName = str3;
        this.isMusicPop = num4;
        this.landingBack = num5;
        this.lyricStickerStruct = lyricStickerStruct;
    }
}
