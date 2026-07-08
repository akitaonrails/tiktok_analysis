package kotlin.jvm.internal;

import X.C09AY;
import X.C0HWW;
import X.C543670LTx;
import X.C551480Lk2;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS3S1010000_8 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S1010000_8 awS3S1010000_8, Object obj) {
        return C551480Lk2.LIZ((C551480Lk2) obj, null, null, awS3S1010000_8.s0, awS3S1010000_8.z1, false, 39);
    }

    public static final Object invoke$1(AwS3S1010000_8 awS3S1010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.getPreviewAutoCutBtnState().copy(awS3S1010000_8.s0, awS3S1010000_8.z1), chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$2(AwS3S1010000_8 awS3S1010000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.getPreviewEditProBtnState().copy(awS3S1010000_8.s0, awS3S1010000_8.z1), chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$3(AwS3S1010000_8 awS3S1010000_8, Object obj) {
        C543670LTx c543670LTx = (C543670LTx) obj;
        c543670LTx.LIZLLL("process_tag", awS3S1010000_8.s0);
        C0HWW c0hww = C0HWW.LIZ;
        boolean z = awS3S1010000_8.z1;
        c0hww.getClass();
        c543670LTx.LIZIZ(Integer.valueOf(z ? 1 : 0), "with_mix_editing");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS3S1010000_8 awS3S1010000_8, Object obj) {
        C543670LTx c543670LTx = (C543670LTx) obj;
        c543670LTx.LIZLLL("process_tag", awS3S1010000_8.s0);
        C0HWW c0hww = C0HWW.LIZ;
        boolean z = awS3S1010000_8.z1;
        c0hww.getClass();
        c543670LTx.LIZIZ(Integer.valueOf(z ? 1 : 0), "with_mix_editing");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1010000_8(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
