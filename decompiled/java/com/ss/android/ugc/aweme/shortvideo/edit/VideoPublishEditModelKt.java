package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C0C64;
import X.C0FQ0;
import X.C0L9R;
import X.C13LP;
import X.C1420140n3k;
import X.C1429890nJT;
import X.C1437400nVa;
import X.C1438430nXF;
import X.C1438590nXV;
import X.C383310F1d;
import X.C548920Lfu;
import X.C7740030o;
import X.InterfaceC1294060jmO;
import X.InterfaceC1438500nXM;
import X.InterfaceC570470MYz;
import android.os.Parcel;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.extra.CustomParcelableExtraInfo;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.edit.TextPublishUploadModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPreviewInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class VideoPublishEditModelKt extends BaseShortVideoContext implements InterfaceC1438500nXM, Serializable, Cloneable, C0FQ0 {
    public AudioEnhanceParam audioEnhanceParam;

    @InterfaceC570470MYz
    public transient Gson businessGson;
    public transient String cachedEditorProFuncStr;
    public String chain;
    public String customCoverPath;
    public boolean disableDeleteChain;
    public final transient String emptyMainBusinessContext;
    public transient boolean hasBeganUsingEditorProFuncStrCache;
    public boolean isShareToDM;
    public transient C1429890nJT mainBusinessContext;
    public transient boolean needRegisterGsonAdapter;
    public boolean shouldSkipMusicSync;
    public boolean soundSyncFromAnchor;
    public transient C1437400nVa strategiesResult;
    public List<AVTextExtraStruct> structList;
    public C383310F1d subtitleMusicChangeChecker;
    public String title;
    public transient UploadSpeedEncodeSettings uploadSpeedEncodeSettings;
    public AudioRecorderParam veAudioRecorderParam;
    public ClientCherEffectParam veCherEffectParam;
    public C0L9R watermarkVideoResolution;
    public static final C1438430nXF Companion = new Object() { // from class: X.0nXF
    };
    public static final int $stable = 8;

    public static /* synthetic */ void getRecordMode$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSelectedId$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUploadSpeedEncodeSettings$annotations() {
    }

    public static /* synthetic */ void getWatermarkVideoResolution$annotations() {
    }

    public abstract /* synthetic */ String audioPath();

    public abstract CreativeModel getCreativeModel();

    public final void refreshOldFieldIfNeeded() {
    }

    public abstract /* synthetic */ String reverseVideoPath();

    public abstract /* synthetic */ int videoFps(boolean z);

    public abstract /* synthetic */ float videoFpsFloat(boolean z);

    public abstract /* synthetic */ int videoHeight();

    public abstract /* synthetic */ String videoPath();

    public abstract /* synthetic */ int videoWidth();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nXF] */
    static {
        C548920Lfu.LIZ(VideoPublishEditModel.class, AFwS239S0000000_8.get$arr$(68));
    }

    public final C1429890nJT getMainBusinessContext() {
        C1429890nJT c1429890nJT = this.mainBusinessContext;
        if (c1429890nJT != null) {
            return c1429890nJT;
        }
        String mainBusinessData = super.getMainBusinessData();
        if (this.needRegisterGsonAdapter && (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_enable_opt_user_gson", true) & 1) != 0) {
            this.needRegisterGsonAdapter = false;
            try {
                this.businessGson = C7740030o.LIZ().getGson();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            if (!Intrinsics.LJFF(this.emptyMainBusinessContext, mainBusinessData) || (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_enable_opt_user_gson", true) & 2) == 0) {
                Gson gson = this.businessGson;
                this.mainBusinessContext = gson != null ? (C1429890nJT) gson.LJII(mainBusinessData, C1429890nJT.class) : null;
            } else {
                C1429890nJT c1429890nJT2 = new C1429890nJT();
                this.mainBusinessContext = c1429890nJT2;
                c1429890nJT2.setInteractStickerContext(new InteractStickerTracksContext());
            }
            return this.mainBusinessContext;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final C1437400nVa getStrategiesResult() {
        if (this.strategiesResult == null) {
            this.strategiesResult = new C1437400nVa();
        }
        C1437400nVa c1437400nVa = this.strategiesResult;
        if (c1437400nVa != null) {
            return c1437400nVa;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final UploadSpeedEncodeSettings getUploadSpeedEncodeSettings() {
        if (this.uploadSpeedEncodeSettings == null) {
            this.uploadSpeedEncodeSettings = C1420140n3k.LIZJ(getUploadSpeedInfo());
        }
        return this.uploadSpeedEncodeSettings;
    }

    public VideoPublishEditModelKt() {
        this.customCoverPath = "";
        this.businessGson = new Gson();
        this.emptyMainBusinessContext = "{\"interactStickerCheckEffectSdk\":false,\"mInteractStickerContext\":{\"multi_edit_map\":{},\"multi_record_map\":{}}}";
        this.needRegisterGsonAdapter = (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_enable_opt_user_gson", true) & 1) != 0;
        this.subtitleMusicChangeChecker = new C383310F1d();
        this.watermarkVideoResolution = new C0L9R(0, 0);
        this.audioEnhanceParam = new AudioEnhanceParam(false, false, false, false);
        this.shouldSkipMusicSync = true;
    }

    public Object clone() {
        return super.clone();
    }

    public final String getAiMusicLogPbImprId() {
        return getCreativeModel().musicBuzModel.aiMusicLogPbImprId;
    }

    public final String getAlbumPreviewNextMethod() {
        return getCreativeModel().albumModel.albumPreviewNextMethod;
    }

    public final int getApplyVoiceToAllTextSwitch() {
        return getCreativeModel().ttsModel.applyVoiceToAllTextSwitch;
    }

    public final boolean getAutoAddTTSStickerOnce() {
        return getCreativeModel().ttsStickerModel.autoAddTTSStickerOnce;
    }

    public final boolean getAutoEnhanceOn() {
        return getCreativeModel().editVideoEnhanceModel.autoEnhanceOn;
    }

    public final int getAutoEnhanceType() {
        return getCreativeModel().editVideoEnhanceModel.autoEnhanceType;
    }

    public final ArrayList<BeautyMetadata> getBeautyMetadatas() {
        return getCreativeModel().beautyModel.beautyMetadatas;
    }

    public final BeautyMobParam getBeautyMobParam() {
        return getCreativeModel().eventData.beautyMobParam;
    }

    public final String getCameraIds() {
        return getCreativeModel().recordData.cameraIds;
    }

    public final ArrayList<String> getCameraLensInfo() {
        return getCreativeModel().recordData.cameraLensInfo;
    }

    public final int getCameraPosition() {
        return getCreativeModel().recordData.cameraPosition;
    }

    public final CanvasVideoData getCanvasVideoData() {
        return getCreativeModel().canvasVideoData;
    }

    public final long getClickGoNextBtnTime() {
        return getCreativeModel().editModel.clickGoNextBtnTime;
    }

    public final long getClickNextBtnTimeInEditorPro() {
        long j = getCreativeModel().editModel.clickGoNextBtnTimeInEditorPro;
        return j <= 0 ? getClickGoNextBtnTime() : j;
    }

    public final String getClientId() {
        return getCreativeModel().openPlatformModel.clientId;
    }

    public final int getComFrom() {
        return getCreativeModel().musicBuzModel.comFrom;
    }

    public final CommentVideoModel getCommentVideoModel() {
        CommentStickerModel commentStickerModel = (CommentStickerModel) C13LP.LJJJLL(getCreativeModel().stickerModel.commentStickerModels);
        return commentStickerModel != null ? commentStickerModel.getCommentStickerModel() : getCreativeModel().editStickerModel.commentVideoModel;
    }

    public final CompileProbeResult getCompileProbeResult() {
        return getCreativeModel().publishModel.compileProbeResult;
    }

    public final boolean getContainBackgroundVideo() {
        return getCreativeModel().recordData.containBackgroundVideo;
    }

    public final boolean getContainDiyPropVideo() {
        return getCreativeModel().recordEffectModel.containDiyPropVideo;
    }

    public final ArrayList<Integer> getCountDownModes() {
        return getCreativeModel().countDownModel.countDownModes;
    }

    public final CoverPublishModel getCoverPublishModel() {
        if (getCreativeModel().coverPublishModel == null) {
            getCreativeModel().coverPublishModel = new CoverPublishModel(new EffectTextModel(false, null, null, null, null), -1.0f, false, 0, new ArrayList(), "", false, new UploadCustomizeCoverInfo(0, "", 0, 0, 0.0d, 0), new CopyOnWriteArrayList(), new CoverPreviewInfo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0, 0));
        }
        return getCreativeModel().coverPublishModel;
    }

    public final int getCreationMode() {
        return getCreativeModel().creationTypeModel.creationMode;
    }

    public final CreativeFlowData getCreativeFlowData() {
        return getCreativeModel().creativeFlowData;
    }

    public final CreativeInfo getCreativeInfo() {
        return getCreativeModel().creativeInfo;
    }

    public final boolean getCropVideo() {
        return getCreativeModel().publishModel.cropVideo;
    }

    public final String getCurFilterIds() {
        return getCreativeModel().recordFilterModel.curFilterIds;
    }

    public final String getCurFilterLabels() {
        return getCreativeModel().recordFilterModel.curFilterLabels;
    }

    public final float getCurrentZoomValue() {
        return getCreativeModel().recordData.currentZoomValue;
    }

    public final String getCustomCoverPath() {
        return getCreativeModel().postPageModel.customCoverPath;
    }

    public final Cut2EditTransferModel getCut2EditTransferModel() {
        return getCreativeModel().cut2EditTransferModel;
    }

    public final String getDesignerIdList() {
        return getCreativeModel().recordEffectModel.designerIdList;
    }

    public final DuetExtraInfo getDraftDuetExtraInfo() {
        return getCreativeModel().duetModel.draftDuetExtraInfo;
    }

    public final boolean getDraftFromShoot() {
        return getCreativeModel().draftInfoModel.draftFromShoot;
    }

    public final int getDraftId() {
        return getCreativeModel().draftInfoModel.draftId;
    }

    public final String getDraftLandPage() {
        return getCreativeModel().draftInfoModel.draftLandPage;
    }

    public final long getDraftSaveTime() {
        return getCreativeModel().draftInfoModel.draftSaveTime;
    }

    public final String getDuetFrom() {
        return getCreativeModel().duetModel.duetFromAwemeId;
    }

    public final int getDuetFromDuetButton() {
        return getCreativeModel().duetModel.duetFromDuetButton;
    }

    public final String getDuetLayout() {
        return getCreativeModel().duetModel.duetLayout;
    }

    public final String getDuetModeType() {
        return getCreativeModel().duetModel.duetModeType;
    }

    public final int getDuetVideoDuration() {
        return getCreativeModel().duetModel.duetVideoDuration;
    }

    public final boolean getDurationMode() {
        return getCreativeModel().recordData.isLongVideoRecordingMode;
    }

    public final boolean getEditMusicSyncMode() {
        return getCreativeModel().editModel.editMusicSyncMode;
    }

    public final EditPreviewInfo getEditPreviewInfo() {
        return getCreativeModel().editModel.editPreviewInfo;
    }

    public final String getEncodedAudioOutputFile() {
        return getCreativeModel().recordData.encodedAudioOutputFile;
    }

    public final int getEncryptType() {
        return getCreativeModel().socialModel.encryptType;
    }

    public final String getEnterFrom() {
        return getCreativeModel().eventData.enterFrom;
    }

    public final boolean getEnterFromImageSwitch() {
        return getCreativeModel().imageEditModel.enterFromImageSwitch;
    }

    public final HashMap<String, HashMap<String, String>> getExtraEventParams() {
        return getCreativeModel().eventData.extraEventParams;
    }

    public final ExtractFramesModel getExtractFramesModel() {
        return getCreativeModel().extractFramesModel;
    }

    public final String getEyesLabels() {
        return getCreativeModel().beautyModel.eyesLabels;
    }

    public final int getFaceBeauty() {
        return getCreativeModel().beautyModel.faceBeauty;
    }

    public final int getFastImportErrorCode() {
        return getCreativeModel().importModel.fastImportErrorCode;
    }

    public final String getFirstStickerMusicIdsJson() {
        return getCreativeModel().recordEffectModel.firstStickerMusicIdsJson;
    }

    public final String getFromAlbumBottomBtn() {
        return getCreativeModel().eventData.fromAlbumBottomBtn;
    }

    public final boolean getFromCut() {
        return getCreativeModel().editModel.fromCut;
    }

    public final String getFromItemId() {
        return getCreativeModel().recordData.fromItemId;
    }

    public final boolean getFromMultiCut() {
        return getCreativeModel().editModel.fromMultiCut;
    }

    public final boolean getFromPublishPageEditBtn() {
        return getCreativeModel().postPageModel.fromPublishPageEditBtn;
    }

    public final int getGameScore() {
        return getCreativeModel().recordEffectModel.gameScore;
    }

    public final boolean getGoToAutoCut() {
        return getCreativeModel().imageEditModel.goToAutoCut;
    }

    public final ArrayList<GreenScreenMaterial> getGreenScreenMaterialList() {
        return getCreativeModel().recordEffectModel.greenScreenMaterialList;
    }

    public final int getHardEncode() {
        return getCreativeModel().recordData.hardEncode;
    }

    public final String getHeading() {
        return getCreativeModel().imagePublishModel.heading;
    }

    public final ImageAlbumData getImageAlbumData() {
        return getCreativeModel().imageAlbumModel;
    }

    public final ArrayList<ImportVideoInfo> getImportInfoList() {
        return getCreativeModel().albumModel.importInfoList;
    }

    public final InfoStickerCategoryParams getInfoStickerCategoryParams() {
        return getCreativeModel().infoStickerCategoryParams;
    }

    public final InfoStickerModel getInfoStickerModel() {
        return getCreativeModel().infoStickerModel;
    }

    public final long getLastEditTime() {
        return getCreativeModel().draftInfoModel.lastEditTime;
    }

    public final LoudnessBalanceParam getLoudnessBalanceParam() {
        return getCreativeModel().audioLoudnessModel.loudnessBalanceParam;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public String getMainBusinessData() {
        String mainBusinessData = super.getMainBusinessData();
        if (mainBusinessData != null) {
            return mainBusinessData;
        }
        C1429890nJT c1429890nJT = this.mainBusinessContext;
        if (c1429890nJT != null) {
            Gson gson = this.businessGson;
            mainBusinessData = gson != null ? GsonProtectorUtils.toJson(gson, c1429890nJT) : null;
            super.setMainBusinessData(mainBusinessData);
        }
        return mainBusinessData;
    }

    public final long getMaxDuration() {
        return getCreativeModel().recordData.maxDuration;
    }

    public final int getMentionEditTextLength() {
        return getCreativeModel().postPageModel.mentionEditTextLength;
    }

    public final ExtraMentionUserModel getMentionUserModel() {
        return getCreativeModel().initialModel.mentionUserModel;
    }

    public final Map<String, Object> getMetadataMap() {
        CustomParcelableExtraInfo customParcelableExtraInfo = getCreativeModel().customParcelableExtraInfo;
        if (customParcelableExtraInfo != null) {
            return customParcelableExtraInfo.metadataMap;
        }
        return null;
    }

    public final String getMicroAppId() {
        MicroAppModel microAppModel = getCreativeModel().microAppModel;
        if (microAppModel != null) {
            return microAppModel.getMicroAppId();
        }
        return null;
    }

    public final MicroAppModel getMicroAppModel() {
        return getCreativeModel().microAppModel;
    }

    public final MultiEditVideoStatusRecordData getMultiEditVideoRecordData() {
        return getCreativeModel().editModel.multiEditVideoStatusRecordData;
    }

    public final String getMusicRequestId() {
        return getCreativeModel().musicBuzModel.musicRequestId;
    }

    public final float getMusicVolume() {
        return getCreativeModel().musicBuzModel.musicVolume;
    }

    public final MvCreateVideoData getMvCreateVideoData() {
        return getCreativeModel().mvModel.mvCreateVideoData;
    }

    public final String getNewDraftId() {
        return getCreativeModel().draftInfoModel.newDraftId;
    }

    public final int getNewVersion() {
        return getCreativeModel().draftInfoModel.version;
    }

    public final String getNleData() {
        return getCreativeModel().nleInfoModel.nleData;
    }

    public final boolean getNleDataChange() {
        return getCreativeModel().nleInfoModel.nleDataChange;
    }

    public final NLEModel getNleModel() {
        return getCreativeModel().nleInfoModel.nleModel;
    }

    public final String getOpenPlatformClientKey() {
        return getCreativeModel().openPlatformModel.openPlatformClientKey;
    }

    public final String getOpenPlatformExtra() {
        return getCreativeModel().openPlatformModel.openPlatformExtra;
    }

    public final int getOrigin() {
        return getCreativeModel().recordData.origin;
    }

    public final int getOriginalStickerCount() {
        return getCreativeModel().recordEffectModel.originalStickerCount;
    }

    public final VideoFileInfo getOriginalVideoInfo() {
        return getCreativeModel().editModel.originalVideoInfo;
    }

    public final int getOutVideoHeight() {
        return getCreativeModel().publishModel.outVideoHeight;
    }

    public final int getOutVideoWidth() {
        return getCreativeModel().publishModel.outVideoWidth;
    }

    public final String getOutputFile() {
        return getCreativeModel().publishModel.outputFile;
    }

    public final String getParallelUploadOutputFile() {
        return getCreativeModel().publishModel.parallelUploadOutputFile;
    }

    public final int getPhotoCount() {
        return getCreativeModel().albumModel.photoCount;
    }

    public final String getPic2VideoSource() {
        return getCreativeModel().eventData.pic2VideoSource;
    }

    public final PoiData getPoiData() {
        return getCreativeModel().poiData;
    }

    public final PoiMobParam getPoiMobParams() {
        return getCreativeModel().poiMobParams;
    }

    public final int getPublishStage() {
        return getCreativeModel().publishModel.publishStage;
    }

    public final int getRecordBgmDelay() {
        return getCreativeModel().audioAECModel.recordBgmDelay;
    }

    public final String getRecordFilterIds() {
        return getCreativeModel().recordFilterModel.recordFilterIds;
    }

    public final String getRecordFilterLabels() {
        return getCreativeModel().recordFilterModel.recordFilterLabels;
    }

    public final String getRecordFilterValues() {
        return getCreativeModel().recordFilterModel.recordFilterValues;
    }

    public final int getRecordMode() {
        return getCreativeModel().recordData.recordMode;
    }

    public final C1438590nXV getReplaceMusicModel() {
        return getCreativeModel().musicBuzModel.replaceMusicModel;
    }

    public final String getReshapeLabels() {
        return getCreativeModel().beautyModel.reshapeLabels;
    }

    public final ArrayList<String> getResourceId() {
        return getCreativeModel().recordData.resourceId;
    }

    public final int getRestoreType() {
        return getCreativeModel().restoreModel.restoreType;
    }

    public final AVUploadSaveModel getSaveModel() {
        return getCreativeModel().publishModel.saveModel;
    }

    public final int getScreenBrightness() {
        return getCreativeModel().publishModel.screenBrightness;
    }

    public final ArrayList<Integer> getSegmentLoudness() {
        return getCreativeModel().audioLoudnessModel.segmentLoudness;
    }

    public final String getSelectedFilterCategoryKey() {
        return getCreativeModel().filterModel.selectedFilterCategoryKey;
    }

    public final String getSelectedFilterId() {
        return getCreativeModel().filterModel.selectedFilterId;
    }

    public final float getSelectedFilterIntensity() {
        return getCreativeModel().filterModel.selectedFilterIntensity;
    }

    public final String getSelectedFilterLabel() {
        return getCreativeModel().filterModel.selectedFilterLabel;
    }

    public final String getSelectedFilterResId() {
        return getCreativeModel().filterModel.selectedFilterResId;
    }

    public final int getSelectedId() {
        return getCreativeModel().filterModel.selectedId;
    }

    public final String getShareId() {
        return getCreativeModel().openPlatformModel.shareId;
    }

    public final SharedARModel getSharedARModel() {
        return getCreativeModel().recordEffectModel.sharedARModel;
    }

    public final String getSharedCommentMessageType() {
        CommentVideoModel commentModel;
        SharedCommentStickerModel sharedCommentStickerModel = (SharedCommentStickerModel) C13LP.LJJJLL(getCreativeModel().stickerModel.sharedCommentStickerModels);
        if (sharedCommentStickerModel == null || (commentModel = sharedCommentStickerModel.getCommentModel()) == null) {
            return null;
        }
        return commentModel.getStoryMessageType();
    }

    public final String getShootEnterMethod() {
        return getCreativeModel().eventData.shootEnterMethod;
    }

    public final int getShootMode() {
        return getCreativeModel().recordData.shootMode;
    }

    public final int getShootedShootMode() {
        return getCreativeModel().recordData.shootedShootMode;
    }

    public final SingleImageCoverBitmapData getSingleImageCoverBitmapData() {
        return getCreativeModel().editModel.singleImageCoverBitmapData;
    }

    public final String getSmoothSkinLabels() {
        return getCreativeModel().beautyModel.smoothSkinLabels;
    }

    public final StickPointData getStickPointData() {
        return getCreativeModel().stickPointModel.stickPointData;
    }

    public final int getStickPointType() {
        return getCreativeModel().stickPointModel.stickPointType;
    }

    public final StickerChallenge getStickerChallenge() {
        return getCreativeModel().editStickerModel.stickerChallenge;
    }

    public final String getStickerID() {
        return getCreativeModel().recordEffectModel.stickerID;
    }

    public final StitchParams getStitchParams() {
        return getCreativeModel().stitchModel.stitchParams;
    }

    public final boolean getSuccessEnableAEC() {
        return getCreativeModel().audioAECModel.successEnableAEC;
    }

    public final boolean getSupportEnhanceCached() {
        return getCreativeModel().editVideoEnhanceModel.supportEnhanceCached;
    }

    public final boolean getSupportEnhanceField() {
        return getCreativeModel().editVideoEnhanceModel.supportEnhanceField;
    }

    public final boolean getSupportRetake() {
        return getCreativeModel().editModel.supportRetake;
    }

    public final String getSynthesisFileHash() {
        return getCreativeModel().publishModel.synthesisFileHash;
    }

    public final ArrayList<String> getTabKey() {
        return getCreativeModel().recordData.tabKey;
    }

    public final ArrayList<InteractionTagUserInfo> getTagUserList() {
        return getCreativeModel().socialModel.tagUserList;
    }

    public final String getTanningLabels() {
        return getCreativeModel().beautyModel.tanningLabels;
    }

    public final String getTemplateId() {
        return getCreativeModel().mvModel.templateId;
    }

    public final String getTextEffectIds() {
        return getCreativeModel().editStickerModel.textEffectIds;
    }

    public final float getTextLayoutHeight() {
        return getCreativeModel().editStickerModel.textLayoutHeight;
    }

    public final float getTextLayoutWidth() {
        return getCreativeModel().editStickerModel.textLayoutWidth;
    }

    public final TextPublishUploadModel getTextPublishUploadModel() {
        return getCreativeModel().textPublishUploadModel;
    }

    public final TextStickerChallenges getTextStickerChallenges() {
        return getCreativeModel().editStickerModel.textStickerChallenges;
    }

    public final String getTextTypes() {
        return getCreativeModel().editStickerModel.textTypes;
    }

    public final TTStoryUploadModel getTtStoryUploadModel() {
        return getCreativeModel().ttStoryUploadModel;
    }

    public final TTSVoiceModel getTtsVoiceModel() {
        return getCreativeModel().ttsVoiceModel;
    }

    public final String getUploadMethod() {
        return getCreativeModel().albumModel.uploadMethod;
    }

    public final AVUploadMiscInfoStruct getUploadMiscInfoStruct() {
        return getCreativeModel().uploadMiscInfoStruct;
    }

    public final String getUploadPath() {
        return getCreativeModel().editModel.frameUploadPathForAIMusic;
    }

    public final int getUploadScene() {
        return getCreativeModel().socialModel.uploadScene;
    }

    public final UploadSpeedInfo getUploadSpeedInfo() {
        return getCreativeModel().publishModel.uploadSpeedInfo;
    }

    public final List<String> getUploadTabNameList() {
        return getCreativeModel().albumModel.uploadTabNameList;
    }

    public final AudioEffectParam getVeAudioEffectParam() {
        return getCreativeModel().veAudioEffectParam;
    }

    public final int getVideoCanvasHeight() {
        return getCreativeModel().publishModel.videoCanvasHeight;
    }

    public final int getVideoCanvasWidth() {
        return getCreativeModel().publishModel.videoCanvasWidth;
    }

    public final int getVideoCount() {
        return getCreativeModel().albumModel.videoCount;
    }

    public final String getVideoCoverPath() {
        return getCreativeModel().postPageModel.videoCoverPath;
    }

    public final float getVideoCoverStartTm() {
        return getCreativeModel().postPageModel.videoCoverStartTm;
    }

    public final int getVideoDurationFromVideoCutPage() {
        return getCreativeModel().editModel.videoDurationFromVideoCutPage;
    }

    public final int getVideoEditorType() {
        return getCreativeModel().creationTypeModel.videoEditorType;
    }

    public final String getVideoSegmentsDesc() {
        return getCreativeModel().recordData.videoSegmentsDesc;
    }

    public final String getVideoSpeed() {
        return getCreativeModel().recordData.videoSpeed;
    }

    public final float getVoiceVolume() {
        return getCreativeModel().originalSoundModel.voiceVolume;
    }

    public final Workspace getWorkspace() {
        return getCreativeModel().workspace;
    }

    public final boolean isBackgroundPublish() {
        return getCreativeModel().publishModel.isBackgroundPublish;
    }

    public final ArrayList<Boolean> isChildEffect() {
        return getCreativeModel().recordData.isChildEffect;
    }

    public final boolean isClickNextToPublishPage() {
        return getCreativeModel().draftInfoModel.clickNextToPublishPage;
    }

    public final boolean isCompileFinished() {
        return getCreativeModel().publishModel.isCompileFinished;
    }

    public final boolean isDirectToPublishByNewExp() {
        return getCreativeModel().draftInfoModel.isDirectToPublishByNewExp;
    }

    public final boolean isDuetGreenSrceen() {
        return getCreativeModel().duetModel.isDuetGreenSrceen;
    }

    public final boolean isFastImport() {
        return getCreativeModel().importModel.isFastImport;
    }

    public final boolean isFromQuickGrid2EP() {
        QuickGridModel quickGridModel = getCreativeModel().quickGridModel;
        return quickGridModel != null && quickGridModel.isFromQuickGrid;
    }

    public final boolean isFromRestoreRecover() {
        return getCreativeModel().restoreModel.isFromRestoreRecover;
    }

    public final boolean isMultiVideo() {
        return getCreativeModel().albumModel.isMultiVideo;
    }

    public final boolean isMuted() {
        return getCreativeModel().originalSoundModel.isMuted;
    }

    public final boolean isOpenForegroundPublish() {
        return getCreativeModel().publishModel.isOpenForegroundPublish;
    }

    public final boolean isOriginalSound() {
        return getCreativeModel().musicBuzModel.isOriginalSound;
    }

    public final boolean isPcsPaidVideo() {
        return getCreativeModel().pcsPaidVideoMediaModel != null;
    }

    public final boolean isPhotoMvMode() {
        return getCreativeModel().mvModel.isPhotoMvMode;
    }

    public final boolean isPhotoMvMode1080p() {
        return getCreativeModel().mvModel.isPhotoMvMode1080p;
    }

    public final boolean isPhotoMvMusic() {
        return getCreativeModel().mvModel.isPhotoMvMusic;
    }

    public final boolean isPostDraftPrompt() {
        return getCreativeModel().draftInfoModel.isPostDraftPrompt;
    }

    public final boolean isRecordMode() {
        return getOrigin() == 1;
    }

    public final boolean isRestoreFromSaveInstance() {
        return getCreativeModel().editPageRestoreActivityModel.isRestoreFromSaveInstance;
    }

    public final boolean isStickPointMode() {
        return getCreativeModel().stickPointModel.isStickPointMode;
    }

    public final boolean isStoryEditMode() {
        return getCreativeModel().storyEditModel.isStoryEditMode;
    }

    public final boolean isSyntheticHardEncode() {
        return getCreativeModel().publishModel.isSyntheticHardEncode;
    }

    public boolean isUploadVideo() {
        return getOrigin() == 0 || getOrigin() == 2;
    }

    public final AudioEnhanceParam getAudioEnhanceParam() {
        return this.audioEnhanceParam;
    }

    public final Gson getBusinessGson() {
        return this.businessGson;
    }

    public final String getCachedEditorProFuncStr() {
        return this.cachedEditorProFuncStr;
    }

    public final String getChain() {
        return this.chain;
    }

    public final boolean getDisableDeleteChain() {
        return this.disableDeleteChain;
    }

    public final boolean getHasBeganUsingEditorProFuncStrCache() {
        return this.hasBeganUsingEditorProFuncStrCache;
    }

    public final boolean getShouldSkipMusicSync() {
        return this.shouldSkipMusicSync;
    }

    public final boolean getSoundSyncFromAnchor() {
        return this.soundSyncFromAnchor;
    }

    public final List<AVTextExtraStruct> getStructList() {
        return this.structList;
    }

    public final C383310F1d getSubtitleMusicChangeChecker() {
        return this.subtitleMusicChangeChecker;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AudioRecorderParam getVeAudioRecorderParam() {
        return this.veAudioRecorderParam;
    }

    public final ClientCherEffectParam getVeCherEffectParam() {
        return this.veCherEffectParam;
    }

    public final C0L9R getWatermarkVideoResolution() {
        return this.watermarkVideoResolution;
    }

    public final boolean isShareToDM() {
        return this.isShareToDM;
    }

    public VideoPublishEditModelKt(Parcel parcel) {
        boolean z;
        super(parcel);
        this.customCoverPath = "";
        this.businessGson = new Gson();
        this.emptyMainBusinessContext = "{\"interactStickerCheckEffectSdk\":false,\"mInteractStickerContext\":{\"multi_edit_map\":{},\"multi_record_map\":{}}}";
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_enable_opt_user_gson", true) & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needRegisterGsonAdapter = z;
        this.subtitleMusicChangeChecker = new C383310F1d();
        this.watermarkVideoResolution = new C0L9R(0, 0);
        this.audioEnhanceParam = new AudioEnhanceParam(false, false, false, false);
        this.shouldSkipMusicSync = true;
    }

    public final void setAiMusicLogPbImprId(String str) {
        getCreativeModel().musicBuzModel.aiMusicLogPbImprId = str;
    }

    public final void setAlbumPreviewNextMethod(String str) {
        getCreativeModel().albumModel.albumPreviewNextMethod = str;
    }

    public final void setApplyVoiceToAllTextSwitch(int i) {
        getCreativeModel().ttsModel.applyVoiceToAllTextSwitch = i;
    }

    public final void setAudioEnhanceParam(AudioEnhanceParam audioEnhanceParam) {
        this.audioEnhanceParam = audioEnhanceParam;
    }

    public final void setAutoAddTTSStickerOnce(boolean z) {
        getCreativeModel().ttsStickerModel.autoAddTTSStickerOnce = z;
    }

    public final void setAutoEnhanceOn(boolean z) {
        getCreativeModel().editVideoEnhanceModel.autoEnhanceOn = z;
    }

    public final void setAutoEnhanceType(int i) {
        getCreativeModel().editVideoEnhanceModel.autoEnhanceType = i;
    }

    public final void setBackgroundPublish(boolean z) {
        getCreativeModel().publishModel.isBackgroundPublish = z;
    }

    public final void setBeautyMetadatas(ArrayList<BeautyMetadata> arrayList) {
        getCreativeModel().beautyModel.beautyMetadatas = arrayList;
    }

    public final void setBeautyMobParam(BeautyMobParam beautyMobParam) {
        getCreativeModel().eventData.beautyMobParam = beautyMobParam;
    }

    public final void setBusinessGson(Gson gson) {
        this.businessGson = gson;
    }

    public final void setCachedEditorProFuncStr(String str) {
        this.cachedEditorProFuncStr = str;
    }

    public final void setCameraIds(String str) {
        getCreativeModel().recordData.cameraIds = str;
    }

    public final void setCameraLensInfo(ArrayList<String> arrayList) {
        getCreativeModel().recordData.cameraLensInfo = arrayList;
    }

    public final void setCameraPosition(int i) {
        getCreativeModel().recordData.cameraPosition = i;
    }

    public final void setCanvasVideoData(CanvasVideoData canvasVideoData) {
        getCreativeModel().canvasVideoData = canvasVideoData;
    }

    public final void setChain(String str) {
        this.chain = str;
    }

    public final void setChildEffect(ArrayList<Boolean> arrayList) {
        getCreativeModel().recordData.isChildEffect = arrayList;
    }

    public final void setClickGoNextBtnTime(long j) {
        getCreativeModel().editModel.clickGoNextBtnTime = j;
    }

    public final void setClickNextBtnTimeInEditorPro(long j) {
        getCreativeModel().editModel.clickGoNextBtnTimeInEditorPro = j;
    }

    public final void setClickNextToPublishPage(boolean z) {
        getCreativeModel().draftInfoModel.clickNextToPublishPage = z;
    }

    public final void setClientId(String str) {
        getCreativeModel().openPlatformModel.clientId = str;
    }

    public final void setComFrom(int i) {
        getCreativeModel().musicBuzModel.comFrom = i;
    }

    public final void setCommentVideoModel(CommentVideoModel commentVideoModel) {
        getCreativeModel().editStickerModel.commentVideoModel = commentVideoModel;
    }

    public final void setCompileFinished(boolean z) {
        getCreativeModel().publishModel.isCompileFinished = z;
    }

    public final void setCompileProbeResult(CompileProbeResult compileProbeResult) {
        getCreativeModel().publishModel.compileProbeResult = compileProbeResult;
    }

    public final void setContainBackgroundVideo(boolean z) {
        getCreativeModel().recordData.containBackgroundVideo = z;
    }

    public final void setContainDiyPropVideo(boolean z) {
        getCreativeModel().recordEffectModel.containDiyPropVideo = z;
    }

    public final void setCountDownModes(ArrayList<Integer> arrayList) {
        getCreativeModel().countDownModel.countDownModes = arrayList;
    }

    public final void setCoverPublishModel(CoverPublishModel coverPublishModel) {
        getCreativeModel().coverPublishModel = coverPublishModel;
    }

    public final void setCreationMode(int i) {
        getCreativeModel().creationTypeModel.creationMode = i;
    }

    public final void setCreativeFlowData(CreativeFlowData creativeFlowData) {
        getCreativeModel().creativeFlowData = creativeFlowData;
    }

    public final void setCreativeInfo(CreativeInfo creativeInfo) {
        getCreativeModel().creativeInfo = creativeInfo;
    }

    public final void setCropVideo(boolean z) {
        getCreativeModel().publishModel.cropVideo = z;
    }

    public final void setCurFilterIds(String str) {
        getCreativeModel().recordFilterModel.curFilterIds = str;
    }

    public final void setCurFilterLabels(String str) {
        getCreativeModel().recordFilterModel.curFilterLabels = str;
    }

    public final void setCurrentZoomValue(float f) {
        getCreativeModel().recordData.currentZoomValue = f;
    }

    public final void setCustomCoverPath(String str) {
        this.customCoverPath = str;
    }

    public final void setCut2EditTransferModel(Cut2EditTransferModel cut2EditTransferModel) {
        getCreativeModel().cut2EditTransferModel = cut2EditTransferModel;
    }

    public final void setDesignerIdList(String str) {
        getCreativeModel().recordEffectModel.designerIdList = str;
    }

    public final void setDirectToPublishByNewExp(boolean z) {
        getCreativeModel().draftInfoModel.isDirectToPublishByNewExp = z;
    }

    public final void setDisableDeleteChain(boolean z) {
        this.disableDeleteChain = z;
    }

    public final void setDraftDuetExtraInfo(DuetExtraInfo duetExtraInfo) {
        getCreativeModel().duetModel.draftDuetExtraInfo = duetExtraInfo;
    }

    public final void setDraftFromShoot(boolean z) {
        getCreativeModel().draftInfoModel.draftFromShoot = z;
    }

    public final void setDraftId(int i) {
        getCreativeModel().draftInfoModel.draftId = i;
    }

    public final void setDraftLandPage(String str) {
        getCreativeModel().draftInfoModel.draftLandPage = str;
    }

    public final void setDraftSaveTime(long j) {
        getCreativeModel().draftInfoModel.draftSaveTime = j;
    }

    public final void setDuetFrom(String str) {
        getCreativeModel().duetModel.duetFromAwemeId = str;
    }

    public final void setDuetFromDuetButton(int i) {
        getCreativeModel().duetModel.duetFromDuetButton = i;
    }

    public final void setDuetGreenSrceen(boolean z) {
        getCreativeModel().duetModel.isDuetGreenSrceen = z;
    }

    public final void setDuetLayout(String str) {
        getCreativeModel().duetModel.duetLayout = str;
    }

    public final void setDuetModeType(String str) {
        getCreativeModel().duetModel.duetModeType = str;
    }

    public final void setDuetVideoDuration(int i) {
        getCreativeModel().duetModel.duetVideoDuration = i;
    }

    public final void setDurationMode(boolean z) {
        getCreativeModel().recordData.isLongVideoRecordingMode = z;
    }

    public final void setEditMusicSyncMode(boolean z) {
        getCreativeModel().editModel.editMusicSyncMode = z;
    }

    public final void setEditPreviewInfo(EditPreviewInfo editPreviewInfo) {
        getCreativeModel().editModel.editPreviewInfo = editPreviewInfo;
    }

    public final void setEncodedAudioOutputFile(String str) {
        getCreativeModel().recordData.encodedAudioOutputFile = str;
    }

    public final void setEncryptType(int i) {
        getCreativeModel().socialModel.encryptType = i;
    }

    public final void setEnterFrom(String str) {
        getCreativeModel().eventData.enterFrom = str;
    }

    public final void setEnterFromImageSwitch(boolean z) {
        getCreativeModel().imageEditModel.enterFromImageSwitch = z;
    }

    public final void setExtraEventParams(HashMap<String, HashMap<String, String>> map) {
        getCreativeModel().eventData.extraEventParams = map;
    }

    public final void setExtractFramesModel(ExtractFramesModel extractFramesModel) {
        getCreativeModel().extractFramesModel = extractFramesModel;
    }

    public final void setEyesLabels(String str) {
        getCreativeModel().beautyModel.eyesLabels = str;
    }

    public final void setFaceBeauty(int i) {
        getCreativeModel().beautyModel.faceBeauty = i;
    }

    public final void setFastImport(boolean z) {
        getCreativeModel().importModel.isFastImport = z;
    }

    public final void setFastImportErrorCode(int i) {
        getCreativeModel().importModel.fastImportErrorCode = i;
    }

    public final void setFirstStickerMusicIdsJson(String str) {
        getCreativeModel().recordEffectModel.firstStickerMusicIdsJson = str;
    }

    public final void setFromCut(boolean z) {
        getCreativeModel().editModel.fromCut = z;
    }

    public final void setFromItemId(String str) {
        getCreativeModel().recordData.fromItemId = str;
    }

    public final void setFromMultiCut(boolean z) {
        getCreativeModel().editModel.fromMultiCut = z;
    }

    public final void setFromPublishPageEditBtn(boolean z) {
        getCreativeModel().postPageModel.fromPublishPageEditBtn = z;
    }

    public final void setFromQuickGrid2EP(boolean z) {
        QuickGridModel quickGridModel = getCreativeModel().quickGridModel;
        if (quickGridModel != null) {
            quickGridModel.isFromQuickGrid = z;
        }
    }

    public final void setFromRestoreRecover(boolean z) {
        getCreativeModel().restoreModel.isFromRestoreRecover = z;
    }

    public final void setGameScore(int i) {
        getCreativeModel().recordEffectModel.gameScore = i;
    }

    public final void setGoToAutoCut(boolean z) {
        getCreativeModel().imageEditModel.goToAutoCut = z;
    }

    public final void setGreenScreenMaterialList(ArrayList<GreenScreenMaterial> arrayList) {
        getCreativeModel().recordEffectModel.greenScreenMaterialList = arrayList;
    }

    public final void setHardEncode(int i) {
        getCreativeModel().recordData.hardEncode = i;
    }

    public final void setHasBeganUsingEditorProFuncStrCache(boolean z) {
        this.hasBeganUsingEditorProFuncStrCache = z;
    }

    public final void setHeading(String str) {
        getCreativeModel().imagePublishModel.heading = str;
    }

    public final void setImageAlbumData(ImageAlbumData imageAlbumData) {
        getCreativeModel().imageAlbumModel = imageAlbumData;
    }

    public final void setImportInfoList(ArrayList<ImportVideoInfo> arrayList) {
        getCreativeModel().albumModel.importInfoList = arrayList;
    }

    public final void setInfoStickerCategoryParams(InfoStickerCategoryParams infoStickerCategoryParams) {
        getCreativeModel().infoStickerCategoryParams = infoStickerCategoryParams;
    }

    public final void setInfoStickerModel(InfoStickerModel infoStickerModel) {
        getCreativeModel().infoStickerModel = infoStickerModel;
    }

    public final void setLastEditTime(long j) {
        getCreativeModel().draftInfoModel.lastEditTime = j;
    }

    public final void setLoudnessBalanceParam(LoudnessBalanceParam loudnessBalanceParam) {
        getCreativeModel().audioLoudnessModel.loudnessBalanceParam = loudnessBalanceParam;
    }

    public final void setMainBusinessContext(C1429890nJT c1429890nJT) {
        if (!Intrinsics.LJFF(this.mainBusinessContext, c1429890nJT)) {
            this.mainBusinessContext = c1429890nJT;
            if (super.getMainBusinessData() != null) {
                super.setMainBusinessData(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void setMainBusinessData(String str) {
        if (!TextUtils.equals(super.getMainBusinessData(), str)) {
            super.setMainBusinessData(str);
            if (this.mainBusinessContext != null) {
                this.mainBusinessContext = null;
            }
        }
    }

    public final void setMaxDuration(long j) {
        getCreativeModel().recordData.maxDuration = j;
    }

    public final void setMentionEditTextLength(int i) {
        getCreativeModel().postPageModel.mentionEditTextLength = i;
    }

    public final void setMentionUserModel(ExtraMentionUserModel extraMentionUserModel) {
        getCreativeModel().initialModel.mentionUserModel = extraMentionUserModel;
    }

    public final void setMetadataMap(Map<String, Object> map) {
        if (getCreativeModel().customParcelableExtraInfo == null && map != null) {
            getCreativeModel().customParcelableExtraInfo = new CustomParcelableExtraInfo(null);
        }
        CustomParcelableExtraInfo customParcelableExtraInfo = getCreativeModel().customParcelableExtraInfo;
        if (customParcelableExtraInfo != null) {
            customParcelableExtraInfo.metadataMap = map;
        }
    }

    public final void setMicroAppId(String str) {
        MicroAppModel microAppModel = getCreativeModel().microAppModel;
        if (microAppModel != null) {
            microAppModel.setMicroAppId(str);
        }
    }

    public final void setMicroAppModel(MicroAppModel microAppModel) {
        getCreativeModel().microAppModel = microAppModel;
    }

    public final void setMultiEditVideoRecordData(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        getCreativeModel().editModel.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
    }

    public final void setMultiVideo(boolean z) {
        getCreativeModel().albumModel.isMultiVideo = z;
    }

    public final void setMusicRequestId(String str) {
        getCreativeModel().musicBuzModel.musicRequestId = str;
    }

    public final void setMusicVolume(float f) {
        getCreativeModel().musicBuzModel.musicVolume = f;
    }

    public final void setMuted(boolean z) {
        getCreativeModel().originalSoundModel.isMuted = z;
    }

    public final void setMvCreateVideoData(MvCreateVideoData mvCreateVideoData) {
        getCreativeModel().mvModel.mvCreateVideoData = mvCreateVideoData;
    }

    public final void setNewDraftId(String str) {
        getCreativeModel().draftInfoModel.newDraftId = str;
    }

    public final void setNewVersion(int i) {
        getCreativeModel().draftInfoModel.version = i;
    }

    public final void setNleData(String str) {
        getCreativeModel().nleInfoModel.nleData = str;
        setNleDataChange(true);
    }

    public final void setNleDataChange(boolean z) {
        getCreativeModel().nleInfoModel.nleDataChange = z;
    }

    public final void setNleModel(NLEModel nLEModel) {
        getCreativeModel().nleInfoModel.nleModel = nLEModel;
    }

    public final void setOpenForegroundPublish(boolean z) {
        getCreativeModel().publishModel.isOpenForegroundPublish = z;
    }

    public final void setOpenPlatformClientKey(String str) {
        getCreativeModel().openPlatformModel.openPlatformClientKey = str;
    }

    public final void setOpenPlatformExtra(String str) {
        getCreativeModel().openPlatformModel.openPlatformExtra = str;
    }

    public final void setOrigin(int i) {
        getCreativeModel().recordData.origin = i;
    }

    public final void setOriginalSound(boolean z) {
        getCreativeModel().musicBuzModel.isOriginalSound = z;
    }

    public final void setOriginalStickerCount(int i) {
        getCreativeModel().recordEffectModel.originalStickerCount = i;
    }

    public final void setOriginalVideoInfo(VideoFileInfo videoFileInfo) {
        getCreativeModel().editModel.originalVideoInfo = videoFileInfo;
    }

    public final void setOutVideoHeight(int i) {
        getCreativeModel().publishModel.outVideoHeight = i;
    }

    public final void setOutVideoWidth(int i) {
        getCreativeModel().publishModel.outVideoWidth = i;
    }

    public final void setOutputFile(String str) {
        getCreativeModel().publishModel.outputFile = str;
    }

    public final void setParallelUploadOutputFile(String str) {
        getCreativeModel().publishModel.parallelUploadOutputFile = str;
    }

    public final void setPhotoCount(int i) {
        getCreativeModel().albumModel.photoCount = i;
    }

    public final void setPhotoMvMode(boolean z) {
        getCreativeModel().mvModel.isPhotoMvMode = z;
    }

    public final void setPhotoMvMode1080p(boolean z) {
        getCreativeModel().mvModel.isPhotoMvMode1080p = z;
    }

    public final void setPhotoMvMusic(boolean z) {
        getCreativeModel().mvModel.isPhotoMvMusic = z;
    }

    public final void setPic2VideoSource(String str) {
        getCreativeModel().eventData.pic2VideoSource = str;
    }

    public final void setPoiData(PoiData poiData) {
        getCreativeModel().poiData = poiData;
    }

    public final void setPoiMobParams(PoiMobParam poiMobParam) {
        getCreativeModel().poiMobParams = poiMobParam;
    }

    public final void setPostDraftPrompt(boolean z) {
        getCreativeModel().draftInfoModel.isPostDraftPrompt = z;
    }

    public final void setPublishStage(int i) {
        getCreativeModel().publishModel.publishStage = i;
    }

    public final void setRecordBgmDelay(int i) {
        getCreativeModel().audioAECModel.recordBgmDelay = i;
    }

    public final void setRecordFilterIds(String str) {
        getCreativeModel().recordFilterModel.recordFilterIds = str;
    }

    public final void setRecordFilterLabels(String str) {
        getCreativeModel().recordFilterModel.recordFilterLabels = str;
    }

    public final void setRecordFilterValues(String str) {
        getCreativeModel().recordFilterModel.recordFilterValues = str;
    }

    public final void setRecordMode(int i) {
        getCreativeModel().recordData.recordMode = i;
    }

    public final void setReplaceMusicModel(C1438590nXV c1438590nXV) {
        getCreativeModel().musicBuzModel.replaceMusicModel = c1438590nXV;
    }

    public final void setReshapeLabels(String str) {
        getCreativeModel().beautyModel.reshapeLabels = str;
    }

    public final void setResourceId(ArrayList<String> arrayList) {
        getCreativeModel().recordData.resourceId = arrayList;
    }

    public final void setRestoreFromSaveInstance(boolean z) {
        getCreativeModel().editPageRestoreActivityModel.isRestoreFromSaveInstance = z;
    }

    public final void setRestoreType(int i) {
        getCreativeModel().restoreModel.restoreType = i;
    }

    public final void setSaveModel(AVUploadSaveModel aVUploadSaveModel) {
        getCreativeModel().publishModel.saveModel = aVUploadSaveModel;
    }

    public final void setScreenBrightness(int i) {
        getCreativeModel().publishModel.screenBrightness = i;
    }

    public final void setSegmentLoudness(ArrayList<Integer> arrayList) {
        getCreativeModel().audioLoudnessModel.segmentLoudness = arrayList;
    }

    public final void setSelectedFilterCategoryKey(String str) {
        getCreativeModel().filterModel.selectedFilterCategoryKey = str;
    }

    public final void setSelectedFilterId(String str) {
        getCreativeModel().filterModel.selectedFilterId = str;
    }

    public final void setSelectedFilterIntensity(float f) {
        getCreativeModel().filterModel.selectedFilterIntensity = f;
    }

    public final void setSelectedFilterLabel(String str) {
        getCreativeModel().filterModel.selectedFilterLabel = str;
    }

    public final void setSelectedFilterResId(String str) {
        getCreativeModel().filterModel.selectedFilterResId = str;
    }

    public final void setSelectedId(int i) {
        getCreativeModel().filterModel.selectedId = i;
    }

    public final void setShareId(String str) {
        getCreativeModel().openPlatformModel.shareId = str;
    }

    public final void setShareToDM(boolean z) {
        this.isShareToDM = z;
    }

    public final void setSharedARModel(SharedARModel sharedARModel) {
        getCreativeModel().recordEffectModel.sharedARModel = sharedARModel;
    }

    public final void setShootEnterMethod(String str) {
        getCreativeModel().eventData.shootEnterMethod = str;
    }

    public final void setShootMode(int i) {
        getCreativeModel().recordData.shootMode = i;
    }

    public final void setShootedShootMode(int i) {
        getCreativeModel().recordData.shootedShootMode = i;
    }

    public final void setShouldSkipMusicSync(boolean z) {
        this.shouldSkipMusicSync = z;
    }

    public final void setSingleImageCoverBitmapData(SingleImageCoverBitmapData singleImageCoverBitmapData) {
        getCreativeModel().editModel.singleImageCoverBitmapData = singleImageCoverBitmapData;
    }

    public final void setSmoothSkinLabels(String str) {
        getCreativeModel().beautyModel.smoothSkinLabels = str;
    }

    public final void setSoundSyncFromAnchor(boolean z) {
        this.soundSyncFromAnchor = z;
    }

    public final void setStickPointData(StickPointData stickPointData) {
        getCreativeModel().stickPointModel.stickPointData = stickPointData;
    }

    public final void setStickPointMode(boolean z) {
        getCreativeModel().stickPointModel.isStickPointMode = z;
    }

    public final void setStickPointType(int i) {
        getCreativeModel().stickPointModel.stickPointType = i;
    }

    public final void setStickerChallenge(StickerChallenge stickerChallenge) {
        getCreativeModel().editStickerModel.stickerChallenge = stickerChallenge;
    }

    public final void setStickerID(String str) {
        getCreativeModel().recordEffectModel.stickerID = str;
    }

    public final void setStitchParams(StitchParams stitchParams) {
        getCreativeModel().stitchModel.stitchParams = stitchParams;
    }

    public final void setStoryEditMode(boolean z) {
        getCreativeModel().storyEditModel.isStoryEditMode = z;
    }

    public final void setStrategiesResult(C1437400nVa c1437400nVa) {
        this.strategiesResult = c1437400nVa;
    }

    public final void setStructList(List<AVTextExtraStruct> list) {
        this.structList = list;
    }

    public final void setSubtitleMusicChangeChecker(C383310F1d c383310F1d) {
        this.subtitleMusicChangeChecker = c383310F1d;
    }

    public final void setSuccessEnableAEC(boolean z) {
        getCreativeModel().audioAECModel.successEnableAEC = z;
    }

    public final void setSupportEnhanceCached(boolean z) {
        getCreativeModel().editVideoEnhanceModel.supportEnhanceCached = z;
    }

    public final void setSupportEnhanceField(boolean z) {
        getCreativeModel().editVideoEnhanceModel.supportEnhanceField = z;
    }

    public final void setSupportRetake(boolean z) {
        getCreativeModel().editModel.supportRetake = z;
    }

    public final void setSynthesisFileHash(String str) {
        getCreativeModel().publishModel.synthesisFileHash = str;
    }

    public final void setSyntheticHardEncode(boolean z) {
        getCreativeModel().publishModel.isSyntheticHardEncode = z;
    }

    public final void setTabKey(ArrayList<String> arrayList) {
        getCreativeModel().recordData.tabKey = arrayList;
    }

    public final void setTagUserList(ArrayList<InteractionTagUserInfo> arrayList) {
        getCreativeModel().socialModel.tagUserList = arrayList;
    }

    public final void setTanningLabels(String str) {
        getCreativeModel().beautyModel.tanningLabels = str;
    }

    public final void setTemplateId(String str) {
        getCreativeModel().mvModel.templateId = str;
    }

    public final void setTextEffectIds(String str) {
        getCreativeModel().editStickerModel.textEffectIds = str;
    }

    public final void setTextLayoutHeight(float f) {
        getCreativeModel().editStickerModel.textLayoutHeight = f;
    }

    public final void setTextLayoutWidth(float f) {
        getCreativeModel().editStickerModel.textLayoutWidth = f;
    }

    public final void setTextPublishUploadModel(TextPublishUploadModel textPublishUploadModel) {
        getCreativeModel().textPublishUploadModel = textPublishUploadModel;
    }

    public final void setTextStickerChallenges(TextStickerChallenges textStickerChallenges) {
        getCreativeModel().editStickerModel.textStickerChallenges = textStickerChallenges;
    }

    public final void setTextTypes(String str) {
        getCreativeModel().editStickerModel.textTypes = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTtStoryUploadModel(TTStoryUploadModel tTStoryUploadModel) {
        getCreativeModel().ttStoryUploadModel = tTStoryUploadModel;
    }

    public final void setTtsVoiceModel(TTSVoiceModel tTSVoiceModel) {
        getCreativeModel().ttsVoiceModel = tTSVoiceModel;
    }

    public final void setUploadMethod(String str) {
        getCreativeModel().albumModel.uploadMethod = str;
    }

    public final void setUploadMiscInfoStruct(AVUploadMiscInfoStruct aVUploadMiscInfoStruct) {
        getCreativeModel().uploadMiscInfoStruct = aVUploadMiscInfoStruct;
    }

    public final void setUploadPath(String str) {
        getCreativeModel().editModel.frameUploadPathForAIMusic = str;
    }

    public final void setUploadScene(int i) {
        getCreativeModel().socialModel.uploadScene = i;
    }

    public final void setUploadSpeedEncodeSettings(UploadSpeedEncodeSettings uploadSpeedEncodeSettings) {
        this.uploadSpeedEncodeSettings = uploadSpeedEncodeSettings;
    }

    public final void setUploadSpeedInfo(UploadSpeedInfo uploadSpeedInfo) {
        getCreativeModel().publishModel.uploadSpeedInfo = uploadSpeedInfo;
    }

    public final void setUploadTabNameList(List<String> list) {
        getCreativeModel().albumModel.uploadTabNameList = list;
    }

    public final void setVeAudioEffectParam(AudioEffectParam audioEffectParam) {
        getCreativeModel().veAudioEffectParam = audioEffectParam;
    }

    public final void setVeAudioRecorderParam(AudioRecorderParam audioRecorderParam) {
        this.veAudioRecorderParam = audioRecorderParam;
    }

    public final void setVeCherEffectParam(ClientCherEffectParam clientCherEffectParam) {
        this.veCherEffectParam = clientCherEffectParam;
    }

    public final void setVideoCanvasHeight(int i) {
        getCreativeModel().publishModel.videoCanvasHeight = i;
    }

    public final void setVideoCanvasWidth(int i) {
        getCreativeModel().publishModel.videoCanvasWidth = i;
    }

    public final void setVideoCount(int i) {
        getCreativeModel().albumModel.videoCount = i;
    }

    public final void setVideoCoverPath(String str) {
        getCreativeModel().postPageModel.videoCoverPath = str;
    }

    public final void setVideoCoverStartTm(float f) {
        getCreativeModel().postPageModel.videoCoverStartTm = f;
    }

    public final void setVideoDurationFromVideoCutPage(int i) {
        getCreativeModel().editModel.videoDurationFromVideoCutPage = i;
    }

    public final void setVideoEditorType(int i) {
        getCreativeModel().creationTypeModel.videoEditorType = i;
    }

    public final void setVideoSegmentsDesc(String str) {
        getCreativeModel().recordData.videoSegmentsDesc = str;
    }

    public final void setVideoSpeed(String str) {
        getCreativeModel().recordData.videoSpeed = str;
    }

    public final void setVoiceVolume(float f) {
        getCreativeModel().originalSoundModel.voiceVolume = f;
    }

    public final void setWatermarkVideoResolution(C0L9R c0l9r) {
        this.watermarkVideoResolution = c0l9r;
    }

    public final void setWorkspace(Workspace workspace) {
        getCreativeModel().workspace = workspace;
    }
}
