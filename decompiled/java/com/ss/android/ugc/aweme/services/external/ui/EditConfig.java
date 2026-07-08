package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.common.PublishSettings;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final class EditConfig implements Serializable {
    public static final Companion Companion = new Companion();
    public AddYourRecordParam addYourRecordParam;
    public List<AnchorTransData> anchors;
    public String ccvid;
    public AVChallenge challenge;
    public List<String> challengeIds;
    public List<String> challengeNames;
    public List<? extends AVChallenge> challenges;
    public String channel;
    public boolean clear;
    public String creationId;
    public String enterFrom;
    public String epAIEnterSource;
    public String epAIScene;
    public String hashtag;
    public transient CreativeInitialModel initialModel;
    public boolean isFromJsbOrDeeplink;
    public boolean landingBack;
    public Integer launchFlag;
    public String liveShootPage;
    public MediaInfo mediaInfo;
    public String musicId;
    public String musicOrigin;
    public Integer musicStartTime;
    public Float musicVolume;
    public Function0<Unit> onEnterEditListener;
    public String openPlatformExtra;
    public PublishSettings publishSettings;
    public Integer requestCode;
    public SecretRepliesRecordParam secretRepliesStickerParam;
    public String shareID;
    public BaseShareContext shareModel;
    public String shootway;
    public Boolean startSaaFromLive;
    public Boolean startSaaWithSingleTop;
    public StorySocialEventStickerModel storySocialEventStickerParam;
    public String storyStreakGifPath;
    public StoryStreakEnterEditParam storyStreakParam;
    public Float voiceVolume;

    public static final class Companion {
    }

    public static class Builder {
        public EditConfig config = new EditConfig();

        public final EditConfig build() {
            return this.config;
        }

        public final Builder addStoryCreateCommonStickerPostParam(StorySocialEventStickerModel storySocialEventStickerModel) {
            this.config.setStorySocialEventStickerParam(storySocialEventStickerModel);
            return this;
        }

        public final Builder addStoryStreakGifPath(String str) {
            this.config.setStoryStreakGifPath(str);
            return this;
        }

        public final Builder addStoryStreakParam(StoryStreakEnterEditParam storyStreakEnterEditParam) {
            this.config.setStoryStreakParam(storyStreakEnterEditParam);
            return this;
        }

        public final Builder addYoursStickerParam(AddYourRecordParam addYourRecordParam) {
            this.config.setAddYourRecordParam(addYourRecordParam);
            return this;
        }

        public final Builder anchors(List<AnchorTransData> list) {
            this.config.setAnchors(list);
            return this;
        }

        public final Builder bindEPAIEnterSource(String str) {
            this.config.setEpAIEnterSource(str);
            return this;
        }

        public final Builder bindEPAIScene(String str) {
            this.config.setEpAIScene(str);
            return this;
        }

        public final Builder ccvid(String str) {
            this.config.setCcvid(str);
            return this;
        }

        public final Builder challenge(AVChallenge aVChallenge) {
            this.config.setChallenge(aVChallenge);
            return this;
        }

        public final Builder challengeId(List<String> list) {
            this.config.setChallengeIds(list);
            return this;
        }

        public final Builder challengeNames(List<String> list) {
            this.config.setChallengeNames(list);
            return this;
        }

        public final Builder channel(String str) {
            this.config.setChannel(str);
            return this;
        }

        public final Builder clear(boolean z) {
            this.config.setClear(z);
            return this;
        }

        public final Builder creationId(String str) {
            this.config.setCreationId(str);
            return this;
        }

        public final Builder enterFrom(String str) {
            this.config.setEnterFrom(str);
            return this;
        }

        public final Builder hashtag(String str) {
            this.config.setHashtag(str);
            return this;
        }

        public final Builder initialInputModel(CreativeInitialModel creativeInitialModel) {
            this.config.setInitialModel(creativeInitialModel);
            return this;
        }

        public final Builder isFromJsbOrDeeplink(boolean z) {
            this.config.setFromJsbOrDeeplink(z);
            return this;
        }

        public final Builder landingBack(boolean z) {
            this.config.setLandingBack(z);
            return this;
        }

        public final Builder launchFlag(int i) {
            this.config.setLaunchFlag(Integer.valueOf(i));
            return this;
        }

        public final Builder liveShootPage(String str) {
            this.config.setLiveShootPage(str);
            return this;
        }

        public final Builder mediaInfo(MediaInfo mediaInfo) {
            this.config.setMediaInfo(mediaInfo);
            return this;
        }

        public final Builder musicIdExtra(String str) {
            this.config.setMusicId(str);
            return this;
        }

        public final Builder musicOrigin(String str) {
            this.config.setMusicOrigin(str);
            return this;
        }

        public final Builder musicStartTimeExtra(Integer num) {
            this.config.setMusicStartTime(num);
            return this;
        }

        public final Builder onEnterEdit(Function0<Unit> function0) {
            this.config.setOnEnterEditListener(function0);
            return this;
        }

        public final Builder openPlatformExtra(String str) {
            this.config.setOpenPlatformExtra(str);
            return this;
        }

        public final Builder publishSetting(PublishSettings publishSettings) {
            this.config.setPublishSettings(publishSettings);
            return this;
        }

        public final Builder requestCode(int i) {
            this.config.setRequestCode(Integer.valueOf(i));
            return this;
        }

        public final Builder shareID(String str) {
            this.config.setShareID(str);
            return this;
        }

        public final Builder shareModel(BaseShareContext baseShareContext) {
            this.config.setShareModel(baseShareContext);
            return this;
        }

        public final Builder shootWay(String str) {
            this.config.setShootway(str);
            return this;
        }

        public final Builder startSaaFromLive(Boolean bool) {
            this.config.setStartSaaFromLive(bool);
            return this;
        }

        public final Builder startSaaWithSingleTop(Boolean bool) {
            this.config.setStartSaaWithSingleTop(bool);
            return this;
        }
    }

    public final AddYourRecordParam getAddYourRecordParam() {
        return this.addYourRecordParam;
    }

    public final List<AnchorTransData> getAnchors() {
        return this.anchors;
    }

    public final String getCcvid() {
        return this.ccvid;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final List<String> getChallengeIds() {
        return this.challengeIds;
    }

    public final List<String> getChallengeNames() {
        return this.challengeNames;
    }

    public final List<AVChallenge> getChallenges() {
        return this.challenges;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final boolean getClear() {
        return this.clear;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEpAIEnterSource() {
        return this.epAIEnterSource;
    }

    public final String getEpAIScene() {
        return this.epAIScene;
    }

    public final String getHashtag() {
        return this.hashtag;
    }

    public final CreativeInitialModel getInitialModel() {
        return this.initialModel;
    }

    public final boolean getLandingBack() {
        return this.landingBack;
    }

    public final Integer getLaunchFlag() {
        return this.launchFlag;
    }

    public final String getLiveShootPage() {
        return this.liveShootPage;
    }

    public final MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicOrigin() {
        return this.musicOrigin;
    }

    public final Integer getMusicStartTime() {
        return this.musicStartTime;
    }

    public final Float getMusicVolume() {
        return this.musicVolume;
    }

    public final Function0<Unit> getOnEnterEditListener() {
        return this.onEnterEditListener;
    }

    public final String getOpenPlatformExtra() {
        return this.openPlatformExtra;
    }

    public final PublishSettings getPublishSettings() {
        return this.publishSettings;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    public final SecretRepliesRecordParam getSecretRepliesStickerParam() {
        return this.secretRepliesStickerParam;
    }

    public final String getShareID() {
        return this.shareID;
    }

    public final BaseShareContext getShareModel() {
        return this.shareModel;
    }

    public final String getShootway() {
        return this.shootway;
    }

    public final Boolean getStartSaaFromLive() {
        return this.startSaaFromLive;
    }

    public final Boolean getStartSaaWithSingleTop() {
        return this.startSaaWithSingleTop;
    }

    public final StorySocialEventStickerModel getStorySocialEventStickerParam() {
        return this.storySocialEventStickerParam;
    }

    public final String getStoryStreakGifPath() {
        return this.storyStreakGifPath;
    }

    public final StoryStreakEnterEditParam getStoryStreakParam() {
        return this.storyStreakParam;
    }

    public final Float getVoiceVolume() {
        return this.voiceVolume;
    }

    public final boolean isFromJsbOrDeeplink() {
        return this.isFromJsbOrDeeplink;
    }

    public final void setAddYourRecordParam(AddYourRecordParam addYourRecordParam) {
        this.addYourRecordParam = addYourRecordParam;
    }

    public final void setAnchors(List<AnchorTransData> list) {
        this.anchors = list;
    }

    public final void setCcvid(String str) {
        this.ccvid = str;
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setChallengeIds(List<String> list) {
        this.challengeIds = list;
    }

    public final void setChallengeNames(List<String> list) {
        this.challengeNames = list;
    }

    public final void setChallenges(List<? extends AVChallenge> list) {
        this.challenges = list;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setClear(boolean z) {
        this.clear = z;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEpAIEnterSource(String str) {
        this.epAIEnterSource = str;
    }

    public final void setEpAIScene(String str) {
        this.epAIScene = str;
    }

    public final void setFromJsbOrDeeplink(boolean z) {
        this.isFromJsbOrDeeplink = z;
    }

    public final void setHashtag(String str) {
        this.hashtag = str;
    }

    public final void setInitialModel(CreativeInitialModel creativeInitialModel) {
        this.initialModel = creativeInitialModel;
    }

    public final void setLandingBack(boolean z) {
        this.landingBack = z;
    }

    public final void setLaunchFlag(Integer num) {
        this.launchFlag = num;
    }

    public final void setLiveShootPage(String str) {
        this.liveShootPage = str;
    }

    public final void setMediaInfo(MediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicOrigin(String str) {
        this.musicOrigin = str;
    }

    public final void setMusicStartTime(Integer num) {
        this.musicStartTime = num;
    }

    public final void setMusicVolume(Float f) {
        this.musicVolume = f;
    }

    public final void setOnEnterEditListener(Function0<Unit> function0) {
        this.onEnterEditListener = function0;
    }

    public final void setOpenPlatformExtra(String str) {
        this.openPlatformExtra = str;
    }

    public final void setPublishSettings(PublishSettings publishSettings) {
        this.publishSettings = publishSettings;
    }

    public final void setRequestCode(Integer num) {
        this.requestCode = num;
    }

    public final void setSecretRepliesStickerParam(SecretRepliesRecordParam secretRepliesRecordParam) {
        this.secretRepliesStickerParam = secretRepliesRecordParam;
    }

    public final void setShareID(String str) {
        this.shareID = str;
    }

    public final void setShareModel(BaseShareContext baseShareContext) {
        this.shareModel = baseShareContext;
    }

    public final void setShootway(String str) {
        this.shootway = str;
    }

    public final void setStartSaaFromLive(Boolean bool) {
        this.startSaaFromLive = bool;
    }

    public final void setStartSaaWithSingleTop(Boolean bool) {
        this.startSaaWithSingleTop = bool;
    }

    public final void setStorySocialEventStickerParam(StorySocialEventStickerModel storySocialEventStickerModel) {
        this.storySocialEventStickerParam = storySocialEventStickerModel;
    }

    public final void setStoryStreakGifPath(String str) {
        this.storyStreakGifPath = str;
    }

    public final void setStoryStreakParam(StoryStreakEnterEditParam storyStreakEnterEditParam) {
        this.storyStreakParam = storyStreakEnterEditParam;
    }

    public final void setVoiceVolume(Float f) {
        this.voiceVolume = f;
    }
}
