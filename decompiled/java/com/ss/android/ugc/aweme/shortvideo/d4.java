package com.ss.android.ugc.aweme.shortvideo;

import X.C0CHQ;
import X.C13LP;
import X.C13LQ;
import X.C1441190nbh;
import X.C1443960ngA;
import X.C1697810uHb;
import X.C2256211DSp;
import X.C267880Aeg;
import X.C304900BxI;
import X.C306040Bz8;
import X.C524930KiJ;
import X.C539900LFk;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.performance.videoquality.HDRCameraConfig;
import com.ss.android.ugc.aweme.shortvideo.model.RecordStickerSegmentInfoKt;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.story.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class d4 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L5f
            java.lang.String r1 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
        Le:
            boolean r0 = X.C533930Kwp.LIZIZ(r0)
            r2 = 0
            if (r0 == 0) goto L53
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            r3 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "open_album_when_no_camera_permission"
            r1 = 1
            boolean r0 = r4.LJIIIZ(r3, r0, r1, r2)
            if (r0 != r1) goto L54
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.C533930Kwp.LIZLLL(r0)
            if (r0 != 0) goto L54
            java.lang.String r0 = r5.getMusicId()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L54
            boolean r0 = r5.LJJLL()
            if (r0 != 0) goto L54
            boolean r0 = r5.LJJJJLL()
            if (r0 != 0) goto L54
            java.lang.String r1 = "single_song"
            java.lang.String r0 = "collection_music"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = r5.shootWay
            int r0 = X.C13LQ.LJJIJIIJI(r0, r1)
            if (r0 < 0) goto L54
        L52:
            r2 = 1
        L53:
            return r2
        L54:
            java.lang.String r1 = r5.enterFrom
            java.lang.String r0 = "homepage_explore"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L53
            goto L52
        L5f:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.d4.LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):boolean");
    }

    public static final boolean LIZIZ(ShortVideoContext shortVideoContext) {
        if (LIZJ(shortVideoContext) || (Intrinsics.LJFF(shortVideoContext.shootWay, "ai_livephoto_anchor") && shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getEnterToPost())) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(ShortVideoContext shortVideoContext) {
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "ai_livephoto_anchor") && !shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getEnterToPost()) {
            return true;
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "general_search") && Intrinsics.LJFF(shortVideoContext.enterMethod, "ai_livephoto_search_card")) {
            return true;
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "notification_page") && Intrinsics.LJFF(shortVideoContext.enterMethod, "ai_livephoto_inbox_banner")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            int r1 = r0.defaultCameraSpec
            r0 = -1
            if (r1 != r0) goto L4c
            X.0tJV r2 = X.EnumC1660550tJV.VIDEO_MODE
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L7a
            boolean r0 = X.C539900LFk.LIZ(r5)
            if (r0 == 0) goto L51
            boolean r0 = r5.LJJIL()
            if (r0 == 0) goto L51
        L23:
            X.0nnd r1 = X.C1650480t3G.LIZ()
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r5.cameraComponentModel
            boolean r0 = r0.enableRecordingMp4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r1, r0)
        L34:
            java.lang.Object r3 = r4.getFirst()
            X.0nnd r3 = (X.EnumC1448590nnd) r3
            java.lang.Object r0 = r4.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r5.creativeModel
            int r0 = X.C1660530tJT.LJFF(r2, r3, r0)
            r1.defaultCameraSpec = r0
        L4c:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            int r0 = r0.defaultCameraSpec
            return r0
        L51:
            boolean r0 = r5.LJJJ()
            if (r0 != 0) goto L23
            X.0nk1 r0 = X.C1446350nk1.LIZ
            r0.getClass()
            boolean r0 = X.C1446350nk1.LIZJ(r5)
            if (r0 == 0) goto L7a
            X.0swI r1 = X.EnumC1647570syZ.Companion
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0MlZ r0 = r0.LJJJJJ()
            java.lang.String r0 = r0.getDefaultShootTabTag(r5)
            r1.getClass()
            boolean r0 = X.C1646160swI.LIZIZ(r0)
            if (r0 == 0) goto L7a
            goto L23
        L7a:
            boolean r0 = LJIIJJI(r5)
            if (r0 == 0) goto L90
            X.0nnd r1 = X.EnumC1448590nnd.RATIO_1_1
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r5.cameraComponentModel
            boolean r0 = r0.enableRecordingMp4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r1, r0)
            goto L34
        L90:
            X.0nnd r1 = X.EnumC1448590nnd.RATIO_9_16
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r5.cameraComponentModel
            boolean r0 = r0.enableRecordingMp4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r1, r0)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.d4.LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):int");
    }

    public static final boolean LJ(ShortVideoContext shortVideoContext) {
        return C1697810uHb.LJIIJJI(15, 20, 24, 17, 23, 29, 16).contains(Integer.valueOf(shortVideoContext.shootMode));
    }

    public static final boolean LJFF(ShortVideoContext shortVideoContext) {
        RetakeVideoContext retakeVideoContextLJIIZILJ;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        if (!cameraComponentModel.isEditorProRecordMode || !cameraComponentModel.isRetakeMode || (retakeVideoContextLJIIZILJ = shortVideoContext.LJIIZILJ()) == null || retakeVideoContextLJIIZILJ.isRetakeOriginUploadSource) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(ShortVideoContext shortVideoContext) {
        if (Intrinsics.LJFF(shortVideoContext.creativeModel.stickerModel.isQADraft, Boolean.TRUE)) {
            return false;
        }
        if (!shortVideoContext.creativeModel.stickerModel.addYoursStickerModels.isEmpty()) {
            return true;
        }
        if (shortVideoContext.LJJJJZ() || shortVideoContext.LJJJ() || C0CHQ.LIZ().getAccountService().LIZ() || !C304900BxI.LIZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(ShortVideoContext shortVideoContext) {
        return !shortVideoContext.creativeModel.stickerModel.commentStickerModels.isEmpty();
    }

    public static final int LJIIIIZZ(ShortVideoContext shortVideoContext) {
        DuetContext duetContext;
        if (shortVideoContext.LJJLL() && (duetContext = shortVideoContext.cameraComponentModel.duetContext) != null && Intrinsics.LJFF(duetContext.duetLayoutMode, "horizontal")) {
            return shortVideoContext.cameraComponentModel.mVideoHeight / 2;
        }
        return shortVideoContext.cameraComponentModel.mVideoHeight;
    }

    public static final boolean LJIIIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.shootMode == 27) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJ(ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (!creativeModel.initialModel.dmCameraModel.enterFromDM && !creativeModel.storyModel.isSocialCameraEntrance()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(ShortVideoContext shortVideoContext) {
        DMCameraModel dMCameraModel = shortVideoContext.creativeModel.initialModel.dmCameraModel;
        if (!dMCameraModel.enablePhotoSwap || !a0.LJJJIL(dMCameraModel.effectName)) {
            return false;
        }
        if (!Intrinsics.LJFF("photoswap_reply_message", dMCameraModel.enterMethodType) && !Intrinsics.LJFF("photoswap_reply_reveal", dMCameraModel.enterMethodType) && !Intrinsics.LJFF("photoswap_action_bar", dMCameraModel.enterMethodType) && !Intrinsics.LJFF("photoswap_chat_page_inline", dMCameraModel.enterMethodType) && !Intrinsics.LJFF("photoswap_inbox_cell_icon", dMCameraModel.enterMethodType)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(ShortVideoContext shortVideoContext) {
        return shortVideoContext.cameraComponentModel.editorProRecordUsedForPip;
    }

    public static final boolean LJIILIIL(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.mIsFromDraft) {
            int i = shortVideoContext.shootMode;
            if (i == 20 || i == 23 || i == 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIILJJIL(ShortVideoContext shortVideoContext) {
        String str;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "now") || (shortVideoContext != null && shortVideoContext.shootMode == 16)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(ShortVideoContext shortVideoContext) {
        Integer fromAwemeType;
        Integer[] numArr = {150, 152, 61};
        ShootExtraData shootExtraData = shortVideoContext.creativeFlowData.getShootExtraData();
        if (shootExtraData != null) {
            fromAwemeType = shootExtraData.getFromAwemeType();
        } else {
            fromAwemeType = null;
        }
        if (C13LQ.LJJIJIIJI(fromAwemeType, numArr) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(ShortVideoContext shortVideoContext) {
        if (!Intrinsics.LJFF(shortVideoContext.shootWay, "profile_photo") && !Intrinsics.LJFF(shortVideoContext.shootWay, "social_avatar")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(ShortVideoContext shortVideoContext) {
        String str;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "story")) {
            if (!shortVideoContext.creativeModel.commonMobModel.isUploadDirectEnter) {
            }
            return true;
        }
        if (shortVideoContext == null) {
            return false;
        }
        if (shortVideoContext.shootMode == 20 || shortVideoContext.shootMode == 23 || shortVideoContext.shootMode == 29 || LIZJ(shortVideoContext)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(ShortVideoContext shortVideoContext) {
        String str;
        String str2 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "photo_2023_eoy")) {
            if (shortVideoContext != null) {
                str2 = shortVideoContext.shootWay;
            }
            if (!Intrinsics.LJFF(str2, "evergreen")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJIJI(ShortVideoContext shortVideoContext) {
        String str;
        String str2 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "educate_phase_iii")) {
            if (shortVideoContext != null) {
                str2 = shortVideoContext.shootWay;
            }
            if (!Intrinsics.LJFF(str2, "educate_phase_iii_feedback")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJIJJ(ShortVideoContext shortVideoContext) {
        return C1697810uHb.LJIIJJI(15, 24, 20, 23, 29, 17, 16).contains(Integer.valueOf(shortVideoContext.shootMode));
    }

    public static final boolean LJIJJLI(ShortVideoContext shortVideoContext) {
        String str = shortVideoContext.enterMethod;
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "click_publish_card_plus") && !Intrinsics.LJFF(shortVideoContext.enterMethod, "click_publish_card_create_new_story") && !Intrinsics.LJFF(shortVideoContext.enterMethod, "click_view_lists_panel_camera_icon") && !Intrinsics.LJFF(shortVideoContext.enterMethod, "click_view_lists_panel_profile_plus") && !Intrinsics.LJFF(shortVideoContext.enterMethod, "click_view_lists_panel_camera_button")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(ShortVideoContext shortVideoContext) {
        return shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM;
    }

    public static final boolean LJJ(ShortVideoContext shortVideoContext) {
        C1441190nbh c1441190nbhLJI;
        if (shortVideoContext != null) {
            c1441190nbhLJI = shortVideoContext.LJI();
        } else {
            c1441190nbhLJI = null;
        }
        if (c1441190nbhLJI == null) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it2 = shortVideoContext.LJI().iterator();
        while (it2.hasNext()) {
            if (it2.next().isAudioGraphOutput()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJI(ShortVideoContext shortVideoContext) {
        C1441190nbh c1441190nbhLJI;
        if (shortVideoContext != null) {
            c1441190nbhLJI = shortVideoContext.LJI();
        } else {
            c1441190nbhLJI = null;
        }
        if (c1441190nbhLJI == null) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it2 = shortVideoContext.LJI().iterator();
        while (it2.hasNext()) {
            if (RecordStickerSegmentInfoKt.isUseVoiceRecognizeSticker(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIFFI(ShortVideoContext shortVideoContext) {
        ApplyRecordEffectInfo applyRecordEffectInfoLIZLLL;
        if (!C524930KiJ.LIZJ() || (applyRecordEffectInfoLIZLLL = shortVideoContext.LIZLLL()) == null || !applyRecordEffectInfoLIZLLL.isSupportApplyInUploadMedia) {
            return false;
        }
        return true;
    }

    public static final boolean LJJII(ShortVideoContext shortVideoContext) {
        int i = shortVideoContext.shootMode;
        if (i != 20 && i != 23 && i != 29) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIII(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.shootMode == 26) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJ(ShortVideoContext shortVideoContext) {
        if (C539900LFk.LJII(shortVideoContext)) {
            return true;
        }
        return ((Boolean) C267880Aeg.LIZ.getValue()).booleanValue();
    }

    public static final boolean LJJIIZ(ShortVideoContext shortVideoContext) {
        if ((LJIILIIL(shortVideoContext) || (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() && a.LIZ())) && !shortVideoContext.LJJLL() && !shortVideoContext.LJJJJLL() && shortVideoContext.shootMode != 15) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZI(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return false;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI("stitch", "duet", "chat_shoot", "ugc_template", "pugc_template", "autocut_anchor", "tt_template_anchor");
        if (!((HDRCameraConfig) C2256211DSp.LJIILLIIL.getValue()).enable || C13LP.LJJJJ(shortVideoContext.shootWay, listLJIIJJI)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return false;
        }
        if (!shortVideoContext.LJJLL() && ((!shortVideoContext.LJJJJLL() || !C1443960ngA.LJIIJJI(shortVideoContext.stitchContext.stitchParams)) && shortVideoContext.cameraComponentModel.recordMode != 1)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJI(ShortVideoContext shortVideoContext) {
        boolean z = false;
        if (shortVideoContext == null) {
            return false;
        }
        if (C306040Bz8.LIZ() && C306040Bz8.LIZ() && C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ() && !shortVideoContext.cameraComponentModel.isRetakeMode && (Intrinsics.LJFF(shortVideoContext.shootWay, "direct_shoot") || Intrinsics.LJFF(shortVideoContext.shootWay, "single_song") || Intrinsics.LJFF(shortVideoContext.shootWay, "prop_page") || Intrinsics.LJFF(shortVideoContext.shootWay, "anchor_combine_voice_conversion") || Intrinsics.LJFF(shortVideoContext.shootWay, "anchor_combine_prop") || Intrinsics.LJFF(shortVideoContext.shootWay, "vc_page") || Intrinsics.LJFF(shortVideoContext.shootWay, "followup_square") || Intrinsics.LJFF(shortVideoContext.shootWay, "filter_anchor"))) {
            z = true;
        }
        shortVideoContext.getMusicPath();
        return z;
    }

    public static final void LJJIIJZLJL(boolean z, ShortVideoContext shortVideoContext) {
        shortVideoContext.cameraComponentModel.editorProRecordEnableMusic = z;
    }
}
