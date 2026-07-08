package com.ss.android.ugc.aweme.services.external.ui;

import X.EnumC569740MWe;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumOpenApiModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeBannerMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;
import com.ss.android.ugc.aweme.creative.model.stickers.MentionStickerParam;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.model.CollectionInfoParcelableForShoot;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public class RecordConfig implements Serializable {
    public static final Companion Companion = new Companion();
    public AddYourRecordParam addYourRecordParam;
    public AILivePhotoConsumptionModel aiAliveInfo;
    public AlbumOpenApiModel albumOpenApiModel;
    public boolean allowMultipleEntrance;
    public String anchorExtra;
    public Boolean autoOpenAlbum;
    public AnchorTransData autoSelectedAnchor;
    public List<AnchorTransData> autoSelectedAnchorList;
    public String autoUseMusic;
    public String autoUseSticker;
    public boolean backByClearTop;
    public String backUrl;
    public Integer cameraFacing;
    public String cameraLayoutType;
    public Challenge challenge;
    public String challengeId;
    public boolean challengeIdsNotClearWhenBack;
    public List<? extends Challenge> challenges;
    public String clientId;
    public CommentVideoConfig commentVideoConfig;
    public String commerceData;
    public String commerceTrafficType;
    public String creationId;
    public CreativeDurationExtra creativeDurationExtra;
    public List<String> csiChallengeIdsList;
    public List<String> csiChallengeNamesList;
    public Long decompressTime;
    public Integer defaultSubTabForUploadPage;
    public Integer defaultTab;
    public DMGroupChatStickerGroupInfo dmGroupChatStickerGroupInfo;
    public boolean doNotLoadMusic;
    public String donationId;
    public String draftLandPage;
    public String duetEntranceType;
    public String duetFromItemId;
    public String duetModeType;
    public String duetPrevEntranceType;
    public Long duetStitchClickTime;
    public Integer duetVideoDuration;
    public String editEffectUID;
    public EffectConfig effectConfig;
    public Long effectDownloadDuration;
    public Boolean ensureLaunchOnlyOnceFromThirdParty;
    public String enterFrom;
    public String enterFromH5Type;
    public String enterMethod;
    public int enterTTEPPage;
    public HashMap<String, HashMap<String, String>> extraEventParams;
    public HashMap<String, String> extraLogParams;
    public Map<String, String> extraParams;
    public String feedPropPinIds;
    public Effect firstSticker;
    public DMCreativeStickerFontData fontData;
    public Boolean forceDisableTranslucent;
    public Boolean fromMain;
    public Boolean fromOtherPlatform;
    public Boolean fromSpecialPlus;
    public Boolean fromSystem;
    public String giphyGifIds;
    public OPSDK$GreenScreenKitConfig greenScreenKitConfig;
    public RecordPresetResource greenScreenKitPresetResource;
    public String groupId;
    public Boolean hideCameraUIOnStartRecord;
    public InitialFilterConfig initialFilterConfig;
    public transient CreativeInitialModel initialModel;
    public String inspirationEnterFrom;
    public String inspirationEnterMethod;
    public InspirationInfo inspirationInfo;
    public long interceptorCost;
    public Boolean isDuetFromDuet;
    public int isFavouriteMusic;
    public int isFavouriteProp;
    public String isFilterBusniessSticker;
    public Boolean isFormFlipShootIcon;
    public String isFromEoyBanner;
    public Boolean isInterceptBackground;
    public boolean isJatoBoostRunning;
    public boolean isLandingSearchBefore;
    public Boolean isMultiEntryFormDM;
    public Boolean isPlayerPause;
    public String isSameMusicSupplyDetailPage;
    public boolean isThroughAnchor;
    public Boolean isUsedFullSong;
    public Boolean jumpDisableAnim;
    public Boolean keepChallenges;
    public boolean landingBack;
    public boolean landingIncludeDraft;
    public String landingSubTab;
    public String landingTab;
    public String liveEventStickerRawData;
    public LiveParams liveParams;
    public String liveShootPage;
    public String lsAllianceExtraJsonStr;
    public String lsAllianceInfo;
    public String lsFromEncouragingPosting;
    public LyricStickerStruct lyricStickerStruct;
    public Long maxDuration;
    public String mdpEnterFrom;
    public String mdpEnterMethod;
    public int mecTypeSticker;
    public MentionStickerParam mentionStickerParam;
    public Pair<String, String> mentionUser;
    public MiniAppConfig miniAppConfig;
    public HashMap<String, String> missionConfig;
    public String missionStr;
    public boolean moveTargetStickerToFirst;
    public boolean musicDownloadComplete;
    public Long musicDownloadDuration;
    public Integer musicEnd;
    public String musicId;
    public MusicModel musicModel;
    public String musicOrigin;
    public String musicPath;
    public Integer musicStart;
    public String musicSticker;
    public MusicStickerStruct musicStickerStruct;
    public Integer musicType;
    public Effect musicWithStickerEffect;
    public Effect mvSticker;
    public String mvStickerId;
    public boolean needAddRecentMusic;
    public Boolean needEcAITeleprompter;
    public boolean needLoadResourceAfterRecord;
    public boolean needMobShoot;
    public Boolean networkUnavailableMusic;
    public Boolean openGreenScreenMode;
    public String openPlatformClientKey;
    public String openPlatformExtra;
    public long openTime;
    public Boolean originMusicRemoveTTS;
    public Boolean permissionActivityRequired;
    public PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams;
    public PhotoModeBannerMobParams photoModeBannerMobParams;
    public String poiDataJsonString;
    public String poiEnterFrom;
    public String poiEnterMethod;
    public String poiExtraDataJsonString;
    public String poiPostInfoJsonString;
    public String poiShootWay;
    public String postTrendsId;
    public String postTrendsType;
    public int preloadStringResource;
    public boolean prepareFilter;
    public Boolean presetSticker;
    public String previousPage;
    public String previousSearchQuery;
    public String propList;
    public String propResourceId;
    public String propResourceList;
    public String publishTitle;
    public String qaOrigin;
    public String qaOriginGroupId;
    public QaStructConfig qaStructConfig;
    public String questionCategory;
    public boolean recordFromFeed;
    public Integer recordFromTab;
    public String recordParam;
    public RecordPresetResource recordPresetResource;
    public String relationEnterMethod;
    public ReshootConfig reshootConfig;
    public int restoreType;
    public ReuseSoundAndEffectModel reuseSoundAndEffectModel;
    public String savedDraft;
    public String schemaTag;
    public String searchExtra;
    public SecretRepliesRecordParam secretRepliesStickerParam;
    public CollectionInfoParcelableForShoot seriesCollectionInfo;
    public long serviceLoadCost;
    public String shareId;
    public ShareKitPanel shareKitPanel;
    public BaseShareContext shareModel;
    public String sharedARHostId;
    public String sharedARSessionId;
    public String shootEnterFrom;
    public ShootExtraData shootExtraData;
    public String shootFrom;
    public String shootFromViewPanelAwemeId;
    public long shootNativeRecvTs;
    public String shootPerfSessionId;
    public String shootway;
    public Boolean showAIAliveBanner;
    public Boolean showCancelAfterPinProp;
    public Boolean showPreloadingDialog;
    public boolean showStickerPanel;
    public HashMap<String, String> starAtlasConfig;
    public Long startRecordTime;
    public Boolean startScanFaceAIProfile;
    public String sticker;
    public Music stickerMusic;
    public String stickerWithMusicFilePath;
    public ArrayList<String> stickers;
    public StitchParams stitchParams;
    public Boolean supportPrivateAlbum;
    public Integer tabs;
    public String templateBackCamera;
    public TemplateData templateData;
    public String templateDebugId;
    public String templateDebugType;
    public Integer translationType;
    public Effect ttepPreviewEffect;
    public String ttepPreviewEffectId;
    public ArrayList<String> ttsVoiceIDs;
    public TtsVoiceInfo ttsVoiceInfo;
    public ArrayList<String> ttsVoiceRefIDs;
    public String ugcTemplateTag;
    public String unpublishedEffect;
    public Boolean uploadPageMultiSelect;
    public boolean usedFullSong;
    public String vcVoiceEffectId;
    public String vcVoiceEffectName;
    public ArrayList<String> vcVoiceIDs;
    public ArrayList<String> vcVoiceRefIDs;
    public Long videoDownloadDuration;
    public Integer videoLength;
    public String voiceEffectId;
    public String voiceEffectName;

    public static final class Companion {
    }

    public static /* synthetic */ void getRestoreType$annotations() {
    }

    public static class Builder {
        public RecordConfig config;

        public Builder() {
            this.config = new RecordConfig();
        }

        public final RecordConfig build() {
            return this.config;
        }

        public Builder(RecordConfig recordConfig) {
            this.config = recordConfig;
        }

        public final Builder CommentVideoConfig(CommentVideoConfig commentVideoConfig) {
            this.config.setCommentVideoConfig(commentVideoConfig);
            return this;
        }

        public final Builder addLiveEventStickerRawData(String str) {
            this.config.setLiveEventStickerRawData(str);
            return this;
        }

        public final Builder addYoursStickerParam(AddYourRecordParam addYourRecordParam) {
            this.config.setAddYourRecordParam(addYourRecordParam);
            return this;
        }

        public final Builder aiLivePhotoParam(AILivePhotoConsumptionModel aILivePhotoConsumptionModel) {
            this.config.setAiAliveInfo(aILivePhotoConsumptionModel);
            return this;
        }

        public final Builder albumOpenApi(AlbumOpenApiModel albumOpenApiModel) {
            this.config.setAlbumOpenApiModel(albumOpenApiModel);
            return this;
        }

        public final Builder allowMultipleEntrance(boolean z) {
            this.config.setAllowMultipleEntrance(z);
            return this;
        }

        public final Builder anchorExtra(String str) {
            this.config.setAnchorExtra(str);
            return this;
        }

        public final Builder autoOpenAlbum(Boolean bool) {
            this.config.setAutoOpenAlbum(bool);
            return this;
        }

        public final Builder autoUseMusic(String str) {
            this.config.setAutoUseMusic(str);
            return this;
        }

        public final Builder autoUseSticker(String str) {
            this.config.setAutoUseSticker(str);
            return this;
        }

        public final Builder backByClearTop(boolean z) {
            this.config.setBackByClearTop(z);
            return this;
        }

        public final Builder backUrl(String str) {
            this.config.setBackUrl(str);
            return this;
        }

        public final Builder cameraFacing(int i) {
            this.config.setCameraFacing(Integer.valueOf(i));
            return this;
        }

        public final Builder challenge(Challenge challenge) {
            this.config.setChallenge(challenge);
            return this;
        }

        public final Builder challengeId(String str) {
            this.config.setChallengeId(str);
            return this;
        }

        public final Builder challengeIdsNotClearWhenBack(boolean z) {
            this.config.setChallengeIdsNotClearWhenBack(z);
            return this;
        }

        public final Builder challenges(List<? extends Challenge> list) {
            this.config.setChallenges(list);
            return this;
        }

        public final Builder clientId(String str) {
            this.config.setClientId(str);
            return this;
        }

        public final Builder commerceData(String str) {
            this.config.setCommerceData(str);
            return this;
        }

        public final Builder commerceTrafficType(String str) {
            this.config.setCommerceTrafficType(str);
            return this;
        }

        public final Builder commercialData(String str) {
            this.config.setCommerceData(str);
            return this;
        }

        public final Builder creationId(String str) {
            this.config.setCreationId(str);
            return this;
        }

        public final Builder creativeDurationExtra(CreativeDurationExtra creativeDurationExtra) {
            this.config.setCreativeDurationExtra(creativeDurationExtra);
            return this;
        }

        public final Builder csiChallengeIdsList(List<String> list) {
            this.config.setCsiChallengeIdsList(list);
            return this;
        }

        public final Builder csiChallengeNamesList(List<String> list) {
            this.config.setCsiChallengeNamesList(list);
            return this;
        }

        public final Builder decompressTime(long j) {
            this.config.setDecompressTime(Long.valueOf(j));
            return this;
        }

        public final Builder defaultTab(int i) {
            this.config.setDefaultTab(Integer.valueOf(i));
            return this;
        }

        public final Builder dmGroupChatStickerGroupInfo(DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo) {
            this.config.setDmGroupChatStickerGroupInfo(dMGroupChatStickerGroupInfo);
            return this;
        }

        public final Builder doNotLoadMusic(boolean z) {
            this.config.setDoNotLoadMusic(z);
            return this;
        }

        public final Builder donationId(String str) {
            this.config.setDonationId(str);
            return this;
        }

        public final Builder duetModeType(String str) {
            this.config.setDuetModeType(str);
            return this;
        }

        public final Builder duetStitchClickTime(long j) {
            this.config.setDuetStitchClickTime(Long.valueOf(j));
            return this;
        }

        public final Builder ecNeedAITeleprompter(Boolean bool) {
            this.config.setNeedEcAITeleprompter(bool);
            return this;
        }

        public final Builder editEffectUID(String str) {
            this.config.setEditEffectUID(str);
            return this;
        }

        public final Builder effectConfig(EffectConfig effectConfig) {
            this.config.setEffectConfig(effectConfig);
            return this;
        }

        public final Builder effectDownloadDuration(long j) {
            this.config.setEffectDownloadDuration(Long.valueOf(j));
            return this;
        }

        public final Builder enterFrom(String str) {
            this.config.setEnterFrom(str);
            return this;
        }

        public final Builder enterFromH5Type(String str) {
            this.config.setEnterFromH5Type(str);
            return this;
        }

        public final Builder enterMethod(String str) {
            this.config.setEnterMethod(str);
            return this;
        }

        public final Builder extraEventParams(HashMap<String, HashMap<String, String>> map) {
            this.config.setExtraEventParams(map);
            return this;
        }

        public final Builder extraLogParams(HashMap<String, String> map) {
            this.config.setExtraLogParams(map);
            return this;
        }

        public final Builder feedPropPin(String str) {
            this.config.setFeedPropPinIds(str);
            return this;
        }

        public final Builder filterBuinessSticker(String str) {
            this.config.setFilterBusniessSticker(str);
            return this;
        }

        public final Builder firstSticker(Effect effect) {
            this.config.setFirstSticker(effect);
            return this;
        }

        public final Builder fontData(DMCreativeStickerFontData dMCreativeStickerFontData) {
            this.config.setFontData(dMCreativeStickerFontData);
            return this;
        }

        public final Builder forceDisableTranslucent(boolean z) {
            this.config.setForceDisableTranslucent(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromDuetVideoDuration(Integer num) {
            RecordConfig recordConfig = this.config;
            if (num == null) {
                num = 0;
            }
            recordConfig.setDuetVideoDuration(num);
            return this;
        }

        public final Builder fromMain(boolean z) {
            this.config.setFromMain(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromOtherPlatform(boolean z) {
            this.config.setFromOtherPlatform(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromSpecialPlus(boolean z) {
            this.config.setFromSpecialPlus(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromSystem(Boolean bool) {
            this.config.setFromSystem(bool);
            return this;
        }

        public final Builder giphyGifIds(String str) {
            this.config.setGiphyGifIds(str);
            return this;
        }

        public final Builder groupId(String str) {
            this.config.setGroupId(str);
            return this;
        }

        public final Builder hideCameraUIOnStartRecord(boolean z) {
            this.config.setHideCameraUIOnStartRecord(Boolean.valueOf(z));
            return this;
        }

        public final Builder initialInputModel(CreativeInitialModel creativeInitialModel) {
            this.config.setInitialModel(creativeInitialModel);
            return this;
        }

        public final Builder inspirationEnterFrom(String str) {
            this.config.setInspirationEnterFrom(str);
            return this;
        }

        public final Builder inspirationEnterMethod(String str) {
            this.config.setInspirationEnterMethod(str);
            return this;
        }

        public final Builder inspirationInfo(InspirationInfo inspirationInfo) {
            this.config.setInspirationInfo(inspirationInfo);
            return this;
        }

        public final Builder interceptBackground(boolean z) {
            this.config.setInterceptBackground(Boolean.valueOf(z));
            return this;
        }

        public final Builder interceptorCost(long j) {
            this.config.setInterceptorCost(j);
            return this;
        }

        public final Builder isDuetFromDuet(Boolean bool) {
            this.config.setDuetFromDuet(bool);
            return this;
        }

        public final Builder isFavouriteMusic(int i) {
            this.config.setFavouriteMusic(i);
            return this;
        }

        public final Builder isFavouriteProp(int i) {
            this.config.setFavouriteProp(i);
            return this;
        }

        public final Builder isFormFlipShootIcon(boolean z) {
            this.config.setFormFlipShootIcon(Boolean.valueOf(z));
            return this;
        }

        public final Builder isFromEoyBanner(String str) {
            this.config.setFromEoyBanner(str);
            return this;
        }

        public final Builder isJatoBoostRunning(boolean z) {
            this.config.setJatoBoostRunning(z);
            return this;
        }

        public final Builder isLandingSearchBefore(boolean z) {
            this.config.setLandingSearchBefore(z);
            return this;
        }

        public final Builder isPlayStop(boolean z) {
            this.config.setPlayerPause(Boolean.valueOf(z));
            return this;
        }

        public final Builder isSameMusicSupplyDetailPage(String str) {
            this.config.setSameMusicSupplyDetailPage(str);
            return this;
        }

        public final Builder isThroughAnchor(boolean z) {
            this.config.setThroughAnchor(z);
            return this;
        }

        public final Builder isUsedFullSong(boolean z) {
            this.config.setUsedFullSong(Boolean.valueOf(z));
            return this;
        }

        public final Builder jumpDisableAnim(boolean z) {
            this.config.setJumpDisableAnim(Boolean.valueOf(z));
            return this;
        }

        public final Builder keepChallenge(boolean z) {
            this.config.setKeepChallenges(Boolean.valueOf(z));
            return this;
        }

        public final Builder landingBack(boolean z) {
            this.config.setLandingBack(z);
            return this;
        }

        public final Builder landingIncludeDraft(boolean z) {
            this.config.setLandingIncludeDraft(z);
            return this;
        }

        public final Builder landingSubTab(String str) {
            this.config.setLandingSubTab(str);
            return this;
        }

        public final Builder landingTab(String str) {
            this.config.setLandingTab(str);
            return this;
        }

        public final Builder liveParams(LiveParams liveParams) {
            this.config.setLiveParams(liveParams);
            return this;
        }

        public final Builder lsAllianceExtraJsonStr(String str) {
            this.config.setLsAllianceExtraJsonStr(str);
            return this;
        }

        public final Builder lsFromEncouragingPosting(String str) {
            this.config.setLsFromEncouragingPosting(str);
            return this;
        }

        public final Builder lyricStickerStruct(LyricStickerStruct lyricStickerStruct) {
            this.config.setLyricStickerStruct(lyricStickerStruct);
            return this;
        }

        public final Builder maxDuration(Long l) {
            this.config.setMaxDuration(l);
            return this;
        }

        public final Builder mdpEnterFrom(String str) {
            this.config.setMdpEnterFrom(str);
            return this;
        }

        public final Builder mdpEnterMethod(String str) {
            this.config.setMdpEnterMethod(str);
            return this;
        }

        public final Builder mecTypeSticker(int i) {
            this.config.setMecTypeSticker(i);
            return this;
        }

        public final Builder mentionStickerParam(MentionStickerParam mentionStickerParam) {
            this.config.setMentionStickerParam(mentionStickerParam);
            return this;
        }

        public final Builder miniAppConfig(MiniAppConfig miniAppConfig) {
            this.config.setMiniAppConfig(miniAppConfig);
            return this;
        }

        public final Builder missionConfig(HashMap<String, String> map) {
            this.config.setMissionConfig(map);
            return this;
        }

        public final Builder moveTargetStickerToFirst(boolean z) {
            this.config.setMoveTargetStickerToFirst(z);
            return this;
        }

        public final Builder musicDownloadComplete(boolean z) {
            this.config.setMusicDownloadComplete(z);
            return this;
        }

        public final Builder musicDownloadDuration(long j) {
            this.config.setMusicDownloadDuration(Long.valueOf(j));
            return this;
        }

        public final Builder musicEnd(Integer num) {
            this.config.setMusicEnd(num);
            return this;
        }

        public final Builder musicId(String str) {
            this.config.setMusicId(str);
            return this;
        }

        public final Builder musicModel(MusicModel musicModel) {
            this.config.setMusicModel(musicModel);
            return this;
        }

        public final Builder musicOrigin(String str) {
            this.config.setMusicOrigin(str);
            return this;
        }

        public final Builder musicPath(String str) {
            this.config.setMusicPath(str);
            return this;
        }

        public final Builder musicStart(Integer num) {
            this.config.setMusicStart(num);
            return this;
        }

        public final Builder musicSticker(String str) {
            this.config.setMusicSticker(str);
            return this;
        }

        public final Builder musicStickerStruct(MusicStickerStruct musicStickerStruct) {
            this.config.setMusicStickerStruct(musicStickerStruct);
            return this;
        }

        public final Builder musicType(int i) {
            this.config.setMusicType(Integer.valueOf(i));
            return this;
        }

        public final Builder musicWithSticker(Effect effect) {
            this.config.setMusicWithStickerEffect(effect);
            return this;
        }

        public final Builder mvSticker(Effect effect) {
            this.config.setMvSticker(effect);
            return this;
        }

        public final Builder mvStickerId(String str) {
            this.config.setMvStickerId(str);
            return this;
        }

        public final Builder needAddRecentMusic(boolean z) {
            this.config.setNeedAddRecentMusic(z);
            return this;
        }

        public final Builder needLoadResourceAfterRecord(boolean z) {
            this.config.setNeedLoadResourceAfterRecord(z);
            return this;
        }

        public final Builder needMobShoot(boolean z) {
            this.config.setNeedMobShoot(z);
            return this;
        }

        public final Builder openTime(long j) {
            this.config.setOpenTime(j);
            return this;
        }

        public final Builder originMusicRemoveTTS(boolean z) {
            this.config.setOriginMusicRemoveTTS(Boolean.valueOf(z));
            return this;
        }

        public final Builder permissionActivityRequired(boolean z) {
            this.config.setPermissionActivityRequired(Boolean.valueOf(z));
            return this;
        }

        public final Builder photoModeAfterFeedbackMobParams(PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams) {
            this.config.setPhotoModeAfterCreationFeedbackMobParams(photoModeAfterCreationFeedbackMobParams);
            return this;
        }

        public final Builder photoModeBannerMobParams(PhotoModeBannerMobParams photoModeBannerMobParams) {
            this.config.setPhotoModeBannerMobParams(photoModeBannerMobParams);
            return this;
        }

        public final Builder poiDataJsonString(String str) {
            this.config.setPoiDataJsonString(str);
            return this;
        }

        public final Builder poiExtraDataJsonString(String str) {
            this.config.setPoiExtraDataJsonString(str);
            return this;
        }

        public final Builder poiPostInfoJsonString(String str) {
            this.config.setPoiPostInfoJsonString(str);
            return this;
        }

        public final Builder postTrendsId(String str) {
            this.config.setPostTrendsId(str);
            return this;
        }

        public final Builder postTrendsType(String str) {
            this.config.setPostTrendsType(str);
            return this;
        }

        public final Builder preloadingDialogMsg(int i) {
            this.config.setPreloadStringResource(i);
            return this;
        }

        public final Builder prepareFilter(boolean z) {
            this.config.setPrepareFilter(z);
            return this;
        }

        public final Builder previousPage(String str) {
            this.config.setPreviousPage(str);
            return this;
        }

        public final Builder previousSearchQuery(String str) {
            this.config.setPreviousSearchQuery(str);
            return this;
        }

        public final Builder propResourceId(String str) {
            this.config.setPropResourceId(str);
            return this;
        }

        public final Builder publishTitle(String str) {
            this.config.setPublishTitle(str);
            return this;
        }

        public final Builder qaOrigin(String str) {
            this.config.setQaOrigin(str);
            return this;
        }

        public final Builder qaOriginGroupId(String str) {
            this.config.setQaOriginGroupId(str);
            return this;
        }

        public final Builder qaVideoConfig(QaStructConfig qaStructConfig) {
            this.config.setQaStructConfig(qaStructConfig);
            return this;
        }

        public final Builder questionCategory(String str) {
            this.config.setQuestionCategory(str);
            return this;
        }

        public final Builder recordFromFeed(boolean z) {
            this.config.setRecordFromFeed(z);
            return this;
        }

        public final Builder recordFromTab(int i) {
            this.config.setRecordFromTab(Integer.valueOf(i));
            return this;
        }

        public final Builder recordParam(String str) {
            this.config.setRecordParam(str);
            return this;
        }

        public final Builder recordPresetResource(RecordPresetResource recordPresetResource) {
            this.config.setRecordPresetResource(recordPresetResource);
            return this;
        }

        public final Builder relationEnterMethod(String str) {
            this.config.setRelationEnterMethod(str);
            return this;
        }

        public final Builder reshootConfig(ReshootConfig reshootConfig) {
            this.config.setReshootConfig(reshootConfig);
            return this;
        }

        public final Builder restoreType(int i) {
            this.config.setRestoreType(i);
            return this;
        }

        public final Builder savedDraft(String str) {
            this.config.setSavedDraft(str);
            return this;
        }

        public final Builder schemaTag(String str) {
            this.config.setSchemaTag(str);
            return this;
        }

        public final Builder secretRepliesStickerParam(SecretRepliesRecordParam secretRepliesRecordParam) {
            this.config.setSecretRepliesStickerParam(secretRepliesRecordParam);
            return this;
        }

        public final Builder seriesCollectionInfo(CollectionInfoParcelableForShoot collectionInfoParcelableForShoot) {
            this.config.setSeriesCollectionInfo(collectionInfoParcelableForShoot);
            return this;
        }

        public final Builder serviceLoadCost(long j) {
            this.config.setServiceLoadCost(j);
            return this;
        }

        public final Builder setAutoSelectedAnchor(AnchorTransData anchorTransData) {
            this.config.setAutoSelectedAnchor(anchorTransData);
            return this;
        }

        public final Builder setAutoSelectedAnchorList(List<AnchorTransData> list) {
            this.config.setAutoSelectedAnchorList(list);
            return this;
        }

        public final Builder setCameraLayoutType(String str) {
            this.config.setCameraLayoutType(str);
            return this;
        }

        public final Builder setDraftLandPage(String str) {
            this.config.setDraftLandPage(str);
            return this;
        }

        public final Builder setEnsureLaunchOnlyOnceFromThirdParty(boolean z) {
            this.config.setEnsureLaunchOnlyOnceFromThirdParty(Boolean.valueOf(z));
            return this;
        }

        public final Builder setEnterTTEPPageMode(int i) {
            this.config.setEnterTTEPPage(i);
            return this;
        }

        public final Builder setGreenScreenKitConfig(OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig) {
            this.config.setGreenScreenKitConfig(oPSDK$GreenScreenKitConfig);
            return this;
        }

        public final Builder setGreenScreenKitPresetResource(RecordPresetResource recordPresetResource) {
            this.config.setGreenScreenKitPresetResource(recordPresetResource);
            return this;
        }

        public final Builder setLiveShootPage(String str) {
            this.config.setLiveShootPage(str);
            return this;
        }

        public final Builder setLsAllianceInfo(String str) {
            this.config.setLsAllianceInfo(str);
            return this;
        }

        public final Builder setMissionStr(String str) {
            this.config.setMissionStr(str);
            return this;
        }

        public final Builder setMultiEntryFormDM(boolean z) {
            this.config.setMultiEntryFormDM(Boolean.valueOf(z));
            return this;
        }

        public final Builder setOpenGreenScreenMode(boolean z) {
            this.config.setOpenGreenScreenMode(Boolean.valueOf(z));
            return this;
        }

        public final Builder setOpenPlatformClientKey(String str) {
            this.config.setOpenPlatformClientKey(str);
            return this;
        }

        public final Builder setOpenPlatformExtra(String str) {
            this.config.setOpenPlatformExtra(str);
            return this;
        }

        public final Builder setSearchExtra(String str) {
            this.config.setSearchExtra(str);
            return this;
        }

        public final Builder setShootFromViewPanelAwemeId(String str) {
            this.config.setShootFromViewPanelAwemeId(str);
            return this;
        }

        public final Builder setTTEPPreviewEffect(Effect effect) {
            this.config.setTtepPreviewEffect(effect);
            return this;
        }

        public final Builder setTTEPPreviewEffectId(String str) {
            this.config.setTtepPreviewEffectId(str);
            return this;
        }

        public final Builder setTemplateData(TemplateData templateData) {
            this.config.setTemplateData(templateData);
            return this;
        }

        public final Builder shareId(String str) {
            this.config.setShareId(str);
            return this;
        }

        public final Builder shareKitPanel(ShareKitPanel shareKitPanel) {
            this.config.setShareKitPanel(shareKitPanel);
            return this;
        }

        public final Builder shareModel(BaseShareContext baseShareContext) {
            this.config.setShareModel(baseShareContext);
            return this;
        }

        public final Builder sharedARHostId(String str) {
            this.config.setSharedARHostId(str);
            return this;
        }

        public final Builder sharedARSessionId(String str) {
            this.config.setSharedARSessionId(str);
            return this;
        }

        public final Builder shootEnterFrom(String str) {
            this.config.setShootEnterFrom(str);
            return this;
        }

        public final Builder shootExtraData(ShootExtraData shootExtraData) {
            this.config.setShootExtraData(shootExtraData);
            return this;
        }

        public final Builder shootFrom(String str) {
            this.config.setShootFrom(str);
            return this;
        }

        public final Builder shootNativeRecvTs(long j) {
            this.config.setShootNativeRecvTs(j);
            return this;
        }

        public final Builder shootPerfSessionId(String str) {
            this.config.setShootPerfSessionId(str);
            return this;
        }

        public final Builder shootWay(String str) {
            this.config.setShootway(str);
            return this;
        }

        public final Builder shouldSupportPrivateAlbum(boolean z) {
            this.config.setSupportPrivateAlbum(Boolean.valueOf(z));
            return this;
        }

        public final Builder showAIAliveBanner(boolean z) {
            this.config.setShowAIAliveBanner(Boolean.valueOf(z));
            return this;
        }

        public final Builder showCancelAfterPinProp(boolean z) {
            this.config.setShowCancelAfterPinProp(Boolean.valueOf(z));
            return this;
        }

        public final Builder showPreloadingDialog(boolean z) {
            this.config.setShowPreloadingDialog(Boolean.valueOf(z));
            return this;
        }

        public final Builder showStickerPanel(boolean z) {
            this.config.setShowStickerPanel(z);
            return this;
        }

        public final Builder starAtlasConfig(HashMap<String, String> map) {
            this.config.setStarAtlasConfig(map);
            return this;
        }

        public final Builder startRecordTime(long j) {
            this.config.setStartRecordTime(Long.valueOf(j));
            return this;
        }

        public final Builder startScanFaceForAIProfile(boolean z) {
            this.config.setStartScanFaceAIProfile(Boolean.valueOf(z));
            return this;
        }

        public final Builder sticker(String str) {
            this.config.setSticker(str);
            return this;
        }

        public final Builder stickerMusic(Music music) {
            this.config.setStickerMusic(music);
            return this;
        }

        public final Builder stickerParams(Map<String, String> map) {
            this.config.setExtraParams(map);
            return this;
        }

        public final Builder stickerWithMusicFilePath(String str) {
            this.config.setStickerWithMusicFilePath(str);
            return this;
        }

        public final Builder stickers(ArrayList<String> arrayList) {
            this.config.setStickers(arrayList);
            return this;
        }

        public final Builder stitchParams(StitchParams stitchParams) {
            this.config.setStitchParams(stitchParams);
            return this;
        }

        public final Builder tabs(String str) {
            if (str != null) {
                try {
                    this.config.setTabs(Integer.valueOf(CastIntegerProtector.parseInt(str)));
                    return this;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return this;
        }

        public final Builder targetSubtabForUploadPage(int i) {
            this.config.setDefaultSubTabForUploadPage(Integer.valueOf(i));
            return this;
        }

        public final Builder templateBackCamera(String str) {
            this.config.setTemplateBackCamera(str);
            return this;
        }

        public final Builder templateDebugId(String str) {
            this.config.setTemplateDebugId(str);
            return this;
        }

        public final Builder templateDebugType(String str) {
            this.config.setTemplateDebugType(str);
            return this;
        }

        public final Builder translationType(int i) {
            this.config.setTranslationType(Integer.valueOf(i));
            return this;
        }

        public final Builder ttsVoiceIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setTtsVoiceIDs(arrayList);
            return this;
        }

        public final Builder ttsVoiceInfo(TtsVoiceInfo ttsVoiceInfo) {
            RecordConfig recordConfig = this.config;
            if (ttsVoiceInfo == null) {
                ttsVoiceInfo = null;
            }
            recordConfig.setTtsVoiceInfo(ttsVoiceInfo);
            return this;
        }

        public final Builder ttsVoiceRefIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setTtsVoiceRefIDs(arrayList);
            return this;
        }

        public final Builder ugcTemplateTag(String str) {
            this.config.setUgcTemplateTag(str);
            return this;
        }

        public final Builder unavailableNetworkMusic(boolean z) {
            this.config.setNetworkUnavailableMusic(Boolean.valueOf(z));
            return this;
        }

        public final Builder unpublishedEffect(String str) {
            this.config.setUnpublishedEffect(str);
            return this;
        }

        public final Builder uploadPageMultiSelect(boolean z) {
            this.config.setUploadPageMultiSelect(Boolean.valueOf(z));
            return this;
        }

        public final Builder usePresetSticker(Boolean bool) {
            this.config.setPresetSticker(bool);
            return this;
        }

        public final Builder vcVoiceEffectId(String str) {
            this.config.setVcVoiceEffectId(str);
            return this;
        }

        public final Builder vcVoiceEffectName(String str) {
            this.config.setVcVoiceEffectName(str);
            return this;
        }

        public final Builder vcVoiceIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setVcVoiceIDs(arrayList);
            return this;
        }

        public final Builder vcVoiceRefIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setVcVoiceRefIDs(arrayList);
            return this;
        }

        public final Builder videoDownloadDuration(long j) {
            this.config.setVideoDownloadDuration(Long.valueOf(j));
            return this;
        }

        public final Builder videoLength(Integer num) {
            RecordConfig recordConfig = this.config;
            if (num == null) {
                num = 0;
            }
            recordConfig.setVideoLength(num);
            return this;
        }

        public final Builder voiceEffectId(String str) {
            this.config.setVoiceEffectId(str);
            return this;
        }

        public final Builder voiceEffectName(String str) {
            this.config.setVoiceEffectName(str);
            return this;
        }

        public final Builder initialFilterConfig(String str, String str2) {
            this.config.setInitialFilterConfig(new InitialFilterConfig(str, str2, false, false, false));
            return this;
        }

        public final Builder mentionUser(String str, String str2) {
            this.config.setMentionUser(new Pair<>(str, str2));
            return this;
        }

        public final Builder poiMobParams(String str, String str2, String str3) {
            this.config.setPoiShootWay(str);
            this.config.setPoiEnterFrom(str2);
            this.config.setPoiEnterMethod(str3);
            return this;
        }

        public final Builder propData(String str, String str2, String str3) {
            this.config.setPropList(str);
            this.config.setPropResourceList(str2);
            propResourceId(str3);
            return this;
        }
    }

    public RecordConfig() {
        Boolean bool = Boolean.FALSE;
        this.keepChallenges = bool;
        this.networkUnavailableMusic = bool;
        this.translationType = 0;
        this.recordFromTab = Integer.valueOf(EnumC569740MWe.DEFAULT.getTab());
        this.draftLandPage = "";
        this.permissionActivityRequired = bool;
        this.prepareFilter = true;
        this.defaultTab = 0;
        this.defaultSubTabForUploadPage = -1;
        this.uploadPageMultiSelect = bool;
        this.musicType = 0;
        this.tabs = 0;
        this.reshootConfig = new ReshootConfig(false, null);
        this.interceptorCost = -1L;
        this.serviceLoadCost = -1L;
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.openPlatformClientKey = "";
        this.openPlatformExtra = "";
        this.duetModeType = "";
        this.extraEventParams = new HashMap<>();
        this.postTrendsId = "";
        this.postTrendsType = CardStruct.IStatusCode.DEFAULT;
        this.ugcTemplateTag = "ugc_template_tag_default";
        this.openGreenScreenMode = bool;
        this.startScanFaceAIProfile = bool;
        this.hideCameraUIOnStartRecord = bool;
        this.forceDisableTranslucent = bool;
        this.jumpDisableAnim = bool;
    }

    public final AddYourRecordParam getAddYourRecordParam() {
        return this.addYourRecordParam;
    }

    public final AILivePhotoConsumptionModel getAiAliveInfo() {
        return this.aiAliveInfo;
    }

    public final AlbumOpenApiModel getAlbumOpenApiModel() {
        return this.albumOpenApiModel;
    }

    public final boolean getAllowMultipleEntrance() {
        return this.allowMultipleEntrance;
    }

    public final String getAnchorExtra() {
        return this.anchorExtra;
    }

    public final Boolean getAutoOpenAlbum() {
        return this.autoOpenAlbum;
    }

    public final AnchorTransData getAutoSelectedAnchor() {
        return this.autoSelectedAnchor;
    }

    public final List<AnchorTransData> getAutoSelectedAnchorList() {
        return this.autoSelectedAnchorList;
    }

    public final String getAutoUseMusic() {
        return this.autoUseMusic;
    }

    public final String getAutoUseSticker() {
        return this.autoUseSticker;
    }

    public final boolean getBackByClearTop() {
        return this.backByClearTop;
    }

    public final String getBackUrl() {
        return this.backUrl;
    }

    public final Integer getCameraFacing() {
        return this.cameraFacing;
    }

    public final String getCameraLayoutType() {
        return this.cameraLayoutType;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final boolean getChallengeIdsNotClearWhenBack() {
        return this.challengeIdsNotClearWhenBack;
    }

    public final List<Challenge> getChallenges() {
        return this.challenges;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final CommentVideoConfig getCommentVideoConfig() {
        return this.commentVideoConfig;
    }

    public final String getCommerceData() {
        return this.commerceData;
    }

    public final String getCommerceTrafficType() {
        return this.commerceTrafficType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final CreativeDurationExtra getCreativeDurationExtra() {
        return this.creativeDurationExtra;
    }

    public final List<String> getCsiChallengeIdsList() {
        return this.csiChallengeIdsList;
    }

    public final List<String> getCsiChallengeNamesList() {
        return this.csiChallengeNamesList;
    }

    public final Long getDecompressTime() {
        return this.decompressTime;
    }

    public final Integer getDefaultSubTabForUploadPage() {
        return this.defaultSubTabForUploadPage;
    }

    public final Integer getDefaultTab() {
        return this.defaultTab;
    }

    public final DMGroupChatStickerGroupInfo getDmGroupChatStickerGroupInfo() {
        return this.dmGroupChatStickerGroupInfo;
    }

    public final boolean getDoNotLoadMusic() {
        return this.doNotLoadMusic;
    }

    public final String getDonationId() {
        return this.donationId;
    }

    public final String getDraftLandPage() {
        return this.draftLandPage;
    }

    public final String getDuetEntranceType() {
        return this.duetEntranceType;
    }

    public final String getDuetFromItemId() {
        return this.duetFromItemId;
    }

    public final String getDuetModeType() {
        return this.duetModeType;
    }

    public final String getDuetPrevEntranceType() {
        return this.duetPrevEntranceType;
    }

    public final Long getDuetStitchClickTime() {
        return this.duetStitchClickTime;
    }

    public final Integer getDuetVideoDuration() {
        return this.duetVideoDuration;
    }

    public final String getEditEffectUID() {
        return this.editEffectUID;
    }

    public final EffectConfig getEffectConfig() {
        return this.effectConfig;
    }

    public final Long getEffectDownloadDuration() {
        return this.effectDownloadDuration;
    }

    public final Boolean getEnsureLaunchOnlyOnceFromThirdParty() {
        return this.ensureLaunchOnlyOnceFromThirdParty;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterFromH5Type() {
        return this.enterFromH5Type;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final int getEnterTTEPPage() {
        return this.enterTTEPPage;
    }

    public final HashMap<String, HashMap<String, String>> getExtraEventParams() {
        return this.extraEventParams;
    }

    public final HashMap<String, String> getExtraLogParams() {
        return this.extraLogParams;
    }

    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public final String getFeedPropPinIds() {
        return this.feedPropPinIds;
    }

    public final Effect getFirstSticker() {
        return this.firstSticker;
    }

    public final DMCreativeStickerFontData getFontData() {
        return this.fontData;
    }

    public final Boolean getForceDisableTranslucent() {
        return this.forceDisableTranslucent;
    }

    public final Boolean getFromMain() {
        return this.fromMain;
    }

    public final Boolean getFromOtherPlatform() {
        return this.fromOtherPlatform;
    }

    public final Boolean getFromSpecialPlus() {
        return this.fromSpecialPlus;
    }

    public final Boolean getFromSystem() {
        return this.fromSystem;
    }

    public final String getGiphyGifIds() {
        return this.giphyGifIds;
    }

    public final OPSDK$GreenScreenKitConfig getGreenScreenKitConfig() {
        return this.greenScreenKitConfig;
    }

    public final RecordPresetResource getGreenScreenKitPresetResource() {
        return this.greenScreenKitPresetResource;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final Boolean getHideCameraUIOnStartRecord() {
        return this.hideCameraUIOnStartRecord;
    }

    public final InitialFilterConfig getInitialFilterConfig() {
        return this.initialFilterConfig;
    }

    public final CreativeInitialModel getInitialModel() {
        return this.initialModel;
    }

    public final String getInspirationEnterFrom() {
        return this.inspirationEnterFrom;
    }

    public final String getInspirationEnterMethod() {
        return this.inspirationEnterMethod;
    }

    public final InspirationInfo getInspirationInfo() {
        return this.inspirationInfo;
    }

    public final long getInterceptorCost() {
        return this.interceptorCost;
    }

    public final Boolean getJumpDisableAnim() {
        return this.jumpDisableAnim;
    }

    public final Boolean getKeepChallenges() {
        return this.keepChallenges;
    }

    public final boolean getLandingBack() {
        return this.landingBack;
    }

    public final boolean getLandingIncludeDraft() {
        return this.landingIncludeDraft;
    }

    public final String getLandingSubTab() {
        return this.landingSubTab;
    }

    public final String getLandingTab() {
        return this.landingTab;
    }

    public final String getLiveEventStickerRawData() {
        return this.liveEventStickerRawData;
    }

    public final LiveParams getLiveParams() {
        return this.liveParams;
    }

    public final String getLiveShootPage() {
        return this.liveShootPage;
    }

    public final String getLsAllianceExtraJsonStr() {
        return this.lsAllianceExtraJsonStr;
    }

    public final String getLsAllianceInfo() {
        return this.lsAllianceInfo;
    }

    public final String getLsFromEncouragingPosting() {
        return this.lsFromEncouragingPosting;
    }

    public final LyricStickerStruct getLyricStickerStruct() {
        return this.lyricStickerStruct;
    }

    public final Long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getMdpEnterFrom() {
        return this.mdpEnterFrom;
    }

    public final String getMdpEnterMethod() {
        return this.mdpEnterMethod;
    }

    public final int getMecTypeSticker() {
        return this.mecTypeSticker;
    }

    public final MentionStickerParam getMentionStickerParam() {
        return this.mentionStickerParam;
    }

    public final Pair<String, String> getMentionUser() {
        return this.mentionUser;
    }

    public final MiniAppConfig getMiniAppConfig() {
        return this.miniAppConfig;
    }

    public final HashMap<String, String> getMissionConfig() {
        return this.missionConfig;
    }

    public final String getMissionStr() {
        return this.missionStr;
    }

    public final boolean getMoveTargetStickerToFirst() {
        return this.moveTargetStickerToFirst;
    }

    public final boolean getMusicDownloadComplete() {
        return this.musicDownloadComplete;
    }

    public final Long getMusicDownloadDuration() {
        return this.musicDownloadDuration;
    }

    public final Integer getMusicEnd() {
        return this.musicEnd;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicOrigin() {
        return this.musicOrigin;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final Integer getMusicStart() {
        return this.musicStart;
    }

    public final String getMusicSticker() {
        return this.musicSticker;
    }

    public final MusicStickerStruct getMusicStickerStruct() {
        return this.musicStickerStruct;
    }

    public final Integer getMusicType() {
        return this.musicType;
    }

    public final Effect getMusicWithStickerEffect() {
        return this.musicWithStickerEffect;
    }

    public final Effect getMvSticker() {
        return this.mvSticker;
    }

    public final String getMvStickerId() {
        return this.mvStickerId;
    }

    public final boolean getNeedAddRecentMusic() {
        return this.needAddRecentMusic;
    }

    public final Boolean getNeedEcAITeleprompter() {
        return this.needEcAITeleprompter;
    }

    public final boolean getNeedLoadResourceAfterRecord() {
        return this.needLoadResourceAfterRecord;
    }

    public final boolean getNeedMobShoot() {
        return this.needMobShoot;
    }

    public final Boolean getNetworkUnavailableMusic() {
        return this.networkUnavailableMusic;
    }

    public final Boolean getOpenGreenScreenMode() {
        return this.openGreenScreenMode;
    }

    public final String getOpenPlatformClientKey() {
        return this.openPlatformClientKey;
    }

    public final String getOpenPlatformExtra() {
        return this.openPlatformExtra;
    }

    public final long getOpenTime() {
        return this.openTime;
    }

    public final Boolean getOriginMusicRemoveTTS() {
        return this.originMusicRemoveTTS;
    }

    public final Boolean getPermissionActivityRequired() {
        return this.permissionActivityRequired;
    }

    public final PhotoModeAfterCreationFeedbackMobParams getPhotoModeAfterCreationFeedbackMobParams() {
        return this.photoModeAfterCreationFeedbackMobParams;
    }

    public final PhotoModeBannerMobParams getPhotoModeBannerMobParams() {
        return this.photoModeBannerMobParams;
    }

    public final String getPoiDataJsonString() {
        return this.poiDataJsonString;
    }

    public final String getPoiEnterFrom() {
        return this.poiEnterFrom;
    }

    public final String getPoiEnterMethod() {
        return this.poiEnterMethod;
    }

    public final String getPoiExtraDataJsonString() {
        return this.poiExtraDataJsonString;
    }

    public final String getPoiPostInfoJsonString() {
        return this.poiPostInfoJsonString;
    }

    public final String getPoiShootWay() {
        return this.poiShootWay;
    }

    public final String getPostTrendsId() {
        return this.postTrendsId;
    }

    public final String getPostTrendsType() {
        return this.postTrendsType;
    }

    public final int getPreloadStringResource() {
        return this.preloadStringResource;
    }

    public final boolean getPrepareFilter() {
        return this.prepareFilter;
    }

    public final Boolean getPresetSticker() {
        return this.presetSticker;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getPreviousSearchQuery() {
        return this.previousSearchQuery;
    }

    public final String getPropList() {
        return this.propList;
    }

    public final String getPropResourceId() {
        return this.propResourceId;
    }

    public final String getPropResourceList() {
        return this.propResourceList;
    }

    public final String getPublishTitle() {
        return this.publishTitle;
    }

    public final String getQaOrigin() {
        return this.qaOrigin;
    }

    public final String getQaOriginGroupId() {
        return this.qaOriginGroupId;
    }

    public final QaStructConfig getQaStructConfig() {
        return this.qaStructConfig;
    }

    public final String getQuestionCategory() {
        return this.questionCategory;
    }

    public final boolean getRecordFromFeed() {
        return this.recordFromFeed;
    }

    public final Integer getRecordFromTab() {
        return this.recordFromTab;
    }

    public final String getRecordParam() {
        return this.recordParam;
    }

    public final RecordPresetResource getRecordPresetResource() {
        return this.recordPresetResource;
    }

    public final String getRelationEnterMethod() {
        return this.relationEnterMethod;
    }

    public final ReshootConfig getReshootConfig() {
        return this.reshootConfig;
    }

    public final int getRestoreType() {
        return this.restoreType;
    }

    public final ReuseSoundAndEffectModel getReuseSoundAndEffectModel() {
        return this.reuseSoundAndEffectModel;
    }

    public final String getSavedDraft() {
        return this.savedDraft;
    }

    public final String getSchemaTag() {
        return this.schemaTag;
    }

    public final String getSearchExtra() {
        return this.searchExtra;
    }

    public final SecretRepliesRecordParam getSecretRepliesStickerParam() {
        return this.secretRepliesStickerParam;
    }

    public final CollectionInfoParcelableForShoot getSeriesCollectionInfo() {
        return this.seriesCollectionInfo;
    }

    public final long getServiceLoadCost() {
        return this.serviceLoadCost;
    }

    public final String getShareId() {
        return this.shareId;
    }

    public final ShareKitPanel getShareKitPanel() {
        return this.shareKitPanel;
    }

    public final BaseShareContext getShareModel() {
        return this.shareModel;
    }

    public final String getSharedARHostId() {
        return this.sharedARHostId;
    }

    public final String getSharedARSessionId() {
        return this.sharedARSessionId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getShootFrom() {
        return this.shootFrom;
    }

    public final String getShootFromViewPanelAwemeId() {
        return this.shootFromViewPanelAwemeId;
    }

    public final long getShootNativeRecvTs() {
        return this.shootNativeRecvTs;
    }

    public final String getShootPerfSessionId() {
        return this.shootPerfSessionId;
    }

    public final String getShootway() {
        return this.shootway;
    }

    public final Boolean getShowAIAliveBanner() {
        return this.showAIAliveBanner;
    }

    public final Boolean getShowCancelAfterPinProp() {
        return this.showCancelAfterPinProp;
    }

    public final Boolean getShowPreloadingDialog() {
        return this.showPreloadingDialog;
    }

    public final boolean getShowStickerPanel() {
        return this.showStickerPanel;
    }

    public final HashMap<String, String> getStarAtlasConfig() {
        return this.starAtlasConfig;
    }

    public final Long getStartRecordTime() {
        return this.startRecordTime;
    }

    public final Boolean getStartScanFaceAIProfile() {
        return this.startScanFaceAIProfile;
    }

    public final String getSticker() {
        return this.sticker;
    }

    public final Music getStickerMusic() {
        return this.stickerMusic;
    }

    public final String getStickerWithMusicFilePath() {
        return this.stickerWithMusicFilePath;
    }

    public final ArrayList<String> getStickers() {
        return this.stickers;
    }

    public final StitchParams getStitchParams() {
        return this.stitchParams;
    }

    public final Boolean getSupportPrivateAlbum() {
        return this.supportPrivateAlbum;
    }

    public final Integer getTabs() {
        return this.tabs;
    }

    public final String getTemplateBackCamera() {
        return this.templateBackCamera;
    }

    public final TemplateData getTemplateData() {
        return this.templateData;
    }

    public final String getTemplateDebugId() {
        return this.templateDebugId;
    }

    public final String getTemplateDebugType() {
        return this.templateDebugType;
    }

    public final Integer getTranslationType() {
        return this.translationType;
    }

    public final Effect getTtepPreviewEffect() {
        return this.ttepPreviewEffect;
    }

    public final String getTtepPreviewEffectId() {
        return this.ttepPreviewEffectId;
    }

    public final ArrayList<String> getTtsVoiceIDs() {
        return this.ttsVoiceIDs;
    }

    public final TtsVoiceInfo getTtsVoiceInfo() {
        return this.ttsVoiceInfo;
    }

    public final ArrayList<String> getTtsVoiceRefIDs() {
        return this.ttsVoiceRefIDs;
    }

    public final String getUgcTemplateTag() {
        return this.ugcTemplateTag;
    }

    public final String getUnpublishedEffect() {
        return this.unpublishedEffect;
    }

    public final Boolean getUploadPageMultiSelect() {
        return this.uploadPageMultiSelect;
    }

    public final boolean getUsedFullSong() {
        return this.usedFullSong;
    }

    public final String getVcVoiceEffectId() {
        return this.vcVoiceEffectId;
    }

    public final String getVcVoiceEffectName() {
        return this.vcVoiceEffectName;
    }

    public final ArrayList<String> getVcVoiceIDs() {
        return this.vcVoiceIDs;
    }

    public final ArrayList<String> getVcVoiceRefIDs() {
        return this.vcVoiceRefIDs;
    }

    public final Long getVideoDownloadDuration() {
        return this.videoDownloadDuration;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final String getVoiceEffectId() {
        return this.voiceEffectId;
    }

    public final String getVoiceEffectName() {
        return this.voiceEffectName;
    }

    public final Boolean isDuetFromDuet() {
        return this.isDuetFromDuet;
    }

    public final int isFavouriteMusic() {
        return this.isFavouriteMusic;
    }

    public final int isFavouriteProp() {
        return this.isFavouriteProp;
    }

    public final String isFilterBusniessSticker() {
        return this.isFilterBusniessSticker;
    }

    public final Boolean isFormFlipShootIcon() {
        return this.isFormFlipShootIcon;
    }

    public final String isFromEoyBanner() {
        return this.isFromEoyBanner;
    }

    public final Boolean isInterceptBackground() {
        return this.isInterceptBackground;
    }

    public final boolean isJatoBoostRunning() {
        return this.isJatoBoostRunning;
    }

    public final boolean isLandingSearchBefore() {
        return this.isLandingSearchBefore;
    }

    public final Boolean isMultiEntryFormDM() {
        return this.isMultiEntryFormDM;
    }

    public final Boolean isPlayerPause() {
        return this.isPlayerPause;
    }

    public final String isSameMusicSupplyDetailPage() {
        return this.isSameMusicSupplyDetailPage;
    }

    public final boolean isThroughAnchor() {
        return this.isThroughAnchor;
    }

    public final Boolean isUsedFullSong() {
        return this.isUsedFullSong;
    }

    public final void setAddYourRecordParam(AddYourRecordParam addYourRecordParam) {
        this.addYourRecordParam = addYourRecordParam;
    }

    public final void setAiAliveInfo(AILivePhotoConsumptionModel aILivePhotoConsumptionModel) {
        this.aiAliveInfo = aILivePhotoConsumptionModel;
    }

    public final void setAlbumOpenApiModel(AlbumOpenApiModel albumOpenApiModel) {
        this.albumOpenApiModel = albumOpenApiModel;
    }

    public final void setAllowMultipleEntrance(boolean z) {
        this.allowMultipleEntrance = z;
    }

    public final void setAnchorExtra(String str) {
        this.anchorExtra = str;
    }

    public final void setAutoOpenAlbum(Boolean bool) {
        this.autoOpenAlbum = bool;
    }

    public final void setAutoSelectedAnchor(AnchorTransData anchorTransData) {
        this.autoSelectedAnchor = anchorTransData;
    }

    public final void setAutoSelectedAnchorList(List<AnchorTransData> list) {
        this.autoSelectedAnchorList = list;
    }

    public final void setAutoUseMusic(String str) {
        this.autoUseMusic = str;
    }

    public final void setAutoUseSticker(String str) {
        this.autoUseSticker = str;
    }

    public final void setBackByClearTop(boolean z) {
        this.backByClearTop = z;
    }

    public final void setBackUrl(String str) {
        this.backUrl = str;
    }

    public final void setCameraFacing(Integer num) {
        this.cameraFacing = num;
    }

    public final void setCameraLayoutType(String str) {
        this.cameraLayoutType = str;
    }

    public final void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setChallengeIdsNotClearWhenBack(boolean z) {
        this.challengeIdsNotClearWhenBack = z;
    }

    public final void setChallenges(List<? extends Challenge> list) {
        this.challenges = list;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setCommentVideoConfig(CommentVideoConfig commentVideoConfig) {
        this.commentVideoConfig = commentVideoConfig;
    }

    public final void setCommerceData(String str) {
        this.commerceData = str;
    }

    public final void setCommerceTrafficType(String str) {
        this.commerceTrafficType = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setCreativeDurationExtra(CreativeDurationExtra creativeDurationExtra) {
        this.creativeDurationExtra = creativeDurationExtra;
    }

    public final void setCsiChallengeIdsList(List<String> list) {
        this.csiChallengeIdsList = list;
    }

    public final void setCsiChallengeNamesList(List<String> list) {
        this.csiChallengeNamesList = list;
    }

    public final void setDecompressTime(Long l) {
        this.decompressTime = l;
    }

    public final void setDefaultSubTabForUploadPage(Integer num) {
        this.defaultSubTabForUploadPage = num;
    }

    public final void setDefaultTab(Integer num) {
        this.defaultTab = num;
    }

    public final void setDmGroupChatStickerGroupInfo(DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo) {
        this.dmGroupChatStickerGroupInfo = dMGroupChatStickerGroupInfo;
    }

    public final void setDoNotLoadMusic(boolean z) {
        this.doNotLoadMusic = z;
    }

    public final void setDonationId(String str) {
        this.donationId = str;
    }

    public final void setDraftLandPage(String str) {
        this.draftLandPage = str;
    }

    public final void setDuetEntranceType(String str) {
        this.duetEntranceType = str;
    }

    public final void setDuetFromDuet(Boolean bool) {
        this.isDuetFromDuet = bool;
    }

    public final void setDuetFromItemId(String str) {
        this.duetFromItemId = str;
    }

    public final void setDuetModeType(String str) {
        this.duetModeType = str;
    }

    public final void setDuetPrevEntranceType(String str) {
        this.duetPrevEntranceType = str;
    }

    public final void setDuetStitchClickTime(Long l) {
        this.duetStitchClickTime = l;
    }

    public final void setDuetVideoDuration(Integer num) {
        this.duetVideoDuration = num;
    }

    public final void setEditEffectUID(String str) {
        this.editEffectUID = str;
    }

    public final void setEffectConfig(EffectConfig effectConfig) {
        this.effectConfig = effectConfig;
    }

    public final void setEffectDownloadDuration(Long l) {
        this.effectDownloadDuration = l;
    }

    public final void setEnsureLaunchOnlyOnceFromThirdParty(Boolean bool) {
        this.ensureLaunchOnlyOnceFromThirdParty = bool;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterFromH5Type(String str) {
        this.enterFromH5Type = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEnterTTEPPage(int i) {
        this.enterTTEPPage = i;
    }

    public final void setExtraEventParams(HashMap<String, HashMap<String, String>> map) {
        this.extraEventParams = map;
    }

    public final void setExtraLogParams(HashMap<String, String> map) {
        this.extraLogParams = map;
    }

    public final void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public final void setFavouriteMusic(int i) {
        this.isFavouriteMusic = i;
    }

    public final void setFavouriteProp(int i) {
        this.isFavouriteProp = i;
    }

    public final void setFeedPropPinIds(String str) {
        this.feedPropPinIds = str;
    }

    public final void setFilterBusniessSticker(String str) {
        this.isFilterBusniessSticker = str;
    }

    public final void setFirstSticker(Effect effect) {
        this.firstSticker = effect;
    }

    public final void setFontData(DMCreativeStickerFontData dMCreativeStickerFontData) {
        this.fontData = dMCreativeStickerFontData;
    }

    public final void setForceDisableTranslucent(Boolean bool) {
        this.forceDisableTranslucent = bool;
    }

    public final void setFormFlipShootIcon(Boolean bool) {
        this.isFormFlipShootIcon = bool;
    }

    public final void setFromEoyBanner(String str) {
        this.isFromEoyBanner = str;
    }

    public final void setFromMain(Boolean bool) {
        this.fromMain = bool;
    }

    public final void setFromOtherPlatform(Boolean bool) {
        this.fromOtherPlatform = bool;
    }

    public final void setFromSpecialPlus(Boolean bool) {
        this.fromSpecialPlus = bool;
    }

    public final void setFromSystem(Boolean bool) {
        this.fromSystem = bool;
    }

    public final void setGiphyGifIds(String str) {
        this.giphyGifIds = str;
    }

    public final void setGreenScreenKitConfig(OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig) {
        this.greenScreenKitConfig = oPSDK$GreenScreenKitConfig;
    }

    public final void setGreenScreenKitPresetResource(RecordPresetResource recordPresetResource) {
        this.greenScreenKitPresetResource = recordPresetResource;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setHideCameraUIOnStartRecord(Boolean bool) {
        this.hideCameraUIOnStartRecord = bool;
    }

    public final void setInitialFilterConfig(InitialFilterConfig initialFilterConfig) {
        this.initialFilterConfig = initialFilterConfig;
    }

    public final void setInitialModel(CreativeInitialModel creativeInitialModel) {
        this.initialModel = creativeInitialModel;
    }

    public final void setInspirationEnterFrom(String str) {
        this.inspirationEnterFrom = str;
    }

    public final void setInspirationEnterMethod(String str) {
        this.inspirationEnterMethod = str;
    }

    public final void setInspirationInfo(InspirationInfo inspirationInfo) {
        this.inspirationInfo = inspirationInfo;
    }

    public final void setInterceptBackground(Boolean bool) {
        this.isInterceptBackground = bool;
    }

    public final void setInterceptorCost(long j) {
        this.interceptorCost = j;
    }

    public final void setJatoBoostRunning(boolean z) {
        this.isJatoBoostRunning = z;
    }

    public final void setJumpDisableAnim(Boolean bool) {
        this.jumpDisableAnim = bool;
    }

    public final void setKeepChallenges(Boolean bool) {
        this.keepChallenges = bool;
    }

    public final void setLandingBack(boolean z) {
        this.landingBack = z;
    }

    public final void setLandingIncludeDraft(boolean z) {
        this.landingIncludeDraft = z;
    }

    public final void setLandingSearchBefore(boolean z) {
        this.isLandingSearchBefore = z;
    }

    public final void setLandingSubTab(String str) {
        this.landingSubTab = str;
    }

    public final void setLandingTab(String str) {
        this.landingTab = str;
    }

    public final void setLiveEventStickerRawData(String str) {
        this.liveEventStickerRawData = str;
    }

    public final void setLiveParams(LiveParams liveParams) {
        this.liveParams = liveParams;
    }

    public final void setLiveShootPage(String str) {
        this.liveShootPage = str;
    }

    public final void setLsAllianceExtraJsonStr(String str) {
        this.lsAllianceExtraJsonStr = str;
    }

    public final void setLsAllianceInfo(String str) {
        this.lsAllianceInfo = str;
    }

    public final void setLsFromEncouragingPosting(String str) {
        this.lsFromEncouragingPosting = str;
    }

    public final void setLyricStickerStruct(LyricStickerStruct lyricStickerStruct) {
        this.lyricStickerStruct = lyricStickerStruct;
    }

    public final void setMaxDuration(Long l) {
        this.maxDuration = l;
    }

    public final void setMdpEnterFrom(String str) {
        this.mdpEnterFrom = str;
    }

    public final void setMdpEnterMethod(String str) {
        this.mdpEnterMethod = str;
    }

    public final void setMecTypeSticker(int i) {
        this.mecTypeSticker = i;
    }

    public final void setMentionStickerParam(MentionStickerParam mentionStickerParam) {
        this.mentionStickerParam = mentionStickerParam;
    }

    public final void setMentionUser(Pair<String, String> pair) {
        this.mentionUser = pair;
    }

    public final void setMiniAppConfig(MiniAppConfig miniAppConfig) {
        this.miniAppConfig = miniAppConfig;
    }

    public final void setMissionConfig(HashMap<String, String> map) {
        this.missionConfig = map;
    }

    public final void setMissionStr(String str) {
        this.missionStr = str;
    }

    public final void setMoveTargetStickerToFirst(boolean z) {
        this.moveTargetStickerToFirst = z;
    }

    public final void setMultiEntryFormDM(Boolean bool) {
        this.isMultiEntryFormDM = bool;
    }

    public final void setMusicDownloadComplete(boolean z) {
        this.musicDownloadComplete = z;
    }

    public final void setMusicDownloadDuration(Long l) {
        this.musicDownloadDuration = l;
    }

    public final void setMusicEnd(Integer num) {
        this.musicEnd = num;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public final void setMusicOrigin(String str) {
        this.musicOrigin = str;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicStart(Integer num) {
        this.musicStart = num;
    }

    public final void setMusicSticker(String str) {
        this.musicSticker = str;
    }

    public final void setMusicStickerStruct(MusicStickerStruct musicStickerStruct) {
        this.musicStickerStruct = musicStickerStruct;
    }

    public final void setMusicType(Integer num) {
        this.musicType = num;
    }

    public final void setMusicWithStickerEffect(Effect effect) {
        this.musicWithStickerEffect = effect;
    }

    public final void setMvSticker(Effect effect) {
        this.mvSticker = effect;
    }

    public final void setMvStickerId(String str) {
        this.mvStickerId = str;
    }

    public final void setNeedAddRecentMusic(boolean z) {
        this.needAddRecentMusic = z;
    }

    public final void setNeedEcAITeleprompter(Boolean bool) {
        this.needEcAITeleprompter = bool;
    }

    public final void setNeedLoadResourceAfterRecord(boolean z) {
        this.needLoadResourceAfterRecord = z;
    }

    public final void setNeedMobShoot(boolean z) {
        this.needMobShoot = z;
    }

    public final void setNetworkUnavailableMusic(Boolean bool) {
        this.networkUnavailableMusic = bool;
    }

    public final void setOpenGreenScreenMode(Boolean bool) {
        this.openGreenScreenMode = bool;
    }

    public final void setOpenPlatformClientKey(String str) {
        this.openPlatformClientKey = str;
    }

    public final void setOpenPlatformExtra(String str) {
        this.openPlatformExtra = str;
    }

    public final void setOpenTime(long j) {
        this.openTime = j;
    }

    public final void setOriginMusicRemoveTTS(Boolean bool) {
        this.originMusicRemoveTTS = bool;
    }

    public final void setPermissionActivityRequired(Boolean bool) {
        this.permissionActivityRequired = bool;
    }

    public final void setPhotoModeAfterCreationFeedbackMobParams(PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams) {
        this.photoModeAfterCreationFeedbackMobParams = photoModeAfterCreationFeedbackMobParams;
    }

    public final void setPhotoModeBannerMobParams(PhotoModeBannerMobParams photoModeBannerMobParams) {
        this.photoModeBannerMobParams = photoModeBannerMobParams;
    }

    public final void setPlayerPause(Boolean bool) {
        this.isPlayerPause = bool;
    }

    public final void setPoiDataJsonString(String str) {
        this.poiDataJsonString = str;
    }

    public final void setPoiEnterFrom(String str) {
        this.poiEnterFrom = str;
    }

    public final void setPoiEnterMethod(String str) {
        this.poiEnterMethod = str;
    }

    public final void setPoiExtraDataJsonString(String str) {
        this.poiExtraDataJsonString = str;
    }

    public final void setPoiPostInfoJsonString(String str) {
        this.poiPostInfoJsonString = str;
    }

    public final void setPoiShootWay(String str) {
        this.poiShootWay = str;
    }

    public final void setPostTrendsId(String str) {
        this.postTrendsId = str;
    }

    public final void setPostTrendsType(String str) {
        this.postTrendsType = str;
    }

    public final void setPreloadStringResource(int i) {
        this.preloadStringResource = i;
    }

    public final void setPrepareFilter(boolean z) {
        this.prepareFilter = z;
    }

    public final void setPresetSticker(Boolean bool) {
        this.presetSticker = bool;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setPreviousSearchQuery(String str) {
        this.previousSearchQuery = str;
    }

    public final void setPropList(String str) {
        this.propList = str;
    }

    public final void setPropResourceId(String str) {
        this.propResourceId = str;
    }

    public final void setPropResourceList(String str) {
        this.propResourceList = str;
    }

    public final void setPublishTitle(String str) {
        this.publishTitle = str;
    }

    public final void setQaOrigin(String str) {
        this.qaOrigin = str;
    }

    public final void setQaOriginGroupId(String str) {
        this.qaOriginGroupId = str;
    }

    public final void setQaStructConfig(QaStructConfig qaStructConfig) {
        this.qaStructConfig = qaStructConfig;
    }

    public final void setQuestionCategory(String str) {
        this.questionCategory = str;
    }

    public final void setRecordFromFeed(boolean z) {
        this.recordFromFeed = z;
    }

    public final void setRecordFromTab(Integer num) {
        this.recordFromTab = num;
    }

    public final void setRecordParam(String str) {
        this.recordParam = str;
    }

    public final void setRecordPresetResource(RecordPresetResource recordPresetResource) {
        this.recordPresetResource = recordPresetResource;
    }

    public final void setRelationEnterMethod(String str) {
        this.relationEnterMethod = str;
    }

    public final void setReshootConfig(ReshootConfig reshootConfig) {
        this.reshootConfig = reshootConfig;
    }

    public final void setRestoreType(int i) {
        this.restoreType = i;
    }

    public final void setReuseSoundAndEffectModel(ReuseSoundAndEffectModel reuseSoundAndEffectModel) {
        this.reuseSoundAndEffectModel = reuseSoundAndEffectModel;
    }

    public final void setSameMusicSupplyDetailPage(String str) {
        this.isSameMusicSupplyDetailPage = str;
    }

    public final void setSavedDraft(String str) {
        this.savedDraft = str;
    }

    public final void setSchemaTag(String str) {
        this.schemaTag = str;
    }

    public final void setSearchExtra(String str) {
        this.searchExtra = str;
    }

    public final void setSecretRepliesStickerParam(SecretRepliesRecordParam secretRepliesRecordParam) {
        this.secretRepliesStickerParam = secretRepliesRecordParam;
    }

    public final void setSeriesCollectionInfo(CollectionInfoParcelableForShoot collectionInfoParcelableForShoot) {
        this.seriesCollectionInfo = collectionInfoParcelableForShoot;
    }

    public final void setServiceLoadCost(long j) {
        this.serviceLoadCost = j;
    }

    public final void setShareId(String str) {
        this.shareId = str;
    }

    public final void setShareKitPanel(ShareKitPanel shareKitPanel) {
        this.shareKitPanel = shareKitPanel;
    }

    public final void setShareModel(BaseShareContext baseShareContext) {
        this.shareModel = baseShareContext;
    }

    public final void setSharedARHostId(String str) {
        this.sharedARHostId = str;
    }

    public final void setSharedARSessionId(String str) {
        this.sharedARSessionId = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShootExtraData(ShootExtraData shootExtraData) {
        this.shootExtraData = shootExtraData;
    }

    public final void setShootFrom(String str) {
        this.shootFrom = str;
    }

    public final void setShootFromViewPanelAwemeId(String str) {
        this.shootFromViewPanelAwemeId = str;
    }

    public final void setShootNativeRecvTs(long j) {
        this.shootNativeRecvTs = j;
    }

    public final void setShootPerfSessionId(String str) {
        this.shootPerfSessionId = str;
    }

    public final void setShootway(String str) {
        this.shootway = str;
    }

    public final void setShowAIAliveBanner(Boolean bool) {
        this.showAIAliveBanner = bool;
    }

    public final void setShowCancelAfterPinProp(Boolean bool) {
        this.showCancelAfterPinProp = bool;
    }

    public final void setShowPreloadingDialog(Boolean bool) {
        this.showPreloadingDialog = bool;
    }

    public final void setShowStickerPanel(boolean z) {
        this.showStickerPanel = z;
    }

    public final void setStarAtlasConfig(HashMap<String, String> map) {
        this.starAtlasConfig = map;
    }

    public final void setStartRecordTime(Long l) {
        this.startRecordTime = l;
    }

    public final void setStartScanFaceAIProfile(Boolean bool) {
        this.startScanFaceAIProfile = bool;
    }

    public final void setSticker(String str) {
        this.sticker = str;
    }

    public final void setStickerMusic(Music music) {
        this.stickerMusic = music;
    }

    public final void setStickerWithMusicFilePath(String str) {
        this.stickerWithMusicFilePath = str;
    }

    public final void setStickers(ArrayList<String> arrayList) {
        this.stickers = arrayList;
    }

    public final void setStitchParams(StitchParams stitchParams) {
        this.stitchParams = stitchParams;
    }

    public final void setSupportPrivateAlbum(Boolean bool) {
        this.supportPrivateAlbum = bool;
    }

    public final void setTabs(Integer num) {
        this.tabs = num;
    }

    public final void setTemplateBackCamera(String str) {
        this.templateBackCamera = str;
    }

    public final void setTemplateData(TemplateData templateData) {
        this.templateData = templateData;
    }

    public final void setTemplateDebugId(String str) {
        this.templateDebugId = str;
    }

    public final void setTemplateDebugType(String str) {
        this.templateDebugType = str;
    }

    public final void setThroughAnchor(boolean z) {
        this.isThroughAnchor = z;
    }

    public final void setTranslationType(Integer num) {
        this.translationType = num;
    }

    public final void setTtepPreviewEffect(Effect effect) {
        this.ttepPreviewEffect = effect;
    }

    public final void setTtepPreviewEffectId(String str) {
        this.ttepPreviewEffectId = str;
    }

    public final void setTtsVoiceIDs(ArrayList<String> arrayList) {
        this.ttsVoiceIDs = arrayList;
    }

    public final void setTtsVoiceInfo(TtsVoiceInfo ttsVoiceInfo) {
        this.ttsVoiceInfo = ttsVoiceInfo;
    }

    public final void setTtsVoiceRefIDs(ArrayList<String> arrayList) {
        this.ttsVoiceRefIDs = arrayList;
    }

    public final void setUgcTemplateTag(String str) {
        this.ugcTemplateTag = str;
    }

    public final void setUnpublishedEffect(String str) {
        this.unpublishedEffect = str;
    }

    public final void setUploadPageMultiSelect(Boolean bool) {
        this.uploadPageMultiSelect = bool;
    }

    public final void setUsedFullSong(Boolean bool) {
        this.isUsedFullSong = bool;
    }

    public final void setVcVoiceEffectId(String str) {
        this.vcVoiceEffectId = str;
    }

    public final void setVcVoiceEffectName(String str) {
        this.vcVoiceEffectName = str;
    }

    public final void setVcVoiceIDs(ArrayList<String> arrayList) {
        this.vcVoiceIDs = arrayList;
    }

    public final void setVcVoiceRefIDs(ArrayList<String> arrayList) {
        this.vcVoiceRefIDs = arrayList;
    }

    public final void setVideoDownloadDuration(Long l) {
        this.videoDownloadDuration = l;
    }

    public final void setVideoLength(Integer num) {
        this.videoLength = num;
    }

    public final void setVoiceEffectId(String str) {
        this.voiceEffectId = str;
    }

    public final void setVoiceEffectName(String str) {
        this.voiceEffectName = str;
    }

    public final void setUsedFullSong(boolean z) {
        this.usedFullSong = z;
    }
}
