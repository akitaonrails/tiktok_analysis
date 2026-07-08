package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import X.C0MY0;
import X.InterfaceC1294060jmO;
import X.InterfaceC2270908v5;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC1294060jmO
public final class AVDraftExtras {
    public final transient ArrayList<TimeSpeedModelExtension> LIZ;

    @C09CT("app_voice_to_all_text_switch")
    public int applyVoiceToAllTextSwitch;

    @C09CT("audio_enhance_param")
    public AudioEnhanceParam audioEnhanceParam;

    @C09CT("audio_recorder_param")
    public AudioRecorderParam audioRecorderParam;

    @C09CT("selected_asr_lang")
    public String autoCaptionLang;

    @C09CT("autoEnhanceOn")
    public boolean autoEnhanceOn;

    @C09CT("autoEnhanceType")
    public int autoEnhanceType;

    @C09CT("av_upload_misc_struct")
    public AVUploadMiscInfoStruct avUploadMiscInfoStruct;

    @C09CT("beauty_metadata")
    public ArrayList<BeautyMetadata> beautyMetadata;

    @C09CT("camera_ids")
    public String cameraIds;

    @C09CT("camera_lens_info")
    public ArrayList<String> cameraLensInfo;

    @C09CT("canvas_video_info")
    public CanvasVideoData canvasVideoData;

    @C09CT("clip_shoot_duration")
    public int clipShootDuration;

    @C09CT("commentSetting")
    public int commentSetting;

    @C09CT("comment_sticker_model")
    public CommentVideoModel commentVideoModel;

    @C09CT("commerceData")
    public String commerceData;

    @C09CT("is_commerce_music")
    public boolean commerceMusic;

    @C09CT("containBackgroundVideo")
    public boolean containBackgroundVideo;

    @C09CT("cover_publish_model")
    public CoverPublishModel coverPublishModel;

    @C09CT("creationId")
    public String creationId;

    @C09CT("creation_mode")
    public int creationMode;

    @C09CT("creative_flow_data")
    public CreativeFlowData creativeFlowData;

    @C09CT("creative_info")
    public CreativeInfo creativeInfo;

    @C09CT("current_zoom_value")
    public float currentZoomValue;

    @C09CT("cut_2_edit_transfer_model")
    public Cut2EditTransferModel cut2EditTransferModel;

    @C09CT("cutsame_data")
    public CutSameEditData cutSameData;

    @C09CT("default_prop")
    public boolean defaultProp;

    @C09CT("downloadSetting")
    public int downloadSetting;

    @C09CT("cher_effect_param")
    public DraftCherEffectParam draftCherEffectParam;

    @C09CT("draftId")
    public int draftId;

    @C09CT("draft_ve_audio_effect_param")
    public DraftVEAudioEffectParam draftVEAudioEffectParam;

    @C09CT("draft_video_path")
    public String draftVideoPath;

    @C09CT("duet_extra_info")
    public DuetExtraInfo duetExtraInfo;

    @C09CT("duet_from_duet_button")
    public int duetFromDuetButton;

    @C09CT("duet_layout")
    public String duetLayout;

    @C09CT("duet_mode_type")
    public String duetModeType;

    @C09CT("duet_setting")
    public int duetSetting;

    @C09CT("duet_video_duration")
    public int duetVideoDuration;

    @C09CT("durationMode")
    public boolean durationMode;

    @C09CT("edit_music_sync_mode")
    public boolean editMusicSyncMode;

    @C09CT("extractFramesModel")
    public ExtractFramesModel extractFramesModel;

    @C09CT("fast_import_resolution")
    public String fastImportResolution;

    @C09CT("is_file_length_fixed")
    public boolean fileLengthFixed;

    @C09CT("filterId")
    public String filterId;

    @C09CT("filter_intensity")
    public float filterIntensity;

    @InterfaceC2270908v5
    @C09CT("filter_local_path")
    public String filterLocalPath;

    @C09CT("firstStickerMusicIds")
    public String firstStickerMusicIds;

    @C09CT("from")
    public int from;

    @C09CT("from_item_id")
    public String fromItemId;

    @C09CT("full_song")
    public FullSongDetail fullSongDetail;

