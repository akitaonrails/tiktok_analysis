package com.ss.android.ugc.aweme.shortvideo;

import X.C1402840mbq;
import X.C1441190nbh;
import X.C201954140i;
import X.C201955140j;
import X.C2188811AlT;
import X.C300040BpS;
import X.C569240MUg;
import X.EnumC1466150oFx;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.LinkShareSettings;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.aweme.services.external.IShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CommentModelExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import uxk.a;

/* JADX INFO: loaded from: classes23.dex */
public class ShortVideoContext implements Parcelable, IShortVideoContext {
    public static final Parcelable.Creator<ShortVideoContext> CREATOR = new Parcelable.Creator<ShortVideoContext>() { // from class: X.0nft
        @Override // android.os.Parcelable.Creator
        public final ShortVideoContext createFromParcel(Parcel parcel) {
            return new ShortVideoContext(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoContext[] newArray(int i) {
            return new ShortVideoContext[i];
        }
    };
    public CreativeModel LL;
    public transient long actionDownTime;
    public String albumPreviewNextMethod;
    public ArrayList<String> arTextList;
    public AVETParameter avetParameter;
    public BeautyMobParam beautyMobParam;
    public final CameraComponentModel cameraComponentModel;
    public String carouselType;
    public String chain;
    public String clientId;
    public CommentVideoModel commentVideoModel;
    public CreativeFlowData creativeFlowData;
    public CreativeInfo creativeInfo;
    public CreativeModel creativeModel;
    public GreenScreenMaterial curGreenScreenMaterial;
    public float currentZoomValue;
    public boolean disableDeleteChain;
    public Boolean doNotLoadMusic;
    public DraftEditTransferModel draftEditTransferModel;
    public boolean draftFromShoot;
    public int draftId;
    public int draftToEditFrom;
    public boolean duetEnterRecordPageWithProps;
    public User duetFromUser;
    public String duetModeType;
    public int duetVideoDuration;
    public String effectImage;
    public String effectMetaInfo;
    public boolean enableSingleSegmentConcatUseCopy;
    public String enterAlbumMethod;
    public String enterCutsameId;
    public String enterFrom;
    public String enterMethod;
    public Effect enterMvThemeEffect;
    public String eventType;
    public HashMap<String, HashMap<String, String>> extraEventParams;
    public ExtraSession extraSession;
    public String filterBusinessSticker;
    public int firstPropOrder;
    public int gameScore;
    public String giphyGifIds;
    public OPSDK$GreenScreenKitConfig greenScreenKitConfig;
    public boolean isAIEnhanceOn;
    public boolean isAutoSelectedAlbumPreview;
    public Boolean isBusinessFirstSticker;
    public boolean isCarouselOpen;
    public boolean isClickFromAlbumPreview;
    public boolean isDraftMusicIllegal;
    public boolean isDuetGreenSrceen;
    public boolean isDuetMode;
    public boolean isFromNormalRecord;
    public boolean isPhotoMvMode;
    public int isPrivate;
    public boolean isRestoreFromSaveInstance;
    public boolean isReuseOriginalSound;
    public boolean isShowedMusicTips;
    public boolean isSimpleShootMode;
    public int isSpecialPlusIcon;
    public boolean isStory;
    public boolean isStoryOrPhotoTab;
    public Long lastMusicTitleTimeMills;
    public String liveSourceParams;
    public LoudnessBalanceParam loudnessBalanceParam;
    public AnchorTransData mAutoSelectedAnchor;
    public String mBindMovieId;
    public int mDuetFromDuetButton;
    public boolean mFromOtherPlatform;
    public boolean mIsFromDraft;
    public boolean mIsPhotoMvModeMusic;
    public int mMusicLength;
    public String mMusicOrigin;
    public UrlModel mMusicStrongBeatUrl;
    public String mSavedDraftId;
    public String mShareId;
    public String mShootFrom;
    public boolean mToLive;
    public boolean mToStatus;
    public String mTriggerType;
    public String mUnpublishedEffectId;
    public ExtraMentionUserModel mentionUserModel;
    public ArrayList<String> messageBubbleTexts;
    public MicroAppModel microAppModel;
    public MultiSegmentPropExtra multiSegmentPropClipsInfo;
    public AVMusic musicBeforeRetake;
    public AVMusicWaveBean musicWaveBean;
    public NaviContext naviContext;
    public String newDraftId;
    public Bundle nonDuetModeBundle;
    public boolean onlyShowLiveTab;
    public String openPlatformClientKey;
    public String openPlatformExtra;
    public String openPlatformShareId;
    public PhotoMvConfig photoMvConfig;
    public int pic2VideoSource;
    public ArrayList<String> pic2VideoSourceList;
    public String presetEffectId;
    public int propOrder;
    public int publishStage;
    public boolean putPresetStickerAtFirst;
    public int recordBGMDelay;
    public String recordParam;
    public RecordPresetResource recordPresetResource;
    public Effect retainFirstEffect;
    public String reuseOriginalSoundId;
    public int reuseOriginalSoundLength;
    public UrlModel reuseOriginalSoundUrls;
    public UrlModel sendToUserHead;
    public C1402840mbq shareContext;
    public SharedARModel sharedARModel;
    public String shootMethod;
    public int shootMode;
    public String shootWay;
    public int shootedShootMode;
    public Boolean showCancelAfterPinProp;
    public String showStickerMode;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public String stickersFromDraftVideos;
    public StitchContext stitchContext;
    public List<AVTextExtraStruct> structList;
    public int tabs;
    public String tagId;
    public String title;
    public TTSVoiceModel ttsVoiceModel;
    public String ugcTemplateTag;
    public String uploadMethod;
    public AVUploadMiscInfoStruct uploadMiscInfoStruct;
    public List<String> uploadTabNameList;
    public int videoLength;

    public final void LJJLIIIJLJLI() {
        this.isShowedMusicTips = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LIZ() {
        StitchContext stitchContext = this.stitchContext;
        stitchContext.stitchParams = null;
        stitchContext.stitchClip = null;
    }

    public final boolean LIZIZ() {
        Iterator<TimeSpeedModelExtension> it2 = this.cameraComponentModel.mDurings.iterator();
        while (it2.hasNext()) {
            if (it2.next().getBackgroundVideo() != null) {
                return true;
            }
        }
        return false;
    }

    public final C1441190nbh LIZJ() {
        return this.cameraComponentModel.LIZ();
    }

    public final ApplyRecordEffectInfo LIZLLL() {
        return this.creativeModel.recordEffectModel.applyRecordEffectInfo;
    }

    public final AVETParameter LJ() {
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    public final CommentVideoModel LJFF() {
        CreativeModel creativeModel = this.creativeModel;
        if (creativeModel == null) {
            return this.commentVideoModel;
        }
        List<CommentStickerModel> list = creativeModel.stickerModel.commentStickerModels;
        return list.isEmpty() ? this.commentVideoModel : ((CommentStickerModel) ListProtector.get(list, 0)).getCommentStickerModel();
    }

    public final C1441190nbh LJI() {
        return this.cameraComponentModel.LIZIZ();
    }

    public final long LJII() {
        return this.cameraComponentModel.LIZJ();
    }

    public final DuetContext LJIIIIZZ() {
        return this.cameraComponentModel.duetContext;
    }

    public final String LJIIIZ() {
        return this.creativeModel.propFromGroupModel.fromPropId;
    }

    public final int LJIIJ() {
        return this.creativeModel.musicBuzModel.musicLength;
    }

    public final String LJIIJJI() {
        return this.creativeModel.musicBuzModel.musicOrigin;
    }

    public final long LJIIL() {
        return this.cameraComponentModel.mMaxDuration;
    }

    public final long LJIILIIL() {
        return this.cameraComponentModel.LIZLLL();
    }

    public final long LJIILJJIL() {
        return this.cameraComponentModel.LJ();
    }

    public final int LJIILL() {
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel;
        IFoundationAVServiceProxy iFoundationAVServiceProxy = (IFoundationAVServiceProxy) PluggableExtentionKt.pluggableSpi(IFoundationAVServiceProxy.class);
        if (iFoundationAVServiceProxy != null) {
            iFoundationAVServiceProxy.complianceService().getClass();
            if (ComplianceServiceProvider.LJIJJ().LJJIIZ()) {
                return 1;
            }
        }
        if (C569240MUg.LIZ() && ((creativeModel = this.creativeModel) == null || (draftInfoModel = creativeModel.draftInfoModel) == null || !draftInfoModel.isDraft)) {
            a.LIZ.getClass();
            return a.LIZ() == 4 ? a.LIZJ() : a.LIZ();
        }
        a.LIZ.getClass();
        return a.LIZIZ();
    }

    public final int LJIILLIIL() {
        if (this.isPrivate == -2) {
            this.isPrivate = LJIILL();
        }
        return this.isPrivate;
    }

    public final RetakeVideoContext LJIIZILJ() {
        return (RetakeVideoContext) this.cameraComponentModel.retakeVideoContext;
    }

    public final String LJIJ() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundId;
    }

    public final int LJIJI() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundLength;
    }

    public final UrlModel LJIJJ() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundUrls;
    }

    public final String LJIJJLI() {
        return LJIL(this.shootMode);
    }

    public final Workspace LJJ() {
        return this.cameraComponentModel.mWorkspace;
    }

    public final String LJJI() {
        return this.cameraComponentModel.mMusicPath;
    }

    public final boolean LJJIFFI() {
        StitchParams stitchParams = this.stitchContext.stitchParams;
        if (stitchParams == null) {
            return false;
        }
        return !stitchParams.isPGCMusic() || this.stitchContext.stitchParams.getMusic() == null;
    }

    public final boolean LJJIII() {
        List<CommentStickerModel> list = this.creativeModel.stickerModel.commentStickerModels;
        if (list.isEmpty() || !CommentModelExtensionKt.isDataValid(((CommentStickerModel) ListProtector.get(list, 0)).getCommentStickerModel())) {
            return CommentModelExtensionKt.isDataValid(LJFF());
        }
        return true;
    }

    public final boolean LJJIIJ() {
        return "comment_reply".equals(this.shootWay);
    }

    public final boolean LJJIIJZLJL() {
        return this.creativeModel.initialModel.dmCameraModel.groupShotData != null;
    }

    public final boolean LJJIIZ() {
        return "link_share".equals(this.shootWay);
    }

    public final boolean LJJIIZI() {
        return this.cameraComponentModel.isEditorTabAICreateRecordMode || this.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground;
    }

    public final boolean LJJIJ() {
        return this.creativeModel.aiLivePhotoModel.consumptionModel.getEnterToPost();
    }

    public final boolean LJJIJIIJIL() {
        return this.creativeModel.imageEffectTemplateData.isTemplateFromAnchor;
    }

    public final String LJJIJIL() {
        return this.isStoryOrPhotoTab ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public final boolean LJJIJL() {
        LinkShareSettings linkShareSettings;
        C1402840mbq c1402840mbq = this.shareContext;
        boolean z = (c1402840mbq == null || (linkShareSettings = c1402840mbq.linkShareSettings) == null || !linkShareSettings.isTrackContentType()) ? false : true;
        if (LJJIIZ()) {
            return this.creativeModel.musicBuzModel.music != null || z;
        }
        return false;
    }

    public final boolean LJJIJLIJ() {
        return this.isFromNormalRecord && !this.isShowedMusicTips;
    }

    public final boolean LJJIL() {
        return TextUtils.equals(this.ugcTemplateTag, "ugc_template_tag_take_photo");
    }

    public final boolean LJJJ() {
        return TextUtils.equals(this.shootWay, "photo_trend_template") || LJJIJIIJIL();
    }

    public final boolean LJJJI() {
        if (this.draftToEditFrom != 3) {
            return LJJJJI() && this.creativeModel.draftInfoModel.isPublishedDraft;
        }
        return true;
    }

    public final boolean LJJJIL() {
        CameraComponentModel cameraComponentModel = this.cameraComponentModel;
        return cameraComponentModel.LJFF() && ((RetakeVideoContext) cameraComponentModel.retakeVideoContext).isReplace;
    }

    public final boolean LJJJJ() {
        return TextUtils.equals(this.shootWay, "l8_import_music_edit") || TextUtils.equals(this.shootWay, "change_ban_music") || TextUtils.equals(this.shootWay, "l8_music_edit_cml");
    }

    public final boolean LJJJJI() {
        return this.cameraComponentModel.mRestoreType == 2 || this.publishStage == 50 || this.draftToEditFrom == 2;
    }

    public final boolean LJJJJIZL() {
        return this.cameraComponentModel.LJFF();
    }

    public final boolean LJJJJJ() {
        return this.cameraComponentModel.isRetakeMode;
    }

    public final boolean LJJJJJL() {
        return this.creativeModel.musicBuzModel.isReuseOriginalSound;
    }

    public final boolean LJJJJL() {
        return this.sharedARModel != null;
    }

    public final boolean LJJJJLI() {
        return TextUtils.equals(this.shootWay, "sound_sync");
    }

    public final boolean LJJJJLL() {
        return this.stitchContext.stitchParams != null;
    }

    public final boolean LJJJJZ() {
        return TextUtils.equals(this.shootWay, "ugc_template") || TextUtils.equals(this.ugcTemplateTag, "ugc_template_tag_game") || TextUtils.equals(this.shootWay, "pugc_template");
    }

    public final boolean LJJJJZI() {
        return this.cameraComponentModel.LJI();
    }

    public final boolean LJJLL() {
        return this.cameraComponentModel.LJIIJJI();
    }

    public final boolean LJJZ() {
        StitchParams stitchParams = this.stitchContext.stitchParams;
        return stitchParams != null && stitchParams.getMusic() != null && this.stitchContext.stitchParams.isPGCMusic() && this.stitchContext.stitchParams.getMusicStart() >= 0;
    }

    public final String getCreationId() {
        return this.creativeInfo.getCreationId();
    }

    public final String getMusicId() {
        StitchParams stitchParams = this.stitchContext.stitchParams;
        if (stitchParams != null) {
            return stitchParams.getMusicId();
        }
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return MusicBeanUtilKt.getMusicId(musicObject);
        }
        return null;
    }

    public final String getMusicPath() {
        return this.cameraComponentModel.getMusicPath();
    }

    public final boolean isMuted() {
        return this.cameraComponentModel.isMuted;
    }

    public final boolean LJJIJIIJI() {
        return LJJJJIZL() || LJJJIL();
    }

    public ShortVideoContext(Parcel parcel) {
        int iLJIILL;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        this.creativeFlowData = new CreativeFlowData();
        this.draftToEditFrom = -1;
        this.isReuseOriginalSound = false;
        this.creativeInfo = new CreativeInfo();
        this.draftFromShoot = false;
        this.clientId = "";
        this.shootMethod = "record_button";
        this.newDraftId = "";
        this.stitchContext = new StitchContext();
        this.naviContext = new NaviContext();
        this.disableDeleteChain = false;
        if (((Boolean) C300040BpS.LIZ.getValue()).booleanValue()) {
            iLJIILL = -2;
        } else {
            iLJIILL = LJIILL();
        }
        this.isPrivate = iLJIILL;
        this.isDuetGreenSrceen = false;
        this.isCarouselOpen = false;
        this.carouselType = "";
        Boolean bool = Boolean.FALSE;
        this.doNotLoadMusic = bool;
        this.showCancelAfterPinProp = bool;
        this.isBusinessFirstSticker = bool;
        this.duetEnterRecordPageWithProps = false;
        this.shootedShootMode = -1;
        this.isFromNormalRecord = false;
        this.isRestoreFromSaveInstance = false;
        this.isShowedMusicTips = false;
        this.extraSession = new ExtraSession();
        this.tabs = 0;
        this.arTextList = new ArrayList<>();
        this.publishStage = 0;
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.messageBubbleTexts = new ArrayList<>();
        this.uploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        this.musicWaveBean = null;
        this.pic2VideoSource = 0;
        this.pic2VideoSourceList = new ArrayList<>();
        this.isClickFromAlbumPreview = false;
        this.isAutoSelectedAlbumPreview = false;
        this.albumPreviewNextMethod = "";
        this.showStickerMode = "";
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.isPhotoMvMode = false;
        this.isStoryOrPhotoTab = false;
        this.isStory = false;
        this.firstPropOrder = 0;
        this.propOrder = 0;
        this.isAIEnhanceOn = false;
        this.lastMusicTitleTimeMills = -1L;
        this.uploadMethod = parcel.readString();
        this.enterAlbumMethod = parcel.readString();
        this.cameraComponentModel = (CameraComponentModel) parcel.readParcelable(CameraComponentModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromNormalRecord = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isShowedMusicTips = z2;
        this.mMusicLength = parcel.readInt();
        this.mMusicOrigin = parcel.readString();
        this.creativeInfo = (CreativeInfo) parcel.readParcelable(CreativeInfo.class.getClassLoader());
        this.shootWay = parcel.readString();
        this.mShootFrom = parcel.readString();
        this.stickersFromDraftVideos = parcel.readString();
        this.giphyGifIds = parcel.readString();
        this.curGreenScreenMaterial = (GreenScreenMaterial) parcel.readSerializable();
        this.commentVideoModel = (CommentVideoModel) parcel.readSerializable();
        this.draftId = parcel.readInt();
        this.newDraftId = parcel.readString();
        this.presetEffectId = parcel.readString();
        this.tagId = parcel.readString();
        this.shootMode = parcel.readInt();
        this.shootedShootMode = parcel.readInt();
        this.title = parcel.readString();
        this.structList = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.isPrivate = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mIsFromDraft = z3;
        this.gameScore = parcel.readInt();
        this.extraSession = (ExtraSession) parcel.readParcelable(ExtraSession.class.getClassLoader());
        this.microAppModel = (MicroAppModel) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mFromOtherPlatform = z4;
        this.avetParameter = (AVETParameter) parcel.readSerializable();
        this.mentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
        this.arTextList = parcel.createStringArrayList();
        this.messageBubbleTexts = parcel.createStringArrayList();
        this.uploadMiscInfoStruct = (AVUploadMiscInfoStruct) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isSimpleShootMode = z5;
        this.draftEditTransferModel = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.sendToUserHead = (UrlModel) parcel.readSerializable();
        this.shareContext = (C1402840mbq) parcel.readSerializable();
        this.mBindMovieId = parcel.readString();
        this.enterFrom = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableSingleSegmentConcatUseCopy = z6;
        this.filterBusinessSticker = parcel.readString();
        this.chain = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.disableDeleteChain = z7;
        this.mMusicStrongBeatUrl = (UrlModel) parcel.readSerializable();
        this.photoMvConfig = (PhotoMvConfig) parcel.readParcelable(PhotoMvConfig.class.getClassLoader());
        this.creativeFlowData = (CreativeFlowData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsPhotoMvModeMusic = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.isDuetGreenSrceen = z9;
        this.currentZoomValue = parcel.readFloat();
        this.draftToEditFrom = parcel.readInt();
        this.duetFromUser = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isClickFromAlbumPreview = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isAutoSelectedAlbumPreview = z11;
        this.albumPreviewNextMethod = parcel.readString();
        this.mShareId = parcel.readString();
        this.clientId = parcel.readString();
        this.recordBGMDelay = parcel.readInt();
        this.mDuetFromDuetButton = parcel.readInt();
        this.enterMethod = parcel.readString();
        this.publishStage = parcel.readInt();
        this.loudnessBalanceParam = (LoudnessBalanceParam) parcel.readSerializable();
        this.beautyMobParam = (BeautyMobParam) parcel.readParcelable(BeautyMobParam.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.draftFromShoot = z12;
        this.mAutoSelectedAnchor = (AnchorTransData) parcel.readSerializable();
        this.openPlatformExtra = parcel.readString();
        this.singleImageCoverBitmapData = (SingleImageCoverBitmapData) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader());
        this.openPlatformClientKey = parcel.readString();
        this.openPlatformShareId = parcel.readString();
        this.ttsVoiceModel = (TTSVoiceModel) parcel.readSerializable();
        this.isSpecialPlusIcon = parcel.readInt();
        this.greenScreenKitConfig = (OPSDK$GreenScreenKitConfig) parcel.readSerializable();
        this.firstPropOrder = parcel.readInt();
        this.isAIEnhanceOn = parcel.readByte() != 0;
        this.uploadTabNameList = parcel.createStringArrayList();
        this.creativeModel = (CreativeModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
        this.multiSegmentPropClipsInfo = (MultiSegmentPropExtra) parcel.readParcelable(MultiSegmentPropExtra.class.getClassLoader());
        this.recordParam = parcel.readString();
        this.ugcTemplateTag = parcel.readString();
        this.lastMusicTitleTimeMills = Long.valueOf(parcel.readLong());
    }

    public static String LJIL(int i) {
        if (i != 2) {
            if (i != 20 && i != 23) {
                if (i != 27) {
                    if (i != 10) {
                        if (i != 11) {
                            if (i != 29) {
                                if (i != 30) {
                                    switch (i) {
                                        case 14:
                                            return "video_180";
                                        case 15:
                                            return "fast_shoot";
                                        case 16:
                                            return "photo";
                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                            return "video";
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                            return "video_600";
                                        default:
                                            return "";
                                    }
                                }
                                return "story_reveal";
                            }
                            return "quick_video";
                        }
                        return "video_60";
                    }
                    return "video_15";
                }
                return "group_shot";
            }
            return "quick_video";
        }
        if (!((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            return "photo";
        }
        return "fast_shoot";
    }

    public final void LJJII(StitchParams stitchParams) {
        if (stitchParams != null && stitchParams.getVideoSegment() != null && stitchParams.getVideoSegment().getVideoFileInfo() != null) {
            this.stitchContext.stitchParams = stitchParams;
            this.cameraComponentModel.isMuted = stitchParams.isMuted();
            this.stitchContext.stitchClip = new TimeSpeedModelExtension();
            this.stitchContext.stitchClip.setDuration((int) stitchParams.getDuration());
        }
    }

    public final void LJJJLIIL(TimeSpeedModelExtension timeSpeedModelExtension) {
        String str;
        PublishExtensionModel publishExtensionModelFromString;
        List<CreateAnchorInfo> list;
        if (timeSpeedModelExtension != null && (str = this.extraSession.commerceData) != null && (list = (publishExtensionModelFromString = PublishExtensionModel.fromString(str)).createAnchorInfos) != null && !list.isEmpty()) {
            Iterator<CreateAnchorInfo> it2 = publishExtensionModelFromString.createAnchorInfos.iterator();
            while (it2.hasNext()) {
                try {
                    if (TextUtils.equals(new JSONObject(it2.next().getContent()).optString("third_id", ""), timeSpeedModelExtension.getStickerId())) {
                        it2.remove();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.extraSession.commerceData = PublishExtensionModel.toString(publishExtensionModelFromString);
        }
    }

    public final void LJJJLL(CommentVideoModel commentVideoModel) {
        if (commentVideoModel != null) {
            this.commentVideoModel = commentVideoModel;
            CreativeModel creativeModel = this.creativeModel;
            if (creativeModel != null) {
                creativeModel.stickerModel.commentStickerModels.clear();
                this.creativeModel.stickerModel.commentStickerModels.add(new CommentStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.COMMENT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), commentVideoModel, 1.0f, true, false));
            }
        }
    }

    public final void LJJJLZIJ(boolean z) {
        this.cameraComponentModel.mCurrentDurationMode = z;
    }

    public final void LJJJZ(C1441190nbh c1441190nbh) {
        this.cameraComponentModel.mDurings = c1441190nbh;
    }

    public final void LJJL(boolean z) {
        CreativeModel creativeModel = this.creativeModel;
        if (creativeModel.defaultEnableMP4Encoding == null) {
            creativeModel.defaultEnableMP4Encoding = Boolean.valueOf(z);
        }
        this.cameraComponentModel.enableRecordingMp4 = z;
    }

    public final void LJJLI(GameDuetResource gameDuetResource) {
        this.cameraComponentModel.gameDuetResource = gameDuetResource;
    }

    public final void LJJLIIIIJ(int i) {
        this.cameraComponentModel.mHardEncode = i;
    }

    public final void LJJLIIIJ(int i) {
        this.creativeModel.musicBuzModel.musicLength = i;
    }

    public final void LJJLIIIJILLIZJL(String str) {
        this.creativeModel.musicBuzModel.musicOrigin = str;
    }

    public final void LJJLIIIJJI(long j) {
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMaxDuration: ");
        sbLIZ.append(j);
        C201955140j.LIZLLL(c201954140i, "ShortVideoContext", C2188811AlT.LIZIZ(sbLIZ));
        this.cameraComponentModel.mMaxDuration = j;
    }

    public final void LJJLIIIJJIZ(int i) {
        this.cameraComponentModel.musicEndTime = i;
    }

    public final void LJJLIIIJL(boolean z) {
        if (z) {
            if (this.sharedARModel == null) {
                this.sharedARModel = new SharedARModel();
                return;
            }
            return;
        }
        this.sharedARModel = null;
    }

    public final void LJJLIIIJLLLLLLLZ(boolean z) {
        this.cameraComponentModel.mUseBeautyFace = z;
    }

    public final void LJJLIIJ(int i) {
        this.cameraComponentModel.mVideoHeight = i;
    }

    public final void LJJLIL(int i) {
        this.cameraComponentModel.mVideoWidth = i;
    }

    public final void LJJLJ(Workspace workspace) {
        this.cameraComponentModel.mWorkspace = workspace;
    }

    public final void LJJLJLI(String str) {
        this.cameraComponentModel.mMusicPath = str;
    }

    public final void setMusicStart(int i) {
        this.cameraComponentModel.mMusicStart = i;
    }

    public final void setMuted(boolean z) {
        this.cameraComponentModel.isMuted = z;
    }

    public ShortVideoContext(CameraComponentModel cameraComponentModel) {
        int iLJIILL;
        this.creativeFlowData = new CreativeFlowData();
        this.draftToEditFrom = -1;
        this.isReuseOriginalSound = false;
        this.creativeInfo = new CreativeInfo();
        this.draftFromShoot = false;
        this.clientId = "";
        this.shootMethod = "record_button";
        this.newDraftId = "";
        this.stitchContext = new StitchContext();
        this.naviContext = new NaviContext();
        this.disableDeleteChain = false;
        if (((Boolean) C300040BpS.LIZ.getValue()).booleanValue()) {
            iLJIILL = -2;
        } else {
            iLJIILL = LJIILL();
        }
        this.isPrivate = iLJIILL;
        this.isDuetGreenSrceen = false;
        this.isCarouselOpen = false;
        this.carouselType = "";
        Boolean bool = Boolean.FALSE;
        this.doNotLoadMusic = bool;
        this.showCancelAfterPinProp = bool;
        this.isBusinessFirstSticker = bool;
        this.duetEnterRecordPageWithProps = false;
        this.shootedShootMode = -1;
        this.isFromNormalRecord = false;
        this.isRestoreFromSaveInstance = false;
        this.isShowedMusicTips = false;
        this.extraSession = new ExtraSession();
        this.tabs = 0;
        this.arTextList = new ArrayList<>();
        this.publishStage = 0;
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.messageBubbleTexts = new ArrayList<>();
        this.uploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        this.musicWaveBean = null;
        this.pic2VideoSource = 0;
        this.pic2VideoSourceList = new ArrayList<>();
        this.isClickFromAlbumPreview = false;
        this.isAutoSelectedAlbumPreview = false;
        this.albumPreviewNextMethod = "";
        this.showStickerMode = "";
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.isPhotoMvMode = false;
        this.isStoryOrPhotoTab = false;
        this.isStory = false;
        this.firstPropOrder = 0;
        this.propOrder = 0;
        this.isAIEnhanceOn = false;
        this.lastMusicTitleTimeMills = -1L;
        this.cameraComponentModel = cameraComponentModel;
        this.creativeModel = new CreativeModel();
    }

    public ShortVideoContext(CameraComponentModel cameraComponentModel, CreativeModel creativeModel) {
        int iLJIILL;
        this.creativeFlowData = new CreativeFlowData();
        this.draftToEditFrom = -1;
        this.isReuseOriginalSound = false;
        this.creativeInfo = new CreativeInfo();
        this.draftFromShoot = false;
        this.clientId = "";
        this.shootMethod = "record_button";
        this.newDraftId = "";
        this.stitchContext = new StitchContext();
        this.naviContext = new NaviContext();
        this.disableDeleteChain = false;
        if (((Boolean) C300040BpS.LIZ.getValue()).booleanValue()) {
            iLJIILL = -2;
        } else {
            iLJIILL = LJIILL();
        }
        this.isPrivate = iLJIILL;
        this.isDuetGreenSrceen = false;
        this.isCarouselOpen = false;
        this.carouselType = "";
        Boolean bool = Boolean.FALSE;
        this.doNotLoadMusic = bool;
        this.showCancelAfterPinProp = bool;
        this.isBusinessFirstSticker = bool;
        this.duetEnterRecordPageWithProps = false;
        this.shootedShootMode = -1;
        this.isFromNormalRecord = false;
        this.isRestoreFromSaveInstance = false;
        this.isShowedMusicTips = false;
        this.extraSession = new ExtraSession();
        this.tabs = 0;
        this.arTextList = new ArrayList<>();
        this.publishStage = 0;
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.messageBubbleTexts = new ArrayList<>();
        this.uploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        this.musicWaveBean = null;
        this.pic2VideoSource = 0;
        this.pic2VideoSourceList = new ArrayList<>();
        this.isClickFromAlbumPreview = false;
        this.isAutoSelectedAlbumPreview = false;
        this.albumPreviewNextMethod = "";
        this.showStickerMode = "";
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.isPhotoMvMode = false;
        this.isStoryOrPhotoTab = false;
        this.isStory = false;
        this.firstPropOrder = 0;
        this.propOrder = 0;
        this.isAIEnhanceOn = false;
        this.lastMusicTitleTimeMills = -1L;
        this.cameraComponentModel = cameraComponentModel;
        this.creativeModel = creativeModel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadMethod);
        parcel.writeString(this.enterAlbumMethod);
        parcel.writeParcelable(this.cameraComponentModel, i);
        parcel.writeInt(this.isFromNormalRecord ? 1 : 0);
        parcel.writeInt(this.isShowedMusicTips ? 1 : 0);
        parcel.writeInt(this.mMusicLength);
        parcel.writeString(this.mMusicOrigin);
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.mShootFrom);
        parcel.writeString(this.stickersFromDraftVideos);
        parcel.writeString(this.giphyGifIds);
        parcel.writeSerializable(this.curGreenScreenMaterial);
        parcel.writeSerializable(this.commentVideoModel);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeString(this.presetEffectId);
        parcel.writeString(this.tagId);
        parcel.writeInt(this.shootMode);
        parcel.writeInt(this.shootedShootMode);
        parcel.writeString(this.title);
        parcel.writeTypedList(this.structList);
        parcel.writeInt(this.isPrivate);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.extraSession, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeInt(this.mFromOtherPlatform ? 1 : 0);
        parcel.writeSerializable(this.avetParameter);
        parcel.writeSerializable(this.mentionUserModel);
        parcel.writeStringList(this.arTextList);
        parcel.writeStringList(this.messageBubbleTexts);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeByte(this.isSimpleShootMode ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.draftEditTransferModel, i);
        parcel.writeSerializable(this.sendToUserHead);
        parcel.writeSerializable(this.shareContext);
        parcel.writeString(this.mBindMovieId);
        parcel.writeString(this.enterFrom);
        parcel.writeByte(this.enableSingleSegmentConcatUseCopy ? (byte) 1 : (byte) 0);
        parcel.writeString(this.filterBusinessSticker);
        parcel.writeString(this.chain);
        parcel.writeByte(this.disableDeleteChain ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.mMusicStrongBeatUrl);
        parcel.writeParcelable(this.photoMvConfig, i);
        parcel.writeParcelable(this.creativeFlowData, i);
        parcel.writeByte(this.mIsPhotoMvModeMusic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDuetGreenSrceen ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.currentZoomValue);
        parcel.writeInt(this.draftToEditFrom);
        parcel.writeSerializable(this.duetFromUser);
        parcel.writeByte(this.isClickFromAlbumPreview ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAutoSelectedAlbumPreview ? (byte) 1 : (byte) 0);
        parcel.writeString(this.albumPreviewNextMethod);
        parcel.writeString(this.mShareId);
        parcel.writeString(this.clientId);
        parcel.writeInt(this.recordBGMDelay);
        parcel.writeInt(this.mDuetFromDuetButton);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.publishStage);
        parcel.writeSerializable(this.loudnessBalanceParam);
        parcel.writeParcelable(this.beautyMobParam, i);
        parcel.writeByte(this.draftFromShoot ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.mAutoSelectedAnchor);
        parcel.writeString(this.openPlatformExtra);
        parcel.writeParcelable(this.singleImageCoverBitmapData, i);
        parcel.writeString(this.openPlatformClientKey);
        parcel.writeString(this.openPlatformShareId);
        parcel.writeSerializable(this.ttsVoiceModel);
        parcel.writeInt(this.isSpecialPlusIcon);
        parcel.writeSerializable(this.greenScreenKitConfig);
        parcel.writeInt(this.firstPropOrder);
        parcel.writeByte(this.isAIEnhanceOn ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.uploadTabNameList);
        parcel.writeParcelable(this.creativeModel, i);
        parcel.writeParcelable(this.multiSegmentPropClipsInfo, i);
        parcel.writeString(this.recordParam);
        parcel.writeString(this.ugcTemplateTag);
        parcel.writeLong(this.lastMusicTitleTimeMills.longValue());
    }
}
