package irm;

import X.AbstractC214814194y;
import X.AbstractC529520Kpi;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0I7D;
import X.C0LAB;
import X.C0M1U;
import X.C0M2O;
import X.C0M2T;
import X.C0M5N;
import X.C0M7J;
import X.C0MFB;
import X.C0MFD;
import X.C0MFL;
import X.C0MFP;
import X.C0MGI;
import X.C0MUK;
import X.C0WZX;
import X.C11NJ;
import X.C1390380mHk;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1447800nmM;
import X.C1455870nzN;
import X.C1456140nzo;
import X.C1701330uNH;
import X.C19EG;
import X.C20577315fX;
import X.C20684815ws;
import X.C2204961BRm;
import X.C526030Kk5;
import X.C526910KlV;
import X.C538590LAj;
import X.C539910LFl;
import X.C540370LHf;
import X.C554260LoW;
import X.C555380LqK;
import X.C558290Lv1;
import X.C561570M0t;
import X.C561980M2i;
import X.C562040M2o;
import X.C563360M7q;
import X.C566300MIy;
import X.C572850MdP;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.C985403tE;
import X.DialogC1237630iJN;
import X.InterfaceC20622815ms;
import X.InterfaceC214897198d;
import X.InterfaceC540360LHe;
import X.InterfaceC561990M2j;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.p;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.theater.consumption.entrance.AITheaterCastUIAssem;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class AkS80S0100000_8 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            case 37:
                LIZ$37(this, view);
                break;
            case 38:
                LIZ$38(this, view);
                break;
            case 39:
                LIZ$39(this, view);
                break;
            case 40:
                LIZ$40(this, view);
                break;
            case 41:
                LIZ$41(this, view);
                break;
            case 42:
                LIZ$42(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS80S0100000_8(AbstractC529520Kpi abstractC529520Kpi, int i) {
        super(600L);
        this.$t = i;
        this.l0 = abstractC529520Kpi;
    }

    public static final void LIZ$0(AkS80S0100000_8 akS80S0100000_8, View view) {
        Function0<Unit> onClick = ((C558290Lv1) akS80S0100000_8.l0).LIZIZ.getOnClick();
        if (onClick != null) {
            onClick.invoke();
        }
    }

    public static final void LIZ$1(AkS80S0100000_8 akS80S0100000_8, View view) {
        AwS409S0200000_8 awS409S0200000_8 = ((AbstractC529520Kpi) akS80S0100000_8.l0).LLJ;
        if (awS409S0200000_8 != null) {
            awS409S0200000_8.invoke();
        }
    }

    public static final void LIZ$10(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((p) akS80S0100000_8.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$11(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((p) akS80S0100000_8.l0).LLLLIL().LIZJ.invoke();
    }

    public static final void LIZ$12(AkS80S0100000_8 akS80S0100000_8, View view) {
        C539910LFl c539910LFl = (C539910LFl) akS80S0100000_8.l0;
        c539910LFl.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(c539910LFl.requireSceneContext());
        c1397580mTM.LJII = false;
        c1397580mTM.LIZ(2131850077);
        C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(c539910LFl, 232));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$13(irm.AkS80S0100000_8 r5, android.view.View r6) {
        /*
            java.lang.Object r0 = r5.l0
            X.0LFl r0 = (X.C539910LFl) r0
            java.util.List<X.0LFg> r0 = r0.LLJJLIIIJLLLLLLLZ
            r4 = 1
            if (r0 == 0) goto L2d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0LFg r0 = (X.C539860LFg) r0
            java.lang.String r0 = r0.LJII
            if (r0 == 0) goto L12
            int r0 = r0.length()
            if (r0 == 0) goto L12
            r3.add(r1)
            goto L12
        L2d:
            r1 = 0
            goto L38
        L2f:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L2d
            r1 = 1
        L38:
            java.lang.Object r0 = r5.l0
            X.0LFl r0 = (X.C539910LFl) r0
            java.util.List<X.0LFg> r0 = r0.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L72
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L72
            if (r1 == 0) goto L72
            java.lang.Object r0 = r5.l0
            X.0LFl r0 = (X.C539910LFl) r0
            X.0oBx r0 = r0.LLLLLJLJLL()
            X.0Dkm r0 = r0.LIZLLL()
            if (r0 == 0) goto L74
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.LIZ
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = r0.getModel()
        L5c:
            java.lang.Object r0 = r5.l0
            X.0LFl r0 = (X.C539910LFl) r0
            java.lang.Object r0 = r0.LLLLIL()
            X.0LFm r0 = (X.C539920LFm) r0
            kotlin.jvm.functions.Function2<java.util.List<X.0LFg>, com.bytedance.ies.nle.editor_jni.NLEModel, kotlin.Unit> r1 = r0.LIZIZ
            java.lang.Object r0 = r5.l0
            X.0LFl r0 = (X.C539910LFl) r0
            java.util.List<X.0LFg> r0 = r0.LLJJLIIIJLLLLLLLZ
            r1.invoke(r0, r2)
            return
        L72:
            r2 = 0
            goto L5c
        L74:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS80S0100000_8.LIZ$13(irm.AkS80S0100000_8, android.view.View):void");
    }

    public static final void LIZ$14(AkS80S0100000_8 akS80S0100000_8, View view) {
        C563360M7q c563360M7q = (C563360M7q) akS80S0100000_8.l0;
        ((C572850MdP) c563360M7q.LLJIJIL.getValue(c563360M7q, C563360M7q.LLJILJIL[0])).DJ1(true);
    }

    public static final void LIZ$15(AkS80S0100000_8 akS80S0100000_8, View view) {
        C563360M7q c563360M7q = (C563360M7q) akS80S0100000_8.l0;
        C1456140nzo.LIZ((C1455870nzN) c563360M7q.LLJIJIL.getValue(c563360M7q, C563360M7q.LLJILJIL[0]), false, 2);
    }

    public static final void LIZ$16(AkS80S0100000_8 akS80S0100000_8, View view) {
        C0MFP c0mfp = (C0MFP) akS80S0100000_8.l0;
        c0mfp.onClick(c0mfp.LLLLLJLJLL());
    }

    public static final void LIZ$17(AkS80S0100000_8 akS80S0100000_8, View view) {
        C0MFP c0mfp = (C0MFP) akS80S0100000_8.l0;
        c0mfp.onClick(c0mfp.LLLLLLIL());
    }

    public static final void LIZ$18(AkS80S0100000_8 akS80S0100000_8, View view) {
        C0MFP c0mfp = (C0MFP) akS80S0100000_8.l0;
        c0mfp.onClick((View) c0mfp.LLJJJJJIL.getValue());
    }

    public static final void LIZ$19(AkS80S0100000_8 akS80S0100000_8, View view) {
        C0MFP c0mfp = (C0MFP) akS80S0100000_8.l0;
        c0mfp.getClass();
        c0mfp.LLLLLLZZ(new AwS552S0100000_8(c0mfp, 568));
    }

    public static final void LIZ$2(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C555380LqK) akS80S0100000_8.l0).LLLLIL().LIZ.invoke();
    }

    public static final void LIZ$20(AkS80S0100000_8 akS80S0100000_8, View view) {
        C0MFP c0mfp = (C0MFP) akS80S0100000_8.l0;
        c0mfp.getClass();
        c0mfp.LLLLLLZZ(new AwS552S0100000_8(c0mfp, 568));
    }

    public static final void LIZ$21(AkS80S0100000_8 akS80S0100000_8, View view) {
        C0MFP c0mfp = (C0MFP) akS80S0100000_8.l0;
        c0mfp.getClass();
        c0mfp.LLLLLLZZ(new AwS552S0100000_8(c0mfp, 568));
    }

    public static final void LIZ$22(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C0MFP) akS80S0100000_8.l0).LLLLLZ();
    }

    public static final void LIZ$23(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C0MFP) akS80S0100000_8.l0).LLLLLZ();
    }

    public static final void LIZ$24(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C566300MIy) akS80S0100000_8.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$25(AkS80S0100000_8 akS80S0100000_8, View view) {
        InterfaceC561990M2j interfaceC561990M2j = ((C561980M2i) akS80S0100000_8.l0).LL;
        if (interfaceC561990M2j != null) {
            interfaceC561990M2j.v(true);
        }
    }

    public static final void LIZ$26(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C0MFL) akS80S0100000_8.l0).getGuideConfig().LJ.invoke();
    }

    public static final void LIZ$27(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C0MFL) akS80S0100000_8.l0).getGuideConfig().LIZLLL.invoke();
    }

    public static final void LIZ$28(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C0MFL) akS80S0100000_8.l0).getGuideConfig().LJFF.invoke();
    }

    public static final void LIZ$29(AkS80S0100000_8 akS80S0100000_8, View view) {
        Function0<Unit> function0;
        C0MFB helpCenterConfig = ((C0MFD) akS80S0100000_8.l0).getHelpCenterConfig();
        if (helpCenterConfig != null && (function0 = helpCenterConfig.LIZLLL) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$3(AkS80S0100000_8 akS80S0100000_8, View view) throws Throwable {
        String str = FTCChooseCoverActivity._pnsPageId;
        C19EG c19egRequireActivity = ((FTCVideoPublishFragment) akS80S0100000_8.l0).requireActivity();
        VideoPublishEditModel videoPublishEditModel = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        Intent intent = new Intent(c19egRequireActivity, (Class<?>) FTCChooseCoverActivity.class);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) videoPublishEditModel);
        C0MUK.LJIIIZ(intent, videoPublishEditModel.creativeModel);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egRequireActivity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, c19egRequireActivity);
        C2204961BRm.LLJJJJJIL(4, intent, c19egRequireActivity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYk7vCV/+UtUyV0c+Gh1NMCr7KQ", null));
        C786410Ut5.ce(c19egRequireActivity, R.anim.a7, R.anim.a8);
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel3 = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c0lab.LJ("creation_id", videoPublishEditModel3.getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        VideoPublishEditModel videoPublishEditModel4 = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        if (videoPublishEditModel4.getDraftId() != 0) {
            VideoPublishEditModel videoPublishEditModel5 = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel5 = null;
            }
            c0lab.LIZ(videoPublishEditModel5.getDraftId(), "draft_id");
        }
        C20684815ws.LJIILLIIL("select_cover", c0lab.LIZ);
        C0LAB c0lab2 = new C0LAB();
        VideoPublishEditModel videoPublishEditModel6 = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
        if (videoPublishEditModel6 != null) {
            videoPublishEditModel2 = videoPublishEditModel6;
        }
        c0lab2.LJ("creation_id", videoPublishEditModel2.getCreationId());
        c0lab2.LJ("enter_from", "video_edit_page");
        c0lab2.LJ("shoot_entrance", "direct_shoot");
        c0lab2.LJ("shoot_way", "direct_shoot");
        C20684815ws.LJIILLIIL("cover_click", c0lab2.LIZ);
    }

    public static final void LIZ$30(AkS80S0100000_8 akS80S0100000_8, View view) {
        Function0<Unit> function0;
        C0MFB helpCenterConfig = ((C0MFD) akS80S0100000_8.l0).getHelpCenterConfig();
        if (helpCenterConfig != null && (function0 = helpCenterConfig.LIZJ) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$31(AkS80S0100000_8 akS80S0100000_8, View view) {
        Function0<Unit> function0;
        C0MFB helpCenterConfig = ((C0MFD) akS80S0100000_8.l0).getHelpCenterConfig();
        if (helpCenterConfig != null && (function0 = helpCenterConfig.LJ) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$32(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C0M7J) akS80S0100000_8.l0).L5();
    }

    public static final void LIZ$33(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C0M7J) akS80S0100000_8.l0).L5();
    }

    public static final void LIZ$34(AkS80S0100000_8 akS80S0100000_8, View view) throws Throwable {
        String creationId;
        String string;
        String string2;
        ((FTCVideoPublishActivity) akS80S0100000_8.l0).onBackPressed();
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = ((FTCVideoPublishActivity) akS80S0100000_8.l0).LLILLL;
        Integer numValueOf = null;
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("enter_from", "video_post_page");
        FTCVideoPublishActivity fTCVideoPublishActivity = (FTCVideoPublishActivity) akS80S0100000_8.l0;
        KeyEvent.Callback callbackFindViewById = fTCVideoPublishActivity.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = fTCVideoPublishActivity.findViewById(R.id.hcs);
            fTCVideoPublishActivity.LLILLJJLI = (C0I7D) callbackFindViewById;
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI((C0I7D) callbackFindViewById, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYx7/uf49AbXj94wjvbSdqsmIIUlw==", null));
        if (editableLLLLJI != null && (string2 = editableLLLLJI.toString()) != null) {
            string = a0.LJLIIIL(string2).toString();
        } else {
            string = null;
        }
        c0lab.LJ("desc_detail", string);
        VideoPublishEditModel videoPublishEditModel2 = ((FTCVideoPublishActivity) akS80S0100000_8.l0).LLILLL;
        if (videoPublishEditModel2 == null || videoPublishEditModel2.getDraftId() != 0) {
            VideoPublishEditModel videoPublishEditModel3 = ((FTCVideoPublishActivity) akS80S0100000_8.l0).LLILLL;
            if (videoPublishEditModel3 != null) {
                numValueOf = Integer.valueOf(videoPublishEditModel3.getDraftId());
            }
            c0lab.LIZLLL(numValueOf, "draft_id");
        }
        C20684815ws.LJIILLIIL("click_back", c0lab.LIZ);
    }

    public static final void LIZ$35(AkS80S0100000_8 akS80S0100000_8, View view) throws Throwable {
        String string;
        String string2;
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        VideoPublishEditModel videoPublishEditModel3 = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        if (videoPublishEditModel3.getDraftId() != 0) {
            VideoPublishEditModel videoPublishEditModel4 = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
            if (videoPublishEditModel4 == null) {
                videoPublishEditModel4 = null;
            }
            c0lab.LIZ(videoPublishEditModel4.getDraftId(), "draft_id");
        }
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_entrance", "direct_shoot");
        c0lab.LJ("shoot_way", "direct_shoot");
        C20684815ws.LJIILLIIL("click_save", c0lab.LIZ);
        Editable editableLLLLJI = C2204961BRm.LLLLJI(((FTCVideoPublishFragment) akS80S0100000_8.l0).MR(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYx7/uf49AbXj94wjvcWM+ig44Omg==", null));
        if (editableLLLLJI == null || (string2 = editableLLLLJI.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
            string = "";
        }
        VideoPublishEditModel videoPublishEditModel5 = ((FTCVideoPublishFragment) akS80S0100000_8.l0).LLILZIL;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        videoPublishEditModel5.setTitle(string);
        final FTCVideoPublishFragment fTCVideoPublishFragment = (FTCVideoPublishFragment) akS80S0100000_8.l0;
        if (fTCVideoPublishFragment.LLJILJIL == null) {
            DialogC1237630iJN dialogC1237630iJN = new DialogC1237630iJN(fTCVideoPublishFragment.requireActivity());
            dialogC1237630iJN.setCancelable(false);
            fTCVideoPublishFragment.LLJILJIL = dialogC1237630iJN;
        }
        DialogC1237630iJN dialogC1237630iJN2 = fTCVideoPublishFragment.LLJILJIL;
        if (dialogC1237630iJN2 != null) {
            dialogC1237630iJN2.show();
            C785410UrT.LIZIZ(dialogC1237630iJN2);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC1237630iJN2);
            C816490W1f.LIZ(dialogC1237630iJN2);
        }
        InterfaceC540360LHe interfaceC540360LHe = new InterfaceC540360LHe() { // from class: X.0Mop
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
                FTCVideoPublishFragment fTCVideoPublishFragment2 = fTCVideoPublishFragment;
                boolean zLIZ = C0MYX.LIZ(c540340LHc.LIZ);
                fTCVideoPublishFragment2.LJIIL();
                if (zLIZ) {
                    C1233040iBy c1233040iBy = new C1233040iBy(o.LIZ);
                    c1233040iBy.LIZJ(fTCVideoPublishFragment2.getString(2131832446));
                    c1233040iBy.LIZLLL();
                } else {
                    C1233040iBy c1233040iBy2 = new C1233040iBy(o.LIZ);
                    c1233040iBy2.LIZJ(fTCVideoPublishFragment2.getString(2131832447));
                    c1233040iBy2.LIZLLL();
                }
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZJ(C540340LHc c540340LHc) throws Throwable {
                FTCVideoPublishFragment fTCVideoPublishFragment2 = fTCVideoPublishFragment;
                fTCVideoPublishFragment2.LJIIL();
                VideoPublishEditModel videoPublishEditModel6 = fTCVideoPublishFragment2.LLILZIL;
                if (videoPublishEditModel6 == null) {
                    videoPublishEditModel6 = null;
                }
                Iterator<EditVideoSegment> it2 = videoPublishEditModel6.getPreviewInfo().getVideoList().iterator();
                long duration = 0;
                while (it2.hasNext()) {
                    duration += it2.next().getVideoFileInfo().getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
                C0LAB c0lab2 = new C0LAB();
                c0lab2.LIZIZ(duration, "duration");
                VideoPublishEditModel videoPublishEditModel7 = fTCVideoPublishFragment2.LLILZIL;
                if (videoPublishEditModel7 == null) {
                    videoPublishEditModel7 = null;
                }
                c0lab2.LJ("creation_id", videoPublishEditModel7.getCreationId());
                c0lab2.LJ("shoot_way", "direct_shoot");
                c0lab2.LJ("enter_from", "personal_homepage");
                c0lab2.LJ("shoot_entrance", "direct_shoot");
                VideoPublishEditModel videoPublishEditModel8 = fTCVideoPublishFragment2.LLILZIL;
                if (videoPublishEditModel8 == null) {
                    videoPublishEditModel8 = null;
                }
                c0lab2.LJ("prop_list", videoPublishEditModel8.getStickerID());
                VideoPublishEditModel videoPublishEditModel9 = fTCVideoPublishFragment2.LLILZIL;
                if (videoPublishEditModel9 == null) {
                    videoPublishEditModel9 = null;
                }
                c0lab2.LJ("effect_list", videoPublishEditModel9.getEditEffectListStr());
                VideoPublishEditModel videoPublishEditModel10 = fTCVideoPublishFragment2.LLILZIL;
                if (videoPublishEditModel10 == null) {
                    videoPublishEditModel10 = null;
                }
                c0lab2.LJ("filter_list", videoPublishEditModel10.getCurFilterIds());
                C20684815ws.LJIILLIIL("video_save_end", c0lab2.LIZ);
                VideoPublishEditModel videoPublishEditModel11 = fTCVideoPublishFragment2.LLILZIL;
                if (videoPublishEditModel11 == null) {
                    videoPublishEditModel11 = null;
                }
                if (videoPublishEditModel11.creativeModel.draftInfoModel.isDraft) {
                    final int i = 1;
                    C1440005kM.LIZ(new IEvent(i) { // from class: X.0Moq
                        public final int LIZ;

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }

                        {
                            this.LIZ = i;
                        }
                    });
                } else {
                    final int i2 = 2;
                    C1440005kM.LIZ(new IEvent(i2) { // from class: X.0Moq
                        public final int LIZ;

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }

                        {
                            this.LIZ = i2;
                        }
                    });
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fTCVideoPublishFragment2.getActivity(), "//kids/main");
                smartRouteBuildRoute.withParam("key_init_page_index", 4);
                smartRouteBuildRoute.open();
                C201955140j.LIZ("NewKidsMode, Publish SaveDraft and goto KidsMain.");
                C1440005kM.LIZ(new C579950Mor());
                C1440005kM.LIZ(new IEvent() { // from class: X.0LHz
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
                Intent intent = new Intent();
                intent.putExtra("publish result", "PublishActivity success");
                C19EG activity = fTCVideoPublishFragment2.getActivity();
                if (activity != null) {
                    C2204961BRm.LLJJIJIL(-1, intent, activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYx7/uf49AbXj94wjvcWM+ig44Omg==", null));
                }
                C19EG activity2 = fTCVideoPublishFragment2.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                C786410Ut5.ce(fTCVideoPublishFragment2.requireActivity(), 0, R.anim.a8);
            }
        };
        C0M5N c0m5n = C0M5N.LIZ;
        VideoPublishEditModel videoPublishEditModel6 = fTCVideoPublishFragment.LLILZIL;
        if (videoPublishEditModel6 != null) {
            videoPublishEditModel2 = videoPublishEditModel6;
        }
        C540370LHf c540370LHf = new C540370LHf(new C538590LAj(videoPublishEditModel2, new C0M2T(false, "FTCVideoPublishFragment", null, 0, false, 28), false), interfaceC540360LHe);
        c0m5n.getClass();
        C0M5N.LIZ(c540370LHf);
    }

    public static final void LIZ$36(AkS80S0100000_8 akS80S0100000_8, View view) {
        Fragment fragmentLJI;
        FragmentManager childFragmentManager;
        Object obj;
        AITheaterCastUIAssem aITheaterCastUIAssem = (AITheaterCastUIAssem) akS80S0100000_8.l0;
        aITheaterCastUIAssem.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(aITheaterCastUIAssem);
        Object obj2 = null;
        if ((c19egLIZ == null || (childFragmentManager = c19egLIZ.getSupportFragmentManager()) == null) && ((fragmentLJI = C724240Sb0.LJI(aITheaterCastUIAssem)) == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null)) {
            return;
        }
        C724270Sb3 c724270Sb3 = aITheaterCastUIAssem.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        C724270Sb3 c724270Sb32 = aITheaterCastUIAssem.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        C561570M0t.LIZ(childFragmentManager, aweme, ((VideoItemParams) obj2).mEventType);
    }

    public static final void LIZ$37(AkS80S0100000_8 akS80S0100000_8, View view) {
        C554260LoW c554260LoW = (C554260LoW) akS80S0100000_8.l0;
        c554260LoW.LLILZIL.invoke(c554260LoW.LL);
    }

    public static final void LIZ$38(AkS80S0100000_8 akS80S0100000_8, View view) {
        if (((C20577315fX) akS80S0100000_8.l0).isLoading()) {
            return;
        }
        C20577315fX c20577315fX = (C20577315fX) akS80S0100000_8.l0;
        if (!c20577315fX.LLLIIIIL) {
            Activity activity = c20577315fX.mActivity;
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131829866);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity, 3076, creativeToastBuilder);
                return;
            }
            return;
        }
        new AwS552S0100000_8(c20577315fX, 1057).invoke();
    }

    public static final void LIZ$39(AkS80S0100000_8 akS80S0100000_8, View view) {
        if (((C20577315fX) akS80S0100000_8.l0).LLLILZ()) {
            Activity activity = ((C20577315fX) akS80S0100000_8.l0).mActivity;
            if (activity != null) {
                activity.onBackPressed();
                return;
            }
            return;
        }
        C20577315fX c20577315fX = (C20577315fX) akS80S0100000_8.l0;
        if (c20577315fX.LLLIIIL) {
            return;
        }
        if (c20577315fX.isLoading()) {
            EditPreviewStickerViewModel editPreviewStickerViewModel = ((C20577315fX) akS80S0100000_8.l0).LLJJL;
            if (editPreviewStickerViewModel == null) {
                editPreviewStickerViewModel = null;
            }
            C11NJ c11nj = editPreviewStickerViewModel.LLILZIL;
            if (c11nj != null) {
                c11nj.dispose();
            }
            editPreviewStickerViewModel.setState(AFwS276S0000000_31.get$arr$(309));
            return;
        }
        Activity activity2 = ((C20577315fX) akS80S0100000_8.l0).mActivity;
        if (activity2 == null) {
            return;
        }
        activity2.onBackPressed();
    }

    public static final void LIZ$4(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C526030Kk5) akS80S0100000_8.l0).LLLLIL().LIZ.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$40(AkS80S0100000_8 akS80S0100000_8, View view) {
        InterfaceC20622815ms interfaceC20622815ms;
        Scene scene;
        AbstractC214814194y abstractC214814194y;
        Object next;
        NavigationScene navigationSceneLIZ;
        AIPortraitTabFragment aIPortraitTabFragment = (AIPortraitTabFragment) akS80S0100000_8.l0;
        if (aIPortraitTabFragment.LLJJIJI) {
            C0MGI c0mgi = aIPortraitTabFragment.LL;
            if (c0mgi != null && (navigationSceneLIZ = C1447800nmM.LIZ(c0mgi)) != null) {
                navigationSceneLIZ.onBackPressed();
                return;
            }
            return;
        }
        AwS552S0100000_8 awS552S0100000_8 = aIPortraitTabFragment.LLILLJJLI;
        if (awS552S0100000_8 != null) {
            awS552S0100000_8.invoke();
            return;
        }
        C19EG activity = aIPortraitTabFragment.getActivity();
        if (activity == 0) {
            return;
        }
        if ((activity instanceof InterfaceC214897198d) && (interfaceC20622815ms = (InterfaceC20622815ms) activity) != null) {
            NavigationScene navigationScene = interfaceC20622815ms.getNavigationScene();
            if (navigationScene != null) {
                Iterator it2 = ((ArrayList) navigationScene.getSceneList()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof AbstractC214814194y) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                scene = (Scene) next;
            } else {
                scene = null;
            }
            if ((scene instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) scene) != null) {
                abstractC214814194y.finish();
                return;
            }
        }
        activity.finish();
    }

    public static final void LIZ$41(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C562040M2o) akS80S0100000_8.l0).LL.v(true);
    }

    public static final void LIZ$42(AkS80S0100000_8 akS80S0100000_8, View view) {
        C0M1U c0m1u = ((C0M2O) akS80S0100000_8.l0).LJI;
        if (c0m1u != null) {
            c0m1u.ER();
        }
    }

    public static final void LIZ$5(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C526910KlV) akS80S0100000_8.l0).LLLLLLIL();
    }

    public static final void LIZ$6(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((C526910KlV) akS80S0100000_8.l0).LLLLLLIL();
    }

    public static final void LIZ$7(AkS80S0100000_8 akS80S0100000_8, View view) {
        C526910KlV c526910KlV = (C526910KlV) akS80S0100000_8.l0;
        c526910KlV.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - c526910KlV.LLLLIIL;
        if (1 <= jCurrentTimeMillis && jCurrentTimeMillis < 500) {
            return;
        }
        ((C526910KlV) akS80S0100000_8.l0).LLLLIIL = System.currentTimeMillis();
        ((C526910KlV) akS80S0100000_8.l0).LLLLLLIL();
    }

    public static final void LIZ$8(AkS80S0100000_8 akS80S0100000_8, View view) {
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        ShortVideoContext shortVideoContext = ((C526910KlV) akS80S0100000_8.l0).LLLJIL;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null) {
            creativeModel2.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
        }
        ShortVideoContext shortVideoContext2 = ((C526910KlV) akS80S0100000_8.l0).LLLJIL;
        if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null) {
            creativeModel.liveRecordModel = new LiveRecordModel(new ArrayList());
        }
        C526910KlV.LLLLLL((C526910KlV) akS80S0100000_8.l0, false, false, 7);
    }

    public static final void LIZ$9(AkS80S0100000_8 akS80S0100000_8, View view) {
        ((p) akS80S0100000_8.l0).LLLLIL().LIZ.invoke();
    }

    public AkS80S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS80S0100000_8(long j, C554260LoW c554260LoW, int i) {
        super(j);
        this.$t = i;
        this.l0 = c554260LoW;
    }
}