    @C09CT("gameScore")
    public int gameScore;

    @C09CT("geofencing_info")
    public List<String> geoFencingData;

    @C09CT("globalData")
    public String globalData;

    @C09CT("green_screen_material_list")
    public ArrayList<GreenScreenMaterial> greenScreenMaterials;

    @C09CT("hashtag_sticker_texts")
    public List<String> hashTagTextList;

    @C09CT("heading")
    public String heading;

    @C09CT("image_album_data")
    public ImageAlbumData imageAlbumData;

    @C09CT("import_video_infos")
    public ArrayList<ImportVideoInfo> importVideoInfos;

    @C09CT("infoStickerModel")
    public InfoStickerModel infoStickerModel;

    @C09CT("is_draft_music_illegal")
    public boolean isDraftMusicIllegal;

    @C09CT("is_duet_green_srceen")
    public boolean isDuetGreenSrceen;

    @C09CT("is_fast_import")
    public boolean isFastImport;

    @C09CT("is_full_song")
    public boolean isFullSong;

    @C09CT("isMultiVideo")
    public boolean isMultiVideo;

    @C09CT("isMuted")
    public boolean isMuted;

    @C09CT("is_now_publish")
    public boolean isNowPublish;

    @C09CT("is_photo_mv_mode")
    public boolean isPhotoMvMode;

    @C09CT("is_photo_mv_mode_1080p")
    public boolean isPhotoMvMode1080p;

    @C09CT("is_photo_mv_music")
    public boolean isPhotoMvMusic;

    @C09CT("is_sound_loop")
    public String isSoundLoop;

    @C09CT("is_stickpoint_mode")
    public boolean isStickPointMode;

    @C09CT("is_story_draft")
    public boolean isStoryDraft;

    @C09CT("is_trimming_limited")
    public boolean isTrimmingLimited;

    @C09CT("update_info_stickers")
    public boolean isUpdateInfoStickers;

    @C09CT("last_output_video_path")
    public String lastOutputVideoPath;

    @C09CT("lightening_extra_info")
    public LighteningExtraInfo lighteningExtraInfo;

    @C09CT("loudness_param")
    public LoudnessBalanceParam loudnessParam;

    @C09CT("mainBusinessData")
    public String mainBusinessData;

    @C09CT("mention_sticker_texts")
    public List<String> mentionTextList;

    @C09CT("message_bubble_texts")
    public List<String> messageBubbleTexts;

    @C09CT("microAppId")
    public String microAppId;

    @C09CT("micro_app_info")
    public MicroAppModel microAppInfo;

    @C09CT("multi_edit_video_data")
    public MultiEditVideoStatusRecordData multiEditVideoData;

    @C09CT("multi_edit_video_size")
    public Map<String, Long> multiEditVideoSize;

    @C09CT("music_end")
    public int musicEnd;

    @C09CT("musicOrigin")
    public String musicOrigin;

    @C09CT("mv_theme_create_video")
    public MvCreateVideoData mvCreateVideoData;

    @C09CT("newDraftId")
    public String newDraftId;

    @C09CT("nleDataPath")
    @C0MY0
    public String nleDataPath;

    @C09CT("open_platform_client_key")
    public String openplatformClientKey;

    @C09CT("open_platform_extra")
    public String openplatformExtra;

    @C09CT("photoCount")
    public int photoCount;

    @C09CT("pic2VideoSource")
    public String pic2VideoSource;

    @C09CT("draft_preview_configure")
    public DraftPreviewConfigure previewConfigure;

    @C09CT("preview_info")
    public EditPreviewInfo previewInfo;

    @C09CT("preview_video_list_copy")
    public List<? extends EditVideoSegment> previewVideoListCopy;

    @C09CT("publish_stage")
    public int publishStage;

    @C09CT("reactionParams")
    public ReactionParams reactionParams;

    @C09CT("record_beauty_mob_param")
    public BeautyMobParam recordBeautyMobParam;

    @C09CT("record_bgm_delay")
    public Integer recordBgmDelay;

    @C09CT("record_filter_ids")
    public String recordFilterIds;

    @C09CT("record_filter_names")
    public String recordFilterNames;

