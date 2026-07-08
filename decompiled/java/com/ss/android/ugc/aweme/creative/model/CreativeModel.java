package com.ss.android.ugc.aweme.creative.model;

import X.C01GW;
import X.C040H;
import X.C08MN;
import X.C09CT;
import X.C0ABO;
import X.C0FQ0;
import X.C0MND;
import X.C1429790nJJ;
import X.C1438410nXD;
import X.C1443680nfi;
import X.C1449300nom;
import X.C1697810uHb;
import X.C365950EWj;
import X.C443120HZe;
import X.C548920Lfu;
import X.C786410Ut5;
import X.C854860XgC;
import X.C855300Xgu;
import X.EnumC1405070mfR;
import X.EnumC1412640mre;
import X.EnumC1439580nZ6;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.music.context.CommerceToolsMusicContext;
import com.ss.android.ugc.aweme.commerce.tools.music.model.CommerceToolsMusicModel;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.creative.model.AICreateModel;
import com.ss.android.ugc.aweme.creative.model.AIDubbing;
import com.ss.android.ugc.aweme.creative.model.AIGCExtraModel;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.AIGroupShotTemplateModel;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.AISelfScanFaceModel;
import com.ss.android.ugc.aweme.creative.model.AYMobCacheModel;
import com.ss.android.ugc.aweme.creative.model.AigcMetadataModel;
import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel;
import com.ss.android.ugc.aweme.creative.model.AudioVolumeAdjustModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CheckPointModel;
import com.ss.android.ugc.aweme.creative.model.CollabInfoModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.CreatorModel;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.DetailPageRecallDraftModel;
import com.ss.android.ugc.aweme.creative.model.DraftBoxModel;
import com.ss.android.ugc.aweme.creative.model.EditPageRestoreActivityModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.EffectDataTransport;
import com.ss.android.ugc.aweme.creative.model.EffectShowModel;
import com.ss.android.ugc.aweme.creative.model.FeedPropPinModel;
import com.ss.android.ugc.aweme.creative.model.FilterModel;
import com.ss.android.ugc.aweme.creative.model.GpsConsumingOptModel;
import com.ss.android.ugc.aweme.creative.model.GreenScreenEffectModel;
import com.ss.android.ugc.aweme.creative.model.HDRModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionExperimentInformation;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.LiveModel;
import com.ss.android.ugc.aweme.creative.model.LoadMusicAndEffectModel;
import com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel;
import com.ss.android.ugc.aweme.creative.model.MdpInfoModel;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.MinisGameModel;
import com.ss.android.ugc.aweme.creative.model.MirrorMode;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.NewBackgroundVideoPipelineModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import com.ss.android.ugc.aweme.creative.model.PcsCourseVideoModel;
import com.ss.android.ugc.aweme.creative.model.PhotoModeEditingStage;
import com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.creative.model.PublishItemTrackModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.ReuseAwemeTTSAndVCRefIDsModel;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.creative.model.SchedulePostTime;
import com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.TemplateAnchorData;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.TemplateDynamicSlotModel;
import com.ss.android.ugc.aweme.creative.model.TemplateSchemaData;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.VEBytevc1Model;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.VolumeInfoModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCWorkflowModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AIAliveRestoreData;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay;
import com.ss.android.ugc.aweme.creative.model.ailive.NewPromptPageModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PageDataCache;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.album.AlbumMobModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumOpenApiModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.audio.AudioAECModel;
import com.ss.android.ugc.aweme.creative.model.audio.AudioLoudnessModel;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVcTTSModel;
import com.ss.android.ugc.aweme.creative.model.audio.InstantCloneConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.audio.OriginalSoundModel;
import com.ss.android.ugc.aweme.creative.model.audio.TTSModel;
import com.ss.android.ugc.aweme.creative.model.audio.TTSStickerModel;
import com.ss.android.ugc.aweme.creative.model.beauty.BeautyModel;
import com.ss.android.ugc.aweme.creative.model.conflicts.RecordConflictsModel;
import com.ss.android.ugc.aweme.creative.model.countdown.CountDownModel;
import com.ss.android.ugc.aweme.creative.model.creation.CreationTypeModel;
import com.ss.android.ugc.aweme.creative.model.creation.FFDEventReport;
import com.ss.android.ugc.aweme.creative.model.creatorapp.CreatorAppModel;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.duet.DuetModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditBackSaveModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditPhotoModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditVideoEnhanceModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SoundSyncModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.VideoImageSeparateSwitchModel;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverMobModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundSchemaModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AiPlaygroundCameraModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorTabAlbumAICreate;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.creative.model.extra.CustomParcelableExtraInfo;
import com.ss.android.ugc.aweme.creative.model.filter.RecordFilterModel;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;
import com.ss.android.ugc.aweme.creative.model.landscape.LandscapeVideoModel;
import com.ss.android.ugc.aweme.creative.model.live.GamePoiModel;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.creative.model.migrate.MigrateModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.StickPointModel;
import com.ss.android.ugc.aweme.creative.model.photomode.ImagePublishBackSaveModel;
import com.ss.android.ugc.aweme.creative.model.photomode.ImagePublishModel;
import com.ss.android.ugc.aweme.creative.model.photomode.VoiceInputMobModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.AIRewriteModel;
import com.ss.android.ugc.aweme.creative.model.photomode.template.ImageEffectTemplateReuseData;
import com.ss.android.ugc.aweme.creative.model.platform.OpenPlatformModel;
import com.ss.android.ugc.aweme.creative.model.poi.PoiLynxInfoModel;
import com.ss.android.ugc.aweme.creative.model.product.ProductRecommendModel;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PrePublishStatusModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishMobParams;
import com.ss.android.ugc.aweme.creative.model.publish.PublishModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishSecureModel;
import com.ss.android.ugc.aweme.creative.model.publish.SparkPublishModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.FlashModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordData;
import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;
import com.ss.android.ugc.aweme.creative.model.record.ShootLinkPerfMobModel;
import com.ss.android.ugc.aweme.creative.model.restore.RestoreModel;
import com.ss.android.ugc.aweme.creative.model.search.CreationSearchModel;
import com.ss.android.ugc.aweme.creative.model.social.SocialModel;
import com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.PovModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchModel;
import com.ss.android.ugc.aweme.creative.model.story.StoryEditModel;
import com.ss.android.ugc.aweme.creative.model.story.StoryStreakStickerState;
import com.ss.android.ugc.aweme.creative.model.story.StreaksData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramTempModel;
import com.ss.android.ugc.aweme.creative.model.template.MvModel;
import com.ss.android.ugc.aweme.creative.model.tns.AnsaPromptModel;
import com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.edit.TextPublishUploadModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPreviewInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.upload.StoryPublishNetworkInfo;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.aweme.sticker.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CreativeModel implements Parcelable, C0FQ0 {

    @C09CT("ai_chat_gen_model")
    public AIChatGenModel aiChatGenModel;

    @C09CT("ai_cover_mob_model")
    public AICoverMobModel aiCoverMobModel;

    @C09CT("ai_create_model")
    public AICreateModel aiCreateModel;

    @C09CT("enable_video_ai_translate")
    public AIDubbing aiDubbing;

    @C09CT("ai_live_photo")
    public AILivePhotoModel aiLivePhotoModel;

    @C09CT("ai_self_model")
    public final AISelfModel aiSelfModel;

    @C040H
    public final AISelfScanFaceModel aiSelfScanFaceModel;

    @C09CT("aigc_business_model_set")
    public final AIGCBusinessModelSet aigcBusinessModel;

    @C09CT("aigc_extra_model")
    public AIGCExtraModel aigcExtraModel;

    @C09CT("aigc_metadata_model")
    public AigcMetadataModel aigcMetadataModel;

    @C09CT("aigc_offline_model")
    public AIGCOfflineModel aigcOfflineModel;

    @C09CT("aigc_workflow_model")
    public AIGCWorkflowModel aigcWorkflowModel;

    @C040H
    public AlbumMobModel albumMobModel;

    @C09CT("album_model")
    public AlbumModel albumModel;

    @C040H
    public AlbumOpenApiModel albumOpenApiModel;

    @C040H
    public AnsaPromptModel ansaPromptModel;

    @C09CT("async_funcs_list")
    public String asyncFuncList;

    @C040H
    public String asyncSource;

    @C040H
    public Integer asyncStatus;

    @C09CT("async_task_count")
    public Integer asyncTaskCount;

    @C09CT("async_tasks_id")
    public List<String> asyncTaskIds;

    @C040H
    public AudioAECModel audioAECModel;

    @C09CT("algorithm_on_off")
    public AudioAlgorithmModel audioAlgorithmModel;

    @C09CT("audio_copyright_detect_model")
    public AudioCopyrightDetectModel audioCopyrightDetectModel;

    @C040H
    public AudioLoudnessModel audioLoudnessModel;

    @C09CT("volume_adjustment")
    public AudioVolumeAdjustModel audioVolumeAdjustModel;

    @C09CT("autocut_anchor_data")
    public AutoCutAnchorModel autoCutAnchorModel;

    @C09CT("autocut_data")
    public AutoCutModel autoCutModel;

    @C09CT("autopick_data")
    public AutoPickModel autoPickModel;

    @C09CT("ay_mob_cache_model")
    public final AYMobCacheModel ayMobCacheModel;

    @C09CT("beauty_model")
    public BeautyModel beautyModel;

    @C040H
    public final VEBytevc1Model bytevcVC1Model;

    @C09CT("camera_layout_model")
    public CameraLayoutModel cameraLayoutModel;

    @C040H
    public CanvasVideoData canvasVideoData;

    @C09CT("capcut_vc_tts")
    public CapcutVcTTSModel capcutVcTTSModel;

    @C09CT("celebration_model")
    public CelebrationData celebrationData;

    @C040H
    public String challengeId;

    @C09CT("change_avatar_model")
    public ChangeAvatarModel changeAvatarModel;

    @C09CT("check_point_model")
    public final CheckPointModel checkPointModel;

    @C09CT("collab_user_info")
    public CollabInfoModel collabInfoModel;

    @C040H
    public transient C0MND commentForwardModel;

    @C09CT("commerce_model")
    public CommerceToolsModel commerceModel;

    @C09CT("common_mob")
    public CommonMobParamModel commonMobModel;

    @C040H
    public long conversionRateTime;

    @C09CT("count_down_model")
    public CountDownModel countDownModel;

    @C040H
    public CoverPublishModel coverPublishModel;

    @C09CT("creation_search_model")
    public CreationSearchModel creationSearchModel;

    @C040H
    public CreationTypeModel creationTypeModel;

    @C040H
    public CreativeFlowData creativeFlowData;

    @C040H
    public CreativeInfo creativeInfo;

    @C040H
    public CreatorAppModel creatorAppModel;

    @C040H
    public CreatorModel creatorModel;

    @C040H
    public CustomParcelableExtraInfo customParcelableExtraInfo;

    @C040H
    public Cut2EditTransferModel cut2EditTransferModel;

    @C09CT("cut_same_model")
    public CutSameModel cutSameModel;

    @C09CT("declaration_model")
    public DeclarationModel declarationModel;

    @C040H
    public int defaultCameraSpec;

    @C040H
    public Boolean defaultEnableMP4Encoding;

    @C040H
    public DetailPageRecallDraftModel detailPageRecallDraftModel;

    @C09CT("dm_group_shot_template")
    public AIGroupShotTemplateModel dmGroupShotTemplateModel;

    @C040H
    public DMMediaModel dmMediaModel;

    @C09CT("draft_box_model")
    public DraftBoxModel draftBoxModel;

    @C09CT("draft_info_model")
    public DraftInfoModel draftInfoModel;

    @C09CT("duet_model")
    public final DuetModel duetModel;

    @C09CT("edit_back_save_model")
    public EditBackSaveModel editBackSaveModel;

    @C09CT("edit_effect_model")
    public EditEffectModel editEffectModel;

    @C040H
    public EditModel editModel;

    @C09CT("edit_page_restore_activity_model")
    public final EditPageRestoreActivityModel editPageRestoreActivityModel;

    @C09CT("edit_photo_model")
    public EditPhotoModel editPhotoModel;

    @C09CT("edit_post")
    public EditPostModel editPostModel;

    @C040H
    public EditSaveLocalModel editSaveLocalModel;

    @C09CT("edit_sticker_model")
    public EditStickerModel editStickerModel;

    @C040H
    public EditVideoEnhanceModel editVideoEnhanceModel;

    @C09CT("editor_pro_aigc_info")
    public EditorProAIGCInfoModel editorProAIGCInfoModel;

    @C09CT("editor_pro_draft_model")
    public EditorProDraftModel editorProDraftModel;

    @C09CT("editor_pro_schema_model")
    public EditorProSchemeModel editorProSchemeModel;

    @C040H
    public String effectCarouselAction;

    @C040H
    public int effectCarouselIndex;

    @C09CT("effect_data")
    public EffectDataTransport effectData;

    @C040H
    public String effectEntrancePosition;

    @C09CT("enter_from_h5_type")
    public String enterFromH5Type;

    @C09CT("event_data")
    public EventData eventData;

    @C040H
    public ExtractFramesModel extractFramesModel;

    @C09CT("fail_flag")
    public String failFlag;

    @C09CT("feed_prop_pin_model")
    public FeedPropPinModel feedPropPinModel;

    @C040H
    public FFDEventReport ffdEventReport;

    @C09CT("filter_model")
    public FilterModel filterModel;

    @C09CT("record_flash_model")
    public FlashModel flashModel;

    @C09CT("follow_up_publish_tracker_model")
    public final FollowUpPublishTrackerModel followUpPublishTrackerModel;

    @C09CT("game_poi_model")
    public GamePoiModel gamePoiModel;

    @C040H
    public GpsConsumingOptModel gpsConsumingOptModel;

    @C09CT("green_screen_effect_model")
    public GreenScreenEffectModel greenScreenEffectModel;

    @C040H
    public String groupId;

    @C040H
    public final HDRModel hdrModel;

    @C09CT("if_record_with_headset")
    public boolean ifRecordWithHeadset;

    @C040H
    public ImageAlbumData imageAlbumModel;

    @C040H
    public ImageEditModel imageEditModel;

    @C09CT("image_effect_template_reuse_data")
    public ImageEffectTemplateReuseData imageEffectTemplateData;

    @C09CT("image_publish_back_save_model")
    public ImagePublishBackSaveModel imagePublishBackSaveModel;

    @C040H
    public ImagePublishModel imagePublishModel;

    @C040H
    public ImportModel importModel;

    @C040H
    public InfoStickerCategoryParams infoStickerCategoryParams;

    @C040H
    public InfoStickerModel infoStickerModel;

    @C09CT("initial_input_model")
    public CreativeInitialModel initialModel;

    @C09CT("inline_caption_experiment_group")
    public InlineCaptionExperimentInformation inlineCaptionExperimentInformation;

    @C09CT("inline_caption_model")
    public InlineCaptionModel inlineCaptionModel;

    @C09CT("instant_clone_consumption_model")
    public InstantCloneConsumptionModel instantCloneConsumption;

    @C040H
    public boolean isAsyncTaskFailed;

    @C040H
    public boolean isCopiedModel;

    @C09CT("is_from_edit_tab")
    public boolean isFromEditTab;

    @C09CT("is_from_edit_tab_upload")
    public boolean isFromEditTabUpload;

    @C040H
    public boolean isInStoryTab;

    @C040H
    public Boolean isTextModeWhenInit;

    @C09CT("landing_model")
    public final LandingModel landingModel;

    @C09CT("landscape_video_model")
    public LandscapeVideoModel landscapeVideoModel;

    @C040H
    public LiveModel liveModel;

    @C09CT("live_photo_model")
    public LivePhotoModel livePhotoModel;

    @C09CT("live_record_model")
    public LiveRecordModel liveRecordModel;

    @C040H
    public LoadMusicAndEffectModel loadMusicAndEffectModel;

    @C09CT("loudness_balance")
    public LoudnessBalanceModel loudnessBalanceModel;

    @C09CT("restore_type")
    public int mRestoreType;

    @C09CT("magic_combine_effect_model")
    public MagicCombineEffectModel magicCombineEffectModel;

    @C09CT("mdp_shoot_info_model")
    public MdpInfoModel mdpInfoModel;

    @C040H
    public final C1443680nfi mecReportModel;

    @C09CT("media_location_meta_data_list")
    public List<MediaLocationMetaDataModel> mediaLocationMetaDataList;

    @C09CT("mic_data_model")
    public final MicDataModel micDataModel;

    @C040H
    public MicroAppModel microAppModel;

    @C09CT("migrate_model")
    public MigrateModel migrateModel;

    @C09CT("mini_game_data")
    public MinisGameModel miniGameData;

    @C09CT("mirror_mode")
    public MirrorMode mirrorMode;

    @C09CT("mix_editing_model")
    public MixEditingModel mixEditingModel;

    @C09CT("imagine_sticker_info")
    public MixStickerInfo mixStickerInfo;

    @C09CT("mobile_effects_2")
    public MobileEffectsModel2 mobileEffectsModel2;

    @C09CT("music_and_time_mode")
    public MusicAndTimeModel musicAndTimeModel;

    @C09CT("music_business_model")
    public MusicBuzModel musicBuzModel;

    @C09CT("music_share_story")
    public MusicShareStoryData musicShareStoryData;

    @C09CT("music_volume_info_model")
    public final MusicVolumeInfoModel musicVolumeInfoModel;

    @C09CT("mv_model")
    public MvModel mvModel;

    @C09CT("new_green_screen_effect_model")
    public NewGreenScreenEffectModel newGreenScreenEffectModel;

    @C040H
    public NewBackgroundVideoPipelineModel newVideoPipelineExtraModel;

    @C09CT("nle_info_model")
    public NLEInfoModel nleInfoModel;

    @C09CT("nows_data")
    public NowsShootModel nowsShootModel;

    @C09CT("on_this_day")
    public final OnThisDayData onThisDayData;

    @C09CT("open_platform_model")
    public OpenPlatformModel openPlatformModel;

    @C040H
    public OriginalSoundModel originalSoundModel;

    @C09CT("paid_content_video_model")
    public PaidContentVideoModel paidContentModel;

    @C040H
    public PcsCourseVideoModel pcsPaidVideoMediaModel;

    @C040H
    public ImageAlbumData photoModeAutoCutModel;

    @C09CT("photo_mode_enter_editing_stage")
    public PhotoModeEditingStage photoModeEnterEditingStage;

    @C09CT("photo_mode_template_data")
    public PhotoModeTemplateData photoModeTemplateData;

    @C09CT("photo_template_info")
    public PhotoTemplateInfo photoTemplateInfo;

    @C040H
    public PoiData poiData;

    @C040H
    public C443120HZe<PoiData, Integer, String> poiDataFromLynx;

    @C09CT("poi_lynx_info_model")
    public PoiLynxInfoModel poiLynxInfoModel;

    @C09CT("poi_mob_params")
    public PoiMobParam poiMobParams;

    @C09CT("poi_post_info")
    public PoiData poiPostDataFromSchema;

    @C09CT("post_landing_model")
    public PostLandingModel postLandingModel;

    @C09CT("post_page_model")
    public PostPageModel postPageModel;

    @C09CT("pov_model")
    public PovModel povModel;

    @C040H
    public PrePublishStatusModel prePublishStatusModel;

    @C09CT("privacy_setting")
    public PrivacySettingModel privacySettingModel;

    @C09CT("product_path")
    public String productPath;

    @C09CT("product_recommend_model")
    public ProductRecommendModel productRecommendModel;

    @C040H
    public C1449300nom propETGroupModel;

    @C09CT("prop_from_group_model")
    public PropFromGroupModel propFromGroupModel;

    @C09CT("prop_effect_show_model")
    public final EffectShowModel propShowModel;

    @C09CT("publish_cover_model")
    public PublishCustomCoverModel publishCustomCoverModel;

    @C040H
    public PublishItemTrackModel publishItemTrackModel;

    @C09CT("publish_mob_params")
    public final PublishMobParams publishMobParams;

    @C09CT("publish_model")
    public final PublishModel publishModel;

    @C09CT("publish_preview_model")
    public final PublishPreviewModel publishPreviewModel;

    @C09CT("publish_secure_model")
    public PublishSecureModel publishSecureModel;

    @C09CT("pugc_template_data")
    public PUgcTemplateData pugcTemplateData;

    @C09CT("quick_grid_model")
    public QuickGridModel quickGridModel;

    @C040H
    public C1429790nJJ quickPostOnEditPageModel;

    @C040H
    public final RecordConflictsModel recordConflictsModel;

    @C09CT("record_data")
    public RecordData recordData;

    @C09CT("record_downgrade_model")
    public final RecordDowngradeModel recordDowngradeModel;

    @C09CT("record_effect_model")
    public final RecordEffectModel recordEffectModel;

    @C09CT("record_filter_model")
    public RecordFilterModel recordFilterModel;

    @C09CT("record_mob_model")
    public RecordMobModel recordMobModel;

    @C040H
    public RestoreModel restoreModel;

    @C09CT("tts_and_vc_ref_ids")
    public ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;

    @C040H
    public ReuseSoundAndEffectModel reuseSoundAndEffectModel;

    @C09CT("schedule_time")
    public SchedulePostTime scheduleTime;

    @C040H
    public String shootEnterFrom;

    @C040H
    public ShootLinkPerfMobModel shootLinkPerfMobModel;

    @C040H
    public C855300Xgu shortcutPublishStatusModel;

    @C09CT("social_model")
    public SocialModel socialModel;

    @C09CT("sound_effect_info_model")
    public final SoundEffectInfoModel soundEffectInfoModel;

    @C09CT("sound_sync_model")
    public SoundSyncModel soundSyncModel;

    @C09CT("spark_publish_model")
    public final SparkPublishModel sparkPublishModel;

    @C040H
    public StickPointModel stickPointModel;

    @C09CT("sticker_model")
    public StickerNewEngineModel stickerModel;

    @C09CT("stitch_model")
    public final StitchModel stitchModel;

    @C040H
    public StoryEditModel storyEditModel;

    @C09CT("story_event_sticker_model")
    public StorySocialEventStickerModel storyEventStickerData;

    @C09CT("story_model")
    public StoryShootModel storyModel;

    @C040H
    public StoryPublishNetworkInfo storyPublishNetworkInfo;

    @C09CT("streaks_data")
    public StreaksData streaksData;

    @C09CT("stream_voice_conversion")
    public StreamVoiceConversionModel streamVoiceConversionModel;

    @C09CT("success_flag")
    public String successFlag;

    @C09CT("tangram_persistence_model")
    public TangramPersistenceModel tangramPersistenceModel;

    @C040H
    public TangramTempModel tangramTempModel;

    @C09CT("template_anchor_data")
    public TemplateAnchorData templateAnchorData;

    @C09CT("template_consume_data")
    public TemplateConsumeData templateConsumeData;

    @C040H
    public TemplateData templateData;

    @C040H
    public String templateDebugId;

    @C040H
    public String templateDebugType;

    @C09CT("template_dynamic_slot_model")
    public TemplateDynamicSlotModel templateDynamicSlotModel;

    @C09CT("template_schema_data")
    public TemplateSchemaData templateSchemaData;

    @C09CT("text_2_image_model")
    public final Text2ImageModel text2ImageModel;

    @C09CT("text_publish_upload_model")
    public TextPublishUploadModel textPublishUploadModel;

    @C040H
    public boolean toAiSelfTab;

    @C040H
    public boolean toUploadAlbum;

    @C040H
    public final C854860XgC transientPostPageModel;

    @C09CT("trending_data")
    public TrendingUploadModel trendingUploadModel;

    @C040H
    public TTStoryUploadModel ttStoryUploadModel;

    @C09CT("text_to_speech")
    public TTSModel ttsModel;

    @C040H
    public TTSStickerModel ttsStickerModel;

    @C09CT("tts_reuse_model")
    public TtsVoiceInfo ttsVoiceInfo;

    @C040H
    public TTSVoiceModel ttsVoiceModel;

    @C09CT("ugc_template_data")
    public UgcTemplateData ugcTemplateData;

    @C040H
    public AVUploadMiscInfoStruct uploadMiscInfoStruct;

    @C040H
    public AudioEffectParam veAudioEffectParam;

    @C040H
    public Video2StickerModel video2StickerModel;

    @C040H
    public String videoDetectionRiskInfo;

    @C09CT("video_image_separate_switch_model")
    public VideoImageSeparateSwitchModel videoImageSeparateSwitchModel;

    @C09CT("voice_conversion")
    public VoiceConversionModel voiceConversionModel;

    @C09CT("volume_info_model")
    public final VolumeInfoModel volumeInfoModel;

    @C040H
    public transient Workspace workspace;
    public static final C1438410nXD Companion = new Object() { // from class: X.0nXD
    };
    public static final Parcelable.Creator<CreativeModel> CREATOR = new Parcelable.Creator<CreativeModel>() { // from class: X.0nWG
        @Override // android.os.Parcelable.Creator
        public final CreativeModel createFromParcel(Parcel parcel) {
            MusicAndTimeModel musicAndTimeModelCreateFromParcel;
            CutSameModel cutSameModelCreateFromParcel;
            Cut2EditTransferModel cut2EditTransferModelCreateFromParcel;
            ImageAlbumData imageAlbumDataCreateFromParcel;
            StoryPublishNetworkInfo storyPublishNetworkInfoCreateFromParcel;
            boolean z;
            NowsShootModel nowsShootModelCreateFromParcel;
            DMMediaModel dMMediaModelCreateFromParcel;
            PcsCourseVideoModel pcsCourseVideoModelCreateFromParcel;
            SchedulePostTime schedulePostTimeCreateFromParcel;
            AIDubbing aIDubbingCreateFromParcel;
            InlineCaptionModel inlineCaptionModelCreateFromParcel;
            InlineCaptionExperimentInformation inlineCaptionExperimentInformationCreateFromParcel;
            PhotoTemplateInfo photoTemplateInfoCreateFromParcel;
            TemplateDynamicSlotModel templateDynamicSlotModelCreateFromParcel;
            EditPostModel editPostModelCreateFromParcel;
            Video2StickerModel video2StickerModelCreateFromParcel;
            CelebrationData celebrationDataCreateFromParcel;
            PublishItemTrackModel publishItemTrackModelCreateFromParcel;
            TTStoryUploadModel tTStoryUploadModelCreateFromParcel;
            TextPublishUploadModel textPublishUploadModelCreateFromParcel;
            CustomParcelableExtraInfo customParcelableExtraInfoCreateFromParcel;
            TangramTempModel tangramTempModelCreateFromParcel;
            TangramPersistenceModel tangramPersistenceModelCreateFromParcel;
            AICreateModel aICreateModelCreateFromParcel;
            ArrayList arrayList;
            CreatorAppModel creatorAppModelCreateFromParcel;
            AIGroupShotTemplateModel aIGroupShotTemplateModelCreateFromParcel;
            MinisGameModel minisGameModelCreateFromParcel;
            boolean z2;
            boolean z3;
            Integer numValueOf;
            boolean z4;
            Integer numValueOf2;
            LivePhotoModel livePhotoModelCreateFromParcel;
            CameraLayoutModel cameraLayoutModelCreateFromParcel;
            AIChatGenModel aIChatGenModelCreateFromParcel;
            CreationSearchModel creationSearchModelCreateFromParcel;
            VideoImageSeparateSwitchModel videoImageSeparateSwitchModelCreateFromParcel;
            QuickGridModel quickGridModelCreateFromParcel;
            DeclarationModel declarationModelCreateFromParcel;
            LiveModel liveModelCreateFromParcel;
            PovModel povModelCreateFromParcel;
            AlbumOpenApiModel albumOpenApiModelCreateFromParcel;
            CreativeInitialModel creativeInitialModelCreateFromParcel = CreativeInitialModel.CREATOR.createFromParcel(parcel);
            EventData eventDataCreateFromParcel = EventData.CREATOR.createFromParcel(parcel);
            RecordData recordDataCreateFromParcel = RecordData.CREATOR.createFromParcel(parcel);
            RecordEffectModel recordEffectModelCreateFromParcel = RecordEffectModel.CREATOR.createFromParcel(parcel);
            LoadMusicAndEffectModel loadMusicAndEffectModelCreateFromParcel = LoadMusicAndEffectModel.CREATOR.createFromParcel(parcel);
            RecordDowngradeModel recordDowngradeModelCreateFromParcel = RecordDowngradeModel.CREATOR.createFromParcel(parcel);
            ReuseSoundAndEffectModel reuseSoundAndEffectModelCreateFromParcel = ReuseSoundAndEffectModel.CREATOR.createFromParcel(parcel);
            AYMobCacheModel aYMobCacheModelCreateFromParcel = AYMobCacheModel.CREATOR.createFromParcel(parcel);
            LandingModel landingModelCreateFromParcel = LandingModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                musicAndTimeModelCreateFromParcel = null;
            } else {
                musicAndTimeModelCreateFromParcel = MusicAndTimeModel.CREATOR.createFromParcel(parcel);
            }
            MusicAndTimeModel musicAndTimeModel = musicAndTimeModelCreateFromParcel;
            FlashModel flashModelCreateFromParcel = FlashModel.CREATOR.createFromParcel(parcel);
            BeautyModel beautyModelCreateFromParcel = BeautyModel.CREATOR.createFromParcel(parcel);
            CountDownModel countDownModelCreateFromParcel = CountDownModel.CREATOR.createFromParcel(parcel);
            RecordMobModel recordMobModelCreateFromParcel = RecordMobModel.CREATOR.createFromParcel(parcel);
            ShootLinkPerfMobModel shootLinkPerfMobModelCreateFromParcel = ShootLinkPerfMobModel.CREATOR.createFromParcel(parcel);
            AlbumModel albumModelCreateFromParcel = AlbumModel.CREATOR.createFromParcel(parcel);
            GreenScreenEffectModel greenScreenEffectModelCreateFromParcel = GreenScreenEffectModel.CREATOR.createFromParcel(parcel);
            NewGreenScreenEffectModel newGreenScreenEffectModel = (NewGreenScreenEffectModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
            ImportModel importModelCreateFromParcel = ImportModel.CREATOR.createFromParcel(parcel);
            AlbumMobModel albumMobModelCreateFromParcel = AlbumMobModel.CREATOR.createFromParcel(parcel);
            VolumeInfoModel volumeInfoModelCreateFromParcel = VolumeInfoModel.CREATOR.createFromParcel(parcel);
            MusicVolumeInfoModel musicVolumeInfoModelCreateFromParcel = MusicVolumeInfoModel.CREATOR.createFromParcel(parcel);
            SoundEffectInfoModel soundEffectInfoModelCreateFromParcel = SoundEffectInfoModel.CREATOR.createFromParcel(parcel);
            MusicBuzModel musicBuzModelCreateFromParcel = MusicBuzModel.CREATOR.createFromParcel(parcel);
            MdpInfoModel mdpInfoModelCreateFromParcel = MdpInfoModel.CREATOR.createFromParcel(parcel);
            StickPointModel stickPointModelCreateFromParcel = StickPointModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                cutSameModelCreateFromParcel = null;
            } else {
                cutSameModelCreateFromParcel = CutSameModel.CREATOR.createFromParcel(parcel);
            }
            CutSameModel cutSameModel = cutSameModelCreateFromParcel;
            EditModel editModelCreateFromParcel = EditModel.CREATOR.createFromParcel(parcel);
            CanvasVideoData canvasVideoData = (CanvasVideoData) parcel.readSerializable();
            EditEffectModel editEffectModelCreateFromParcel = EditEffectModel.CREATOR.createFromParcel(parcel);
            EditBackSaveModel editBackSaveModelCreateFromParcel = EditBackSaveModel.CREATOR.createFromParcel(parcel);
            NLEInfoModel nLEInfoModelCreateFromParcel = NLEInfoModel.CREATOR.createFromParcel(parcel);
            EditStickerModel editStickerModelCreateFromParcel = EditStickerModel.CREATOR.createFromParcel(parcel);
            EditorProAIGCInfoModel editorProAIGCInfoModelCreateFromParcel = EditorProAIGCInfoModel.CREATOR.createFromParcel(parcel);
            InfoStickerModel infoStickerModel = (InfoStickerModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
            InfoStickerCategoryParams infoStickerCategoryParams = (InfoStickerCategoryParams) parcel.readParcelable(CreativeModel.class.getClassLoader());
            EditVideoEnhanceModel editVideoEnhanceModelCreateFromParcel = EditVideoEnhanceModel.CREATOR.createFromParcel(parcel);
            EditSaveLocalModel editSaveLocalModelCreateFromParcel = EditSaveLocalModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                cut2EditTransferModelCreateFromParcel = null;
            } else {
                cut2EditTransferModelCreateFromParcel = Cut2EditTransferModel.CREATOR.createFromParcel(parcel);
            }
            Cut2EditTransferModel cut2EditTransferModel = cut2EditTransferModelCreateFromParcel;
            EditPageRestoreActivityModel editPageRestoreActivityModelCreateFromParcel = EditPageRestoreActivityModel.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            CreationTypeModel creationTypeModelCreateFromParcel = CreationTypeModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                imageAlbumDataCreateFromParcel = null;
            } else {
                imageAlbumDataCreateFromParcel = ImageAlbumData.CREATOR.createFromParcel(parcel);
            }
            ImageAlbumData imageAlbumData = imageAlbumDataCreateFromParcel;
            EditPhotoModel editPhotoModelCreateFromParcel = EditPhotoModel.CREATOR.createFromParcel(parcel);
            ImageEditModel imageEditModelCreateFromParcel = ImageEditModel.CREATOR.createFromParcel(parcel);
            AICoverMobModel aICoverMobModelCreateFromParcel = AICoverMobModel.CREATOR.createFromParcel(parcel);
            ImagePublishModel imagePublishModelCreateFromParcel = ImagePublishModel.CREATOR.createFromParcel(parcel);
            ImagePublishBackSaveModel imagePublishBackSaveModelCreateFromParcel = ImagePublishBackSaveModel.CREATOR.createFromParcel(parcel);
            SoundSyncModel soundSyncModelCreateFromParcel = SoundSyncModel.CREATOR.createFromParcel(parcel);
            FilterModel filterModelCreateFromParcel = FilterModel.CREATOR.createFromParcel(parcel);
            RecordFilterModel recordFilterModelCreateFromParcel = RecordFilterModel.CREATOR.createFromParcel(parcel);
            MirrorMode mirrorModeCreateFromParcel = MirrorMode.CREATOR.createFromParcel(parcel);
            DuetModel duetModelCreateFromParcel = DuetModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            StitchModel stitchModelCreateFromParcel = StitchModel.CREATOR.createFromParcel(parcel);
            MobileEffectsModel2 mobileEffectsModel2CreateFromParcel = MobileEffectsModel2.CREATOR.createFromParcel(parcel);
            PrePublishStatusModel prePublishStatusModelCreateFromParcel = PrePublishStatusModel.CREATOR.createFromParcel(parcel);
            PostPageModel postPageModelCreateFromParcel = PostPageModel.CREATOR.createFromParcel(parcel);
            FollowUpPublishTrackerModel followUpPublishTrackerModelCreateFromParcel = FollowUpPublishTrackerModel.CREATOR.createFromParcel(parcel);
            PostLandingModel postLandingModelCreateFromParcel = PostLandingModel.CREATOR.createFromParcel(parcel);
            PublishPreviewModel publishPreviewModelCreateFromParcel = PublishPreviewModel.CREATOR.createFromParcel(parcel);
            PublishModel publishModelCreateFromParcel = PublishModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                storyPublishNetworkInfoCreateFromParcel = null;
            } else {
                storyPublishNetworkInfoCreateFromParcel = StoryPublishNetworkInfo.CREATOR.createFromParcel(parcel);
            }
            StoryPublishNetworkInfo storyPublishNetworkInfo = storyPublishNetworkInfoCreateFromParcel;
            PublishSecureModel publishSecureModelCreateFromParcel = PublishSecureModel.CREATOR.createFromParcel(parcel);
            SparkPublishModel sparkPublishModelCreateFromParcel = SparkPublishModel.CREATOR.createFromParcel(parcel);
            Text2ImageModel text2ImageModelCreateFromParcel = Text2ImageModel.CREATOR.createFromParcel(parcel);
            PublishCustomCoverModel publishCustomCoverModelCreateFromParcel = PublishCustomCoverModel.CREATOR.createFromParcel(parcel);
            PublishMobParams publishMobParamsCreateFromParcel = PublishMobParams.CREATOR.createFromParcel(parcel);
            CoverPublishModel coverPublishModel = (CoverPublishModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
            DraftInfoModel draftInfoModelCreateFromParcel = DraftInfoModel.CREATOR.createFromParcel(parcel);
            MicDataModel micDataModelCreateFromParcel = MicDataModel.CREATOR.createFromParcel(parcel);
            CheckPointModel checkPointModelCreateFromParcel = CheckPointModel.CREATOR.createFromParcel(parcel);
            LoudnessBalanceModel loudnessBalanceModelCreateFromParcel = LoudnessBalanceModel.CREATOR.createFromParcel(parcel);
            AudioAlgorithmModel audioAlgorithmModelCreateFromParcel = AudioAlgorithmModel.CREATOR.createFromParcel(parcel);
            AudioVolumeAdjustModel audioVolumeAdjustModelCreateFromParcel = AudioVolumeAdjustModel.CREATOR.createFromParcel(parcel);
            AudioCopyrightDetectModel audioCopyrightDetectModelCreateFromParcel = AudioCopyrightDetectModel.CREATOR.createFromParcel(parcel);
            VoiceConversionModel voiceConversionModelCreateFromParcel = VoiceConversionModel.CREATOR.createFromParcel(parcel);
            ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModelCreateFromParcel = ReuseAwemeTTSAndVCRefIDsModel.CREATOR.createFromParcel(parcel);
            TtsVoiceInfo ttsVoiceInfo = (TtsVoiceInfo) parcel.readSerializable();
            InstantCloneConsumptionModel instantCloneConsumptionModelCreateFromParcel = InstantCloneConsumptionModel.CREATOR.createFromParcel(parcel);
            MixEditingModel mixEditingModelCreateFromParcel = MixEditingModel.CREATOR.createFromParcel(parcel);
            TTSModel tTSModelCreateFromParcel = TTSModel.CREATOR.createFromParcel(parcel);
            CapcutVcTTSModel capcutVcTTSModelCreateFromParcel = CapcutVcTTSModel.CREATOR.createFromParcel(parcel);
            StreamVoiceConversionModel streamVoiceConversionModelCreateFromParcel = StreamVoiceConversionModel.CREATOR.createFromParcel(parcel);
            AudioEffectParam audioEffectParam = (AudioEffectParam) parcel.readParcelable(CreativeModel.class.getClassLoader());
            OriginalSoundModel originalSoundModelCreateFromParcel = OriginalSoundModel.CREATOR.createFromParcel(parcel);
            TTSVoiceModel tTSVoiceModel = (TTSVoiceModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
            TTSStickerModel tTSStickerModelCreateFromParcel = TTSStickerModel.CREATOR.createFromParcel(parcel);
            AudioAECModel audioAECModelCreateFromParcel = AudioAECModel.CREATOR.createFromParcel(parcel);
            AudioLoudnessModel audioLoudnessModelCreateFromParcel = AudioLoudnessModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                nowsShootModelCreateFromParcel = null;
            } else {
                nowsShootModelCreateFromParcel = NowsShootModel.CREATOR.createFromParcel(parcel);
            }
            NowsShootModel nowsShootModel = nowsShootModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                dMMediaModelCreateFromParcel = null;
            } else {
                dMMediaModelCreateFromParcel = DMMediaModel.CREATOR.createFromParcel(parcel);
            }
            DMMediaModel dMMediaModel = dMMediaModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                pcsCourseVideoModelCreateFromParcel = null;
            } else {
                pcsCourseVideoModelCreateFromParcel = PcsCourseVideoModel.CREATOR.createFromParcel(parcel);
            }
            PcsCourseVideoModel pcsCourseVideoModel = pcsCourseVideoModelCreateFromParcel;
            EffectDataTransport effectDataTransportCreateFromParcel = EffectDataTransport.CREATOR.createFromParcel(parcel);
            CommerceToolsModel commerceToolsModel = (CommerceToolsModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                schedulePostTimeCreateFromParcel = null;
            } else {
                schedulePostTimeCreateFromParcel = SchedulePostTime.CREATOR.createFromParcel(parcel);
            }
            SchedulePostTime schedulePostTime = schedulePostTimeCreateFromParcel;
            if (parcel.readInt() == 0) {
                aIDubbingCreateFromParcel = null;
            } else {
                aIDubbingCreateFromParcel = AIDubbing.CREATOR.createFromParcel(parcel);
            }
            AIDubbing aIDubbing = aIDubbingCreateFromParcel;
            if (parcel.readInt() == 0) {
                inlineCaptionModelCreateFromParcel = null;
            } else {
                inlineCaptionModelCreateFromParcel = InlineCaptionModel.CREATOR.createFromParcel(parcel);
            }
            InlineCaptionModel inlineCaptionModel = inlineCaptionModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                inlineCaptionExperimentInformationCreateFromParcel = null;
            } else {
                inlineCaptionExperimentInformationCreateFromParcel = InlineCaptionExperimentInformation.CREATOR.createFromParcel(parcel);
            }
            InlineCaptionExperimentInformation inlineCaptionExperimentInformation = inlineCaptionExperimentInformationCreateFromParcel;
            AutoCutModel autoCutModelCreateFromParcel = AutoCutModel.CREATOR.createFromParcel(parcel);
            AutoPickModel autoPickModelCreateFromParcel = AutoPickModel.CREATOR.createFromParcel(parcel);
            AutoCutAnchorModel autoCutAnchorModelCreateFromParcel = AutoCutAnchorModel.CREATOR.createFromParcel(parcel);
            ImageAlbumData imageAlbumDataCreateFromParcel2 = ImageAlbumData.CREATOR.createFromParcel(parcel);
            PhotoModeEditingStage photoModeEditingStageCreateFromParcel = PhotoModeEditingStage.CREATOR.createFromParcel(parcel);
            TemplateSchemaData templateSchemaDataCreateFromParcel = TemplateSchemaData.CREATOR.createFromParcel(parcel);
            UgcTemplateData ugcTemplateDataCreateFromParcel = UgcTemplateData.CREATOR.createFromParcel(parcel);
            PhotoModeTemplateData photoModeTemplateDataCreateFromParcel = PhotoModeTemplateData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                photoTemplateInfoCreateFromParcel = null;
            } else {
                photoTemplateInfoCreateFromParcel = PhotoTemplateInfo.CREATOR.createFromParcel(parcel);
            }
            PhotoTemplateInfo photoTemplateInfo = photoTemplateInfoCreateFromParcel;
            ImageEffectTemplateReuseData imageEffectTemplateReuseDataCreateFromParcel = ImageEffectTemplateReuseData.CREATOR.createFromParcel(parcel);
            PUgcTemplateData pUgcTemplateDataCreateFromParcel = PUgcTemplateData.CREATOR.createFromParcel(parcel);
            MvModel mvModelCreateFromParcel = MvModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                templateDynamicSlotModelCreateFromParcel = null;
            } else {
                templateDynamicSlotModelCreateFromParcel = TemplateDynamicSlotModel.CREATOR.createFromParcel(parcel);
            }
            TemplateDynamicSlotModel templateDynamicSlotModel = templateDynamicSlotModelCreateFromParcel;
            TemplateData templateDataCreateFromParcel = TemplateData.CREATOR.createFromParcel(parcel);
            TemplateAnchorData templateAnchorDataCreateFromParcel = TemplateAnchorData.CREATOR.createFromParcel(parcel);
            TemplateConsumeData templateConsumeDataCreateFromParcel = TemplateConsumeData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                editPostModelCreateFromParcel = null;
            } else {
                editPostModelCreateFromParcel = EditPostModel.CREATOR.createFromParcel(parcel);
            }
            EditPostModel editPostModel = editPostModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                video2StickerModelCreateFromParcel = null;
            } else {
                video2StickerModelCreateFromParcel = Video2StickerModel.CREATOR.createFromParcel(parcel);
            }
            Video2StickerModel video2StickerModel = video2StickerModelCreateFromParcel;
            TrendingUploadModel trendingUploadModelCreateFromParcel = TrendingUploadModel.CREATOR.createFromParcel(parcel);
            HDRModel hDRModelCreateFromParcel = HDRModel.CREATOR.createFromParcel(parcel);
            VEBytevc1Model vEBytevc1ModelCreateFromParcel = VEBytevc1Model.CREATOR.createFromParcel(parcel);
            CommonMobParamModel commonMobParamModelCreateFromParcel = CommonMobParamModel.CREATOR.createFromParcel(parcel);
            PrivacySettingModel privacySettingModelCreateFromParcel = PrivacySettingModel.CREATOR.createFromParcel(parcel);
            CreatorModel creatorModelCreateFromParcel = CreatorModel.CREATOR.createFromParcel(parcel);
            AnsaPromptModel ansaPromptModelCreateFromParcel = AnsaPromptModel.CREATOR.createFromParcel(parcel);
            ChangeAvatarModel changeAvatarModelCreateFromParcel = ChangeAvatarModel.CREATOR.createFromParcel(parcel);
            OnThisDayData onThisDayDataCreateFromParcel = OnThisDayData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                celebrationDataCreateFromParcel = null;
            } else {
                celebrationDataCreateFromParcel = CelebrationData.CREATOR.createFromParcel(parcel);
            }
            CelebrationData celebrationData = celebrationDataCreateFromParcel;
            MusicShareStoryData musicShareStoryDataCreateFromParcel = MusicShareStoryData.CREATOR.createFromParcel(parcel);
            StickerNewEngineModel stickerNewEngineModelCreateFromParcel = StickerNewEngineModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                publishItemTrackModelCreateFromParcel = null;
            } else {
                publishItemTrackModelCreateFromParcel = PublishItemTrackModel.CREATOR.createFromParcel(parcel);
            }
            PublishItemTrackModel publishItemTrackModel = publishItemTrackModelCreateFromParcel;
            MagicCombineEffectModel magicCombineEffectModelCreateFromParcel = MagicCombineEffectModel.CREATOR.createFromParcel(parcel);
            PaidContentVideoModel paidContentVideoModelCreateFromParcel = PaidContentVideoModel.CREATOR.createFromParcel(parcel);
            StoryShootModel storyShootModelCreateFromParcel = StoryShootModel.CREATOR.createFromParcel(parcel);
            StoryEditModel storyEditModelCreateFromParcel = StoryEditModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                tTStoryUploadModelCreateFromParcel = null;
            } else {
                tTStoryUploadModelCreateFromParcel = TTStoryUploadModel.CREATOR.createFromParcel(parcel);
            }
            TTStoryUploadModel tTStoryUploadModel = tTStoryUploadModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                textPublishUploadModelCreateFromParcel = null;
            } else {
                textPublishUploadModelCreateFromParcel = TextPublishUploadModel.CREATOR.createFromParcel(parcel);
            }
            TextPublishUploadModel textPublishUploadModel = textPublishUploadModelCreateFromParcel;
            CollabInfoModel collabInfoModelCreateFromParcel = CollabInfoModel.CREATOR.createFromParcel(parcel);
            StreaksData streaksData = (StreaksData) parcel.readSerializable();
            StorySocialEventStickerModel storySocialEventStickerModelCreateFromParcel = StorySocialEventStickerModel.CREATOR.createFromParcel(parcel);
            ExtractFramesModel extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
            SocialModel socialModelCreateFromParcel = SocialModel.CREATOR.createFromParcel(parcel);
            CreativeFlowData creativeFlowDataCreateFromParcel = CreativeFlowData.CREATOR.createFromParcel(parcel);
            CreativeInfo creativeInfoCreateFromParcel = CreativeInfo.CREATOR.createFromParcel(parcel);
            MicroAppModel microAppModel = (MicroAppModel) parcel.readSerializable();
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = (AVUploadMiscInfoStruct) parcel.readSerializable();
            PoiData poiData = (PoiData) parcel.readSerializable();
            C443120HZe c443120HZe = (C443120HZe) parcel.readSerializable();
            PoiData poiData2 = (PoiData) parcel.readSerializable();
            PoiLynxInfoModel poiLynxInfoModelCreateFromParcel = PoiLynxInfoModel.CREATOR.createFromParcel(parcel);
            PoiMobParam poiMobParam = (PoiMobParam) parcel.readSerializable();
            GpsConsumingOptModel gpsConsumingOptModelCreateFromParcel = GpsConsumingOptModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                customParcelableExtraInfoCreateFromParcel = null;
            } else {
                customParcelableExtraInfoCreateFromParcel = CustomParcelableExtraInfo.CREATOR.createFromParcel(parcel);
            }
            CustomParcelableExtraInfo customParcelableExtraInfo = customParcelableExtraInfoCreateFromParcel;
            EditorProDraftModel editorProDraftModelCreateFromParcel = EditorProDraftModel.CREATOR.createFromParcel(parcel);
            EditorProSchemeModel editorProSchemeModelCreateFromParcel = EditorProSchemeModel.CREATOR.createFromParcel(parcel);
            OpenPlatformModel openPlatformModelCreateFromParcel = OpenPlatformModel.CREATOR.createFromParcel(parcel);
            MigrateModel migrateModelCreateFromParcel = MigrateModel.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            AISelfModel aISelfModelCreateFromParcel = AISelfModel.CREATOR.createFromParcel(parcel);
            AISelfScanFaceModel aISelfScanFaceModelCreateFromParcel = AISelfScanFaceModel.CREATOR.createFromParcel(parcel);
            RestoreModel restoreModelCreateFromParcel = RestoreModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                tangramTempModelCreateFromParcel = null;
            } else {
                tangramTempModelCreateFromParcel = TangramTempModel.CREATOR.createFromParcel(parcel);
            }
            TangramTempModel tangramTempModel = tangramTempModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                tangramPersistenceModelCreateFromParcel = null;
            } else {
                tangramPersistenceModelCreateFromParcel = TangramPersistenceModel.CREATOR.createFromParcel(parcel);
            }
            TangramPersistenceModel tangramPersistenceModel = tangramPersistenceModelCreateFromParcel;
            GamePoiModel gamePoiModelCreateFromParcel = GamePoiModel.CREATOR.createFromParcel(parcel);
            ProductRecommendModel productRecommendModelCreateFromParcel = ProductRecommendModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                aICreateModelCreateFromParcel = null;
            } else {
                aICreateModelCreateFromParcel = AICreateModel.CREATOR.createFromParcel(parcel);
            }
            AICreateModel aICreateModel = aICreateModelCreateFromParcel;
            LiveRecordModel liveRecordModelCreateFromParcel = LiveRecordModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(MediaLocationMetaDataModel.CREATOR.createFromParcel(parcel));
                }
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            PropFromGroupModel propFromGroupModelCreateFromParcel = PropFromGroupModel.CREATOR.createFromParcel(parcel);
            FeedPropPinModel feedPropPinModelCreateFromParcel = FeedPropPinModel.CREATOR.createFromParcel(parcel);
            EffectShowModel effectShowModelCreateFromParcel = EffectShowModel.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            AIGCExtraModel aIGCExtraModelCreateFromParcel = AIGCExtraModel.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                creatorAppModelCreateFromParcel = null;
            } else {
                creatorAppModelCreateFromParcel = CreatorAppModel.CREATOR.createFromParcel(parcel);
            }
            CreatorAppModel creatorAppModel = creatorAppModelCreateFromParcel;
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                aIGroupShotTemplateModelCreateFromParcel = null;
            } else {
                aIGroupShotTemplateModelCreateFromParcel = AIGroupShotTemplateModel.CREATOR.createFromParcel(parcel);
            }
            AIGroupShotTemplateModel aIGroupShotTemplateModel = aIGroupShotTemplateModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                minisGameModelCreateFromParcel = null;
            } else {
                minisGameModelCreateFromParcel = MinisGameModel.CREATOR.createFromParcel(parcel);
            }
            MinisGameModel minisGameModel = minisGameModelCreateFromParcel;
            String string11 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
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
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            AILivePhotoModel aILivePhotoModelCreateFromParcel = AILivePhotoModel.CREATOR.createFromParcel(parcel);
            AIGCBusinessModelSet aIGCBusinessModelSetCreateFromParcel = AIGCBusinessModelSet.CREATOR.createFromParcel(parcel);
            AIGCWorkflowModel aIGCWorkflowModelCreateFromParcel = AIGCWorkflowModel.CREATOR.createFromParcel(parcel);
            NewBackgroundVideoPipelineModel newBackgroundVideoPipelineModelCreateFromParcel = NewBackgroundVideoPipelineModel.CREATOR.createFromParcel(parcel);
            DetailPageRecallDraftModel detailPageRecallDraftModelCreateFromParcel = DetailPageRecallDraftModel.CREATOR.createFromParcel(parcel);
            DraftBoxModel draftBoxModelCreateFromParcel = DraftBoxModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                livePhotoModelCreateFromParcel = null;
            } else {
                livePhotoModelCreateFromParcel = LivePhotoModel.CREATOR.createFromParcel(parcel);
            }
            LivePhotoModel livePhotoModel = livePhotoModelCreateFromParcel;
            AIGCOfflineModel aIGCOfflineModelCreateFromParcel = AIGCOfflineModel.CREATOR.createFromParcel(parcel);
            AigcMetadataModel aigcMetadataModelCreateFromParcel = AigcMetadataModel.CREATOR.createFromParcel(parcel);
            LandscapeVideoModel landscapeVideoModelCreateFromParcel = LandscapeVideoModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                cameraLayoutModelCreateFromParcel = null;
            } else {
                cameraLayoutModelCreateFromParcel = CameraLayoutModel.CREATOR.createFromParcel(parcel);
            }
            CameraLayoutModel cameraLayoutModel = cameraLayoutModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                aIChatGenModelCreateFromParcel = null;
            } else {
                aIChatGenModelCreateFromParcel = AIChatGenModel.CREATOR.createFromParcel(parcel);
            }
            AIChatGenModel aIChatGenModel = aIChatGenModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                creationSearchModelCreateFromParcel = null;
            } else {
                creationSearchModelCreateFromParcel = CreationSearchModel.CREATOR.createFromParcel(parcel);
            }
            CreationSearchModel creationSearchModel = creationSearchModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                videoImageSeparateSwitchModelCreateFromParcel = null;
            } else {
                videoImageSeparateSwitchModelCreateFromParcel = VideoImageSeparateSwitchModel.CREATOR.createFromParcel(parcel);
            }
            VideoImageSeparateSwitchModel videoImageSeparateSwitchModel = videoImageSeparateSwitchModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                quickGridModelCreateFromParcel = null;
            } else {
                quickGridModelCreateFromParcel = QuickGridModel.CREATOR.createFromParcel(parcel);
            }
            QuickGridModel quickGridModel = quickGridModelCreateFromParcel;
            MixStickerInfo mixStickerInfo = (MixStickerInfo) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                declarationModelCreateFromParcel = null;
            } else {
                declarationModelCreateFromParcel = DeclarationModel.CREATOR.createFromParcel(parcel);
            }
            DeclarationModel declarationModel = declarationModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                liveModelCreateFromParcel = null;
            } else {
                liveModelCreateFromParcel = LiveModel.CREATOR.createFromParcel(parcel);
            }
            LiveModel liveModel = liveModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                povModelCreateFromParcel = null;
            } else {
                povModelCreateFromParcel = PovModel.CREATOR.createFromParcel(parcel);
            }
            PovModel povModel = povModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                albumOpenApiModelCreateFromParcel = null;
            } else {
                albumOpenApiModelCreateFromParcel = AlbumOpenApiModel.CREATOR.createFromParcel(parcel);
            }
            return new CreativeModel(creativeInitialModelCreateFromParcel, eventDataCreateFromParcel, recordDataCreateFromParcel, recordEffectModelCreateFromParcel, loadMusicAndEffectModelCreateFromParcel, recordDowngradeModelCreateFromParcel, reuseSoundAndEffectModelCreateFromParcel, aYMobCacheModelCreateFromParcel, landingModelCreateFromParcel, musicAndTimeModel, flashModelCreateFromParcel, beautyModelCreateFromParcel, countDownModelCreateFromParcel, recordMobModelCreateFromParcel, shootLinkPerfMobModelCreateFromParcel, albumModelCreateFromParcel, greenScreenEffectModelCreateFromParcel, newGreenScreenEffectModel, importModelCreateFromParcel, albumMobModelCreateFromParcel, volumeInfoModelCreateFromParcel, musicVolumeInfoModelCreateFromParcel, soundEffectInfoModelCreateFromParcel, musicBuzModelCreateFromParcel, mdpInfoModelCreateFromParcel, stickPointModelCreateFromParcel, cutSameModel, editModelCreateFromParcel, canvasVideoData, editEffectModelCreateFromParcel, editBackSaveModelCreateFromParcel, nLEInfoModelCreateFromParcel, editStickerModelCreateFromParcel, editorProAIGCInfoModelCreateFromParcel, infoStickerModel, infoStickerCategoryParams, editVideoEnhanceModelCreateFromParcel, editSaveLocalModelCreateFromParcel, cut2EditTransferModel, editPageRestoreActivityModelCreateFromParcel, i, creationTypeModelCreateFromParcel, imageAlbumData, editPhotoModelCreateFromParcel, imageEditModelCreateFromParcel, aICoverMobModelCreateFromParcel, imagePublishModelCreateFromParcel, imagePublishBackSaveModelCreateFromParcel, soundSyncModelCreateFromParcel, filterModelCreateFromParcel, recordFilterModelCreateFromParcel, mirrorModeCreateFromParcel, duetModelCreateFromParcel, string, string2, i2, stitchModelCreateFromParcel, mobileEffectsModel2CreateFromParcel, prePublishStatusModelCreateFromParcel, postPageModelCreateFromParcel, followUpPublishTrackerModelCreateFromParcel, postLandingModelCreateFromParcel, publishPreviewModelCreateFromParcel, publishModelCreateFromParcel, storyPublishNetworkInfo, publishSecureModelCreateFromParcel, sparkPublishModelCreateFromParcel, text2ImageModelCreateFromParcel, publishCustomCoverModelCreateFromParcel, publishMobParamsCreateFromParcel, coverPublishModel, draftInfoModelCreateFromParcel, micDataModelCreateFromParcel, checkPointModelCreateFromParcel, loudnessBalanceModelCreateFromParcel, audioAlgorithmModelCreateFromParcel, audioVolumeAdjustModelCreateFromParcel, audioCopyrightDetectModelCreateFromParcel, voiceConversionModelCreateFromParcel, reuseAwemeTTSAndVCRefIDsModelCreateFromParcel, ttsVoiceInfo, instantCloneConsumptionModelCreateFromParcel, mixEditingModelCreateFromParcel, tTSModelCreateFromParcel, capcutVcTTSModelCreateFromParcel, streamVoiceConversionModelCreateFromParcel, audioEffectParam, originalSoundModelCreateFromParcel, tTSVoiceModel, tTSStickerModelCreateFromParcel, audioAECModelCreateFromParcel, audioLoudnessModelCreateFromParcel, z, nowsShootModel, dMMediaModel, pcsCourseVideoModel, effectDataTransportCreateFromParcel, commerceToolsModel, schedulePostTime, aIDubbing, inlineCaptionModel, inlineCaptionExperimentInformation, autoCutModelCreateFromParcel, autoPickModelCreateFromParcel, autoCutAnchorModelCreateFromParcel, imageAlbumDataCreateFromParcel2, photoModeEditingStageCreateFromParcel, templateSchemaDataCreateFromParcel, ugcTemplateDataCreateFromParcel, photoModeTemplateDataCreateFromParcel, photoTemplateInfo, imageEffectTemplateReuseDataCreateFromParcel, pUgcTemplateDataCreateFromParcel, mvModelCreateFromParcel, templateDynamicSlotModel, templateDataCreateFromParcel, templateAnchorDataCreateFromParcel, templateConsumeDataCreateFromParcel, editPostModel, video2StickerModel, trendingUploadModelCreateFromParcel, hDRModelCreateFromParcel, vEBytevc1ModelCreateFromParcel, commonMobParamModelCreateFromParcel, privacySettingModelCreateFromParcel, creatorModelCreateFromParcel, ansaPromptModelCreateFromParcel, changeAvatarModelCreateFromParcel, onThisDayDataCreateFromParcel, celebrationData, musicShareStoryDataCreateFromParcel, stickerNewEngineModelCreateFromParcel, publishItemTrackModel, magicCombineEffectModelCreateFromParcel, paidContentVideoModelCreateFromParcel, storyShootModelCreateFromParcel, storyEditModelCreateFromParcel, tTStoryUploadModel, textPublishUploadModel, collabInfoModelCreateFromParcel, streaksData, storySocialEventStickerModelCreateFromParcel, extractFramesModel, socialModelCreateFromParcel, creativeFlowDataCreateFromParcel, creativeInfoCreateFromParcel, microAppModel, aVUploadMiscInfoStruct, poiData, c443120HZe, poiData2, poiLynxInfoModelCreateFromParcel, poiMobParam, gpsConsumingOptModelCreateFromParcel, customParcelableExtraInfo, editorProDraftModelCreateFromParcel, editorProSchemeModelCreateFromParcel, openPlatformModelCreateFromParcel, migrateModelCreateFromParcel, string3, aISelfModelCreateFromParcel, aISelfScanFaceModelCreateFromParcel, restoreModelCreateFromParcel, tangramTempModel, tangramPersistenceModel, gamePoiModelCreateFromParcel, productRecommendModelCreateFromParcel, aICreateModel, liveRecordModelCreateFromParcel, arrayList, string4, string5, propFromGroupModelCreateFromParcel, feedPropPinModelCreateFromParcel, effectShowModelCreateFromParcel, string6, aIGCExtraModelCreateFromParcel, string7, string8, creatorAppModel, string9, string10, aIGroupShotTemplateModel, minisGameModel, string11, arrayListCreateStringArrayList, z2, z3, numValueOf, z4, string12, numValueOf2, aILivePhotoModelCreateFromParcel, aIGCBusinessModelSetCreateFromParcel, aIGCWorkflowModelCreateFromParcel, newBackgroundVideoPipelineModelCreateFromParcel, detailPageRecallDraftModelCreateFromParcel, draftBoxModelCreateFromParcel, livePhotoModel, aIGCOfflineModelCreateFromParcel, aigcMetadataModelCreateFromParcel, landscapeVideoModelCreateFromParcel, cameraLayoutModel, aIChatGenModel, creationSearchModel, videoImageSeparateSwitchModel, quickGridModel, mixStickerInfo, declarationModel, liveModel, povModel, albumOpenApiModelCreateFromParcel, RecordConflictsModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CreativeModel[] newArray(int i) {
            return new CreativeModel[i];
        }
    };

    public CreativeModel(CreativeInitialModel creativeInitialModel, EventData eventData, RecordData recordData, RecordEffectModel recordEffectModel, LoadMusicAndEffectModel loadMusicAndEffectModel, RecordDowngradeModel recordDowngradeModel, ReuseSoundAndEffectModel reuseSoundAndEffectModel, AYMobCacheModel aYMobCacheModel, LandingModel landingModel, MusicAndTimeModel musicAndTimeModel, FlashModel flashModel, BeautyModel beautyModel, CountDownModel countDownModel, RecordMobModel recordMobModel, ShootLinkPerfMobModel shootLinkPerfMobModel, AlbumModel albumModel, GreenScreenEffectModel greenScreenEffectModel, NewGreenScreenEffectModel newGreenScreenEffectModel, ImportModel importModel, AlbumMobModel albumMobModel, VolumeInfoModel volumeInfoModel, MusicVolumeInfoModel musicVolumeInfoModel, SoundEffectInfoModel soundEffectInfoModel, MusicBuzModel musicBuzModel, MdpInfoModel mdpInfoModel, StickPointModel stickPointModel, CutSameModel cutSameModel, EditModel editModel, CanvasVideoData canvasVideoData, EditEffectModel editEffectModel, EditBackSaveModel editBackSaveModel, NLEInfoModel nLEInfoModel, EditStickerModel editStickerModel, EditorProAIGCInfoModel editorProAIGCInfoModel, InfoStickerModel infoStickerModel, InfoStickerCategoryParams infoStickerCategoryParams, EditVideoEnhanceModel editVideoEnhanceModel, EditSaveLocalModel editSaveLocalModel, Cut2EditTransferModel cut2EditTransferModel, EditPageRestoreActivityModel editPageRestoreActivityModel, int i, CreationTypeModel creationTypeModel, ImageAlbumData imageAlbumData, EditPhotoModel editPhotoModel, ImageEditModel imageEditModel, AICoverMobModel aICoverMobModel, ImagePublishModel imagePublishModel, ImagePublishBackSaveModel imagePublishBackSaveModel, SoundSyncModel soundSyncModel, FilterModel filterModel, RecordFilterModel recordFilterModel, MirrorMode mirrorMode, DuetModel duetModel, String str, String str2, int i2, StitchModel stitchModel, MobileEffectsModel2 mobileEffectsModel2, PrePublishStatusModel prePublishStatusModel, PostPageModel postPageModel, FollowUpPublishTrackerModel followUpPublishTrackerModel, PostLandingModel postLandingModel, PublishPreviewModel publishPreviewModel, PublishModel publishModel, StoryPublishNetworkInfo storyPublishNetworkInfo, PublishSecureModel publishSecureModel, SparkPublishModel sparkPublishModel, Text2ImageModel text2ImageModel, PublishCustomCoverModel publishCustomCoverModel, PublishMobParams publishMobParams, CoverPublishModel coverPublishModel, DraftInfoModel draftInfoModel, MicDataModel micDataModel, CheckPointModel checkPointModel, LoudnessBalanceModel loudnessBalanceModel, AudioAlgorithmModel audioAlgorithmModel, AudioVolumeAdjustModel audioVolumeAdjustModel, AudioCopyrightDetectModel audioCopyrightDetectModel, VoiceConversionModel voiceConversionModel, ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel, TtsVoiceInfo ttsVoiceInfo, InstantCloneConsumptionModel instantCloneConsumptionModel, MixEditingModel mixEditingModel, TTSModel tTSModel, CapcutVcTTSModel capcutVcTTSModel, StreamVoiceConversionModel streamVoiceConversionModel, AudioEffectParam audioEffectParam, OriginalSoundModel originalSoundModel, TTSVoiceModel tTSVoiceModel, TTSStickerModel tTSStickerModel, AudioAECModel audioAECModel, AudioLoudnessModel audioLoudnessModel, boolean z, NowsShootModel nowsShootModel, DMMediaModel dMMediaModel, PcsCourseVideoModel pcsCourseVideoModel, EffectDataTransport effectDataTransport, CommerceToolsModel commerceToolsModel, SchedulePostTime schedulePostTime, AIDubbing aIDubbing, InlineCaptionModel inlineCaptionModel, InlineCaptionExperimentInformation inlineCaptionExperimentInformation, AutoCutModel autoCutModel, AutoPickModel autoPickModel, AutoCutAnchorModel autoCutAnchorModel, ImageAlbumData imageAlbumData2, PhotoModeEditingStage photoModeEditingStage, TemplateSchemaData templateSchemaData, UgcTemplateData ugcTemplateData, PhotoModeTemplateData photoModeTemplateData, PhotoTemplateInfo photoTemplateInfo, ImageEffectTemplateReuseData imageEffectTemplateReuseData, PUgcTemplateData pUgcTemplateData, MvModel mvModel, TemplateDynamicSlotModel templateDynamicSlotModel, TemplateData templateData, TemplateAnchorData templateAnchorData, TemplateConsumeData templateConsumeData, EditPostModel editPostModel, Video2StickerModel video2StickerModel, TrendingUploadModel trendingUploadModel, HDRModel hDRModel, VEBytevc1Model vEBytevc1Model, CommonMobParamModel commonMobParamModel, PrivacySettingModel privacySettingModel, CreatorModel creatorModel, AnsaPromptModel ansaPromptModel, ChangeAvatarModel changeAvatarModel, OnThisDayData onThisDayData, CelebrationData celebrationData, MusicShareStoryData musicShareStoryData, StickerNewEngineModel stickerNewEngineModel, PublishItemTrackModel publishItemTrackModel, MagicCombineEffectModel magicCombineEffectModel, PaidContentVideoModel paidContentVideoModel, StoryShootModel storyShootModel, StoryEditModel storyEditModel, TTStoryUploadModel tTStoryUploadModel, TextPublishUploadModel textPublishUploadModel, CollabInfoModel collabInfoModel, StreaksData streaksData, StorySocialEventStickerModel storySocialEventStickerModel, ExtractFramesModel extractFramesModel, SocialModel socialModel, CreativeFlowData creativeFlowData, CreativeInfo creativeInfo, MicroAppModel microAppModel, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, PoiData poiData, C443120HZe<PoiData, Integer, String> c443120HZe, PoiData poiData2, PoiLynxInfoModel poiLynxInfoModel, PoiMobParam poiMobParam, GpsConsumingOptModel gpsConsumingOptModel, CustomParcelableExtraInfo customParcelableExtraInfo, EditorProDraftModel editorProDraftModel, EditorProSchemeModel editorProSchemeModel, OpenPlatformModel openPlatformModel, MigrateModel migrateModel, String str3, AISelfModel aISelfModel, AISelfScanFaceModel aISelfScanFaceModel, RestoreModel restoreModel, TangramTempModel tangramTempModel, TangramPersistenceModel tangramPersistenceModel, GamePoiModel gamePoiModel, ProductRecommendModel productRecommendModel, AICreateModel aICreateModel, LiveRecordModel liveRecordModel, List<MediaLocationMetaDataModel> list, String str4, String str5, PropFromGroupModel propFromGroupModel, FeedPropPinModel feedPropPinModel, EffectShowModel effectShowModel, String str6, AIGCExtraModel aIGCExtraModel, String str7, String str8, CreatorAppModel creatorAppModel, String str9, String str10, AIGroupShotTemplateModel aIGroupShotTemplateModel, MinisGameModel minisGameModel, String str11, List<String> list2, boolean z2, boolean z3, Integer num, boolean z4, String str12, Integer num2, AILivePhotoModel aILivePhotoModel, AIGCBusinessModelSet aIGCBusinessModelSet, AIGCWorkflowModel aIGCWorkflowModel, NewBackgroundVideoPipelineModel newBackgroundVideoPipelineModel, DetailPageRecallDraftModel detailPageRecallDraftModel, DraftBoxModel draftBoxModel, LivePhotoModel livePhotoModel, AIGCOfflineModel aIGCOfflineModel, AigcMetadataModel aigcMetadataModel, LandscapeVideoModel landscapeVideoModel, CameraLayoutModel cameraLayoutModel, AIChatGenModel aIChatGenModel, CreationSearchModel creationSearchModel, VideoImageSeparateSwitchModel videoImageSeparateSwitchModel, QuickGridModel quickGridModel, MixStickerInfo mixStickerInfo, DeclarationModel declarationModel, LiveModel liveModel, PovModel povModel, AlbumOpenApiModel albumOpenApiModel, RecordConflictsModel recordConflictsModel) {
        this.initialModel = creativeInitialModel;
        this.eventData = eventData;
        this.recordData = recordData;
        this.recordEffectModel = recordEffectModel;
        this.loadMusicAndEffectModel = loadMusicAndEffectModel;
        this.recordDowngradeModel = recordDowngradeModel;
        this.reuseSoundAndEffectModel = reuseSoundAndEffectModel;
        this.ayMobCacheModel = aYMobCacheModel;
        this.landingModel = landingModel;
        this.musicAndTimeModel = musicAndTimeModel;
        this.flashModel = flashModel;
        this.beautyModel = beautyModel;
        this.countDownModel = countDownModel;
        this.recordMobModel = recordMobModel;
        this.shootLinkPerfMobModel = shootLinkPerfMobModel;
        this.albumModel = albumModel;
        this.greenScreenEffectModel = greenScreenEffectModel;
        this.newGreenScreenEffectModel = newGreenScreenEffectModel;
        this.importModel = importModel;
        this.albumMobModel = albumMobModel;
        this.volumeInfoModel = volumeInfoModel;
        this.musicVolumeInfoModel = musicVolumeInfoModel;
        this.soundEffectInfoModel = soundEffectInfoModel;
        this.musicBuzModel = musicBuzModel;
        this.mdpInfoModel = mdpInfoModel;
        this.stickPointModel = stickPointModel;
        this.cutSameModel = cutSameModel;
        this.editModel = editModel;
        this.canvasVideoData = canvasVideoData;
        this.editEffectModel = editEffectModel;
        this.editBackSaveModel = editBackSaveModel;
        this.nleInfoModel = nLEInfoModel;
        this.editStickerModel = editStickerModel;
        this.editorProAIGCInfoModel = editorProAIGCInfoModel;
        this.infoStickerModel = infoStickerModel;
        this.infoStickerCategoryParams = infoStickerCategoryParams;
        this.editVideoEnhanceModel = editVideoEnhanceModel;
        this.editSaveLocalModel = editSaveLocalModel;
        this.cut2EditTransferModel = cut2EditTransferModel;
        this.editPageRestoreActivityModel = editPageRestoreActivityModel;
        this.mRestoreType = i;
        this.creationTypeModel = creationTypeModel;
        this.imageAlbumModel = imageAlbumData;
        this.editPhotoModel = editPhotoModel;
        this.imageEditModel = imageEditModel;
        this.aiCoverMobModel = aICoverMobModel;
        this.imagePublishModel = imagePublishModel;
        this.imagePublishBackSaveModel = imagePublishBackSaveModel;
        this.soundSyncModel = soundSyncModel;
        this.filterModel = filterModel;
        this.recordFilterModel = recordFilterModel;
        this.mirrorMode = mirrorMode;
        this.duetModel = duetModel;
        this.effectEntrancePosition = str;
        this.effectCarouselAction = str2;
        this.effectCarouselIndex = i2;
        this.stitchModel = stitchModel;
        this.mobileEffectsModel2 = mobileEffectsModel2;
        this.prePublishStatusModel = prePublishStatusModel;
        this.postPageModel = postPageModel;
        this.followUpPublishTrackerModel = followUpPublishTrackerModel;
        this.postLandingModel = postLandingModel;
        this.publishPreviewModel = publishPreviewModel;
        this.publishModel = publishModel;
        this.storyPublishNetworkInfo = storyPublishNetworkInfo;
        this.publishSecureModel = publishSecureModel;
        this.sparkPublishModel = sparkPublishModel;
        this.text2ImageModel = text2ImageModel;
        this.publishCustomCoverModel = publishCustomCoverModel;
        this.publishMobParams = publishMobParams;
        this.coverPublishModel = coverPublishModel;
        this.draftInfoModel = draftInfoModel;
        this.micDataModel = micDataModel;
        this.checkPointModel = checkPointModel;
        this.loudnessBalanceModel = loudnessBalanceModel;
        this.audioAlgorithmModel = audioAlgorithmModel;
        this.audioVolumeAdjustModel = audioVolumeAdjustModel;
        this.audioCopyrightDetectModel = audioCopyrightDetectModel;
        this.voiceConversionModel = voiceConversionModel;
        this.reuseAwemeTTSAndVCRefIDsModel = reuseAwemeTTSAndVCRefIDsModel;
        this.ttsVoiceInfo = ttsVoiceInfo;
        this.instantCloneConsumption = instantCloneConsumptionModel;
        this.mixEditingModel = mixEditingModel;
        this.ttsModel = tTSModel;
        this.capcutVcTTSModel = capcutVcTTSModel;
        this.streamVoiceConversionModel = streamVoiceConversionModel;
        this.veAudioEffectParam = audioEffectParam;
        this.originalSoundModel = originalSoundModel;
        this.ttsVoiceModel = tTSVoiceModel;
        this.ttsStickerModel = tTSStickerModel;
        this.audioAECModel = audioAECModel;
        this.audioLoudnessModel = audioLoudnessModel;
        this.ifRecordWithHeadset = z;
        this.nowsShootModel = nowsShootModel;
        this.dmMediaModel = dMMediaModel;
        this.pcsPaidVideoMediaModel = pcsCourseVideoModel;
        this.effectData = effectDataTransport;
        this.commerceModel = commerceToolsModel;
        this.scheduleTime = schedulePostTime;
        this.aiDubbing = aIDubbing;
        this.inlineCaptionModel = inlineCaptionModel;
        this.inlineCaptionExperimentInformation = inlineCaptionExperimentInformation;
        this.autoCutModel = autoCutModel;
        this.autoPickModel = autoPickModel;
        this.autoCutAnchorModel = autoCutAnchorModel;
        this.photoModeAutoCutModel = imageAlbumData2;
        this.photoModeEnterEditingStage = photoModeEditingStage;
        this.templateSchemaData = templateSchemaData;
        this.ugcTemplateData = ugcTemplateData;
        this.photoModeTemplateData = photoModeTemplateData;
        this.photoTemplateInfo = photoTemplateInfo;
        this.imageEffectTemplateData = imageEffectTemplateReuseData;
        this.pugcTemplateData = pUgcTemplateData;
        this.mvModel = mvModel;
        this.templateDynamicSlotModel = templateDynamicSlotModel;
        this.templateData = templateData;
        this.templateAnchorData = templateAnchorData;
        this.templateConsumeData = templateConsumeData;
        this.editPostModel = editPostModel;
        this.video2StickerModel = video2StickerModel;
        this.trendingUploadModel = trendingUploadModel;
        this.hdrModel = hDRModel;
        this.bytevcVC1Model = vEBytevc1Model;
        this.commonMobModel = commonMobParamModel;
        this.privacySettingModel = privacySettingModel;
        this.creatorModel = creatorModel;
        this.ansaPromptModel = ansaPromptModel;
        this.changeAvatarModel = changeAvatarModel;
        this.onThisDayData = onThisDayData;
        this.celebrationData = celebrationData;
        this.musicShareStoryData = musicShareStoryData;
        this.stickerModel = stickerNewEngineModel;
        this.publishItemTrackModel = publishItemTrackModel;
        this.magicCombineEffectModel = magicCombineEffectModel;
        this.paidContentModel = paidContentVideoModel;
        this.storyModel = storyShootModel;
        this.storyEditModel = storyEditModel;
        this.ttStoryUploadModel = tTStoryUploadModel;
        this.textPublishUploadModel = textPublishUploadModel;
        this.collabInfoModel = collabInfoModel;
        this.streaksData = streaksData;
        this.storyEventStickerData = storySocialEventStickerModel;
        this.extractFramesModel = extractFramesModel;
        this.socialModel = socialModel;
        this.creativeFlowData = creativeFlowData;
        this.creativeInfo = creativeInfo;
        this.microAppModel = microAppModel;
        this.uploadMiscInfoStruct = aVUploadMiscInfoStruct;
        this.poiData = poiData;
        this.poiDataFromLynx = c443120HZe;
        this.poiPostDataFromSchema = poiData2;
        this.poiLynxInfoModel = poiLynxInfoModel;
        this.poiMobParams = poiMobParam;
        this.gpsConsumingOptModel = gpsConsumingOptModel;
        this.customParcelableExtraInfo = customParcelableExtraInfo;
        this.editorProDraftModel = editorProDraftModel;
        this.editorProSchemeModel = editorProSchemeModel;
        this.openPlatformModel = openPlatformModel;
        this.migrateModel = migrateModel;
        this.enterFromH5Type = str3;
        this.aiSelfModel = aISelfModel;
        this.aiSelfScanFaceModel = aISelfScanFaceModel;
        this.restoreModel = restoreModel;
        this.tangramTempModel = tangramTempModel;
        this.tangramPersistenceModel = tangramPersistenceModel;
        this.gamePoiModel = gamePoiModel;
        this.productRecommendModel = productRecommendModel;
        this.aiCreateModel = aICreateModel;
        this.liveRecordModel = liveRecordModel;
        this.mediaLocationMetaDataList = list;
        this.productPath = str4;
        this.successFlag = str5;
        this.propFromGroupModel = propFromGroupModel;
        this.feedPropPinModel = feedPropPinModel;
        this.propShowModel = effectShowModel;
        this.failFlag = str6;
        this.aigcExtraModel = aIGCExtraModel;
        this.templateDebugId = str7;
        this.templateDebugType = str8;
        this.creatorAppModel = creatorAppModel;
        this.groupId = str9;
        this.shootEnterFrom = str10;
        this.dmGroupShotTemplateModel = aIGroupShotTemplateModel;
        this.miniGameData = minisGameModel;
        this.asyncFuncList = str11;
        this.asyncTaskIds = list2;
        this.isFromEditTab = z2;
        this.isFromEditTabUpload = z3;
        this.asyncTaskCount = num;
        this.isAsyncTaskFailed = z4;
        this.asyncSource = str12;
        this.asyncStatus = num2;
        this.aiLivePhotoModel = aILivePhotoModel;
        this.aigcBusinessModel = aIGCBusinessModelSet;
        this.aigcWorkflowModel = aIGCWorkflowModel;
        this.newVideoPipelineExtraModel = newBackgroundVideoPipelineModel;
        this.detailPageRecallDraftModel = detailPageRecallDraftModel;
        this.draftBoxModel = draftBoxModel;
        this.livePhotoModel = livePhotoModel;
        this.aigcOfflineModel = aIGCOfflineModel;
        this.aigcMetadataModel = aigcMetadataModel;
        this.landscapeVideoModel = landscapeVideoModel;
        this.cameraLayoutModel = cameraLayoutModel;
        this.aiChatGenModel = aIChatGenModel;
        this.creationSearchModel = creationSearchModel;
        this.videoImageSeparateSwitchModel = videoImageSeparateSwitchModel;
        this.quickGridModel = quickGridModel;
        this.mixStickerInfo = mixStickerInfo;
        this.declarationModel = declarationModel;
        this.liveModel = liveModel;
        this.povModel = povModel;
        this.albumOpenApiModel = albumOpenApiModel;
        this.recordConflictsModel = recordConflictsModel;
        this.quickPostOnEditPageModel = new C1429790nJJ();
        this.shortcutPublishStatusModel = new C855300Xgu();
        this.mecReportModel = new C1443680nfi();
        this.transientPostPageModel = new C854860XgC(0);
        this.defaultCameraSpec = -1;
        this.conversionRateTime = -1L;
        this.ffdEventReport = new FFDEventReport(0);
        this.propETGroupModel = new C1449300nom();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CreativeModel() {
        int i = -1;
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
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        Object[] objArr69 = 0 == true ? 1 : 0;
        Object[] objArr70 = 0 == true ? 1 : 0;
        Object[] objArr71 = 0 == true ? 1 : 0;
        Object[] objArr72 = 0 == true ? 1 : 0;
        Object[] objArr73 = 0 == true ? 1 : 0;
        Object[] objArr74 = 0 == true ? 1 : 0;
        Object[] objArr75 = 0 == true ? 1 : 0;
        Object[] objArr76 = 0 == true ? 1 : 0;
        Object[] objArr77 = 0 == true ? 1 : 0;
        Object[] objArr78 = 0 == true ? 1 : 0;
        Object[] objArr79 = 0 == true ? 1 : 0;
        Object[] objArr80 = 0 == true ? 1 : 0;
        Object[] objArr81 = 0 == true ? 1 : 0;
        Object[] objArr82 = 0 == true ? 1 : 0;
        Object[] objArr83 = 0 == true ? 1 : 0;
        Object[] objArr84 = 0 == true ? 1 : 0;
        Object[] objArr85 = 0 == true ? 1 : 0;
        Object[] objArr86 = 0 == true ? 1 : 0;
        Object[] objArr87 = 0 == true ? 1 : 0;
        Object[] objArr88 = 0 == true ? 1 : 0;
        Object[] objArr89 = 0 == true ? 1 : 0;
        Object[] objArr90 = 0 == true ? 1 : 0;
        Object[] objArr91 = 0 == true ? 1 : 0;
        Object[] objArr92 = 0 == true ? 1 : 0;
        Object[] objArr93 = 0 == true ? 1 : 0;
        Object[] objArr94 = 0 == true ? 1 : 0;
        Object[] objArr95 = 0 == true ? 1 : 0;
        Object[] objArr96 = 0 == true ? 1 : 0;
        Object[] objArr97 = 0 == true ? 1 : 0;
        Object[] objArr98 = 0 == true ? 1 : 0;
        Object[] objArr99 = 0 == true ? 1 : 0;
        Object[] objArr100 = 0 == true ? 1 : 0;
        Object[] objArr101 = 0 == true ? 1 : 0;
        Object[] objArr102 = 0 == true ? 1 : 0;
        Object[] objArr103 = 0 == true ? 1 : 0;
        Object[] objArr104 = 0 == true ? 1 : 0;
        Object[] objArr105 = 0 == true ? 1 : 0;
        Object[] objArr106 = 0 == true ? 1 : 0;
        Object[] objArr107 = 0 == true ? 1 : 0;
        Object[] objArr108 = 0 == true ? 1 : 0;
        Object[] objArr109 = 0 == true ? 1 : 0;
        Object[] objArr110 = 0 == true ? 1 : 0;
        Object[] objArr111 = 0 == true ? 1 : 0;
        Object[] objArr112 = 0 == true ? 1 : 0;
        Object[] objArr113 = 0 == true ? 1 : 0;
        Object[] objArr114 = 0 == true ? 1 : 0;
        Object[] objArr115 = 0 == true ? 1 : 0;
        Object[] objArr116 = 0 == true ? 1 : 0;
        Object[] objArr117 = 0 == true ? 1 : 0;
        Object[] objArr118 = 0 == true ? 1 : 0;
        Object[] objArr119 = 0 == true ? 1 : 0;
        Object[] objArr120 = 0 == true ? 1 : 0;
        Object[] objArr121 = 0 == true ? 1 : 0;
        Object[] objArr122 = 0 == true ? 1 : 0;
        Object[] objArr123 = 0 == true ? 1 : 0;
        Object[] objArr124 = 0 == true ? 1 : 0;
        Object[] objArr125 = 0 == true ? 1 : 0;
        Object[] objArr126 = 0 == true ? 1 : 0;
        Object[] objArr127 = 0 == true ? 1 : 0;
        Object[] objArr128 = 0 == true ? 1 : 0;
        Object[] objArr129 = 0 == true ? 1 : 0;
        Object[] objArr130 = 0 == true ? 1 : 0;
        Object[] objArr131 = 0 == true ? 1 : 0;
        Object[] objArr132 = 0 == true ? 1 : 0;
        Object[] objArr133 = 0 == true ? 1 : 0;
        Object[] objArr134 = 0 == true ? 1 : 0;
        Object[] objArr135 = 0 == true ? 1 : 0;
        Object[] objArr136 = 0 == true ? 1 : 0;
        Object[] objArr137 = 0 == true ? 1 : 0;
        Object[] objArr138 = 0 == true ? 1 : 0;
        Object[] objArr139 = 0 == true ? 1 : 0;
        Object[] objArr140 = 0 == true ? 1 : 0;
        Object[] objArr141 = 0 == true ? 1 : 0;
        Object[] objArr142 = 0 == true ? 1 : 0;
        Object[] objArr143 = 0 == true ? 1 : 0;
        Object[] objArr144 = 0 == true ? 1 : 0;
        Object[] objArr145 = 0 == true ? 1 : 0;
        Object[] objArr146 = 0 == true ? 1 : 0;
        Object[] objArr147 = 0 == true ? 1 : 0;
        Object[] objArr148 = 0 == true ? 1 : 0;
        Object[] objArr149 = 0 == true ? 1 : 0;
        Object[] objArr150 = 0 == true ? 1 : 0;
        Object[] objArr151 = 0 == true ? 1 : 0;
        Object[] objArr152 = 0 == true ? 1 : 0;
        Object[] objArr153 = 0 == true ? 1 : 0;
        Object[] objArr154 = 0 == true ? 1 : 0;
        Object[] objArr155 = 0 == true ? 1 : 0;
        Object[] objArr156 = 0 == true ? 1 : 0;
        Object[] objArr157 = 0 == true ? 1 : 0;
        Object[] objArr158 = 0 == true ? 1 : 0;
        Object[] objArr159 = 0 == true ? 1 : 0;
        Object[] objArr160 = 0 == true ? 1 : 0;
        Object[] objArr161 = 0 == true ? 1 : 0;
        Object[] objArr162 = 0 == true ? 1 : 0;
        Object[] objArr163 = 0 == true ? 1 : 0;
        Object[] objArr164 = 0 == true ? 1 : 0;
        Object[] objArr165 = 0 == true ? 1 : 0;
        Object[] objArr166 = 0 == true ? 1 : 0;
        Object[] objArr167 = 0 == true ? 1 : 0;
        Object[] objArr168 = 0 == true ? 1 : 0;
        Object[] objArr169 = 0 == true ? 1 : 0;
        Object[] objArr170 = 0 == true ? 1 : 0;
        Object[] objArr171 = 0 == true ? 1 : 0;
        Object[] objArr172 = 0 == true ? 1 : 0;
        Object[] objArr173 = 0 == true ? 1 : 0;
        Object[] objArr174 = 0 == true ? 1 : 0;
        Object[] objArr175 = 0 == true ? 1 : 0;
        Object[] objArr176 = 0 == true ? 1 : 0;
        Object[] objArr177 = 0 == true ? 1 : 0;
        Object[] objArr178 = 0 == true ? 1 : 0;
        Object[] objArr179 = 0 == true ? 1 : 0;
        Object[] objArr180 = 0 == true ? 1 : 0;
        Object[] objArr181 = 0 == true ? 1 : 0;
        Object[] objArr182 = 0 == true ? 1 : 0;
        Object[] objArr183 = 0 == true ? 1 : 0;
        Object[] objArr184 = 0 == true ? 1 : 0;
        Object[] objArr185 = 0 == true ? 1 : 0;
        Object[] objArr186 = 0 == true ? 1 : 0;
        Object[] objArr187 = 0 == true ? 1 : 0;
        Object[] objArr188 = 0 == true ? 1 : 0;
        Object[] objArr189 = 0 == true ? 1 : 0;
        Object[] objArr190 = 0 == true ? 1 : 0;
        Object[] objArr191 = 0 == true ? 1 : 0;
        Object[] objArr192 = 0 == true ? 1 : 0;
        Object[] objArr193 = 0 == true ? 1 : 0;
        Object[] objArr194 = 0 == true ? 1 : 0;
        Object[] objArr195 = 0 == true ? 1 : 0;
        Object[] objArr196 = 0 == true ? 1 : 0;
        Object[] objArr197 = 0 == true ? 1 : 0;
        Object[] objArr198 = 0 == true ? 1 : 0;
        Object[] objArr199 = 0 == true ? 1 : 0;
        Object[] objArr200 = 0 == true ? 1 : 0;
        Object[] objArr201 = 0 == true ? 1 : 0;
        Object[] objArr202 = 0 == true ? 1 : 0;
        Object[] objArr203 = 0 == true ? 1 : 0;
        Object[] objArr204 = 0 == true ? 1 : 0;
        Object[] objArr205 = 0 == true ? 1 : 0;
        Object[] objArr206 = 0 == true ? 1 : 0;
        Object[] objArr207 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, 0, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, objArr54, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, objArr85, objArr86, objArr87, objArr88, objArr89, 0 == true ? 1 : 0, objArr90, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, objArr103, objArr104, objArr105, objArr106, objArr107, objArr108, objArr109, objArr110, objArr111, objArr112, objArr113, objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, objArr121, objArr122, objArr123, objArr124, objArr125, objArr126, objArr127, objArr128, objArr129, objArr130, objArr131, objArr132, objArr133, objArr134, objArr135, objArr136, objArr137, objArr138, objArr139, objArr140, objArr141, objArr142, objArr143, objArr144, objArr145, objArr146, objArr147, objArr148, objArr149, objArr150, objArr151, objArr152, objArr153, objArr154, objArr155, objArr156, objArr157, objArr158, objArr159, objArr160, objArr161, objArr162, objArr163, objArr164, objArr165, objArr166, objArr167, objArr168, objArr169, objArr170, objArr171, objArr172, objArr173, objArr174, objArr175, objArr176, objArr177, objArr178, objArr179, objArr180, objArr181, objArr182, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr183, 0 == true ? 1 : 0, objArr184, objArr185, objArr186, objArr187, objArr188, objArr189, objArr190, objArr191, objArr192, objArr193, objArr194, objArr195, objArr196, objArr197, objArr198, objArr199, objArr200, objArr201, objArr202, objArr203, objArr204, objArr205, objArr206, i, i, i, i, i, i, 2097151, objArr207);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreativeModel)) {
            return false;
        }
        CreativeModel creativeModel = (CreativeModel) obj;
        return Intrinsics.LJFF(this.initialModel, creativeModel.initialModel) && Intrinsics.LJFF(this.eventData, creativeModel.eventData) && Intrinsics.LJFF(this.recordData, creativeModel.recordData) && Intrinsics.LJFF(this.recordEffectModel, creativeModel.recordEffectModel) && Intrinsics.LJFF(this.loadMusicAndEffectModel, creativeModel.loadMusicAndEffectModel) && Intrinsics.LJFF(this.recordDowngradeModel, creativeModel.recordDowngradeModel) && Intrinsics.LJFF(this.reuseSoundAndEffectModel, creativeModel.reuseSoundAndEffectModel) && Intrinsics.LJFF(this.ayMobCacheModel, creativeModel.ayMobCacheModel) && Intrinsics.LJFF(this.landingModel, creativeModel.landingModel) && Intrinsics.LJFF(this.musicAndTimeModel, creativeModel.musicAndTimeModel) && Intrinsics.LJFF(this.flashModel, creativeModel.flashModel) && Intrinsics.LJFF(this.beautyModel, creativeModel.beautyModel) && Intrinsics.LJFF(this.countDownModel, creativeModel.countDownModel) && Intrinsics.LJFF(this.recordMobModel, creativeModel.recordMobModel) && Intrinsics.LJFF(this.shootLinkPerfMobModel, creativeModel.shootLinkPerfMobModel) && Intrinsics.LJFF(this.albumModel, creativeModel.albumModel) && Intrinsics.LJFF(this.greenScreenEffectModel, creativeModel.greenScreenEffectModel) && Intrinsics.LJFF(this.newGreenScreenEffectModel, creativeModel.newGreenScreenEffectModel) && Intrinsics.LJFF(this.importModel, creativeModel.importModel) && Intrinsics.LJFF(this.albumMobModel, creativeModel.albumMobModel) && Intrinsics.LJFF(this.volumeInfoModel, creativeModel.volumeInfoModel) && Intrinsics.LJFF(this.musicVolumeInfoModel, creativeModel.musicVolumeInfoModel) && Intrinsics.LJFF(this.soundEffectInfoModel, creativeModel.soundEffectInfoModel) && Intrinsics.LJFF(this.musicBuzModel, creativeModel.musicBuzModel) && Intrinsics.LJFF(this.mdpInfoModel, creativeModel.mdpInfoModel) && Intrinsics.LJFF(this.stickPointModel, creativeModel.stickPointModel) && Intrinsics.LJFF(this.cutSameModel, creativeModel.cutSameModel) && Intrinsics.LJFF(this.editModel, creativeModel.editModel) && Intrinsics.LJFF(this.canvasVideoData, creativeModel.canvasVideoData) && Intrinsics.LJFF(this.editEffectModel, creativeModel.editEffectModel) && Intrinsics.LJFF(this.editBackSaveModel, creativeModel.editBackSaveModel) && Intrinsics.LJFF(this.nleInfoModel, creativeModel.nleInfoModel) && Intrinsics.LJFF(this.editStickerModel, creativeModel.editStickerModel) && Intrinsics.LJFF(this.editorProAIGCInfoModel, creativeModel.editorProAIGCInfoModel) && Intrinsics.LJFF(this.infoStickerModel, creativeModel.infoStickerModel) && Intrinsics.LJFF(this.infoStickerCategoryParams, creativeModel.infoStickerCategoryParams) && Intrinsics.LJFF(this.editVideoEnhanceModel, creativeModel.editVideoEnhanceModel) && Intrinsics.LJFF(this.editSaveLocalModel, creativeModel.editSaveLocalModel) && Intrinsics.LJFF(this.cut2EditTransferModel, creativeModel.cut2EditTransferModel) && Intrinsics.LJFF(this.editPageRestoreActivityModel, creativeModel.editPageRestoreActivityModel) && this.mRestoreType == creativeModel.mRestoreType && Intrinsics.LJFF(this.creationTypeModel, creativeModel.creationTypeModel) && Intrinsics.LJFF(this.imageAlbumModel, creativeModel.imageAlbumModel) && Intrinsics.LJFF(this.editPhotoModel, creativeModel.editPhotoModel) && Intrinsics.LJFF(this.imageEditModel, creativeModel.imageEditModel) && Intrinsics.LJFF(this.aiCoverMobModel, creativeModel.aiCoverMobModel) && Intrinsics.LJFF(this.imagePublishModel, creativeModel.imagePublishModel) && Intrinsics.LJFF(this.imagePublishBackSaveModel, creativeModel.imagePublishBackSaveModel) && Intrinsics.LJFF(this.soundSyncModel, creativeModel.soundSyncModel) && Intrinsics.LJFF(this.filterModel, creativeModel.filterModel) && Intrinsics.LJFF(this.recordFilterModel, creativeModel.recordFilterModel) && Intrinsics.LJFF(this.mirrorMode, creativeModel.mirrorMode) && Intrinsics.LJFF(this.duetModel, creativeModel.duetModel) && Intrinsics.LJFF(this.effectEntrancePosition, creativeModel.effectEntrancePosition) && Intrinsics.LJFF(this.effectCarouselAction, creativeModel.effectCarouselAction) && this.effectCarouselIndex == creativeModel.effectCarouselIndex && Intrinsics.LJFF(this.stitchModel, creativeModel.stitchModel) && Intrinsics.LJFF(this.mobileEffectsModel2, creativeModel.mobileEffectsModel2) && Intrinsics.LJFF(this.prePublishStatusModel, creativeModel.prePublishStatusModel) && Intrinsics.LJFF(this.postPageModel, creativeModel.postPageModel) && Intrinsics.LJFF(this.followUpPublishTrackerModel, creativeModel.followUpPublishTrackerModel) && Intrinsics.LJFF(this.postLandingModel, creativeModel.postLandingModel) && Intrinsics.LJFF(this.publishPreviewModel, creativeModel.publishPreviewModel) && Intrinsics.LJFF(this.publishModel, creativeModel.publishModel) && Intrinsics.LJFF(this.storyPublishNetworkInfo, creativeModel.storyPublishNetworkInfo) && Intrinsics.LJFF(this.publishSecureModel, creativeModel.publishSecureModel) && Intrinsics.LJFF(this.sparkPublishModel, creativeModel.sparkPublishModel) && Intrinsics.LJFF(this.text2ImageModel, creativeModel.text2ImageModel) && Intrinsics.LJFF(this.publishCustomCoverModel, creativeModel.publishCustomCoverModel) && Intrinsics.LJFF(this.publishMobParams, creativeModel.publishMobParams) && Intrinsics.LJFF(this.coverPublishModel, creativeModel.coverPublishModel) && Intrinsics.LJFF(this.draftInfoModel, creativeModel.draftInfoModel) && Intrinsics.LJFF(this.micDataModel, creativeModel.micDataModel) && Intrinsics.LJFF(this.checkPointModel, creativeModel.checkPointModel) && Intrinsics.LJFF(this.loudnessBalanceModel, creativeModel.loudnessBalanceModel) && Intrinsics.LJFF(this.audioAlgorithmModel, creativeModel.audioAlgorithmModel) && Intrinsics.LJFF(this.audioVolumeAdjustModel, creativeModel.audioVolumeAdjustModel) && Intrinsics.LJFF(this.audioCopyrightDetectModel, creativeModel.audioCopyrightDetectModel) && Intrinsics.LJFF(this.voiceConversionModel, creativeModel.voiceConversionModel) && Intrinsics.LJFF(this.reuseAwemeTTSAndVCRefIDsModel, creativeModel.reuseAwemeTTSAndVCRefIDsModel) && Intrinsics.LJFF(this.ttsVoiceInfo, creativeModel.ttsVoiceInfo) && Intrinsics.LJFF(this.instantCloneConsumption, creativeModel.instantCloneConsumption) && Intrinsics.LJFF(this.mixEditingModel, creativeModel.mixEditingModel) && Intrinsics.LJFF(this.ttsModel, creativeModel.ttsModel) && Intrinsics.LJFF(this.capcutVcTTSModel, creativeModel.capcutVcTTSModel) && Intrinsics.LJFF(this.streamVoiceConversionModel, creativeModel.streamVoiceConversionModel) && Intrinsics.LJFF(this.veAudioEffectParam, creativeModel.veAudioEffectParam) && Intrinsics.LJFF(this.originalSoundModel, creativeModel.originalSoundModel) && Intrinsics.LJFF(this.ttsVoiceModel, creativeModel.ttsVoiceModel) && Intrinsics.LJFF(this.ttsStickerModel, creativeModel.ttsStickerModel) && Intrinsics.LJFF(this.audioAECModel, creativeModel.audioAECModel) && Intrinsics.LJFF(this.audioLoudnessModel, creativeModel.audioLoudnessModel) && this.ifRecordWithHeadset == creativeModel.ifRecordWithHeadset && Intrinsics.LJFF(this.nowsShootModel, creativeModel.nowsShootModel) && Intrinsics.LJFF(this.dmMediaModel, creativeModel.dmMediaModel) && Intrinsics.LJFF(this.pcsPaidVideoMediaModel, creativeModel.pcsPaidVideoMediaModel) && Intrinsics.LJFF(this.effectData, creativeModel.effectData) && Intrinsics.LJFF(this.commerceModel, creativeModel.commerceModel) && Intrinsics.LJFF(this.scheduleTime, creativeModel.scheduleTime) && Intrinsics.LJFF(this.aiDubbing, creativeModel.aiDubbing) && Intrinsics.LJFF(this.inlineCaptionModel, creativeModel.inlineCaptionModel) && Intrinsics.LJFF(this.inlineCaptionExperimentInformation, creativeModel.inlineCaptionExperimentInformation) && Intrinsics.LJFF(this.autoCutModel, creativeModel.autoCutModel) && Intrinsics.LJFF(this.autoPickModel, creativeModel.autoPickModel) && Intrinsics.LJFF(this.autoCutAnchorModel, creativeModel.autoCutAnchorModel) && Intrinsics.LJFF(this.photoModeAutoCutModel, creativeModel.photoModeAutoCutModel) && Intrinsics.LJFF(this.photoModeEnterEditingStage, creativeModel.photoModeEnterEditingStage) && Intrinsics.LJFF(this.templateSchemaData, creativeModel.templateSchemaData) && Intrinsics.LJFF(this.ugcTemplateData, creativeModel.ugcTemplateData) && Intrinsics.LJFF(this.photoModeTemplateData, creativeModel.photoModeTemplateData) && Intrinsics.LJFF(this.photoTemplateInfo, creativeModel.photoTemplateInfo) && Intrinsics.LJFF(this.imageEffectTemplateData, creativeModel.imageEffectTemplateData) && Intrinsics.LJFF(this.pugcTemplateData, creativeModel.pugcTemplateData) && Intrinsics.LJFF(this.mvModel, creativeModel.mvModel) && Intrinsics.LJFF(this.templateDynamicSlotModel, creativeModel.templateDynamicSlotModel) && Intrinsics.LJFF(this.templateData, creativeModel.templateData) && Intrinsics.LJFF(this.templateAnchorData, creativeModel.templateAnchorData) && Intrinsics.LJFF(this.templateConsumeData, creativeModel.templateConsumeData) && Intrinsics.LJFF(this.editPostModel, creativeModel.editPostModel) && Intrinsics.LJFF(this.video2StickerModel, creativeModel.video2StickerModel) && Intrinsics.LJFF(this.trendingUploadModel, creativeModel.trendingUploadModel) && Intrinsics.LJFF(this.hdrModel, creativeModel.hdrModel) && Intrinsics.LJFF(this.bytevcVC1Model, creativeModel.bytevcVC1Model) && Intrinsics.LJFF(this.commonMobModel, creativeModel.commonMobModel) && Intrinsics.LJFF(this.privacySettingModel, creativeModel.privacySettingModel) && Intrinsics.LJFF(this.creatorModel, creativeModel.creatorModel) && Intrinsics.LJFF(this.ansaPromptModel, creativeModel.ansaPromptModel) && Intrinsics.LJFF(this.changeAvatarModel, creativeModel.changeAvatarModel) && Intrinsics.LJFF(this.onThisDayData, creativeModel.onThisDayData) && Intrinsics.LJFF(this.celebrationData, creativeModel.celebrationData) && Intrinsics.LJFF(this.musicShareStoryData, creativeModel.musicShareStoryData) && Intrinsics.LJFF(this.stickerModel, creativeModel.stickerModel) && Intrinsics.LJFF(this.publishItemTrackModel, creativeModel.publishItemTrackModel) && Intrinsics.LJFF(this.magicCombineEffectModel, creativeModel.magicCombineEffectModel) && Intrinsics.LJFF(this.paidContentModel, creativeModel.paidContentModel) && Intrinsics.LJFF(this.storyModel, creativeModel.storyModel) && Intrinsics.LJFF(this.storyEditModel, creativeModel.storyEditModel) && Intrinsics.LJFF(this.ttStoryUploadModel, creativeModel.ttStoryUploadModel) && Intrinsics.LJFF(this.textPublishUploadModel, creativeModel.textPublishUploadModel) && Intrinsics.LJFF(this.collabInfoModel, creativeModel.collabInfoModel) && Intrinsics.LJFF(this.streaksData, creativeModel.streaksData) && Intrinsics.LJFF(this.storyEventStickerData, creativeModel.storyEventStickerData) && Intrinsics.LJFF(this.extractFramesModel, creativeModel.extractFramesModel) && Intrinsics.LJFF(this.socialModel, creativeModel.socialModel) && Intrinsics.LJFF(this.creativeFlowData, creativeModel.creativeFlowData) && Intrinsics.LJFF(this.creativeInfo, creativeModel.creativeInfo) && Intrinsics.LJFF(this.microAppModel, creativeModel.microAppModel) && Intrinsics.LJFF(this.uploadMiscInfoStruct, creativeModel.uploadMiscInfoStruct) && Intrinsics.LJFF(this.poiData, creativeModel.poiData) && Intrinsics.LJFF(this.poiDataFromLynx, creativeModel.poiDataFromLynx) && Intrinsics.LJFF(this.poiPostDataFromSchema, creativeModel.poiPostDataFromSchema) && Intrinsics.LJFF(this.poiLynxInfoModel, creativeModel.poiLynxInfoModel) && Intrinsics.LJFF(this.poiMobParams, creativeModel.poiMobParams) && Intrinsics.LJFF(this.gpsConsumingOptModel, creativeModel.gpsConsumingOptModel) && Intrinsics.LJFF(this.customParcelableExtraInfo, creativeModel.customParcelableExtraInfo) && Intrinsics.LJFF(this.editorProDraftModel, creativeModel.editorProDraftModel) && Intrinsics.LJFF(this.editorProSchemeModel, creativeModel.editorProSchemeModel) && Intrinsics.LJFF(this.openPlatformModel, creativeModel.openPlatformModel) && Intrinsics.LJFF(this.migrateModel, creativeModel.migrateModel) && Intrinsics.LJFF(this.enterFromH5Type, creativeModel.enterFromH5Type) && Intrinsics.LJFF(this.aiSelfModel, creativeModel.aiSelfModel) && Intrinsics.LJFF(this.aiSelfScanFaceModel, creativeModel.aiSelfScanFaceModel) && Intrinsics.LJFF(this.restoreModel, creativeModel.restoreModel) && Intrinsics.LJFF(this.tangramTempModel, creativeModel.tangramTempModel) && Intrinsics.LJFF(this.tangramPersistenceModel, creativeModel.tangramPersistenceModel) && Intrinsics.LJFF(this.gamePoiModel, creativeModel.gamePoiModel) && Intrinsics.LJFF(this.productRecommendModel, creativeModel.productRecommendModel) && Intrinsics.LJFF(this.aiCreateModel, creativeModel.aiCreateModel) && Intrinsics.LJFF(this.liveRecordModel, creativeModel.liveRecordModel) && Intrinsics.LJFF(this.mediaLocationMetaDataList, creativeModel.mediaLocationMetaDataList) && Intrinsics.LJFF(this.productPath, creativeModel.productPath) && Intrinsics.LJFF(this.successFlag, creativeModel.successFlag) && Intrinsics.LJFF(this.propFromGroupModel, creativeModel.propFromGroupModel) && Intrinsics.LJFF(this.feedPropPinModel, creativeModel.feedPropPinModel) && Intrinsics.LJFF(this.propShowModel, creativeModel.propShowModel) && Intrinsics.LJFF(this.failFlag, creativeModel.failFlag) && Intrinsics.LJFF(this.aigcExtraModel, creativeModel.aigcExtraModel) && Intrinsics.LJFF(this.templateDebugId, creativeModel.templateDebugId) && Intrinsics.LJFF(this.templateDebugType, creativeModel.templateDebugType) && Intrinsics.LJFF(this.creatorAppModel, creativeModel.creatorAppModel) && Intrinsics.LJFF(this.groupId, creativeModel.groupId) && Intrinsics.LJFF(this.shootEnterFrom, creativeModel.shootEnterFrom) && Intrinsics.LJFF(this.dmGroupShotTemplateModel, creativeModel.dmGroupShotTemplateModel) && Intrinsics.LJFF(this.miniGameData, creativeModel.miniGameData) && Intrinsics.LJFF(this.asyncFuncList, creativeModel.asyncFuncList) && Intrinsics.LJFF(this.asyncTaskIds, creativeModel.asyncTaskIds) && this.isFromEditTab == creativeModel.isFromEditTab && this.isFromEditTabUpload == creativeModel.isFromEditTabUpload && Intrinsics.LJFF(this.asyncTaskCount, creativeModel.asyncTaskCount) && this.isAsyncTaskFailed == creativeModel.isAsyncTaskFailed && Intrinsics.LJFF(this.asyncSource, creativeModel.asyncSource) && Intrinsics.LJFF(this.asyncStatus, creativeModel.asyncStatus) && Intrinsics.LJFF(this.aiLivePhotoModel, creativeModel.aiLivePhotoModel) && Intrinsics.LJFF(this.aigcBusinessModel, creativeModel.aigcBusinessModel) && Intrinsics.LJFF(this.aigcWorkflowModel, creativeModel.aigcWorkflowModel) && Intrinsics.LJFF(this.newVideoPipelineExtraModel, creativeModel.newVideoPipelineExtraModel) && Intrinsics.LJFF(this.detailPageRecallDraftModel, creativeModel.detailPageRecallDraftModel) && Intrinsics.LJFF(this.draftBoxModel, creativeModel.draftBoxModel) && Intrinsics.LJFF(this.livePhotoModel, creativeModel.livePhotoModel) && Intrinsics.LJFF(this.aigcOfflineModel, creativeModel.aigcOfflineModel) && Intrinsics.LJFF(this.aigcMetadataModel, creativeModel.aigcMetadataModel) && Intrinsics.LJFF(this.landscapeVideoModel, creativeModel.landscapeVideoModel) && Intrinsics.LJFF(this.cameraLayoutModel, creativeModel.cameraLayoutModel) && Intrinsics.LJFF(this.aiChatGenModel, creativeModel.aiChatGenModel) && Intrinsics.LJFF(this.creationSearchModel, creativeModel.creationSearchModel) && Intrinsics.LJFF(this.videoImageSeparateSwitchModel, creativeModel.videoImageSeparateSwitchModel) && Intrinsics.LJFF(this.quickGridModel, creativeModel.quickGridModel) && Intrinsics.LJFF(this.mixStickerInfo, creativeModel.mixStickerInfo) && Intrinsics.LJFF(this.declarationModel, creativeModel.declarationModel) && Intrinsics.LJFF(this.liveModel, creativeModel.liveModel) && Intrinsics.LJFF(this.povModel, creativeModel.povModel) && Intrinsics.LJFF(this.albumOpenApiModel, creativeModel.albumOpenApiModel) && Intrinsics.LJFF(this.recordConflictsModel, creativeModel.recordConflictsModel);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.initialModel.hashCode() * 31) + this.eventData.hashCode()) * 31) + this.recordData.hashCode()) * 31) + this.recordEffectModel.hashCode()) * 31) + this.loadMusicAndEffectModel.hashCode()) * 31) + this.recordDowngradeModel.hashCode()) * 31) + this.reuseSoundAndEffectModel.hashCode()) * 31) + this.ayMobCacheModel.hashCode()) * 31) + this.landingModel.hashCode()) * 31;
        MusicAndTimeModel musicAndTimeModel = this.musicAndTimeModel;
        int iHashCode2 = (((((((((((((((((((((((((((((((((iHashCode + (musicAndTimeModel == null ? 0 : musicAndTimeModel.hashCode())) * 31) + this.flashModel.hashCode()) * 31) + this.beautyModel.hashCode()) * 31) + this.countDownModel.hashCode()) * 31) + this.recordMobModel.hashCode()) * 31) + this.shootLinkPerfMobModel.hashCode()) * 31) + this.albumModel.hashCode()) * 31) + this.greenScreenEffectModel.hashCode()) * 31) + this.newGreenScreenEffectModel.hashCode()) * 31) + this.importModel.hashCode()) * 31) + this.albumMobModel.hashCode()) * 31) + this.volumeInfoModel.hashCode()) * 31) + this.musicVolumeInfoModel.hashCode()) * 31) + this.soundEffectInfoModel.hashCode()) * 31) + this.musicBuzModel.hashCode()) * 31) + this.mdpInfoModel.hashCode()) * 31) + this.stickPointModel.hashCode()) * 31;
        CutSameModel cutSameModel = this.cutSameModel;
        int iHashCode3 = (((iHashCode2 + (cutSameModel == null ? 0 : cutSameModel.hashCode())) * 31) + this.editModel.hashCode()) * 31;
        CanvasVideoData canvasVideoData = this.canvasVideoData;
        int iHashCode4 = (((((((((((iHashCode3 + (canvasVideoData == null ? 0 : canvasVideoData.hashCode())) * 31) + this.editEffectModel.hashCode()) * 31) + this.editBackSaveModel.hashCode()) * 31) + this.nleInfoModel.hashCode()) * 31) + this.editStickerModel.hashCode()) * 31) + this.editorProAIGCInfoModel.hashCode()) * 31;
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        int iHashCode5 = (iHashCode4 + (infoStickerModel == null ? 0 : infoStickerModel.hashCode())) * 31;
        InfoStickerCategoryParams infoStickerCategoryParams = this.infoStickerCategoryParams;
        int iHashCode6 = (((((iHashCode5 + (infoStickerCategoryParams == null ? 0 : infoStickerCategoryParams.hashCode())) * 31) + this.editVideoEnhanceModel.hashCode()) * 31) + this.editSaveLocalModel.hashCode()) * 31;
        Cut2EditTransferModel cut2EditTransferModel = this.cut2EditTransferModel;
        int iHashCode7 = (((((((iHashCode6 + (cut2EditTransferModel == null ? 0 : cut2EditTransferModel.hashCode())) * 31) + this.editPageRestoreActivityModel.hashCode()) * 31) + this.mRestoreType) * 31) + this.creationTypeModel.hashCode()) * 31;
        ImageAlbumData imageAlbumData = this.imageAlbumModel;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((((((iHashCode7 + (imageAlbumData == null ? 0 : imageAlbumData.hashCode())) * 31) + this.editPhotoModel.hashCode()) * 31) + this.imageEditModel.hashCode()) * 31) + this.aiCoverMobModel.hashCode()) * 31) + this.imagePublishModel.hashCode()) * 31) + this.imagePublishBackSaveModel.hashCode()) * 31) + this.soundSyncModel.hashCode()) * 31) + this.filterModel.hashCode()) * 31) + this.recordFilterModel.hashCode()) * 31) + this.mirrorMode.hashCode()) * 31) + this.duetModel.hashCode()) * 31) + this.effectEntrancePosition.hashCode()) * 31) + this.effectCarouselAction.hashCode()) * 31) + this.effectCarouselIndex) * 31) + this.stitchModel.hashCode()) * 31) + this.mobileEffectsModel2.hashCode()) * 31) + this.prePublishStatusModel.hashCode()) * 31) + this.postPageModel.hashCode()) * 31) + this.followUpPublishTrackerModel.hashCode()) * 31) + this.postLandingModel.hashCode()) * 31) + this.publishPreviewModel.hashCode()) * 31) + this.publishModel.hashCode()) * 31;
        StoryPublishNetworkInfo storyPublishNetworkInfo = this.storyPublishNetworkInfo;
        int iHashCode9 = (((((((((((iHashCode8 + (storyPublishNetworkInfo == null ? 0 : storyPublishNetworkInfo.hashCode())) * 31) + this.publishSecureModel.hashCode()) * 31) + this.sparkPublishModel.hashCode()) * 31) + this.text2ImageModel.hashCode()) * 31) + this.publishCustomCoverModel.hashCode()) * 31) + this.publishMobParams.hashCode()) * 31;
        CoverPublishModel coverPublishModel = this.coverPublishModel;
        int iHashCode10 = (((((((((((((((((((((((((((((((iHashCode9 + (coverPublishModel == null ? 0 : coverPublishModel.hashCode())) * 31) + this.draftInfoModel.hashCode()) * 31) + this.micDataModel.hashCode()) * 31) + this.checkPointModel.hashCode()) * 31) + this.loudnessBalanceModel.hashCode()) * 31) + this.audioAlgorithmModel.hashCode()) * 31) + this.audioVolumeAdjustModel.hashCode()) * 31) + this.audioCopyrightDetectModel.hashCode()) * 31) + this.voiceConversionModel.hashCode()) * 31) + this.reuseAwemeTTSAndVCRefIDsModel.hashCode()) * 31) + this.ttsVoiceInfo.hashCode()) * 31) + this.instantCloneConsumption.hashCode()) * 31) + this.mixEditingModel.hashCode()) * 31) + this.ttsModel.hashCode()) * 31) + this.capcutVcTTSModel.hashCode()) * 31) + this.streamVoiceConversionModel.hashCode()) * 31;
        AudioEffectParam audioEffectParam = this.veAudioEffectParam;
        int iHashCode11 = (((iHashCode10 + (audioEffectParam == null ? 0 : audioEffectParam.hashCode())) * 31) + this.originalSoundModel.hashCode()) * 31;
        TTSVoiceModel tTSVoiceModel = this.ttsVoiceModel;
        int iHashCode12 = (((((((((iHashCode11 + (tTSVoiceModel == null ? 0 : tTSVoiceModel.hashCode())) * 31) + this.ttsStickerModel.hashCode()) * 31) + this.audioAECModel.hashCode()) * 31) + this.audioLoudnessModel.hashCode()) * 31) + C786410Ut5.Z2(this.ifRecordWithHeadset)) * 31;
        NowsShootModel nowsShootModel = this.nowsShootModel;
        int iHashCode13 = (iHashCode12 + (nowsShootModel == null ? 0 : nowsShootModel.hashCode())) * 31;
        DMMediaModel dMMediaModel = this.dmMediaModel;
        int iHashCode14 = (iHashCode13 + (dMMediaModel == null ? 0 : dMMediaModel.hashCode())) * 31;
        PcsCourseVideoModel pcsCourseVideoModel = this.pcsPaidVideoMediaModel;
        int iHashCode15 = (((((iHashCode14 + (pcsCourseVideoModel == null ? 0 : pcsCourseVideoModel.hashCode())) * 31) + this.effectData.hashCode()) * 31) + this.commerceModel.hashCode()) * 31;
        SchedulePostTime schedulePostTime = this.scheduleTime;
        int iHashCode16 = (iHashCode15 + (schedulePostTime == null ? 0 : schedulePostTime.hashCode())) * 31;
        AIDubbing aIDubbing = this.aiDubbing;
        int iHashCode17 = (iHashCode16 + (aIDubbing == null ? 0 : aIDubbing.hashCode())) * 31;
        InlineCaptionModel inlineCaptionModel = this.inlineCaptionModel;
        int iHashCode18 = (iHashCode17 + (inlineCaptionModel == null ? 0 : inlineCaptionModel.hashCode())) * 31;
        InlineCaptionExperimentInformation inlineCaptionExperimentInformation = this.inlineCaptionExperimentInformation;
        int iHashCode19 = (((((((((((((((((iHashCode18 + (inlineCaptionExperimentInformation == null ? 0 : inlineCaptionExperimentInformation.hashCode())) * 31) + this.autoCutModel.hashCode()) * 31) + this.autoPickModel.hashCode()) * 31) + this.autoCutAnchorModel.hashCode()) * 31) + this.photoModeAutoCutModel.hashCode()) * 31) + this.photoModeEnterEditingStage.hashCode()) * 31) + this.templateSchemaData.hashCode()) * 31) + this.ugcTemplateData.hashCode()) * 31) + this.photoModeTemplateData.hashCode()) * 31;
        PhotoTemplateInfo photoTemplateInfo = this.photoTemplateInfo;
        int iHashCode20 = (((((((iHashCode19 + (photoTemplateInfo == null ? 0 : photoTemplateInfo.hashCode())) * 31) + this.imageEffectTemplateData.hashCode()) * 31) + this.pugcTemplateData.hashCode()) * 31) + this.mvModel.hashCode()) * 31;
        TemplateDynamicSlotModel templateDynamicSlotModel = this.templateDynamicSlotModel;
        int iHashCode21 = (((((((iHashCode20 + (templateDynamicSlotModel == null ? 0 : templateDynamicSlotModel.hashCode())) * 31) + this.templateData.hashCode()) * 31) + this.templateAnchorData.hashCode()) * 31) + this.templateConsumeData.hashCode()) * 31;
        EditPostModel editPostModel = this.editPostModel;
        int iHashCode22 = (iHashCode21 + (editPostModel == null ? 0 : editPostModel.hashCode())) * 31;
        Video2StickerModel video2StickerModel = this.video2StickerModel;
        int iHashCode23 = (((((((((((((((((((iHashCode22 + (video2StickerModel == null ? 0 : video2StickerModel.hashCode())) * 31) + this.trendingUploadModel.hashCode()) * 31) + this.hdrModel.hashCode()) * 31) + this.bytevcVC1Model.hashCode()) * 31) + this.commonMobModel.hashCode()) * 31) + this.privacySettingModel.hashCode()) * 31) + this.creatorModel.hashCode()) * 31) + this.ansaPromptModel.hashCode()) * 31) + this.changeAvatarModel.hashCode()) * 31) + this.onThisDayData.hashCode()) * 31;
        CelebrationData celebrationData = this.celebrationData;
        int iHashCode24 = (((((iHashCode23 + (celebrationData == null ? 0 : celebrationData.hashCode())) * 31) + this.musicShareStoryData.hashCode()) * 31) + this.stickerModel.hashCode()) * 31;
        PublishItemTrackModel publishItemTrackModel = this.publishItemTrackModel;
        int iHashCode25 = (((((((((iHashCode24 + (publishItemTrackModel == null ? 0 : publishItemTrackModel.hashCode())) * 31) + this.magicCombineEffectModel.hashCode()) * 31) + this.paidContentModel.hashCode()) * 31) + this.storyModel.hashCode()) * 31) + this.storyEditModel.hashCode()) * 31;
        TTStoryUploadModel tTStoryUploadModel = this.ttStoryUploadModel;
        int iHashCode26 = (iHashCode25 + (tTStoryUploadModel == null ? 0 : tTStoryUploadModel.hashCode())) * 31;
        TextPublishUploadModel textPublishUploadModel = this.textPublishUploadModel;
        int iHashCode27 = (((((((iHashCode26 + (textPublishUploadModel == null ? 0 : textPublishUploadModel.hashCode())) * 31) + this.collabInfoModel.hashCode()) * 31) + this.streaksData.hashCode()) * 31) + this.storyEventStickerData.hashCode()) * 31;
        ExtractFramesModel extractFramesModel = this.extractFramesModel;
        int iHashCode28 = (((((((iHashCode27 + (extractFramesModel == null ? 0 : extractFramesModel.hashCode())) * 31) + this.socialModel.hashCode()) * 31) + this.creativeFlowData.hashCode()) * 31) + this.creativeInfo.hashCode()) * 31;
        MicroAppModel microAppModel = this.microAppModel;
        int iHashCode29 = (iHashCode28 + (microAppModel == null ? 0 : microAppModel.hashCode())) * 31;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = this.uploadMiscInfoStruct;
        int iHashCode30 = (iHashCode29 + (aVUploadMiscInfoStruct == null ? 0 : aVUploadMiscInfoStruct.hashCode())) * 31;
        PoiData poiData = this.poiData;
        int iHashCode31 = (iHashCode30 + (poiData == null ? 0 : poiData.hashCode())) * 31;
        C443120HZe<PoiData, Integer, String> c443120HZe = this.poiDataFromLynx;
        int iHashCode32 = (iHashCode31 + (c443120HZe == null ? 0 : c443120HZe.hashCode())) * 31;
        PoiData poiData2 = this.poiPostDataFromSchema;
        int iHashCode33 = (((iHashCode32 + (poiData2 == null ? 0 : poiData2.hashCode())) * 31) + this.poiLynxInfoModel.hashCode()) * 31;
        PoiMobParam poiMobParam = this.poiMobParams;
        int iHashCode34 = (((iHashCode33 + (poiMobParam == null ? 0 : poiMobParam.hashCode())) * 31) + this.gpsConsumingOptModel.hashCode()) * 31;
        CustomParcelableExtraInfo customParcelableExtraInfo = this.customParcelableExtraInfo;
        int iHashCode35 = (((((((((iHashCode34 + (customParcelableExtraInfo == null ? 0 : customParcelableExtraInfo.hashCode())) * 31) + this.editorProDraftModel.hashCode()) * 31) + this.editorProSchemeModel.hashCode()) * 31) + this.openPlatformModel.hashCode()) * 31) + this.migrateModel.hashCode()) * 31;
        String str = this.enterFromH5Type;
        int iHashCode36 = (((((((iHashCode35 + (str == null ? 0 : str.hashCode())) * 31) + this.aiSelfModel.hashCode()) * 31) + this.aiSelfScanFaceModel.hashCode()) * 31) + this.restoreModel.hashCode()) * 31;
        TangramTempModel tangramTempModel = this.tangramTempModel;
        int iHashCode37 = (iHashCode36 + (tangramTempModel == null ? 0 : tangramTempModel.hashCode())) * 31;
        TangramPersistenceModel tangramPersistenceModel = this.tangramPersistenceModel;
        int iHashCode38 = (((((iHashCode37 + (tangramPersistenceModel == null ? 0 : tangramPersistenceModel.hashCode())) * 31) + this.gamePoiModel.hashCode()) * 31) + this.productRecommendModel.hashCode()) * 31;
        AICreateModel aICreateModel = this.aiCreateModel;
        int iHashCode39 = (((iHashCode38 + (aICreateModel == null ? 0 : aICreateModel.hashCode())) * 31) + this.liveRecordModel.hashCode()) * 31;
        List<MediaLocationMetaDataModel> list = this.mediaLocationMetaDataList;
        int iHashCode40 = (iHashCode39 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.productPath;
        int iHashCode41 = (iHashCode40 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.successFlag;
        int iHashCode42 = (((((((iHashCode41 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.propFromGroupModel.hashCode()) * 31) + this.feedPropPinModel.hashCode()) * 31) + this.propShowModel.hashCode()) * 31;
        String str4 = this.failFlag;
        int iHashCode43 = (((iHashCode42 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.aigcExtraModel.hashCode()) * 31;
        String str5 = this.templateDebugId;
        int iHashCode44 = (iHashCode43 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.templateDebugType;
        int iHashCode45 = (iHashCode44 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CreatorAppModel creatorAppModel = this.creatorAppModel;
        int iHashCode46 = (iHashCode45 + (creatorAppModel == null ? 0 : creatorAppModel.hashCode())) * 31;
        String str7 = this.groupId;
        int iHashCode47 = (iHashCode46 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shootEnterFrom;
        int iHashCode48 = (iHashCode47 + (str8 == null ? 0 : str8.hashCode())) * 31;
        AIGroupShotTemplateModel aIGroupShotTemplateModel = this.dmGroupShotTemplateModel;
        int iHashCode49 = (iHashCode48 + (aIGroupShotTemplateModel == null ? 0 : aIGroupShotTemplateModel.hashCode())) * 31;
        MinisGameModel minisGameModel = this.miniGameData;
        int iHashCode50 = (iHashCode49 + (minisGameModel == null ? 0 : minisGameModel.hashCode())) * 31;
        String str9 = this.asyncFuncList;
        int iHashCode51 = (((((((iHashCode50 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.asyncTaskIds.hashCode()) * 31) + C786410Ut5.Z2(this.isFromEditTab)) * 31) + C786410Ut5.Z2(this.isFromEditTabUpload)) * 31;
        Integer num = this.asyncTaskCount;
        int iHashCode52 = (((iHashCode51 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.isAsyncTaskFailed)) * 31;
        String str10 = this.asyncSource;
        int iHashCode53 = (iHashCode52 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.asyncStatus;
        int iHashCode54 = (((((((((((((iHashCode53 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.aiLivePhotoModel.hashCode()) * 31) + this.aigcBusinessModel.hashCode()) * 31) + this.aigcWorkflowModel.hashCode()) * 31) + this.newVideoPipelineExtraModel.hashCode()) * 31) + this.detailPageRecallDraftModel.hashCode()) * 31) + this.draftBoxModel.hashCode()) * 31;
        LivePhotoModel livePhotoModel = this.livePhotoModel;
        int iHashCode55 = (((((((iHashCode54 + (livePhotoModel == null ? 0 : livePhotoModel.hashCode())) * 31) + this.aigcOfflineModel.hashCode()) * 31) + this.aigcMetadataModel.hashCode()) * 31) + this.landscapeVideoModel.hashCode()) * 31;
        CameraLayoutModel cameraLayoutModel = this.cameraLayoutModel;
        int iHashCode56 = (iHashCode55 + (cameraLayoutModel == null ? 0 : cameraLayoutModel.hashCode())) * 31;
        AIChatGenModel aIChatGenModel = this.aiChatGenModel;
        int iHashCode57 = (iHashCode56 + (aIChatGenModel == null ? 0 : aIChatGenModel.hashCode())) * 31;
        CreationSearchModel creationSearchModel = this.creationSearchModel;
        int iHashCode58 = (iHashCode57 + (creationSearchModel == null ? 0 : creationSearchModel.hashCode())) * 31;
        VideoImageSeparateSwitchModel videoImageSeparateSwitchModel = this.videoImageSeparateSwitchModel;
        int iHashCode59 = (iHashCode58 + (videoImageSeparateSwitchModel == null ? 0 : videoImageSeparateSwitchModel.hashCode())) * 31;
        QuickGridModel quickGridModel = this.quickGridModel;
        int iHashCode60 = (iHashCode59 + (quickGridModel == null ? 0 : quickGridModel.hashCode())) * 31;
        MixStickerInfo mixStickerInfo = this.mixStickerInfo;
        int iHashCode61 = (iHashCode60 + (mixStickerInfo == null ? 0 : mixStickerInfo.hashCode())) * 31;
        DeclarationModel declarationModel = this.declarationModel;
        int iHashCode62 = (iHashCode61 + (declarationModel == null ? 0 : declarationModel.hashCode())) * 31;
        LiveModel liveModel = this.liveModel;
        int iHashCode63 = (iHashCode62 + (liveModel == null ? 0 : liveModel.hashCode())) * 31;
        PovModel povModel = this.povModel;
        int iHashCode64 = (iHashCode63 + (povModel == null ? 0 : povModel.hashCode())) * 31;
        AlbumOpenApiModel albumOpenApiModel = this.albumOpenApiModel;
        return ((iHashCode64 + (albumOpenApiModel != null ? albumOpenApiModel.hashCode() : 0)) * 31) + this.recordConflictsModel.hashCode();
    }

    public final String toString() {
        return "CreativeModel(initialModel=" + this.initialModel + ", eventData=" + this.eventData + ", recordData=" + this.recordData + ", recordEffectModel=" + this.recordEffectModel + ", loadMusicAndEffectModel=" + this.loadMusicAndEffectModel + ", recordDowngradeModel=" + this.recordDowngradeModel + ", reuseSoundAndEffectModel=" + this.reuseSoundAndEffectModel + ", ayMobCacheModel=" + this.ayMobCacheModel + ", landingModel=" + this.landingModel + ", musicAndTimeModel=" + this.musicAndTimeModel + ", flashModel=" + this.flashModel + ", beautyModel=" + this.beautyModel + ", countDownModel=" + this.countDownModel + ", recordMobModel=" + this.recordMobModel + ", shootLinkPerfMobModel=" + this.shootLinkPerfMobModel + ", albumModel=" + this.albumModel + ", greenScreenEffectModel=" + this.greenScreenEffectModel + ", newGreenScreenEffectModel=" + this.newGreenScreenEffectModel + ", importModel=" + this.importModel + ", albumMobModel=" + this.albumMobModel + ", volumeInfoModel=" + this.volumeInfoModel + ", musicVolumeInfoModel=" + this.musicVolumeInfoModel + ", soundEffectInfoModel=" + this.soundEffectInfoModel + ", musicBuzModel=" + this.musicBuzModel + ", mdpInfoModel=" + this.mdpInfoModel + ", stickPointModel=" + this.stickPointModel + ", cutSameModel=" + this.cutSameModel + ", editModel=" + this.editModel + ", canvasVideoData=" + this.canvasVideoData + ", editEffectModel=" + this.editEffectModel + ", editBackSaveModel=" + this.editBackSaveModel + ", nleInfoModel=" + this.nleInfoModel + ", editStickerModel=" + this.editStickerModel + ", editorProAIGCInfoModel=" + this.editorProAIGCInfoModel + ", infoStickerModel=" + this.infoStickerModel + ", infoStickerCategoryParams=" + this.infoStickerCategoryParams + ", editVideoEnhanceModel=" + this.editVideoEnhanceModel + ", editSaveLocalModel=" + this.editSaveLocalModel + ", cut2EditTransferModel=" + this.cut2EditTransferModel + ", editPageRestoreActivityModel=" + this.editPageRestoreActivityModel + ", mRestoreType=" + this.mRestoreType + ", creationTypeModel=" + this.creationTypeModel + ", imageAlbumModel=" + this.imageAlbumModel + ", editPhotoModel=" + this.editPhotoModel + ", imageEditModel=" + this.imageEditModel + ", aiCoverMobModel=" + this.aiCoverMobModel + ", imagePublishModel=" + this.imagePublishModel + ", imagePublishBackSaveModel=" + this.imagePublishBackSaveModel + ", soundSyncModel=" + this.soundSyncModel + ", filterModel=" + this.filterModel + ", recordFilterModel=" + this.recordFilterModel + ", mirrorMode=" + this.mirrorMode + ", duetModel=" + this.duetModel + ", effectEntrancePosition=" + this.effectEntrancePosition + ", effectCarouselAction=" + this.effectCarouselAction + ", effectCarouselIndex=" + this.effectCarouselIndex + ", stitchModel=" + this.stitchModel + ", mobileEffectsModel2=" + this.mobileEffectsModel2 + ", prePublishStatusModel=" + this.prePublishStatusModel + ", postPageModel=" + this.postPageModel + ", followUpPublishTrackerModel=" + this.followUpPublishTrackerModel + ", postLandingModel=" + this.postLandingModel + ", publishPreviewModel=" + this.publishPreviewModel + ", publishModel=" + this.publishModel + ", storyPublishNetworkInfo=" + this.storyPublishNetworkInfo + ", publishSecureModel=" + this.publishSecureModel + ", sparkPublishModel=" + this.sparkPublishModel + ", text2ImageModel=" + this.text2ImageModel + ", publishCustomCoverModel=" + this.publishCustomCoverModel + ", publishMobParams=" + this.publishMobParams + ", coverPublishModel=" + this.coverPublishModel + ", draftInfoModel=" + this.draftInfoModel + ", micDataModel=" + this.micDataModel + ", checkPointModel=" + this.checkPointModel + ", loudnessBalanceModel=" + this.loudnessBalanceModel + ", audioAlgorithmModel=" + this.audioAlgorithmModel + ", audioVolumeAdjustModel=" + this.audioVolumeAdjustModel + ", audioCopyrightDetectModel=" + this.audioCopyrightDetectModel + ", voiceConversionModel=" + this.voiceConversionModel + ", reuseAwemeTTSAndVCRefIDsModel=" + this.reuseAwemeTTSAndVCRefIDsModel + ", ttsVoiceInfo=" + this.ttsVoiceInfo + ", instantCloneConsumption=" + this.instantCloneConsumption + ", mixEditingModel=" + this.mixEditingModel + ", ttsModel=" + this.ttsModel + ", capcutVcTTSModel=" + this.capcutVcTTSModel + ", streamVoiceConversionModel=" + this.streamVoiceConversionModel + ", veAudioEffectParam=" + this.veAudioEffectParam + ", originalSoundModel=" + this.originalSoundModel + ", ttsVoiceModel=" + this.ttsVoiceModel + ", ttsStickerModel=" + this.ttsStickerModel + ", audioAECModel=" + this.audioAECModel + ", audioLoudnessModel=" + this.audioLoudnessModel + ", ifRecordWithHeadset=" + this.ifRecordWithHeadset + ", nowsShootModel=" + this.nowsShootModel + ", dmMediaModel=" + this.dmMediaModel + ", pcsPaidVideoMediaModel=" + this.pcsPaidVideoMediaModel + ", effectData=" + this.effectData + ", commerceModel=" + this.commerceModel + ", scheduleTime=" + this.scheduleTime + ", aiDubbing=" + this.aiDubbing + ", inlineCaptionModel=" + this.inlineCaptionModel + ", inlineCaptionExperimentInformation=" + this.inlineCaptionExperimentInformation + ", autoCutModel=" + this.autoCutModel + ", autoPickModel=" + this.autoPickModel + ", autoCutAnchorModel=" + this.autoCutAnchorModel + ", photoModeAutoCutModel=" + this.photoModeAutoCutModel + ", photoModeEnterEditingStage=" + this.photoModeEnterEditingStage + ", templateSchemaData=" + this.templateSchemaData + ", ugcTemplateData=" + this.ugcTemplateData + ", photoModeTemplateData=" + this.photoModeTemplateData + ", photoTemplateInfo=" + this.photoTemplateInfo + ", imageEffectTemplateData=" + this.imageEffectTemplateData + ", pugcTemplateData=" + this.pugcTemplateData + ", mvModel=" + this.mvModel + ", templateDynamicSlotModel=" + this.templateDynamicSlotModel + ", templateData=" + this.templateData + ", templateAnchorData=" + this.templateAnchorData + ", templateConsumeData=" + this.templateConsumeData + ", editPostModel=" + this.editPostModel + ", video2StickerModel=" + this.video2StickerModel + ", trendingUploadModel=" + this.trendingUploadModel + ", hdrModel=" + this.hdrModel + ", bytevcVC1Model=" + this.bytevcVC1Model + ", commonMobModel=" + this.commonMobModel + ", privacySettingModel=" + this.privacySettingModel + ", creatorModel=" + this.creatorModel + ", ansaPromptModel=" + this.ansaPromptModel + ", changeAvatarModel=" + this.changeAvatarModel + ", onThisDayData=" + this.onThisDayData + ", celebrationData=" + this.celebrationData + ", musicShareStoryData=" + this.musicShareStoryData + ", stickerModel=" + this.stickerModel + ", publishItemTrackModel=" + this.publishItemTrackModel + ", magicCombineEffectModel=" + this.magicCombineEffectModel + ", paidContentModel=" + this.paidContentModel + ", storyModel=" + this.storyModel + ", storyEditModel=" + this.storyEditModel + ", ttStoryUploadModel=" + this.ttStoryUploadModel + ", textPublishUploadModel=" + this.textPublishUploadModel + ", collabInfoModel=" + this.collabInfoModel + ", streaksData=" + this.streaksData + ", storyEventStickerData=" + this.storyEventStickerData + ", extractFramesModel=" + this.extractFramesModel + ", socialModel=" + this.socialModel + ", creativeFlowData=" + this.creativeFlowData + ", creativeInfo=" + this.creativeInfo + ", microAppModel=" + this.microAppModel + ", uploadMiscInfoStruct=" + this.uploadMiscInfoStruct + ", poiData=" + this.poiData + ", poiDataFromLynx=" + this.poiDataFromLynx + ", poiPostDataFromSchema=" + this.poiPostDataFromSchema + ", poiLynxInfoModel=" + this.poiLynxInfoModel + ", poiMobParams=" + this.poiMobParams + ", gpsConsumingOptModel=" + this.gpsConsumingOptModel + ", customParcelableExtraInfo=" + this.customParcelableExtraInfo + ", editorProDraftModel=" + this.editorProDraftModel + ", editorProSchemeModel=" + this.editorProSchemeModel + ", openPlatformModel=" + this.openPlatformModel + ", migrateModel=" + this.migrateModel + ", enterFromH5Type=" + this.enterFromH5Type + ", aiSelfModel=" + this.aiSelfModel + ", aiSelfScanFaceModel=" + this.aiSelfScanFaceModel + ", restoreModel=" + this.restoreModel + ", tangramTempModel=" + this.tangramTempModel + ", tangramPersistenceModel=" + this.tangramPersistenceModel + ", gamePoiModel=" + this.gamePoiModel + ", productRecommendModel=" + this.productRecommendModel + ", aiCreateModel=" + this.aiCreateModel + ", liveRecordModel=" + this.liveRecordModel + ", mediaLocationMetaDataList=" + this.mediaLocationMetaDataList + ", productPath=" + this.productPath + ", successFlag=" + this.successFlag + ", propFromGroupModel=" + this.propFromGroupModel + ", feedPropPinModel=" + this.feedPropPinModel + ", propShowModel=" + this.propShowModel + ", failFlag=" + this.failFlag + ", aigcExtraModel=" + this.aigcExtraModel + ", templateDebugId=" + this.templateDebugId + ", templateDebugType=" + this.templateDebugType + ", creatorAppModel=" + this.creatorAppModel + ", groupId=" + this.groupId + ", shootEnterFrom=" + this.shootEnterFrom + ", dmGroupShotTemplateModel=" + this.dmGroupShotTemplateModel + ", miniGameData=" + this.miniGameData + ", asyncFuncList=" + this.asyncFuncList + ", asyncTaskIds=" + this.asyncTaskIds + ", isFromEditTab=" + this.isFromEditTab + ", isFromEditTabUpload=" + this.isFromEditTabUpload + ", asyncTaskCount=" + this.asyncTaskCount + ", isAsyncTaskFailed=" + this.isAsyncTaskFailed + ", asyncSource=" + this.asyncSource + ", asyncStatus=" + this.asyncStatus + ", aiLivePhotoModel=" + this.aiLivePhotoModel + ", aigcBusinessModel=" + this.aigcBusinessModel + ", aigcWorkflowModel=" + this.aigcWorkflowModel + ", newVideoPipelineExtraModel=" + this.newVideoPipelineExtraModel + ", detailPageRecallDraftModel=" + this.detailPageRecallDraftModel + ", draftBoxModel=" + this.draftBoxModel + ", livePhotoModel=" + this.livePhotoModel + ", aigcOfflineModel=" + this.aigcOfflineModel + ", aigcMetadataModel=" + this.aigcMetadataModel + ", landscapeVideoModel=" + this.landscapeVideoModel + ", cameraLayoutModel=" + this.cameraLayoutModel + ", aiChatGenModel=" + this.aiChatGenModel + ", creationSearchModel=" + this.creationSearchModel + ", videoImageSeparateSwitchModel=" + this.videoImageSeparateSwitchModel + ", quickGridModel=" + this.quickGridModel + ", mixStickerInfo=" + this.mixStickerInfo + ", declarationModel=" + this.declarationModel + ", liveModel=" + this.liveModel + ", povModel=" + this.povModel + ", albumOpenApiModel=" + this.albumOpenApiModel + ", recordConflictsModel=" + this.recordConflictsModel + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nXD] */
    static {
        C548920Lfu.LIZ(CreativeModel.class, AFwS239S0000000_8.get$arr$(45));
    }

    public final CreativeModel LIZ() {
        Parcel parcelObtain = Parcel.obtain();
        String str = this.editorProDraftModel.nleData;
        this.editorProDraftModel.nleData = null;
        AutoCutAnchorModel autoCutAnchorModel = this.autoCutAnchorModel;
        String str2 = autoCutAnchorModel != null ? autoCutAnchorModel.nleData : null;
        C01GW c01gw = C0ABO.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            this.autoCutAnchorModel.nleData = null;
        }
        List<LyricStickerModel> list = this.stickerModel.lyricStickerModels;
        if (C365950EWj.LIZ()) {
            this.stickerModel.lyricStickerModels = new ArrayList();
        }
        parcelObtain.writeValue(this);
        parcelObtain.setDataPosition(0);
        CreativeModel creativeModel = (CreativeModel) parcelObtain.readValue(CreativeModel.class.getClassLoader());
        creativeModel.editorProDraftModel.nleData = str;
        this.editorProDraftModel.nleData = str;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            creativeModel.autoCutAnchorModel.nleData = str2;
            this.autoCutAnchorModel.nleData = str2;
        }
        if (C365950EWj.LIZ()) {
            this.stickerModel.lyricStickerModels = list;
            creativeModel.stickerModel.lyricStickerModels = new ArrayList(list);
        }
        parcelObtain.recycle();
        return creativeModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v416 */
    /* JADX WARN: Type inference failed for: r0v417 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r205v33 */
    /* JADX WARN: Type inference failed for: r205v34 */
    /* JADX WARN: Type inference failed for: r205v35 */
    /* JADX WARN: Type inference failed for: r205v36 */
    /* JADX WARN: Type inference failed for: r205v37 */
    /* JADX WARN: Type inference failed for: r205v38 */
    /* JADX WARN: Type inference failed for: r205v39 */
    /* JADX WARN: Type inference failed for: r205v40 */
    /* JADX WARN: Type inference failed for: r205v41 */
    /* JADX WARN: Type inference failed for: r205v42 */
    /* JADX WARN: Type inference failed for: r261v38, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r262v40, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r263v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r264v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r265v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r279v9, types: [com.ss.android.ugc.aweme.creative.model.edit.Text2ImageSummary] */
    /* JADX WARN: Type inference failed for: r281v8, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r282v6, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r287v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    public /* synthetic */ CreativeModel(CreativeInitialModel creativeInitialModel, EventData eventData, RecordData recordData, RecordEffectModel recordEffectModel, LoadMusicAndEffectModel loadMusicAndEffectModel, RecordDowngradeModel recordDowngradeModel, ReuseSoundAndEffectModel reuseSoundAndEffectModel, AYMobCacheModel aYMobCacheModel, LandingModel landingModel, MusicAndTimeModel musicAndTimeModel, FlashModel flashModel, BeautyModel beautyModel, CountDownModel countDownModel, RecordMobModel recordMobModel, ShootLinkPerfMobModel shootLinkPerfMobModel, AlbumModel albumModel, GreenScreenEffectModel greenScreenEffectModel, NewGreenScreenEffectModel newGreenScreenEffectModel, ImportModel importModel, AlbumMobModel albumMobModel, VolumeInfoModel volumeInfoModel, MusicVolumeInfoModel musicVolumeInfoModel, SoundEffectInfoModel soundEffectInfoModel, MusicBuzModel musicBuzModel, MdpInfoModel mdpInfoModel, StickPointModel stickPointModel, CutSameModel cutSameModel, EditModel editModel, CanvasVideoData canvasVideoData, EditEffectModel editEffectModel, EditBackSaveModel editBackSaveModel, NLEInfoModel nLEInfoModel, EditStickerModel editStickerModel, EditorProAIGCInfoModel editorProAIGCInfoModel, InfoStickerModel infoStickerModel, InfoStickerCategoryParams infoStickerCategoryParams, EditVideoEnhanceModel editVideoEnhanceModel, EditSaveLocalModel editSaveLocalModel, Cut2EditTransferModel cut2EditTransferModel, EditPageRestoreActivityModel editPageRestoreActivityModel, int i, CreationTypeModel creationTypeModel, ImageAlbumData imageAlbumData, EditPhotoModel editPhotoModel, ImageEditModel imageEditModel, AICoverMobModel aICoverMobModel, ImagePublishModel imagePublishModel, ImagePublishBackSaveModel imagePublishBackSaveModel, SoundSyncModel soundSyncModel, FilterModel filterModel, RecordFilterModel recordFilterModel, MirrorMode mirrorMode, DuetModel duetModel, String str, String str2, int i2, StitchModel stitchModel, MobileEffectsModel2 mobileEffectsModel2, PrePublishStatusModel prePublishStatusModel, PostPageModel postPageModel, FollowUpPublishTrackerModel followUpPublishTrackerModel, PostLandingModel postLandingModel, PublishPreviewModel publishPreviewModel, PublishModel publishModel, StoryPublishNetworkInfo storyPublishNetworkInfo, PublishSecureModel publishSecureModel, SparkPublishModel sparkPublishModel, Text2ImageModel text2ImageModel, PublishCustomCoverModel publishCustomCoverModel, PublishMobParams publishMobParams, CoverPublishModel coverPublishModel, DraftInfoModel draftInfoModel, MicDataModel micDataModel, CheckPointModel checkPointModel, LoudnessBalanceModel loudnessBalanceModel, AudioAlgorithmModel audioAlgorithmModel, AudioVolumeAdjustModel audioVolumeAdjustModel, AudioCopyrightDetectModel audioCopyrightDetectModel, VoiceConversionModel voiceConversionModel, ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel, TtsVoiceInfo ttsVoiceInfo, InstantCloneConsumptionModel instantCloneConsumptionModel, MixEditingModel mixEditingModel, TTSModel tTSModel, CapcutVcTTSModel capcutVcTTSModel, StreamVoiceConversionModel streamVoiceConversionModel, AudioEffectParam audioEffectParam, OriginalSoundModel originalSoundModel, TTSVoiceModel tTSVoiceModel, TTSStickerModel tTSStickerModel, AudioAECModel audioAECModel, AudioLoudnessModel audioLoudnessModel, boolean z, NowsShootModel nowsShootModel, DMMediaModel dMMediaModel, PcsCourseVideoModel pcsCourseVideoModel, EffectDataTransport effectDataTransport, CommerceToolsModel commerceToolsModel, SchedulePostTime schedulePostTime, AIDubbing aIDubbing, InlineCaptionModel inlineCaptionModel, InlineCaptionExperimentInformation inlineCaptionExperimentInformation, AutoCutModel autoCutModel, AutoPickModel autoPickModel, AutoCutAnchorModel autoCutAnchorModel, ImageAlbumData imageAlbumData2, PhotoModeEditingStage photoModeEditingStage, TemplateSchemaData templateSchemaData, UgcTemplateData ugcTemplateData, PhotoModeTemplateData photoModeTemplateData, PhotoTemplateInfo photoTemplateInfo, ImageEffectTemplateReuseData imageEffectTemplateReuseData, PUgcTemplateData pUgcTemplateData, MvModel mvModel, TemplateDynamicSlotModel templateDynamicSlotModel, TemplateData templateData, TemplateAnchorData templateAnchorData, TemplateConsumeData templateConsumeData, EditPostModel editPostModel, Video2StickerModel video2StickerModel, TrendingUploadModel trendingUploadModel, HDRModel hDRModel, VEBytevc1Model vEBytevc1Model, CommonMobParamModel commonMobParamModel, PrivacySettingModel privacySettingModel, CreatorModel creatorModel, AnsaPromptModel ansaPromptModel, ChangeAvatarModel changeAvatarModel, OnThisDayData onThisDayData, CelebrationData celebrationData, MusicShareStoryData musicShareStoryData, StickerNewEngineModel stickerNewEngineModel, PublishItemTrackModel publishItemTrackModel, MagicCombineEffectModel magicCombineEffectModel, PaidContentVideoModel paidContentVideoModel, StoryShootModel storyShootModel, StoryEditModel storyEditModel, TTStoryUploadModel tTStoryUploadModel, TextPublishUploadModel textPublishUploadModel, CollabInfoModel collabInfoModel, StreaksData streaksData, StorySocialEventStickerModel storySocialEventStickerModel, ExtractFramesModel extractFramesModel, SocialModel socialModel, CreativeFlowData creativeFlowData, CreativeInfo creativeInfo, MicroAppModel microAppModel, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, PoiData poiData, C443120HZe c443120HZe, PoiData poiData2, PoiLynxInfoModel poiLynxInfoModel, PoiMobParam poiMobParam, GpsConsumingOptModel gpsConsumingOptModel, CustomParcelableExtraInfo customParcelableExtraInfo, EditorProDraftModel editorProDraftModel, EditorProSchemeModel editorProSchemeModel, OpenPlatformModel openPlatformModel, MigrateModel migrateModel, String str3, AISelfModel aISelfModel, AISelfScanFaceModel aISelfScanFaceModel, RestoreModel restoreModel, TangramTempModel tangramTempModel, TangramPersistenceModel tangramPersistenceModel, GamePoiModel gamePoiModel, ProductRecommendModel productRecommendModel, AICreateModel aICreateModel, LiveRecordModel liveRecordModel, List list, String str4, String str5, PropFromGroupModel propFromGroupModel, FeedPropPinModel feedPropPinModel, EffectShowModel effectShowModel, String str6, AIGCExtraModel aIGCExtraModel, String str7, String str8, CreatorAppModel creatorAppModel, String str9, String str10, AIGroupShotTemplateModel aIGroupShotTemplateModel, MinisGameModel minisGameModel, String str11, List list2, boolean z2, boolean z3, Integer num, boolean z4, String str12, Integer num2, AILivePhotoModel aILivePhotoModel, AIGCBusinessModelSet aIGCBusinessModelSet, AIGCWorkflowModel aIGCWorkflowModel, NewBackgroundVideoPipelineModel newBackgroundVideoPipelineModel, DetailPageRecallDraftModel detailPageRecallDraftModel, DraftBoxModel draftBoxModel, LivePhotoModel livePhotoModel, AIGCOfflineModel aIGCOfflineModel, AigcMetadataModel aigcMetadataModel, LandscapeVideoModel landscapeVideoModel, CameraLayoutModel cameraLayoutModel, AIChatGenModel aIChatGenModel, CreationSearchModel creationSearchModel, VideoImageSeparateSwitchModel videoImageSeparateSwitchModel, QuickGridModel quickGridModel, MixStickerInfo mixStickerInfo, DeclarationModel declarationModel, LiveModel liveModel, PovModel povModel, AlbumOpenApiModel albumOpenApiModel, RecordConflictsModel recordConflictsModel, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str13;
        int i14;
        int i15;
        int i16;
        ?? r1;
        int i17;
        int i18;
        RecordConflictsModel recordConflictsModel2 = recordConflictsModel;
        AlbumOpenApiModel albumOpenApiModel2 = albumOpenApiModel;
        PovModel povModel2 = povModel;
        LiveModel liveModel2 = liveModel;
        MixStickerInfo mixStickerInfo2 = mixStickerInfo;
        VideoImageSeparateSwitchModel videoImageSeparateSwitchModel2 = videoImageSeparateSwitchModel;
        LivePhotoModel livePhotoModel2 = livePhotoModel;
        DraftBoxModel draftBoxModel2 = draftBoxModel;
        DetailPageRecallDraftModel detailPageRecallDraftModel2 = detailPageRecallDraftModel;
        NewBackgroundVideoPipelineModel newBackgroundVideoPipelineModel2 = newBackgroundVideoPipelineModel;
        AIGCWorkflowModel aIGCWorkflowModel2 = aIGCWorkflowModel;
        AIGCBusinessModelSet aIGCBusinessModelSet2 = aIGCBusinessModelSet;
        AILivePhotoModel aILivePhotoModel2 = aILivePhotoModel;
        Integer num3 = num2;
        String str14 = str12;
        boolean z5 = z4;
        boolean z6 = z2;
        PostPageModel postPageModel2 = postPageModel;
        String str15 = str11;
        AIGroupShotTemplateModel aIGroupShotTemplateModel2 = aIGroupShotTemplateModel;
        String str16 = str10;
        PrePublishStatusModel prePublishStatusModel2 = prePublishStatusModel;
        String str17 = str9;
        QuickGridModel quickGridModel2 = quickGridModel;
        CreatorAppModel creatorAppModel2 = creatorAppModel;
        String str18 = str7;
        AIGCExtraModel aIGCExtraModel2 = aIGCExtraModel;
        InfoStickerCategoryParams infoStickerCategoryParams2 = infoStickerCategoryParams;
        FeedPropPinModel feedPropPinModel2 = feedPropPinModel;
        PropFromGroupModel propFromGroupModel2 = propFromGroupModel;
        CanvasVideoData canvasVideoData2 = canvasVideoData;
        String str19 = str5;
        EditBackSaveModel editBackSaveModel2 = editBackSaveModel;
        String str20 = str4;
        List arrayList = list;
        LiveRecordModel liveRecordModel2 = liveRecordModel;
        AICreateModel aICreateModel2 = aICreateModel;
        ProductRecommendModel productRecommendModel2 = productRecommendModel;
        TangramPersistenceModel tangramPersistenceModel2 = tangramPersistenceModel;
        RecordData recordData2 = recordData;
        TangramTempModel tangramTempModel2 = tangramTempModel;
        RestoreModel restoreModel2 = restoreModel;
        AISelfScanFaceModel aISelfScanFaceModel2 = aISelfScanFaceModel;
        AISelfModel aISelfModel2 = aISelfModel;
        String str21 = str;
        String str22 = str3;
        MigrateModel migrateModel2 = migrateModel;
        EditorProSchemeModel editorProSchemeModel2 = editorProSchemeModel;
        AigcMetadataModel aigcMetadataModel2 = aigcMetadataModel;
        OpenPlatformModel openPlatformModel2 = openPlatformModel;
        TtsVoiceInfo ttsVoiceInfo2 = ttsVoiceInfo;
        GpsConsumingOptModel gpsConsumingOptModel2 = gpsConsumingOptModel;
        PoiData poiData3 = poiData2;
        VoiceConversionModel voiceConversionModel2 = voiceConversionModel;
        PoiLynxInfoModel poiLynxInfoModel2 = poiLynxInfoModel;
        PoiData poiData4 = poiData;
        MicroAppModel microAppModel2 = microAppModel;
        StreaksData streaksData2 = streaksData;
        StoryEditModel storyEditModel2 = storyEditModel;
        PaidContentVideoModel paidContentVideoModel2 = paidContentVideoModel;
        PublishItemTrackModel publishItemTrackModel2 = publishItemTrackModel;
        CelebrationData celebrationData2 = celebrationData;
        PublishModel publishModel2 = publishModel;
        ChangeAvatarModel changeAvatarModel2 = changeAvatarModel;
        CreatorModel creatorModel2 = creatorModel;
        PrivacySettingModel privacySettingModel2 = privacySettingModel;
        CameraLayoutModel cameraLayoutModel2 = cameraLayoutModel;
        VEBytevc1Model vEBytevc1Model2 = vEBytevc1Model;
        HDRModel hDRModel2 = hDRModel;
        TrendingUploadModel trendingUploadModel2 = trendingUploadModel;
        Video2StickerModel video2StickerModel2 = video2StickerModel;
        EditPostModel editPostModel2 = editPostModel;
        TemplateConsumeData templateConsumeData2 = templateConsumeData;
        TemplateAnchorData templateAnchorData2 = templateAnchorData;
        TemplateDynamicSlotModel templateDynamicSlotModel2 = templateDynamicSlotModel;
        ExtractFramesModel extractFramesModel2 = extractFramesModel;
        MvModel mvModel2 = mvModel;
        PUgcTemplateData pUgcTemplateData2 = pUgcTemplateData;
        CommerceToolsModel commerceToolsModel2 = commerceToolsModel;
        PhotoModeTemplateData photoModeTemplateData2 = photoModeTemplateData;
        StreamVoiceConversionModel streamVoiceConversionModel2 = streamVoiceConversionModel;
        TemplateSchemaData templateSchemaData2 = templateSchemaData;
        CountDownModel countDownModel2 = countDownModel;
        StorySocialEventStickerModel storySocialEventStickerModel2 = storySocialEventStickerModel;
        InlineCaptionModel inlineCaptionModel2 = inlineCaptionModel;
        EditPhotoModel editPhotoModel2 = editPhotoModel;
        UgcTemplateData ugcTemplateData2 = ugcTemplateData;
        ImageEditModel imageEditModel2 = imageEditModel;
        EffectDataTransport effectDataTransport2 = effectDataTransport;
        boolean z7 = z;
        AudioAECModel audioAECModel2 = audioAECModel;
        TTSStickerModel tTSStickerModel2 = tTSStickerModel;
        PhotoModeEditingStage photoModeEditingStage2 = photoModeEditingStage;
        DraftInfoModel draftInfoModel2 = draftInfoModel;
        AudioEffectParam audioEffectParam2 = audioEffectParam;
        MixEditingModel mixEditingModel2 = mixEditingModel;
        CreativeInfo creativeInfo2 = creativeInfo;
        AnsaPromptModel ansaPromptModel2 = ansaPromptModel;
        AudioVolumeAdjustModel audioVolumeAdjustModel2 = audioVolumeAdjustModel;
        AudioAlgorithmModel audioAlgorithmModel2 = audioAlgorithmModel;
        ShootLinkPerfMobModel shootLinkPerfMobModel2 = shootLinkPerfMobModel;
        CheckPointModel checkPointModel2 = checkPointModel;
        AIDubbing aIDubbing2 = aIDubbing;
        MicDataModel micDataModel2 = micDataModel;
        AutoPickModel autoPickModel2 = autoPickModel;
        PublishMobParams publishMobParams2 = publishMobParams;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel2 = reuseAwemeTTSAndVCRefIDsModel;
        PoiMobParam poiMobParam2 = poiMobParam;
        DuetModel duetModel2 = duetModel;
        StoryShootModel storyShootModel2 = storyShootModel;
        EditVideoEnhanceModel editVideoEnhanceModel2 = editVideoEnhanceModel;
        SparkPublishModel sparkPublishModel2 = sparkPublishModel;
        OnThisDayData onThisDayData2 = onThisDayData;
        PcsCourseVideoModel pcsCourseVideoModel2 = pcsCourseVideoModel;
        StoryPublishNetworkInfo storyPublishNetworkInfo2 = storyPublishNetworkInfo;
        DeclarationModel declarationModel2 = declarationModel;
        PublishPreviewModel publishPreviewModel2 = publishPreviewModel;
        PostLandingModel postLandingModel2 = postLandingModel;
        FollowUpPublishTrackerModel followUpPublishTrackerModel2 = followUpPublishTrackerModel;
        MinisGameModel minisGameModel2 = minisGameModel;
        LandscapeVideoModel landscapeVideoModel2 = landscapeVideoModel;
        String str23 = str2;
        CustomParcelableExtraInfo customParcelableExtraInfo2 = customParcelableExtraInfo;
        PublishCustomCoverModel publishCustomCoverModel2 = publishCustomCoverModel;
        SocialModel socialModel2 = socialModel;
        RecordFilterModel recordFilterModel2 = recordFilterModel;
        AudioCopyrightDetectModel audioCopyrightDetectModel2 = audioCopyrightDetectModel;
        FilterModel filterModel2 = filterModel;
        StickerNewEngineModel stickerNewEngineModel2 = stickerNewEngineModel;
        SoundSyncModel soundSyncModel2 = soundSyncModel;
        boolean z8 = z3;
        ImageAlbumData imageAlbumData3 = imageAlbumData;
        NowsShootModel nowsShootModel2 = nowsShootModel;
        FlashModel flashModel2 = flashModel;
        CollabInfoModel collabInfoModel2 = collabInfoModel;
        BeautyModel beautyModel2 = beautyModel;
        CapcutVcTTSModel capcutVcTTSModel2 = capcutVcTTSModel;
        CreationTypeModel creationTypeModel2 = creationTypeModel;
        LandingModel landingModel2 = landingModel;
        EditSaveLocalModel editSaveLocalModel2 = editSaveLocalModel;
        AutoCutAnchorModel autoCutAnchorModel2 = autoCutAnchorModel;
        AYMobCacheModel aYMobCacheModel2 = aYMobCacheModel;
        CoverPublishModel coverPublishModel2 = coverPublishModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel2 = reuseSoundAndEffectModel;
        RecordDowngradeModel recordDowngradeModel2 = recordDowngradeModel;
        InfoStickerModel infoStickerModel2 = infoStickerModel;
        StitchModel stitchModel2 = stitchModel;
        AIGCOfflineModel aIGCOfflineModel2 = aIGCOfflineModel;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct2 = aVUploadMiscInfoStruct;
        CreativeFlowData creativeFlowData2 = creativeFlowData;
        MirrorMode mirrorMode2 = mirrorMode;
        EffectShowModel effectShowModel2 = effectShowModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel2 = editorProAIGCInfoModel;
        NLEInfoModel nLEInfoModel2 = nLEInfoModel;
        OriginalSoundModel originalSoundModel2 = originalSoundModel;
        InlineCaptionExperimentInformation inlineCaptionExperimentInformation2 = inlineCaptionExperimentInformation;
        SchedulePostTime schedulePostTime2 = schedulePostTime;
        AICoverMobModel aICoverMobModel2 = aICoverMobModel;
        GamePoiModel gamePoiModel2 = gamePoiModel;
        AudioLoudnessModel audioLoudnessModel2 = audioLoudnessModel;
        NewGreenScreenEffectModel newGreenScreenEffectModel2 = newGreenScreenEffectModel;
        int i19 = i;
        List listLJIIIIZZ = list2;
        StickPointModel stickPointModel2 = stickPointModel;
        ImportModel importModel2 = importModel;
        MusicAndTimeModel musicAndTimeModel2 = musicAndTimeModel;
        TextPublishUploadModel textPublishUploadModel2 = textPublishUploadModel;
        TTSModel tTSModel2 = tTSModel;
        TTStoryUploadModel tTStoryUploadModel2 = tTStoryUploadModel;
        InstantCloneConsumptionModel instantCloneConsumptionModel2 = instantCloneConsumptionModel;
        String str24 = str8;
        MdpInfoModel mdpInfoModel2 = mdpInfoModel;
        AutoCutModel autoCutModel2 = autoCutModel;
        EditorProDraftModel editorProDraftModel2 = editorProDraftModel;
        MusicBuzModel musicBuzModel2 = musicBuzModel;
        ImageEffectTemplateReuseData imageEffectTemplateReuseData2 = imageEffectTemplateReuseData;
        ImagePublishBackSaveModel imagePublishBackSaveModel2 = imagePublishBackSaveModel;
        VolumeInfoModel volumeInfoModel2 = volumeInfoModel;
        ImagePublishModel imagePublishModel2 = imagePublishModel;
        PhotoTemplateInfo photoTemplateInfo2 = photoTemplateInfo;
        LoudnessBalanceModel loudnessBalanceModel2 = loudnessBalanceModel;
        TemplateData templateData2 = templateData;
        GreenScreenEffectModel greenScreenEffectModel2 = greenScreenEffectModel;
        DMMediaModel dMMediaModel2 = dMMediaModel;
        EditModel editModel2 = editModel;
        MusicShareStoryData musicShareStoryData2 = musicShareStoryData;
        Text2ImageModel text2ImageModel2 = text2ImageModel;
        MusicVolumeInfoModel musicVolumeInfoModel2 = musicVolumeInfoModel;
        EditStickerModel editStickerModel2 = editStickerModel;
        RecordMobModel recordMobModel2 = recordMobModel;
        RecordEffectModel recordEffectModel2 = recordEffectModel;
        TTSVoiceModel tTSVoiceModel2 = tTSVoiceModel;
        AlbumModel albumModel2 = albumModel;
        Integer num4 = num;
        CutSameModel cutSameModel2 = cutSameModel;
        EventData eventData2 = eventData;
        PublishSecureModel publishSecureModel2 = publishSecureModel;
        AlbumMobModel albumMobModel2 = albumMobModel;
        LoadMusicAndEffectModel loadMusicAndEffectModel2 = loadMusicAndEffectModel;
        AIChatGenModel aIChatGenModel2 = aIChatGenModel;
        CommonMobParamModel commonMobParamModel2 = commonMobParamModel;
        CreationSearchModel creationSearchModel2 = creationSearchModel;
        MobileEffectsModel2 mobileEffectsModel22 = mobileEffectsModel2;
        Cut2EditTransferModel cut2EditTransferModel2 = cut2EditTransferModel;
        ImageAlbumData imageAlbumData4 = imageAlbumData2;
        EditPageRestoreActivityModel editPageRestoreActivityModel2 = editPageRestoreActivityModel;
        String str25 = str6;
        MagicCombineEffectModel magicCombineEffectModel2 = magicCombineEffectModel;
        int i20 = i2;
        C443120HZe c443120HZe2 = c443120HZe;
        SoundEffectInfoModel soundEffectInfoModel2 = soundEffectInfoModel;
        EditEffectModel editEffectModel2 = editEffectModel;
        CreativeInitialModel creativeInitialModel2 = (i3 & 1) != 0 ? new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, null, null, null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null)) : creativeInitialModel;
        eventData2 = (i3 & 2) != 0 ? new EventData(null, null, "", null, "", "") : eventData2;
        recordData2 = (i3 & 4) != 0 ? new RecordData("", "", null, null, null, 0, 0, 0, null, 15000L, 0.0f, 0, false, null, null, null, 0, null, -1, null, false, "", "", null, false) : recordData2;
        recordEffectModel2 = (i3 & 8) != 0 ? new RecordEffectModel(null, null, null, null, null, false, false, null, 0, null, null, null, null, 0, false, null, null, null, false, null, false, null, 4194303, null) : recordEffectModel2;
        loadMusicAndEffectModel2 = (i3 & 16) != 0 ? new LoadMusicAndEffectModel(0) : loadMusicAndEffectModel2;
        recordDowngradeModel2 = (i3 & 32) != 0 ? new RecordDowngradeModel(false, false, null, null, false, 0, 0) : recordDowngradeModel2;
        reuseSoundAndEffectModel2 = (i3 & 64) != 0 ? new ReuseSoundAndEffectModel(null, null, false) : reuseSoundAndEffectModel2;
        aYMobCacheModel2 = (i3 & 128) != 0 ? new AYMobCacheModel(new ArrayList()) : aYMobCacheModel2;
        landingModel2 = (i3 & 256) != 0 ? new LandingModel(null, null, null, false, false) : landingModel2;
        musicAndTimeModel2 = (i3 & 512) != 0 ? null : musicAndTimeModel2;
        flashModel2 = (i3 & 1024) != 0 ? new FlashModel(false, false, new HashSet(), new HashSet()) : flashModel2;
        beautyModel2 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new BeautyModel(null, null, null, null, null, 0, null, 127, null) : beautyModel2;
        countDownModel2 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new CountDownModel(null, null) : countDownModel2;
        recordMobModel2 = (i3 & 8192) != 0 ? new RecordMobModel("") : recordMobModel2;
        shootLinkPerfMobModel2 = (i3 & 16384) != 0 ? new ShootLinkPerfMobModel(0) : shootLinkPerfMobModel2;
        albumModel2 = (32768 & i3) != 0 ? new AlbumModel(null, new ArrayList(), 0, 0, false, null, "", null, new LinkedHashSet(), new LinkedHashSet(), null, 0) : albumModel2;
        greenScreenEffectModel2 = (i3 & 65536) != 0 ? new GreenScreenEffectModel(0) : greenScreenEffectModel2;
        newGreenScreenEffectModel2 = (131072 & i3) != 0 ? new NewGreenScreenEffectModel(false, true, GreenScreenMaterial.DEFAULT, false) : newGreenScreenEffectModel2;
        if ((262144 & i3) != 0) {
            i10 = 0;
            importModel2 = new ImportModel(i10);
        } else {
            i10 = 0;
        }
        albumMobModel2 = (i3 & 524288) != 0 ? new AlbumMobModel(i10) : albumMobModel2;
        volumeInfoModel2 = (1048576 & i3) != 0 ? new VolumeInfoModel(-1.0f, -1.0f) : volumeInfoModel2;
        musicVolumeInfoModel2 = (2097152 & i3) != 0 ? new MusicVolumeInfoModel(null, null, Float.MIN_VALUE) : musicVolumeInfoModel2;
        soundEffectInfoModel2 = (4194304 & i3) != 0 ? new SoundEffectInfoModel(new ArrayList(), false, true) : soundEffectInfoModel2;
        musicBuzModel2 = (8388608 & i3) != 0 ? new MusicBuzModel(false, null, null, null, 1.0f, false, null, null, false, null, null, 0, MusicModel.FromSection.OTHER.ordinal(), false, false, 0L, 0, null, null, null, 0, 0, false, null, null, 0, 0, null, null, null, false, null, null, false, false, null, null, null, false, null, false, false, false, Boolean.FALSE, false, null, 0, null, 0, 0, 0, null, null, null, false, false, 0, 0, 0, Boolean.FALSE, 0, 0, null, "", null, false, null, null, null, 0L, false, false, "", null, null, false, 0.0f, "", 0, null, null, null, null, null, null, 0, false, false, null, null, null, null, null, null, null, 0, false, false, false, null, null, true, false, 0, 0, 0, 0, new MusicBuzCompatModel(null, null)) : musicBuzModel2;
        if ((16777216 & i3) != 0) {
            i11 = 0;
            mdpInfoModel2 = new MdpInfoModel(false);
        } else {
            i11 = 0;
        }
        stickPointModel2 = (33554432 & i3) != 0 ? new StickPointModel(i11) : stickPointModel2;
        cutSameModel2 = (67108864 & i3) != 0 ? null : cutSameModel2;
        editModel2 = (134217728 & i3) != 0 ? new EditModel(null, null, false, null, -1L, -1L, false, false, true, -1, null, false, true, new LinkedHashSet(), "") : editModel2;
        canvasVideoData2 = (268435456 & i3) != 0 ? null : canvasVideoData2;
        editEffectModel2 = (536870912 & i3) != 0 ? new EditEffectModel(new ArrayList(), null, -1, false, "", false, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), 0) : editEffectModel2;
        editBackSaveModel2 = (1073741824 & i3) != 0 ? new EditBackSaveModel(false, "shoot") : editBackSaveModel2;
        nLEInfoModel2 = (i3 & Integer.MIN_VALUE) != 0 ? new NLEInfoModel("", "", 0, null, true, null) : nLEInfoModel2;
        editStickerModel2 = (i4 & 1) != 0 ? new EditStickerModel(false, null, null, 0.0f, 0.0f, "", "", new TextStickerChallenges(new LinkedList())) : editStickerModel2;
        editorProAIGCInfoModel2 = (i4 & 2) != 0 ? new EditorProAIGCInfoModel(new ArrayList(), new TaskInfoInCreativeModel(false, true, 0), new HashMap(), new HashMap(), new EditorTabAlbumAICreate("", "", ""), new AiPlaygroundCameraModel("", "", false, false, false, false, false, false, false, new AIPlaygroundSchemaModel(0, 0, ""), false)) : editorProAIGCInfoModel2;
        infoStickerModel2 = (i4 & 4) != 0 ? null : infoStickerModel2;
        infoStickerCategoryParams2 = (i4 & 8) != 0 ? new InfoStickerCategoryParams() : infoStickerCategoryParams2;
        if ((i4 & 16) != 0) {
            i12 = 0;
            editVideoEnhanceModel2 = new EditVideoEnhanceModel(i12);
        } else {
            i12 = 0;
        }
        editSaveLocalModel2 = (i4 & 32) != 0 ? new EditSaveLocalModel(i12) : editSaveLocalModel2;
        cut2EditTransferModel2 = (i4 & 64) != 0 ? null : cut2EditTransferModel2;
        editPageRestoreActivityModel2 = (i4 & 128) != 0 ? new EditPageRestoreActivityModel(false) : editPageRestoreActivityModel2;
        i19 = (i4 & 256) != 0 ? 0 : i19;
        creationTypeModel2 = (i4 & 512) != 0 ? new CreationTypeModel(0) : creationTypeModel2;
        imageAlbumData3 = (i4 & 1024) != 0 ? null : imageAlbumData3;
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i13 = 0;
            editPhotoModel2 = new EditPhotoModel(false);
        } else {
            i13 = 0;
        }
        imageEditModel2 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new ImageEditModel(i13) : imageEditModel2;
        aICoverMobModel2 = (i4 & 8192) != 0 ? new AICoverMobModel(false, null, null, "") : aICoverMobModel2;
        imagePublishModel2 = (i4 & 16384) != 0 ? new ImagePublishModel(0) : imagePublishModel2;
        imagePublishBackSaveModel2 = (32768 & i4) != 0 ? new ImagePublishBackSaveModel(false, new HashMap(), new C08MN(100), new C08MN(100), new C08MN(100), new ArrayList(), new ArrayList(), "", "", new ArrayList(), null, new AIRewriteModel(null, false, new LinkedHashMap(), false, false), new VoiceInputMobModel(false, 0, 0L, 0)) : imagePublishBackSaveModel2;
        soundSyncModel2 = (i4 & 65536) != 0 ? new SoundSyncModel(null) : soundSyncModel2;
        filterModel2 = (131072 & i4) != 0 ? new FilterModel(false, 0, null, null, null, null, -1.0f, null) : filterModel2;
        recordFilterModel2 = (262144 & i4) != 0 ? new RecordFilterModel(null, null, null, null, null, null, null) : recordFilterModel2;
        mirrorMode2 = (i4 & 524288) != 0 ? new MirrorMode(false, false) : mirrorMode2;
        duetModel2 = (1048576 & i4) != 0 ? new DuetModel(null, null, null, 0, null, "", 0, null, 0, null, "", false, null, null, false, "") : duetModel2;
        str21 = (2097152 & i4) != 0 ? "null" : str21;
        str23 = (4194304 & i4) != 0 ? "" : str23;
        i20 = (8388608 & i4) != 0 ? -1 : i20;
        stitchModel2 = (16777216 & i4) != 0 ? new StitchModel(null, null, null, null) : stitchModel2;
        mobileEffectsModel22 = (33554432 & i4) != 0 ? new MobileEffectsModel2(new ArrayList(), new LinkedHashMap()) : mobileEffectsModel22;
        prePublishStatusModel2 = (67108864 & i4) != 0 ? new PrePublishStatusModel(0) : prePublishStatusModel2;
        postPageModel2 = (134217728 & i4) != 0 ? new PostPageModel(null, null, null, null, false, 0, 0, 0L, null, false, null, 0, null, false, null, 0, 0.0f, 0L, null, null, null, null, null, false, false, false, null, null, null, 536870911, null) : postPageModel2;
        followUpPublishTrackerModel2 = (268435456 & i4) != 0 ? new FollowUpPublishTrackerModel("", "", false, null, null, null) : followUpPublishTrackerModel2;
        postLandingModel2 = (536870912 & i4) != 0 ? new PostLandingModel(false, 31) : postLandingModel2;
        publishPreviewModel2 = (1073741824 & i4) != 0 ? new PublishPreviewModel("") : publishPreviewModel2;
        publishModel2 = (i4 & Integer.MIN_VALUE) != 0 ? new PublishModel(0, 0, 0, 0, 0, null, 0, null, null, null, new UploadSpeedInfo(-6L, "", -6L, -6L, -1), null) : publishModel2;
        storyPublishNetworkInfo2 = (i5 & 1) != 0 ? null : storyPublishNetworkInfo2;
        if ((i5 & 2) != 0) {
            str13 = null;
            publishSecureModel2 = new PublishSecureModel("", "");
        } else {
            str13 = null;
        }
        sparkPublishModel2 = (i5 & 4) != 0 ? new SparkPublishModel(false, false) : sparkPublishModel2;
        text2ImageModel2 = (i5 & 8) != 0 ? new Text2ImageModel(str13, new ArrayList(), new CopyOnWriteArrayList(), "", str13, str13, str13, str13, str13, str13, str13, false, "", true, "", true, "", "", false, "", "", "", str13, str13, str13, str13, str13, false, str13, false, new ArrayList(), str13, false, str13, false, "start", "start", "", "page", -1, str13, str13, str13, str13) : text2ImageModel2;
        publishCustomCoverModel2 = (i5 & 16) != 0 ? new PublishCustomCoverModel(0, 0, 0, 0, 0, "select_type") : publishCustomCoverModel2;
        publishMobParams2 = (i5 & 32) != 0 ? new PublishMobParams(0, -2, -2, -2, EnumC1405070mfR.NONE.getValue(), 0.0d, new ArrayList()) : publishMobParams2;
        coverPublishModel2 = (i5 & 64) != 0 ? new CoverPublishModel(new EffectTextModel(false, null, null, null, null), -1.0f, false, 0, new ArrayList(), "", false, new UploadCustomizeCoverInfo(0, "", 0, 0, 0.0d, 0), new CopyOnWriteArrayList(), new CoverPreviewInfo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0, 0)) : coverPublishModel2;
        draftInfoModel2 = (i5 & 128) != 0 ? new DraftInfoModel(false, false, false, 0L, "", false, Scene.SCENE_SERVICE, null, -1, 0, "", 0L, 0, false, -1, "", 0L, "", false, true, false, false, 0L, false) : draftInfoModel2;
        micDataModel2 = (i5 & 256) != 0 ? new MicDataModel(-1.0f, false, false, false, false, -1) : micDataModel2;
        checkPointModel2 = (i5 & 512) != 0 ? new CheckPointModel(0) : checkPointModel2;
        loudnessBalanceModel2 = (i5 & 1024) != 0 ? new LoudnessBalanceModel(new ArrayList(), 0.0d, 0.0d, "", Collections.synchronizedMap(new LinkedHashMap())) : loudnessBalanceModel2;
        audioAlgorithmModel2 = (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new AudioAlgorithmModel(false, false, false, false, false, -1.0f, -1.0f, -1.0f, -1.0f, false, false) : audioAlgorithmModel2;
        audioVolumeAdjustModel2 = (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new AudioVolumeAdjustModel(-1.0d) : audioVolumeAdjustModel2;
        audioCopyrightDetectModel2 = (i5 & 8192) != 0 ? new AudioCopyrightDetectModel(false, false, "", false, null, null, new ArrayList(), -1, new HashMap(), false, false, 0L, false, false, 0L) : audioCopyrightDetectModel2;
        voiceConversionModel2 = (i5 & 16384) != 0 ? new VoiceConversionModel(null, null, null, null, null, false, false, null, null, null, false, 2047, null) : voiceConversionModel2;
        reuseAwemeTTSAndVCRefIDsModel2 = (32768 & i5) != 0 ? new ReuseAwemeTTSAndVCRefIDsModel(null, null, null, null, null, null) : reuseAwemeTTSAndVCRefIDsModel2;
        ttsVoiceInfo2 = (i5 & 65536) != 0 ? new TtsVoiceInfo(null, null, null, null, null) : ttsVoiceInfo2;
        instantCloneConsumptionModel2 = (131072 & i5) != 0 ? new InstantCloneConsumptionModel("", null) : instantCloneConsumptionModel2;
        mixEditingModel2 = (262144 & i5) != 0 ? new MixEditingModel(null, new ArrayList(), null, null, "", "", null, null, null, false) : mixEditingModel2;
        tTSModel2 = (i5 & 524288) != 0 ? new TTSModel(Collections.synchronizedMap(new LinkedHashMap()), 0, null) : tTSModel2;
        capcutVcTTSModel2 = (1048576 & i5) != 0 ? new CapcutVcTTSModel(null, null, null, null, 15, null) : capcutVcTTSModel2;
        streamVoiceConversionModel2 = (2097152 & i5) != 0 ? new StreamVoiceConversionModel(null, null, "", new HashMap(), "", "", false, "", "", false) : streamVoiceConversionModel2;
        audioEffectParam2 = (4194304 & i5) != 0 ? null : audioEffectParam2;
        originalSoundModel2 = (8388608 & i5) != 0 ? new OriginalSoundModel(0) : originalSoundModel2;
        tTSVoiceModel2 = (16777216 & i5) != 0 ? null : tTSVoiceModel2;
        tTSStickerModel2 = (33554432 & i5) != 0 ? new TTSStickerModel() : tTSStickerModel2;
        if ((67108864 & i5) != 0) {
            i14 = 0;
            audioAECModel2 = new AudioAECModel(i14);
        } else {
            i14 = 0;
        }
        audioLoudnessModel2 = (134217728 & i5) != 0 ? new AudioLoudnessModel(i14) : audioLoudnessModel2;
        z7 = (268435456 & i5) != 0 ? false : z7;
        nowsShootModel2 = (536870912 & i5) != 0 ? null : nowsShootModel2;
        dMMediaModel2 = (1073741824 & i5) != 0 ? null : dMMediaModel2;
        pcsCourseVideoModel2 = (i5 & Integer.MIN_VALUE) != 0 ? null : pcsCourseVideoModel2;
        effectDataTransport2 = (i6 & 1) != 0 ? new EffectDataTransport(null, null, null, null, null, null) : effectDataTransport2;
        commerceToolsModel2 = (i6 & 2) != 0 ? new CommerceToolsModel(new CommerceToolsTcmModel(false, null, null, null, null, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false), null, null, false, false, null, 0, new CommerceToolsStickerContext(), new CommerceToolsMusicModel(), new CommerceToolsMusicContext(), new IBEContext()) : commerceToolsModel2;
        schedulePostTime2 = (i6 & 4) != 0 ? null : schedulePostTime2;
        aIDubbing2 = (i6 & 8) != 0 ? null : aIDubbing2;
        inlineCaptionModel2 = (i6 & 16) != 0 ? null : inlineCaptionModel2;
        inlineCaptionExperimentInformation2 = (i6 & 32) != 0 ? null : inlineCaptionExperimentInformation2;
        autoCutModel2 = (i6 & 64) != 0 ? new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null) : autoCutModel2;
        autoPickModel2 = (i6 & 128) != 0 ? new AutoPickModel(new ArrayList(), null, null, "", false, null, false, false, 1, false, new ArrayList(), 0, 0, 0, 0, "", "", "", "", "", false, false) : autoPickModel2;
        autoCutAnchorModel2 = (i6 & 256) != 0 ? new AutoCutAnchorModel(null, EnumC1412640mre.CUT_SAME.getValue(), null, null, null, null, null, null, null, null, null, null, new ArrayList(), null, null, 0, null, null) : autoCutAnchorModel2;
        imageAlbumData4 = (i6 & 512) != 0 ? new ImageAlbumData(null, 0, false, null, 0, 0, null, null, null, null, false, false, false, false, false, false, false, false, null, 0, null, 2097151, null) : imageAlbumData4;
        photoModeEditingStage2 = (i6 & 1024) != 0 ? new PhotoModeEditingStage(null, null, false, false, false) : photoModeEditingStage2;
        templateSchemaData2 = (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new TemplateSchemaData(null, null, null, null, false) : templateSchemaData2;
        ugcTemplateData2 = (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new UgcTemplateData(false, false, null, null, null, null, null, null, null, false, false, "", false, false, null, null, null, null, null, null) : ugcTemplateData2;
        photoModeTemplateData2 = (i6 & 8192) != 0 ? new PhotoModeTemplateData(null, null, false, null, false, true, null, null, false) : photoModeTemplateData2;
        photoTemplateInfo2 = (i6 & 16384) != 0 ? null : photoTemplateInfo2;
        imageEffectTemplateReuseData2 = (32768 & i6) != 0 ? new ImageEffectTemplateReuseData(null, false, null) : imageEffectTemplateReuseData2;
        pUgcTemplateData2 = (i6 & 65536) != 0 ? new PUgcTemplateData(null, false, null, null, null, 0, null, false, null, null, false, false, null, null, null, null, false, 0.0f, false, null, 0, null, 0, false, 0, null, null, 0, null, false, 0, 0, 0, 0, 0, null, null, null, -1, 63, null) : pUgcTemplateData2;
        mvModel2 = (131072 & i6) != 0 ? new MvModel(null, -1, null, null, null, -1, null, -1, false, null, false, null, null, false, false, false) : mvModel2;
        templateDynamicSlotModel2 = (262144 & i6) != 0 ? null : templateDynamicSlotModel2;
        templateData2 = (i6 & 524288) != 0 ? new TemplateData(null, null, null, new CameraSlotModel(new ArrayList(), -1, new ArrayList(), -1, null, false), null) : templateData2;
        templateAnchorData2 = (1048576 & i6) != 0 ? new TemplateAnchorData(Boolean.FALSE, false, null, null) : templateAnchorData2;
        templateConsumeData2 = (2097152 & i6) != 0 ? new TemplateConsumeData(null, null, null, null) : templateConsumeData2;
        editPostModel2 = (4194304 & i6) != 0 ? null : editPostModel2;
        video2StickerModel2 = (8388608 & i6) != 0 ? null : video2StickerModel2;
        trendingUploadModel2 = (16777216 & i6) != 0 ? new TrendingUploadModel("", "", 0, null) : trendingUploadModel2;
        if ((33554432 & i6) != 0) {
            i15 = 0;
            hDRModel2 = new HDRModel(i15);
        } else {
            i15 = 0;
        }
        vEBytevc1Model2 = (67108864 & i6) != 0 ? new VEBytevc1Model(i15) : vEBytevc1Model2;
        commonMobParamModel2 = (134217728 & i6) != 0 ? new CommonMobParamModel(false, "", false, "", false, false, false, null, null, false, null, null, null, null, new EditDescMobModel(0), new ArrayList(), null, false, "", false, -1L, -1, -1, -1, -1, new EditPageFunctionTracking(false, false, false, false, false, false), 0, "", new ArrayList(), "video", null, null, null) : commonMobParamModel2;
        privacySettingModel2 = (268435456 & i6) != 0 ? new PrivacySettingModel(0, 0, 0, 0, false, null, new AIGCInfo(0, false, 0), true, new ContentCheckInfo(false, false, -1), null, 0, "", new CopyOnWriteArrayList(), false, new CopyOnWriteArrayList()) : privacySettingModel2;
        creatorModel2 = (536870912 & i6) != 0 ? new CreatorModel(0L) : creatorModel2;
        ansaPromptModel2 = (1073741824 & i6) != 0 ? new AnsaPromptModel(0) : ansaPromptModel2;
        changeAvatarModel2 = (Integer.MIN_VALUE & i6) != 0 ? new ChangeAvatarModel(false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, 32767, null) : changeAvatarModel2;
        onThisDayData2 = (i7 & 1) != 0 ? new OnThisDayData(false, 0, 0, "", 0L, new ArrayList(), false, 0, "", 0, 0, 0, null, 0, 0L, true, false, false, 0, null, false, Boolean.FALSE, null, null) : onThisDayData2;
        celebrationData2 = (i7 & 2) != 0 ? null : celebrationData2;
        musicShareStoryData2 = (i7 & 4) != 0 ? new MusicShareStoryData(null, null, -16777216, -16777216, null, null, null, null, null, null, null, null) : musicShareStoryData2;
        stickerNewEngineModel2 = (i7 & 8) != 0 ? new StickerNewEngineModel(null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, -1, 131071, null) : stickerNewEngineModel2;
        publishItemTrackModel2 = (i7 & 16) != 0 ? null : publishItemTrackModel2;
        magicCombineEffectModel2 = (i7 & 32) != 0 ? new MagicCombineEffectModel(new ArrayList(), new TaskInfoInCreativeModel(false, true, 0)) : magicCombineEffectModel2;
        paidContentVideoModel2 = (i7 & 64) != 0 ? new PaidContentVideoModel("", "", "", "", "") : paidContentVideoModel2;
        storyShootModel2 = (i7 & 128) != 0 ? new StoryShootModel(null, null, null, false, false, null, false, 0, 0.0f, false, null, false, null, "", null, StoryLivePhotoMode.NONE, false, null, null, EnumC1439580nZ6.UNKNOWN.getValue(), null, null, false) : storyShootModel2;
        storyEditModel2 = (i7 & 256) != 0 ? new StoryEditModel(0) : storyEditModel2;
        tTStoryUploadModel2 = (i7 & 512) != 0 ? null : tTStoryUploadModel2;
        textPublishUploadModel2 = (i7 & 1024) != 0 ? null : textPublishUploadModel2;
        collabInfoModel2 = (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new CollabInfoModel(null) : collabInfoModel2;
        streaksData2 = (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new StreaksData("", "", false, false, -1, "", 0, 0, null, new StoryStreakStickerState(false, false, null, null, false, null, false, null, false, null, false, null), "", "", "", "", false, false, 0) : streaksData2;
        storySocialEventStickerModel2 = (i7 & 8192) != 0 ? new StorySocialEventStickerModel(false, 0, new StoryCommonStickerModel(720, 1280, null, "", new ArrayList(), new ArrayList(), false, null), null, null, new StorySocialEventStickerMobParam("", "", "")) : storySocialEventStickerModel2;
        extractFramesModel2 = (i7 & 16384) != 0 ? null : extractFramesModel2;
        socialModel2 = (32768 & i7) != 0 ? new SocialModel(null, 1, 1, null) : socialModel2;
        creativeFlowData2 = (i7 & 65536) != 0 ? new CreativeFlowData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0) : creativeFlowData2;
        creativeInfo2 = (131072 & i7) != 0 ? new CreativeInfo(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0) : creativeInfo2;
        microAppModel2 = (262144 & i7) != 0 ? null : microAppModel2;
        aVUploadMiscInfoStruct2 = (i7 & 524288) != 0 ? null : aVUploadMiscInfoStruct2;
        poiData4 = (1048576 & i7) != 0 ? null : poiData4;
        c443120HZe2 = (2097152 & i7) != 0 ? null : c443120HZe2;
        poiData3 = (4194304 & i7) != 0 ? null : poiData3;
        poiLynxInfoModel2 = (8388608 & i7) != 0 ? new PoiLynxInfoModel(null, null) : poiLynxInfoModel2;
        poiMobParam2 = (16777216 & i7) != 0 ? null : poiMobParam2;
        gpsConsumingOptModel2 = (33554432 & i7) != 0 ? new GpsConsumingOptModel(0) : gpsConsumingOptModel2;
        customParcelableExtraInfo2 = (67108864 & i7) != 0 ? null : customParcelableExtraInfo2;
        editorProDraftModel2 = (134217728 & i7) != 0 ? new EditorProDraftModel(null, new CopyOnWriteArraySet(), new CopyOnWriteArraySet(), new CopyOnWriteArraySet(), new CopyOnWriteArrayList(), null, null, null, null, false, new ConcurrentHashMap(), 0, null, false, false, null, false, false, false, false) : editorProDraftModel2;
        editorProSchemeModel2 = (268435456 & i7) != 0 ? new EditorProSchemeModel(null, null, false, null) : editorProSchemeModel2;
        openPlatformModel2 = (536870912 & i7) != 0 ? new OpenPlatformModel(null, null, null, "") : openPlatformModel2;
        migrateModel2 = (1073741824 & i7) != 0 ? new MigrateModel(false) : migrateModel2;
        str22 = (Integer.MIN_VALUE & i7) != 0 ? "" : str22;
        aISelfModel2 = (i8 & 1) != 0 ? new AISelfModel(false, 0, null, null, null, false, null, null, null, null, null, null, null, 2, null, null, null, null, 0, null, null, null, null, null, false) : aISelfModel2;
        if ((i8 & 2) != 0) {
            i16 = 0;
            aISelfScanFaceModel2 = new AISelfScanFaceModel(i16);
        } else {
            i16 = 0;
        }
        restoreModel2 = (i8 & 4) != 0 ? new RestoreModel(i16) : restoreModel2;
        tangramTempModel2 = (i8 & 8) != 0 ? null : tangramTempModel2;
        tangramPersistenceModel2 = (i8 & 16) != 0 ? null : tangramPersistenceModel2;
        if ((i8 & 32) != 0) {
            r1 = 0;
            gamePoiModel2 = new GamePoiModel("", "");
        } else {
            r1 = 0;
        }
        productRecommendModel2 = (i8 & 64) != 0 ? new ProductRecommendModel(r1, r1) : productRecommendModel2;
        aICreateModel2 = (i8 & 128) != 0 ? null : aICreateModel2;
        liveRecordModel2 = (i8 & 256) != 0 ? new LiveRecordModel(new ArrayList()) : liveRecordModel2;
        arrayList = (i8 & 512) != 0 ? new ArrayList() : arrayList;
        str20 = (i8 & 1024) != 0 ? null : str20;
        str19 = (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str19;
        propFromGroupModel2 = (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new PropFromGroupModel("", "", "", "") : propFromGroupModel2;
        if ((i8 & 8192) != 0) {
            i17 = 1;
            feedPropPinModel2 = new FeedPropPinModel("");
        } else {
            i17 = 1;
        }
        effectShowModel2 = (i8 & 16384) != 0 ? new EffectShowModel(null, i17, 0 == true ? 1 : 0) : effectShowModel2;
        str25 = (32768 & i8) != 0 ? null : str25;
        aIGCExtraModel2 = (i8 & 65536) != 0 ? new AIGCExtraModel(null, null, false, null, null, false, null, 127, null) : aIGCExtraModel2;
        str18 = (131072 & i8) != 0 ? null : str18;
        str24 = (262144 & i8) != 0 ? null : str24;
        creatorAppModel2 = (i8 & 524288) != 0 ? null : creatorAppModel2;
        str17 = (1048576 & i8) != 0 ? null : str17;
        str16 = (2097152 & i8) != 0 ? null : str16;
        aIGroupShotTemplateModel2 = (4194304 & i8) != 0 ? null : aIGroupShotTemplateModel2;
        minisGameModel2 = (8388608 & i8) != 0 ? null : minisGameModel2;
        str15 = (16777216 & i8) != 0 ? null : str15;
        listLJIIIIZZ = (33554432 & i8) != 0 ? C1697810uHb.LJIIIIZZ() : listLJIIIIZZ;
        z6 = (67108864 & i8) != 0 ? false : z6;
        z8 = (134217728 & i8) != 0 ? false : z8;
        num4 = (268435456 & i8) != 0 ? null : num4;
        z5 = (536870912 & i8) != 0 ? false : z5;
        str14 = (1073741824 & i8) != 0 ? null : str14;
        num3 = (i8 & Integer.MIN_VALUE) != 0 ? null : num3;
        aILivePhotoModel2 = (i9 & 1) != 0 ? new AILivePhotoModel(null, null, null, new AIAliveRestoreData(null, null), null, null, false, false, null, UsageStatus.NOT_APPLY, UsageStatus.NOT_APPLY, false, null, false, 0, false, new AILivePhotoConsumptionModel(false, null, false, null, null, false), null, new PromptPageMobParam(0L, -1L, -1L, false, "", false, false, false, false, false, AILivePhotoRecallWay.NONE, false, false, null, null, 0, null, null, null), new PageDataCache(new PromptRequestState(null, null, false, null, 15, null), new PromptRequestState(null, null, false, null, 15, null), null, new PromptModel("", "", PromptType.NONE, "", "", "", false), false, false, false, false, false, null), null, new NewPromptPageModel(false)) : aILivePhotoModel2;
        aIGCBusinessModelSet2 = (i9 & 2) != 0 ? new AIGCBusinessModelSet(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0) : aIGCBusinessModelSet2;
        if ((i9 & 4) != 0) {
            i18 = 0;
            aIGCWorkflowModel2 = new AIGCWorkflowModel(false);
        } else {
            i18 = 0;
        }
        this(creativeInitialModel2, eventData2, recordData2, recordEffectModel2, loadMusicAndEffectModel2, recordDowngradeModel2, reuseSoundAndEffectModel2, aYMobCacheModel2, landingModel2, musicAndTimeModel2, flashModel2, beautyModel2, countDownModel2, recordMobModel2, shootLinkPerfMobModel2, albumModel2, greenScreenEffectModel2, newGreenScreenEffectModel2, importModel2, albumMobModel2, volumeInfoModel2, musicVolumeInfoModel2, soundEffectInfoModel2, musicBuzModel2, mdpInfoModel2, stickPointModel2, cutSameModel2, editModel2, canvasVideoData2, editEffectModel2, editBackSaveModel2, nLEInfoModel2, editStickerModel2, editorProAIGCInfoModel2, infoStickerModel2, infoStickerCategoryParams2, editVideoEnhanceModel2, editSaveLocalModel2, cut2EditTransferModel2, editPageRestoreActivityModel2, i19, creationTypeModel2, imageAlbumData3, editPhotoModel2, imageEditModel2, aICoverMobModel2, imagePublishModel2, imagePublishBackSaveModel2, soundSyncModel2, filterModel2, recordFilterModel2, mirrorMode2, duetModel2, str21, str23, i20, stitchModel2, mobileEffectsModel22, prePublishStatusModel2, postPageModel2, followUpPublishTrackerModel2, postLandingModel2, publishPreviewModel2, publishModel2, storyPublishNetworkInfo2, publishSecureModel2, sparkPublishModel2, text2ImageModel2, publishCustomCoverModel2, publishMobParams2, coverPublishModel2, draftInfoModel2, micDataModel2, checkPointModel2, loudnessBalanceModel2, audioAlgorithmModel2, audioVolumeAdjustModel2, audioCopyrightDetectModel2, voiceConversionModel2, reuseAwemeTTSAndVCRefIDsModel2, ttsVoiceInfo2, instantCloneConsumptionModel2, mixEditingModel2, tTSModel2, capcutVcTTSModel2, streamVoiceConversionModel2, audioEffectParam2, originalSoundModel2, tTSVoiceModel2, tTSStickerModel2, audioAECModel2, audioLoudnessModel2, z7, nowsShootModel2, dMMediaModel2, pcsCourseVideoModel2, effectDataTransport2, commerceToolsModel2, schedulePostTime2, aIDubbing2, inlineCaptionModel2, inlineCaptionExperimentInformation2, autoCutModel2, autoPickModel2, autoCutAnchorModel2, imageAlbumData4, photoModeEditingStage2, templateSchemaData2, ugcTemplateData2, photoModeTemplateData2, photoTemplateInfo2, imageEffectTemplateReuseData2, pUgcTemplateData2, mvModel2, templateDynamicSlotModel2, templateData2, templateAnchorData2, templateConsumeData2, editPostModel2, video2StickerModel2, trendingUploadModel2, hDRModel2, vEBytevc1Model2, commonMobParamModel2, privacySettingModel2, creatorModel2, ansaPromptModel2, changeAvatarModel2, onThisDayData2, celebrationData2, musicShareStoryData2, stickerNewEngineModel2, publishItemTrackModel2, magicCombineEffectModel2, paidContentVideoModel2, storyShootModel2, storyEditModel2, tTStoryUploadModel2, textPublishUploadModel2, collabInfoModel2, streaksData2, storySocialEventStickerModel2, extractFramesModel2, socialModel2, creativeFlowData2, creativeInfo2, microAppModel2, aVUploadMiscInfoStruct2, poiData4, c443120HZe2, poiData3, poiLynxInfoModel2, poiMobParam2, gpsConsumingOptModel2, customParcelableExtraInfo2, editorProDraftModel2, editorProSchemeModel2, openPlatformModel2, migrateModel2, str22, aISelfModel2, aISelfScanFaceModel2, restoreModel2, tangramTempModel2, tangramPersistenceModel2, gamePoiModel2, productRecommendModel2, aICreateModel2, liveRecordModel2, arrayList, str20, str19, propFromGroupModel2, feedPropPinModel2, effectShowModel2, str25, aIGCExtraModel2, str18, str24, creatorAppModel2, str17, str16, aIGroupShotTemplateModel2, minisGameModel2, str15, listLJIIIIZZ, z6, z8, num4, z5, str14, num3, aILivePhotoModel2, aIGCBusinessModelSet2, aIGCWorkflowModel2, (i9 & 8) != 0 ? new NewBackgroundVideoPipelineModel(i18) : newBackgroundVideoPipelineModel2, (i9 & 16) != 0 ? new DetailPageRecallDraftModel(i18) : detailPageRecallDraftModel2, (i9 & 32) != 0 ? new DraftBoxModel(null, null, false, "", null, null, null) : draftBoxModel2, (i9 & 64) != 0 ? null : livePhotoModel2, (i9 & 128) != 0 ? new AIGCOfflineModel(false, false, false, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0, null, null, 0, null, false, null, false, false, null, false, 0, null, null, 0, -1, 262143, null) : aIGCOfflineModel2, (i9 & 256) != 0 ? new AigcMetadataModel(false, false, "", "") : aigcMetadataModel2, (i9 & 512) != 0 ? new LandscapeVideoModel(0.0f, 0.0f, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0) : landscapeVideoModel2, (i9 & 1024) != 0 ? null : cameraLayoutModel2, (i9 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : aIChatGenModel2, (i9 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : creationSearchModel2, (i9 & 8192) != 0 ? null : videoImageSeparateSwitchModel2, (i9 & 16384) != 0 ? null : quickGridModel2, (32768 & i9) != 0 ? null : mixStickerInfo2, (i9 & 65536) != 0 ? null : declarationModel2, (131072 & i9) != 0 ? null : liveModel2, (262144 & i9) != 0 ? null : povModel2, (i9 & 524288) != 0 ? null : albumOpenApiModel2, (i9 & 1048576) != 0 ? new RecordConflictsModel(0) : recordConflictsModel2);
    }

    public final void LIZJ(TemplateData templateData) {
        this.templateData = templateData;
    }

    public final void LIZLLL(TtsVoiceInfo ttsVoiceInfo) {
        this.ttsVoiceInfo = ttsVoiceInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.initialModel.writeToParcel(parcel, i);
        this.eventData.writeToParcel(parcel, i);
        this.recordData.writeToParcel(parcel, i);
        this.recordEffectModel.writeToParcel(parcel, i);
        this.loadMusicAndEffectModel.writeToParcel(parcel, i);
        this.recordDowngradeModel.writeToParcel(parcel, i);
        this.reuseSoundAndEffectModel.writeToParcel(parcel, i);
        this.ayMobCacheModel.writeToParcel(parcel, i);
        this.landingModel.writeToParcel(parcel, i);
        MusicAndTimeModel musicAndTimeModel = this.musicAndTimeModel;
        if (musicAndTimeModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicAndTimeModel.writeToParcel(parcel, i);
        }
        this.flashModel.writeToParcel(parcel, i);
        this.beautyModel.writeToParcel(parcel, i);
        this.countDownModel.writeToParcel(parcel, i);
        parcel.writeString(this.recordMobModel.microphoneStatus);
        this.shootLinkPerfMobModel.writeToParcel(parcel, i);
        this.albumModel.writeToParcel(parcel, i);
        parcel.writeInt(this.greenScreenEffectModel.propCustomPicCnt);
        parcel.writeParcelable(this.newGreenScreenEffectModel, i);
        this.importModel.writeToParcel(parcel, i);
        this.albumMobModel.writeToParcel(parcel, i);
        this.volumeInfoModel.writeToParcel(parcel, i);
        this.musicVolumeInfoModel.writeToParcel(parcel, i);
        this.soundEffectInfoModel.writeToParcel(parcel, i);
        this.musicBuzModel.writeToParcel(parcel, i);
        parcel.writeInt(this.mdpInfoModel.fromOfflineMusicMdp ? 1 : 0);
        this.stickPointModel.writeToParcel(parcel, i);
        CutSameModel cutSameModel = this.cutSameModel;
        if (cutSameModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cutSameModel.writeToParcel(parcel, i);
        }
        this.editModel.writeToParcel(parcel, i);
        parcel.writeSerializable(this.canvasVideoData);
        this.editEffectModel.writeToParcel(parcel, i);
        this.editBackSaveModel.writeToParcel(parcel, i);
        this.nleInfoModel.writeToParcel(parcel, i);
        this.editStickerModel.writeToParcel(parcel, i);
        this.editorProAIGCInfoModel.writeToParcel(parcel, i);
        parcel.writeParcelable(this.infoStickerModel, i);
        parcel.writeParcelable(this.infoStickerCategoryParams, i);
        this.editVideoEnhanceModel.writeToParcel(parcel, i);
        this.editSaveLocalModel.writeToParcel(parcel, i);
        Cut2EditTransferModel cut2EditTransferModel = this.cut2EditTransferModel;
        if (cut2EditTransferModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cut2EditTransferModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.editPageRestoreActivityModel.isActivityRestored ? 1 : 0);
        parcel.writeInt(this.mRestoreType);
        this.creationTypeModel.writeToParcel(parcel, i);
        ImageAlbumData imageAlbumData = this.imageAlbumModel;
        if (imageAlbumData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageAlbumData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.editPhotoModel.isFromEditPhoto ? 1 : 0);
        this.imageEditModel.writeToParcel(parcel, i);
        this.aiCoverMobModel.writeToParcel(parcel, i);
        this.imagePublishModel.writeToParcel(parcel, i);
        this.imagePublishBackSaveModel.writeToParcel(parcel, i);
        parcel.writeString(this.soundSyncModel.soundSyncFrom);
        this.filterModel.writeToParcel(parcel, i);
        this.recordFilterModel.writeToParcel(parcel, i);
        this.mirrorMode.writeToParcel(parcel, i);
        this.duetModel.writeToParcel(parcel, i);
        parcel.writeString(this.effectEntrancePosition);
        parcel.writeString(this.effectCarouselAction);
        parcel.writeInt(this.effectCarouselIndex);
        this.stitchModel.writeToParcel(parcel, i);
        this.mobileEffectsModel2.writeToParcel(parcel, i);
        this.prePublishStatusModel.writeToParcel(parcel, i);
        this.postPageModel.writeToParcel(parcel, i);
        this.followUpPublishTrackerModel.writeToParcel(parcel, i);
        this.postLandingModel.writeToParcel(parcel, i);
        parcel.writeString(this.publishPreviewModel.firstFramePath);
        this.publishModel.writeToParcel(parcel, i);
        StoryPublishNetworkInfo storyPublishNetworkInfo = this.storyPublishNetworkInfo;
        if (storyPublishNetworkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyPublishNetworkInfo.writeToParcel(parcel, i);
        }
        this.publishSecureModel.writeToParcel(parcel, i);
        this.sparkPublishModel.writeToParcel(parcel, i);
        this.text2ImageModel.writeToParcel(parcel, i);
        this.publishCustomCoverModel.writeToParcel(parcel, i);
        this.publishMobParams.writeToParcel(parcel, i);
        parcel.writeParcelable(this.coverPublishModel, i);
        this.draftInfoModel.writeToParcel(parcel, i);
        this.micDataModel.writeToParcel(parcel, i);
        parcel.writeInt(this.checkPointModel.enableCheckPoint ? 1 : 0);
        this.loudnessBalanceModel.writeToParcel(parcel, i);
        this.audioAlgorithmModel.writeToParcel(parcel, i);
        parcel.writeDouble(this.audioVolumeAdjustModel.dbRange);
        this.audioCopyrightDetectModel.writeToParcel(parcel, i);
        this.voiceConversionModel.writeToParcel(parcel, i);
        this.reuseAwemeTTSAndVCRefIDsModel.writeToParcel(parcel, i);
        parcel.writeSerializable(this.ttsVoiceInfo);
        this.instantCloneConsumption.writeToParcel(parcel, i);
        this.mixEditingModel.writeToParcel(parcel, i);
        this.ttsModel.writeToParcel(parcel, i);
        this.capcutVcTTSModel.writeToParcel(parcel, i);
        this.streamVoiceConversionModel.writeToParcel(parcel, i);
        parcel.writeParcelable(this.veAudioEffectParam, i);
        this.originalSoundModel.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ttsVoiceModel, i);
        this.ttsStickerModel.getClass();
        parcel.writeInt(1);
        this.audioAECModel.writeToParcel(parcel, i);
        this.audioLoudnessModel.writeToParcel(parcel, i);
        parcel.writeInt(this.ifRecordWithHeadset ? 1 : 0);
        NowsShootModel nowsShootModel = this.nowsShootModel;
        if (nowsShootModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nowsShootModel.writeToParcel(parcel, i);
        }
        DMMediaModel dMMediaModel = this.dmMediaModel;
        if (dMMediaModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dMMediaModel.writeToParcel(parcel, i);
        }
        PcsCourseVideoModel pcsCourseVideoModel = this.pcsPaidVideoMediaModel;
        if (pcsCourseVideoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pcsCourseVideoModel.writeToParcel(parcel, i);
        }
        this.effectData.writeToParcel(parcel, i);
        parcel.writeParcelable(this.commerceModel, i);
        SchedulePostTime schedulePostTime = this.scheduleTime;
        if (schedulePostTime == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            schedulePostTime.writeToParcel(parcel, i);
        }
        AIDubbing aIDubbing = this.aiDubbing;
        if (aIDubbing == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIDubbing.writeToParcel(parcel, i);
        }
        InlineCaptionModel inlineCaptionModel = this.inlineCaptionModel;
        if (inlineCaptionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inlineCaptionModel.writeToParcel(parcel, i);
        }
        InlineCaptionExperimentInformation inlineCaptionExperimentInformation = this.inlineCaptionExperimentInformation;
        if (inlineCaptionExperimentInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(inlineCaptionExperimentInformation.experimentType);
        }
        this.autoCutModel.writeToParcel(parcel, i);
        this.autoPickModel.writeToParcel(parcel, i);
        this.autoCutAnchorModel.writeToParcel(parcel, i);
        this.photoModeAutoCutModel.writeToParcel(parcel, i);
        this.photoModeEnterEditingStage.writeToParcel(parcel, i);
        this.templateSchemaData.writeToParcel(parcel, i);
        this.ugcTemplateData.writeToParcel(parcel, i);
        this.photoModeTemplateData.writeToParcel(parcel, i);
        PhotoTemplateInfo photoTemplateInfo = this.photoTemplateInfo;
        if (photoTemplateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoTemplateInfo.writeToParcel(parcel, i);
        }
        this.imageEffectTemplateData.writeToParcel(parcel, i);
        this.pugcTemplateData.writeToParcel(parcel, i);
        this.mvModel.writeToParcel(parcel, i);
        TemplateDynamicSlotModel templateDynamicSlotModel = this.templateDynamicSlotModel;
        if (templateDynamicSlotModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateDynamicSlotModel.writeToParcel(parcel, i);
        }
        this.templateData.writeToParcel(parcel, i);
        this.templateAnchorData.writeToParcel(parcel, i);
        this.templateConsumeData.writeToParcel(parcel, i);
        EditPostModel editPostModel = this.editPostModel;
        if (editPostModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editPostModel.writeToParcel(parcel, i);
        }
        Video2StickerModel video2StickerModel = this.video2StickerModel;
        if (video2StickerModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video2StickerModel.writeToParcel(parcel, i);
        }
        this.trendingUploadModel.writeToParcel(parcel, i);
        this.hdrModel.writeToParcel(parcel, i);
        this.bytevcVC1Model.writeToParcel(parcel, i);
        this.commonMobModel.writeToParcel(parcel, i);
        this.privacySettingModel.writeToParcel(parcel, i);
        parcel.writeLong(this.creatorModel.scheduleTime);
        this.ansaPromptModel.writeToParcel(parcel, i);
        this.changeAvatarModel.writeToParcel(parcel, i);
        this.onThisDayData.writeToParcel(parcel, i);
        CelebrationData celebrationData = this.celebrationData;
        if (celebrationData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            celebrationData.writeToParcel(parcel, i);
        }
        this.musicShareStoryData.writeToParcel(parcel, i);
        this.stickerModel.writeToParcel(parcel, i);
        PublishItemTrackModel publishItemTrackModel = this.publishItemTrackModel;
        if (publishItemTrackModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publishItemTrackModel.writeToParcel(parcel, i);
        }
        this.magicCombineEffectModel.writeToParcel(parcel, i);
        this.paidContentModel.writeToParcel(parcel, i);
        this.storyModel.writeToParcel(parcel, i);
        parcel.writeInt(this.storyEditModel.isStoryEditMode ? 1 : 0);
        TTStoryUploadModel tTStoryUploadModel = this.ttStoryUploadModel;
        if (tTStoryUploadModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tTStoryUploadModel.writeToParcel(parcel, i);
        }
        TextPublishUploadModel textPublishUploadModel = this.textPublishUploadModel;
        if (textPublishUploadModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textPublishUploadModel.writeToParcel(parcel, i);
        }
        this.collabInfoModel.writeToParcel(parcel, i);
        parcel.writeSerializable(this.streaksData);
        this.storyEventStickerData.writeToParcel(parcel, i);
        parcel.writeSerializable(this.extractFramesModel);
        this.socialModel.writeToParcel(parcel, i);
        this.creativeFlowData.writeToParcel(parcel, i);
        this.creativeInfo.writeToParcel(parcel, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeSerializable(this.poiData);
        parcel.writeSerializable(this.poiDataFromLynx);
        parcel.writeSerializable(this.poiPostDataFromSchema);
        this.poiLynxInfoModel.writeToParcel(parcel, i);
        parcel.writeSerializable(this.poiMobParams);
        this.gpsConsumingOptModel.writeToParcel(parcel, i);
        CustomParcelableExtraInfo customParcelableExtraInfo = this.customParcelableExtraInfo;
        if (customParcelableExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customParcelableExtraInfo.writeToParcel(parcel, i);
        }
        this.editorProDraftModel.writeToParcel(parcel, i);
        this.editorProSchemeModel.writeToParcel(parcel, i);
        this.openPlatformModel.writeToParcel(parcel, i);
        parcel.writeInt(this.migrateModel.isEditModelPartitionPhase1Draft ? 1 : 0);
        parcel.writeString(this.enterFromH5Type);
        this.aiSelfModel.writeToParcel(parcel, i);
        this.aiSelfScanFaceModel.writeToParcel(parcel, i);
        this.restoreModel.writeToParcel(parcel, i);
        TangramTempModel tangramTempModel = this.tangramTempModel;
        if (tangramTempModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tangramTempModel.writeToParcel(parcel, i);
        }
        TangramPersistenceModel tangramPersistenceModel = this.tangramPersistenceModel;
        if (tangramPersistenceModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tangramPersistenceModel.writeToParcel(parcel, i);
        }
        this.gamePoiModel.writeToParcel(parcel, i);
        this.productRecommendModel.writeToParcel(parcel, i);
        AICreateModel aICreateModel = this.aiCreateModel;
        if (aICreateModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aICreateModel.writeToParcel(parcel, i);
        }
        this.liveRecordModel.writeToParcel(parcel, i);
        List<MediaLocationMetaDataModel> list = this.mediaLocationMetaDataList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MediaLocationMetaDataModel> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.productPath);
        parcel.writeString(this.successFlag);
        this.propFromGroupModel.writeToParcel(parcel, i);
        parcel.writeString(this.feedPropPinModel.effectId);
        this.propShowModel.writeToParcel(parcel, i);
        parcel.writeString(this.failFlag);
        this.aigcExtraModel.writeToParcel(parcel, i);
        parcel.writeString(this.templateDebugId);
        parcel.writeString(this.templateDebugType);
        CreatorAppModel creatorAppModel = this.creatorAppModel;
        if (creatorAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(creatorAppModel.enterAlbumScene);
        }
        parcel.writeString(this.groupId);
        parcel.writeString(this.shootEnterFrom);
        AIGroupShotTemplateModel aIGroupShotTemplateModel = this.dmGroupShotTemplateModel;
        if (aIGroupShotTemplateModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIGroupShotTemplateModel.writeToParcel(parcel, i);
        }
        MinisGameModel minisGameModel = this.miniGameData;
        if (minisGameModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minisGameModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.asyncFuncList);
        parcel.writeStringList(this.asyncTaskIds);
        parcel.writeInt(this.isFromEditTab ? 1 : 0);
        parcel.writeInt(this.isFromEditTabUpload ? 1 : 0);
        Integer num = this.asyncTaskCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isAsyncTaskFailed ? 1 : 0);
        parcel.writeString(this.asyncSource);
        Integer num2 = this.asyncStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        this.aiLivePhotoModel.writeToParcel(parcel, i);
        this.aigcBusinessModel.writeToParcel(parcel, i);
        parcel.writeInt(this.aigcWorkflowModel.hasAigcNewFrameworkTask ? 1 : 0);
        this.newVideoPipelineExtraModel.writeToParcel(parcel, i);
        this.detailPageRecallDraftModel.writeToParcel(parcel, i);
        this.draftBoxModel.writeToParcel(parcel, i);
        LivePhotoModel livePhotoModel = this.livePhotoModel;
        if (livePhotoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livePhotoModel.writeToParcel(parcel, i);
        }
        this.aigcOfflineModel.writeToParcel(parcel, i);
        this.aigcMetadataModel.writeToParcel(parcel, i);
        this.landscapeVideoModel.writeToParcel(parcel, i);
        CameraLayoutModel cameraLayoutModel = this.cameraLayoutModel;
        if (cameraLayoutModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cameraLayoutModel.writeToParcel(parcel, i);
        }
        AIChatGenModel aIChatGenModel = this.aiChatGenModel;
        if (aIChatGenModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenModel.writeToParcel(parcel, i);
        }
        CreationSearchModel creationSearchModel = this.creationSearchModel;
        if (creationSearchModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creationSearchModel.writeToParcel(parcel, i);
        }
        VideoImageSeparateSwitchModel videoImageSeparateSwitchModel = this.videoImageSeparateSwitchModel;
        if (videoImageSeparateSwitchModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoImageSeparateSwitchModel.writeToParcel(parcel, i);
        }
        QuickGridModel quickGridModel = this.quickGridModel;
        if (quickGridModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quickGridModel.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.mixStickerInfo);
        DeclarationModel declarationModel = this.declarationModel;
        if (declarationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            declarationModel.writeToParcel(parcel, i);
        }
        LiveModel liveModel = this.liveModel;
        if (liveModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liveModel.writeToParcel(parcel, i);
        }
        PovModel povModel = this.povModel;
        if (povModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            povModel.writeToParcel(parcel, i);
        }
        AlbumOpenApiModel albumOpenApiModel = this.albumOpenApiModel;
        if (albumOpenApiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            albumOpenApiModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.recordConflictsModel.enterMethodByConflicts);
    }

    public static CreativeModel LIZIZ(CreativeModel creativeModel, EditEffectModel editEffectModel, DraftInfoModel draftInfoModel, CreativeInfo creativeInfo, AIGCOfflineModel aIGCOfflineModel, int i, int i2, int i3, int i4) {
        CreativeInitialModel creativeInitialModel;
        EventData eventData;
        RecordData recordData;
        RecordEffectModel recordEffectModel;
        LoadMusicAndEffectModel loadMusicAndEffectModel;
        RecordDowngradeModel recordDowngradeModel;
        ReuseSoundAndEffectModel reuseSoundAndEffectModel;
        AYMobCacheModel aYMobCacheModel;
        LandingModel landingModel;
        MusicAndTimeModel musicAndTimeModel;
        FlashModel flashModel;
        BeautyModel beautyModel;
        CountDownModel countDownModel;
        RecordMobModel recordMobModel;
        ShootLinkPerfMobModel shootLinkPerfMobModel;
        AlbumModel albumModel;
        GreenScreenEffectModel greenScreenEffectModel;
        NewGreenScreenEffectModel newGreenScreenEffectModel;
        ImportModel importModel;
        AlbumMobModel albumMobModel;
        VolumeInfoModel volumeInfoModel;
        MusicVolumeInfoModel musicVolumeInfoModel;
        SoundEffectInfoModel soundEffectInfoModel;
        MusicBuzModel musicBuzModel;
        MdpInfoModel mdpInfoModel;
        StickPointModel stickPointModel;
        CutSameModel cutSameModel;
        EditModel editModel;
        CanvasVideoData canvasVideoData;
        EditBackSaveModel editBackSaveModel;
        NLEInfoModel nLEInfoModel;
        StoryPublishNetworkInfo storyPublishNetworkInfo;
        PublishSecureModel publishSecureModel;
        SparkPublishModel sparkPublishModel;
        Text2ImageModel text2ImageModel;
        PublishCustomCoverModel publishCustomCoverModel;
        PublishMobParams publishMobParams;
        CoverPublishModel coverPublishModel;
        MicDataModel micDataModel;
        CheckPointModel checkPointModel;
        LoudnessBalanceModel loudnessBalanceModel;
        AudioAlgorithmModel audioAlgorithmModel;
        AudioVolumeAdjustModel audioVolumeAdjustModel;
        AudioCopyrightDetectModel audioCopyrightDetectModel;
        int i5;
        VoiceConversionModel voiceConversionModel;
        int i6;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        TtsVoiceInfo ttsVoiceInfo;
        int i7;
        InstantCloneConsumptionModel instantCloneConsumptionModel;
        int i8;
        MixEditingModel mixEditingModel;
        int i9;
        TTSModel tTSModel;
        int i10;
        CapcutVcTTSModel capcutVcTTSModel;
        int i11;
        StreamVoiceConversionModel streamVoiceConversionModel;
        int i12;
        AudioEffectParam audioEffectParam;
        int i13;
        OriginalSoundModel originalSoundModel;
        int i14;
        TTSVoiceModel tTSVoiceModel;
        int i15;
        TTSStickerModel tTSStickerModel;
        int i16;
        AudioAECModel audioAECModel;
        AudioLoudnessModel audioLoudnessModel;
        boolean z;
        NowsShootModel nowsShootModel;
        DMMediaModel dMMediaModel;
        PcsCourseVideoModel pcsCourseVideoModel;
        OnThisDayData onThisDayData;
        CelebrationData celebrationData;
        MusicShareStoryData musicShareStoryData;
        StickerNewEngineModel stickerNewEngineModel;
        PublishItemTrackModel publishItemTrackModel;
        MagicCombineEffectModel magicCombineEffectModel;
        PaidContentVideoModel paidContentVideoModel;
        StoryShootModel storyShootModel;
        StoryEditModel storyEditModel;
        TTStoryUploadModel tTStoryUploadModel;
        TextPublishUploadModel textPublishUploadModel;
        CollabInfoModel collabInfoModel;
        StreaksData streaksData;
        StorySocialEventStickerModel storySocialEventStickerModel;
        int i17;
        ExtractFramesModel extractFramesModel;
        int i18;
        SocialModel socialModel;
        CreativeFlowData creativeFlowData;
        int i19;
        MicroAppModel microAppModel;
        int i20;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct;
        int i21;
        PoiData poiData;
        int i22;
        C443120HZe<PoiData, Integer, String> c443120HZe;
        int i23;
        PoiData poiData2;
        int i24;
        PoiLynxInfoModel poiLynxInfoModel;
        int i25;
        PoiMobParam poiMobParam;
        int i26;
        GpsConsumingOptModel gpsConsumingOptModel;
        int i27;
        CustomParcelableExtraInfo customParcelableExtraInfo;
        EditorProDraftModel editorProDraftModel;
        EditorProSchemeModel editorProSchemeModel;
        OpenPlatformModel openPlatformModel;
        MigrateModel migrateModel;
        String str;
        AILivePhotoModel aILivePhotoModel;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AIGCWorkflowModel aIGCWorkflowModel;
        NewBackgroundVideoPipelineModel newBackgroundVideoPipelineModel;
        DetailPageRecallDraftModel detailPageRecallDraftModel;
        DraftBoxModel draftBoxModel;
        LivePhotoModel livePhotoModel;
        AigcMetadataModel aigcMetadataModel;
        LandscapeVideoModel landscapeVideoModel;
        CameraLayoutModel cameraLayoutModel;
        AIChatGenModel aIChatGenModel;
        CreationSearchModel creationSearchModel;
        VideoImageSeparateSwitchModel videoImageSeparateSwitchModel;
        int i28;
        QuickGridModel quickGridModel;
        int i29;
        MixStickerInfo mixStickerInfo;
        DeclarationModel declarationModel;
        int i30;
        LiveModel liveModel;
        int i31;
        PovModel povModel;
        int i32;
        AlbumOpenApiModel albumOpenApiModel;
        RecordConflictsModel recordConflictsModel;
        AIGCOfflineModel aIGCOfflineModel2 = aIGCOfflineModel;
        CreativeInfo creativeInfo2 = creativeInfo;
        DraftInfoModel draftInfoModel2 = draftInfoModel;
        EditEffectModel editEffectModel2 = editEffectModel;
        if ((i & 1) != 0) {
            creativeInitialModel = creativeModel.initialModel;
        } else {
            creativeInitialModel = null;
        }
        if ((i & 2) != 0) {
            eventData = creativeModel.eventData;
        } else {
            eventData = null;
        }
        if ((i & 4) != 0) {
            recordData = creativeModel.recordData;
        } else {
            recordData = null;
        }
        if ((i & 8) != 0) {
            recordEffectModel = creativeModel.recordEffectModel;
        } else {
            recordEffectModel = null;
        }
        if ((i & 16) != 0) {
            loadMusicAndEffectModel = creativeModel.loadMusicAndEffectModel;
        } else {
            loadMusicAndEffectModel = null;
        }
        if ((i & 32) != 0) {
            recordDowngradeModel = creativeModel.recordDowngradeModel;
        } else {
            recordDowngradeModel = null;
        }
        if ((i & 64) != 0) {
            reuseSoundAndEffectModel = creativeModel.reuseSoundAndEffectModel;
        } else {
            reuseSoundAndEffectModel = null;
        }
        if ((i & 128) != 0) {
            aYMobCacheModel = creativeModel.ayMobCacheModel;
        } else {
            aYMobCacheModel = null;
        }
        if ((i & 256) != 0) {
            landingModel = creativeModel.landingModel;
        } else {
            landingModel = null;
        }
        if ((i & 512) != 0) {
            musicAndTimeModel = creativeModel.musicAndTimeModel;
        } else {
            musicAndTimeModel = null;
        }
        if ((i & 1024) != 0) {
            flashModel = creativeModel.flashModel;
        } else {
            flashModel = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            beautyModel = creativeModel.beautyModel;
        } else {
            beautyModel = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            countDownModel = creativeModel.countDownModel;
        } else {
            countDownModel = null;
        }
        if ((i & 8192) != 0) {
            recordMobModel = creativeModel.recordMobModel;
        } else {
            recordMobModel = null;
        }
        if ((i & 16384) != 0) {
            shootLinkPerfMobModel = creativeModel.shootLinkPerfMobModel;
        } else {
            shootLinkPerfMobModel = null;
        }
        if ((32768 & i) != 0) {
            albumModel = creativeModel.albumModel;
        } else {
            albumModel = null;
        }
        if ((65536 & i) != 0) {
            greenScreenEffectModel = creativeModel.greenScreenEffectModel;
        } else {
            greenScreenEffectModel = null;
        }
        if ((i & 131072) != 0) {
            newGreenScreenEffectModel = creativeModel.newGreenScreenEffectModel;
        } else {
            newGreenScreenEffectModel = null;
        }
        if ((262144 & i) != 0) {
            importModel = creativeModel.importModel;
        } else {
            importModel = null;
        }
        if ((524288 & i) != 0) {
            albumMobModel = creativeModel.albumMobModel;
        } else {
            albumMobModel = null;
        }
        if ((1048576 & i) != 0) {
            volumeInfoModel = creativeModel.volumeInfoModel;
        } else {
            volumeInfoModel = null;
        }
        if ((2097152 & i) != 0) {
            musicVolumeInfoModel = creativeModel.musicVolumeInfoModel;
        } else {
            musicVolumeInfoModel = null;
        }
        if ((4194304 & i) != 0) {
            soundEffectInfoModel = creativeModel.soundEffectInfoModel;
        } else {
            soundEffectInfoModel = null;
        }
        if ((8388608 & i) != 0) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        if ((16777216 & i) != 0) {
            mdpInfoModel = creativeModel.mdpInfoModel;
        } else {
            mdpInfoModel = null;
        }
        if ((33554432 & i) != 0) {
            stickPointModel = creativeModel.stickPointModel;
        } else {
            stickPointModel = null;
        }
        if ((67108864 & i) != 0) {
            cutSameModel = creativeModel.cutSameModel;
        } else {
            cutSameModel = null;
        }
        if ((134217728 & i) != 0) {
            editModel = creativeModel.editModel;
        } else {
            editModel = null;
        }
        if ((268435456 & i) != 0) {
            canvasVideoData = creativeModel.canvasVideoData;
        } else {
            canvasVideoData = null;
        }
        if ((536870912 & i) != 0) {
            editEffectModel2 = creativeModel.editEffectModel;
        }
        if ((1073741824 & i) != 0) {
            editBackSaveModel = creativeModel.editBackSaveModel;
        } else {
            editBackSaveModel = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            nLEInfoModel = creativeModel.nleInfoModel;
        } else {
            nLEInfoModel = null;
        }
        EditStickerModel editStickerModel = creativeModel.editStickerModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel;
        InfoStickerModel infoStickerModel = creativeModel.infoStickerModel;
        InfoStickerCategoryParams infoStickerCategoryParams = creativeModel.infoStickerCategoryParams;
        EditVideoEnhanceModel editVideoEnhanceModel = creativeModel.editVideoEnhanceModel;
        EditSaveLocalModel editSaveLocalModel = creativeModel.editSaveLocalModel;
        Cut2EditTransferModel cut2EditTransferModel = creativeModel.cut2EditTransferModel;
        EditPageRestoreActivityModel editPageRestoreActivityModel = creativeModel.editPageRestoreActivityModel;
        int i33 = creativeModel.mRestoreType;
        CreationTypeModel creationTypeModel = creativeModel.creationTypeModel;
        ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
        EditPhotoModel editPhotoModel = creativeModel.editPhotoModel;
        ImageEditModel imageEditModel = creativeModel.imageEditModel;
        AICoverMobModel aICoverMobModel = creativeModel.aiCoverMobModel;
        ImagePublishModel imagePublishModel = creativeModel.imagePublishModel;
        ImagePublishBackSaveModel imagePublishBackSaveModel = creativeModel.imagePublishBackSaveModel;
        SoundSyncModel soundSyncModel = creativeModel.soundSyncModel;
        FilterModel filterModel = creativeModel.filterModel;
        RecordFilterModel recordFilterModel = creativeModel.recordFilterModel;
        MirrorMode mirrorMode = creativeModel.mirrorMode;
        DuetModel duetModel = creativeModel.duetModel;
        String str2 = creativeModel.effectEntrancePosition;
        String str3 = creativeModel.effectCarouselAction;
        int i34 = creativeModel.effectCarouselIndex;
        StitchModel stitchModel = creativeModel.stitchModel;
        MobileEffectsModel2 mobileEffectsModel2 = creativeModel.mobileEffectsModel2;
        PrePublishStatusModel prePublishStatusModel = creativeModel.prePublishStatusModel;
        PostPageModel postPageModel = creativeModel.postPageModel;
        FollowUpPublishTrackerModel followUpPublishTrackerModel = creativeModel.followUpPublishTrackerModel;
        PostLandingModel postLandingModel = creativeModel.postLandingModel;
        PublishPreviewModel publishPreviewModel = creativeModel.publishPreviewModel;
        PublishModel publishModel = creativeModel.publishModel;
        if ((i2 & 1) != 0) {
            storyPublishNetworkInfo = creativeModel.storyPublishNetworkInfo;
        } else {
            storyPublishNetworkInfo = null;
        }
        if ((i2 & 2) != 0) {
            publishSecureModel = creativeModel.publishSecureModel;
        } else {
            publishSecureModel = null;
        }
        if ((i2 & 4) != 0) {
            sparkPublishModel = creativeModel.sparkPublishModel;
        } else {
            sparkPublishModel = null;
        }
        if ((i2 & 8) != 0) {
            text2ImageModel = creativeModel.text2ImageModel;
        } else {
            text2ImageModel = null;
        }
        if ((i2 & 16) != 0) {
            publishCustomCoverModel = creativeModel.publishCustomCoverModel;
        } else {
            publishCustomCoverModel = null;
        }
        if ((i2 & 32) != 0) {
            publishMobParams = creativeModel.publishMobParams;
        } else {
            publishMobParams = null;
        }
        if ((i2 & 64) != 0) {
            coverPublishModel = creativeModel.coverPublishModel;
        } else {
            coverPublishModel = null;
        }
        if ((i2 & 128) != 0) {
            draftInfoModel2 = creativeModel.draftInfoModel;
        }
        if ((i2 & 256) != 0) {
            micDataModel = creativeModel.micDataModel;
        } else {
            micDataModel = null;
        }
        if ((i2 & 512) != 0) {
            checkPointModel = creativeModel.checkPointModel;
        } else {
            checkPointModel = null;
        }
        if ((i2 & 1024) != 0) {
            loudnessBalanceModel = creativeModel.loudnessBalanceModel;
        } else {
            loudnessBalanceModel = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            audioAlgorithmModel = creativeModel.audioAlgorithmModel;
        } else {
            audioAlgorithmModel = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            audioVolumeAdjustModel = creativeModel.audioVolumeAdjustModel;
        } else {
            audioVolumeAdjustModel = null;
        }
        if ((i2 & 8192) != 0) {
            audioCopyrightDetectModel = creativeModel.audioCopyrightDetectModel;
        } else {
            audioCopyrightDetectModel = null;
        }
        if ((i2 & 16384) != 0) {
            voiceConversionModel = creativeModel.voiceConversionModel;
            i5 = 32768;
        } else {
            i5 = 32768;
            voiceConversionModel = null;
        }
        if ((i5 & i2) != 0) {
            reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel;
            i6 = 65536;
        } else {
            i6 = 65536;
            reuseAwemeTTSAndVCRefIDsModel = null;
        }
        if ((i6 & i2) != 0) {
            ttsVoiceInfo = creativeModel.ttsVoiceInfo;
        } else {
            ttsVoiceInfo = null;
        }
        if ((i2 & 131072) != 0) {
            instantCloneConsumptionModel = creativeModel.instantCloneConsumption;
            i7 = 262144;
        } else {
            i7 = 262144;
            instantCloneConsumptionModel = null;
        }
        if ((i7 & i2) != 0) {
            mixEditingModel = creativeModel.mixEditingModel;
            i8 = 524288;
        } else {
            i8 = 524288;
            mixEditingModel = null;
        }
        if ((i8 & i2) != 0) {
            tTSModel = creativeModel.ttsModel;
            i9 = 1048576;
        } else {
            i9 = 1048576;
            tTSModel = null;
        }
        if ((i9 & i2) != 0) {
            capcutVcTTSModel = creativeModel.capcutVcTTSModel;
            i10 = 2097152;
        } else {
            i10 = 2097152;
            capcutVcTTSModel = null;
        }
        if ((i10 & i2) != 0) {
            streamVoiceConversionModel = creativeModel.streamVoiceConversionModel;
            i11 = 4194304;
        } else {
            i11 = 4194304;
            streamVoiceConversionModel = null;
        }
        if ((i11 & i2) != 0) {
            audioEffectParam = creativeModel.veAudioEffectParam;
            i12 = 8388608;
        } else {
            i12 = 8388608;
            audioEffectParam = null;
        }
        if ((i12 & i2) != 0) {
            originalSoundModel = creativeModel.originalSoundModel;
            i13 = 16777216;
        } else {
            i13 = 16777216;
            originalSoundModel = null;
        }
        if ((i13 & i2) != 0) {
            tTSVoiceModel = creativeModel.ttsVoiceModel;
            i14 = 33554432;
        } else {
            i14 = 33554432;
            tTSVoiceModel = null;
        }
        if ((i14 & i2) != 0) {
            tTSStickerModel = creativeModel.ttsStickerModel;
            i15 = 67108864;
        } else {
            i15 = 67108864;
            tTSStickerModel = null;
        }
        if ((i15 & i2) != 0) {
            audioAECModel = creativeModel.audioAECModel;
            i16 = 134217728;
        } else {
            i16 = 134217728;
            audioAECModel = null;
        }
        if ((i16 & i2) != 0) {
            audioLoudnessModel = creativeModel.audioLoudnessModel;
        } else {
            audioLoudnessModel = null;
        }
        if ((268435456 & i2) != 0) {
            z = creativeModel.ifRecordWithHeadset;
        } else {
            z = false;
        }
        if ((536870912 & i2) != 0) {
            nowsShootModel = creativeModel.nowsShootModel;
        } else {
            nowsShootModel = null;
        }
        if ((1073741824 & i2) != 0) {
            dMMediaModel = creativeModel.dmMediaModel;
        } else {
            dMMediaModel = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            pcsCourseVideoModel = creativeModel.pcsPaidVideoMediaModel;
        } else {
            pcsCourseVideoModel = null;
        }
        EffectDataTransport effectDataTransport = creativeModel.effectData;
        CommerceToolsModel commerceToolsModel = creativeModel.commerceModel;
        SchedulePostTime schedulePostTime = creativeModel.scheduleTime;
        AIDubbing aIDubbing = creativeModel.aiDubbing;
        InlineCaptionModel inlineCaptionModel = creativeModel.inlineCaptionModel;
        InlineCaptionExperimentInformation inlineCaptionExperimentInformation = creativeModel.inlineCaptionExperimentInformation;
        AutoCutModel autoCutModel = creativeModel.autoCutModel;
        AutoPickModel autoPickModel = creativeModel.autoPickModel;
        AutoCutAnchorModel autoCutAnchorModel = creativeModel.autoCutAnchorModel;
        ImageAlbumData imageAlbumData2 = creativeModel.photoModeAutoCutModel;
        PhotoModeEditingStage photoModeEditingStage = creativeModel.photoModeEnterEditingStage;
        TemplateSchemaData templateSchemaData = creativeModel.templateSchemaData;
        UgcTemplateData ugcTemplateData = creativeModel.ugcTemplateData;
        PhotoModeTemplateData photoModeTemplateData = creativeModel.photoModeTemplateData;
        PhotoTemplateInfo photoTemplateInfo = creativeModel.photoTemplateInfo;
        ImageEffectTemplateReuseData imageEffectTemplateReuseData = creativeModel.imageEffectTemplateData;
        PUgcTemplateData pUgcTemplateData = creativeModel.pugcTemplateData;
        MvModel mvModel = creativeModel.mvModel;
        TemplateDynamicSlotModel templateDynamicSlotModel = creativeModel.templateDynamicSlotModel;
        TemplateData templateData = creativeModel.templateData;
        TemplateAnchorData templateAnchorData = creativeModel.templateAnchorData;
        TemplateConsumeData templateConsumeData = creativeModel.templateConsumeData;
        EditPostModel editPostModel = creativeModel.editPostModel;
        Video2StickerModel video2StickerModel = creativeModel.video2StickerModel;
        TrendingUploadModel trendingUploadModel = creativeModel.trendingUploadModel;
        HDRModel hDRModel = creativeModel.hdrModel;
        VEBytevc1Model vEBytevc1Model = creativeModel.bytevcVC1Model;
        CommonMobParamModel commonMobParamModel = creativeModel.commonMobModel;
        PrivacySettingModel privacySettingModel = creativeModel.privacySettingModel;
        CreatorModel creatorModel = creativeModel.creatorModel;
        AnsaPromptModel ansaPromptModel = creativeModel.ansaPromptModel;
        ChangeAvatarModel changeAvatarModel = creativeModel.changeAvatarModel;
        if ((i3 & 1) != 0) {
            onThisDayData = creativeModel.onThisDayData;
        } else {
            onThisDayData = null;
        }
        if ((i3 & 2) != 0) {
            celebrationData = creativeModel.celebrationData;
        } else {
            celebrationData = null;
        }
        if ((i3 & 4) != 0) {
            musicShareStoryData = creativeModel.musicShareStoryData;
        } else {
            musicShareStoryData = null;
        }
        if ((i3 & 8) != 0) {
            stickerNewEngineModel = creativeModel.stickerModel;
        } else {
            stickerNewEngineModel = null;
        }
        if ((i3 & 16) != 0) {
            publishItemTrackModel = creativeModel.publishItemTrackModel;
        } else {
            publishItemTrackModel = null;
        }
        if ((i3 & 32) != 0) {
            magicCombineEffectModel = creativeModel.magicCombineEffectModel;
        } else {
            magicCombineEffectModel = null;
        }
        if ((i3 & 64) != 0) {
            paidContentVideoModel = creativeModel.paidContentModel;
        } else {
            paidContentVideoModel = null;
        }
        if ((i3 & 128) != 0) {
            storyShootModel = creativeModel.storyModel;
        } else {
            storyShootModel = null;
        }
        if ((i3 & 256) != 0) {
            storyEditModel = creativeModel.storyEditModel;
        } else {
            storyEditModel = null;
        }
        if ((i3 & 512) != 0) {
            tTStoryUploadModel = creativeModel.ttStoryUploadModel;
        } else {
            tTStoryUploadModel = null;
        }
        if ((i3 & 1024) != 0) {
            textPublishUploadModel = creativeModel.textPublishUploadModel;
        } else {
            textPublishUploadModel = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            collabInfoModel = creativeModel.collabInfoModel;
        } else {
            collabInfoModel = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            streaksData = creativeModel.streaksData;
        } else {
            streaksData = null;
        }
        if ((i3 & 8192) != 0) {
            storySocialEventStickerModel = creativeModel.storyEventStickerData;
        } else {
            storySocialEventStickerModel = null;
        }
        if ((i3 & 16384) != 0) {
            extractFramesModel = creativeModel.extractFramesModel;
            i17 = 32768;
        } else {
            i17 = 32768;
            extractFramesModel = null;
        }
        if ((i17 & i3) != 0) {
            socialModel = creativeModel.socialModel;
            i18 = 65536;
        } else {
            i18 = 65536;
            socialModel = null;
        }
        if ((i18 & i3) != 0) {
            creativeFlowData = creativeModel.creativeFlowData;
        } else {
            creativeFlowData = null;
        }
        if ((i3 & 131072) != 0) {
            creativeInfo2 = creativeModel.creativeInfo;
        }
        if ((262144 & i3) != 0) {
            microAppModel = creativeModel.microAppModel;
            i19 = 524288;
        } else {
            i19 = 524288;
            microAppModel = null;
        }
        if ((i19 & i3) != 0) {
            aVUploadMiscInfoStruct = creativeModel.uploadMiscInfoStruct;
            i20 = 1048576;
        } else {
            i20 = 1048576;
            aVUploadMiscInfoStruct = null;
        }
        if ((i20 & i3) != 0) {
            poiData = creativeModel.poiData;
            i21 = 2097152;
        } else {
            i21 = 2097152;
            poiData = null;
        }
        if ((i21 & i3) != 0) {
            c443120HZe = creativeModel.poiDataFromLynx;
            i22 = 4194304;
        } else {
            i22 = 4194304;
            c443120HZe = null;
        }
        if ((i22 & i3) != 0) {
            poiData2 = creativeModel.poiPostDataFromSchema;
            i23 = 8388608;
        } else {
            i23 = 8388608;
            poiData2 = null;
        }
        if ((i23 & i3) != 0) {
            poiLynxInfoModel = creativeModel.poiLynxInfoModel;
            i24 = 16777216;
        } else {
            i24 = 16777216;
            poiLynxInfoModel = null;
        }
        if ((i24 & i3) != 0) {
            poiMobParam = creativeModel.poiMobParams;
            i25 = 33554432;
        } else {
            i25 = 33554432;
            poiMobParam = null;
        }
        if ((i25 & i3) != 0) {
            gpsConsumingOptModel = creativeModel.gpsConsumingOptModel;
            i26 = 67108864;
        } else {
            i26 = 67108864;
            gpsConsumingOptModel = null;
        }
        if ((i26 & i3) != 0) {
            customParcelableExtraInfo = creativeModel.customParcelableExtraInfo;
            i27 = 134217728;
        } else {
            i27 = 134217728;
            customParcelableExtraInfo = null;
        }
        if ((i27 & i3) != 0) {
            editorProDraftModel = creativeModel.editorProDraftModel;
        } else {
            editorProDraftModel = null;
        }
        if ((268435456 & i3) != 0) {
            editorProSchemeModel = creativeModel.editorProSchemeModel;
        } else {
            editorProSchemeModel = null;
        }
        if ((536870912 & i3) != 0) {
            openPlatformModel = creativeModel.openPlatformModel;
        } else {
            openPlatformModel = null;
        }
        if ((1073741824 & i3) != 0) {
            migrateModel = creativeModel.migrateModel;
        } else {
            migrateModel = null;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            str = creativeModel.enterFromH5Type;
        } else {
            str = null;
        }
        AISelfModel aISelfModel = creativeModel.aiSelfModel;
        AISelfScanFaceModel aISelfScanFaceModel = creativeModel.aiSelfScanFaceModel;
        RestoreModel restoreModel = creativeModel.restoreModel;
        TangramTempModel tangramTempModel = creativeModel.tangramTempModel;
        TangramPersistenceModel tangramPersistenceModel = creativeModel.tangramPersistenceModel;
        GamePoiModel gamePoiModel = creativeModel.gamePoiModel;
        ProductRecommendModel productRecommendModel = creativeModel.productRecommendModel;
        AICreateModel aICreateModel = creativeModel.aiCreateModel;
        LiveRecordModel liveRecordModel = creativeModel.liveRecordModel;
        List<MediaLocationMetaDataModel> list = creativeModel.mediaLocationMetaDataList;
        String str4 = creativeModel.productPath;
        String str5 = creativeModel.successFlag;
        PropFromGroupModel propFromGroupModel = creativeModel.propFromGroupModel;
        FeedPropPinModel feedPropPinModel = creativeModel.feedPropPinModel;
        EffectShowModel effectShowModel = creativeModel.propShowModel;
        String str6 = creativeModel.failFlag;
        AIGCExtraModel aIGCExtraModel = creativeModel.aigcExtraModel;
        String str7 = creativeModel.templateDebugId;
        String str8 = creativeModel.templateDebugType;
        CreatorAppModel creatorAppModel = creativeModel.creatorAppModel;
        String str9 = creativeModel.groupId;
        String str10 = creativeModel.shootEnterFrom;
        AIGroupShotTemplateModel aIGroupShotTemplateModel = creativeModel.dmGroupShotTemplateModel;
        MinisGameModel minisGameModel = creativeModel.miniGameData;
        String str11 = creativeModel.asyncFuncList;
        List<String> list2 = creativeModel.asyncTaskIds;
        boolean z2 = creativeModel.isFromEditTab;
        boolean z3 = creativeModel.isFromEditTabUpload;
        Integer num = creativeModel.asyncTaskCount;
        boolean z4 = creativeModel.isAsyncTaskFailed;
        String str12 = creativeModel.asyncSource;
        Integer num2 = creativeModel.asyncStatus;
        if ((i4 & 1) != 0) {
            aILivePhotoModel = creativeModel.aiLivePhotoModel;
        } else {
            aILivePhotoModel = null;
        }
        if ((i4 & 2) != 0) {
            aIGCBusinessModelSet = creativeModel.aigcBusinessModel;
        } else {
            aIGCBusinessModelSet = null;
        }
        if ((i4 & 4) != 0) {
            aIGCWorkflowModel = creativeModel.aigcWorkflowModel;
        } else {
            aIGCWorkflowModel = null;
        }
        if ((i4 & 8) != 0) {
            newBackgroundVideoPipelineModel = creativeModel.newVideoPipelineExtraModel;
        } else {
            newBackgroundVideoPipelineModel = null;
        }
        if ((i4 & 16) != 0) {
            detailPageRecallDraftModel = creativeModel.detailPageRecallDraftModel;
        } else {
            detailPageRecallDraftModel = null;
        }
        if ((i4 & 32) != 0) {
            draftBoxModel = creativeModel.draftBoxModel;
        } else {
            draftBoxModel = null;
        }
        if ((i4 & 64) != 0) {
            livePhotoModel = creativeModel.livePhotoModel;
        } else {
            livePhotoModel = null;
        }
        if ((i4 & 128) != 0) {
            aIGCOfflineModel2 = creativeModel.aigcOfflineModel;
        }
        if ((i4 & 256) != 0) {
            aigcMetadataModel = creativeModel.aigcMetadataModel;
        } else {
            aigcMetadataModel = null;
        }
        if ((i4 & 512) != 0) {
            landscapeVideoModel = creativeModel.landscapeVideoModel;
        } else {
            landscapeVideoModel = null;
        }
        if ((i4 & 1024) != 0) {
            cameraLayoutModel = creativeModel.cameraLayoutModel;
        } else {
            cameraLayoutModel = null;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            aIChatGenModel = creativeModel.aiChatGenModel;
        } else {
            aIChatGenModel = null;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            creationSearchModel = creativeModel.creationSearchModel;
        } else {
            creationSearchModel = null;
        }
        if ((i4 & 8192) != 0) {
            videoImageSeparateSwitchModel = creativeModel.videoImageSeparateSwitchModel;
        } else {
            videoImageSeparateSwitchModel = null;
        }
        if ((i4 & 16384) != 0) {
            quickGridModel = creativeModel.quickGridModel;
            i28 = 32768;
        } else {
            i28 = 32768;
            quickGridModel = null;
        }
        if ((i28 & i4) != 0) {
            mixStickerInfo = creativeModel.mixStickerInfo;
            i29 = 65536;
        } else {
            i29 = 65536;
            mixStickerInfo = null;
        }
        if ((i29 & i4) != 0) {
            declarationModel = creativeModel.declarationModel;
        } else {
            declarationModel = null;
        }
        if ((i4 & 131072) != 0) {
            liveModel = creativeModel.liveModel;
            i30 = 262144;
        } else {
            i30 = 262144;
            liveModel = null;
        }
        if ((i30 & i4) != 0) {
            povModel = creativeModel.povModel;
            i31 = 524288;
        } else {
            i31 = 524288;
            povModel = null;
        }
        if ((i31 & i4) != 0) {
            albumOpenApiModel = creativeModel.albumOpenApiModel;
            i32 = 1048576;
        } else {
            i32 = 1048576;
            albumOpenApiModel = null;
        }
        if ((i4 & i32) != 0) {
            recordConflictsModel = creativeModel.recordConflictsModel;
        } else {
            recordConflictsModel = null;
        }
        creativeModel.getClass();
        return new CreativeModel(creativeInitialModel, eventData, recordData, recordEffectModel, loadMusicAndEffectModel, recordDowngradeModel, reuseSoundAndEffectModel, aYMobCacheModel, landingModel, musicAndTimeModel, flashModel, beautyModel, countDownModel, recordMobModel, shootLinkPerfMobModel, albumModel, greenScreenEffectModel, newGreenScreenEffectModel, importModel, albumMobModel, volumeInfoModel, musicVolumeInfoModel, soundEffectInfoModel, musicBuzModel, mdpInfoModel, stickPointModel, cutSameModel, editModel, canvasVideoData, editEffectModel2, editBackSaveModel, nLEInfoModel, editStickerModel, editorProAIGCInfoModel, infoStickerModel, infoStickerCategoryParams, editVideoEnhanceModel, editSaveLocalModel, cut2EditTransferModel, editPageRestoreActivityModel, i33, creationTypeModel, imageAlbumData, editPhotoModel, imageEditModel, aICoverMobModel, imagePublishModel, imagePublishBackSaveModel, soundSyncModel, filterModel, recordFilterModel, mirrorMode, duetModel, str2, str3, i34, stitchModel, mobileEffectsModel2, prePublishStatusModel, postPageModel, followUpPublishTrackerModel, postLandingModel, publishPreviewModel, publishModel, storyPublishNetworkInfo, publishSecureModel, sparkPublishModel, text2ImageModel, publishCustomCoverModel, publishMobParams, coverPublishModel, draftInfoModel2, micDataModel, checkPointModel, loudnessBalanceModel, audioAlgorithmModel, audioVolumeAdjustModel, audioCopyrightDetectModel, voiceConversionModel, reuseAwemeTTSAndVCRefIDsModel, ttsVoiceInfo, instantCloneConsumptionModel, mixEditingModel, tTSModel, capcutVcTTSModel, streamVoiceConversionModel, audioEffectParam, originalSoundModel, tTSVoiceModel, tTSStickerModel, audioAECModel, audioLoudnessModel, z, nowsShootModel, dMMediaModel, pcsCourseVideoModel, effectDataTransport, commerceToolsModel, schedulePostTime, aIDubbing, inlineCaptionModel, inlineCaptionExperimentInformation, autoCutModel, autoPickModel, autoCutAnchorModel, imageAlbumData2, photoModeEditingStage, templateSchemaData, ugcTemplateData, photoModeTemplateData, photoTemplateInfo, imageEffectTemplateReuseData, pUgcTemplateData, mvModel, templateDynamicSlotModel, templateData, templateAnchorData, templateConsumeData, editPostModel, video2StickerModel, trendingUploadModel, hDRModel, vEBytevc1Model, commonMobParamModel, privacySettingModel, creatorModel, ansaPromptModel, changeAvatarModel, onThisDayData, celebrationData, musicShareStoryData, stickerNewEngineModel, publishItemTrackModel, magicCombineEffectModel, paidContentVideoModel, storyShootModel, storyEditModel, tTStoryUploadModel, textPublishUploadModel, collabInfoModel, streaksData, storySocialEventStickerModel, extractFramesModel, socialModel, creativeFlowData, creativeInfo2, microAppModel, aVUploadMiscInfoStruct, poiData, c443120HZe, poiData2, poiLynxInfoModel, poiMobParam, gpsConsumingOptModel, customParcelableExtraInfo, editorProDraftModel, editorProSchemeModel, openPlatformModel, migrateModel, str, aISelfModel, aISelfScanFaceModel, restoreModel, tangramTempModel, tangramPersistenceModel, gamePoiModel, productRecommendModel, aICreateModel, liveRecordModel, list, str4, str5, propFromGroupModel, feedPropPinModel, effectShowModel, str6, aIGCExtraModel, str7, str8, creatorAppModel, str9, str10, aIGroupShotTemplateModel, minisGameModel, str11, list2, z2, z3, num, z4, str12, num2, aILivePhotoModel, aIGCBusinessModelSet, aIGCWorkflowModel, newBackgroundVideoPipelineModel, detailPageRecallDraftModel, draftBoxModel, livePhotoModel, aIGCOfflineModel2, aigcMetadataModel, landscapeVideoModel, cameraLayoutModel, aIChatGenModel, creationSearchModel, videoImageSeparateSwitchModel, quickGridModel, mixStickerInfo, declarationModel, liveModel, povModel, albumOpenApiModel, recordConflictsModel);
    }
}
