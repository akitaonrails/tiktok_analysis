package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C0LCS;
import X.C1023640ckE;
import X.C1071160dys;
import X.C1D25;
import X.C1D2I;
import X.C1DW6;
import X.C1ETD;
import X.C2249131D1j;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.router.monitor.page.ActivityRouter;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS85S1000000_35 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS85S1000000_35(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((ActivityRouter) obj).id, awS85S1000000_35.s0));
    }

    public static final Object invoke$1(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        if (awS85S1000000_35.s0 != null) {
            C1D2I.LIZ.getClass();
            c1023640ckE.withParam(C1D2I.LIZIZ, awS85S1000000_35.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(c1etd.getVisible(), c1etd.getEnable(), c1etd.LIZJ(), c1etd.LJI(), awS85S1000000_35.s0);
    }

    public static final Object invoke$11(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1D2I.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1D2I.LIZIZ, awS85S1000000_35.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        ((C1DW6) obj).ns(awS85S1000000_35.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1071160dys c1071160dys = (C1071160dys) obj;
        c1071160dys.LIZ = awS85S1000000_35.s0;
        c1071160dys.LIZIZ = "download";
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, awS85S1000000_35.s0, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$15(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1D25.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1D25.LIZIZ, awS85S1000000_35.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1D25.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1D25.LIZIZ, awS85S1000000_35.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C2249131D1j.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C2249131D1j.LJIIZILJ, awS85S1000000_35.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C2249131D1j.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C2249131D1j.LJIIZILJ, awS85S1000000_35.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1071160dys c1071160dys = (C1071160dys) obj;
        c1071160dys.LIZ = awS85S1000000_35.s0;
        c1071160dys.LIZIZ = "auto";
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LJ("scene_name", "create_video_no_yours");
        c0lab.LJ("entrance", "aime");
        String str = awS85S1000000_35.s0;
        if (str == null) {
            str = "2";
        }
        c0lab.LJ("text_type", str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LJ("scene_name", "create_video_no_yours");
        c0lab.LJ("entrance", "aime");
        String str = awS85S1000000_35.s0;
        if (str == null) {
            str = "2";
        }
        c0lab.LJ("text_type", str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, fTCEditToolbarState.backVisible, fTCEditToolbarState.backTipVisible, awS85S1000000_35.s0, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, fTCEditToolbarState.hideMoreEvent, fTCEditToolbarState.chooseMusicText, fTCEditToolbarState.chooseMusicIcon, fTCEditToolbarState.topMargin, fTCEditToolbarState.bottomHeight, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public static final Object invoke$5(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, fTCEditToolbarState.backVisible, fTCEditToolbarState.backTipVisible, fTCEditToolbarState.backTipText, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, fTCEditToolbarState.hideMoreEvent, awS85S1000000_35.s0, fTCEditToolbarState.chooseMusicIcon, fTCEditToolbarState.topMargin, fTCEditToolbarState.bottomHeight, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public static final Object invoke$6(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, new C0LCS<>(awS85S1000000_35.s0), editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$7(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, new C0LCS<>(awS85S1000000_35.s0), editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$8(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        C1071160dys c1071160dys = (C1071160dys) obj;
        c1071160dys.LIZ = awS85S1000000_35.s0;
        c1071160dys.LIZIZ = "download";
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS85S1000000_35 awS85S1000000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, awS85S1000000_35.s0, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }
}
