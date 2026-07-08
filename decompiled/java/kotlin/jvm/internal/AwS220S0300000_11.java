package kotlin.jvm.internal;

import X.AbstractC725620SdE;
import X.C01GW;
import X.C03H5;
import X.C09AE;
import X.C09AY;
import X.C0K77;
import X.C0REQ;
import X.C0RJE;
import X.C0RJL;
import X.C0S1K;
import X.C0S5G;
import X.C0S87;
import X.C0S8S;
import X.C0SH1;
import X.C0SIB;
import X.C0SVD;
import X.C0SY7;
import X.C0SZN;
import X.C0SZS;
import X.C0SZT;
import X.C0SZU;
import X.C1233110iC5;
import X.C12835050n;
import X.C1397620mTQ;
import X.C13IQ;
import X.C13LP;
import X.C1518210pbv;
import X.C15438062q;
import X.C1607100rvI;
import X.C1720106oR;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C1AV3;
import X.C1C1Q;
import X.C1C1T;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2203191BKr;
import X.C23250099c;
import X.C23260099m;
import X.C2344009Gk;
import X.C2788016c;
import X.C291001Au;
import X.C296970BkV;
import X.C339190DRl;
import X.C628830OlV;
import X.C631370Opb;
import X.C700970ReZ;
import X.C701040Reg;
import X.C707350Ror;
import X.C707590RpF;
import X.C708250RqJ;
import X.C708910RrN;
import X.C715390S4j;
import X.C715650S5j;
import X.C716300S7w;
import X.C718770SHj;
import X.C718800SHm;
import X.C722760SWs;
import X.C724100Sam;
import X.C724270Sb3;
import X.C725580SdA;
import X.C725680SdK;
import X.C730050SkN;
import X.C730090SkR;
import X.C730100SkS;
import X.C730150SkX;
import X.C730240Skg;
import X.C730280Skk;
import X.C730340Skq;
import X.C730370Skt;
import X.C786410Ut5;
import X.EnumC1450305m1;
import X.EnumC638200P1m;
import X.EnumC715590S5d;
import X.InterfaceC1364105Vn;
import X.InterfaceC330550CxZ;
import X.InterfaceC665370Q7z;
import X.InterfaceC699970Rcx;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomFriendsV3DetailStoryDMAssem;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceAssem;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceAssemV2;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelImRootAssem;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.prefab.ViewPagerAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.model.StoryAnalytics;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public class AwS220S0300000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((Function2) awS220S0300000_11.l0).invoke(((C701040Reg) awS220S0300000_11.l1).LIZJ(((C700970ReZ) awS220S0300000_11.l2).LIZJ), Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        if (((C0SZN) awS220S0300000_11.l0).LIZLLL().indexOf((C0SZS) awS220S0300000_11.l1) >= 0) {
            C0SZS c0szs = (C0SZS) awS220S0300000_11.l1;
            List list = (List) awS220S0300000_11.l2;
            C0SZU<R, ITEM> c0szu = c0szs.LIZIZ;
            if (c0szu != 0) {
                c0szu.LIZJ(list, obj);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C730090SkR c730090SkR = (C730090SkR) obj;
        StoryViewerListViewModel storyViewerListViewModel = (StoryViewerListViewModel) awS220S0300000_11.l0;
        InterfaceC330550CxZ interfaceC330550CxZ = (InterfaceC330550CxZ) awS220S0300000_11.l1;
        String aid = ((Aweme) awS220S0300000_11.l2).getAid();
        if (aid == null) {
            aid = "";
        }
        storyViewerListViewModel.getClass();
        StoryAnalytics storyAnalytics = interfaceC330550CxZ.getStoryAnalytics();
        C730100SkS c730100SkS = null;
        if (storyAnalytics != null && interfaceC330550CxZ.getTotal() > 0) {
            c730100SkS = new C730100SkS(aid, storyAnalytics.accountReached, storyAnalytics.followersReached);
        }
        return C730090SkR.LIZ(c730090SkR, null, null, null, false, new C291001Au(c730100SkS), null, null, 0, 0, 0L, 0L, false, false, null, null, 32751);
    }

    public static final Object invoke$11(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C0S5G c0s5g = (C0S5G) obj;
        return C0S5G.LIZ(c0s5g, null, null, null, null, null, false, new C291001Au(new AwS109S0400000_11((TranslationStatusViewModel) awS220S0300000_11.l0, c0s5g, (EnumC715590S5d) awS220S0300000_11.l1, (C2788016c) awS220S0300000_11.l2, 3)), null, null, 447);
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        Object obj2;
        long jLongValue;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Long previewSettingsStartTime;
        C291001Au c291001Au = (C291001Au) obj;
        C0S8S c0s8s = ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).LLLFFI;
        if (c0s8s != null) {
            C0S87<Object> c0s87 = c0s8s.LJ;
            if (c0s87 != null) {
                c0s87.LJJLJLI();
            } else {
                c0s8s.LJI = true;
            }
        }
        PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent = (PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0;
        newPaywallCellOverlayComponent.LLLIL = true;
        if (newPaywallCellOverlayComponent.LJJIJL().getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).LJJIJL());
        }
        C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
        if (C716300S7w.LIZIZ(((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).LJIIIIZZ(), ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).Fp())) {
            if (c291001Au != null) {
                obj2 = c291001Au.LIZ;
            } else {
                obj2 = null;
            }
            if (Intrinsics.LJFF(obj2, ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).Bp())) {
                EventBus.LIZLLL().LJIJJ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0);
                if (C296970BkV.LIZ()) {
                    C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).getLifecycle()), null, null, new C707590RpF((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0, (Function2) awS220S0300000_11.l2, null), 3);
                } else {
                    MutableLiveData mutableLiveDataLJIILJJIL = ((C0K77) ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).LLJLLL.getValue()).LJIILJJIL();
                    PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent2 = (PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0;
                    newPaywallCellOverlayComponent2.getClass();
                    mutableLiveDataLJIILJJIL.observe(newPaywallCellOverlayComponent2, new C715650S5j((Function1) awS220S0300000_11.l1));
                }
                if (((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).Fp()) {
                    PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent3 = (PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0;
                    newPaywallCellOverlayComponent3.LLLIIII = true;
                    newPaywallCellOverlayComponent3.LLLIIIIL = true;
                    Aweme awemeLJIIIIZZ = newPaywallCellOverlayComponent3.LJIIIIZZ();
                    if (awemeLJIIIIZZ != null && (contentModel = awemeLJIIIIZZ.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null && (previewSettingsStartTime = cmPreviewInfo.getPreviewSettingsStartTime()) != null) {
                        jLongValue = previewSettingsStartTime.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    newPaywallCellOverlayComponent3.LLLIIIL = jLongValue;
                }
                PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent4 = (PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0;
                newPaywallCellOverlayComponent4.getClass();
                newPaywallCellOverlayComponent4.LLLIILIL = new AwS590S0100000_11(newPaywallCellOverlayComponent4, 314);
                ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).Gp();
            }
        } else {
            ((PaywallComponentTrigger.NewPaywallCellOverlayComponent) awS220S0300000_11.l0).Ip(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((FeedCommonBannerProtocol) awS220S0300000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION, new C0SH1(EnumC638200P1m.PRIMARY, (BannerCommonAction) awS220S0300000_11.l1));
        ((FeedCommonBannerAssem) awS220S0300000_11.l2).Ep(C1AV3.LIZ(5, "Feed", null, "common_banner"));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((FeedCommonBannerProtocol) awS220S0300000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION, new C0SH1(EnumC638200P1m.SECONDARY, (BannerCommonAction) awS220S0300000_11.l1));
        ((FeedCommonBannerAssem) awS220S0300000_11.l2).Ep(C1AV3.LIZ(6, "Feed", null, "common_banner"));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((FeedCommonBannerProtocol) awS220S0300000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_TEXT_SELECTION, new C0SH1((BannerCommonAction) awS220S0300000_11.l1, 1));
        ((FeedCommonBannerAssem) awS220S0300000_11.l2).Ep(C1AV3.LIZ(7, "Feed", null, "common_banner"));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$16(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        boolean zLIZJ;
        boolean z;
        Object obj2;
        Object obj3;
        C12835050n c12835050n = (C12835050n) obj;
        boolean z2 = true;
        if (((EnumC1450305m1) awS220S0300000_11.l0) != EnumC1450305m1.BY_PASS) {
            ReusedAssem reusedAssem = (ReusedAssem) awS220S0300000_11.l1;
            String str = null;
            try {
                if (reusedAssem instanceof BaseCellTriggerComponent) {
                    BaseCellTriggerComponent baseCellTriggerComponent = (BaseCellTriggerComponent) reusedAssem;
                    C724270Sb3 c724270Sb3 = reusedAssem.LLJI;
                    if (c724270Sb3 != null) {
                        obj3 = c724270Sb3.LL;
                    } else {
                        obj3 = null;
                    }
                    zLIZJ = baseCellTriggerComponent.ep((VideoItemParams) obj3);
                } else if (reusedAssem instanceof DynamicComponent) {
                    AbsComponentTrigger absComponentTriggerBp = ((DynamicComponent) reusedAssem).Bp();
                    if (absComponentTriggerBp != null) {
                        C724270Sb3 c724270Sb32 = reusedAssem.LLJI;
                        if (c724270Sb32 != null) {
                            obj2 = c724270Sb32.LL;
                        } else {
                            obj2 = null;
                        }
                        zLIZJ = absComponentTriggerBp.LIZLLL(obj2);
                    } else {
                        zLIZJ = true;
                    }
                } else {
                    zLIZJ = C724100Sam.LIZJ(reusedAssem, null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            if ((reusedAssem instanceof PriorityProtocol) && (reusedAssem instanceof InterfaceC699970Rcx)) {
                if (zLIZJ) {
                    if (((C0RJL) reusedAssem).oh()) {
                        if (((InterfaceC699970Rcx) reusedAssem).Nm()) {
                        }
                    }
                    zLIZJ = true;
                }
                zLIZJ = false;
            }
            if (((ConditionData) awS220S0300000_11.l2).canApplySlot && zLIZJ) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = "active check failed";
            }
            c12835050n.LIZ(str, C2097608Jq.LJIIIIZZ(new Pair("biz_active", Boolean.valueOf(zLIZJ)), new Pair("can_apply_slot", Boolean.valueOf(((ConditionData) awS220S0300000_11.l2).canApplySlot))));
            z2 = z;
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$17(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC725620SdE) awS220S0300000_11.l0).LL);
        sbLIZ.append(" dismissed with latency: ");
        sbLIZ.append(jLongValue);
        C1720106oR.LJI("StoryGestureEducation", C2188811AlT.LIZIZ(sbLIZ));
        C725580SdA c725580SdA = (C725580SdA) awS220S0300000_11.l1;
        String str = ((AbstractC725620SdE) awS220S0300000_11.l0).LL;
        c725580SdA.getClass();
        C20684815ws.LJIJ("story_gesture_education", c725580SdA.LIZ(new C725680SdK(str, jLongValue)));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS220S0300000_11.l2;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
        return unit;
    }

    public static final Object invoke$18(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C722760SWs.LIZ((C722760SWs) awS220S0300000_11.l0, (DetailNavArgModel) awS220S0300000_11.l1, (C19EG) awS220S0300000_11.l2, null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((FeedCommonBannerProtocol) awS220S0300000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION, new C0SH1(EnumC638200P1m.PRIMARY, (BannerCommonAction) awS220S0300000_11.l1));
        ((AIGCOverLabelBannerAssem) awS220S0300000_11.l2).Gp(C1AV3.LIZ(6, "Feed", null, "aigc_overlabel_banner"));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131835472, new AwS220S0300000_11((VideoItemParams) awS220S0300000_11.l0, (TextExtraStruct) awS220S0300000_11.l1, (Context) awS220S0300000_11.l2, 3));
        c1397620mTQ.LJII(2131821883, new AwS377S0200000_11((VideoItemParams) awS220S0300000_11.l0, (TextExtraStruct) awS220S0300000_11.l1, 24));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((FeedCommonBannerProtocol) awS220S0300000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION, new C0SH1(EnumC638200P1m.SECONDARY, (BannerCommonAction) awS220S0300000_11.l1));
        ((AIGCOverLabelBannerAssem) awS220S0300000_11.l2).Gp(C1AV3.LIZ(7, "Feed", null, "aigc_overlabel_banner"));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((FeedCommonBannerProtocol) awS220S0300000_11.l0).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_TEXT_SELECTION, new C0SH1((BannerCommonAction) awS220S0300000_11.l1, 1));
        ((AIGCOverLabelBannerAssem) awS220S0300000_11.l2).Gp(C1AV3.LIZ(8, "Feed", null, "aigc_overlabel_banner"));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$22(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        List<C730340Skq> list;
        String aid;
        C1C1T c1c1t;
        C1C1Q c1c1q;
        C1518210pbv c1518210pbv;
        String str;
        List<C730370Skt> list2 = (List) obj;
        C730240Skg c730240Skg = C730240Skg.LIZ;
        List list3 = (List) awS220S0300000_11.l0;
        C730050SkN c730050SkN = ((C730090SkR) ((StoryViewerListViewModel) awS220S0300000_11.l1).getState()).LLJJ;
        Aweme aweme = null;
        if (c730050SkN != null) {
            aweme = c730050SkN.LIZJ;
        }
        c730240Skg.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list3);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C730370Skt c730370Skt : list2) {
            String str2 = "";
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            String str3 = c730370Skt.LIZIZ.replyId;
            Aweme aweme2 = c730370Skt.LIZ;
            if (aweme2 != null && C730150SkX.LIZIZ(aweme2) && (c1c1t = C2203191BKr.LIZ(aweme2).socialBlob) != null && (c1c1q = c1c1t.secret_reply_blob) != null && (c1518210pbv = c1c1q.secret_reply_sticker_blob) != null && (str = c1518210pbv.prompt_text) != null) {
                str2 = str;
            }
            arrayList2.add(new C730340Skq(aid, str3, str2, c730370Skt.LIZIZ.replyText));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            C730340Skq c730340Skq = (C730340Skq) obj2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((C730340Skq) it2.next()).LLILLJJLI, c730340Skq.LLILLJJLI)) {
                        break;
                    }
                }
            }
            arrayList3.add(obj2);
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C730280Skk(arrayList, aweme));
        C730280Skk c730280Skk = (C730280Skk) C13LP.LJJJLL(arrayList4);
        if (c730280Skk != null && (list = c730280Skk.LL) != null) {
            List list4 = (List) awS220S0300000_11.l0;
            C1233110iC5 c1233110iC5 = (C1233110iC5) awS220S0300000_11.l2;
            list4.clear();
            list4.addAll(list);
            c1233110iC5.notifyDataSetChanged();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        if (obj != null && ((C0SZT) awS220S0300000_11.l0).LIZLLL().indexOf((C0SZS) awS220S0300000_11.l1) >= 0) {
            C0SZS c0szs = (C0SZS) awS220S0300000_11.l1;
            List list = (List) awS220S0300000_11.l2;
            C0SZU<R, ITEM> c0szu = c0szs.LIZIZ;
            if (c0szu != 0) {
                c0szu.LIZJ(list, obj);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C0S1K.LIZIZ.LIZIZ((User) awS220S0300000_11.l1, true, ((Aweme) awS220S0300000_11.l0).getAid(), ((BottomFriendsV3DetailStoryDMAssem) awS220S0300000_11.l2).getEventType());
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((C718770SHj) awS220S0300000_11.l0).LJLLJ((C718800SHm) awS220S0300000_11.l1, (C0SIB) obj, AwemeExtKt.isPhotoMode((Aweme) awS220S0300000_11.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        ((Assembler) obj).MQ2((ReusedUIAssem) awS220S0300000_11.l0, new AwS377S0200000_11((ViewGroup) awS220S0300000_11.l2, (ReusedUISlotAssem) awS220S0300000_11.l1, 133));
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        TranslationStatusViewModel translationStatusViewModel = (TranslationStatusViewModel) awS220S0300000_11.l0;
        C708250RqJ c708250RqJ = (C708250RqJ) awS220S0300000_11.l1;
        translationStatusViewModel.vQ2(c708250RqJ.LIZ, EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE, c708250RqJ.LIZIZ, (InterfaceC665370Q7z) obj, (C2788016c) awS220S0300000_11.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C09AE c09ae;
        if (((RelationButton) awS220S0300000_11.l0).getTag(86573056) != null) {
            if (obj == C0SY7.FOLLOWED || obj == C0SY7.FOLLOW_MUTUAL) {
                ((RelationButton) awS220S0300000_11.l0).setTag(86573058, C0SVD.LL.LJI(2000L, new AwS250S0300000_6((User) awS220S0300000_11.l1, (RelationButton) awS220S0300000_11.l0, (C1607100rvI) awS220S0300000_11.l2, 19)));
            }
            if (obj == C0SY7.UNFOLLOW) {
                Object tag = ((RelationButton) awS220S0300000_11.l0).getTag(86573058);
                if ((tag instanceof C09AE) && (c09ae = (C09AE) tag) != null) {
                    c09ae.LIZIZ(null);
                }
                if (((RelationButton) awS220S0300000_11.l0).getVisibility() == 8) {
                    C339190DRl.LIZLLL((RelationButton) awS220S0300000_11.l0);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS220S0300000_11 awS220S0300000_11, Object obj) throws UnsupportedEncodingException {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("video_id", ((VideoItemParams) awS220S0300000_11.l0).getAweme().getAid());
        c2344009Gk.LJIIIIZZ("challenge_id", ((TextExtraStruct) awS220S0300000_11.l1).getCid());
        C20684815ws.LJIILLIIL("hashtag_removal_video_promp_detail_click", c2344009Gk.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://www.tiktok.com/falcon/communitysafety/page/violation-appeal/index.html?object_id=");
        sbLIZ.append(((TextExtraStruct) awS220S0300000_11.l1).getCid());
        sbLIZ.append("&video_id=");
        sbLIZ.append(((VideoItemParams) awS220S0300000_11.l0).getAweme().getAid());
        sbLIZ.append("&object_type=8000&enter_from=video_caption_hashtag&hide_nav_bar=1&from_source=1&container_color_auto_dark=1&should_full_screen=1");
        String strEncode = URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ), "UTF-8");
        Context context = (Context) awS220S0300000_11.l2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aweme://webview?url=");
        sbLIZ2.append(strEncode);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ2));
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C0S1K c0s1k = C0S1K.LIZIZ;
        String aid = ((Aweme) awS220S0300000_11.l0).getAid();
        User user = (User) awS220S0300000_11.l1;
        String str = ((VideoItemParams) C631370Opb.LIZ((QuickDMEntranceAssem) awS220S0300000_11.l2)).mEventType;
        if (str == null) {
            str = "";
        }
        c0s1k.LIZIZ(user, true, aid, str);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C0S1K c0s1k = C0S1K.LIZIZ;
        String aid = ((Aweme) awS220S0300000_11.l0).getAid();
        User user = (User) awS220S0300000_11.l1;
        String str = ((VideoItemParams) C631370Opb.LIZ((QuickDMEntranceAssemV2) awS220S0300000_11.l2)).mEventType;
        if (str == null) {
            str = "";
        }
        c0s1k.LIZIZ(user, true, aid, str);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = (VideoAuthorInfoRelationAssem) awS220S0300000_11.l0;
        C0RJE.LIZJ((Assembler) obj, videoAuthorInfoRelationAssem, new AwS220S0300000_11((View) awS220S0300000_11.l2, videoAuthorInfoRelationAssem, (C13IQ) awS220S0300000_11.l1, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        C0REQ c0req = (C0REQ) obj;
        Context context = ((VideoAuthorInfoRelationAssem) awS220S0300000_11.l0).getContext();
        C708910RrN c708910RrN = null;
        if (context != null) {
            View view = (View) awS220S0300000_11.l2;
            C708910RrN c708910RrN2 = new C708910RrN(context, null);
            C715390S4j.LIZJ(4, c708910RrN2);
            C715390S4j.LIZIZ(4, c708910RrN2);
            ((ViewGroup) view.findViewById(R.id.x14)).addView(c708910RrN2);
            c708910RrN = c708910RrN2;
        }
        c0req.LJ = c708910RrN;
        c0req.LIZ = (C13IQ) awS220S0300000_11.l1;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        Assembler assembler = (Assembler) obj;
        ViewGroup viewGroup = (ViewGroup) awS220S0300000_11.l0;
        if (viewGroup != null) {
            assembler.RQ2((SharePanelImRootAssem) awS220S0300000_11.l2, new AwS590S0100000_11(viewGroup, 158));
        }
        ViewGroup viewGroup2 = (ViewGroup) awS220S0300000_11.l1;
        if (viewGroup2 != null) {
            assembler.MQ2((SharePanelImRootAssem) awS220S0300000_11.l2, new AwS590S0100000_11(viewGroup2, 159));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS220S0300000_11 awS220S0300000_11, Object obj) {
        AssemSupervisor assemSupervisor;
        Assembler assembler = (Assembler) obj;
        if (assembler.CQ2((LifecycleOwner) ((View) awS220S0300000_11.l0).getTag()) == null) {
            AssemSupervisor assemSupervisorCQ2 = assembler.CQ2((ViewPagerAssem) awS220S0300000_11.l1);
            if (assemSupervisorCQ2 != null) {
                assemSupervisor = new AssemSupervisor(assemSupervisorCQ2.LLJ, assemSupervisorCQ2.LLJIJIL, assemSupervisorCQ2.LJ(), assemSupervisorCQ2.LJFF());
                assemSupervisor.LLJJIII = (View) awS220S0300000_11.l0;
            } else {
                assemSupervisor = null;
            }
            assembler.PQ2((LifecycleOwner) ((View) awS220S0300000_11.l0).getTag(), assemSupervisor);
        }
        assembler.wQ2((LifecycleOwner) ((View) awS220S0300000_11.l0).getTag(), Collections.singletonList((C628830OlV) awS220S0300000_11.l2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS220S0300000_11(EnumC1450305m1 enumC1450305m1, EnumC1450305m1 enumC1450305m12, ReusedAssem<?> reusedAssem, ConditionData conditionData) {
        super(1);
        this.$t = conditionData;
        this.l0 = enumC1450305m1;
        this.l1 = enumC1450305m12;
        this.l2 = reusedAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(C718770SHj c718770SHj, C718800SHm c718800SHm, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = c718770SHj;
        this.l1 = c718800SHm;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(C722760SWs c722760SWs, DetailNavArgModel detailNavArgModel, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c722760SWs;
        this.l1 = detailNavArgModel;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS220S0300000_11(C0SZN c0szn, C0SZN c0szn2, C0SZS<?, ?> c0szs, List<? extends Object> list) {
        super(1);
        this.$t = list;
        this.l0 = c0szn;
        this.l1 = c0szn2;
        this.l2 = c0szs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS220S0300000_11(C0SZT c0szt, C0SZT<R, ITEM> c0szt2, C0SZS<R, ITEM> c0szs, List<? extends Object> list) {
        super(1);
        this.$t = list;
        this.l0 = c0szt;
        this.l1 = c0szt2;
        this.l2 = c0szs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(AbstractC725620SdE abstractC725620SdE, C725580SdA c725580SdA, C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC725620SdE;
        this.l1 = c725580SdA;
        this.l2 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(View view, VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, C13IQ c13iq, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoAuthorInfoRelationAssem;
        this.l1 = c13iq;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(View view, ViewPagerAssem viewPagerAssem, C628830OlV c628830OlV, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = viewPagerAssem;
        this.l2 = c628830OlV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(ViewGroup viewGroup, ViewGroup viewGroup2, SharePanelImRootAssem sharePanelImRootAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = viewGroup2;
        this.l2 = sharePanelImRootAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS220S0300000_11(ReusedUIAssem reusedUIAssem, ReusedUIAssem<?> reusedUIAssem2, ReusedUISlotAssem<? extends C03H5> reusedUISlotAssem, ViewGroup viewGroup) {
        super(1);
        this.$t = viewGroup;
        this.l0 = reusedUIAssem;
        this.l1 = reusedUIAssem2;
        this.l2 = reusedUISlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(Aweme aweme, User user, BottomFriendsV3DetailStoryDMAssem bottomFriendsV3DetailStoryDMAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = user;
        this.l2 = bottomFriendsV3DetailStoryDMAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(Aweme aweme, User user, QuickDMEntranceAssem quickDMEntranceAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = user;
        this.l2 = quickDMEntranceAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(Aweme aweme, User user, QuickDMEntranceAssemV2 quickDMEntranceAssemV2, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = user;
        this.l2 = quickDMEntranceAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(VideoItemParams videoItemParams, TextExtraStruct textExtraStruct, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = textExtraStruct;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(BannerCommonAction bannerCommonAction, FeedCommonBannerProtocol feedCommonBannerProtocol, AIGCOverLabelBannerAssem aIGCOverLabelBannerAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = feedCommonBannerProtocol;
        this.l1 = bannerCommonAction;
        this.l2 = aIGCOverLabelBannerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(User user, RelationButton relationButton, C1607100rvI c1607100rvI, int i) {
        super(1);
        this.$t = i;
        this.l0 = relationButton;
        this.l1 = user;
        this.l2 = c1607100rvI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(StoryViewerListViewModel storyViewerListViewModel, InterfaceC330550CxZ interfaceC330550CxZ, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = storyViewerListViewModel;
        this.l1 = interfaceC330550CxZ;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(TranslationStatusViewModel translationStatusViewModel, C708250RqJ c708250RqJ, C2788016c c2788016c, int i) {
        super(1);
        this.$t = i;
        this.l0 = translationStatusViewModel;
        this.l1 = c708250RqJ;
        this.l2 = c2788016c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(TranslationStatusViewModel translationStatusViewModel, EnumC715590S5d enumC715590S5d, C2788016c c2788016c, int i) {
        super(1);
        this.$t = i;
        this.l0 = translationStatusViewModel;
        this.l1 = enumC715590S5d;
        this.l2 = c2788016c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent, AwS377S0200000_11 awS377S0200000_11, C707350Ror c707350Ror, int i) {
        super(1);
        this.$t = i;
        this.l0 = newPaywallCellOverlayComponent;
        this.l1 = awS377S0200000_11;
        this.l2 = c707350Ror;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(FeedCommonBannerProtocol feedCommonBannerProtocol, BannerCommonAction bannerCommonAction, FeedCommonBannerAssem feedCommonBannerAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = feedCommonBannerProtocol;
        this.l1 = bannerCommonAction;
        this.l2 = feedCommonBannerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS220S0300000_11(List list, List<C730340Skq> list2, StoryViewerListViewModel storyViewerListViewModel, C1233110iC5 c1233110iC5) {
        super(1);
        this.$t = c1233110iC5;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = storyViewerListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0300000_11(AwS625S0100000_11 awS625S0100000_11, C701040Reg c701040Reg, C700970ReZ c700970ReZ, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS625S0100000_11;
        this.l1 = c701040Reg;
        this.l2 = c700970ReZ;
    }
}
