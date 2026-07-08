package com.ss.android.ugc.aweme.creative.model.music;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.LyricStruct;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MemeSongInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicObject implements Parcelable {
    public static final Parcelable.Creator<MusicObject> CREATOR = new Parcelable.Creator<MusicObject>() { // from class: X.0MLr
        @Override // android.os.Parcelable.Creator
        public final MusicObject createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Boolean boolValueOf;
            boolean z5;
            boolean z6;
            ArrayList arrayList;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            ArrayList arrayList2;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            UrlModel urlModel2 = (UrlModel) parcel.readSerializable();
            UrlModel urlModel3 = (UrlModel) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            MusicHighPrecisionDuration musicHighPrecisionDuration = (MusicHighPrecisionDuration) parcel.readParcelable(MusicObject.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            String string4 = parcel.readString();
            MatchedPGCSoundInfo matchedPGCSoundInfo = (MatchedPGCSoundInfo) parcel.readSerializable();
            MatchedSoundInfo matchedSoundInfo = (MatchedSoundInfo) parcel.readSerializable();
            long j2 = parcel.readLong();
            int i4 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            MusicBeat musicBeat = (MusicBeat) parcel.readParcelable(MusicObject.class.getClassLoader());
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            String string7 = parcel.readString();
            int i10 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String string8 = parcel.readString();
            UrlModel urlModel4 = (UrlModel) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            float f = parcel.readFloat();
            UrlModel urlModel5 = (UrlModel) parcel.readSerializable();
            UrlModel urlModel6 = (UrlModel) parcel.readSerializable();
            int i11 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readSerializable());
                }
            }
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            MemeSongInfo memeSongInfo = (MemeSongInfo) parcel.readSerializable();
            MemeSongModel memeSongModel = (MemeSongModel) parcel.readSerializable();
            FullSongDetail fullSongDetail = (FullSongDetail) parcel.readSerializable();
            int i16 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (parcel.readInt() != 0) {
                int i17 = parcel.readInt();
                arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(parcel.readSerializable());
                }
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            int i19 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            return new MusicObject(j, string, string2, i, i2, i3, urlModel, urlModel2, urlModel3, z, musicHighPrecisionDuration, string3, z2, z3, boolValueOf, z5, z6, string4, matchedPGCSoundInfo, matchedSoundInfo, j2, i4, string5, string6, i5, arrayList, z7, z8, musicBeat, i8, i9, string7, i10, z9, z10, string8, urlModel4, z11, f, urlModel5, urlModel6, i11, arrayList2, i14, i15, z12, z13, memeSongInfo, memeSongModel, fullSongDetail, i16, z14, z15, arrayList3, string9, string10, z16, i19, z17, parcel.readString(), parcel.readLong(), parcel.readLong(), MusicCompatModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MusicObject[] newArray(int i) {
            return new MusicObject[i];
        }
    };

    @C09CT("album")
    public final String album;

    @C09CT("audition_duration")
    public final int auditionDuration;

    @C09CT("author")
    public final String authorName;

    @C09CT("beat_info")
    public final MusicBeat beatInfo;

    @C09CT("can_be_stitched")
    public final boolean canBeStitched;

    @C09CT("clip_shoot_duration")
    public int clipShootDuration;

    @C09CT("commercial_right_type")
    public final int commercialRightType;

    @C09CT("cover_large")
    public final UrlModel coverLarge;

    @C09CT("cover_medium")
    public final UrlModel coverMedium;

    @C09CT("cover_thumb")
    public final UrlModel coverThumb;

    @C09CT("dmv_auto_show")
    public final boolean dmvAutoShow;

    @C09CT("duration")
    public int duration;

    @C09CT("duration_high_precision")
    public MusicHighPrecisionDuration durationHighPrecision;

    @C09CT("extra")
    public final String extra;

    @C09CT("full_song")
    public final FullSongDetail fullSongDetail;

    @C09CT("has_commerce_right")
    public final boolean hasCommerceRight;

    @C09CT("has_commerce_right_strict")
    public final Boolean hasCommerceRightStrict;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("is_commerce_music")
    public final boolean isCommerceMusic;

    @C09CT("is_feed_pre_download_mdp")
    public int isFeedPreDownloadMdp;

    @C09CT("is_full_song")
    public boolean isFullSong;

    @C09CT("is_new_release_music")
    public final boolean isNewReleaseMusic;

    @C09CT("is_offline_music")
    public boolean isOfflineMusic;

    @C09CT("is_original_sound")
    public final boolean isOriginalSound;

    @C09CT("is_pgc")
    public final boolean isPgc;

    @C09CT("is_sami_recommend")
    public boolean isSamiRecommend;

    @C09CT("is_offline_similar_music")
    public boolean isSimilarMusic;

    @C09CT("is_trimming_limited")
    public boolean isTrimmingLimited;

    @C09CT("is_unlimited_music")
    public final boolean isUnlimitedMusic;

    @C09CT("local_music_id")
    public final long localMusicId;

    @C09CT("lyric_type")
    public final int lrcType;

    @C09CT("lyric_url")
    public final String lrcUrl;

    @C09CT("lyric_content")
    public String lyricContent;

    @C09CT("lyric_content_type")
    public int lyricContentType;

    @C09CT("lyrics")
    public final List<LyricStruct> lyrics;

    @C09CT("matched_PGC_Sound_Info")
    public final MatchedPGCSoundInfo matchedPGCSoundInfo;

    @C09CT("matched_song")
    public final MatchedSoundInfo matchedSongInfo;

    @C09CT("meme_song")
    public final MemeSongModel memeSong;

    @C09CT("meme_song_info")
    public final MemeSongInfo memeSongInfo;

    @C09CT("meme_song_models")
    public final List<MemeSongModel> memeSongModels;

    @C09CT("meta_song_id")
    public final String metaSongID;

    @C09CT("music_begin_time_in_ms")
    public final int musicBeginTime;

    @C09CT("music_compat_model")
    public MusicCompatModel musicCompatModel;

    @C09CT("music_end_time_in_ms")
    public final int musicEndTime;

    @C09CT("title")
    public final String musicName;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int musicStatus;

    @C09CT("tag_list")
    public final List<MusicTag> musicTags;

    @C09CT("mute_share")
    public final boolean muteShare;

    @C09CT("is_audio_url_with_cookie")
    public final boolean needSetCookie;

    @C09CT("offline_desc")
    public final String offlineDesc;

    @C09CT("play_url")
    public final UrlModel playUrl;

    @C09CT("prevent_download")
    public final boolean preventDownload;

    @C09CT("preview_start_time")
    public final float previewStartTime;

    @C09CT("promo_id")
    public String promoId;

    @C09CT("promotion_tag")
    public String promotionTag;

    @C09CT("recall_reason")
    public final String recallReason;

    @C09CT("reuse_audio_play_url")
    public final UrlModel reuseAudioPlayUrl;

    @C09CT("same_group_id_v3")
    public final long sameGroupIdV3;

    @C09CT("shoot_duration")
    public final int shootDuration;

    @C09CT("sim_group_id_v3")
    public final long simGroupIdV3;

    @C09CT("strong_beat_url")
    public final UrlModel strongBeatUrl;

    @C09CT("user_count")
    public final int userCount;

    @C09CT("video_duration")
    public final int videoDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MusicObject() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        this(j, null, objArr, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2, objArr3, objArr4, 0 == true ? 1 : 0, objArr5, objArr6, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr7, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr8, objArr9, objArr10, j, 0 == true ? 1 : 0, objArr11, objArr12, 0 == true ? 1 : 0, objArr13, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr14, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr15, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr16, objArr17, 0 == true ? 1 : 0, 0.0f, objArr18, objArr19, 0 == true ? 1 : 0, objArr20, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr21, objArr22, objArr23, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr27, j, j, objArr28, -1, Integer.MAX_VALUE, objArr29);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicObject)) {
            return false;
        }
        MusicObject musicObject = (MusicObject) obj;
        return this.id == musicObject.id && Intrinsics.LJFF(this.album, musicObject.album) && Intrinsics.LJFF(this.authorName, musicObject.authorName) && this.duration == musicObject.duration && this.auditionDuration == musicObject.auditionDuration && this.shootDuration == musicObject.shootDuration && Intrinsics.LJFF(this.coverLarge, musicObject.coverLarge) && Intrinsics.LJFF(this.coverMedium, musicObject.coverMedium) && Intrinsics.LJFF(this.coverThumb, musicObject.coverThumb) && this.dmvAutoShow == musicObject.dmvAutoShow && Intrinsics.LJFF(this.durationHighPrecision, musicObject.durationHighPrecision) && Intrinsics.LJFF(this.extra, musicObject.extra) && this.isCommerceMusic == musicObject.isCommerceMusic && this.hasCommerceRight == musicObject.hasCommerceRight && Intrinsics.LJFF(this.hasCommerceRightStrict, musicObject.hasCommerceRightStrict) && this.isOriginalSound == musicObject.isOriginalSound && this.isPgc == musicObject.isPgc && Intrinsics.LJFF(this.metaSongID, musicObject.metaSongID) && Intrinsics.LJFF(this.matchedPGCSoundInfo, musicObject.matchedPGCSoundInfo) && Intrinsics.LJFF(this.matchedSongInfo, musicObject.matchedSongInfo) && this.localMusicId == musicObject.localMusicId && this.lrcType == musicObject.lrcType && Intrinsics.LJFF(this.lrcUrl, musicObject.lrcUrl) && Intrinsics.LJFF(this.lyricContent, musicObject.lyricContent) && this.lyricContentType == musicObject.lyricContentType && Intrinsics.LJFF(this.lyrics, musicObject.lyrics) && this.isOfflineMusic == musicObject.isOfflineMusic && this.isSimilarMusic == musicObject.isSimilarMusic && Intrinsics.LJFF(this.beatInfo, musicObject.beatInfo) && this.musicBeginTime == musicObject.musicBeginTime && this.musicEndTime == musicObject.musicEndTime && Intrinsics.LJFF(this.musicName, musicObject.musicName) && this.musicStatus == musicObject.musicStatus && this.muteShare == musicObject.muteShare && this.needSetCookie == musicObject.needSetCookie && Intrinsics.LJFF(this.offlineDesc, musicObject.offlineDesc) && Intrinsics.LJFF(this.playUrl, musicObject.playUrl) && this.preventDownload == musicObject.preventDownload && Float.compare(this.previewStartTime, musicObject.previewStartTime) == 0 && Intrinsics.LJFF(this.reuseAudioPlayUrl, musicObject.reuseAudioPlayUrl) && Intrinsics.LJFF(this.strongBeatUrl, musicObject.strongBeatUrl) && this.userCount == musicObject.userCount && Intrinsics.LJFF(this.musicTags, musicObject.musicTags) && this.videoDuration == musicObject.videoDuration && this.commercialRightType == musicObject.commercialRightType && this.isNewReleaseMusic == musicObject.isNewReleaseMusic && this.isSamiRecommend == musicObject.isSamiRecommend && Intrinsics.LJFF(this.memeSongInfo, musicObject.memeSongInfo) && Intrinsics.LJFF(this.memeSong, musicObject.memeSong) && Intrinsics.LJFF(this.fullSongDetail, musicObject.fullSongDetail) && this.clipShootDuration == musicObject.clipShootDuration && this.isFullSong == musicObject.isFullSong && this.isTrimmingLimited == musicObject.isTrimmingLimited && Intrinsics.LJFF(this.memeSongModels, musicObject.memeSongModels) && Intrinsics.LJFF(this.promoId, musicObject.promoId) && Intrinsics.LJFF(this.recallReason, musicObject.recallReason) && this.isUnlimitedMusic == musicObject.isUnlimitedMusic && this.isFeedPreDownloadMdp == musicObject.isFeedPreDownloadMdp && this.canBeStitched == musicObject.canBeStitched && Intrinsics.LJFF(this.promotionTag, musicObject.promotionTag) && this.sameGroupIdV3 == musicObject.sameGroupIdV3 && this.simGroupIdV3 == musicObject.simGroupIdV3 && Intrinsics.LJFF(this.musicCompatModel, musicObject.musicCompatModel);
    }

    public final String toString() {
        return "MusicObject(id=" + this.id + ", album=" + this.album + ", authorName=" + this.authorName + ", duration=" + this.duration + ", auditionDuration=" + this.auditionDuration + ", shootDuration=" + this.shootDuration + ", coverLarge=" + this.coverLarge + ", coverMedium=" + this.coverMedium + ", coverThumb=" + this.coverThumb + ", dmvAutoShow=" + this.dmvAutoShow + ", durationHighPrecision=" + this.durationHighPrecision + ", extra=" + this.extra + ", isCommerceMusic=" + this.isCommerceMusic + ", hasCommerceRight=" + this.hasCommerceRight + ", hasCommerceRightStrict=" + this.hasCommerceRightStrict + ", isOriginalSound=" + this.isOriginalSound + ", isPgc=" + this.isPgc + ", metaSongID=" + this.metaSongID + ", matchedPGCSoundInfo=" + this.matchedPGCSoundInfo + ", matchedSongInfo=" + this.matchedSongInfo + ", localMusicId=" + this.localMusicId + ", lrcType=" + this.lrcType + ", lrcUrl=" + this.lrcUrl + ", lyricContent=" + this.lyricContent + ", lyricContentType=" + this.lyricContentType + ", lyrics=" + this.lyrics + ", isOfflineMusic=" + this.isOfflineMusic + ", isSimilarMusic=" + this.isSimilarMusic + ", beatInfo=" + this.beatInfo + ", musicBeginTime=" + this.musicBeginTime + ", musicEndTime=" + this.musicEndTime + ", musicName=" + this.musicName + ", musicStatus=" + this.musicStatus + ", muteShare=" + this.muteShare + ", needSetCookie=" + this.needSetCookie + ", offlineDesc=" + this.offlineDesc + ", playUrl=" + this.playUrl + ", preventDownload=" + this.preventDownload + ", previewStartTime=" + this.previewStartTime + ", reuseAudioPlayUrl=" + this.reuseAudioPlayUrl + ", strongBeatUrl=" + this.strongBeatUrl + ", userCount=" + this.userCount + ", musicTags=" + this.musicTags + ", videoDuration=" + this.videoDuration + ", commercialRightType=" + this.commercialRightType + ", isNewReleaseMusic=" + this.isNewReleaseMusic + ", isSamiRecommend=" + this.isSamiRecommend + ", memeSongInfo=" + this.memeSongInfo + ", memeSong=" + this.memeSong + ", fullSongDetail=" + this.fullSongDetail + ", clipShootDuration=" + this.clipShootDuration + ", isFullSong=" + this.isFullSong + ", isTrimmingLimited=" + this.isTrimmingLimited + ", memeSongModels=" + this.memeSongModels + ", promoId=" + this.promoId + ", recallReason=" + this.recallReason + ", isUnlimitedMusic=" + this.isUnlimitedMusic + ", isFeedPreDownloadMdp=" + this.isFeedPreDownloadMdp + ", canBeStitched=" + this.canBeStitched + ", promotionTag=" + this.promotionTag + ", sameGroupIdV3=" + this.sameGroupIdV3 + ", simGroupIdV3=" + this.simGroupIdV3 + ", musicCompatModel=" + this.musicCompatModel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.album);
        parcel.writeString(this.authorName);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.auditionDuration);
        parcel.writeInt(this.shootDuration);
        parcel.writeSerializable(this.coverLarge);
        parcel.writeSerializable(this.coverMedium);
        parcel.writeSerializable(this.coverThumb);
        parcel.writeInt(this.dmvAutoShow ? 1 : 0);
        parcel.writeParcelable(this.durationHighPrecision, i);
        parcel.writeString(this.extra);
        parcel.writeInt(this.isCommerceMusic ? 1 : 0);
        parcel.writeInt(this.hasCommerceRight ? 1 : 0);
        Boolean bool = this.hasCommerceRightStrict;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isOriginalSound ? 1 : 0);
        parcel.writeInt(this.isPgc ? 1 : 0);
        parcel.writeString(this.metaSongID);
        parcel.writeSerializable(this.matchedPGCSoundInfo);
        parcel.writeSerializable(this.matchedSongInfo);
        parcel.writeLong(this.localMusicId);
        parcel.writeInt(this.lrcType);
        parcel.writeString(this.lrcUrl);
        parcel.writeString(this.lyricContent);
        parcel.writeInt(this.lyricContentType);
        List<LyricStruct> list = this.lyrics;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LyricStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeInt(this.isOfflineMusic ? 1 : 0);
        parcel.writeInt(this.isSimilarMusic ? 1 : 0);
        parcel.writeParcelable(this.beatInfo, i);
        parcel.writeInt(this.musicBeginTime);
        parcel.writeInt(this.musicEndTime);
        parcel.writeString(this.musicName);
        parcel.writeInt(this.musicStatus);
        parcel.writeInt(this.muteShare ? 1 : 0);
        parcel.writeInt(this.needSetCookie ? 1 : 0);
        parcel.writeString(this.offlineDesc);
        parcel.writeSerializable(this.playUrl);
        parcel.writeInt(this.preventDownload ? 1 : 0);
        parcel.writeFloat(this.previewStartTime);
        parcel.writeSerializable(this.reuseAudioPlayUrl);
        parcel.writeSerializable(this.strongBeatUrl);
        parcel.writeInt(this.userCount);
        List<MusicTag> list2 = this.musicTags;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<MusicTag> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeSerializable(it3.next());
            }
        }
        parcel.writeInt(this.videoDuration);
        parcel.writeInt(this.commercialRightType);
        parcel.writeInt(this.isNewReleaseMusic ? 1 : 0);
        parcel.writeInt(this.isSamiRecommend ? 1 : 0);
        parcel.writeSerializable(this.memeSongInfo);
        parcel.writeSerializable(this.memeSong);
        parcel.writeSerializable(this.fullSongDetail);
        parcel.writeInt(this.clipShootDuration);
        parcel.writeInt(this.isFullSong ? 1 : 0);
        parcel.writeInt(this.isTrimmingLimited ? 1 : 0);
        List<MemeSongModel> list3 = this.memeSongModels;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<MemeSongModel> it4 = list3.iterator();
            while (it4.hasNext()) {
                parcel.writeSerializable(it4.next());
            }
        }
        parcel.writeString(this.promoId);
        parcel.writeString(this.recallReason);
        parcel.writeInt(this.isUnlimitedMusic ? 1 : 0);
        parcel.writeInt(this.isFeedPreDownloadMdp);
        parcel.writeInt(this.canBeStitched ? 1 : 0);
        parcel.writeString(this.promotionTag);
        parcel.writeLong(this.sameGroupIdV3);
        parcel.writeLong(this.simGroupIdV3);
        this.musicCompatModel.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.id) * 31;
        String str = this.album;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorName;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.duration) * 31) + this.auditionDuration) * 31) + this.shootDuration) * 31;
        UrlModel urlModel = this.coverLarge;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.coverMedium;
        int iHashCode4 = (iHashCode3 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        UrlModel urlModel3 = this.coverThumb;
        int iHashCode5 = (((iHashCode4 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31) + C786410Ut5.Z2(this.dmvAutoShow)) * 31;
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        int iHashCode6 = (iHashCode5 + (musicHighPrecisionDuration == null ? 0 : musicHighPrecisionDuration.hashCode())) * 31;
        String str3 = this.extra;
        int iHashCode7 = (((((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.isCommerceMusic)) * 31) + C786410Ut5.Z2(this.hasCommerceRight)) * 31;
        Boolean bool = this.hasCommerceRightStrict;
        int iHashCode8 = (((((((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.isOriginalSound)) * 31) + C786410Ut5.Z2(this.isPgc)) * 31) + this.metaSongID.hashCode()) * 31;
        MatchedPGCSoundInfo matchedPGCSoundInfo = this.matchedPGCSoundInfo;
        int iHashCode9 = (iHashCode8 + (matchedPGCSoundInfo == null ? 0 : matchedPGCSoundInfo.hashCode())) * 31;
        MatchedSoundInfo matchedSoundInfo = this.matchedSongInfo;
        int iHashCode10 = (((((iHashCode9 + (matchedSoundInfo == null ? 0 : matchedSoundInfo.hashCode())) * 31) + C786410Ut5.Y2(this.localMusicId)) * 31) + this.lrcType) * 31;
        String str4 = this.lrcUrl;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lyricContent;
        int iHashCode12 = (((iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.lyricContentType) * 31;
        List<LyricStruct> list = this.lyrics;
        int iHashCode13 = (((((iHashCode12 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.isOfflineMusic)) * 31) + C786410Ut5.Z2(this.isSimilarMusic)) * 31;
        MusicBeat musicBeat = this.beatInfo;
        int iHashCode14 = (((((iHashCode13 + (musicBeat == null ? 0 : musicBeat.hashCode())) * 31) + this.musicBeginTime) * 31) + this.musicEndTime) * 31;
        String str6 = this.musicName;
        int iHashCode15 = (((((((iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.musicStatus) * 31) + C786410Ut5.Z2(this.muteShare)) * 31) + C786410Ut5.Z2(this.needSetCookie)) * 31;
        String str7 = this.offlineDesc;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        UrlModel urlModel4 = this.playUrl;
        int iHashCode17 = (((((iHashCode16 + (urlModel4 == null ? 0 : urlModel4.hashCode())) * 31) + C786410Ut5.Z2(this.preventDownload)) * 31) + Float.floatToIntBits(this.previewStartTime)) * 31;
        UrlModel urlModel5 = this.reuseAudioPlayUrl;
        int iHashCode18 = (iHashCode17 + (urlModel5 == null ? 0 : urlModel5.hashCode())) * 31;
        UrlModel urlModel6 = this.strongBeatUrl;
        int iHashCode19 = (((iHashCode18 + (urlModel6 == null ? 0 : urlModel6.hashCode())) * 31) + this.userCount) * 31;
        List<MusicTag> list2 = this.musicTags;
        int iHashCode20 = (((((((((iHashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.videoDuration) * 31) + this.commercialRightType) * 31) + C786410Ut5.Z2(this.isNewReleaseMusic)) * 31) + C786410Ut5.Z2(this.isSamiRecommend)) * 31;
        MemeSongInfo memeSongInfo = this.memeSongInfo;
        int iHashCode21 = (iHashCode20 + (memeSongInfo == null ? 0 : memeSongInfo.hashCode())) * 31;
        MemeSongModel memeSongModel = this.memeSong;
        int iHashCode22 = (iHashCode21 + (memeSongModel == null ? 0 : memeSongModel.hashCode())) * 31;
        FullSongDetail fullSongDetail = this.fullSongDetail;
        int iHashCode23 = (((((((iHashCode22 + (fullSongDetail == null ? 0 : fullSongDetail.hashCode())) * 31) + this.clipShootDuration) * 31) + C786410Ut5.Z2(this.isFullSong)) * 31) + C786410Ut5.Z2(this.isTrimmingLimited)) * 31;
        List<MemeSongModel> list3 = this.memeSongModels;
        int iHashCode24 = (iHashCode23 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str8 = this.promoId;
        int iHashCode25 = (iHashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.recallReason;
        int iHashCode26 = (((((((iHashCode25 + (str9 == null ? 0 : str9.hashCode())) * 31) + C786410Ut5.Z2(this.isUnlimitedMusic)) * 31) + this.isFeedPreDownloadMdp) * 31) + C786410Ut5.Z2(this.canBeStitched)) * 31;
        String str10 = this.promotionTag;
        return ((((((iHashCode26 + (str10 != null ? str10.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.sameGroupIdV3)) * 31) + C786410Ut5.Y2(this.simGroupIdV3)) * 31) + this.musicCompatModel.hashCode();
    }

    public static MusicObject LIZ(MusicObject musicObject, int i) {
        return new MusicObject(musicObject.id, musicObject.album, musicObject.authorName, i, musicObject.auditionDuration, musicObject.shootDuration, musicObject.coverLarge, musicObject.coverMedium, musicObject.coverThumb, musicObject.dmvAutoShow, musicObject.durationHighPrecision, musicObject.extra, musicObject.isCommerceMusic, musicObject.hasCommerceRight, musicObject.hasCommerceRightStrict, musicObject.isOriginalSound, musicObject.isPgc, musicObject.metaSongID, musicObject.matchedPGCSoundInfo, musicObject.matchedSongInfo, musicObject.localMusicId, musicObject.lrcType, musicObject.lrcUrl, musicObject.lyricContent, musicObject.lyricContentType, musicObject.lyrics, musicObject.isOfflineMusic, musicObject.isSimilarMusic, musicObject.beatInfo, musicObject.musicBeginTime, musicObject.musicEndTime, musicObject.musicName, musicObject.musicStatus, musicObject.muteShare, musicObject.needSetCookie, musicObject.offlineDesc, musicObject.playUrl, musicObject.preventDownload, musicObject.previewStartTime, musicObject.reuseAudioPlayUrl, musicObject.strongBeatUrl, musicObject.userCount, musicObject.musicTags, musicObject.videoDuration, musicObject.commercialRightType, musicObject.isNewReleaseMusic, musicObject.isSamiRecommend, musicObject.memeSongInfo, musicObject.memeSong, musicObject.fullSongDetail, musicObject.clipShootDuration, musicObject.isFullSong, musicObject.isTrimmingLimited, musicObject.memeSongModels, musicObject.promoId, musicObject.recallReason, musicObject.isUnlimitedMusic, musicObject.isFeedPreDownloadMdp, musicObject.canBeStitched, musicObject.promotionTag, musicObject.sameGroupIdV3, musicObject.simGroupIdV3, musicObject.musicCompatModel);
    }

    public MusicObject(long j, String str, String str2, int i, int i2, int i3, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, boolean z, MusicHighPrecisionDuration musicHighPrecisionDuration, String str3, boolean z2, boolean z3, Boolean bool, boolean z4, boolean z5, String str4, MatchedPGCSoundInfo matchedPGCSoundInfo, MatchedSoundInfo matchedSoundInfo, long j2, int i4, String str5, String str6, int i5, List<LyricStruct> list, boolean z6, boolean z7, MusicBeat musicBeat, int i6, int i7, String str7, int i8, boolean z8, boolean z9, String str8, UrlModel urlModel4, boolean z10, float f, UrlModel urlModel5, UrlModel urlModel6, int i9, List<MusicTag> list2, int i10, int i11, boolean z11, boolean z12, MemeSongInfo memeSongInfo, MemeSongModel memeSongModel, FullSongDetail fullSongDetail, int i12, boolean z13, boolean z14, List<MemeSongModel> list3, String str9, String str10, boolean z15, int i13, boolean z16, String str11, long j3, long j4, MusicCompatModel musicCompatModel) {
        this.id = j;
        this.album = str;
        this.authorName = str2;
        this.duration = i;
        this.auditionDuration = i2;
        this.shootDuration = i3;
        this.coverLarge = urlModel;
        this.coverMedium = urlModel2;
        this.coverThumb = urlModel3;
        this.dmvAutoShow = z;
        this.durationHighPrecision = musicHighPrecisionDuration;
        this.extra = str3;
        this.isCommerceMusic = z2;
        this.hasCommerceRight = z3;
        this.hasCommerceRightStrict = bool;
        this.isOriginalSound = z4;
        this.isPgc = z5;
        this.metaSongID = str4;
        this.matchedPGCSoundInfo = matchedPGCSoundInfo;
        this.matchedSongInfo = matchedSoundInfo;
        this.localMusicId = j2;
        this.lrcType = i4;
        this.lrcUrl = str5;
        this.lyricContent = str6;
        this.lyricContentType = i5;
        this.lyrics = list;
        this.isOfflineMusic = z6;
        this.isSimilarMusic = z7;
        this.beatInfo = musicBeat;
        this.musicBeginTime = i6;
        this.musicEndTime = i7;
        this.musicName = str7;
        this.musicStatus = i8;
        this.muteShare = z8;
        this.needSetCookie = z9;
        this.offlineDesc = str8;
        this.playUrl = urlModel4;
        this.preventDownload = z10;
        this.previewStartTime = f;
        this.reuseAudioPlayUrl = urlModel5;
        this.strongBeatUrl = urlModel6;
        this.userCount = i9;
        this.musicTags = list2;
        this.videoDuration = i10;
        this.commercialRightType = i11;
        this.isNewReleaseMusic = z11;
        this.isSamiRecommend = z12;
        this.memeSongInfo = memeSongInfo;
        this.memeSong = memeSongModel;
        this.fullSongDetail = fullSongDetail;
        this.clipShootDuration = i12;
        this.isFullSong = z13;
        this.isTrimmingLimited = z14;
        this.memeSongModels = list3;
        this.promoId = str9;
        this.recallReason = str10;
        this.isUnlimitedMusic = z15;
        this.isFeedPreDownloadMdp = i13;
        this.canBeStitched = z16;
        this.promotionTag = str11;
        this.sameGroupIdV3 = j3;
        this.simGroupIdV3 = j4;
        this.musicCompatModel = musicCompatModel;
    }

    public /* synthetic */ MusicObject(long j, String str, String str2, int i, int i2, int i3, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, boolean z, MusicHighPrecisionDuration musicHighPrecisionDuration, String str3, boolean z2, boolean z3, Boolean bool, boolean z4, boolean z5, String str4, MatchedPGCSoundInfo matchedPGCSoundInfo, MatchedSoundInfo matchedSoundInfo, long j2, int i4, String str5, String str6, int i5, List list, boolean z6, boolean z7, MusicBeat musicBeat, int i6, int i7, String str7, int i8, boolean z8, boolean z9, String str8, UrlModel urlModel4, boolean z10, float f, UrlModel urlModel5, UrlModel urlModel6, int i9, List list2, int i10, int i11, boolean z11, boolean z12, MemeSongInfo memeSongInfo, MemeSongModel memeSongModel, FullSongDetail fullSongDetail, int i12, boolean z13, boolean z14, List list3, String str9, String str10, boolean z15, int i13, boolean z16, String str11, long j3, long j4, MusicCompatModel musicCompatModel, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? 0 : i, (i14 & 16) != 0 ? 0 : i2, (i14 & 32) != 0 ? 0 : i3, (i14 & 64) != 0 ? null : urlModel, (i14 & 128) != 0 ? null : urlModel2, (i14 & 256) != 0 ? null : urlModel3, (i14 & 512) != 0 ? false : z, (i14 & 1024) != 0 ? null : musicHighPrecisionDuration, (i14 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str3, (i14 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2, (i14 & 8192) != 0 ? false : z3, (i14 & 16384) != 0 ? null : bool, (i14 & 32768) != 0 ? false : z4, (i14 & 65536) != 0 ? false : z5, (i14 & 131072) != 0 ? "" : str4, (i14 & 262144) != 0 ? null : matchedPGCSoundInfo, (524288 & i14) != 0 ? null : matchedSoundInfo, (1048576 & i14) != 0 ? 0L : j2, (2097152 & i14) != 0 ? 0 : i4, (4194304 & i14) != 0 ? null : str5, (8388608 & i14) != 0 ? null : str6, (16777216 & i14) != 0 ? 0 : i5, (33554432 & i14) != 0 ? null : list, (67108864 & i14) != 0 ? false : z6, (134217728 & i14) != 0 ? false : z7, (268435456 & i14) != 0 ? null : musicBeat, (536870912 & i14) != 0 ? 0 : i6, (1073741824 & i14) != 0 ? 0 : i7, (i14 & Integer.MIN_VALUE) != 0 ? null : str7, (i15 & 1) != 0 ? 0 : i8, (i15 & 2) != 0 ? false : z8, (i15 & 4) != 0 ? false : z9, (i15 & 8) != 0 ? null : str8, (i15 & 16) != 0 ? null : urlModel4, (i15 & 32) != 0 ? false : z10, (i15 & 64) != 0 ? 0.0f : f, (i15 & 128) != 0 ? null : urlModel5, (i15 & 256) != 0 ? null : urlModel6, (i15 & 512) != 0 ? 0 : i9, (i15 & 1024) != 0 ? null : list2, (i15 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i10, (i15 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i11, (i15 & 8192) != 0 ? false : z11, (i15 & 16384) != 0 ? false : z12, (i15 & 32768) != 0 ? null : memeSongInfo, (i15 & 65536) != 0 ? null : memeSongModel, (i15 & 131072) != 0 ? null : fullSongDetail, (i15 & 262144) != 0 ? 0 : i12, (524288 & i15) != 0 ? false : z13, (1048576 & i15) != 0 ? false : z14, (2097152 & i15) != 0 ? null : list3, (4194304 & i15) != 0 ? null : str9, (8388608 & i15) != 0 ? null : str10, (16777216 & i15) != 0 ? false : z15, (33554432 & i15) != 0 ? 0 : i13, (67108864 & i15) != 0 ? false : z16, (134217728 & i15) != 0 ? null : str11, (268435456 & i15) != 0 ? 0L : j3, (536870912 & i15) != 0 ? 0L : j4, (i15 & 1073741824) != 0 ? new MusicCompatModel(null) : musicCompatModel);
    }
}
