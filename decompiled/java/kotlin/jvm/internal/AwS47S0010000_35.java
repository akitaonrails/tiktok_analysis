package kotlin.jvm.internal;

import X.C09AY;
import X.C1275204ys;
import X.C1890107al;
import X.C1ETD;
import X.C291001Au;
import X.C529130Kp5;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaPdpSkcPanelHeaderState;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.vesdk.VECameraSettings;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS47S0010000_35 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS47S0010000_35(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 30: goto Ld;
                case 31: goto L5;
                case 32: goto L5;
                case 33: goto Ld;
                default: goto L5;
            }
        L5:
            r1 = r2
            r0 = 1
            r1.z0 = r0
        L9:
            r1.<init>(r0)
            return
        Ld:
            r1 = r2
            r0 = 0
            r1.z0 = r0
            r0 = 1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS47S0010000_35.<init>(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0010000_35(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, awS47S0010000_35.z0, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$1(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        FTCEditCornerState fTCEditCornerState = (FTCEditCornerState) obj;
        return fTCEditCornerState.copy(Boolean.valueOf(awS47S0010000_35.z0), fTCEditCornerState.topMargin, fTCEditCornerState.bottomMargin, fTCEditCornerState.ui);
    }

    public static final Object invoke$10(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, new C529130Kp5(awS47S0010000_35.z0), editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$11(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, new C529130Kp5(awS47S0010000_35.z0), editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$12(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, new C529130Kp5(awS47S0010000_35.z0));
    }

    public static final Object invoke$13(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        boolean z = awS47S0010000_35.z0;
        obj.getClass();
        return new C1275204ys(z);
    }

    public static final Object invoke$14(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        return C1890107al.LIZ((C1890107al) obj, false, false, Boolean.valueOf(awS47S0010000_35.z0), null, 11);
    }

    public static final Object invoke$15(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        return C1890107al.LIZ((C1890107al) obj, false, awS47S0010000_35.z0, null, null, 13);
    }

    public static final Object invoke$16(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        return C1890107al.LIZ((C1890107al) obj, awS47S0010000_35.z0, false, null, null, 14);
    }

    public static final Object invoke$17(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, Boolean.valueOf(awS47S0010000_35.z0), profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$18(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ((VECameraSettings.Builder) obj).setCameraAntiShake(awS47S0010000_35.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(c1etd.getVisible(), c1etd.getEnable(), awS47S0010000_35.z0, c1etd.LJI(), c1etd.LJFF());
    }

    public static final Object invoke$2(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        FTCEditStickerState fTCEditStickerState = (FTCEditStickerState) obj;
        return fTCEditStickerState.copy(fTCEditStickerState.ui, fTCEditStickerState.pollTextAnimEvent, fTCEditStickerState.pollTextLayoutEvent, new C529130Kp5(awS47S0010000_35.z0), fTCEditStickerState.videoLengthUpdateEvent, fTCEditStickerState.refreshVideoSource, fTCEditStickerState.updateStickerTime);
    }

    public static final Object invoke$20(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(c1etd.getVisible(), c1etd.getEnable(), awS47S0010000_35.z0, c1etd.LJI(), c1etd.LJFF());
    }

    public static final Object invoke$21(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(awS47S0010000_35.z0, c1etd.getEnable(), c1etd.LIZJ(), c1etd.LJI(), c1etd.LJFF());
    }

    public static final Object invoke$22(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(awS47S0010000_35.z0, c1etd.getEnable(), c1etd.LIZJ(), c1etd.LJI(), c1etd.LJFF());
    }

    public static final Object invoke$23(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(c1etd.getVisible(), awS47S0010000_35.z0, c1etd.LIZJ(), c1etd.LJI(), c1etd.LJFF());
    }

    public static final Object invoke$24(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        C1ETD c1etd = (C1ETD) obj;
        return c1etd.LJII(c1etd.getVisible(), awS47S0010000_35.z0, c1etd.LIZJ(), c1etd.LJI(), c1etd.LJFF());
    }

    public static final Object invoke$25(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, Boolean.valueOf(awS47S0010000_35.z0), myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$26(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, new C291001Au<>(Boolean.valueOf(awS47S0010000_35.z0)), profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$27(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, awS47S0010000_35.z0);
    }

    public static final Object invoke$28(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, awS47S0010000_35.z0, profileState.isLocating);
    }

    public static final Object invoke$29(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, awS47S0010000_35.z0, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$3(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, fTCEditToolbarState.backVisible, Boolean.valueOf(awS47S0010000_35.z0), fTCEditToolbarState.backTipText, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, fTCEditToolbarState.hideMoreEvent, fTCEditToolbarState.chooseMusicText, fTCEditToolbarState.chooseMusicIcon, fTCEditToolbarState.topMargin, fTCEditToolbarState.bottomHeight, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public static final Object invoke$30(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, Boolean.valueOf(awS47S0010000_35.z0), profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$31(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, Boolean.valueOf(awS47S0010000_35.z0), profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$32(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, Boolean.valueOf(awS47S0010000_35.z0), profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$33(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, Boolean.valueOf(awS47S0010000_35.z0), profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$34(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, Boolean.valueOf(awS47S0010000_35.z0), profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$35(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        SeaPdpSkcPanelHeaderState seaPdpSkcPanelHeaderState = (SeaPdpSkcPanelHeaderState) obj;
        return seaPdpSkcPanelHeaderState.copy(seaPdpSkcPanelHeaderState.headerImgList, seaPdpSkcPanelHeaderState.seaPdpProductPriceData, seaPdpSkcPanelHeaderState.hidePriceTip, seaPdpSkcPanelHeaderState.promotionDealVO, awS47S0010000_35.z0);
    }

    public static final Object invoke$36(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, awS47S0010000_35.z0, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$37(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, awS47S0010000_35.z0, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$4(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, Boolean.valueOf(awS47S0010000_35.z0), fTCEditToolbarState.backTipVisible, fTCEditToolbarState.backTipText, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, fTCEditToolbarState.hideMoreEvent, fTCEditToolbarState.chooseMusicText, fTCEditToolbarState.chooseMusicIcon, fTCEditToolbarState.topMargin, fTCEditToolbarState.bottomHeight, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public static final Object invoke$5(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, new C529130Kp5(awS47S0010000_35.z0), editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$6(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, awS47S0010000_35.z0, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$7(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, new C529130Kp5(awS47S0010000_35.z0), editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$8(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, new C529130Kp5(awS47S0010000_35.z0), editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$9(AwS47S0010000_35 awS47S0010000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, new C529130Kp5(awS47S0010000_35.z0), editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }
}
