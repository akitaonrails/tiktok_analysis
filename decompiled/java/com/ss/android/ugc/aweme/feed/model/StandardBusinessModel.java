package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardBusinessModel implements Serializable {

    @C09CT("ai_comment_photo")
    public AICommentPhoto aiCommentPhoto;

    @C09CT("cm_preview_info")
    public CMPreviewInfo cmPreviewInfo;

    @C09CT("creator_analytics")
    public CreatorAnalytics creatorAnalytics;

    @C09CT("e_commerce")
    public ECommerce ecommerce;

    @C09CT("game_partnership")
    public GamePartnership gamePartnership;

    @C09CT("im_info")
    public IMInfo imInfo;

    @C09CT("interest")
    public StandardBizInterest interest;

    @C09CT("live_info")
    public LiveInfo liveInfo;

    @C09CT("local_alliance_info")
    public LocalAllianceInfo localAllianceInfo;

    @C09CT("sub_only_video")
    public SubOnlyVideo subOnlyVideo;

    @C09CT("tako")
    public TakoStruct tako;

    @C09CT("tts_voice_info")
    public TtsVoiceInfo ttsVoiceInfo;

    public final AICommentPhoto getAiCommentPhoto() {
        return this.aiCommentPhoto;
    }

    public final CMPreviewInfo getCmPreviewInfo() {
        return this.cmPreviewInfo;
    }

    public final CreatorAnalytics getCreatorAnalytics() {
        return this.creatorAnalytics;
    }

    public final ECommerce getEcommerce() {
        return this.ecommerce;
    }

    public final GamePartnership getGamePartnership() {
        return this.gamePartnership;
    }

    public final IMInfo getImInfo() {
        return this.imInfo;
    }

    public final StandardBizInterest getInterest() {
        return this.interest;
    }

    public final LiveInfo getLiveInfo() {
        return this.liveInfo;
    }

    public final LocalAllianceInfo getLocalAllianceInfo() {
        return this.localAllianceInfo;
    }

    public final SubOnlyVideo getSubOnlyVideo() {
        return this.subOnlyVideo;
    }

    public final TakoStruct getTako() {
        return this.tako;
    }

    public final TtsVoiceInfo getTtsVoiceInfo() {
        return this.ttsVoiceInfo;
    }

    public final void setAiCommentPhoto(AICommentPhoto aICommentPhoto) {
        this.aiCommentPhoto = aICommentPhoto;
    }

    public final void setCmPreviewInfo(CMPreviewInfo cMPreviewInfo) {
        this.cmPreviewInfo = cMPreviewInfo;
    }

    public final void setCreatorAnalytics(CreatorAnalytics creatorAnalytics) {
        this.creatorAnalytics = creatorAnalytics;
    }

    public final void setEcommerce(ECommerce eCommerce) {
        this.ecommerce = eCommerce;
    }

    public final void setGamePartnership(GamePartnership gamePartnership) {
        this.gamePartnership = gamePartnership;
    }

    public final void setImInfo(IMInfo iMInfo) {
        this.imInfo = iMInfo;
    }

    public final void setInterest(StandardBizInterest standardBizInterest) {
        this.interest = standardBizInterest;
    }

    public final void setLiveInfo(LiveInfo liveInfo) {
        this.liveInfo = liveInfo;
    }

    public final void setLocalAllianceInfo(LocalAllianceInfo localAllianceInfo) {
        this.localAllianceInfo = localAllianceInfo;
    }

    public final void setSubOnlyVideo(SubOnlyVideo subOnlyVideo) {
        this.subOnlyVideo = subOnlyVideo;
    }

    public final void setTako(TakoStruct takoStruct) {
        this.tako = takoStruct;
    }

    public final void setTtsVoiceInfo(TtsVoiceInfo ttsVoiceInfo) {
        this.ttsVoiceInfo = ttsVoiceInfo;
    }
}
