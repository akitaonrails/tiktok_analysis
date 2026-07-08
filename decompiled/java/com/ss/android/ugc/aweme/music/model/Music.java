package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C139Y;
import X.C1518090pbj;
import X.C297100Bki;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class Music implements Serializable {

    @C09CT("album")
    public String album;

    @C09CT("allow_offline_music_to_detail_page")
    public boolean allowOfflineMusicToDetailPage;

    @C09CT("audition_duration")
    public int auditionDuration;

    @C09CT("author")
    public String authorName;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("beat_info")
    public MusicBeat beatInfo;

    @C09CT("billboard_rank")
    public int billboardRank;

    @C09CT("binded_challenge_id")
    public Long bindChallengeId;

    @C09CT("can_be_stitched")
    public boolean canBeStitched;

    @C09CT("can_not_reuse")
    public boolean canNotReuse;

    @C09CT("challenge")
    public Challenge challenge;

    @C09CT("challenge_name")
    public String challengeName;
    public int clipShootDuration;

    @C09CT("collect_stat")
    public int collectStatus;

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

    @C09CT("duration_high_precision")
    public MusicHighPrecisionDuration durationHighPrecision;

    @C09CT("effects_data")
    public UrlModel effectsData;

    @C09CT("external_song_subtitle")
    public String exclusiveSubTitle;

    @C09CT("extra")
    public String extra;

    @C09CT("full_song")
    public FullSongDetail fullSongDetail;

    @C09CT("has_commerce_right")
    public boolean hasCommerceRight;

    @C09CT("has_commerce_right_strict")
    public Boolean hasCommerceRightStrict;
    public List<MusicOwnerInfo> highlightMusicOwnerInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("is_author_artist")
    public boolean isArtistMusic;

    @C09CT("author_deleted")
    public boolean isAuthorDeleted;

    @C09CT("is_best_match")
    public boolean isBestMatch;

    @C09CT("is_commerce_music")
    public boolean isCommercialMusic;

    @C09CT("is_feed_pre_download_mdp")
    public int isFeedPreDownloadMdp;

    @C09CT("is_matched_metadata")
    public boolean isMatchMetadata;

    @C09CT("is_original")
    public boolean isOriginMusic;

    @C09CT("is_original_sound")
    public boolean isOriginalSound;

    @C09CT("is_pgc")
    public boolean isPgc;

    @C09CT("is_sami_recommend")
    public boolean isSamiRecommend;

    @C09CT("is_shooting_allow")
    public Boolean isShootingAllowed;

    @C09CT("is_unlimited_music")
    public boolean isUnlimitedMusic;

    @C09CT("local_music_id")
    public long localMusicId;

    @C09CT("log_extra")
    public String logExtra;
    public HashMap<String, String> logExtraMap;

    @C09CT("lyric_type")
    public int lrcType;

    @C09CT("lyric_url")
    public String lrcUrl;

    @C09CT("lyric_content")
    public String lyricContent;

    @C09CT("lyric_content_type")
    public int lyricContentType;

    @C09CT("lyric_scene_copyright")
    public LyricSceneCopyRight lyricSceneCopyRight;

    @C09CT("lyric_short")
    public String lyricShort;

    @C09CT("lyric_short_position")
    public List<Position> lyricShortPosition;

    @C09CT("lyrics")
    public List<LyricStruct> lyrics;

    @C09CT("external_song_info")
    public List<ExternalMusicInfo> mExternalMusicInfos;
    public C139Y mExtraParamFromPretreatment;

    @C09CT("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @C09CT("matched_song")
    public MatchedSoundInfo mMatchedSongInfo;

    @C09CT("artists")
    public List<MusicOwnerInfo> mMusicOwnerInfos;

    @C09CT("owner_ban_show_info")
    public String mOwnerBanShowInfo;

    @C09CT("search_music_desc")
    public String mSearchMusicDesc;

    @C09CT("search_music_name")
    public String mSearchMusicName;
    public int mSoundsListType;

    @C09CT("uncert_artists")
    public List<UncertMusicOwnerInfo> mUncertMusicOwnerInfos;

    @C09CT("matched_pgc_sound")
    public MatchedPGCSoundInfo matchedPGCSoundInfo;

    @C09CT("meme_song_info")
    public MemeSongInfo memeSongInfo;

    @C09CT("multi_bit_rate_play_info")
    public List<SimBitRate> multiBitRatePlayInfo;

    @C09CT("music_edit_info")
    public C1518090pbj musicEditInfo;

    @C09CT("music_fusion_info")
    public MusicFusion musicFusion;

    @C09CT("title")
    public String musicName;

    @C09CT("recommend_status")
    public long musicRecommendStatus;

    @C09CT("music_release_info")
    public MusicReleaseInfo musicReleaseInfo;

    @C09CT("suggest_words")
    public MusicSearchHintInfo musicSearchHintInfo;
    public String musicSelectedFrom;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int musicStatus;

    @C09CT("tag_list")
    public List<MusicTag> musicTags;

    @C09CT("vid_volume_info")
    public String musicVolumeInfo;

    @C09CT("mute_share")
    public boolean muteShare;

    @C09CT("is_audio_url_with_cookie")
    public boolean needSetCookie;

    @C09CT("offline_desc")
    public String offlineDesc;

    @C09CT("owner_handle")
    public String ownerHandle;

    @C09CT("owner_id")
    public String ownerId;

    @C09CT("owner_nickname")
    public String ownerNickName;
    public String path;

    @C09CT("pinned_video_status")
    public int pinnedVideoStatus;

    @C09CT("play_url")
    public UrlModel playUrl;

    @C09CT("position")
    public List<Position> positions;

    @C09CT("prevent_download")
    public boolean preventDownload;

    @C09CT("preview_end_time")
    public float previewEndTime;

    @C09CT("preview_page_show_mode")
    public int previewPageShowMode;

    @C09CT("preview_start_time")
    public float previewStartTime;

    @C09CT("promo_id")
    public String promoId;

    @C09CT("promo_tag")
    public String promotionTag;

    @C09CT("recall_reason")
    public String recallReason;

    @C09CT("recommend_source_from")
    public String recommendSourceFrom;

    @C09CT("recommend_tag")
    public String recommendTag;

    @C09CT("remain_fusion_info")
    public RemainMusicFusion remainMusicFusion;
    public String requestId;

    @C09CT("reuse_audio_play_url")
    public UrlModel reuseAudioPlayUrl;

    @C09CT("search_id")
    public String searchId;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("shoot_duration")
    public int shootDuration;
    public int similarTag;

    @C09CT("song_writers")
    public List<MusicOwnerInfo> songWriter;

    @C09CT("stripped_music_info")
    public StrippedMusicInfoStruct strippedMusicInfo;

    @C09CT("strong_beat_url")
    public UrlModel strongBeatUrl;

    @C09CT("tt_to_dsp_song_infos")
    public List<TT2DSPSongInfo> tt2DSPSongInfos;

    @C09CT("ttm_music_info")
    public TTMMusicInfo ttmInfo;

    @C09CT("uncert_song_writers")
    public List<UncertMusicOwnerInfo> uncertSongWriters;

    @C09CT("user_count")
    public int userCount;

    @C09CT("video_duration")
    public int videoDuration;

    @C09CT("same_group_id_v3")
    public Long sameGroupIdV3 = 0L;

    @C09CT("sim_group_id_v3")
    public Long simGroupIdV3 = 0L;

    @C09CT("related_musics")
    public List<Music> relatedMusics = new ArrayList();

    @C09CT("similar_musics")
    public List<Music> similarMusics = new ArrayList();
    public boolean isFullSong = false;
    public boolean isTrimmingLimited = false;

    @C09CT("music_begin_time_in_ms")
    public int musicBeginTime = 0;

    @C09CT("music_end_time_in_ms")
    public int musicEndTime = 0;

    @C09CT("search_result_id")
    public String searchResultId = "";

    @C09CT("list_item_id")
    public String listItemId = "";

    @C09CT("enter_position")
    public String enterPosition = "";

    @C09CT("tt_to_dsp_album_info")
    public TT2DspAlbumInfo tt2DspAlbumInfo = null;
    public boolean isFriendTagVisible = false;
    public boolean isFollowerTagVisible = false;

    @C09CT("has_human_voice")
    public Boolean hasHumanVoice = Boolean.FALSE;

    @C09CT("mute_type")
    public int muteType = 0;

    public int followUpCount() {
        try {
            return new JSONObject(this.extra).optInt("followup_count", 0);
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public boolean isMdpSquareCollected() {
        try {
            return new JSONObject(this.extra).optInt("is_collected", 0) == 1;
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public boolean available() {
        UrlModel urlModel;
        return (this.musicStatus == 0 || (urlModel = this.playUrl) == null || urlModel.getUrlList() == null || this.playUrl.getUrlList().size() <= 0) ? false : true;
    }

    public String carryEffectId() {
        try {
            String strOptString = new JSONObject(this.extra).optString("effect_id");
            if (strOptString != null) {
                if (strOptString.equals(CardStruct.IStatusCode.DEFAULT)) {
                    return "";
                }
            }
            return strOptString;
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public String carryMetaSongId() {
        try {
            String strOptString = new JSONObject(this.extra).optString("meta_song_id");
            if (strOptString != null) {
                if (strOptString.equals(CardStruct.IStatusCode.DEFAULT)) {
                    return "";
                }
            }
            return strOptString;
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public String carryTemplateId() {
        try {
            return new JSONObject(this.extra).optString("template_id");
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public String carryTemplateType() {
        try {
            return new JSONObject(this.extra).optString("template_type");
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public MusicModel convertToMusicModel() {
        UrlModel urlModel;
        MusicModel musicModel = new MusicModel();
        musicModel.setMusic(this);
        if (getCoverMedium() != null && getCoverMedium().getUrlList() != null && getCoverMedium().getUrlList().size() > 0) {
            musicModel.setPicPremium((String) ListProtector.get(getCoverMedium().getUrlList(), 0));
        }
        if (getCoverThumb() != null && getCoverThumb().getUrlList() != null && getCoverThumb().getUrlList().size() > 0) {
            musicModel.setPicSmall((String) ListProtector.get(getCoverThumb().getUrlList(), 0));
        }
        if (getCoverLarge() != null && getCoverLarge().getUrlList() != null && getCoverLarge().getUrlList().size() > 0) {
            musicModel.setPicBig((String) ListProtector.get(getCoverLarge().getUrlList(), 0));
        }
        if (getCollectStatus() == 1) {
            musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
        } else {
            musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
        }
        musicModel.setSinger(getAuthorName());
        musicModel.setUrl(getPlayUrl());
        musicModel.setMusicType(1);
        musicModel.setName(getMusicName());
        musicModel.setMusicId(getMid());
        musicModel.setDuration(getDuration() * LSPassThroughRecordSizeConfig.DEFAULT);
        musicModel.setShootDuration(Integer.valueOf(getShootDuration() * LSPassThroughRecordSizeConfig.DEFAULT));
        musicModel.setClipShootDuration(getShootDuration() * LSPassThroughRecordSizeConfig.DEFAULT);
        musicModel.setAuditionDuration(Integer.valueOf(getAuditionDuration() * LSPassThroughRecordSizeConfig.DEFAULT));
        musicModel.setDurationHighPrecision(this.durationHighPrecision);
        musicModel.setOfflineDesc(getOfflineDesc());
        musicModel.setMusicStatus(getMusicStatus());
        musicModel.setMusicRecommendStatus(getMusicRecommendStatus());
        musicModel.setUserCount(this.userCount);
        musicModel.setOriginal(isOriginMusic());
        musicModel.setArtist(isArtistMusic());
        musicModel.setBillboardRank(getBillboardRank());
        musicModel.setId(getId());
        musicModel.setSameGroupIdV3(getSameGroupIdV3());
        musicModel.setSimGroupIdV3(getSimGroupIdV3());
        musicModel.setLrcUrl(this.lrcUrl);
        musicModel.setLrcType(this.lrcType);
        musicModel.setLyricContent(this.lyricContent);
        musicModel.setLyricContentType(this.lyricContentType);
        musicModel.setLyrics(this.lyrics);
        musicModel.setOffline(this.musicStatus == 0 || (urlModel = this.playUrl) == null || urlModel.getUrlList() == null || this.playUrl.getUrlList().isEmpty());
        ArrayList arrayList = new ArrayList();
        List<Music> list = this.similarMusics;
        if (list != null) {
            for (Music music : list) {
                if (music != null) {
                    MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                    musicModelConvertToMusicModel.setSimilarMusic(true);
                    arrayList.add(musicModelConvertToMusicModel);
                }
            }
        }
        musicModel.setSimilarMusicList(arrayList);
        musicModel.setPreviewStartTime(this.previewStartTime);
        musicModel.setCommerceMusic(this.isCommercialMusic);
        musicModel.setHasCommerceRight(this.hasCommerceRight);
        musicModel.setHasCommerceRightStrict(this.hasCommerceRightStrict);
        musicModel.setOriginalSound(this.isOriginalSound);
        musicModel.setLyricShort(this.lyricShort);
        musicModel.setLyricShortPosition(this.lyricShortPosition);
        musicModel.setEnterPosition(this.enterPosition);
        musicModel.setMusicTags(this.musicTags);
        musicModel.setSimilarTag(Integer.valueOf(this.similarTag));
        musicModel.setRecommendSourceFrom(this.recommendSourceFrom);
        if (getEffectsData() != null && getEffectsData().getUrlList() != null && !getEffectsData().getUrlList().isEmpty()) {
            musicModel.setMusicEffects((String) ListProtector.get(getEffectsData().getUrlList(), 0));
        }
        musicModel.setStrongBeatUrl(this.strongBeatUrl);
        musicModel.setPreventDownload(isPreventDownload());
        musicModel.setDmvAutoShow(this.dmvAutoShow);
        musicModel.setNeedSetCookie(isNeedSetCookie());
        musicModel.setBindChallengeId(getBindChallengeId());
        musicModel.setMatchedPGCSoundInfo(this.matchedPGCSoundInfo);
        musicModel.setFullSongDetail(this.fullSongDetail);
        musicModel.setVideoDuration(this.videoDuration);
        musicModel.setPgc(this.isPgc);
        musicModel.setIsSamiRecommend(this.isSamiRecommend);
        musicModel.setBeatInfo(this.beatInfo);
        musicModel.setMatchedSoundInfo(this.mMatchedSongInfo);
        musicModel.setExtraParamFromPretreatment(this.mExtraParamFromPretreatment);
        musicModel.setSoundsListType(this.mSoundsListType);
        musicModel.setLocalMusicId(this.localMusicId);
        musicModel.setMuteShare(this.muteShare);
        musicModel.setMusicBeginTime(this.musicBeginTime);
        musicModel.setMusicStart(this.musicBeginTime);
        musicModel.setMusicStartFromCut(this.musicBeginTime);
        musicModel.setMusicEndTime(this.musicEndTime);
        musicModel.setCommercialRightType(this.commercialRightType);
        musicModel.setRecommendTag(this.recommendTag);
        if (!TextUtils.isEmpty(this.searchId)) {
            LogPbBean logPb = musicModel.getLogPb();
            if (logPb == null) {
                logPb = new LogPbBean();
                musicModel.setLogPb(logPb);
            }
            logPb.setImprId(this.searchId);
        }
        musicModel.setSearchResultId(this.searchResultId);
        musicModel.setListItemId(this.listItemId);
        musicModel.setPinnedVideoStatus(this.pinnedVideoStatus);
        musicModel.setMusicReleaseInfo(this.musicReleaseInfo);
        musicModel.setTT2DSPAlbumInfo(this.tt2DspAlbumInfo);
        musicModel.setTT2DSPSongInfos(this.tt2DSPSongInfos);
        musicModel.setMusicVolumeInfo(this.musicVolumeInfo);
        musicModel.setUnlimitedMusic(this.isUnlimitedMusic);
        musicModel.setBestMatch(this.isBestMatch);
        musicModel.setCanBeStitched(this.canBeStitched);
        musicModel.setMusicSelectedFrom(this.musicSelectedFrom);
        return musicModel;
    }

    public List<MusicOwnerInfo> getArtistProfileList() {
        ArrayList arrayList = new ArrayList();
        List<MusicOwnerInfo> list = this.mMusicOwnerInfos;
        if (list == null) {
            return arrayList;
        }
        for (MusicOwnerInfo musicOwnerInfo : list) {
            if (musicOwnerInfo != null && musicOwnerInfo.getShowArtistProfileBtn()) {
                arrayList.add(musicOwnerInfo);
            }
        }
        return arrayList;
    }

    public int getAuditionDurationMs() {
        return this.auditionDuration * LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public String getBindChallengeId() {
        return String.valueOf(this.bindChallengeId);
    }

    public int getClipShootDuration() {
        int i = this.clipShootDuration;
        return i == 0 ? this.shootDuration : i;
    }

    public C139Y getExtraParamFromPretreatment() {
        if (this.mExtraParamFromPretreatment == null) {
            this.mExtraParamFromPretreatment = new C139Y();
        }
        return this.mExtraParamFromPretreatment;
    }

    public Map<String, String> getLogExtraMap() {
        String str = this.logExtra;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, String> map = this.logExtraMap;
        if (map != null) {
            return map;
        }
        HashMap<String, String> map2 = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList("meta_song_matched_type", "ttm_matched_type", "ttm_track_id", "recognized_pgc_clip_id", "matched_meta_song_id"));
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (hashSet.contains(next) && jSONObject.has(next)) {
                    map2.put(next, jSONObject.optString(next));
                }
            }
            this.logExtraMap = map2;
            return map2;
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getMemeSongStyle() {
        MemeSongInfo memeSongInfo = this.memeSongInfo;
        return (memeSongInfo == null || memeSongInfo.getMemeSongStyle() == null) ? "" : this.memeSongInfo.getMemeSongStyle();
    }

    public String getMid() {
        return String.valueOf(this.id);
    }

    public int getPresenterDuration() {
        int i = this.shootDuration;
        return i > 0 ? i : this.duration;
    }

    public int getRealAuditionDuration() {
        int i = this.auditionDuration;
        return i > 0 ? i : getPresenterDuration();
    }

    public long getSameGroupIdV3() {
        return this.sameGroupIdV3.longValue();
    }

    public int getShootDurationOrDuration() {
        int i = this.shootDuration;
        return i != 0 ? i : this.duration;
    }

    public long getSimGroupIdV3() {
        return this.simGroupIdV3.longValue();
    }

    public Integer getsimilarTag() {
        return Integer.valueOf(this.similarTag);
    }

    public boolean hasLyricSceneCopyRight() {
        LyricSceneCopyRight lyricSceneCopyRight = this.lyricSceneCopyRight;
        if (lyricSceneCopyRight == null) {
            return false;
        }
        return lyricSceneCopyRight.getLyricSticker();
    }

    public boolean isCollected() {
        return this.collectStatus == 1;
    }

    public boolean isMemeSong() {
        MemeSongInfo memeSongInfo = this.memeSongInfo;
        return memeSongInfo != null && memeSongInfo.isMemeSong();
    }

    public boolean isShootingAllowed() {
        Boolean bool = this.isShootingAllowed;
        return bool != null && bool.booleanValue();
    }

    public String mdpSquareRecommendTag() {
        try {
            return new JSONObject(this.extra).optString("recommend_tag");
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public int hashCode() {
        if (getMid() != null) {
            return getMid().hashCode();
        }
        return 0;
    }

    public boolean isNewRelease() {
        return getMusicReleaseInfo() != null && getMusicReleaseInfo().isNewReleaseSong();
    }

    public boolean allowOfflineMusicToDetailPage() {
        return this.allowOfflineMusicToDetailPage;
    }

    public String getAlbum() {
        return this.album;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public MusicBeat getBeatInfo() {
        return this.beatInfo;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public int getCommercialRightType() {
        return this.commercialRightType;
    }

    public UrlModel getCoverLarge() {
        return this.coverLarge;
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

    public int getDuration() {
        return this.duration;
    }

    public MusicHighPrecisionDuration getDurationHighPrecision() {
        return this.durationHighPrecision;
    }

    public UrlModel getEffectsData() {
        return this.effectsData;
    }

    public String getEnterPosition() {
        return this.enterPosition;
    }

    public String getExclusiveSubTitle() {
        return this.exclusiveSubTitle;
    }

    public List<ExternalMusicInfo> getExternalMusicInfos() {
        return this.mExternalMusicInfos;
    }

    public String getExtra() {
        return this.extra;
    }

    public FullSongDetail getFullSongDetail() {
        return this.fullSongDetail;
    }

    public Boolean getHasHumanVoice() {
        return this.hasHumanVoice;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public List<MusicOwnerInfo> getHighlightMusicOwnerInfo() {
        return this.highlightMusicOwnerInfo;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public int getIsFeedPreDownloadMdp() {
        return this.isFeedPreDownloadMdp;
    }

    public boolean getIsFullSong() {
        return this.isFullSong;
    }

    public boolean getIsTrimmingLimited() {
        return this.isTrimmingLimited;
    }

    public String getListItemId() {
        return this.listItemId;
    }

    public long getLocalMusicId() {
        return this.localMusicId;
    }

    public String getLogExtra() {
        return this.logExtra;
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

    public LyricSceneCopyRight getLyricSceneCopyRight() {
        return this.lyricSceneCopyRight;
    }

    public String getLyricShort() {
        return this.lyricShort;
    }

    public List<Position> getLyricShortPosition() {
        return this.lyricShortPosition;
    }

    public List<LyricStruct> getLyrics() {
        return this.lyrics;
    }

    public MatchedPGCSoundInfo getMatchedPGCSoundInfo() {
        return this.matchedPGCSoundInfo;
    }

    public MatchedSoundInfo getMatchedSongInfo() {
        return this.mMatchedSongInfo;
    }

    public MemeSongInfo getMemeSongInfo() {
        return this.memeSongInfo;
    }

    public List<SimBitRate> getMultiBitRatePlayInfo() {
        return this.multiBitRatePlayInfo;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public MusicFusion getMusicFusion() {
        return this.musicFusion;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public List<MusicOwnerInfo> getMusicOwnerInfos() {
        return this.mMusicOwnerInfos;
    }

    public long getMusicRecommendStatus() {
        return this.musicRecommendStatus;
    }

    public MusicReleaseInfo getMusicReleaseInfo() {
        return this.musicReleaseInfo;
    }

    public String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public List<MusicTag> getMusicTags() {
        return this.musicTags;
    }

    public String getMusicVolumeInfo() {
        return this.musicVolumeInfo;
    }

    public int getMuteType() {
        return this.muteType;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getOwnerBanShowInfo() {
        return this.mOwnerBanShowInfo;
    }

    public String getOwnerHandle() {
        return this.ownerHandle;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerNickName() {
        return this.ownerNickName;
    }

    public String getPath() {
        return this.path;
    }

    public int getPinnedVideoStatus() {
        return this.pinnedVideoStatus;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public float getPreviewEndTime() {
        return this.previewEndTime;
    }

    public int getPreviewPageShowMode() {
        return this.previewPageShowMode;
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

    public String getRecommendSourceFrom() {
        return this.recommendSourceFrom;
    }

    public String getRecommendTag() {
        return this.recommendTag;
    }

    public List<Music> getRelatedMusics() {
        return this.relatedMusics;
    }

    public RemainMusicFusion getRemainMusicFusion() {
        return this.remainMusicFusion;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public UrlModel getReuseAudioPlayUrl() {
        return this.reuseAudioPlayUrl;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public String getSearchMusicDesc() {
        return this.mSearchMusicDesc;
    }

    public String getSearchMusicName() {
        return this.mSearchMusicName;
    }

    public String getSearchResultId() {
        return this.searchResultId;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public List<Music> getSimilarMusics() {
        return this.similarMusics;
    }

    public List<MusicOwnerInfo> getSongWriter() {
        return this.songWriter;
    }

    public int getSoundsListType() {
        return this.mSoundsListType;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public List<TT2DSPSongInfo> getTT2DSPSongInfos() {
        return this.tt2DSPSongInfos;
    }

    public TT2DspAlbumInfo getTT2DspAlbumInfo() {
        return this.tt2DspAlbumInfo;
    }

    public TTMMusicInfo getTtmInfo() {
        return this.ttmInfo;
    }

    public List<UncertMusicOwnerInfo> getUncertMusicOwnerInfos() {
        return this.mUncertMusicOwnerInfos;
    }

    public List<UncertMusicOwnerInfo> getUncertSongWriters() {
        return this.uncertSongWriters;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public boolean isArtistMusic() {
        return this.isArtistMusic;
    }

    public boolean isAuthorDeleted() {
        return this.isAuthorDeleted;
    }

    public boolean isBestMatch() {
        return this.isBestMatch;
    }

    public boolean isCanNotReuse() {
        return this.canNotReuse;
    }

    public boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public boolean isHasCommerceRight() {
        return this.hasCommerceRight;
    }

    public Boolean isHasCommerceRightStrict() {
        return this.hasCommerceRightStrict;
    }

    public boolean isMatchMetadata() {
        return this.isMatchMetadata;
    }

    public boolean isMuteShare() {
        return this.muteShare;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public boolean isOriginMusic() {
        return this.isOriginMusic;
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

    public boolean equals(Object obj) {
        if (!(obj instanceof Music)) {
            return false;
        }
        Music music = (Music) obj;
        if (!TextUtils.equals(music.getMid(), getMid()) || music.getCollectStatus() != getCollectStatus()) {
            return false;
        }
        return true;
    }

    public String getResolvedUrlKey(String str) {
        if (C297100Bki.LIZ() && str != null && !str.isEmpty()) {
            UrlModel urlModel = this.reuseAudioPlayUrl;
            if (urlModel != null && urlModel.getUrlList() != null && this.reuseAudioPlayUrl.getUrlList().contains(str)) {
                return this.reuseAudioPlayUrl.getUrlKey();
            }
            UrlModel urlModel2 = this.playUrl;
            if (urlModel2 != null && urlModel2.getUrlList() != null && this.playUrl.getUrlList().contains(str)) {
                return this.playUrl.getUrlKey();
            }
        }
        return null;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setArtistMusic(boolean z) {
        this.isArtistMusic = z;
    }

    public void setAuditionDuration(Integer num) {
        this.auditionDuration = num.intValue();
    }

    public void setAuthorDeleted(boolean z) {
        this.isAuthorDeleted = z;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setBeatInfo(MusicBeat musicBeat) {
        this.beatInfo = musicBeat;
    }

    public void setBestMatch(boolean z) {
        this.isBestMatch = z;
    }

    public void setBillboardRank(int i) {
        this.billboardRank = i;
    }

    public void setCanNotReuse(boolean z) {
        this.canNotReuse = z;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setClipShootDuration(int i) {
        this.clipShootDuration = i;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommercialMusic(boolean z) {
        this.isCommercialMusic = z;
    }

    public void setCommercialRight(boolean z) {
        this.hasCommerceRight = z;
    }

    public void setCommercialRightType(int i) {
        this.commercialRightType = i;
    }

    public void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setDurationHighPrecision(MusicHighPrecisionDuration musicHighPrecisionDuration) {
        this.durationHighPrecision = musicHighPrecisionDuration;
    }

    public Music setEffectsData(UrlModel urlModel) {
        this.effectsData = urlModel;
        return this;
    }

    public void setEnterPosition(String str) {
        this.enterPosition = str;
    }

    public void setExclusiveSubTitle(String str) {
        this.exclusiveSubTitle = str;
    }

    public void setExternalMusicInfos(List<ExternalMusicInfo> list) {
        this.mExternalMusicInfos = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtraParamFromPretreatment(C139Y c139y) {
        this.mExtraParamFromPretreatment = c139y;
    }

    public void setFullSongDetail(FullSongDetail fullSongDetail) {
        this.fullSongDetail = fullSongDetail;
    }

    public void setHasCommerceRightStrict(Boolean bool) {
        this.hasCommerceRightStrict = bool;
    }

    public void setHasHumanVoice(Boolean bool) {
        this.hasHumanVoice = bool;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setHighlightMusicOwnerInfo(List<MusicOwnerInfo> list) {
        this.highlightMusicOwnerInfo = list;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setIsFeedPreDownloadMdp(int i) {
        this.isFeedPreDownloadMdp = i;
    }

    public void setIsFollowerTagVisible(Boolean bool) {
        this.isFollowerTagVisible = bool.booleanValue();
    }

    public void setIsFriendTagVisible(Boolean bool) {
        this.isFriendTagVisible = bool.booleanValue();
    }

    public void setIsFullSong(boolean z) {
        this.isFullSong = z;
    }

    public void setIsSamiRecommend(boolean z) {
        this.isSamiRecommend = z;
    }

    public void setIsTrimmingLimited(boolean z) {
        this.isTrimmingLimited = z;
    }

    public void setListItemId(String str) {
        this.listItemId = str;
    }

    public void setLocalMusicId(long j) {
        this.localMusicId = j;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
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

    public void setLyricSceneCopyRight(LyricSceneCopyRight lyricSceneCopyRight) {
        this.lyricSceneCopyRight = lyricSceneCopyRight;
    }

    public void setLyricShort(String str) {
        this.lyricShort = str;
    }

    public void setLyricShortPosition(List<Position> list) {
        this.lyricShortPosition = list;
    }

    public void setLyrics(List<LyricStruct> list) {
        this.lyrics = list;
    }

    public void setMatchMetadata(boolean z) {
        this.isMatchMetadata = z;
    }

    public void setMatchedPGCSoundInfo(MatchedPGCSoundInfo matchedPGCSoundInfo) {
        this.matchedPGCSoundInfo = matchedPGCSoundInfo;
    }

    public void setMatchedSongInfo(MatchedSoundInfo matchedSoundInfo) {
        this.mMatchedSongInfo = matchedSoundInfo;
    }

    public void setMemeSongInfo(MemeSongInfo memeSongInfo) {
        this.memeSongInfo = memeSongInfo;
    }

    public void setMid(String str) {
        try {
            this.id = CastLongProtector.parseLong(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setMultiBitRatePlayInfo(List<SimBitRate> list) {
        this.multiBitRatePlayInfo = list;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicFusion(MusicFusion musicFusion) {
        this.musicFusion = musicFusion;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setMusicOwnerInfos(List<MusicOwnerInfo> list) {
        this.mMusicOwnerInfos = list;
    }

    public void setMusicRecommendStatus(long j) {
        this.musicRecommendStatus = j;
    }

    public void setMusicReleaseInfo(MusicReleaseInfo musicReleaseInfo) {
        this.musicReleaseInfo = musicReleaseInfo;
    }

    public void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMusicVolumeInfo(String str) {
        this.musicVolumeInfo = str;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setMuteType(int i) {
        this.muteType = i;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginMusic(boolean z) {
        this.isOriginMusic = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setOwnerBanShowInfo(String str) {
        this.mOwnerBanShowInfo = str;
    }

    public void setOwnerHandle(String str) {
        this.ownerHandle = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPinnedVideoStatus(int i) {
        this.pinnedVideoStatus = i;
    }

    public void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewEndTime(float f) {
        this.previewEndTime = f;
    }

    public void setPreviewPageShowMode(int i) {
        this.previewPageShowMode = i;
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

    public void setRecommendSourceFrom(String str) {
        this.recommendSourceFrom = str;
    }

    public void setRecommendTag(String str) {
        this.recommendTag = str;
    }

    public void setRelatedMusics(List<Music> list) {
        this.relatedMusics = list;
    }

    public void setRemainMusicFusion(RemainMusicFusion remainMusicFusion) {
        this.remainMusicFusion = remainMusicFusion;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setReuseAudioPlayUrl(UrlModel urlModel) {
        this.reuseAudioPlayUrl = urlModel;
    }

    public void setSameGroupIdV3(long j) {
        this.sameGroupIdV3 = Long.valueOf(j);
    }

    public void setSearchId(String str) {
        this.searchId = str;
    }

    public void setSearchMusicDesc(String str) {
        this.mSearchMusicDesc = str;
    }

    public void setSearchMusicName(String str) {
        this.mSearchMusicName = str;
    }

    public void setSearchResultId(String str) {
        this.searchResultId = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setShootDuration(Integer num) {
        this.shootDuration = num.intValue();
    }

    public void setShootingAllowed(Boolean bool) {
        this.isShootingAllowed = bool;
    }

    public void setSimGroupIdV3(long j) {
        this.simGroupIdV3 = Long.valueOf(j);
    }

    public void setSimilarMusics(List<Music> list) {
        this.similarMusics = list;
    }

    public void setSimilarTag(Integer num) {
        this.similarTag = num.intValue();
    }

    public void setSongWriter(List<MusicOwnerInfo> list) {
        this.songWriter = list;
    }

    public void setSoundsListType(int i) {
        this.mSoundsListType = i;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setTT2DSPSongInfos(List<TT2DSPSongInfo> list) {
        this.tt2DSPSongInfos = list;
    }

    public void setTT2DspAlbumInfo(TT2DspAlbumInfo tT2DspAlbumInfo) {
        this.tt2DspAlbumInfo = tT2DspAlbumInfo;
    }

    public void setTtmInfo(TTMMusicInfo tTMMusicInfo) {
        this.ttmInfo = tTMMusicInfo;
    }

    public void setUncertSongWriters(List<UncertMusicOwnerInfo> list) {
        this.uncertSongWriters = list;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setVideoDuration(int i) {
        this.videoDuration = i;
    }
}
