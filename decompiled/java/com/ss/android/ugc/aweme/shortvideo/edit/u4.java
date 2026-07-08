package com.ss.android.ugc.aweme.shortvideo.edit;

import X.AbstractC848400XPy;
import X.C0BWP;
import X.C0BWQ;
import X.C0C64;
import X.C0CH7;
import X.C0CHQ;
import X.C0ET3;
import X.C0F8Y;
import X.C0FG9;
import X.C0FVR;
import X.C0LAB;
import X.C0M9T;
import X.C0MJO;
import X.C0MKI;
import X.C0MUK;
import X.C0PEM;
import X.C0XQ7;
import X.C123100dR;
import X.C13LP;
import X.C13LQ;
import X.C1403010mc7;
import X.C1403850mdT;
import X.C1414930mvL;
import X.C1416110mxF;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1428650nHT;
import X.C1429360nIc;
import X.C1429370nId;
import X.C1429380nIe;
import X.C1429400nIg;
import X.C1429680nJ8;
import X.C1429880nJS;
import X.C1430205im;
import X.C1444940nhk;
import X.C1463670oBx;
import X.C1466090oFr;
import X.C1697810uHb;
import X.C1B46;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2276971EAl;
import X.C2296808zG;
import X.C23250099c;
import X.C2356009La;
import X.C267670AeL;
import X.C276760At0;
import X.C291080Bb0;
import X.C294870Bh7;
import X.C299950BpJ;
import X.C304900BxI;
import X.C338630DPh;
import X.C351170Dpj;
import X.C351220Dpo;
import X.C352310DrZ;
import X.C391080FVa;
import X.C391110FVd;
import X.C537970L7z;
import X.C565160MEo;
import X.C573120Mdq;
import X.C573130Mdr;
import X.C573570MeZ;
import X.C580270MpN;
import X.C718010SEl;
import X.EnumC1412640mre;
import X.InterfaceC1452170ntP;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AICreateModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionExperimentInformation;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import x4l.a;

