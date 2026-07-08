package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.C09AY;
import X.C0LCS;
import X.C0LFX;
import X.C1250300ido;
import X.C375830EoP;
import X.C529130Kp5;
import X.C530600KrS;
import X.C544870LYn;
import X.C555130Lpv;
import X.C557560Ltq;
import X.C560660Lyq;
import X.C576510MjJ;
import X.EnumC371580EhY;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AlbumToEditPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS23S0010000_8 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0010000_8(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0010000_8(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C560660Lyq.LIZ((C560660Lyq) obj, EnumC371580EhY.HIDE, awS23S0010000_8.z0, 0.0f, null, null, null, false, 124);
    }

    public static final Object invoke$1(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C555130Lpv.LIZ((C555130Lpv) obj, new C0LCS(Boolean.valueOf(awS23S0010000_8.z0)), null, null, 0, null, null, 510);
    }

    public static final Object invoke$10(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C0LFX.LIZ((C0LFX) obj, null, null, new C375830EoP(Boolean.valueOf(awS23S0010000_8.z0)), null, 11);
    }

    public static final Object invoke$11(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C576510MjJ.LIZ((C576510MjJ) obj, 0.0f, false, null, null, null, null, new C375830EoP(Boolean.valueOf(awS23S0010000_8.z0)), null, null, null, null, null, 4031);
    }

    public static final Object invoke$12(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C544870LYn.LIZ((C544870LYn) obj, null, null, null, null, new C375830EoP(Boolean.valueOf(awS23S0010000_8.z0)), null, null, null, null, null, null, null, null, null, false, false, null, null, 262127);
    }

    public static final Object invoke$13(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C557560Ltq.LIZ((C557560Ltq) obj, null, null, null, null, null, null, null, 0L, 0L, null, 0L, null, 0L, 0L, awS23S0010000_8.z0, 4194303);
    }

    public static final Object invoke$14(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        C1250300ido c1250300ido;
        AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) obj;
        if ((abstractC1250290idn instanceof C1250300ido) && (c1250300ido = (C1250300ido) abstractC1250290idn) != null) {
            c1250300ido.LJFF = awS23S0010000_8.z0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, new C529130Kp5(awS23S0010000_8.z0), chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$3(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, new AlbumToEditPageState(awS23S0010000_8.z0), chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$4(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, awS23S0010000_8.z0, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$5(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, awS23S0010000_8.z0, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$6(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, new C529130Kp5(awS23S0010000_8.z0), chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$7(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, new C529130Kp5(awS23S0010000_8.z0), chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$8(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C530600KrS.LIZ((C530600KrS) obj, null, null, null, null, null, null, new C375830EoP(Boolean.valueOf(awS23S0010000_8.z0)), 127);
    }

    public static final Object invoke$9(AwS23S0010000_8 awS23S0010000_8, Object obj) {
        return C530600KrS.LIZ((C530600KrS) obj, null, new C375830EoP(Boolean.valueOf(awS23S0010000_8.z0)), null, null, null, null, null, 253);
    }
}