    @C09CT("record_filter_values")
    public String recordFilterValues;

    @C09CT("recordMode")
    public int recordMode;

    @C09CT("save_draft_app_version")
    public long saveDraftAppVersion;

    @C09CT("selectedFilterId")
    public String selectedFilterId;

    @C09CT("selectedFilterLabel")
    public String selectedFilterLabel;

    @C09CT("selectedFilterResId")
    public String selectedFilterResId;

    @C09CT("selectedFilterValue")
    public String selectedFilterValue;

    @C09CT("session_id")
    public String sessionId;

    @C09CT("shared_ar_model")
    public SharedARModel sharedARModel;

    @C09CT("shootFrom")
    public String shootFrom;

    @C09CT("shootMode")
    public int shootMode;

    @C09CT("shoot_publish_duration")
    public long shootPublishDuration;

    @C09CT("shootWay")
    public String shootWay;

    @C09CT("shooted_shoot_mode")
    public int shootedShootMode;

    @C09CT("socialData")
    public String socialData;

    @C09CT("sound_sync_from_anchor")
    public boolean soundSyncFromAnchor;

    @C09CT("status_create_video")
    public StatusCreateVideoData statusCreateVideoData;

    @C09CT("stick_point_data")
    public StickPointData stickPointData;

    @C09CT("stick_point_type")
    public int stickPointType;

    @C09CT("sticker_challenge")
    public StickerChallenge stickerChallenge;

    @C09CT("sticker_info")
    public StickerInfo stickerInfo;

    @C09CT("stitch_params")
    public StitchParams stitchParams;

    @C09CT("stitch_setting")
    public int stitchSetting;

    @C09CT("support_retake")
    public boolean supportRetake;

    @C09CT("tag_user_list")
    public ArrayList<InteractionTagUserInfo> tagUserList;

    @C09CT("techData")
    public String techData;

    @C09CT("text_sticker_challenge")
    public TextStickerChallenges textStickerChallenges;

    @C09CT("draft_time_effect_start_point")
    public Integer timeEffectStartPoint;

    @C09CT("ugData")
    public String ugData;

    @C09CT("uploadMethod")
    public String uploadMethod;

    @C09CT("upload_path")
    public String uploadPath;

    @C09CT("uploadSaveModel")
    public AVUploadSaveModel uploadSaveModel;

    @C09CT("uploadTabNameList")
    public List<String> uploadTabNameList;

    @C09CT("useMusicBeforeEdit")
    public boolean useMusicBeforeEdit;

    @C09CT("videoCanvasHeight")
    public int videoCanvasHeight;

    @C09CT("videoCanvasWidth")
    public int videoCanvasWidth;

    @C09CT("videoCount")
    public int videoCount;

    @C09CT("videoCoverPath")
    @C0MY0
    public String videoCoverPath;

    @C09CT("videoOutHeight")
    public int videoOutHeight;

    @C09CT("videoOutWidth")
    public int videoOutWidth;

    @C09CT("video_part_metadata")
    public Map<String, ? extends Object> videoPartMetadata;

    @C09CT("video_segments_copy")
    public List<DraftVideoSegment> videoSegmentsCopy;

