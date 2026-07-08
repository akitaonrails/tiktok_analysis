package kotlin.jvm.internal;

import X.AbstractC577050MkB;
import X.AnonymousClass0956;
import X.C09AY;
import X.C0L7R;
import X.C0LAB;
import X.C13LP;
import X.C354610DvH;
import X.C357450Dzr;
import X.C375830EoP;
import X.C420150Gdh;
import X.C527340KmC;
import X.C528640KoI;
import X.C554160LoM;
import X.C577140MkK;
import X.C577440Mko;
import X.C577450Mkp;
import X.C577460Mkq;
import X.C577500Mku;
import X.C844470XAv;
import X.EnumC1651770t5L;
import X.InterfaceC2357009Lk;
import X.InterfaceC577590Ml3;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.tts.oecverify.BdTuring;
import iyl.i3;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS96S0110000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(C0L7R c0l7r, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0l7r;
        this.z1 = false;
    }

    public static final Object invoke$0(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        AVMusic aVMusic = (AVMusic) obj;
        if (awS96S0110000_8.z1) {
            aVMusic = (AVMusic) awS96S0110000_8.l0;
            if (aVMusic == null) {
                return null;
            }
        } else if (aVMusic == null) {
            return null;
        }
        return aVMusic.getMusicId();
    }

    public static final Object invoke$1(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        List list;
        C554160LoM c554160LoM = (C554160LoM) obj;
        if (awS96S0110000_8.z1) {
            list = null;
        } else {
            list = (List) awS96S0110000_8.l0;
        }
        return C554160LoM.LIZ(c554160LoM, list, null, 2);
    }

    public static final Object invoke$10(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C527340KmC c527340KmC = C527340KmC.LIZ;
        int i = ((VideoImageMixedController) awS96S0110000_8.l0).LLILZIL;
        boolean z = awS96S0110000_8.z1;
        c527340KmC.getClass();
        if (C527340KmC.LIZIZ(i, z)) {
            VideoImageMixedController videoImageMixedController = (VideoImageMixedController) awS96S0110000_8.l0;
            if (!zBooleanValue) {
                videoImageMixedController.LJLJJLL(false, false);
            }
            videoImageMixedController.LLJILJILJ.invoke(Boolean.valueOf(zBooleanValue));
            videoImageMixedController.LJJIIJ(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C527340KmC c527340KmC = C527340KmC.LIZ;
        int i = ((VideoImageMixedController) awS96S0110000_8.l0).LLILZIL;
        boolean z = awS96S0110000_8.z1;
        c527340KmC.getClass();
        if (C527340KmC.LIZIZ(i, z)) {
            VideoImageMixedController videoImageMixedController = (VideoImageMixedController) awS96S0110000_8.l0;
            if (!zBooleanValue) {
                videoImageMixedController.LJLJJLL(false, false);
            }
            videoImageMixedController.LLJILJILJ.invoke(Boolean.valueOf(zBooleanValue));
            videoImageMixedController.LJJIIJ(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        Text2ImageGenerator text2ImageGenerator = (Text2ImageGenerator) awS96S0110000_8.l0;
        boolean z = awS96S0110000_8.z1;
        text2ImageGenerator.getClass();
        if (z) {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getString(2131821416, obj);
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getString(2131824810, obj);
    }

    public static final Object invoke$13(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LIZ(awS96S0110000_8.z1 ? 1 : 0, "result");
        if (!awS96S0110000_8.z1) {
            c0lab.LJ("result_code", String.valueOf(((AITheaterGenerationModel) awS96S0110000_8.l0).getErrorCode()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        return C577460Mkq.LIZ((C577460Mkq) obj, new C375830EoP(new Pair((View) awS96S0110000_8.l0, Boolean.valueOf(awS96S0110000_8.z1))), null, null, false, 29);
    }

    public static final Object invoke$15(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        i3 i3Var = (i3) obj;
        if (awS96S0110000_8.z1) {
            C420150Gdh c420150GdhLIZLLL = C577500Mku.LIZLLL((AbstractC577050MkB) awS96S0110000_8.l0);
            int i = c420150GdhLIZLLL.LIZ;
            float f = c420150GdhLIZLLL.LIZIZ;
            C577140MkK c577140MkK = C577440Mko.LLJI;
            AbstractC577050MkB abstractC577050MkB = (AbstractC577050MkB) awS96S0110000_8.l0;
            c577140MkK.getClass();
            return i3.LJIIIZ(i3Var, i, 0, 0, null, 0, true, false, false, false, false, C577140MkK.LIZ(abstractC577050MkB), null, 0, null, null, null, false, null, false, f, null, 201324478);
        }
        C420150Gdh c420150GdhLIZLLL2 = C577500Mku.LIZLLL(null);
        int i2 = c420150GdhLIZLLL2.LIZ;
        float f2 = c420150GdhLIZLLL2.LIZIZ;
        C577440Mko.LLJI.getClass();
        return i3.LJIIIZ(i3Var, i2, 0, 0, null, 0, false, false, false, false, false, C577140MkK.LIZ(null), null, 0, null, null, null, false, null, false, f2, null, 201324478);
    }

    public static final Object invoke$16(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        InterfaceC577590Ml3 interfaceC577590Ml3 = (InterfaceC577590Ml3) obj;
        boolean z = !awS96S0110000_8.z1;
        if (((C577450Mkp) awS96S0110000_8.l0).LLJJI.shootMode == 16) {
            interfaceC577590Ml3.LIZ(EnumC1651770t5L.CHANGE_RATIO, new AwS47S0010000_35(z, 24));
        } else {
            interfaceC577590Ml3.LIZ(EnumC1651770t5L.VOICE_CHANGE, new AwS47S0010000_35(z, 24));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        ((C0L7R) awS96S0110000_8.l0).LJIIJJI();
        C0L7R c0l7r = (C0L7R) awS96S0110000_8.l0;
        boolean z = awS96S0110000_8.z1;
        c0l7r.getClass();
        c0l7r.LJJIZ("click", null, null);
        C0L7R.LJJIL(c0l7r, 3, null, z, false, false, false, false, -1, 122);
        AnonymousClass0956 anonymousClass0956 = c0l7r.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C354610DvH c354610DvH = c0l7r.LJIJJLI;
        if (c354610DvH != null) {
            c354610DvH.cancel();
        }
        C357450Dzr c357450Dzr = c0l7r.LJIL;
        if (c357450Dzr != null) {
            c357450Dzr.cancel();
        }
        InterfaceC2357009Lk interfaceC2357009Lk = c0l7r.LJIIIIZZ;
        if (interfaceC2357009Lk != null) {
            interfaceC2357009Lk.destroy();
        }
        c0l7r.LJIJJLI().removeCallbacksAndMessages(null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, new C528640KoI(C13LP.LLIIII(((ChooseMediaViewModel) awS96S0110000_8.l0).LLJIJIL), awS96S0110000_8.z1), chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$4(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, new C528640KoI((List) awS96S0110000_8.l0, awS96S0110000_8.z1), chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$5(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, new C528640KoI((List) awS96S0110000_8.l0, awS96S0110000_8.z1), chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$6(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, new C528640KoI((List) awS96S0110000_8.l0, awS96S0110000_8.z1), chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS96S0110000_8 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS96S0110000_8.invoke$7(kotlin.jvm.internal.AwS96S0110000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, new C528640KoI((List) awS96S0110000_8.l0, awS96S0110000_8.z1), chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$9(AwS96S0110000_8 awS96S0110000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, new C528640KoI(C13LP.LLIIII(((ChooseMediaViewModel) awS96S0110000_8.l0).LLJILJIL), awS96S0110000_8.z1), chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(AbstractC577050MkB abstractC577050MkB, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = abstractC577050MkB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(View view, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(AVMusic aVMusic, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = aVMusic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(ChooseMediaViewModel chooseMediaViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = chooseMediaViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(MvChoosePhotoScene mvChoosePhotoScene, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = mvChoosePhotoScene;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(VideoImageMixedController videoImageMixedController, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoImageMixedController;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(Text2ImageGenerator text2ImageGenerator, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = text2ImageGenerator;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS96S0110000_8(List list, List<TikTokMediaModel> list2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(boolean z, C577450Mkp c577450Mkp, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c577450Mkp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS96S0110000_8(boolean z, AITheaterGenerationModel aITheaterGenerationModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = aITheaterGenerationModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS96S0110000_8(boolean z, boolean z2, List<MentionDataItem> list) {
        super(1);
        this.$t = list;
        this.z1 = z;
        this.l0 = z2;
    }
}
