package com.ss.android.ugc.aweme.music.model;

import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class SimpleMusicRequestParam implements IMusicRequestParam {
    public final boolean canFetchingSimilarSong;
    public final String challengeId;
    public final String contentSource;
    public final String contentType;
    public final String creationId;
    public final boolean disableCache;
    public final String effectId;
    public final String enterFrom;
    public final Long firstMusicId;
    public final String infoStickerList;
    public final boolean isEditPageImageMode;
    public boolean isMusicLoop;
    public final boolean isReplaceMusic;
    public final boolean isUploadClickNext;
    public final String itemId;
    public final long maxMusicDuration;
    public final String microAppId;
    public final String musicID;
    public int musicMaxLoopDuration;
    public final int musicTag;
    public final String mvId;
    public boolean noWaitFrameResult;
    public String pinnedMusicId;
    public final Map<String, Object> recommendExtra;
    public Function0<? extends Object> recommendMusicProvider;
    public final Long replaceMusicIndex;
    public final String resourceId;
    public final String shootWay;
    public final int soundPageScene;
    public final String strippedMetasongId;
    public final String textContent;
    public final boolean unlimitedOnly;
    public final long videoDuration;
    public final boolean withoutUnderstanding;

    public SimpleMusicRequestParam() {
        this(false, 0L, 0, null, null, false, null, "", null, null, null, null, null, null, null, null, null, null, null, false, false, 0L, false, 0, null, null, null, null, false, false, 0, false, false, null);
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isStickPointAutoMusic() {
        return IMusicRequestParam.DefaultImpls.isStickPointAutoMusic(this);
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getCanFetchingSimilarSong() {
        return this.canFetchingSimilarSong;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getChallengeId() {
        return this.challengeId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getContentSource() {
        return this.contentSource;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getCreationId() {
        return this.creationId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getDisableCache() {
        return this.disableCache;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getEffectId() {
        return this.effectId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getEnterFrom() {
        return this.enterFrom;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Long getFirstMusicId() {
        return this.firstMusicId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getInfoStickerList() {
        return this.infoStickerList;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getItemId() {
        return this.itemId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public long getMaxMusicDuration() {
        return this.maxMusicDuration;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMicroAppId() {
        return this.microAppId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMusicID() {
        return this.musicID;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getMusicMaxLoopDuration() {
        return this.musicMaxLoopDuration;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getMusicTag() {
        return this.musicTag;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getMvId() {
        return this.mvId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getNoWaitFrameResult() {
        return this.noWaitFrameResult;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getPinnedMusicId() {
        return this.pinnedMusicId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Map<String, Object> getRecommendExtra() {
        return this.recommendExtra;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Function0<Object> getRecommendMusicProvider() {
        return this.recommendMusicProvider;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public Long getReplaceMusicIndex() {
        return this.replaceMusicIndex;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getResourceId() {
        return this.resourceId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getShootWay() {
        return this.shootWay;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public int getSoundPageScene() {
        return this.soundPageScene;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getStrippedMetasongId() {
        return this.strippedMetasongId;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public String getTextContent() {
        return this.textContent;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getUnlimitedOnly() {
        return this.unlimitedOnly;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public long getVideoDuration() {
        return this.videoDuration;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean getWithoutUnderstanding() {
        return this.withoutUnderstanding;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isEditPageImageMode() {
        return this.isEditPageImageMode;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isMusicLoop() {
        return this.isMusicLoop;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isReplaceMusic() {
        return this.isReplaceMusic;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public boolean isUploadClickNext() {
        return this.isUploadClickNext;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setMusicLoop(boolean z) {
        this.isMusicLoop = z;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setMusicMaxLoopDuration(int i) {
        this.musicMaxLoopDuration = i;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setNoWaitFrameResult(boolean z) {
        this.noWaitFrameResult = z;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setPinnedMusicId(String str) {
        this.pinnedMusicId = str;
    }

    @Override // com.ss.android.ugc.aweme.music.model.IMusicRequestParam
    public void setRecommendMusicProvider(Function0<? extends Object> function0) {
        this.recommendMusicProvider = function0;
    }

    public SimpleMusicRequestParam(boolean z, long j, int i, String str, String str2, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2, String str11, String str12, String str13, boolean z3, boolean z4, long j2, boolean z5, int i2, Map<String, ? extends Object> map, String str14, String str15, String str16, boolean z6, boolean z7, int i3, boolean z8, boolean z9, Function0<? extends Object> function0) {
        this.disableCache = z;
        this.videoDuration = j;
        this.soundPageScene = i;
        this.creationId = str;
        this.microAppId = str2;
        this.canFetchingSimilarSong = z2;
        this.musicID = str3;
        this.shootWay = str4;
        this.contentType = str5;
        this.contentSource = str6;
        this.infoStickerList = str7;
        this.mvId = str8;
        this.challengeId = str9;
        this.textContent = str10;
        this.firstMusicId = l;
        this.replaceMusicIndex = l2;
        this.effectId = str11;
        this.resourceId = str12;
        this.enterFrom = str13;
        this.withoutUnderstanding = z3;
        this.unlimitedOnly = z4;
        this.maxMusicDuration = j2;
        this.isReplaceMusic = z5;
        this.musicTag = i2;
        this.recommendExtra = map;
        this.strippedMetasongId = str14;
        this.itemId = str15;
        this.pinnedMusicId = str16;
        this.isUploadClickNext = z6;
        this.isMusicLoop = z7;
        this.musicMaxLoopDuration = i3;
        this.noWaitFrameResult = z8;
        this.isEditPageImageMode = z9;
        this.recommendMusicProvider = function0;
    }
}