/* JADX INFO: loaded from: classes23.dex */
public final class u4 {
    public static final WeakHashMap<VideoPublishEditModel, Boolean> LIZ = new WeakHashMap<>();
    public static final WeakHashMap<VideoPublishEditModel, Boolean> LIZIZ = new WeakHashMap<>();

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        Long l;
        Long lValueOf;
        if (!videoPublishEditModel.getEnterFromImageSwitch() || (l = videoPublishEditModel.creativeModel.stickerModel.tosTimeStampForAyCommend) == null) {
            return false;
        }
        C1429400nIg c1429400nIg = C1429400nIg.LIZ;
        c1429400nIg.getClass();
        C1429360nIc c1429360nIc = C1429400nIg.LJ;
        if (c1429360nIc != null) {
            lValueOf = Long.valueOf(c1429360nIc.LIZ);
        } else {
            lValueOf = null;
        }
        if (!Intrinsics.LJFF(l, lValueOf)) {
            return false;
        }
        c1429400nIg.getClass();
        C1429360nIc c1429360nIc2 = C1429400nIg.LJ;
        if (c1429360nIc2 == null || c1429360nIc2.LIZJ) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getCanvasVideoData() != null && !videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar && C338630DPh.LIZ()) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        C0FG9.LIZ.getClass();
        if (!C0FG9.LIZ() || videoPublishEditModel == null || videoPublishEditModel.getStitchParams() != null || videoPublishEditModel.isDuet() || videoPublishEditModel.getMediaModelList().size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isCutSameVideoType() && !C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData())) {
            return C0CH7.LIZ();
        }
        return false;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.stickerModel.isFromFollowAddYours || !C0CHQ.LIZ().getAccountService().isLogin() || videoPublishEditModel.isEnterFromDM()) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && ((Number) C299950BpJ.LIZ.getValue()).intValue() <= 0) {
            return false;
        }
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && C1444940nhk.LJFF(canvasVideoData) && C299950BpJ.LIZ()) {
            return LJIJI(videoPublishEditModel);
        }
        CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData2 != null && C1444940nhk.LJI(canvasVideoData2)) {
            return false;
        }
        if (C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) && !C299950BpJ.LIZ()) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar && !C299950BpJ.LIZ()) {
            return false;
        }
        ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
        if (changeAvatarModel.isFromAiVatar || changeAvatarModel.isFromSocialAvatar) {
            return false;
        }
        if (LJLL(videoPublishEditModel) && !((Boolean) C267670AeL.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (C1444940nhk.LJIIIIZZ(videoPublishEditModel.getCanvasVideoData()) && !C299950BpJ.LIZ()) {
            return false;
        }
        return LJIJI(videoPublishEditModel);
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        if ((C338630DPh.LIZ() || LJJIIZ(videoPublishEditModel)) && !videoPublishEditModel.isEnterFromDM()) {
            z = true;
        } else {
            z = false;
        }
        if (LJLJJI(videoPublishEditModel) && z) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.stickerModel.isFromFollowAddYours || !C0CHQ.LIZ().getAccountService().isLogin() || videoPublishEditModel.isEnterFromDM()) {
            return false;
        }
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && C1444940nhk.LJI(canvasVideoData)) {
            return false;
        }
        ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
        if (changeAvatarModel.isFromChangeAvatar || changeAvatarModel.isFromAiVatar || changeAvatarModel.isFromSocialAvatar || C1444940nhk.LJIIIIZZ(videoPublishEditModel.getCanvasVideoData()) || C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        List listSingletonList = Collections.singletonList(4);
        a.LIZ.getClass();
        if (listSingletonList.contains(Integer.valueOf(a.LIZ())) && LJLJJL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(ShortVideoContext shortVideoContext) {
        AVChallenge recordChallenge;
        C1403010mc7.LIZ.LJI();
        if (!C2276971EAl.LIZ() || shortVideoContext.LJJJJLL() || shortVideoContext.LJJLL() || C0CHQ.LIZ().getAccountService().LIZ() || Intrinsics.LJFF(shortVideoContext.shootWay, "mission") || ((Intrinsics.LJFF(shortVideoContext.shootWay, "challenge") && (recordChallenge = shortVideoContext.creativeModel.commerceModel.getRecordChallenge()) != null && recordChallenge.isCommerce) || Intrinsics.LJFF(shortVideoContext.shootWay, "tcm_upload") || shortVideoContext.LJFF() != null || C1429680nJ8.LJFF(shortVideoContext.creativeModel.musicBuzModel) || C123100dR.LIZ(shortVideoContext.creativeModel.paidContentModel.getCollectionId()) || shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getEnterToPost() || shortVideoContext.creativeModel.aiLivePhotoModel.mobParam.generateSidebarType == 2)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        AVChallenge recordChallenge;
        C1403010mc7.LIZ.LJI();
        if (!C2276971EAl.LIZ() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet() || C0CHQ.LIZ().getAccountService().LIZ() || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "mission") || ((Intrinsics.LJFF(videoPublishEditModel.mShootWay, "challenge") && (recordChallenge = videoPublishEditModel.creativeModel.commerceModel.getRecordChallenge()) != null && recordChallenge.isCommerce) || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "tcm_upload") || ((C1466090oFr.LJIIJ(videoPublishEditModel.creativeModel.stickerModel) && !C573120Mdq.LIZ() && !C1429880nJS.LIZ(videoPublishEditModel)) || C1429680nJ8.LJ(videoPublishEditModel.creativeModel.musicBuzModel) || videoPublishEditModel.isCurrentAutoCutMode() || C123100dR.LIZ(videoPublishEditModel.creativeModel.paidContentModel.getCollectionId())))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "live_event") && (!videoPublishEditModel.creativeModel.stickerModel.liveEventStoryStickerModel.isEmpty())) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "imagine_studio_story") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "sticker_popup_story")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILL(VideoPublishEditModel videoPublishEditModel) {
        if ((videoPublishEditModel.isTemplateMv() || videoPublishEditModel.getShootMode() != 20) && videoPublishEditModel.getShootMode() != 23 && videoPublishEditModel.getShootMode() != 29) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "story") && videoPublishEditModel.creativeModel.commonMobModel.isUploadDirectEnter) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        if (LJLL(videoPublishEditModel) || videoPublishEditModel.getTtStoryUploadModel() != null || C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData()) || C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) || LJJZZI(videoPublishEditModel) || LJJZZIII(videoPublishEditModel) || C1444940nhk.LJIILL(videoPublishEditModel.getCanvasVideoData())) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "streaks_to_story") && videoPublishEditModel.creativeModel.streaksData.isStreaksPost()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJI(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        List<AddYoursStickerModel> addYoursStickerModels;
        if (C1428650nHT.LIZ() || C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return false;
        }
        if ((videoPublishEditModel.getImageAlbumData() != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (stickerInfoNewEngine = imageAlbumData.getStickerInfoNewEngine()) != null && (addYoursStickerModels = stickerInfoNewEngine.getAddYoursStickerModels()) != null && (!addYoursStickerModels.isEmpty())) || (!videoPublishEditModel.creativeModel.stickerModel.addYoursStickerModels.isEmpty())) {
            return true;
        }
        if (videoPublishEditModel.creativeModel.nowsShootModel != null && !C573130Mdr.LIZ()) {
            return false;
        }
        if ((videoPublishEditModel.getImageAlbumData() != null && !C573130Mdr.LIZ()) || C0CHQ.LIZ().getAccountService().LIZ() || !C304900BxI.LIZ()) {
            return false;
        }
        return true;
    }

    public static final String LJIJJ(VideoPublishEditModel videoPublishEditModel) {
        int fromAlbumType = videoPublishEditModel.getEditorProModel().getFromAlbumType();
        if (fromAlbumType != 0) {
            if (fromAlbumType != 1) {
                return "";
            }
            return "preview_page";
        }
        return "upload_page";
    }

    public static final String LJIJJLI(VideoPublishEditModel videoPublishEditModel) {
        String str;
        InitialMobParams initialMobParams = videoPublishEditModel.creativeModel.initialModel.mobParams;
        if (initialMobParams == null || (str = initialMobParams.enterType) == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final boolean LJIL(VideoPublishEditModel videoPublishEditModel) {
        if (C0MUK.LJFF(videoPublishEditModel.creativeModel) || C1416310mxZ.LJJJJZ(videoPublishEditModel) || Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "homepage_explore") || Intrinsics.LJFF("l8_music_edit_cml", videoPublishEditModel.mShootWay) || Intrinsics.LJFF("l8_import", videoPublishEditModel.mShootWay)) {
            return false;
        }
        if ((Intrinsics.LJFF(videoPublishEditModel.mShootWay, "photo_h5") && C276760At0.LIZIZ) || C1428470nHB.LJLJLLL(videoPublishEditModel)) {
            return false;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && imageAlbumData.isSingleWhenInit() && !C573570MeZ.LIZ()) {
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.photoModeTemplateData.isTemplateFromAnchor || creativeModel.imageEffectTemplateData.isTemplateFromAnchor || creativeModel.imageEditModel.enterFromPhotoTemplateApplied) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIII(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        List<AddYoursStickerModel> addYoursStickerModels;
        if (C1466090oFr.LJII(videoPublishEditModel.creativeModel.stickerModel)) {
            return true;
        }
        if (videoPublishEditModel.getImageAlbumData() != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (stickerInfoNewEngine = imageAlbumData.getStickerInfoNewEngine()) != null && (addYoursStickerModels = stickerInfoNewEngine.getAddYoursStickerModels()) != null && (!addYoursStickerModels.isEmpty())) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJ(VideoPublishEditModel videoPublishEditModel) {
        AudioRecorderParam veAudioRecorderParam;
        if (C1403850mdT.LJIIJJI(videoPublishEditModel) || (!videoPublishEditModel.isMvThemeVideoType() && (veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam()) != null && veAudioRecorderParam.getHasOriginalSound())) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel) {
        if (LJJIIJ(videoPublishEditModel) && videoPublishEditModel.getVoiceVolume() > 0.0f) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        EditorProModel editorProModel = videoPublishEditModel.getEditorProModel();
        if (editorProModel == null) {
            return false;
        }
        if (videoPublishEditModel.isRetakeVideo()) {
            return editorProModel.isAdvancedEditDraft();
        }
        if (!videoPublishEditModel.mIsFromDraft || !editorProModel.isAdvancedEditDraft()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZI(NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if (nLESegmentAudio == null || nLESegmentAudio.getVolume() == 0.0f) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJ(VideoPublishEditModel videoPublishEditModel) {
        AutoCutThemeData next;
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        Iterator<AutoCutThemeData> it2 = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.LIZIZ() == C1416110mxF.LJIIJJI(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData2 = next;
        if (autoCutThemeData2 == null || autoCutThemeData2.templateType != EnumC1412640mre.CUT_SAME.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJI(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.stickerModel.isFromFollowAddYours;
    }

    public static final boolean LJJIJIL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        return videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum();
    }

    public static final boolean LJJIJL(VideoPublishEditModel videoPublishEditModel) {
        if (C13LQ.LJJIJIIJI(Integer.valueOf(videoPublishEditModel.getShootMode()), new Integer[]{10, 11, 14, 18, 16, 17}) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJLIJ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIL(VideoPublishEditModel videoPublishEditModel) {
        String str;
        AIChatGenChatRoomModel aIChatGenChatRoomModel;
        if (videoPublishEditModel == null) {
            return false;
        }
        AIChatGenModel aIChatGenModel = videoPublishEditModel.creativeModel.aiChatGenModel;
        if (aIChatGenModel != null && (aIChatGenChatRoomModel = aIChatGenModel.chatRoomModel) != null) {
            str = aIChatGenChatRoomModel.entranceType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "editor_tab")) {
            return true;
        }
        return C123100dR.LIZ(videoPublishEditModel.getEditorProModel().getOpenEditToolType());
    }

    public static final boolean LJJIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        return TextUtils.equals(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "captions");
    }

    public static final boolean LJJJ(VideoPublishEditModel videoPublishEditModel) {
        String entranceType;
        if (videoPublishEditModel == null) {
            return false;
        }
        CelebrationData celebrationData = videoPublishEditModel.creativeModel.celebrationData;
        if (celebrationData != null) {
            entranceType = celebrationData.getEntranceType();
        } else {
            entranceType = null;
        }
        return Intrinsics.LJFF(entranceType, "create_tab");
    }

    public static final boolean LJJJI(VideoPublishEditModel videoPublishEditModel) {
        if (C1B46.LJIIJJI(videoPublishEditModel.mShootWay)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJIL(VideoPublishEditModel videoPublishEditModel) {
        if (!LJIILL(videoPublishEditModel)) {
            if (((!LJIILLIIL(videoPublishEditModel) && !videoPublishEditModel.creativeModel.commonMobModel.isFromIMShareToStory) || !com.ss.android.ugc.aweme.story.a.LIZ()) && !LJIJ(videoPublishEditModel) && !C1428470nHB.LLD(videoPublishEditModel.creativeModel) && !C565160MEo.LJI(videoPublishEditModel) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_live_to_story") && !LJIILIIL(videoPublishEditModel) && !videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar && !LJLJI(videoPublishEditModel) && !LJIILJJIL(videoPublishEditModel)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJJJJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.commerceModel.getTcmModel().isTcmOrder()) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.draftInfoModel.isDraft && creativeModel.commerceModel.getTcmModel().getOuterTcmOrder() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJJJI(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.imageEffectTemplateData.isTemplateFromAnchor;
    }

    public static final boolean LJJJJIZL(VideoPublishEditModel videoPublishEditModel) {
        AutoCutThemeData next;
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        Iterator<AutoCutThemeData> it2 = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.LIZIZ() == C1416110mxF.LJIIJJI(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData2 = next;
        if (autoCutThemeData2 == null || autoCutThemeData2.templateType != EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJL(CreativeModel creativeModel) {
        if (creativeModel.musicShareStoryData.getCoverPath() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !LJLL(videoPublishEditModel) || !C1428470nHB.LJJZZI(videoPublishEditModel) || !C0BWQ.LIZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJLI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !LJLL(videoPublishEditModel) || !C1428470nHB.LJJZZI(videoPublishEditModel) || !C0BWP.LIZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJLL(CreativeModel creativeModel) {
        if (!Intrinsics.LJFF(creativeModel.text2ImageModel.entrance, "story_record_page") && !Intrinsics.LJFF(creativeModel.text2ImageModel.entrance, "story_upload_page")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJZ(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_live_to_story") || C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData()) || LJJJJJL(videoPublishEditModel.creativeModel) || videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.getFromCut() && !videoPublishEditModel.getFromMultiCut()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLIIL(NLETrackSlot nLETrackSlot) {
        if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            return true;
        }
        return false;
    }

    public static final void LJJJLL(VideoPublishEditModel videoPublishEditModel) {
        WeakHashMap<VideoPublishEditModel, Boolean> weakHashMap = LIZIZ;
        synchronized (weakHashMap) {
            try {
                weakHashMap.put(videoPublishEditModel, Boolean.TRUE);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C718010SEl.LIZ.getClass();
        C718010SEl.LJI().storeBoolean(C718010SEl.LIZJ(), true);
        C718010SEl.LJI().storeLong(C718010SEl.LIZIZ(), System.currentTimeMillis() / 1000);
    }

    public static final void LJJLIIJ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        C20684815ws.LJIILLIIL("long_video_edit_text_guide_show", c0lab.LIZ);
    }

    public static final boolean LJJZ(VideoPublishEditModel videoPublishEditModel) {
        Cut2EditTransferModel cut2EditTransferModel;
        if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.isFromRestoreRecover()) {
            return false;
        }
        C1414930mvL.LIZ.getClass();
        if (!C1414930mvL.LJIIIZ(videoPublishEditModel) || (cut2EditTransferModel = videoPublishEditModel.creativeModel.cut2EditTransferModel) == null || !cut2EditTransferModel.getMusicSyncMode() || LJJIJIL(videoPublishEditModel) || C1416310mxZ.LJJI(videoPublishEditModel) || LJJIL(videoPublishEditModel) || videoPublishEditModel.isLivePhotoEdit() || videoPublishEditModel.creativeModel.videoImageSeparateSwitchModel != null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJZZI(VideoPublishEditModel videoPublishEditModel) {
        if (!LJLL(videoPublishEditModel)) {
            return false;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(1, 2, 4, 5);
        a.LIZ.getClass();
        if (!listLJIIJJI.contains(Integer.valueOf(a.LIZ()))) {
            return false;
        }
        return true;
    }

    public static final boolean LJJZZIII(VideoPublishEditModel videoPublishEditModel) {
        if (LJLL(videoPublishEditModel)) {
            List listSingletonList = Collections.singletonList(3);
            a.LIZ.getClass();
            if (listSingletonList.contains(Integer.valueOf(a.LIZ())) && LJLJJLL(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final String LJL(String str) {
        if (a0.LJJIJ(str, '-')) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (str.charAt(i) == '-') {
                    if (i >= 0) {
                        return str.substring(0, i);
                    }
                } else {
                    i++;
                }
            }
            return str;
        }
        return str;
    }

    public static final List<MediaModel> LJLI(C1463670oBx c1463670oBx) {
        VecNLETrackSlotSPtr slots;
        NLEResourceAV aVFile;
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = c1463670oBx.LIZJ().getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                NLESegmentVideo nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlot);
                if (nLESegmentVideoLIZ != null && (aVFile = nLESegmentVideoLIZ.getAVFile()) != null) {
                    MediaModel mediaModel = new MediaModel(-1L);
                    mediaModel.LJIILL(aVFile.getResourceFile());
                    mediaModel.width = (int) aVFile.getWidth();
                    mediaModel.height = (int) aVFile.getHeight();
                    mediaModel.duration = C352310DrZ.LIZ(aVFile.getDuration());
                    mediaModel.startTime = 0;
                    mediaModel.endTime = C352310DrZ.LIZ(nLETrackSlot.getEndTime()) - C352310DrZ.LIZ(nLETrackSlot.getStartTime());
                    mediaModel.speed = nLETrackSlot.getSpeed();
                    arrayList.add(mediaModel);
                }
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    public static final int LJLIIIL(VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        if (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.creativeModel.inlineCaptionModel != null && !videoPublishEditModel.isFromCrash()) {
            InlineCaptionExperimentInformation inlineCaptionExperimentInformation = videoPublishEditModel.creativeModel.inlineCaptionExperimentInformation;
            if (inlineCaptionExperimentInformation != null && (numValueOf = Integer.valueOf(inlineCaptionExperimentInformation.experimentType)) != null) {
                if (numValueOf.intValue() == 0) {
                    if (C1429370nId.LIZ() != 1) {
                        return 0;
                    }
                    return 1;
                }
                if (numValueOf.intValue() == 1) {
                    if (C1429370nId.LIZ() == 0) {
                        return 0;
                    }
                    return 1;
                }
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 2) {
                        if (C1429370nId.LIZ() == 3) {
                            return 3;
                        }
                        return 2;
                    }
                    if (numValueOf.intValue() == 3) {
                        if (C1429370nId.LIZ() != 2) {
                            return 3;
                        }
                        return 2;
                    }
                }
            }
            return C1429370nId.LIZ();
        }
        return C1429370nId.LIZ();
    }

    public static final boolean LJLIIL(C0FVR c0fvr) {
        if ((C291080Bb0.LIZ() && c0fvr != C0FVR.LIVE_HIGHLIGHT && c0fvr != C0FVR.LANDSCAPE_VIDEO) || c0fvr == C0FVR.NONE) {
            return false;
        }
        if (c0fvr == C0FVR.LONG_VIDEO && (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_default_text_sticker_1min_video", true) == 1 || (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_default_text_sticker_1min_video", true) == 2 && ((Keva) C391110FVd.LIZ.getValue()).getBoolean("GuideHasShown", false)))) {
            return false;
        }
        if (c0fvr == C0FVR.LANDSCAPE_VIDEO) {
            C0FG9.LIZ.getClass();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "upload_landscape_post_opt", true) != 2 || ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().historyMaxFollowerCount < 1000 || ((Keva) C391080FVa.LIZ.getValue()).getBoolean("GuideHasShown", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJLIL(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        AICreateModel aICreateModel;
        WeakHashMap<VideoPublishEditModel, Boolean> weakHashMap = LIZ;
        synchronized (weakHashMap) {
            try {
                Boolean bool = weakHashMap.get(videoPublishEditModel);
                if (bool != null) {
                    return bool.booleanValue();
                }
                boolean z = true;
                boolean z2 = false;
                if (!C1428470nHB.LLIIIILZ(videoPublishEditModel) && !C1428470nHB.LJJJIL(videoPublishEditModel) && (((aICreateModel = (creativeModel = videoPublishEditModel.creativeModel).aiCreateModel) == null || !aICreateModel.isText2ImageMode) && !(!creativeModel.text2ImageModel.imageTaskList.isEmpty()) && !LJJJJLL(videoPublishEditModel.creativeModel) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "ab_roll"))) {
                    ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
                    if (!changeAvatarModel.isFromChangeAvatar && !changeAvatarModel.isFromAiVatar && !changeAvatarModel.isFromSocialAvatar && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "profile_photo") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "social_avatar") && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "ai_avatar") && !LJIJ(videoPublishEditModel) && !videoPublishEditModel.creativeModel.streaksData.isStreaksPost() && !videoPublishEditModel.creativeModel.streaksData.isStreaksShareToStory() && videoPublishEditModel.creativeModel.storyEventStickerData.getStoryStreakModel() == null && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "streaks_to_story") && !C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData()) && !LJJJJJL(videoPublishEditModel.creativeModel) && !videoPublishEditModel.creativeModel.commonMobModel.isFromIMShareToStory && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_live_to_story") && !LJIILJJIL(videoPublishEditModel)) {
                        if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "direct_shoot") && !LJIILL(videoPublishEditModel) && !LJIILLIIL(videoPublishEditModel)) {
                            z = false;
                        }
                        z2 = z;
                    }
                }
                synchronized (weakHashMap) {
                    try {
                        weakHashMap.put(videoPublishEditModel, Boolean.valueOf(z2));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return z2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static final boolean LJLILLLLZI(VideoPublishEditModel videoPublishEditModel) {
        if (!LJLIL(videoPublishEditModel)) {
            return false;
        }
        WeakHashMap<VideoPublishEditModel, Boolean> weakHashMap = LIZIZ;
        synchronized (weakHashMap) {
            try {
                if (Intrinsics.LJFF(weakHashMap.get(videoPublishEditModel), Boolean.TRUE)) {
                    return true;
                }
                C718010SEl.LIZ.getClass();
                C718010SEl.LIZ();
                if (C0M9T.LIZ().enable24hEducation && C718010SEl.LJIIIZ()) {
                    if (C718010SEl.LJI().getBoolean(C718010SEl.LIZJ(), false)) {
                        if (C0M9T.LIZ().enableCyclicalNewUserEducation) {
                            long j = C718010SEl.LJI().getLong(C718010SEl.LIZIZ(), 0L);
                            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                            if (j <= 0) {
                                C718010SEl.LJI().storeLong(C718010SEl.LIZIZ(), jCurrentTimeMillis);
                            } else if (jCurrentTimeMillis >= j) {
                                long j2 = jCurrentTimeMillis - j;
                                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                                int iLJIJ = 43200;
                                if (c0c64LJIILLIIL != null && (iLJIJ = c0c64LJIILLIIL.LJIJ(31744, 43200, "published_story_stats_card_within_n_minutes", true)) < 1) {
                                    iLJIJ = 1;
                                }
                                if (j2 >= ((long) iLJIJ) * 60) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final boolean LJLJI(VideoPublishEditModel videoPublishEditModel) {
        if (!C0MKI.LIZ()) {
            return false;
        }
        if (!C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData()) && !LJJJJJL(videoPublishEditModel.creativeModel) && !videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJLJJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.u4.LJLJJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LJLJJL(VideoPublishEditModel videoPublishEditModel) {
        if ((LJJIJL(videoPublishEditModel) || videoPublishEditModel.getShootMode() == 0) && !videoPublishEditModel.isStitchMode() && !videoPublishEditModel.isDuet() && !videoPublishEditModel.isEnterFromDM() && !videoPublishEditModel.isEnterFromBulletin() && LJLJL(videoPublishEditModel) && LJLJJLL(videoPublishEditModel) && !C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJLJJLL(VideoPublishEditModel videoPublishEditModel) {
        AVChallenge recordChallenge;
        AVMusic aVMusicExtractAVMusic;
        AVChallenge aVChallenge;
        if (videoPublishEditModel.creativeModel.commerceModel.getMission() == null && ((recordChallenge = videoPublishEditModel.creativeModel.commerceModel.getRecordChallenge()) == null || !recordChallenge.isCommerce)) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : videoPublishEditModel.getFinalVideoList()) {
                if (!timeSpeedModelExtension.getRecordExtras().isEmpty() && timeSpeedModelExtension.getFromRecordExtras("extra_key_ibe_info") != null) {
                    return false;
                }
            }
            StickerInfo stickerInfo = videoPublishEditModel.creativeModel.recordEffectModel.stickerInfo;
            if ((stickerInfo != null && stickerInfo.isCommerceSticker()) || videoPublishEditModel.isCommentReply() || C1429380nIe.LIZ || ((aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel)) != null && (aVChallenge = aVMusicExtractAVMusic.challenge) != null && aVChallenge.isCommerce)) {
                return false;
            }
            List<AVChallenge> list = videoPublishEditModel.challenges;
            if (list != null && !list.isEmpty()) {
                for (AVChallenge aVChallenge2 : list) {
                    if (aVChallenge2 != null && aVChallenge2.isCommerce) {
                        return false;
                    }
                }
            }
            if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "tcm_upload") && !LJJJJ(videoPublishEditModel)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJLJL(VideoPublishEditModel videoPublishEditModel) {
        if (C13LQ.LJJIJIIJI(videoPublishEditModel.mShootWay, new String[]{"direct_shoot", "single_song", "prop_page", "story", "add_yours", "on_this_day", "profile_photo", "share_to_dm", "system_share"}) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJLJLJ(VideoPublishEditModel videoPublishEditModel) {
        if (LJLIIIL(videoPublishEditModel) != 2 && LJLIIIL(videoPublishEditModel) != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJLJLLL(VideoPublishEditModel videoPublishEditModel) {
        if (LJLIIIL(videoPublishEditModel) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJLL(VideoPublishEditModel videoPublishEditModel) {
        if (LJJJIL(videoPublishEditModel) && !C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final void LIZ(CreativeModel creativeModel, C0LAB c0lab) {
        EditorProSchemeModel editorProSchemeModel;
        if (creativeModel != null && (editorProSchemeModel = creativeModel.editorProSchemeModel) != null && C537970L7z.LIZIZ(editorProSchemeModel)) {
            c0lab.LJ("captions_enter_source", "fyp_anchor");
        }
    }

    public static final C0FVR LJJIFFI(VideoPublishEditModel videoPublishEditModel, Integer num) {
        String newDraftId;
        String newDraftId2;
        String newDraftId3;
        String effectId;
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.initialModel.highLightVideoParametersModel.stickerText) && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            return C0FVR.LIVE_HIGHLIGHT;
        }
        if (!videoPublishEditModel.isCommentReply() && !videoPublishEditModel.mIsFromDraft && (((newDraftId3 = videoPublishEditModel.getNewDraftId()) == null || newDraftId3.length() == 0) && !videoPublishEditModel.isRetakeVideo() && !Intrinsics.LJFF("effect_qr_scan", videoPublishEditModel.getEnterFrom()) && !C1428470nHB.LJJZZI(videoPublishEditModel))) {
            TTSVoiceModel ttsVoiceModel = videoPublishEditModel.getTtsVoiceModel();
            if (ttsVoiceModel != null) {
                effectId = ttsVoiceModel.getEffectId();
            } else {
                effectId = null;
            }
            if (!TextUtils.isEmpty(effectId) && !videoPublishEditModel.getAutoAddTTSStickerOnce()) {
                videoPublishEditModel.setAutoAddTTSStickerOnce(true);
                return C0FVR.TTS_VOICE;
            }
        }
        if (!videoPublishEditModel.isCommentReply() && !C1416310mxZ.LJJJJZ(videoPublishEditModel) && !videoPublishEditModel.mIsFromDraft && (((newDraftId2 = videoPublishEditModel.getNewDraftId()) == null || newDraftId2.length() == 0) && !videoPublishEditModel.isRetakeVideo() && !C1428470nHB.LJIIZILJ(videoPublishEditModel) && !Intrinsics.LJFF("effect_qr_scan", videoPublishEditModel.getEnterFrom()) && !C1444940nhk.LJI(videoPublishEditModel.getCanvasVideoData()) && videoPublishEditModel.getMediaModelList().size() == 1)) {
            MediaModel mediaModel = (MediaModel) ListProtector.get(videoPublishEditModel.getMediaModelList(), 0);
            if (mediaModel.LJIILJJIL() && mediaModel.height < mediaModel.width) {
                C0FG9.LIZ.getClass();
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "upload_landscape_post_opt", true) == 2 && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().historyMaxFollowerCount >= 1000 && num != null && num.intValue() > 60000) {
                    return C0FVR.LANDSCAPE_VIDEO;
                }
            }
        }
        if (!videoPublishEditModel.isCommentReply() && !C1416310mxZ.LJJJJZI(videoPublishEditModel) && !videoPublishEditModel.mIsFromDraft && (((newDraftId = videoPublishEditModel.getNewDraftId()) == null || newDraftId.length() == 0) && !videoPublishEditModel.isRetakeVideo() && !C1428470nHB.LJIIZILJ(videoPublishEditModel) && !Intrinsics.LJFF("effect_qr_scan", videoPublishEditModel.getEnterFrom()) && !C1444940nhk.LJI(videoPublishEditModel.getCanvasVideoData()) && num != null && num.intValue() > 60000)) {
            return C0FVR.LONG_VIDEO;
        }
        return C0FVR.NONE;
    }

    public static final Pair<Integer, Integer> LJJII(NLEModel nLEModel, boolean z) {
        boolean zLLJJJ;
        if (nLEModel == null) {
            return new Pair<>(0, 0);
        }
        if (nLEModel.getMainTrack() == null) {
            return new Pair<>(0, 0);
        }
        int size = nLEModel.getMainTrack().getSlots().size();
        VecNLETrackSlotSPtr slots = nLEModel.getMainTrack().getSlots();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : slots) {
            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
            if (z) {
                zLLJJJ = C351220Dpo.LLJJIJIL(nLETrackSlot2);
            } else {
                zLLJJJ = C351220Dpo.LLJJJ(nLETrackSlot2);
            }
            if (zLLJJJ) {
                arrayList.add(nLETrackSlot);
            }
        }
        int size2 = arrayList.size();
        return new Pair<>(Integer.valueOf(size - size2), Integer.valueOf(size2));
    }

    public static final boolean LJJJJJ(VideoPublishEditModel videoPublishEditModel, int i) {
        if (C1416310mxZ.LJIILJJIL(videoPublishEditModel)) {
            if (i != 1) {
                C0ET3.LIZ.getClass();
                if (!C0ET3.LIZ(videoPublishEditModel)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final void LJJLIIIJLLLLLLLZ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModel;
        int duration;
        C1463670oBx c1463670oBx;
        if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null) {
            nLEModel = c1463670oBx.LIZJ();
        } else {
            nLEModel = new NLEModel();
        }
        int i = 0;
        if (interfaceC1452170ntP != null) {
            duration = interfaceC1452170ntP.getDuration();
        } else {
            duration = 0;
        }
        Pair<Integer, Integer> pairLJJII = LJJII(nLEModel, true);
        int iIntValue = pairLJJII.getFirst().intValue();
        int iIntValue2 = pairLJJII.getSecond().intValue();
        boolean z = videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate;
        C0LAB c0labLJFF = LJFF(videoPublishEditModel, false, false, 6);
        c0labLJFF.LIZ(0, "is_editor_pro");
        c0labLJFF.LIZ(z ? 1 : 0, "is_from_create_template");
        c0labLJFF.LIZ(duration, "creation_duration");
        c0labLJFF.LIZ(iIntValue, "video_cnt");
        c0labLJFF.LIZ(iIntValue2, "pic_cnt");
        if (iIntValue + iIntValue2 > 1) {
            i = 1;
        }
        c0labLJFF.LIZ(i, "is_multi_content");
        C20684815ws.LJIILLIIL("text_duration_adjust", c0labLJFF.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJLIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJLIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel):void");
    }

    public static final void LJJLL(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C0LAB c0labLJFF = LJFF(videoPublishEditModel, false, z, 2);
        c0labLJFF.LIZ(0, "is_editor_pro");
        C20684815ws.LJIILLIIL("text_time_set", c0labLJFF.LIZ);
    }

    public static final void LIZIZ(C0LAB c0lab, VEUtils.VEVideoFileInfo vEVideoFileInfo, VideoPublishEditModel videoPublishEditModel) {
        int i;
        int i2;
        if (LJ(videoPublishEditModel) && vEVideoFileInfo != null && (i = vEVideoFileInfo.width) != 0 && (i2 = vEVideoFileInfo.height) != 0) {
            c0lab.LIZ(i, "source_width");
            c0lab.LIZ(vEVideoFileInfo.height, "source_height");
            c0lab.LIZJ(Float.valueOf(i / i2), "source_aspect_ratio");
        }
    }

    public static final C0LAB LJJ(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        String strLJL;
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            str2 = "general_draft_list";
        } else {
            str2 = "";
        }
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LIZ(i, "is_editor_pro");
        c0labLJIILIIL.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
        c0labLJIILIIL.LIZ(iIntValue, "video_cnt");
        c0labLJIILIIL.LIZ(iIntValue2, "pic_cnt");
        c0labLJIILIIL.LJ("draft_way", str2);
        c0labLJIILIIL.LIZ(videoPublishEditModel.getVideoLength(), "creation_duration");
        c0labLJIILIIL.LIZ(LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
        c0labLJIILIIL.LIZ(LJJIJLIJ(videoPublishEditModel) ? 1 : 0, "is_from_create_template");
        if (str.length() == 0) {
            strLJL = C0CHQ.LIZ().LJJIJIIJIL();
        } else {
            strLJL = LJL(str);
        }
        c0labLJIILIIL.LJ("asr_model_lang", strLJL);
        return c0labLJIILIIL;
    }

    public static /* synthetic */ C0LAB LJJI(VideoPublishEditModel videoPublishEditModel, int i, int i2) {
        String str;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str = "";
        } else {
            str = null;
        }
        return LJJ(i, videoPublishEditModel, str);
    }

    public static final void LJJLI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, String str) {
        int i;
        if (videoPublishEditModel == null) {
            return;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        int i2 = 1;
        int i3 = 0;
        if (tracks != null && !tracks.isEmpty()) {
            Iterator<NLETrack> it2 = tracks.iterator();
            loop0: while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (!(slots instanceof Collection) || !slots.isEmpty()) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        if (NLESegmentTextSticker.dynamicCast((NLENode) it3.next().getMainSegment()) != null) {
                            i = 1;
                            break loop0;
                        }
                    }
                }
            }
            i = 0;
        } else {
            i = 0;
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        if (tracks2 != null) {
            if (!tracks2.isEmpty()) {
                for (NLETrack nLETrack : tracks2) {
                    if (C351220Dpo.LLLJ(nLETrack) && nLETrack.getSlots().size() > 0) {
                        break;
                    }
                }
                i2 = 0;
                i3 = i2;
            } else {
                i2 = 0;
                i3 = i2;
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        c0lab.LIZ(videoPublishEditModel.hasText() ? 1 : 0, "edit_mode_has_text");
        c0lab.LIZ(i, "nle_has_text");
        c0lab.LIZ(videoPublishEditModel.hasReadTextAudio() ? 1 : 0, "edit_model_has_tts");
        c0lab.LIZ(i3, "nle_has_tts");
        c0lab.LIZ(C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel) ? 1 : 0, "text_use_new_engine");
        C20684815ws.LJIILLIIL("check_text_for_switch_page", c0lab.LIZ);
    }

    public static final void LJJLIIIJJIZ(VideoPublishEditModel videoPublishEditModel, boolean z, float f) {
        String str;
        String str2;
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            str = "general_draft_list";
        } else {
            str = "shoot_page";
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_talking_videos", str2);
        c0lab.LIZJ(Float.valueOf(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength() * f), "speech_duration");
        c0lab.LIZJ(Float.valueOf(f), "speech_pct");
        c0lab.LJ("app_language", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        c0lab.LJ("enter_way", "edit_page_subtitle_sidebar");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LJ("draft_way", str);
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        C20684815ws.LJIILLIIL("auto_speech_detection_end", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static C0LAB LJFF(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, int i) {
        ?? r4 = z;
        if ((i & 2) != 0) {
            r4 = 0;
        }
        ?? r5 = z2;
        if ((i & 4) != 0) {
            r5 = 0;
        }
        ?? LJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        LJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        LJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        LJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        LJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        LJIILIIL.LJ("enter_from", "video_edit_page");
        LJIILIIL.LIZ(r4, "is_diy_prop");
        LJIILIIL.LIZ(r5, "is_text_reading");
        return LJIILIIL;
    }

    public static final void LJJL(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, String str, boolean z) {
        if (videoPublishEditModel == null) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1430205im(z, videoPublishEditModel, nLEModel, str, null), 3);
    }

    public static void LJJLJLI(int i, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        if ((i & 16) != 0) {
            str2 = "";
        }
        C0LAB c0labLJFF = LJFF(videoPublishEditModel, false, false, 6);
        c0labLJFF.LIZ(0, "is_editor_pro");
        c0labLJFF.LJ("text_add_type", str);
        c0labLJFF.LJ("text_type", str2);
        C20684815ws.LJIILLIIL("text_more_click", c0labLJFF.LIZ);
    }

    public static final void LJJLIIIJJI(VideoPublishEditModel videoPublishEditModel, TextStickerData textStickerData, float f, float f2, int i) {
        String str;
        String str2;
        String str3;
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LIZ(i, "is_editor_pro");
        c0labLJIILIIL.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
        if (Intrinsics.LJFF(textStickerData.getType(), "type_inline_caption")) {
            str = "caption";
        } else {
            str = "text";
        }
        c0labLJIILIIL.LJ("text_type", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(f);
        sbLIZ.append(", ");
        sbLIZ.append(f2);
        c0labLJIILIIL.LJ("to_location", C2188811AlT.LIZIZ(sbLIZ));
        c0labLJIILIIL.LIZJ(Float.valueOf(textStickerData.getScale()), "to_rate");
        c0labLJIILIIL.LIZJ(Float.valueOf(textStickerData.getRotation()), "to_angle");
        if (textStickerData.getScale() <= 1.0f) {
            str2 = "zoom_out";
        } else {
            str2 = "zoom_in";
        }
        c0labLJIILIIL.LJ("action_type", str2);
        if (Intrinsics.LJFF(textStickerData.getType(), "type_inline_caption")) {
            InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel == null || (str3 = inlineCaptionModel.selectLanguageCode) == null) {
                str3 = "";
            }
            c0labLJIILIIL.LJ("asr_model_lang", LJL(str3));
        }
        C2356009La c2356009La = C2356009La.LIZ;
        String strVideoPath = videoPublishEditModel.videoPath();
        c2356009La.getClass();
        LIZIZ(c0labLJIILIIL, C2356009La.LIZ(strVideoPath), videoPublishEditModel);
        C20684815ws.LJIILLIIL("edit_text", c0labLJIILIIL.LIZ);
    }

    public static void LJJLJ(VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z, int i) {
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 32) != 0) {
            z = false;
        }
        C0LAB c0labLJFF = LJFF(videoPublishEditModel, false, false, 6);
        c0labLJFF.LIZ(0, "is_editor_pro");
        c0labLJFF.LJ("text_add_type", str);
        c0labLJFF.LJ("text_type", str2);
        c0labLJFF.LJFF("has_tts", z);
        C20684815ws.LJIILLIIL("text_bubble_real_show", c0labLJFF.LIZ);
    }

    public static final void LJJLIIIJL(VideoPublishEditModel videoPublishEditModel, int i, String str, String str2, int i2, StickerModel stickerModel) {
        String str3;
        TextStickerModel textStickerModel;
        if (videoPublishEditModel == null) {
            return;
        }
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("enter_from", "video_edit_page");
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LIZ(0, "is_subtitle");
        c0labLJIILIIL.LIZ(i2, "is_editor_pro");
        c0labLJIILIIL.LJ("enter_method", "move_to_top");
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LIZ(i, "is_guidance_text");
        c0labLJIILIIL.LJ("delete_method", str);
        boolean z = stickerModel instanceof TextStickerModel;
        TextStickerModel textStickerModel2 = null;
        if (z) {
            textStickerModel2 = (TextStickerModel) stickerModel;
        }
        if (textStickerModel2 != null && textStickerModel2.getCaptionModel() != null) {
            str3 = "caption";
        } else if (z && (textStickerModel = (TextStickerModel) stickerModel) != null && C0F8Y.LJII(textStickerModel)) {
            str3 = "ai_text";
        } else {
            str3 = "text";
        }
        c0labLJIILIIL.LJ("text_type", str3);
        if (str2 != null) {
            c0labLJIILIIL.LJ("text_add_type", str2);
        }
        if (videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enableTextStickerOnRecord) {
            c0labLJIILIIL.LIZ(1, "is_dm_text_icon");
        }
        String str4 = videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str4 != null) {
            c0labLJIILIIL.LJ("enter_dm", str4);
        }
        C2356009La c2356009La = C2356009La.LIZ;
        String strVideoPath = videoPublishEditModel.videoPath();
        c2356009La.getClass();
        LIZIZ(c0labLJIILIIL, C2356009La.LIZ(strVideoPath), videoPublishEditModel);
        C20684815ws.LJIILLIIL("text_delete", c0labLJIILIIL.LIZ);
    }

    public static /* synthetic */ void LJJLIIIJILLIZJL(VideoPublishEditModel videoPublishEditModel, long j, String str, String str2, int i, String str3, int i2) {
        int i3 = i;
        String str4 = str3;
        String str5 = str2;
        if ((i2 & 32) != 0) {
            str5 = null;
        }
        if ((i2 & 64) != 0) {
            i3 = 0;
        }
        if ((i2 & 128) != 0) {
            str4 = "";
        }
        LJJLIIIJ(videoPublishEditModel, j, str, null, null, str5, i3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    public static final void LJJJLZIJ(VideoPublishEditModel videoPublishEditModel, long j, String str, int i, String str2, Boolean bool, boolean z, String str3) {
        ?? r1;
        String strLJL;
        String str4;
        ?? LIZ2;
        ?? LJJI = LJJI(videoPublishEditModel, 0, 6);
        LJJI.LIZ(videoPublishEditModel.getVideoLength(), "video_duration");
        LJJI.LIZIZ(SystemClock.elapsedRealtime() - j, "load_time");
        LJJI.LJ("load_status", str);
        if (i == 0 && !z) {
            r1 = videoPublishEditModel.creativeModel.stickerModel.captionItemBarVisible;
        } else {
            r1 = 0;
        }
        LJJI.LIZ(r1, "is_from_pinned_captions");
        LJJI.LIZ(i, "is_editor_pro");
        LJJI.LIZ(LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
        LJJI.LIZ(LJJIZ(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab_captions");
        LJJI.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, LJJI);
        LIZ(videoPublishEditModel.creativeModel, LJJI);
        if (str2.length() == 0) {
            strLJL = C0CHQ.LIZ().LJJIJIIJIL();
        } else {
            strLJL = LJL(str2);
        }
        LJJI.LJ("asr_model_lang", strLJL);
        if (bool != null) {
            LIZ2 = bool.booleanValue();
        } else {
            InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel != null && (str4 = inlineCaptionModel.selectLanguageCode) != null) {
                LIZ2 = Intrinsics.LJFF(str4, "auto_language");
            } else {
                LIZ2 = C294870Bh7.LIZ(videoPublishEditModel);
            }
        }
        LJJI.LIZ(LIZ2, "is_auto_language");
        LJJI.LIZ(LJJJJJ(videoPublishEditModel, i) ? 1 : 0, "is_remove_filler_words");
        LJJI.LJ("asr_model", str3);
        C20684815ws.LJIILLIIL("auto_subtitle_end", LJJI.LIZ);
    }

    public static final void LJJLIIIJ(VideoPublishEditModel videoPublishEditModel, long j, String str, Integer num, Integer num2, String str2, int i, String str3) {
        String strLJL;
        C0LAB c0labLJJI = LJJI(videoPublishEditModel, 0, 6);
        c0labLJJI.LIZ(videoPublishEditModel.getVideoLength(), "video_duration");
        c0labLJJI.LIZIZ(SystemClock.elapsedRealtime() - j, "load_time");
        c0labLJJI.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0labLJJI.LIZ(i, "is_editor_pro");
        c0labLJJI.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
        if (str3.length() == 0) {
            strLJL = C0CHQ.LIZ().LJJIJIIJIL();
        } else {
            strLJL = LJL(str3);
        }
        c0labLJJI.LJ("asr_model_lang", strLJL);
        if (num != null) {
            c0labLJJI.LIZ(num.intValue(), "filler_words_cnt");
        }
        if (num2 != null) {
            c0labLJJI.LIZ(num2.intValue(), "pause_cnt");
        }
        if (C123100dR.LIZ(str2)) {
            c0labLJJI.LJ("error_message", str2);
        }
        C20684815ws.LJIILLIIL("detect_filler_words_end", c0labLJJI.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJLIIIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, java.lang.String r15, int r16, X.C196925122x r17, java.lang.Boolean r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Boolean r21, java.lang.Boolean r22, java.lang.Boolean r23, int r24) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJLIIIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, int, X.122x, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