    public AVDraftExtras(int i, int i2, String str, CreativeInfo creativeInfo, String str2, int i3, String str3, boolean z, boolean z2, int i4, int i5, ReactionParams reactionParams, String str4, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ExtractFramesModel extractFramesModel, String str12, String str13, String str14, String str15, BeautyMobParam beautyMobParam, String str16, String str17, String str18, AVUploadSaveModel aVUploadSaveModel, InfoStickerModel infoStickerModel, MicroAppModel microAppModel, int i6, int i7, int i8, String str19, MvCreateVideoData mvCreateVideoData, int i9, ImageAlbumData imageAlbumData, String str20, StatusCreateVideoData statusCreateVideoData, CreativeFlowData creativeFlowData, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, boolean z4, String str21, String str22, String str23, DraftCherEffectParam draftCherEffectParam, int i10, int i11, int i12, int i13, int i14, DraftVEAudioEffectParam draftVEAudioEffectParam, Integer num, String str24, String str25, ArrayList<ImportVideoInfo> arrayList, StickerChallenge stickerChallenge, TextStickerChallenges textStickerChallenges, Map<String, ? extends Object> map, AudioRecorderParam audioRecorderParam, boolean z5, String str26, DraftPreviewConfigure draftPreviewConfigure, List<DraftVideoSegment> list, List<? extends EditVideoSegment> list2, EditPreviewInfo editPreviewInfo, int i15, int i16, float f, String str27, int i17, boolean z6, boolean z7, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z8, StickPointData stickPointData, StickerInfo stickerInfo, CommentVideoModel commentVideoModel, ArrayList<BeautyMetadata> arrayList2, boolean z9, boolean z10, int i18, int i19, String str28, int i20, StitchParams stitchParams, boolean z11, ArrayList<GreenScreenMaterial> arrayList3, ArrayList<String> arrayList4, boolean z12, boolean z13, String str29, FullSongDetail fullSongDetail, int i21, boolean z14, boolean z15, CutSameEditData cutSameEditData, CoverPublishModel coverPublishModel, List<String> list3, boolean z16, SharedARModel sharedARModel, List<String> list4, boolean z17, boolean z18, boolean z19, int i22, float f2, Map<String, Long> map2, List<String> list5, List<String> list6, int i23, int i24, String str30, DuetExtraInfo duetExtraInfo, Integer num2, String str31, CanvasVideoData canvasVideoData, LighteningExtraInfo lighteningExtraInfo, LoudnessBalanceParam loudnessBalanceParam, String str32, String str33, long j, ArrayList<InteractionTagUserInfo> arrayList5, String str34, String str35, AudioEnhanceParam audioEnhanceParam, boolean z20, boolean z21, Cut2EditTransferModel cut2EditTransferModel, boolean z22, String str36, String str37, boolean z23, String str38, String str39, List<String> list7, long j2, String str40, int i25, boolean z24) {
        this.shootMode = i;
        this.from = i2;
        this.creationId = str;
        this.creativeInfo = creativeInfo;
        this.shootWay = str2;
        this.draftId = i3;
        this.newDraftId = str3;
        this.isMultiVideo = z;
        this.durationMode = z2;
        this.recordMode = i4;
        this.gameScore = i5;
        this.reactionParams = reactionParams;
        this.microAppId = str4;
        this.isMuted = z3;
        this.musicOrigin = str5;
        this.mainBusinessData = str6;
        this.socialData = str7;
        this.commerceData = str8;
        this.ugData = str9;
        this.techData = str10;
        this.globalData = str11;
        this.extractFramesModel = extractFramesModel;
        this.filterId = str12;
        this.recordFilterIds = str13;
        this.recordFilterNames = str14;
        this.recordFilterValues = str15;
        this.recordBeautyMobParam = beautyMobParam;
        this.selectedFilterId = str16;
        this.selectedFilterLabel = str17;
        this.selectedFilterValue = str18;
        this.uploadSaveModel = aVUploadSaveModel;
        this.infoStickerModel = infoStickerModel;
        this.microAppInfo = microAppModel;
        this.commentSetting = i6;
        this.duetSetting = i7;
        this.stitchSetting = i8;
        this.firstStickerMusicIds = str19;
        this.mvCreateVideoData = mvCreateVideoData;
        this.creationMode = i9;
        this.imageAlbumData = imageAlbumData;
        this.heading = str20;
        this.statusCreateVideoData = statusCreateVideoData;
        this.creativeFlowData = creativeFlowData;
        this.avUploadMiscInfoStruct = aVUploadMiscInfoStruct;
        this.isFastImport = z4;
        this.fastImportResolution = str21;
        this.draftVideoPath = str22;
        this.videoCoverPath = str23;
        this.draftCherEffectParam = draftCherEffectParam;
        this.videoOutWidth = i10;
        this.videoOutHeight = i11;
        this.videoCanvasWidth = i12;
        this.videoCanvasHeight = i13;
        this.musicEnd = i14;
        this.draftVEAudioEffectParam = draftVEAudioEffectParam;
        this.timeEffectStartPoint = num;
        this.filterLocalPath = str24;
        this.cameraIds = str25;
        this.importVideoInfos = arrayList;
        this.stickerChallenge = stickerChallenge;
        this.textStickerChallenges = textStickerChallenges;
        this.videoPartMetadata = map;
        this.audioRecorderParam = audioRecorderParam;
        this.isStickPointMode = z5;
        this.uploadPath = str26;
        this.previewConfigure = draftPreviewConfigure;
        this.videoSegmentsCopy = list;
        this.previewVideoListCopy = list2;
        this.previewInfo = editPreviewInfo;
        this.videoCount = i15;
        this.photoCount = i16;
        this.filterIntensity = f;
        this.pic2VideoSource = str27;
        this.downloadSetting = i17;
        this.useMusicBeforeEdit = z6;
        this.supportRetake = z7;
        this.multiEditVideoData = multiEditVideoStatusRecordData;
        this.containBackgroundVideo = z8;
        this.stickPointData = stickPointData;
        this.stickerInfo = stickerInfo;
        this.commentVideoModel = commentVideoModel;
        this.beautyMetadata = arrayList2;
        this.isUpdateInfoStickers = z9;
        this.autoEnhanceOn = z10;
        this.autoEnhanceType = i18;
        this.stickPointType = i19;
        this.duetLayout = str28;
        this.duetVideoDuration = i20;
        this.stitchParams = stitchParams;
        this.commerceMusic = z11;
        this.greenScreenMaterials = arrayList3;
        this.cameraLensInfo = arrayList4;
        this.isPhotoMvMode = z12;
        this.isDuetGreenSrceen = z13;
        this.isSoundLoop = str29;
        this.fullSongDetail = fullSongDetail;
        this.clipShootDuration = i21;
        this.isFullSong = z14;
        this.isTrimmingLimited = z15;
        this.cutSameData = cutSameEditData;
        this.coverPublishModel = coverPublishModel;
        this.geoFencingData = list3;
        this.defaultProp = z16;
        this.sharedARModel = sharedARModel;
        this.messageBubbleTexts = list4;
        this.isPhotoMvMusic = z17;
        this.isPhotoMvMode1080p = z18;
        this.isDraftMusicIllegal = z19;
        this.publishStage = i22;
        this.currentZoomValue = f2;
        this.multiEditVideoSize = map2;
        this.mentionTextList = list5;
        this.hashTagTextList = list6;
        this.shootedShootMode = i23;
        this.duetFromDuetButton = i24;
        this.autoCaptionLang = str30;
        this.duetExtraInfo = duetExtraInfo;
        this.recordBgmDelay = num2;
        this.selectedFilterResId = str31;
        this.canvasVideoData = canvasVideoData;
        this.lighteningExtraInfo = lighteningExtraInfo;
        this.loudnessParam = loudnessBalanceParam;
        this.shootFrom = str32;
        this.nleDataPath = str33;
        this.saveDraftAppVersion = j;
        this.tagUserList = arrayList5;
        this.openplatformExtra = str34;
        this.openplatformClientKey = str35;
        this.audioEnhanceParam = audioEnhanceParam;
        this.editMusicSyncMode = z20;
        this.soundSyncFromAnchor = z21;
        this.cut2EditTransferModel = cut2EditTransferModel;
        this.fileLengthFixed = z22;
        this.sessionId = str36;
        this.lastOutputVideoPath = str37;
        this.isStoryDraft = z23;
        this.fromItemId = str38;
        this.uploadMethod = str39;
        this.uploadTabNameList = list7;
        this.shootPublishDuration = j2;
        this.duetModeType = str40;
        this.applyVoiceToAllTextSwitch = i25;
        this.isNowPublish = z24;
        this.LIZ = new ArrayList<>();
    }

