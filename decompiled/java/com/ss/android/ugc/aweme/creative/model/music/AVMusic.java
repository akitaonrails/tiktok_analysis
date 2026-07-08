package com.ss.android.ugc.aweme.creative.model.music;

import X.C040H;
import X.C09CT;
import X.C0PVY;
import X.C1456960o18;
import X.C297100Bki;
import X.InterfaceC1629560sVW;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.LyricSceneCopyRight;
import com.ss.android.ugc.aweme.music.model.LyricStruct;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MemeSongInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AVMusic implements Serializable, Cloneable, InterfaceC1629560sVW {

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT("album")
    public String album;

    @C09CT("audition_duration")
    public int auditionDuration;

    @C09CT("author")
    public String authorName;

    @C09CT("can_be_stitched")
    public boolean canBeStitched;

    @C09CT("cancel_able_in_shoot")
    public boolean cancelAbleInShoot;

    @C09CT("category_id")
    public String categoryID;

    @C040H
    public Integer ccTemplateMusicStartTime;

    @C09CT("challenge")
    public AVChallenge challenge;

    @C09CT(alternate = {"x"}, value = "collected")
    public boolean collected;

    @C09CT("come_from_for_mod")
    public int comeFromForMod;

    @C09CT("commercial_right_type")
    public int commercialRightType;

    @C09CT("cover_large")
    public UrlModel coverLarge;

    @C09CT("cover_medium")
    public UrlModel coverMedium;

    @C09CT("cover_thumb")
    public UrlModel coverThumb;

    @C09CT("dmv_auto_show")
    public boolean dmvAutoShow;

    @C09CT("duration")
    public int duration;

    @C09CT("duration_highPrecision")
    public MusicHighPrecisionDuration durationHighPrecision;

    @C09CT("smart_extend_music_list")
    public List<AVMusic> extendMusicList;

    @C09CT("extra")
    public String extra;

    @C09CT("has_commerce_right")
    public boolean hasCommerceRight;

    @C09CT("has_commerce_right_strict")
    public Boolean hasCommerceRightStrict;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_commerce_music")
    public boolean isCommerceMusic;

    @C09CT("is_mv_theme_music")
    public boolean isMvThemeMusic;

    @C09CT("is_offline_music")
    public boolean isOfflineMusic;

    @C09CT("is_original_sound")
    public boolean isOriginalSound;

    @C09CT("is_pgc")
    public boolean isPgc;

    @C09CT("is_offline_similar_music")
    public boolean isSimilarMusic;

    @C09CT("is_unlimited_music")
    public boolean isUnlimitedMusic;

    @C09CT("localmusic_duration")
    public long localMusicDuration;

    @C09CT("local_music_id")
    public long localMusicId;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("lyric_type")
    public int lrcType;

    @C09CT("lyric_url")
    public String lrcUrl;

    @C09CT("lyric_content")
    public String lyricContent;

    @C09CT("lyric_content_type")
    public int lyricContentType;

    @C09CT("lyrics")
    public List<LyricStruct> lyrics;

    @C09CT("max_loop_duration")
    public int maxLoopDuration;

    @C09CT("beat_info")
    public MusicBeat musicBeat;

    @C09CT("music_edit_from")
    public String musicEditFrom;

    @C09CT("music_end_from_cut")
    public int musicEndFromCut;

    @C09CT("title")
    public String musicName;

    @C09CT("music_priority")
    public int musicPriority;

    @C09CT("music_selected_from")
    public String musicSelectedFrom;

    @C09CT("music_start")
    public int musicStart;

    @C09CT("music_start_from_cut")
    public int musicStartFromCut;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int musicStatus;

    @C09CT("tag_list")
    public List<MusicTag> musicTags;

    @C09CT("music_type")
    public int musicType;

    @C09CT("music_volume_info")
    public String musicVolumeInfo;

    @C09CT("music_wave_data")
    public float[] musicWaveData;

    @C09CT("mute_share")
    public boolean muteShare;

    @C09CT(alternate = {"y"}, value = "needSetCookie")
    public boolean needSetCookie;

    @C09CT("offline_desc")
    public String offlineDesc;

    @C09CT("online_key")
    public String onlineKey;

    @C09CT("online_path")
    public String onlinePath;

    @C09CT("path")
    public String path;

    @C09CT("play_url")
    public UrlModel playUrl;

    @C09CT("prevent_download")
    public boolean preventDownload;

    @C09CT("preview_start_time")
    public float previewStartTime;

    @C09CT("promo_id")
    public String promoId;

    @C09CT("promotion_tag")
    public String promotionTag;

    @C09CT("recall_reason")
    public String recallReason;

    @C09CT("recommend_source_from")
    public String recommendSourceFrom;

    @C09CT("reuse_audio_play_url")
    public UrlModel reuseAudioPlayUrl;

    @C09CT("search_key_words")
    public String searchKeyWords;

    @C09CT("shoot_duration")
    public int shootDuration;

    @C09CT("similar_music_list")
    public List<AVMusic> similarMusicList;

    @C09CT("song_id")
    public String songId;

    @C09CT("sound_filter_id")
    public String soundFilterId;

    @C040H
    public C1456960o18 stripMusicModel;

    @C09CT("strong_beat_url")
    public UrlModel strongBeatUrl;

    @C09CT("trim_point_list")
    public ArrayList<Integer> trimPointList;

    @C09CT("trim_point_recommended")
    public boolean trimPointRecommended;

    @C09CT("trim_type_list")
    public ArrayList<String> trimTypeList;

    @C09CT("user_count")
    public int userCount;

    @C09CT("video_duration")
    public int videoDuration;

    @C09CT("music_compat_model")
    public MusicCompatModel musicCompatModel = new MusicCompatModel();

    @C09CT("music_buz_compat_model")
    public MusicBuzCompatModel musicBuzCompatModel = new MusicBuzCompatModel();

    @C09CT("is_best_match")
    public boolean isBestMatch = false;

    @C040H
    public int similarTag = 0;

    @C09CT("clip_shoot_duration")
    public int clipShootDuration = 0;

    @C09CT("is_full_song")
    public boolean isFullSong = false;

    @C09CT("is_trimming_limited")
    public boolean isTrimmingLimited = false;

    @C09CT("sound_speed")
    public Float soundSpeed = Float.valueOf(1.0f);

    @C09CT("change_tone")
    public Boolean changeTone = Boolean.TRUE;

    @C09CT("ignore_reuse_audio")
    public boolean ignoreReuseAudio = false;

    @C09CT("is_sami_recommend")
    public boolean isSamiRecommend = false;

    @C09CT("from_recommend")
    public boolean fromRecommend = false;

    @C09CT("stick_point_music_alg")
    public StickPointMusicAlg stickPointMusicAlg = new StickPointMusicAlg();

    @C09CT("meta_song_id")
    public String metaSongID = "";

    @C09CT("full_song")
    public FullSongDetail fullSongDetail = null;

    @C09CT("matched_PGC_Sound_Info")
    public MatchedPGCSoundInfo matchedPGCSoundInfo = null;

    @C09CT("matched_song")
    public MatchedSoundInfo matchedSongInfo = null;

    @C09CT("music_begin_time")
    public int musicBeginTime = 0;

    @C09CT("music_end_time")
    public int musicEndTime = 0;

    @C09CT("same_group_id_v3")
    public long sameGroupIdV3 = 0;

    @C09CT("sim_group_id_v3")
    public long simGroupIdV3 = 0;

    @C09CT("from_section")
    public MusicModel.FromSection fromSection = MusicModel.FromSection.OTHER;

    @C09CT("should_show_commerce_tips")
    public boolean shouldShowCommerceTips = false;

    @C09CT("local_music_thumb")
    public String localThumbPath = null;

    @C09CT("meme_song_info")
    public MemeSongInfo memeSongInfo = null;

    @C09CT("meme_song")
    public MemeSongModel memeSong = null;

    @C09CT("meme_song_models")
    public List<MemeSongModel> memeSongModels = null;

    @C09CT("is_new_release_music")
    public Boolean isNewReleaseMusic = Boolean.FALSE;

    @C09CT("is_feed_pre_download_mdp")
    public int isFeedPreDownloadMdp = 0;

    @C09CT("is_multi_music_from_template")
    public boolean isMultiMusicFromTemplate = false;

    @C09CT("is_cc_template_local_music")
    public boolean isCCTemplateLocalMusic = false;

    public void clearCutInfo() {
        this.musicStart = 0;
        this.musicStartFromCut = 0;
        this.musicEndTime = 0;
        this.musicEndFromCut = 0;
    }

    public AVMusic deepCopy() {
        AVMusic aVMusic = new AVMusic();
        aVMusic.id = this.id;
        aVMusic.localMusicId = this.localMusicId;
        aVMusic.isBestMatch = this.isBestMatch;
        aVMusic.isCommerceMusic = this.isCommerceMusic;
        aVMusic.hasCommerceRight = this.hasCommerceRight;
        aVMusic.similarTag = this.similarTag;
        aVMusic.clipShootDuration = this.clipShootDuration;
        aVMusic.isFullSong = this.isFullSong;
        aVMusic.isTrimmingLimited = this.isTrimmingLimited;
        aVMusic.isOriginalSound = this.isOriginalSound;
        aVMusic.ignoreReuseAudio = this.ignoreReuseAudio;
        aVMusic.isSamiRecommend = this.isSamiRecommend;
        aVMusic.duration = this.duration;
        aVMusic.userCount = this.userCount;
        aVMusic.auditionDuration = this.auditionDuration;
        aVMusic.shootDuration = this.shootDuration;
        aVMusic.musicStatus = this.musicStatus;
        aVMusic.musicType = this.musicType;
        aVMusic.preventDownload = this.preventDownload;
        aVMusic.isMvThemeMusic = this.isMvThemeMusic;
        aVMusic.cancelAbleInShoot = this.cancelAbleInShoot;
        aVMusic.fromRecommend = this.fromRecommend;
        aVMusic.comeFromForMod = this.comeFromForMod;
        aVMusic.musicPriority = this.musicPriority;
        aVMusic.dmvAutoShow = this.dmvAutoShow;
        aVMusic.videoDuration = this.videoDuration;
        aVMusic.isPgc = this.isPgc;
        aVMusic.localMusicDuration = this.localMusicDuration;
        aVMusic.muteShare = this.muteShare;
        aVMusic.musicBeginTime = this.musicBeginTime;
        aVMusic.musicEndTime = this.musicEndTime;
        aVMusic.collected = this.collected;
        aVMusic.needSetCookie = this.needSetCookie;
        aVMusic.musicStartFromCut = this.musicStartFromCut;
        aVMusic.musicStart = this.musicStart;
        aVMusic.musicEndFromCut = this.musicEndFromCut;
        aVMusic.trimPointRecommended = this.trimPointRecommended;
        aVMusic.commercialRightType = this.commercialRightType;
        aVMusic.lyricContentType = this.lyricContentType;
        aVMusic.lrcType = this.lrcType;
        aVMusic.isFeedPreDownloadMdp = this.isFeedPreDownloadMdp;
        aVMusic.canBeStitched = this.canBeStitched;
        aVMusic.isMultiMusicFromTemplate = this.isMultiMusicFromTemplate;
        aVMusic.isCCTemplateLocalMusic = this.isCCTemplateLocalMusic;
        aVMusic.isUnlimitedMusic = this.isUnlimitedMusic;
        aVMusic.shouldShowCommerceTips = this.shouldShowCommerceTips;
        Float f = this.soundSpeed;
        aVMusic.soundSpeed = Float.valueOf(f != null ? f.floatValue() : 1.0f);
        Boolean bool = this.changeTone;
        aVMusic.changeTone = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        aVMusic.previewStartTime = this.previewStartTime;
        aVMusic.isNewReleaseMusic = this.isNewReleaseMusic;
        aVMusic.recommendSourceFrom = this.recommendSourceFrom;
        aVMusic.album = this.album;
        aVMusic.musicName = this.musicName;
        aVMusic.soundFilterId = this.soundFilterId;
        aVMusic.authorName = this.authorName;
        aVMusic.extra = this.extra;
        aVMusic.offlineDesc = this.offlineDesc;
        aVMusic.path = this.path;
        aVMusic.onlinePath = this.onlinePath;
        aVMusic.onlineKey = this.onlineKey;
        aVMusic.lrcUrl = this.lrcUrl;
        aVMusic.lyricContent = this.lyricContent;
        aVMusic.categoryID = this.categoryID;
        aVMusic.searchKeyWords = this.searchKeyWords;
        aVMusic.songId = this.songId;
        aVMusic.metaSongID = this.metaSongID;
        aVMusic.musicVolumeInfo = this.musicVolumeInfo;
        aVMusic.promoId = this.promoId;
        aVMusic.recallReason = this.recallReason;
        aVMusic.musicEditFrom = this.musicEditFrom;
        aVMusic.localThumbPath = this.localThumbPath;
        aVMusic.musicSelectedFrom = this.musicSelectedFrom;
        aVMusic.coverLarge = this.coverLarge;
        aVMusic.coverMedium = this.coverMedium;
        aVMusic.coverThumb = this.coverThumb;
        aVMusic.playUrl = this.playUrl;
        aVMusic.reuseAudioPlayUrl = this.reuseAudioPlayUrl;
        aVMusic.strongBeatUrl = this.strongBeatUrl;
        aVMusic.challenge = this.challenge;
        aVMusic.durationHighPrecision = this.durationHighPrecision;
        aVMusic.stickPointMusicAlg = this.stickPointMusicAlg;
        aVMusic.fullSongDetail = this.fullSongDetail;
        aVMusic.matchedPGCSoundInfo = this.matchedPGCSoundInfo;
        aVMusic.matchedSongInfo = this.matchedSongInfo;
        aVMusic.musicBeat = this.musicBeat;
        aVMusic.aigcInfo = this.aigcInfo;
        aVMusic.logPb = this.logPb;
        aVMusic.memeSongInfo = this.memeSongInfo;
        aVMusic.memeSong = this.memeSong;
        aVMusic.stripMusicModel = this.stripMusicModel;
        aVMusic.fromSection = this.fromSection;
        float[] fArr = this.musicWaveData;
        if (fArr != null) {
            float[] fArr2 = new float[fArr.length];
            aVMusic.musicWaveData = fArr2;
            float[] fArr3 = this.musicWaveData;
            System.arraycopy(fArr3, 0, fArr2, 0, fArr3.length);
        }
        aVMusic.musicTags = this.musicTags;
        aVMusic.trimPointList = this.trimPointList;
        aVMusic.trimTypeList = this.trimTypeList;
        aVMusic.memeSongModels = this.memeSongModels;
        aVMusic.extendMusicList = this.extendMusicList;
        aVMusic.ccTemplateMusicStartTime = this.ccTemplateMusicStartTime;
        aVMusic.maxLoopDuration = this.maxLoopDuration;
        aVMusic.sameGroupIdV3 = this.sameGroupIdV3;
        aVMusic.simGroupIdV3 = this.simGroupIdV3;
        return aVMusic;
    }

    public int getAuditionDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration == null || !musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getAuditionDurationPrecision())) {
            return this.auditionDuration;
        }
        MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
        return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getAuditionDurationPrecision().floatValue());
    }

    public int getClipShootDuration() {
        int i = this.clipShootDuration;
        return i == 0 ? this.shootDuration : i;
    }

    public int getDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration == null || !musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getDurationPrecision())) {
            return this.duration;
        }
        MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
        return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getDurationPrecision().floatValue());
    }

    public int getFullSongShootDuration() {
        FullSongDetail fullSongDetail = this.fullSongDetail;
        return fullSongDetail != null ? (fullSongDetail.getFullSongShootDurationPrecision() == null || !this.durationHighPrecision.checkDataValidate(this.fullSongDetail.getFullSongShootDurationPrecision())) ? this.fullSongDetail.getFullSongShootDuration() != null ? this.fullSongDetail.getFullSongShootDuration().intValue() : getShootDuration() : this.durationHighPrecision.convertS2MS(this.fullSongDetail.getFullSongShootDurationPrecision().floatValue()) : getShootDuration();
    }

    public String getImprId() {
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            return null;
        }
        return logPbBean.getImprId();
    }

    public boolean getIsNewReleaseMusic() {
        return this.isNewReleaseMusic.booleanValue();
    }

    public boolean getIsRenamedUGC() {
        if (this.extra != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.extra);
                if (jSONObject.has("has_edited")) {
                    return JSONObjectProtectorUtils.getInt(jSONObject, "has_edited") == 1;
                }
                return false;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public List<AVMusic> getMergedMusicList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        if (hasExtendMusicList()) {
            arrayList.addAll(this.extendMusicList);
        }
        return arrayList;
    }

    public String getMid() {
        return String.valueOf(this.id);
    }

    @Override // X.InterfaceC1629560sVW
    public String getMusicId() {
        return String.valueOf(this.id);
    }

    public String getPicBig() {
        UrlModel urlModel = this.coverLarge;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverLarge.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.coverLarge.getUrlList(), 0);
    }

    public String getPicMedium() {
        UrlModel urlModel = this.coverMedium;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverMedium.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.coverMedium.getUrlList(), 0);
    }

    public String getPicSmall() {
        UrlModel urlModel = this.coverThumb;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverThumb.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.coverThumb.getUrlList(), 0);
    }

    public int getShootDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration == null || !musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getShootDurationPrecision())) {
            return this.shootDuration;
        }
        MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
        return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getShootDurationPrecision().floatValue());
    }

    public int getTrimmedMusicDuration() {
        int i = this.musicEndTime;
        return i == 0 ? this.duration - this.musicBeginTime : Math.max(i - this.musicBeginTime, 0);
    }

    public int getVideoDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration == null || !musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getVideoDurationPrecision())) {
            return this.videoDuration;
        }
        MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
        return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getVideoDurationPrecision().floatValue());
    }

    public boolean hasExtendMusicList() {
        List<AVMusic> list = this.extendMusicList;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean hasLyricCopyRight() {
        LyricSceneCopyRight lyricSceneCopyRight;
        MusicCompatModel musicCompatModel = this.musicCompatModel;
        if (musicCompatModel == null || (lyricSceneCopyRight = musicCompatModel.getLyricSceneCopyRight()) == null) {
            return false;
        }
        return lyricSceneCopyRight.getLyricSticker();
    }

    public boolean isLocalMusic() {
        int i = this.musicType;
        return i == 0 || i == 3 || i == 6;
    }

    public boolean isMemeSong() {
        return this.memeSong != null;
    }

    public boolean isNeedReuse() {
        return this.musicType != 2 && getTrimmedMusicDuration() >= 1000 && getDuration() - getTrimmedMusicDuration() > 100;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AVMusic m174clone() {
        try {
            return (AVMusic) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public int getPresenterDuration() {
        return getShootDuration() > 0 ? getShootDuration() : getDuration();
    }

    public int getRealAuditionDuration() {
        return getAuditionDuration() > 0 ? getAuditionDuration() : getPresenterDuration();
    }

    public boolean isLoopMusic() {
        List<AVMusic> mergedMusicList;
        if (!hasExtendMusicList() || (mergedMusicList = getMergedMusicList()) == null || mergedMusicList.size() <= 1) {
            return false;
        }
        long j = ((AVMusic) ListProtector.get(mergedMusicList, 0)).id;
        for (int i = 1; i < mergedMusicList.size(); i++) {
            if (!C0PVY.LIZ(Long.valueOf(j), Long.valueOf(((AVMusic) ListProtector.get(mergedMusicList, i)).id))) {
                return false;
            }
        }
        return true;
    }

    public boolean canBeStitched() {
        return this.canBeStitched;
    }

    public AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public Boolean getChangeTone() {
        return this.changeTone;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public int getCommercialRightType() {
        return this.commercialRightType;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public boolean getDmvAutoShow() {
        return this.dmvAutoShow;
    }

    public String getEditFrom() {
        return this.musicEditFrom;
    }

    public List<AVMusic> getExtendMusicList() {
        return this.extendMusicList;
    }

    public MusicModel.FromSection getFromSection() {
        return this.fromSection;
    }

    public FullSongDetail getFullSongDetail() {
        return this.fullSongDetail;
    }

    public long getId() {
        return this.id;
    }

    public boolean getIgnoreReuseAudio() {
        return this.ignoreReuseAudio;
    }

    public boolean getIsFullSong() {
        return this.isFullSong;
    }

    public boolean getIsTrimmingLimited() {
        return this.isTrimmingLimited;
    }

    public long getLocalMusicDuration() {
        return this.localMusicDuration;
    }

    public long getLocalMusicId() {
        return this.localMusicId;
    }

    public String getLocalThumbPath() {
        return this.localThumbPath;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getLrcType() {
        return this.lrcType;
    }

    public String getLrcUrl() {
        return this.lrcUrl;
    }

    public String getLyricContent() {
        return this.lyricContent;
    }

    public int getLyricContentType() {
        return this.lyricContentType;
    }

    public List<LyricStruct> getLyrics() {
        return this.lyrics;
    }

    public MatchedPGCSoundInfo getMatchedPGCSoundInfo() {
        return this.matchedPGCSoundInfo;
    }

    public MatchedSoundInfo getMatchedSongInfo() {
        return this.matchedSongInfo;
    }

    public int getMaxLoopDuration() {
        return this.maxLoopDuration;
    }

    public MemeSongModel getMemeSong() {
        return this.memeSong;
    }

    public MemeSongInfo getMemeSongInfo() {
        return this.memeSongInfo;
    }

    public List<MemeSongModel> getMemeSongModels() {
        return this.memeSongModels;
    }

    public String getMetaSongID() {
        return this.metaSongID;
    }

    public MusicBeat getMusicBeat() {
        return this.musicBeat;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public MusicBuzCompatModel getMusicBuzCompatModel() {
        return this.musicBuzCompatModel;
    }

    public MusicCompatModel getMusicCompatModel() {
        return this.musicCompatModel;
    }

    public int getMusicEndFromCut() {
        return this.musicEndFromCut;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicPriority() {
        return this.musicPriority;
    }

    public String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public int getMusicStart() {
        return this.musicStart;
    }

    public int getMusicStartFromCut() {
        return this.musicStartFromCut;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public List<MusicTag> getMusicTags() {
        return this.musicTags;
    }

    public int getMusicType() {
        return this.musicType;
    }

    public String getMusicVolumeInfo() {
        return this.musicVolumeInfo;
    }

    public float[] getMusicWaveData() {
        return this.musicWaveData;
    }

    public String getName() {
        return this.musicName;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getPromoId() {
        return this.promoId;
    }

    public String getPromotionTag() {
        return this.promotionTag;
    }

    public String getRecallReason() {
        return this.recallReason;
    }

    public UrlModel getReuseAudioPlayUrl() {
        return this.reuseAudioPlayUrl;
    }

    public long getSameGroupIdV3() {
        return this.sameGroupIdV3;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public long getSimGroupIdV3() {
        return this.simGroupIdV3;
    }

    public List<AVMusic> getSimilarMusicList() {
        return this.similarMusicList;
    }

    public String getSinger() {
        return this.authorName;
    }

    public String getSongId() {
        return this.songId;
    }

    public String getSoundFilterId() {
        return this.soundFilterId;
    }

    public Float getSoundSpeed() {
        return this.soundSpeed;
    }

    public StickPointMusicAlg getStickPointMusicAlg() {
        return this.stickPointMusicAlg;
    }

    public C1456960o18 getStripMusicModel() {
        return this.stripMusicModel;
    }

    @Override // X.InterfaceC1629560sVW
    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public ArrayList<Integer> getTrimPointList() {
        return this.trimPointList;
    }

    public boolean getTrimPointRecommended() {
        return this.trimPointRecommended;
    }

    public ArrayList<String> getTrimTypeList() {
        return this.trimTypeList;
    }

    public boolean isBestMatch() {
        return this.isBestMatch;
    }

    public boolean isCCTemplateLocalMusic() {
        return this.isCCTemplateLocalMusic;
    }

    public boolean isCancelAbleInShoot() {
        return this.cancelAbleInShoot;
    }

    public boolean isCollected() {
        return this.collected;
    }

    public boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public boolean isFromRecommend() {
        return this.fromRecommend;
    }

    public boolean isHasCommerceRight() {
        return this.hasCommerceRight;
    }

    public Boolean isHasCommerceRightStrict() {
        return this.hasCommerceRightStrict;
    }

    public boolean isMultiMusicFromTemplate() {
        return this.isMultiMusicFromTemplate;
    }

    public boolean isMuteShare() {
        return this.muteShare;
    }

    public boolean isMvThemeMusic() {
        return this.isMvThemeMusic;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public boolean isOfflineMusic() {
        return this.isOfflineMusic;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public boolean isPgc() {
        return this.isPgc;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isSamiRecommend() {
        return this.isSamiRecommend;
    }

    public boolean isShouldShowCommerceTips() {
        return this.shouldShowCommerceTips;
    }

    public boolean isSimilarMusic() {
        return this.isSimilarMusic;
    }

    public boolean isUnlimitedMusic() {
        return this.isUnlimitedMusic;
    }

    public String getResolvedUrlKey(String str) {
        if (!C297100Bki.LIZ() || str == null || str.isEmpty() || !str.equals(this.onlinePath)) {
            return null;
        }
        return this.onlineKey;
    }

    public void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public void setAuditionDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setAuditionDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.auditionDuration = i;
    }

    public void setBestMatch(boolean z) {
        this.isBestMatch = z;
    }

    public void setCCTemplateLocalMusic(boolean z) {
        this.isCCTemplateLocalMusic = z;
    }

    public void setCanBeStitched(boolean z) {
        this.canBeStitched = z;
    }

    public void setCancelAbleInShoot(boolean z) {
        this.cancelAbleInShoot = z;
    }

    public void setCategoryID(String str) {
        this.categoryID = str;
    }

    public void setChangeTone(Boolean bool) {
        this.changeTone = bool;
    }

    public void setClipShootDuration(int i) {
        this.clipShootDuration = i;
    }

    public void setCollected(boolean z) {
        this.collected = z;
    }

    public void setComeFromForMod(int i) {
        this.comeFromForMod = i;
    }

    public void setCommerceMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setCommercialRightType(int i) {
        this.commercialRightType = i;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.duration = i;
    }

    public void setEditFrom(String str) {
        this.musicEditFrom = str;
    }

    public void setExtendMusicList(List<AVMusic> list) {
        this.extendMusicList = list;
    }

    public void setFromRecommend(boolean z) {
        this.fromRecommend = z;
    }

    public void setFromSection(MusicModel.FromSection fromSection) {
        this.fromSection = fromSection;
    }

    public void setFullSongDetail(FullSongDetail fullSongDetail) {
        this.fullSongDetail = fullSongDetail;
    }

    public void setHasCommerceRight(boolean z) {
        this.hasCommerceRight = z;
    }

    public void setHasCommerceRightStrict(Boolean bool) {
        this.hasCommerceRightStrict = bool;
    }

    public void setImprId(String str) {
        if (this.logPb == null) {
            this.logPb = new LogPbBean();
        }
        this.logPb.setImprId(str);
    }

    public void setIsFullSong(boolean z) {
        this.isFullSong = z;
    }

    public void setIsNewReleaseMusic(boolean z) {
        this.isNewReleaseMusic = Boolean.valueOf(z);
    }

    public void setIsSamiRecommend(boolean z) {
        this.isSamiRecommend = z;
    }

    public void setIsTrimmingLimited(boolean z) {
        this.isTrimmingLimited = z;
    }

    public void setLocalMusicDuration(long j) {
        this.localMusicDuration = j;
    }

    public void setLocalMusicId(long j) {
        this.localMusicId = j;
    }

    public void setLocalThumbPath(String str) {
        this.localThumbPath = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLrcType(int i) {
        this.lrcType = i;
    }

    public void setLrcUrl(String str) {
        this.lrcUrl = str;
    }

    public void setLyricContent(String str) {
        this.lyricContent = str;
    }

    public void setLyricContentType(int i) {
        this.lyricContentType = i;
    }

    public void setLyrics(List<LyricStruct> list) {
        this.lyrics = list;
    }

    public void setMatchedPGCSoundInfo(MatchedPGCSoundInfo matchedPGCSoundInfo) {
        this.matchedPGCSoundInfo = matchedPGCSoundInfo;
    }

    public void setMatchedSongInfo(MatchedSoundInfo matchedSoundInfo) {
        this.matchedSongInfo = matchedSoundInfo;
    }

    public void setMaxLoopDuration(int i) {
        this.maxLoopDuration = i;
    }

    public void setMemeSong(MemeSongModel memeSongModel) {
        this.memeSong = memeSongModel;
    }

    public void setMemeSongInfo(MemeSongInfo memeSongInfo) {
        this.memeSongInfo = memeSongInfo;
    }

    public void setMemeSongModels(List<MemeSongModel> list) {
        this.memeSongModels = list;
    }

    public void setMetaSongID(String str) {
        this.metaSongID = str;
    }

    public void setMultiMusicFromTemplate(boolean z) {
        this.isMultiMusicFromTemplate = z;
    }

    public void setMusicBeat(MusicBeat musicBeat) {
        this.musicBeat = musicBeat;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicBuzCompatModel(MusicBuzCompatModel musicBuzCompatModel) {
        this.musicBuzCompatModel = musicBuzCompatModel;
    }

    public void setMusicCompatModel(MusicCompatModel musicCompatModel) {
        this.musicCompatModel = musicCompatModel;
    }

    public void setMusicEndFromCut(int i) {
        this.musicEndFromCut = i;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicId(String str) {
        try {
            this.id = CastLongProtector.parseLong(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1629560sVW
    public void setMusicPriority(int i) {
        this.musicPriority = i;
    }

    public void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public void setMusicStart(int i) {
        this.musicStart = i;
    }

    public void setMusicStartFromCut(int i) {
        this.musicStartFromCut = i;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMusicVolumeInfo(String str) {
        this.musicVolumeInfo = str;
    }

    public void setMusicWaveData(float[] fArr) {
        this.musicWaveData = fArr;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOfflineMusic(boolean z) {
        this.isOfflineMusic = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setPromoId(String str) {
        this.promoId = str;
    }

    public void setPromotionTag(String str) {
        this.promotionTag = str;
    }

    public void setRecallReason(String str) {
        this.recallReason = str;
    }

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setShootDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setShootDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.shootDuration = i;
    }

    public void setShouldShowCommerceTips(boolean z) {
        this.shouldShowCommerceTips = z;
    }

    public void setSimilarMusic(boolean z) {
        this.isSimilarMusic = z;
    }

    public void setSimilarMusicList(List<AVMusic> list) {
        this.similarMusicList = list;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setSoundFilterId(String str) {
        this.soundFilterId = str;
    }

    public void setSoundSpeed(float f) {
        this.soundSpeed = Float.valueOf(f);
    }

    public void setStickPointMusicAlg(StickPointMusicAlg stickPointMusicAlg) {
        this.stickPointMusicAlg = stickPointMusicAlg;
    }

    public void setStripMusicModel(C1456960o18 c1456960o18) {
        this.stripMusicModel = c1456960o18;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setTrimPointList(ArrayList<Integer> arrayList) {
        this.trimPointList = arrayList;
    }

    public void setTrimPointRecommended(boolean z) {
        this.trimPointRecommended = z;
    }

    public void setTrimTypeList(ArrayList<String> arrayList) {
        this.trimTypeList = arrayList;
    }

    public void setUnlimitedMusic(boolean z) {
        this.isUnlimitedMusic = z;
    }

    public void setVideoDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setVideoDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.videoDuration = i;
    }
}
