package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0L4U;
import X.C0LAB;
import X.C0MNQ;
import X.C0MNR;
import X.C0MNS;
import X.C13LP;
import X.C1458370o3P;
import X.C1687150u0P;
import X.C2488309p3;
import X.C373801cm;
import X.C536350L1t;
import X.C545510LaP;
import X.C547150Ld3;
import X.C550580Lia;
import X.C551030LjJ;
import X.C551080LjO;
import X.C556460Ls4;
import X.C572370Mcd;
import X.C572410Mch;
import X.C572490Mcp;
import X.C572500Mcq;
import X.C578810Mn1;
import X.EnumC550780Liu;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.aigc.quality.trace.TraceErrorContext;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.RecordPresetResourceState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.texttoimage.ICommentInlineBannerReadyListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS122S1100000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        UrlModel cover;
        List<String> urlList;
        C0MNQ c0mnq = (C0MNQ) obj;
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(5);
        c0mnq.getClass();
        C0MNR c0mnr = new C0MNR(0);
        aFwS239S0000000_8.invoke(c0mnr);
        c0mnq.LIZ = c0mnr;
        Video video = ((Aweme) awS122S1100000_8.l1).getVideo();
        if (video != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
            C13LP.LJJJLL(urlList);
        }
        c0mnq.LIZJ = new C0MNS(112, awS122S1100000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(awS122S1100000_8.s0, ((Function1) awS122S1100000_8.l1).invoke(((AwemeDraft) obj).LIZ)));
    }

    public static final Object invoke$10(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        String str = awS122S1100000_8.s0;
        c1687150u0P.getClass();
        C1687150u0P.LIZIZ(c0lab, str, null, null);
        C1687150u0P.LIZ(c0lab, "custom_style", (EnumC550780Liu) awS122S1100000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        String str = awS122S1100000_8.s0;
        c1687150u0P.getClass();
        C1687150u0P.LIZIZ(c0lab, str, null, null);
        C1687150u0P.LIZ(c0lab, "custom_style", (EnumC550780Liu) awS122S1100000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        String str = awS122S1100000_8.s0;
        c1687150u0P.getClass();
        C1687150u0P.LIZIZ(c0lab, str, null, null);
        C1687150u0P.LIZ(c0lab, "manage_cameo", (EnumC550780Liu) awS122S1100000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        String str = awS122S1100000_8.s0;
        c1687150u0P.getClass();
        C1687150u0P.LIZIZ(c0lab, str, null, null);
        C1687150u0P.LIZ(c0lab, "manage_cameo", (EnumC550780Liu) awS122S1100000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C2488309p3 c2488309p3;
        List list = (List) obj;
        if (((C536350L1t) awS122S1100000_8.l1).LIZJ()) {
            s.LIZ.getClass();
            if (!s.LJJIJIL() && (c2488309p3 = (C2488309p3) ((C536350L1t) awS122S1100000_8.l1).LJFF.getValue()) != null) {
                c2488309p3.LIZ(((C536350L1t) awS122S1100000_8.l1).LJIIIIZZ);
            }
        }
        C536350L1t c536350L1t = (C536350L1t) awS122S1100000_8.l1;
        C0L4U.LJIIJ(list, c536350L1t.LJII, awS122S1100000_8.s0, c536350L1t.LIZIZ.getDiContainer(), ((C536350L1t) awS122S1100000_8.l1).LIZIZ.LLJJIJIIJIL(), true, null, true, null, 320);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C373801cm.LIZIZ(awS122S1100000_8.s0);
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        String str = awS122S1100000_8.s0;
        ShortVideoContext shortVideoContextLJFF = ((C578810Mn1) awS122S1100000_8.l1).LJFF();
        c1458370o3P.getClass();
        C1458370o3P.LJJIIZI(str, shortVideoContextLJFF, true, true);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        ((ConcurrentHashMap) ((C556460Ls4) awS122S1100000_8.l1).LJ).remove(awS122S1100000_8.s0);
        ((C556460Ls4) awS122S1100000_8.l1).LIZLLL(awS122S1100000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C551030LjJ.LIZJ((C551080LjO) obj, (C545510LaP) awS122S1100000_8.l1, awS122S1100000_8.s0, AFwS239S0000000_8.get$arr$(329));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        ((TTVideoEngine) awS122S1100000_8.l1).setSurface((Surface) obj);
        ((TTVideoEngine) awS122S1100000_8.l1).LJIJI(awS122S1100000_8.s0);
        ((TTVideoEngine) awS122S1100000_8.l1).play();
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C373801cm.LIZIZ(awS122S1100000_8.s0);
        Function1 function1 = (Function1) awS122S1100000_8.l1;
        if (function1 != null) {
            function1.invoke(awS122S1100000_8.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        String strLIZIZ;
        TraceErrorContext traceErrorContext = (TraceErrorContext) obj;
        traceErrorContext.errorMessage = awS122S1100000_8.s0;
        Throwable th = (Throwable) awS122S1100000_8.l1;
        if (th != null) {
            strLIZIZ = C547150Ld3.LIZIZ(th);
        } else {
            strLIZIZ = null;
        }
        traceErrorContext.errorDetailedMessage = strLIZIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.getPreviewNextBtnState().copy(awS122S1100000_8.s0, ((C013C) awS122S1100000_8.l1).element), chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$4(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.getLastPreMusicState().copy((MusicModel) awS122S1100000_8.l1, awS122S1100000_8.s0), chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$5(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.getPreMusicState().copy((MusicModel) awS122S1100000_8.l1, awS122S1100000_8.s0), chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$6(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, new RecordPresetResourceState((AVMusic) awS122S1100000_8.l1, awS122S1100000_8.s0), chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, chooseMediaState.tabCurrentItemType, chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$7(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C572410Mch c572410Mch = (C572410Mch) obj;
        C572500Mcq c572500Mcq = new C572500Mcq(c572410Mch, (C572370Mcd) awS122S1100000_8.l1);
        C572490Mcp.LIZIZ.put(awS122S1100000_8.s0, c572500Mcq);
        C572490Mcp.LIZJ.remove(awS122S1100000_8.s0);
        CopyOnWriteArrayList<ICommentInlineBannerReadyListener> copyOnWriteArrayList = C572490Mcp.LIZLLL.get(awS122S1100000_8.s0);
        if (copyOnWriteArrayList != null) {
            String str = awS122S1100000_8.s0;
            Iterator<ICommentInlineBannerReadyListener> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onReady(str, c572410Mch.LIZ, c572500Mcq);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        String str = awS122S1100000_8.s0;
        c1687150u0P.getClass();
        C1687150u0P.LIZIZ(c0lab, str, null, null);
        C1687150u0P.LIZ(c0lab, "create_cameo", (EnumC550780Liu) awS122S1100000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS122S1100000_8 awS122S1100000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        String str = awS122S1100000_8.s0;
        c1687150u0P.getClass();
        C1687150u0P.LIZIZ(c0lab, str, null, null);
        C1687150u0P.LIZ(c0lab, "create_cameo", (EnumC550780Liu) awS122S1100000_8.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(C536350L1t c536350L1t, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c536350L1t;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S1100000_8(C545510LaP c545510LaP, C545510LaP<C550580Lia<Object>> c545510LaP2, String str) {
        super(1);
        this.$t = str;
        this.l1 = c545510LaP;
        this.s0 = c545510LaP2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(C556460Ls4 c556460Ls4, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c556460Ls4;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(C572370Mcd c572370Mcd, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c572370Mcd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(AVMusic aVMusic, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aVMusic;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(Aweme aweme, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(MusicModel musicModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = musicModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(TTVideoEngine tTVideoEngine, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = tTVideoEngine;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(String str, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(String str, EnumC550780Liu enumC550780Liu, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = enumC550780Liu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(String str, C578810Mn1 c578810Mn1, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c578810Mn1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S1100000_8(String str, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS122S1100000_8(String str, String str2, Function1<? super CreativeModel, String> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
    }
}