    public AVDraftExtras() {
        this(0, 3, UUID.randomUUID().toString(), null, "", 0, "", false, false, 0, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 1, null, null, null, null, null, false, "720*1280", null, null, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, null, null, false, null, null, null, null, null, 0, 0, -1.0f, "", 0, false, true, null, false, null, null, null, null, true, false, 0, 0, null, 0, null, false, null, null, false, false, null, null, 0, false, false, null, null, null, false, null, null, false, false, false, 0, -1.0f, null, null, null, -1, 0, null, new DuetExtraInfo("", "", 0, 0, "", 0), 0, null, null, null, new LoudnessBalanceParam(0.0d, 0.0d, 0.0d), "", null, 0L, null, "", "", new AudioEnhanceParam(false, false, false, false), false, false, null, false, null, null, false, "", "", null, 0L, "", 0, false);
    }

    public final String toString() {
        return "AVDraftExtras(shootMode=" + this.shootMode + ", from=" + this.from + ", creationId=" + this.creationId + ", creativeInfo=" + this.creativeInfo + ", shootWay=" + this.shootWay + ", draftId=" + this.draftId + ", newDraftId=" + this.newDraftId + ", isMultiVideo=" + this.isMultiVideo + ", durationMode=" + this.durationMode + ", recordMode=" + this.recordMode + ", gameScore=" + this.gameScore + ", reactionParams=" + this.reactionParams + ", microAppId=" + this.microAppId + ", isMuted=" + this.isMuted + ", musicOrigin=" + this.musicOrigin + ", mainBusinessData=" + this.mainBusinessData + ", socialData=" + this.socialData + ", commerceData=" + this.commerceData + ", ugData=" + this.ugData + ", techData=" + this.techData + ", globalData=" + this.globalData + ", extractFramesModel=" + this.extractFramesModel + ", filterId=" + this.filterId + ", recordFilterIds=" + this.recordFilterIds + ", recordFilterNames=" + this.recordFilterNames + ", recordFilterValues=" + this.recordFilterValues + ", recordBeautyMobParam=" + this.recordBeautyMobParam + ", selectedFilterId=" + this.selectedFilterId + ", selectedFilterLabel=" + this.selectedFilterLabel + ", selectedFilterValue=" + this.selectedFilterValue + ", uploadSaveModel=" + this.uploadSaveModel + ", infoStickerModel=" + this.infoStickerModel + ", microAppInfo=" + this.microAppInfo + ", commentSetting=" + this.commentSetting + ", duetSetting=" + this.duetSetting + ", stitchSetting=" + this.stitchSetting + ", firstStickerMusicIds=" + this.firstStickerMusicIds + ", mvCreateVideoData=" + this.mvCreateVideoData + ", creationMode=" + this.creationMode + ", imageAlbumData=" + this.imageAlbumData + ", heading=" + this.heading + ", statusCreateVideoData=" + this.statusCreateVideoData + ", creativeFlowData=" + this.creativeFlowData + ", avUploadMiscInfoStruct=" + this.avUploadMiscInfoStruct + ", isFastImport=" + this.isFastImport + ", fastImportResolution=" + this.fastImportResolution + ", draftVideoPath=" + this.draftVideoPath + ", videoCoverPath=" + this.videoCoverPath + ", draftCherEffectParam=" + this.draftCherEffectParam + ", videoOutWidth=" + this.videoOutWidth + ", videoOutHeight=" + this.videoOutHeight + ", videoCanvasWidth=" + this.videoCanvasWidth + ", videoCanvasHeight=" + this.videoCanvasHeight + ", musicEnd=" + this.musicEnd + ", draftVEAudioEffectParam=" + this.draftVEAudioEffectParam + ", timeEffectStartPoint=" + this.timeEffectStartPoint + ", filterLocalPath=" + this.filterLocalPath + ", cameraIds=" + this.cameraIds + ", importVideoInfos=" + this.importVideoInfos + ", stickerChallenge=" + this.stickerChallenge + ", textStickerChallenges=" + this.textStickerChallenges + ", videoPartMetadata=" + this.videoPartMetadata + ", audioRecorderParam=" + this.audioRecorderParam + ", isStickPointMode=" + this.isStickPointMode + ", uploadPath=" + this.uploadPath + ", previewConfigure=" + this.previewConfigure + ", videoSegmentsCopy=" + this.videoSegmentsCopy + ", previewVideoListCopy=" + this.previewVideoListCopy + ", previewInfo=" + this.previewInfo + ", videoCount=" + this.videoCount + ", photoCount=" + this.photoCount + ", filterIntensity=" + this.filterIntensity + ", pic2VideoSource=" + this.pic2VideoSource + ", downloadSetting=" + this.downloadSetting + ", useMusicBeforeEdit=" + this.useMusicBeforeEdit + ", supportRetake=" + this.supportRetake + ", multiEditVideoData=" + this.multiEditVideoData + ", containBackgroundVideo=" + this.containBackgroundVideo + ", stickPointData=" + this.stickPointData + ", stickerInfo=" + this.stickerInfo + ", commentVideoModel=" + this.commentVideoModel + ", beautyMetadata=" + this.beautyMetadata + ", isUpdateInfoStickers=" + this.isUpdateInfoStickers + ", autoEnhanceOn=" + this.autoEnhanceOn + ", autoEnhanceType=" + this.autoEnhanceType + ", stickPointType=" + this.stickPointType + ", duetLayout=" + this.duetLayout + ", duetVideoDuration=" + this.duetVideoDuration + ", stitchParams=" + this.stitchParams + ", commerceMusic=" + this.commerceMusic + ", greenScreenMaterials=" + this.greenScreenMaterials + ", cameraLensInfo=" + this.cameraLensInfo + ", isPhotoMvMode=" + this.isPhotoMvMode + ", isDuetGreenSrceen=" + this.isDuetGreenSrceen + ", isSoundLoop=" + this.isSoundLoop + ", fullSongDetail=" + this.fullSongDetail + ", clipShootDuration=" + this.clipShootDuration + ", isFullSong=" + this.isFullSong + ", isTrimmingLimited=" + this.isTrimmingLimited + ", cutSameData=" + this.cutSameData + ", coverPublishModel=" + this.coverPublishModel + ", geoFencingData=" + this.geoFencingData + ", defaultProp=" + this.defaultProp + ", sharedARModel=" + this.sharedARModel + ", messageBubbleTexts=" + this.messageBubbleTexts + ", isPhotoMvMusic=" + this.isPhotoMvMusic + ", isPhotoMvMode1080p=" + this.isPhotoMvMode1080p + ", isDraftMusicIllegal=" + this.isDraftMusicIllegal + ", publishStage=" + this.publishStage + ", currentZoomValue=" + this.currentZoomValue + ", multiEditVideoSize=" + this.multiEditVideoSize + ", mentionTextList=" + this.mentionTextList + ", hashTagTextList=" + this.hashTagTextList + ", shootedShootMode=" + this.shootedShootMode + ", duetFromDuetButton=" + this.duetFromDuetButton + ", autoCaptionLang=" + this.autoCaptionLang + ", duetExtraInfo=" + this.duetExtraInfo + ", recordBgmDelay=" + this.recordBgmDelay + ", selectedFilterResId=" + this.selectedFilterResId + ", canvasVideoData=" + this.canvasVideoData + ", lighteningExtraInfo=" + this.lighteningExtraInfo + ", loudnessParam=" + this.loudnessParam + ", shootFrom=" + this.shootFrom + ", nleDataPath=" + this.nleDataPath + ", saveDraftAppVersion=" + this.saveDraftAppVersion + ", tagUserList=" + this.tagUserList + ", openplatformExtra=" + this.openplatformExtra + ", openplatformClientKey=" + this.openplatformClientKey + ", audioEnhanceParam=" + this.audioEnhanceParam + ", editMusicSyncMode=" + this.editMusicSyncMode + ", soundSyncFromAnchor=" + this.soundSyncFromAnchor + ", cut2EditTransferModel=" + this.cut2EditTransferModel + ", fileLengthFixed=" + this.fileLengthFixed + ", sessionId=" + this.sessionId + ", lastOutputVideoPath=" + this.lastOutputVideoPath + ", isStoryDraft=" + this.isStoryDraft + ", fromItemId=" + this.fromItemId + ", uploadMethod=" + this.uploadMethod + ", uploadTabNameList=" + this.uploadTabNameList + ", shootPublishDuration=" + this.shootPublishDuration + ", duetModeType=" + this.duetModeType + ", applyVoiceToAllTextSwitch=" + this.applyVoiceToAllTextSwitch + ", isNowPublish=" + this.isNowPublish + ')';
    }
}
