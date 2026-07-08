package kotlin.jvm.internal;

import X.C06W2;
import X.C09AY;
import X.C1023640ckE;
import X.C1202330hOR;
import X.C1D2Q;
import X.C1ETD;
import X.C2249261D1w;
import X.C291001Au;
import X.C436440H9m;
import X.C529140Kp6;
import X.C895630ZBp;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerState;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS46S0001000_35 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1003i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0001000_35(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f1003i0 = i;
    }

    public static final Object invoke$0(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        FTCEditCornerState fTCEditCornerState = (FTCEditCornerState) obj;
        return fTCEditCornerState.copy(fTCEditCornerState.cornerVisible, fTCEditCornerState.topMargin, Integer.valueOf(awS46S0001000_35.f1003i0), fTCEditCornerState.ui);
    }

    public static final Object invoke$1(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        FTCEditCornerState fTCEditCornerState = (FTCEditCornerState) obj;
        return fTCEditCornerState.copy(fTCEditCornerState.cornerVisible, Integer.valueOf(awS46S0001000_35.f1003i0), fTCEditCornerState.bottomMargin, fTCEditCornerState.ui);
    }

    public static final Object invoke$10(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        int i;
        C1202330hOR c1202330hORLJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c1202330hORLJ = iMFoundationBridgeApiLIZ.LJ((i = awS46S0001000_35.f1003i0), i)) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c1202330hORLJ, 175));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(c1etd.getVisible(), c1etd.getEnable(), c1etd.LIZJ(), awS46S0001000_35.f1003i0, c1etd.LJFF());
    }

    public static final Object invoke$12(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(c1etd.getVisible(), c1etd.getEnable(), c1etd.LIZJ(), awS46S0001000_35.f1003i0, c1etd.LJFF());
    }

    public static final Object invoke$13(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        C2249261D1w.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C2249261D1w.LIZLLL, Integer.valueOf(awS46S0001000_35.f1003i0));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, new C291001Au<>(Integer.valueOf(awS46S0001000_35.f1003i0)), profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$15(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, awS46S0001000_35.f1003i0, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$16(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, Integer.valueOf(awS46S0001000_35.f1003i0), profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$17(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        C1D2Q.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1D2Q.LIZIZ, Integer.valueOf(awS46S0001000_35.f1003i0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        FTCEditMusicCutState fTCEditMusicCutState = (FTCEditMusicCutState) obj;
        return fTCEditMusicCutState.copy(fTCEditMusicCutState.musicWaveData, Integer.valueOf(awS46S0001000_35.f1003i0), fTCEditMusicCutState.ui);
    }

    public static final Object invoke$3(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, fTCEditToolbarState.backVisible, fTCEditToolbarState.backTipVisible, fTCEditToolbarState.backTipText, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, fTCEditToolbarState.hideMoreEvent, fTCEditToolbarState.chooseMusicText, fTCEditToolbarState.chooseMusicIcon, fTCEditToolbarState.topMargin, Integer.valueOf(awS46S0001000_35.f1003i0), fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public static final Object invoke$4(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, fTCEditToolbarState.backVisible, fTCEditToolbarState.backTipVisible, fTCEditToolbarState.backTipText, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, fTCEditToolbarState.hideMoreEvent, fTCEditToolbarState.chooseMusicText, fTCEditToolbarState.chooseMusicIcon, fTCEditToolbarState.topMargin, fTCEditToolbarState.bottomHeight, Integer.valueOf(awS46S0001000_35.f1003i0));
    }

    public static final Object invoke$5(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, fTCEditToolbarState.backVisible, fTCEditToolbarState.backTipVisible, fTCEditToolbarState.backTipText, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, fTCEditToolbarState.hideMoreEvent, fTCEditToolbarState.chooseMusicText, fTCEditToolbarState.chooseMusicIcon, Integer.valueOf(awS46S0001000_35.f1003i0), fTCEditToolbarState.bottomHeight, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public static final Object invoke$6(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, new C529140Kp6(awS46S0001000_35.f1003i0), editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$7(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        return C436440H9m.LIZ((C436440H9m) obj, false, awS46S0001000_35.f1003i0, 5);
    }

    public static final Object invoke$8(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, Integer.valueOf(awS46S0001000_35.f1003i0), editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }

    public static final Object invoke$9(AwS46S0001000_35 awS46S0001000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, Integer.valueOf(awS46S0001000_35.f1003i0), editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }
}
