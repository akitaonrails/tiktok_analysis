package com.ss.android.ugc.aweme.shortvideo.model;

import X.C086I;
import X.C08FF;
import X.C0PVY;
import X.C139Y;
import X.C297100Bki;
import X.C616570OGh;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.LyricStruct;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class MusicModel implements Serializable, Cloneable {
    public static final long serialVersionUID = -8201137807648519242L;
    public AIGCInfo aigcInfo;
    public String album;
    public String allRate;
    public int auditionDuration;
    public String awemeId;
    public MusicBeat beatInfo;
    public int billboardRank;
    public String bindChallengeId;
    public boolean canBeStitched;
    public String categoryID;
    public int challengeUserCount;
    public int clipShootDuration;
    public CollectionType collectionType;
    public int comeFromForMod;
    public int commercialRightType;
    public String contentSource;
    public String contentType;
    public int dataType;
    public boolean dmvAutoShow;
    public boolean downloadAfterGoNext;
    public int duration;
    public MusicHighPrecisionDuration durationHighPrecision;
    public String extra;
    public boolean fromRecommend;
    public FullSongDetail fullSongDetail;
    public boolean hasCommerceRight;
    public Boolean hasCommerceRightStrict;
    public long id;
    public boolean isArtist;
    public boolean isBestMatch;
    public boolean isChallengeMusic;
    public boolean isCommerceMusic;
    public boolean isFullSong;
    public boolean isLastSimilarMusic;
    public boolean isMvThemeMusic;
    public boolean isOffline;
    public boolean isOriginal;
    public boolean isOriginalSound;
    public boolean isPgc;
    public boolean isSamiRecommend;
    public boolean isSelected;
    public boolean isSimilarMusic;
    public boolean isSmartExtended;
    public boolean isTrimmingLimited;
    public boolean isUnfold;
    public boolean isUnlimitedMusic;
    public long localMusicDuration;
    public long localMusicId;
    public String localPath;
    public String localThumbPath;
    public LogPbBean logPb;
    public int lrcType;
    public String lrcUrl;
    public String lyricContent;
    public int lyricContentType;
    public String lyricShort;
    public List<Position> lyricShortPosition;
    public List<LyricStruct> lyrics;
    public DynamicPatch mDynamicPatch;
    public C139Y mExtraParamFromPretreatment;
    public MatchedSoundInfo mMatchedSongInfo;
    public int mSoundsListType;
    public MatchedPGCSoundInfo matchedPGCSoundInfo;
    public int maxLoopDuration;
    public MemeSongModel memeSong;
    public List<MemeSongModel> memeSongModels;
    public Music music;
    public int musicBeginTime;
    public String musicEditFrom;
    public String musicEffectsUrl;
    public int musicEndFromCut;
    public int musicEndTime;
    public String musicId;
    public long musicRecommendStatus;
    public MusicReleaseInfo musicReleaseInfo;
    public String musicRootPageFrom;
    public String musicSelectedFrom;
    public int musicStart;
    public int musicStartFromCut;
    public int musicStatus;
    public List<MusicTag> musicTags;
    public int musicType;
    public String musicVolumeInfo;
    public MusicWaveBean musicWaveBean;
    public boolean muteShare;
    public String name;
    public boolean needSetCookie;
    public String offlineDesc;
    public String picBig;
    public String picHuge;
    public String picPremium;
    public String picSmall;
    public int pinnedVideoStatus;
    public boolean playRepeatFromEndTime;
    public UrlModel playUrl;
    public boolean preventDownload;
    public float previewStartTime;
    public int rank;
    public String recommendSourceFrom;
    public String recommendTag;
    public List<Aweme> relatedAwemes;
    public UrlModel reuseAudioPlayUrl;
    public long sameGroupIdV3;
    public String searchId;
    public String searchKeyWords;
    public int shootDuration;
    public boolean showDetail;
    public long simGroupIdV3;
    public List<MusicModel> similarMusicList;
    public int similarTag;
    public String singer;
    public List<MusicModel> smartExtendMusicList;
    public String songId;
    public int sourcePlatform;
    public UrlModel strongBeatUrl;
    public ArrayList<Integer> trimPointList;
    public boolean trimPointRecommended;
    public ArrayList<String> trimTypeList;
    public List<TT2DSPSongInfo> tt2DSPSongInfos;
    public int uiType;
    public int userCount;
    public int videoDuration;
    public boolean musicSelectedFromNonRecommendedTab = true;
    public CardType cardType = CardType.AWESearchMusicCardSinger;
    public String enterPosition = "";
    public String searchResultId = "";
    public String listItemId = "";
    public Long dateLastModified = 0L;
    public FromSection fromSection = FromSection.OTHER;
    public MusicItemType musicItemType = MusicItemType.ORIGIN;
    public int eventPosition = -1;
    public boolean needRecordConsumption = false;
    public int mFromCollectionType = 0;
    public boolean isPropOrChallenge = false;
    public boolean musicDetailFetched = false;
    public TT2DspAlbumInfo tt2DspAlbumInfo = null;
    public boolean downloadComplete = false;
    public boolean isMultiMusicFromTemplate = false;
    public boolean isCCTemplateLocalMusic = false;
    public int isFeedPreDownloadMdp = 0;
    public boolean isStripMusic = false;
    public boolean shouldUseMDPDownloader = false;

    public interface MusicType {
    }

    public interface UiType {
    }

    private UrlModel getDownloadUrlModel() {
        UrlModel urlModel;
        if (((this.musicType != 2 || (urlModel = this.reuseAudioPlayUrl) == null) && (urlModel = this.playUrl) == null) || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return null;
        }
        return urlModel;
    }

    public Music convertToMusic() {
        Music music = new Music();
        music.setMid(this.musicId);
        music.setId(this.id);
        music.setSimGroupIdV3(this.simGroupIdV3);
        music.setSameGroupIdV3(this.sameGroupIdV3);
        music.setIdStr(String.valueOf(this.id));
        music.setCollectStatus(this.collectionType == CollectionType.COLLECTED ? 1 : 0);
        music.setAlbum(this.album);
        music.setAuthorName(this.singer);
        if (getMusic() != null) {
            music.setChallenge(getMusic().getChallenge());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.picBig);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        urlModel.setUri(Uri.decode(this.picBig));
        music.setCoverLarge(urlModel);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.picPremium);
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setUrlList(arrayList2);
        urlModel2.setUri(Uri.decode(this.picPremium));
        music.setCoverMedium(urlModel2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.picSmall);
        UrlModel urlModel3 = new UrlModel();
        urlModel3.setUrlList(arrayList3);
        urlModel3.setUri(Uri.decode(this.picSmall));
        music.setCoverThumb(urlModel3);
        music.setDuration(this.duration);
        music.setShootDuration(Integer.valueOf(this.shootDuration));
        music.setAuditionDuration(Integer.valueOf(this.auditionDuration));
        music.setDurationHighPrecision(this.durationHighPrecision);
        music.setMusicName(this.name);
        music.setUserCount(this.userCount);
        music.setMusicTags(this.musicTags);
        music.setSimilarTag(Integer.valueOf(this.similarTag));
        music.setRecommendSourceFrom(this.recommendSourceFrom);
        music.setBillboardRank(this.billboardRank);
        music.setCommercialMusic(this.isCommerceMusic);
        music.setCommercialRight(this.hasCommerceRight);
        music.setHasCommerceRightStrict(this.hasCommerceRightStrict);
        music.setOriginalSound(this.isOriginalSound);
        int i = this.musicType;
        if (i == 1) {
            music.setPlayUrl(this.playUrl);
        } else if (i == 2) {
            music.setReuseAudioPlayUrl(this.reuseAudioPlayUrl);
        }
        music.setOfflineDesc(this.offlineDesc);
        music.setMusicStatus(this.musicStatus);
        music.setMusicRecommendStatus(this.musicRecommendStatus);
        music.setStrongBeatUrl(this.strongBeatUrl);
        music.setLrcType(this.lrcType);
        music.setLyricContent(this.lyricContent);
        music.setLyricContentType(this.lyricContentType);
        music.setLyrics(this.lyrics);
        music.setPreviewStartTime(this.previewStartTime);
        music.setLrcUrl(this.lrcUrl);
        music.setPreventDownload(isPreventDownload());
        music.setLyricShort(this.lyricShort);
        music.setLyricShortPosition(this.lyricShortPosition);
        music.setNeedSetCookie(isNeedSetCookie());
        music.setVideoDuration(this.videoDuration);
        music.setPgc(this.isPgc);
        music.setIsSamiRecommend(this.isSamiRecommend);
        music.setMatchedSongInfo(this.mMatchedSongInfo);
        music.setMatchedPGCSoundInfo(this.matchedPGCSoundInfo);
        music.setFullSongDetail(this.fullSongDetail);
        music.setIsFullSong(this.isFullSong);
        music.setIsTrimmingLimited(this.isTrimmingLimited);
        music.setClipShootDuration(this.clipShootDuration);
        music.setBeatInfo(this.beatInfo);
        music.setSoundsListType(this.mSoundsListType);
        music.setLocalMusicId(this.localMusicId);
        music.setMuteShare(this.muteShare);
        music.setSearchResultId(this.searchResultId);
        music.setListItemId(this.listItemId);
        music.setRecommendTag(this.recommendTag);
        music.setPinnedVideoStatus(this.pinnedVideoStatus);
        music.setMusicReleaseInfo(this.musicReleaseInfo);
        music.setTT2DspAlbumInfo(this.tt2DspAlbumInfo);
        music.setTT2DSPSongInfos(this.tt2DSPSongInfos);
        music.setMusicVolumeInfo(this.musicVolumeInfo);
        music.isUnlimitedMusic = this.isUnlimitedMusic;
        music.canBeStitched = this.canBeStitched;
        return music;
    }

    public Integer getAuditionDuration() {
        return Integer.valueOf(this.auditionDuration);
    }

    public String getAwemeId() {
        String str = this.awemeId;
        return str == null ? "" : str;
    }

    public int getClipShootDuration() {
        int i = this.clipShootDuration;
        return i == 0 ? this.shootDuration : i;
    }

    public CollectionType getCollectionType() {
        Music music = this.music;
        return music != null ? music.getCollectStatus() != 1 ? CollectionType.NOT_COLLECTED : CollectionType.COLLECTED : this.collectionType;
    }

    public C139Y getExtraParamFromPretreatment() {
        if (this.mExtraParamFromPretreatment == null) {
            this.mExtraParamFromPretreatment = new C139Y();
        }
        return this.mExtraParamFromPretreatment;
    }

    public int getFullSongShootDuration() {
        FullSongDetail fullSongDetail = this.fullSongDetail;
        return fullSongDetail != null ? (fullSongDetail.getFullSongShootDurationPrecision() == null || !this.durationHighPrecision.checkDataValidate(this.fullSongDetail.getFullSongShootDurationPrecision())) ? this.fullSongDetail.getFullSongShootDuration() != null ? this.fullSongDetail.getFullSongShootDuration().intValue() : getShootDuration().intValue() : this.durationHighPrecision.convertS2MS(this.fullSongDetail.getFullSongShootDurationPrecision().floatValue()) : getShootDuration().intValue();
    }

    public List<MusicModel> getMergedMusicList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        List<MusicModel> list = this.smartExtendMusicList;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.smartExtendMusicList);
        }
        return arrayList;
    }

    public int getPreciseAuditionDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        return (musicHighPrecisionDuration == null || musicHighPrecisionDuration.getAuditionDurationPrecision() == null || this.durationHighPrecision.getAuditionDurationPrecision().floatValue() <= 0.0f) ? this.auditionDuration : (int) (this.durationHighPrecision.getAuditionDurationPrecision().floatValue() * 1000.0f);
    }

    public int getPresenterDuration() {
        if (this.musicType == 0) {
            return (int) this.localMusicDuration;
        }
        int i = this.clipShootDuration;
        return i > 0 ? i : this.duration;
    }

    public int getRealAuditionDuration() {
        int i = this.auditionDuration;
        return i > 0 ? i : getPresenterDuration();
    }

    public Integer getShootDuration() {
        return Integer.valueOf(this.shootDuration);
    }

    public int getShootDurationOrDuration() {
        int i = this.shootDuration;
        return i != 0 ? i : this.duration;
    }

    public Integer getSimilarTag() {
        return Integer.valueOf(this.similarTag);
    }

    public int getTrimmedMusicDuration() {
        int i = this.musicStartFromCut;
        int i2 = this.duration;
        if (i > i2) {
            return 0;
        }
        return this.musicEndTime == 0 ? i2 - i : i2 - i;
    }

    public String getUri() {
        UrlModel urlModel;
        return ((this.musicType != 2 || (urlModel = this.reuseAudioPlayUrl) == null) && (urlModel = this.playUrl) == null) ? "" : urlModel.getUri();
    }

    public boolean hasExtendMusicList() {
        List<MusicModel> list;
        return (!this.isSmartExtended || (list = this.smartExtendMusicList) == null || list.isEmpty()) ? false : true;
    }

    public boolean hasLyricsCopyRight() {
        Music music = this.music;
        if (music == null) {
            return false;
        }
        return music.hasLyricSceneCopyRight();
    }

    public boolean isLocalMusic() {
        int i = this.musicType;
        return i == 0 || i == 3 || i == 6;
    }

    public boolean isMemeSong() {
        return this.musicType == 6;
    }

    public boolean isNeedReuse() {
        return this.musicType != 2 && getTrimmedMusicDuration() >= 1000 && getDuration() - getTrimmedMusicDuration() > 100;
    }

    public boolean isPlayUrlValid() {
        UrlModel urlModel;
        if (this.musicType != 2 || (urlModel = this.reuseAudioPlayUrl) == null) {
            urlModel = this.playUrl;
        }
        return (urlModel == null || TextUtils.isEmpty(urlModel.getUri()) || C616570OGh.LIZ(urlModel.getUrlList())) ? false : true;
    }

    public Boolean isRealMusicItem() {
        MusicItemType musicItemType = this.musicItemType;
        return Boolean.valueOf(musicItemType == MusicItemType.ORIGIN || musicItemType == MusicItemType.RECOMMENDED_FAV_MUSIC);
    }

    public boolean isUnreadableMusic() {
        if (getMusic() != null && getMusic().getExtra() != null) {
            try {
                if (new JSONObject(getMusic().getExtra()).has("can_read")) {
                    return !JSONObjectProtectorUtils.getBoolean(r1, "can_read");
                }
                return false;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MusicModel m317clone() {
        try {
            return (MusicModel) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getDownloadUrl() {
        UrlModel downloadUrlModel = getDownloadUrlModel();
        return (downloadUrlModel == null || downloadUrlModel.getUrlList() == null || downloadUrlModel.getUrlList().isEmpty()) ? "" : (String) ListProtector.get(downloadUrlModel.getUrlList(), 0);
    }

    public String getDownloadUrlKey() {
        UrlModel downloadUrlModel;
        if (C297100Bki.LIZ() && (downloadUrlModel = getDownloadUrlModel()) != null) {
            return downloadUrlModel.getUrlKey();
        }
        return null;
    }

    public boolean isCollected() {
        List<MusicModel> mergedMusicList = getMergedMusicList();
        if (C086I.LIZIZ(mergedMusicList)) {
            return false;
        }
        Iterator<MusicModel> it2 = mergedMusicList.iterator();
        while (it2.hasNext()) {
            if (it2.next().collectionType != CollectionType.COLLECTED) {
                return false;
            }
        }
        return true;
    }

    public boolean isLoopMusic() {
        List<MusicModel> mergedMusicList;
        if (!hasExtendMusicList() || (mergedMusicList = getMergedMusicList()) == null || mergedMusicList.size() <= 1) {
            return false;
        }
        String str = ((MusicModel) ListProtector.get(mergedMusicList, 0)).musicId;
        for (int i = 1; i < mergedMusicList.size(); i++) {
            if (!C0PVY.LIZ(str, ((MusicModel) ListProtector.get(mergedMusicList, i)).musicId)) {
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

    public String getAllRate() {
        return this.allRate;
    }

    public MusicBeat getBeatInfo() {
        return this.beatInfo;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public String getBindChallengeId() {
        return this.bindChallengeId;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public int getChallengeUserCount() {
        return this.challengeUserCount;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public int getCommercialRightType() {
        return this.commercialRightType;
    }

    public String getContentSource() {
        return this.contentSource;
    }

    public String getContentType() {
        return this.contentType;
    }

    public int getDataType() {
        return this.dataType;
    }

    public Long getDateLastModified() {
        return this.dateLastModified;
    }

    public boolean getDmvAutoShow() {
        return this.dmvAutoShow;
    }

    public boolean getDownloadComplete() {
        return this.downloadComplete;
    }

    public int getDuration() {
        return this.duration;
    }

    public MusicHighPrecisionDuration getDurationHighPrecision() {
        return this.durationHighPrecision;
    }

    public DynamicPatch getDynamicPatch() {
        return this.mDynamicPatch;
    }

    public String getEditFrom() {
        return this.musicEditFrom;
    }

    public String getEnterPosition() {
        return this.enterPosition;
    }

    public int getEventPosition() {
        return this.eventPosition;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getFromCollectionType() {
        return this.mFromCollectionType;
    }

    public FromSection getFromSection() {
        return this.fromSection;
    }

    public FullSongDetail getFullSongDetail() {
        return this.fullSongDetail;
    }

    public long getId() {
        return this.id;
    }

    public boolean getIsFullSong() {
        return this.isFullSong;
    }

    public boolean getIsPropOrChallenge() {
        return this.isPropOrChallenge;
    }

    public boolean getIsStripMusic() {
        return this.isStripMusic;
    }

    public boolean getIsTrimmingLimited() {
        return this.isTrimmingLimited;
    }

    public String getListItemId() {
        return this.listItemId;
    }

    public long getLocalMusicDuration() {
        return this.localMusicDuration;
    }

    public long getLocalMusicId() {
        return this.localMusicId;
    }

    public String getLocalPath() {
        return this.localPath;
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

    public int getMaxLoopDuration() {
        return this.maxLoopDuration;
    }

    public MemeSongModel getMemeSong() {
        return this.memeSong;
    }

    public List<MemeSongModel> getMemeSongModels() {
        return this.memeSongModels;
    }

    public Music getMusic() {
        return this.music;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public boolean getMusicDetailFetched() {
        return this.musicDetailFetched;
    }

    public String getMusicEffects() {
        return this.musicEffectsUrl;
    }

    public int getMusicEndFromCut() {
        return this.musicEndFromCut;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public MusicItemType getMusicItemType() {
        return this.musicItemType;
    }

    public long getMusicRecommendStatus() {
        return this.musicRecommendStatus;
    }

    public MusicReleaseInfo getMusicReleaseInfo() {
        return this.musicReleaseInfo;
    }

    public String getMusicRootPageFrom() {
        return this.musicRootPageFrom;
    }

    public String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public boolean getMusicSelectedFromNonRecommendedTab() {
        return this.musicSelectedFromNonRecommendedTab;
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

    public MusicWaveBean getMusicWaveBean() {
        return this.musicWaveBean;
    }

    public String getName() {
        return this.name;
    }

    public boolean getNeedRecordConsumption() {
        return this.needRecordConsumption;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPicBig() {
        return this.picBig;
    }

    public String getPicHuge() {
        return this.picHuge;
    }

    public String getPicPremium() {
        return this.picPremium;
    }

    public String getPicSmall() {
        return this.picSmall;
    }

    public int getPinnedVideoStatus() {
        return this.pinnedVideoStatus;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public int getRank() {
        return this.rank;
    }

    public String getRecommendSourceFrom() {
        return this.recommendSourceFrom;
    }

    public String getRecommendTag() {
        return this.recommendTag;
    }

    public List<Aweme> getRelatedAwemes() {
        return this.relatedAwemes;
    }

    public UrlModel getReuseAudioPlayUrl() {
        return this.reuseAudioPlayUrl;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public String getSearchResultId() {
        return this.searchResultId;
    }

    public List<MusicModel> getSimilarMusicList() {
        return this.similarMusicList;
    }

    public String getSinger() {
        return this.singer;
    }

    public List<MusicModel> getSmartExtendMusicList() {
        return this.smartExtendMusicList;
    }

    public String getSongId() {
        return this.songId;
    }

    public int getSoundsListType() {
        return this.mSoundsListType;
    }

    public int getSourcePlatform() {
        return this.sourcePlatform;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public List<TT2DSPSongInfo> getTT2DSPSongInfo() {
        return this.tt2DSPSongInfos;
    }

    public TT2DspAlbumInfo getTT2DspAlbumInfo() {
        return this.tt2DspAlbumInfo;
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

    public int getUiType() {
        return this.uiType;
    }

    public UrlModel getUrl() {
        return this.playUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public boolean hasCommerceRight() {
        return this.hasCommerceRight;
    }

    public Boolean hasCommerceRightStrict() {
        return this.hasCommerceRightStrict;
    }

    public boolean isArtist() {
        return this.isArtist;
    }

    public boolean isCCTemplateLocalMusic() {
        return this.isCCTemplateLocalMusic;
    }

    public boolean isChallengeMusic() {
        return this.isChallengeMusic;
    }

    public boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public boolean isDownloadAfterGoNext() {
        return this.downloadAfterGoNext;
    }

    public boolean isFromRecommend() {
        return this.fromRecommend;
    }

    public boolean isHasCommerceRight() {
        return this.hasCommerceRight;
    }

    public boolean isLastSimilarMusic() {
        return this.isLastSimilarMusic;
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

    public boolean isOffline() {
        return this.isOffline;
    }

    public boolean isOriginal() {
        return this.isOriginal;
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

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isSimilarMusic() {
        return this.isSimilarMusic;
    }

    public boolean isSmartExtended() {
        return this.isSmartExtended;
    }

    public boolean isUnfold() {
        return this.isUnfold;
    }

    public boolean isUnlimitedMusic() {
        return this.isUnlimitedMusic;
    }

    /* JADX INFO: loaded from: classes11.dex */
    public enum CardType {
        AWESearchMusicCardNone,
        AWESearchMusicCardOrdinary,
        AWESearchMusicCardDuplicated,
        AWESearchMusicCardSinger,
        AWESearchMusicCardMusicWithVideo;

        public static CardType valueOf(String str) {
            return (CardType) C08FF.LIZ(CardType.class, str);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public enum CollectionType {
        NOT_COLLECTED,
        COLLECTED;

        public static CollectionType valueOf(String str) {
            return (CollectionType) C08FF.LIZ(CollectionType.class, str);
        }
    }

    public enum FromSection {
        OTHER("other"),
        CSP_BANNER("csp_banner"),
        CSP_RECOMMENDED("csp_recommended"),
        CSP_PLAYLISTS("csp_playlists"),
        CSP_UNFOLDED_PLAYLISTS("csp_unfolded_playlists"),
        CSP_VIEW_ALL_UNFOLDED_PLAYLIST("csp_view_all_unfolded_playlist"),
        SEARCH("search"),
        FAVORITE("favourite"),
        CHALLENGE("challenge"),
        EFFECT("effect"),
        NO_MUSIC("no_music");

        public final String value;

        public static FromSection valueOf(String str) {
            return (FromSection) C08FF.LIZ(FromSection.class, str);
        }

        FromSection(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public enum MusicItemType {
        ORIGIN,
        RECOMMENDED_FAV_MUSIC,
        LOADING_VIEW;

        public static MusicItemType valueOf(String str) {
            return (MusicItemType) C08FF.LIZ(MusicItemType.class, str);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public enum SimilarMusicStatus {
        FOLD,
        UNFOLD;

        public static SimilarMusicStatus valueOf(String str) {
            return (SimilarMusicStatus) C08FF.LIZ(SimilarMusicStatus.class, str);
        }
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

    public void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAllRate(String str) {
        this.allRate = str;
    }

    public void setArtist(boolean z) {
        this.isArtist = z;
    }

    public void setAuditionDuration(Integer num) {
        this.auditionDuration = num.intValue();
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
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

    public void setBindChallengeId(String str) {
        this.bindChallengeId = str;
    }

    public void setCCTemplateLocalMusic(boolean z) {
        this.isCCTemplateLocalMusic = z;
    }

    public void setCanBeStitched(boolean z) {
        this.canBeStitched = z;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public void setCategoryID(String str) {
        this.categoryID = str;
    }

    public void setChallengeMusic(boolean z) {
        this.isChallengeMusic = z;
    }

    public void setChallengeUserCount(int i) {
        this.challengeUserCount = i;
    }

    public void setClipShootDuration(int i) {
        this.clipShootDuration = i;
    }

    public void setCollectionType(CollectionType collectionType) {
        int i;
        this.collectionType = collectionType;
        Music music = this.music;
        if (music != null) {
            if (collectionType == CollectionType.NOT_COLLECTED) {
                i = 0;
            } else {
                i = 1;
            }
            music.setCollectStatus(i);
        }
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

    public void setContentSource(String str) {
        this.contentSource = str;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setDateLastModified(Long l) {
        this.dateLastModified = l;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDownloadAfterGoNext(boolean z) {
        this.downloadAfterGoNext = z;
    }

    public void setDownloadComplete(boolean z) {
        this.downloadComplete = z;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setDurationHighPrecision(MusicHighPrecisionDuration musicHighPrecisionDuration) {
        this.durationHighPrecision = musicHighPrecisionDuration;
    }

    public void setDynamicPatch(DynamicPatch dynamicPatch) {
        this.mDynamicPatch = dynamicPatch;
    }

    public void setEditFrom(String str) {
        this.musicEditFrom = str;
    }

    public void setEnterPosition(String str) {
        this.enterPosition = str;
    }

    public void setEventPosition(int i) {
        this.eventPosition = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtraParamFromPretreatment(C139Y c139y) {
        this.mExtraParamFromPretreatment = c139y;
    }

    public void setFromCollectionType(int i) {
        this.mFromCollectionType = i;
    }

    public void setFromRecommend(boolean z) {
        this.fromRecommend = z;
    }

    public void setFromSection(FromSection fromSection) {
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

    public void setId(long j) {
        this.id = j;
    }

    public void setIsFullSong(boolean z) {
        this.isFullSong = z;
    }

    public void setIsPropOrChallenge(boolean z) {
        this.isPropOrChallenge = z;
    }

    public void setIsSamiRecommend(boolean z) {
        this.isSamiRecommend = z;
    }

    public void setIsStripMusic(boolean z) {
        this.isStripMusic = z;
    }

    public void setIsTrimmingLimited(boolean z) {
        this.isTrimmingLimited = z;
    }

    public void setLastSimilarMusic(boolean z) {
        this.isLastSimilarMusic = z;
    }

    public void setListItemId(String str) {
        this.listItemId = str;
    }

    public void setLocalMusicDuration(long j) {
        this.localMusicDuration = j;
    }

    public void setLocalMusicId(long j) {
        this.localMusicId = j;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public void setLocalThumbPath(String str) {
        this.localThumbPath = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLogPbOrNot(LogPbBean logPbBean) {
        LogPbBean logPbBean2 = this.logPb;
        if ((logPbBean2 == null || logPbBean2.getImprId() == null) && logPbBean != null && logPbBean.getImprId() != null) {
            LogPbBean logPbBean3 = new LogPbBean();
            this.logPb = logPbBean3;
            logPbBean3.setImprId(logPbBean.getImprId());
        }
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

    public void setLyricShort(String str) {
        this.lyricShort = str;
    }

    public void setLyricShortPosition(List<Position> list) {
        this.lyricShortPosition = list;
    }

    public void setLyrics(List<LyricStruct> list) {
        this.lyrics = list;
    }

    public void setMatchedPGCSoundInfo(MatchedPGCSoundInfo matchedPGCSoundInfo) {
        this.matchedPGCSoundInfo = matchedPGCSoundInfo;
    }

    public void setMatchedSoundInfo(MatchedSoundInfo matchedSoundInfo) {
        this.mMatchedSongInfo = matchedSoundInfo;
    }

    public void setMaxLoopDuration(int i) {
        this.maxLoopDuration = i;
    }

    public void setMemeSong(MemeSongModel memeSongModel) {
        this.memeSong = memeSongModel;
    }

    public void setMemeSongModels(List<MemeSongModel> list) {
        this.memeSongModels = list;
    }

    public void setMultiMusicFromTemplate(boolean z) {
        this.isMultiMusicFromTemplate = z;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicDetailFetched(boolean z) {
        this.musicDetailFetched = z;
    }

    public MusicModel setMusicEffects(String str) {
        this.musicEffectsUrl = str;
        return this;
    }

    public void setMusicEndFromCut(int i) {
        this.musicEndFromCut = i;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicItemType(MusicItemType musicItemType) {
        this.musicItemType = musicItemType;
    }

    public void setMusicRecommendStatus(long j) {
        this.musicRecommendStatus = j;
    }

    public void setMusicReleaseInfo(MusicReleaseInfo musicReleaseInfo) {
        this.musicReleaseInfo = musicReleaseInfo;
    }

    public void setMusicRootPageFrom(String str) {
        this.musicRootPageFrom = str;
    }

    public void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public void setMusicSelectedFromNonRecommendedTab(boolean z) {
        this.musicSelectedFromNonRecommendedTab = z;
    }

    public void setMusicStart(int i) {
        this.musicStart = i;
    }

    public void setMusicStartFromCut(int i) {
        this.musicStartFromCut = i;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMusicType(int i) {
        this.musicType = i;
    }

    public void setMusicVolumeInfo(String str) {
        this.musicVolumeInfo = str;
    }

    public void setMusicWaveBean(MusicWaveBean musicWaveBean) {
        this.musicWaveBean = musicWaveBean;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNeedRecordConsumption(boolean z) {
        this.needRecordConsumption = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOffline(boolean z) {
        this.isOffline = z;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginal(boolean z) {
        this.isOriginal = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPicBig(String str) {
        this.picBig = str;
    }

    public void setPicHuge(String str) {
        this.picHuge = str;
    }

    public void setPicPremium(String str) {
        this.picPremium = str;
    }

    public void setPicSmall(String str) {
        this.picSmall = str;
    }

    public void setPinnedVideoStatus(int i) {
        this.pinnedVideoStatus = i;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRecommendSourceFrom(String str) {
        this.recommendSourceFrom = str;
    }

    public void setRecommendTag(String str) {
        this.recommendTag = str;
    }

    public void setRelatedAwemes(List<Aweme> list) {
        this.relatedAwemes = list;
    }

    public void setReuseAudioPlayUrl(UrlModel urlModel) {
        this.reuseAudioPlayUrl = urlModel;
    }

    public void setSameGroupIdV3(long j) {
        this.sameGroupIdV3 = j;
    }

    public void setSearchId(String str) {
        this.searchId = str;
    }

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setSearchResultId(String str) {
        this.searchResultId = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setShootDuration(Integer num) {
        this.shootDuration = num.intValue();
    }

    public void setSimGroupIdV3(long j) {
        this.simGroupIdV3 = j;
    }

    public void setSimilarMusic(boolean z) {
        this.isSimilarMusic = z;
    }

    public void setSimilarMusicList(List<MusicModel> list) {
        this.similarMusicList = list;
    }

    public void setSimilarTag(Integer num) {
        this.similarTag = num.intValue();
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public void setSmartExtendMusicList(List<MusicModel> list) {
        this.smartExtendMusicList = list;
    }

    public void setSmartExtended(boolean z) {
        this.isSmartExtended = z;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setSoundsListType(int i) {
        this.mSoundsListType = i;
    }

    public void setSourcePlatform(int i) {
        this.sourcePlatform = i;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setTT2DSPAlbumInfo(TT2DspAlbumInfo tT2DspAlbumInfo) {
        this.tt2DspAlbumInfo = tT2DspAlbumInfo;
    }

    public void setTT2DSPSongInfos(List<TT2DSPSongInfo> list) {
        this.tt2DSPSongInfos = list;
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

    public void setUiType(int i) {
        this.uiType = i;
    }

    public void setUnfold(boolean z) {
        this.isUnfold = z;
    }

    public void setUnlimitedMusic(boolean z) {
        this.isUnlimitedMusic = z;
    }

    public void setUri(String str) {
        this.playUrl.setUri(str);
    }

    public void setUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setVideoDuration(int i) {
        this.videoDuration = i;
    }
}
