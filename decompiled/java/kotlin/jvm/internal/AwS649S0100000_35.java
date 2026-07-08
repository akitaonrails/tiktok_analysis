package kotlin.jvm.internal;

import X.AnonymousClass0473;
import X.C013C;
import X.C03MV;
import X.C03MY;
import X.C03XN;
import X.C09AY;
import X.C0H4N;
import X.C0JO2;
import X.C0S1I;
import X.C0Y3I;
import X.C11E9;
import X.C13LP;
import X.C1D80;
import X.C1EKA;
import X.C2258691Dat;
import X.C2258701Dau;
import X.C2262861Dhc;
import X.C2262981Dho;
import X.C2263001Dhq;
import X.C2263141Di4;
import X.C2263161Di6;
import X.C2274721E1u;
import X.C291001Au;
import X.C491160JNy;
import X.C556300Lro;
import X.C833103Nh;
import X.C833203Ni;
import X.C833303Nj;
import X.C869590Y9l;
import X.C896400ZEo;
import X.EnumC1608710rxt;
import X.InterfaceC1606880ruw;
import X.InterfaceC2262521Dh4;
import Y.ARunnableS104S0200000_35;
import Y.ARunnableS91S0200000_22;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.sea.view.SeaOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.us.view.UsOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SeaSkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc.SeaSkuPanelSkcHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.online.ui.SearchBaseOnlineAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.PhotoModeRelatedSearchUiAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionUiAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.swap.IPhotoSwapSendCallback;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public class AwS649S0100000_35 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(C0Y3I c0y3i, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0y3i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(C1D80 c1d80, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1d80;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(C2258691Dat c2258691Dat, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2258691Dat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(C2258701Dau c2258701Dau, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2258701Dau;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(InterfaceC2262521Dh4 interfaceC2262521Dh4, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC2262521Dh4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(C2274721E1u c2274721E1u, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2274721E1u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(SeaOspBottomWidget seaOspBottomWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = seaOspBottomWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(UsOspBottomWidget usOspBottomWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = usOspBottomWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(SeaSkuPanelSkcHeaderWidget seaSkuPanelSkcHeaderWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = seaSkuPanelSkcHeaderWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(PcsCourseVideoEditMainAssem pcsCourseVideoEditMainAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = pcsCourseVideoEditMainAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS649S0100000_35(SearchBaseOnlineAssem searchBaseOnlineAssem, SearchBaseOnlineAssem<ONLINE_REQUEST_STATE, RECEIVER> searchBaseOnlineAssem2) {
        super(2);
        this.$t = searchBaseOnlineAssem2;
        this.l0 = searchBaseOnlineAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(PhotoModeRelatedSearchUiAssem photoModeRelatedSearchUiAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = photoModeRelatedSearchUiAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(SearchRelatedSuggestionUiAssem searchRelatedSuggestionUiAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchRelatedSuggestionUiAssem;
    }

    public static final Object invoke$0(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((C1D80) awS649S0100000_35.l0).LJIIIZ.LJIIJ(obj, false, new C556300Lro(0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((SeaOspBottomWidget) awS649S0100000_35.l0).sp((C833103Nh) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((UsOspBottomWidget) awS649S0100000_35.l0).sp((C2262981Dho) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((UsOspBottomWidget) awS649S0100000_35.l0).op((C2262861Dhc) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        C0H4N c0h4n;
        List<Image> list = (List) obj2;
        SeaSkuPanelSkcHeaderWidget seaSkuPanelSkcHeaderWidget = (SeaSkuPanelSkcHeaderWidget) awS649S0100000_35.l0;
        seaSkuPanelSkcHeaderWidget.getClass();
        if (list != null && !list.isEmpty() && (c0h4n = seaSkuPanelSkcHeaderWidget.LLJIJIL) != null) {
            c0h4n.LIZLLL(list);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        int i = SeaSkuPanelHeaderWidget.LLJJJJ;
        SeaSkuPanelSkcHeaderWidget seaSkuPanelSkcHeaderWidget = (SeaSkuPanelSkcHeaderWidget) awS649S0100000_35.l0;
        AnonymousClass0473.LIZIZ((PromotionLabelVO) obj2, seaSkuPanelSkcHeaderWidget.LLJILLL, seaSkuPanelSkcHeaderWidget.LLJJ);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((C11E9) obj).withState(((SeaSkuPanelSkcHeaderWidget) awS649S0100000_35.l0).LJII(), new AwS120S0110000_35((SeaSkuPanelSkcHeaderWidget) awS649S0100000_35.l0, ((Boolean) obj2).booleanValue(), 0));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        if (((SearchBaseOnlineAssem) awS649S0100000_35.l0).op().contains(obj2)) {
            if (((SearchBaseOnlineAssem) awS649S0100000_35.l0).getContentView().getVisibility() != 0) {
                ((SearchBaseOnlineAssem) awS649S0100000_35.l0).Ap();
            }
        } else if (((SearchBaseOnlineAssem) awS649S0100000_35.l0).getContentView().getVisibility() != 8) {
            ((SearchBaseOnlineAssem) awS649S0100000_35.l0).yp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        if (((SearchBaseOnlineAssem) awS649S0100000_35.l0).op().contains(obj2)) {
            if (((SearchBaseOnlineAssem) awS649S0100000_35.l0).getContentView().getVisibility() != 0) {
                ((SearchBaseOnlineAssem) awS649S0100000_35.l0).Ap();
            }
        } else if (((SearchBaseOnlineAssem) awS649S0100000_35.l0).getContentView().getVisibility() != 8) {
            ((SearchBaseOnlineAssem) awS649S0100000_35.l0).yp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C2263001Dhq c2263001Dhq = SearchRelatedSuggestionUiAssem.LLJ;
        SearchRelatedSuggestionVM searchRelatedSuggestionVMGo = ((SearchRelatedSuggestionUiAssem) awS649S0100000_35.l0).Go();
        c2263001Dhq.getClass();
        C2263001Dhq.LIZLLL(zBooleanValue, searchRelatedSuggestionVMGo);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        IPhotoSwapSendCallback iPhotoSwapSendCallback;
        C869590Y9l c869590Y9l = (C869590Y9l) obj2;
        if (c869590Y9l != null && C896400ZEo.LJIIIZ(c869590Y9l) && (iPhotoSwapSendCallback = (IPhotoSwapSendCallback) PluggableExtentionKt.pluggableSpi$default(IPhotoSwapSendCallback.class, false, false, false, 14, null)) != null) {
            iPhotoSwapSendCallback.LIZJ((C0Y3I) awS649S0100000_35.l0, c869590Y9l);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        PhotoModeRelatedSearchUiAssem photoModeRelatedSearchUiAssem = (PhotoModeRelatedSearchUiAssem) awS649S0100000_35.l0;
        photoModeRelatedSearchUiAssem.Jo(zBooleanValue, photoModeRelatedSearchUiAssem.Go());
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((SeaOspBottomWidget) awS649S0100000_35.l0).mp((C833303Nj) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((InterfaceC2262521Dh4) awS649S0100000_35.l0).LIZ(((Number) obj2).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((InterfaceC2262521Dh4) awS649S0100000_35.l0).LJIIJJI(((Number) obj2).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIILJJIL((BaseFragment) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((C2258691Dat) awS649S0100000_35.l0).LIZIZ();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        EditPreviewInfo editPreviewInfo = ((VideoPublishEditModelKt) ((C291001Au) obj2).LIZ).getEditPreviewInfo();
        if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null && (editVideoSegment = (EditVideoSegment) C13LP.LJJJLZIJ(0, videoList)) != null && editVideoSegment.getVideoPath() != null) {
            PcsCourseVideoEditMainAssem pcsCourseVideoEditMainAssem = (PcsCourseVideoEditMainAssem) awS649S0100000_35.l0;
            SurfaceView surfaceView = pcsCourseVideoEditMainAssem.LLJJIJIIJIL;
            if (surfaceView != null) {
                HandlerHook.viewPost(surfaceView, new ARunnableS91S0200000_22(pcsCourseVideoEditMainAssem, editVideoSegment, 44));
            }
            final PcsCourseVideoEditMainAssem pcsCourseVideoEditMainAssem2 = (PcsCourseVideoEditMainAssem) awS649S0100000_35.l0;
            pcsCourseVideoEditMainAssem2.getClass();
            final long duration = editVideoSegment.getVideoFileInfo().getDuration();
            C491160JNy c491160JNy = pcsCourseVideoEditMainAssem2.LLJJIJIL;
            if (c491160JNy != null) {
                c491160JNy.setDuration(duration);
            }
            final C013C c013c = new C013C();
            final C491160JNy c491160JNy2 = pcsCourseVideoEditMainAssem2.LLJJIJIL;
            if (c491160JNy2 != null) {
                c491160JNy2.setSeekbarChangeListener(new C0JO2() { // from class: X.1Di2
                    @Override // X.C0JO2
                    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    }

                    @Override // X.C0JO2
                    public final void onStartTrackingTouch(SeekBar seekBar) {
                        c013c.element = true;
                        C500260Jjc.LJJLIIIJJIZ(new AwS579S0100000_35(c491160JNy2, 405));
                    }

                    @Override // X.C0JO2
                    public final void onStopTrackingTouch(SeekBar seekBar) {
                        float progress;
                        final C2263141Di4 c2263141Di4LIZ;
                        INLEMediaSession iNLEMediaSession2;
                        INLEPlayer playerApi2;
                        c013c.element = false;
                        if (seekBar != null) {
                            progress = seekBar.getProgress() / 100.0f;
                        } else {
                            progress = 0.0f;
                        }
                        C2263161Di6 c2263161Di6 = pcsCourseVideoEditMainAssem2.LLJJIJI;
                        if (c2263161Di6 != null && (c2263141Di4LIZ = c2263161Di6.LIZ()) != null && (iNLEMediaSession2 = c2263141Di4LIZ.LIZIZ.LIZLLL) != null && (playerApi2 = iNLEMediaSession2.getPlayerApi()) != null) {
                            c2263141Di4LIZ.LIZIZ.LJ = true;
                            final AwS436S0200000_35 awS436S0200000_35 = new AwS436S0200000_35(c2263141Di4LIZ, (C2263141Di4) null, (Function0<Unit>) 79);
                            playerApi2.seekTime((long) ((progress / 100) * playerApi2.getDuration()), NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, new INLEListenerSeek() { // from class: X.1Di7
                                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                                public final void onSeekDone(int i) {
                                    C2487409ou.LIZJ(new ARunnableS104S0200000_35(c2263141Di4LIZ, awS436S0200000_35, 9));
                                }
                            });
                            C01TT.LIZIZ(250L, new AwS436S0200000_35(c2263141Di4LIZ, awS436S0200000_35, 78));
                            playerApi2.play();
                        }
                        C489110JGb.LJIILJJIL(pcsCourseVideoEditMainAssem2.hp(), C489320JGw.LIZ(pcsCourseVideoEditMainAssem2.ip().getState().LLILZIL), "slide", "click");
                    }
                });
            }
            C2263161Di6 c2263161Di6 = pcsCourseVideoEditMainAssem2.LLJJIJI;
            if (c2263161Di6 != null && c2263161Di6.LIZIZ.LIZLLL != null && (iNLEMediaSession = c2263161Di6.LIZIZ.LIZLLL) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                playerApi.addPlayerInfoListener(new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.1Di1
                    public long LIZ;

                    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                    public final void onFirstFrameRender() {
                        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
                        C500260Jjc.LJJLIIIJJIZ(new AwS579S0100000_35(pcsCourseVideoEditMainAssem2, 406));
                        this.LIZ = System.currentTimeMillis();
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                    public final void onPlayerPause() {
                        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
                        C500260Jjc.LJJLIIIJJIZ(new AwS579S0100000_35(pcsCourseVideoEditMainAssem2, 407));
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                    public final void onPlayEnd() {
                        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayEnd(this);
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                    public final void onPrepared() {
                        INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPrepared(this);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
                    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onPlayTime(int r6, long r7) {
                        /*
                            r5 = this;
                            com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(r5, r6, r7)
                            long r3 = r5.LIZ
                            r0 = 250(0xfa, double:1.235E-321)
                            long r3 = r3 + r0
                            long r1 = java.lang.System.currentTimeMillis()
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 < 0) goto L11
                            return
                        L11:
                            com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem r0 = r1
                            X.1Di6 r0 = r0.LLJJIJI
                            r1 = 0
                            if (r0 == 0) goto L22
                            X.1Di8 r0 = r0.LIZIZ
                            if (r0 == 0) goto L22
                            boolean r0 = r0.LJ
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                        L22:
                            X.013C r0 = r2
                            boolean r0 = r0.element
                            if (r0 != 0) goto L7a
                            java.lang.Boolean r0 = java.lang.Boolean.TRUE
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                            if (r0 != 0) goto L7a
                            com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem r0 = r1
                            X.1Di6 r0 = r0.LLJJIJI
                            if (r0 == 0) goto L7e
                            X.1Di4 r0 = r0.LIZ()
                            if (r0 == 0) goto L7e
                            X.1Di8 r0 = r0.LIZIZ
                            com.bytedance.ies.nle.editor_jni.INLEMediaSession r0 = r0.LIZLLL
                            if (r0 == 0) goto L7b
                            com.bytedance.ies.nle.editor_jni.INLEPlayer r0 = r0.getPlayerApi()
                            if (r0 == 0) goto L7b
                            long r1 = r0.getDuration()
                        L4c:
                            float r0 = (float) r1
                            java.lang.Float r0 = java.lang.Float.valueOf(r0)
                            if (r0 == 0) goto L7e
                            float r3 = (float) r7
                            float r0 = r0.floatValue()
                            float r3 = r3 / r0
                            r0 = 100
                            float r0 = (float) r0
                            float r3 = r3 * r0
                        L5d:
                            kotlin.jvm.internal.AwS34S0100001_35 r2 = new kotlin.jvm.internal.AwS34S0100001_35
                            com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem r1 = r1
                            r0 = 1
                            r2.<init>(r1, r3, r0)
                            X.C500260Jjc.LJJLIIIJJIZ(r2)
                            long r0 = java.lang.System.currentTimeMillis()
                            r5.LIZ = r0
                            X.1Di9 r3 = new X.1Di9
                            long r1 = r3
                            com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem r0 = r1
                            r3.<init>(r1, r0)
                            X.C500260Jjc.LJJLIIIJJIZ(r3)
                        L7a:
                            return
                        L7b:
                            r1 = 0
                            goto L4c
                        L7e:
                            r3 = 0
                            goto L5d
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2263111Di1.onPlayTime(int, long):void");
                    }
                });
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        C2263141Di4 c2263141Di4LIZ;
        C2263161Di6 c2263161Di6 = ((PcsCourseVideoEditMainAssem) awS649S0100000_35.l0).LLJJIJI;
        if (c2263161Di6 != null && (c2263141Di4LIZ = c2263161Di6.LIZ()) != null) {
            c2263141Di4LIZ.LIZIZ(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((C2258701Dau) awS649S0100000_35.l0).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((C2258701Dau) awS649S0100000_35.l0).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        EnumC1608710rxt enumC1608710rxt = (EnumC1608710rxt) obj;
        InterfaceC1606880ruw interfaceC1606880ruw = (InterfaceC1606880ruw) obj2;
        AvatarComponentView avatarComponentView = ((C2274721E1u) awS649S0100000_35.l0).LLILZIL;
        if (avatarComponentView != null) {
            C0S1I.LIZIZ(1, avatarComponentView.getConfig(), C13LP.LLIIII(avatarComponentView.getAvatarDisplayView().keySet()), enumC1608710rxt.getString(), interfaceC1606880ruw.getString());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        EnumC1608710rxt enumC1608710rxt = (EnumC1608710rxt) obj;
        InterfaceC1606880ruw interfaceC1606880ruw = (InterfaceC1606880ruw) obj2;
        AvatarComponentView avatarComponentView = ((C2274721E1u) awS649S0100000_35.l0).LLILZIL;
        if (avatarComponentView != null) {
            C0S1I.LIZIZ(1, avatarComponentView.getConfig(), C13LP.LLIIII(avatarComponentView.getAvatarDisplayView().keySet()), enumC1608710rxt.getString(), interfaceC1606880ruw.getString());
        }
        Function2<? super EnumC1608710rxt, ? super InterfaceC1606880ruw, Unit> function2 = ((C2274721E1u) awS649S0100000_35.l0).LLILZ;
        if (function2 != null) {
            function2.invoke(enumC1608710rxt, interfaceC1606880ruw);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        TuxIconView tuxIconView;
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        SeaOspBottomWidget seaOspBottomWidget = (SeaOspBottomWidget) awS649S0100000_35.l0;
        if (seaOspBottomWidget.LLJLIL && (tuxIconView = seaOspBottomWidget.LLJJLIIIJLLLLLLLZ) != null) {
            if (zBooleanValue) {
                i = R.raw.icon_chevron_down;
            } else {
                i = R.raw.icon_chevron_up;
            }
            tuxIconView.setIconRes(i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((SeaOspBottomWidget) awS649S0100000_35.l0).op((C03XN) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((SeaOspBottomWidget) awS649S0100000_35.l0).up((C2262981Dho) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((SeaOspBottomWidget) awS649S0100000_35.l0).tp((C2262861Dhc) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        C03MY c03my = (C03MY) obj2;
        UsOspBottomWidget usOspBottomWidget = (UsOspBottomWidget) awS649S0100000_35.l0;
        if (c03my != null) {
            C03MV c03mv = usOspBottomWidget.LLJJLIIIJLLLLLLLZ;
            if (c03mv != null) {
                c03mv.LIZ(c03my, usOspBottomWidget.kp(), usOspBottomWidget.ip());
            }
        } else {
            usOspBottomWidget.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((UsOspBottomWidget) awS649S0100000_35.l0).lp((C03XN) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS649S0100000_35 awS649S0100000_35, Object obj, Object obj2) {
        ((UsOspBottomWidget) awS649S0100000_35.l0).mp((C833203Ni) obj2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS649S0100000_35(Bundle bundle, View view, FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
    }
}
