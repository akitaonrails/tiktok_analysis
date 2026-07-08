package com.ss.android.ugc.aweme.music.model;

import X.C13LP;
import X.C15438062q;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicBeanUtilKt {
    public static final AVMusic extractAVMusic(MusicBuzModel musicBuzModel) {
        MusicObject musicObject;
        MusicModel.FromSection fromSection;
        ArrayList<Integer> arrayList;
        boolean z;
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        float[] fArr;
        ArrayList arrayList2 = null;
        if (musicBuzModel == null || (musicObject = musicBuzModel.music) == null) {
            return null;
        }
        AVMusic aVMusicExtractAVMusic = extractAVMusic(musicObject);
        aVMusicExtractAVMusic.setSoundSpeed(musicBuzModel.soundSpeed);
        aVMusicExtractAVMusic.setChangeTone(Boolean.valueOf(musicBuzModel.changeTone));
        aVMusicExtractAVMusic.setSoundFilterId(musicBuzModel.soundFilterId);
        aVMusicExtractAVMusic.challenge = musicBuzModel.challenge;
        aVMusicExtractAVMusic.setCategoryID(musicBuzModel.categoryID);
        aVMusicExtractAVMusic.setCancelAbleInShoot(musicBuzModel.cancelAbleInShoot);
        aVMusicExtractAVMusic.setCollected(musicBuzModel.isCollected);
        aVMusicExtractAVMusic.setComeFromForMod(musicBuzModel.comeFromForMod);
        aVMusicExtractAVMusic.ignoreReuseAudio = musicBuzModel.ignoreReuseAudio;
        aVMusicExtractAVMusic.setMvThemeMusic(musicBuzModel.isMvThemeMusic);
        aVMusicExtractAVMusic.setLocalMusicDuration(musicBuzModel.localMusicDuration);
        aVMusicExtractAVMusic.setLogPb(musicBuzModel.logPb);
        aVMusicExtractAVMusic.setFromRecommend(musicBuzModel.fromRecommend);
        MusicModel.FromSection[] fromSectionArrValues = MusicModel.FromSection.values();
        int i = musicBuzModel.fromSection;
        if (i >= 0 && i < fromSectionArrValues.length) {
            fromSection = fromSectionArrValues[i];
        } else {
            fromSection = MusicModel.FromSection.OTHER;
        }
        aVMusicExtractAVMusic.setFromSection(fromSection);
        aVMusicExtractAVMusic.setEditFrom(musicBuzModel.musicEditFrom);
        aVMusicExtractAVMusic.setMusicStartFromCut(musicBuzModel.musicStartFromCut);
        aVMusicExtractAVMusic.setMusicStart(musicBuzModel.musicStart);
        aVMusicExtractAVMusic.setMusicEndFromCut(musicBuzModel.musicEndFromCut);
        aVMusicExtractAVMusic.setMusicEndTime(musicBuzModel.musicEnd);
        aVMusicExtractAVMusic.setTrimPointRecommended(musicBuzModel.trimPointRecommended);
        List<Integer> list = musicBuzModel.trimPointsList;
        if (list != null) {
            arrayList = new ArrayList<>(list);
        } else {
            arrayList = null;
        }
        aVMusicExtractAVMusic.setTrimPointList(arrayList);
        aVMusicExtractAVMusic.setTrimTypeList(musicBuzModel.trimTypeList);
        aVMusicExtractAVMusic.setMusicPriority(musicBuzModel.musicPriority);
        MusicObject musicObject2 = musicBuzModel.music;
        if (musicObject2 != null) {
            z = musicObject2.isPgc;
        } else {
            z = false;
        }
        aVMusicExtractAVMusic.setPgc(z);
        MusicObject musicObject3 = musicBuzModel.music;
        if (musicObject3 != null) {
            matchedPGCSoundInfo = musicObject3.matchedPGCSoundInfo;
        } else {
            matchedPGCSoundInfo = null;
        }
        aVMusicExtractAVMusic.setMatchedPGCSoundInfo(matchedPGCSoundInfo);
        aVMusicExtractAVMusic.isSamiRecommend = musicBuzModel.isSamiRecommend;
        aVMusicExtractAVMusic.setMetaSongID(musicBuzModel.metaSongID);
        aVMusicExtractAVMusic.setMatchedSongInfo(musicBuzModel.matchedSongInfo);
        aVMusicExtractAVMusic.musicType = musicBuzModel.musicType;
        aVMusicExtractAVMusic.similarTag = musicBuzModel.similarTag;
        aVMusicExtractAVMusic.recommendSourceFrom = musicBuzModel.recommendSourceFrom;
        Float[] fArr2 = musicBuzModel.musicWaveData;
        if (fArr2 != null) {
            int length = fArr2.length;
            fArr = new float[length];
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = fArr2[i2].floatValue();
            }
        } else {
            fArr = null;
        }
        aVMusicExtractAVMusic.setMusicWaveData(fArr);
        aVMusicExtractAVMusic.path = musicBuzModel.path;
        aVMusicExtractAVMusic.onlinePath = musicBuzModel.onlinePath;
        aVMusicExtractAVMusic.onlineKey = musicBuzModel.onlineKey;
        aVMusicExtractAVMusic.setSearchKeyWords(musicBuzModel.searchKeyWords);
        aVMusicExtractAVMusic.setShouldShowCommerceTips(musicBuzModel.shouldShowCommerceTips);
        aVMusicExtractAVMusic.setStickPointMusicAlg(musicBuzModel.stickPointMusicAlg);
        aVMusicExtractAVMusic.setSongId(musicBuzModel.songId);
        aVMusicExtractAVMusic.setLocalThumbPath(musicBuzModel.localThumbPath);
        aVMusicExtractAVMusic.setFullSongDetail(musicBuzModel.fullSongDetail);
        aVMusicExtractAVMusic.clipShootDuration = musicBuzModel.clipShootDuration;
        aVMusicExtractAVMusic.isFullSong = musicBuzModel.isFullSong;
        aVMusicExtractAVMusic.isTrimmingLimited = musicBuzModel.isTrimmingLimited;
        List<MusicBuzModel> list2 = musicBuzModel.extendMusicList;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            Iterator<MusicBuzModel> it2 = list2.iterator();
            while (it2.hasNext()) {
                AVMusic aVMusicExtractAVMusic2 = extractAVMusic(it2.next());
                if (aVMusicExtractAVMusic2 != null) {
                    arrayList2.add(aVMusicExtractAVMusic2);
                }
            }
        }
        aVMusicExtractAVMusic.setExtendMusicList(arrayList2);
        aVMusicExtractAVMusic.setMusicVolumeInfo(musicBuzModel.musicVolumeInfo);
        aVMusicExtractAVMusic.setMusicSelectedFrom(musicBuzModel.musicSelectedFrom);
        aVMusicExtractAVMusic.isFeedPreDownloadMdp = musicBuzModel.isFeedPreDownloadMdp;
        aVMusicExtractAVMusic.setBestMatch(musicBuzModel.isBestMatch);
        aVMusicExtractAVMusic.setMultiMusicFromTemplate(musicBuzModel.isMultiMusicFromTemplate);
        aVMusicExtractAVMusic.setCCTemplateLocalMusic(musicBuzModel.isCCTemplateLocalMusic);
        aVMusicExtractAVMusic.setAigcInfo(musicBuzModel.aigcInfo);
        aVMusicExtractAVMusic.setStripMusicModel(musicBuzModel.stripMusicModel);
        MusicBuzCompatModel musicBuzCompatModel = musicBuzModel.musicBuzCompatModel;
        aVMusicExtractAVMusic.setMusicBuzCompatModel(musicBuzCompatModel.copy(musicBuzCompatModel.musicRootPageFrom, musicBuzCompatModel.cloudUnderstandingKey));
        return aVMusicExtractAVMusic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MusicObject extractMusicObject(AVMusic aVMusic) {
        long j = aVMusic.id;
        long j2 = aVMusic.sameGroupIdV3;
        long j3 = aVMusic.simGroupIdV3;
        String str = aVMusic.album;
        String str2 = aVMusic.authorName;
        int duration = aVMusic.getDuration();
        int auditionDuration = aVMusic.getAuditionDuration();
        int shootDuration = aVMusic.getShootDuration();
        UrlModel urlModel = aVMusic.coverLarge;
        UrlModel urlModel2 = aVMusic.coverMedium;
        UrlModel urlModel3 = aVMusic.coverThumb;
        boolean dmvAutoShow = aVMusic.getDmvAutoShow();
        MusicHighPrecisionDuration musicHighPrecisionDuration = aVMusic.durationHighPrecision;
        String str3 = aVMusic.extra;
        boolean zIsCommerceMusic = aVMusic.isCommerceMusic();
        boolean zIsHasCommerceRight = aVMusic.isHasCommerceRight();
        Boolean boolIsHasCommerceRightStrict = aVMusic.isHasCommerceRightStrict();
        boolean zIsOriginalSound = aVMusic.isOriginalSound();
        boolean zIsPgc = aVMusic.isPgc();
        MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
        MatchedSoundInfo matchedSongInfo = aVMusic.getMatchedSongInfo();
        long localMusicId = aVMusic.getLocalMusicId();
        int lrcType = aVMusic.getLrcType();
        String lrcUrl = aVMusic.getLrcUrl();
        String lyricContent = aVMusic.getLyricContent();
        int lyricContentType = aVMusic.getLyricContentType();
        List<LyricStruct> lyrics = aVMusic.getLyrics();
        boolean zIsOfflineMusic = aVMusic.isOfflineMusic();
        boolean zIsSimilarMusic = aVMusic.isSimilarMusic();
        MusicBeat musicBeat = aVMusic.getMusicBeat();
        int musicBeginTime = aVMusic.getMusicBeginTime();
        int musicEndTime = aVMusic.getMusicEndTime();
        String str4 = aVMusic.musicName;
        int i = aVMusic.musicStatus;
        boolean zIsMuteShare = aVMusic.isMuteShare();
        boolean zIsNeedSetCookie = aVMusic.isNeedSetCookie();
        String str5 = aVMusic.offlineDesc;
        UrlModel urlModel4 = aVMusic.playUrl;
        boolean zIsPreventDownload = aVMusic.isPreventDownload();
        float previewStartTime = aVMusic.getPreviewStartTime();
        UrlModel urlModel5 = aVMusic.reuseAudioPlayUrl;
        UrlModel urlModel6 = aVMusic.strongBeatUrl;
        int i2 = aVMusic.userCount;
        List<MusicTag> musicTags = aVMusic.getMusicTags();
        int videoDuration = aVMusic.getVideoDuration();
        int commercialRightType = aVMusic.getCommercialRightType();
        boolean isNewReleaseMusic = aVMusic.getIsNewReleaseMusic();
        String metaSongID = aVMusic.getMetaSongID();
        MemeSongInfo memeSongInfo = aVMusic.getMemeSongInfo();
        MemeSongModel memeSong = aVMusic.getMemeSong();
        List<MemeSongModel> memeSongModels = aVMusic.getMemeSongModels();
        String promoId = aVMusic.getPromoId();
        String promotionTag = aVMusic.getPromotionTag();
        String recallReason = aVMusic.getRecallReason();
        boolean z = aVMusic.isFullSong;
        boolean z2 = aVMusic.isTrimmingLimited;
        FullSongDetail fullSongDetail = aVMusic.getFullSongDetail();
        int i3 = aVMusic.clipShootDuration;
        boolean zIsUnlimitedMusic = aVMusic.isUnlimitedMusic();
        int i4 = aVMusic.isFeedPreDownloadMdp;
        boolean zCanBeStitched = aVMusic.canBeStitched();
        LyricSceneCopyRight lyricSceneCopyRight = aVMusic.getMusicCompatModel().getLyricSceneCopyRight();
        LyricSceneCopyRight lyricSceneCopyRightCopy = null;
        if (lyricSceneCopyRight != null) {
            lyricSceneCopyRightCopy = lyricSceneCopyRight.copy(lyricSceneCopyRight.lyricSticker);
        }
        return new MusicObject(j, str, str2, duration, auditionDuration, shootDuration, urlModel, urlModel2, urlModel3, dmvAutoShow, musicHighPrecisionDuration, str3, zIsCommerceMusic, zIsHasCommerceRight, boolIsHasCommerceRightStrict, zIsOriginalSound, zIsPgc, metaSongID, matchedPGCSoundInfo, matchedSongInfo, localMusicId, lrcType, lrcUrl, lyricContent, lyricContentType, lyrics, zIsOfflineMusic, zIsSimilarMusic, musicBeat, musicBeginTime, musicEndTime, str4, i, zIsMuteShare, zIsNeedSetCookie, str5, urlModel4, zIsPreventDownload, previewStartTime, urlModel5, urlModel6, i2, musicTags, videoDuration, commercialRightType, isNewReleaseMusic, false, memeSongInfo, memeSong, fullSongDetail, i3, z, z2, memeSongModels, promoId, recallReason, zIsUnlimitedMusic, i4, zCanBeStitched, promotionTag, j2, j3, new MusicCompatModel(lyricSceneCopyRightCopy), 0 == true ? 1 : 0, 16384, null);
    }

    public static final String getMusicId(MusicObject musicObject) {
        return Long.toString(musicObject.id);
    }

    public static final boolean isFromUnlimitedTab(MusicBuzModel musicBuzModel) {
        MusicObject musicObject = musicBuzModel.music;
        if (musicObject == null || !musicObject.isUnlimitedMusic) {
            return false;
        }
        if (!Intrinsics.LJFF(musicBuzModel.musicSelectedFrom, "edit_page_unlimited") && !Intrinsics.LJFF(musicBuzModel.musicSelectedFrom, "shoot_page_unlimited")) {
            return false;
        }
        return true;
    }

    public static final AVMusic extractAVMusic(MusicObject musicObject) {
        AVMusic aVMusic = new AVMusic();
        aVMusic.id = musicObject.id;
        aVMusic.sameGroupIdV3 = musicObject.sameGroupIdV3;
        aVMusic.simGroupIdV3 = musicObject.simGroupIdV3;
        aVMusic.album = musicObject.album;
        aVMusic.setAuditionDuration(musicObject.auditionDuration);
        aVMusic.authorName = musicObject.authorName;
        aVMusic.coverLarge = musicObject.coverLarge;
        aVMusic.coverMedium = musicObject.coverMedium;
        aVMusic.coverThumb = musicObject.coverThumb;
        aVMusic.setDmvAutoShow(musicObject.dmvAutoShow);
        aVMusic.setDuration(musicObject.duration);
        aVMusic.durationHighPrecision = musicObject.durationHighPrecision;
        aVMusic.extra = musicObject.extra;
        aVMusic.setCommerceMusic(musicObject.isCommerceMusic);
        aVMusic.setHasCommerceRight(musicObject.hasCommerceRight);
        aVMusic.setHasCommerceRightStrict(musicObject.hasCommerceRightStrict);
        aVMusic.setOriginalSound(musicObject.isOriginalSound);
        aVMusic.setPgc(musicObject.isPgc);
        aVMusic.isSamiRecommend = musicObject.isSamiRecommend;
        aVMusic.setMetaSongID(musicObject.metaSongID);
        aVMusic.setMatchedPGCSoundInfo(musicObject.matchedPGCSoundInfo);
        aVMusic.setMatchedSongInfo(musicObject.matchedSongInfo);
        aVMusic.setLrcType(musicObject.lrcType);
        aVMusic.setLrcUrl(musicObject.lrcUrl);
        aVMusic.setLyricContent(musicObject.lyricContent);
        aVMusic.setLyricContentType(musicObject.lyricContentType);
        aVMusic.setOfflineMusic(musicObject.isOfflineMusic);
        aVMusic.setSimilarMusic(musicObject.isSimilarMusic);
        aVMusic.setPromoId(musicObject.promoId);
        aVMusic.setPromotionTag(musicObject.promotionTag);
        aVMusic.setRecallReason(musicObject.recallReason);
        aVMusic.setMusicBeat(musicObject.beatInfo);
        aVMusic.setMusicBeginTime(musicObject.musicBeginTime);
        aVMusic.setMusicEndTime(musicObject.musicEndTime);
        aVMusic.musicName = musicObject.musicName;
        aVMusic.musicStatus = musicObject.musicStatus;
        aVMusic.setMuteShare(musicObject.muteShare);
        aVMusic.setNeedSetCookie(musicObject.needSetCookie);
        aVMusic.offlineDesc = musicObject.offlineDesc;
        aVMusic.playUrl = musicObject.playUrl;
        aVMusic.setPreventDownload(musicObject.preventDownload);
        aVMusic.setPreviewStartTime(musicObject.previewStartTime);
        aVMusic.setShootDuration(musicObject.shootDuration);
        aVMusic.strongBeatUrl = musicObject.strongBeatUrl;
        aVMusic.userCount = musicObject.userCount;
        aVMusic.setMusicTags(musicObject.musicTags);
        aVMusic.setVideoDuration(musicObject.videoDuration);
        aVMusic.reuseAudioPlayUrl = musicObject.reuseAudioPlayUrl;
        aVMusic.setLocalMusicId(musicObject.localMusicId);
        aVMusic.setCommercialRightType(musicObject.commercialRightType);
        aVMusic.setIsNewReleaseMusic(musicObject.isNewReleaseMusic);
        aVMusic.setMemeSongInfo(musicObject.memeSongInfo);
        aVMusic.setMemeSong(musicObject.memeSong);
        aVMusic.setMemeSongModels(musicObject.memeSongModels);
        aVMusic.setFullSongDetail(musicObject.fullSongDetail);
        aVMusic.clipShootDuration = musicObject.clipShootDuration;
        aVMusic.isFullSong = musicObject.isFullSong;
        aVMusic.isTrimmingLimited = musicObject.isTrimmingLimited;
        aVMusic.setUnlimitedMusic(musicObject.isUnlimitedMusic);
        aVMusic.isFeedPreDownloadMdp = musicObject.isFeedPreDownloadMdp;
        aVMusic.setCanBeStitched(musicObject.canBeStitched);
        LyricSceneCopyRight lyricSceneCopyRight = musicObject.musicCompatModel.getLyricSceneCopyRight();
        LyricSceneCopyRight lyricSceneCopyRightCopy = null;
        if (lyricSceneCopyRight != null) {
            lyricSceneCopyRightCopy = lyricSceneCopyRight.copy(lyricSceneCopyRight.lyricSticker);
        }
        aVMusic.setMusicCompatModel(new MusicCompatModel(lyricSceneCopyRightCopy));
        aVMusic.setLyrics(musicObject.lyrics);
        return aVMusic;
    }

    public static final void updateAVMusic(MusicBuzModel musicBuzModel, AVMusic aVMusic) {
        ArrayList arrayList;
        Float[] fArr = null;
        if (aVMusic == null) {
            musicBuzModel.music = null;
            musicBuzModel.extendMusicList = null;
            musicBuzModel.soundSpeed = 1.0f;
            musicBuzModel.changeTone = true;
            musicBuzModel.soundFilterId = null;
            musicBuzModel.isCollected = false;
            musicBuzModel.challenge = null;
            musicBuzModel.categoryID = null;
            musicBuzModel.comeFromForMod = 0;
            musicBuzModel.fromSection = MusicModel.FromSection.OTHER.ordinal();
            musicBuzModel.ignoreReuseAudio = false;
            musicBuzModel.isMvThemeMusic = false;
            musicBuzModel.localMusicDuration = 0L;
            musicBuzModel.logPb = null;
            musicBuzModel.fromRecommend = false;
            musicBuzModel.musicEditFrom = null;
            musicBuzModel.musicStartFromCut = 0;
            musicBuzModel.musicStart = 0;
            musicBuzModel.musicEndFromCut = 0;
            musicBuzModel.trimPointRecommended = false;
            musicBuzModel.trimPointsList = null;
            musicBuzModel.trimTypeList = null;
            musicBuzModel.musicPriority = 0;
            musicBuzModel.musicType = 0;
            musicBuzModel.similarTag = 0;
            musicBuzModel.musicWaveData = null;
            musicBuzModel.songId = null;
            musicBuzModel.searchKeyWords = null;
            musicBuzModel.shouldShowCommerceTips = false;
            musicBuzModel.stickPointMusicAlg = null;
            musicBuzModel.path = null;
            musicBuzModel.onlinePath = null;
            musicBuzModel.onlineKey = null;
            musicBuzModel.cancelAbleInShoot = false;
            musicBuzModel.localThumbPath = null;
            musicBuzModel.isPGC = false;
            musicBuzModel.isSamiRecommend = false;
            musicBuzModel.metaSongID = "";
            musicBuzModel.matchedPGCSoundInfo = null;
            musicBuzModel.matchedSongInfo = null;
            musicBuzModel.isFullSong = false;
            musicBuzModel.isTrimmingLimited = false;
            musicBuzModel.fullSongDetail = null;
            musicBuzModel.clipShootDuration = 0;
            musicBuzModel.recommendSourceFrom = null;
            musicBuzModel.musicVolumeInfo = null;
            musicBuzModel.aigcInfo = null;
            musicBuzModel.stripMusicModel = null;
            musicBuzModel.musicBuzCompatModel = new MusicBuzCompatModel(null, null);
            return;
        }
        musicBuzModel.music = extractMusicObject(aVMusic);
        List<AVMusic> extendMusicList = aVMusic.getExtendMusicList();
        if (extendMusicList != null) {
            List listLJJJJLI = C13LP.LJJJJLI(extendMusicList);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            for (AVMusic aVMusic2 : (ArrayList) listLJJJJLI) {
                MusicBuzModel musicBuzModel2 = new MusicBuzModel(false, null, null, null, 1.0f, false, null, null, false, null, null, 0, MusicModel.FromSection.OTHER.ordinal(), false, false, 0L, 0, null, null, null, 0, 0, false, null, null, 0, 0, null, null, null, false, null, null, false, false, null, null, null, false, null, false, false, false, Boolean.FALSE, false, null, 0, null, 0, 0, 0, null, null, null, false, false, 0, 0, 0, Boolean.FALSE, 0, 0, null, "", null, false, null, null, null, 0L, false, false, "", null, null, false, 0.0f, "", 0, null, null, null, null, null, null, 0, false, false, null, null, null, null, null, null, null, 0, false, false, false, null, null, true, false, 0, 0, 0, 0, new MusicBuzCompatModel(null, null));
                updateAVMusic(musicBuzModel2, aVMusic2);
                arrayList.add(musicBuzModel2);
            }
        } else {
            arrayList = null;
        }
        musicBuzModel.extendMusicList = arrayList;
        musicBuzModel.soundSpeed = aVMusic.getSoundSpeed().floatValue();
        musicBuzModel.changeTone = aVMusic.getChangeTone().booleanValue();
        musicBuzModel.soundFilterId = aVMusic.getSoundFilterId();
        musicBuzModel.isCollected = aVMusic.isCollected();
        musicBuzModel.challenge = aVMusic.challenge;
        musicBuzModel.categoryID = aVMusic.getCategoryID();
        musicBuzModel.comeFromForMod = aVMusic.getComeFromForMod();
        musicBuzModel.fromSection = aVMusic.getFromSection().ordinal();
        musicBuzModel.ignoreReuseAudio = aVMusic.ignoreReuseAudio;
        musicBuzModel.isMvThemeMusic = aVMusic.isMvThemeMusic();
        musicBuzModel.localMusicDuration = aVMusic.getLocalMusicDuration();
        musicBuzModel.logPb = aVMusic.getLogPb();
        musicBuzModel.fromRecommend = aVMusic.isFromRecommend();
        musicBuzModel.musicEditFrom = aVMusic.getEditFrom();
        musicBuzModel.musicStartFromCut = aVMusic.getMusicStartFromCut();
        musicBuzModel.musicStart = aVMusic.getMusicStart();
        musicBuzModel.musicEndFromCut = aVMusic.getMusicEndFromCut();
        musicBuzModel.musicEnd = aVMusic.getMusicEndTime();
        musicBuzModel.trimPointRecommended = aVMusic.getTrimPointRecommended();
        musicBuzModel.trimPointsList = aVMusic.getTrimPointList();
        musicBuzModel.trimTypeList = aVMusic.getTrimTypeList();
        musicBuzModel.musicPriority = aVMusic.getMusicPriority();
        musicBuzModel.musicType = aVMusic.musicType;
        musicBuzModel.similarTag = aVMusic.similarTag;
        musicBuzModel.recommendSourceFrom = aVMusic.recommendSourceFrom;
        float[] musicWaveData = aVMusic.getMusicWaveData();
        if (musicWaveData != null) {
            fArr = new Float[musicWaveData.length];
            int length = musicWaveData.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Float.valueOf(musicWaveData[i]);
            }
        }
        musicBuzModel.musicWaveData = fArr;
        musicBuzModel.songId = aVMusic.getSongId();
        musicBuzModel.searchKeyWords = aVMusic.getSearchKeyWords();
        musicBuzModel.shouldShowCommerceTips = aVMusic.isShouldShowCommerceTips();
        musicBuzModel.stickPointMusicAlg = aVMusic.getStickPointMusicAlg();
        musicBuzModel.path = aVMusic.path;
        musicBuzModel.onlinePath = aVMusic.onlinePath;
        musicBuzModel.onlineKey = aVMusic.onlineKey;
        musicBuzModel.userCount = aVMusic.userCount;
        musicBuzModel.tagList = aVMusic.getMusicTags();
        musicBuzModel.cancelAbleInShoot = aVMusic.isCancelAbleInShoot();
        musicBuzModel.localThumbPath = aVMusic.getLocalThumbPath();
        musicBuzModel.isPGC = aVMusic.isPgc();
        musicBuzModel.isSamiRecommend = aVMusic.isSamiRecommend;
        musicBuzModel.metaSongID = aVMusic.getMetaSongID();
        musicBuzModel.matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
        musicBuzModel.matchedSongInfo = aVMusic.getMatchedSongInfo();
        musicBuzModel.fullSongDetail = aVMusic.getFullSongDetail();
        musicBuzModel.clipShootDuration = aVMusic.clipShootDuration;
        musicBuzModel.isFullSong = aVMusic.isFullSong;
        musicBuzModel.isTrimmingLimited = aVMusic.isTrimmingLimited;
        musicBuzModel.musicVolumeInfo = aVMusic.getMusicVolumeInfo();
        musicBuzModel.musicSelectedFrom = aVMusic.getMusicSelectedFrom();
        musicBuzModel.isFeedPreDownloadMdp = aVMusic.isFeedPreDownloadMdp;
        musicBuzModel.isBestMatch = aVMusic.isBestMatch();
        musicBuzModel.isMultiMusicFromTemplate = aVMusic.isMultiMusicFromTemplate();
        musicBuzModel.isCCTemplateLocalMusic = aVMusic.isCCTemplateLocalMusic();
        musicBuzModel.aigcInfo = aVMusic.getAigcInfo();
        musicBuzModel.stripMusicModel = aVMusic.getStripMusicModel();
        MusicBuzCompatModel musicBuzCompatModel = aVMusic.getMusicBuzCompatModel();
        musicBuzModel.musicBuzCompatModel = musicBuzCompatModel.copy(musicBuzCompatModel.musicRootPageFrom, musicBuzCompatModel.cloudUnderstandingKey);
    }
}
