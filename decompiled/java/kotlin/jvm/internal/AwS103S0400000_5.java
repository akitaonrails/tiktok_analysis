package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C0ECU;
import X.C0EHK;
import X.C0EJZ;
import X.C0ELJ;
import X.C0EQZ;
import X.C0ET4;
import X.C0EZJ;
import X.C0FAJ;
import X.C0FIG;
import X.C0LAB;
import X.C0XQS;
import X.C0XQT;
import X.C0XTR;
import X.C1397620mTQ;
import X.C1602160rnK;
import X.C189200o6;
import X.C19EG;
import X.C1DRG;
import X.C20684815ws;
import X.C23260099m;
import X.C289250BVj;
import X.C301730BsB;
import X.C301740BsC;
import X.C348100Dkm;
import X.C349560Dn8;
import X.C353560Dta;
import X.C357590E0f;
import X.C357740E0u;
import X.C357770E0x;
import X.C360510EBl;
import X.C360690ECd;
import X.C360920EDa;
import X.C360930EDb;
import X.C361850EGp;
import X.C364240EPu;
import X.C372480Ej0;
import X.C372500Ej2;
import X.C376610Epf;
import X.C377120EqU;
import X.C383990F3t;
import X.C385050F7v;
import X.C388470FKz;
import X.C418440Gaw;
import X.C426750GoL;
import X.C559610Lx9;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC356070Dxd;
import X.InterfaceC1364105Vn;
import X.InterfaceC1446740nke;
import X.InterfaceC1455860nzM;
import X.InterfaceC1456070nzh;
import X.InterfaceC364330EQd;
import android.app.Activity;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AwS103S0400000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        Pair<Long, Long> pairQ3 = ((C0EQZ) awS103S0400000_5.l0).Q3((NLETrackSlot) awS103S0400000_5.l1);
        long jLongValue = pairQ3.getFirst().longValue();
        long jLongValue2 = pairQ3.getSecond().longValue();
        C0EQZ c0eqz = (C0EQZ) awS103S0400000_5.l0;
        InterfaceC364330EQd interfaceC364330EQd = (InterfaceC364330EQd) awS103S0400000_5.l2;
        LyricStickerModel lyricStickerModel = (LyricStickerModel) awS103S0400000_5.l3;
        BaseStickerModel baseStickerModel = lyricStickerModel.getBaseStickerModel();
        long measuredStartTime = ((NLETrackSlot) awS103S0400000_5.l1).getMeasuredStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        C0EQZ.Z4(c0eqz, interfaceC364330EQd, lyricStickerModel.copy(BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, measuredStartTime / j, ((NLETrackSlot) awS103S0400000_5.l1).getMeasuredEndTime() / j, false, ((NLETrackSlot) awS103S0400000_5.l1).getMeasuredStartTime() / j, ((NLETrackSlot) awS103S0400000_5.l1).getMeasuredEndTime() / j, false, 0.0f, null, null, null, false, -905969665, 15, null), lyricStickerModel.uuid, jLongValue, jLongValue2, lyricStickerModel.musicId, lyricStickerModel.lyricId, lyricStickerModel.musicName, lyricStickerModel.lyricStyleUrs, lyricStickerModel.selectedFrom, lyricStickerModel.lyricStyleEffectId, lyricStickerModel.recommendWidth, lyricStickerModel.recommendHeight, lyricStickerModel.initialTrimInfo, lyricStickerModel.textStickerModels, lyricStickerModel.fallbackFonts, lyricStickerModel.enabled), (C348100Dkm) obj, EnumC356070Dxd.COMMIT);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C360690ECd c360690ECd;
        C0EJZ resourceMultiTab;
        C0EJZ c0ejz;
        C0EJZ resourceMultiTab2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!((C360920EDa) awS103S0400000_5.l0).mViewDestroyed) {
            C360920EDa c360920EDa = (C360920EDa) awS103S0400000_5.l0;
            View viewRequireView = c360920EDa.requireView();
            KeyEvent.Callback callbackFindViewById = c360920EDa.LLLFFI;
            if (callbackFindViewById == null) {
                callbackFindViewById = viewRequireView.findViewById(R.id.yi7);
                c360920EDa.LLLFFI = (LinearLayout) callbackFindViewById;
            }
            LinearLayout linearLayout = (LinearLayout) callbackFindViewById;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            if (zBooleanValue) {
                C360690ECd c360690ECd2 = (C360690ECd) awS103S0400000_5.l1;
                int visibility = c360690ECd2.getVisibility();
                c360690ECd2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c360690ECd2);
                if (C360510EBl.LIZ(((C357590E0f) awS103S0400000_5.l2).LIZIZ)) {
                    ((C360920EDa) awS103S0400000_5.l0).LLLLZ(false);
                    ((C360920EDa) awS103S0400000_5.l0).LLLLLZL(false);
                } else {
                    ((C360920EDa) awS103S0400000_5.l0).LLLLZ(true);
                    ((C360920EDa) awS103S0400000_5.l0).LLLLLZL(true);
                }
                if (((C360690ECd) awS103S0400000_5.l1).getCategoryList().size() > 1) {
                    C360920EDa c360920EDa2 = (C360920EDa) awS103S0400000_5.l0;
                    c360920EDa2.getClass();
                    if (C301740BsC.LIZ() && ((c360690ECd = c360920EDa2.LLLII) == null || (resourceMultiTab2 = c360690ECd.getResourceMultiTab()) == null || resourceMultiTab2.getVisibility() != 0)) {
                        C360690ECd c360690ECd3 = c360920EDa2.LLLII;
                        if (c360690ECd3 != null && c360690ECd3.getResourceMultiTab() != null && (!c360920EDa2.LLLIL)) {
                            View viewRequireView2 = c360920EDa2.requireView();
                            View viewFindViewById = c360920EDa2.LLJLILLLLZIIL;
                            if (viewFindViewById == null) {
                                viewFindViewById = viewRequireView2.findViewById(R.id.wyb);
                                c360920EDa2.LLJLILLLLZIIL = (LinearLayout) viewFindViewById;
                            }
                            if (viewFindViewById != null) {
                                C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 0, 0, 16);
                            }
                        }
                        C360690ECd c360690ECd4 = c360920EDa2.LLLII;
                        if (c360690ECd4 != null && (c0ejz = c360690ECd4.LLILZLL) != null) {
                            C786410Ut5.L1(c0ejz, 0);
                        }
                        c360920EDa2.LLLLIL().cc();
                        C360690ECd c360690ECd5 = c360920EDa2.LLLII;
                        if (c360690ECd5 != null && (resourceMultiTab = c360690ECd5.getResourceMultiTab()) != null) {
                            resourceMultiTab.LJIIIIZZ();
                        }
                    }
                }
                LinearLayout linearLayoutLLLLLLZ = ((C360920EDa) awS103S0400000_5.l0).LLLLLLZ();
                if (linearLayoutLLLLLLZ != null) {
                    C786410Ut5.LJZL(8, linearLayoutLLLLLLZ);
                }
                if (!((C360930EDb) awS103S0400000_5.l3).LIZ) {
                    C0ECU c0ecu = (C0ECU) ((C360920EDa) awS103S0400000_5.l0).LLLIIIL.getValue();
                    if (c0ecu != null) {
                        c0ecu.LJII();
                    }
                    ((C360930EDb) awS103S0400000_5.l3).LIZ = true;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        InterfaceC1456070nzh interfaceC1456070nzh = (InterfaceC1456070nzh) awS103S0400000_5.l0;
        if (interfaceC1456070nzh != null) {
            interfaceC1456070nzh.ij((InterfaceC1455860nzM) awS103S0400000_5.l1, (VideoPublishEditModel) awS103S0400000_5.l2);
        }
        ((Function0) awS103S0400000_5.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131858283, new AwS103S0400000_5((InterfaceC1456070nzh) awS103S0400000_5.l0, (InterfaceC1456070nzh) awS103S0400000_5.l1, (InterfaceC1455860nzM) awS103S0400000_5.l2, (VideoPublishEditModel) awS103S0400000_5.l3, (Function0<Unit>) 10));
        c1397620mTQ.LJII(2131858282, null);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C383990F3t c383990F3t = C383990F3t.LIZ;
        C0E48 c0e48 = (C0E48) awS103S0400000_5.l0;
        c383990F3t.getClass();
        C353560Dta.LIZ.getClass();
        C353560Dta.LJIIJJI(c0e48);
        C385050F7v.LJ(c0e48.LLFII().LJI());
        Function1 function1 = (Function1) awS103S0400000_5.l1;
        if (function1 != null) {
            function1.invoke((NLETrackSlot) awS103S0400000_5.l2);
        }
        C377120EqU c377120EqU = C377120EqU.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS103S0400000_5.l3;
        C0E48 c0e482 = (C0E48) awS103S0400000_5.l0;
        c377120EqU.getClass();
        if (videoPublishEditModel != null) {
            C0LAB c0labLIZJ = C377120EqU.LIZJ(videoPublishEditModel, c0e482);
            c0labLIZJ.LJ("click_button_name", "click_apply");
            C20684815ws.LJIILLIIL("remove_magic_popup_click", c0labLIZJ.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(R.string.effect_tool_templateadd_confirm, new AwS103S0400000_5((C0E48) awS103S0400000_5.l0, (C0E48) awS103S0400000_5.l1, (Function1<? super NLETrackSlot, Unit>) awS103S0400000_5.l2, (NLETrackSlot) awS103S0400000_5.l3, (VideoPublishEditModel) 12));
        c1397620mTQ.LJII(2131833383, new AwS371S0200000_5((VideoPublishEditModel) awS103S0400000_5.l3, (C0E48) awS103S0400000_5.l0, 274));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        if (C289250BVj.LIZ((VideoPublishEditModel) awS103S0400000_5.l0) && C349560Dn8.LJFF((NLEModel) awS103S0400000_5.l1)) {
            InlineCaptionFragment inlineCaptionFragment = (InlineCaptionFragment) awS103S0400000_5.l2;
            inlineCaptionFragment.LLLIIL = true;
            ((C361850EGp) awS103S0400000_5.l3).LJIIL(inlineCaptionFragment);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131828407, new AwS371S0200000_5((C361850EGp) awS103S0400000_5.l0, (InlineCaptionFragment) awS103S0400000_5.l1, 304));
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS103S0400000_5.l2;
        c1397620mTQ.LJII(2131828405, new AwS103S0400000_5((NLEModel) awS103S0400000_5.l3, videoPublishEditModel, (C361850EGp) awS103S0400000_5.l0, (InlineCaptionFragment) awS103S0400000_5.l1, 14));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS103S0400000_5.l0;
        CommerceToolsTcmServiceImpl commerceToolsTcmServiceImpl = (CommerceToolsTcmServiceImpl) awS103S0400000_5.l1;
        AwemeDraft awemeDraft = (AwemeDraft) awS103S0400000_5.l2;
        JSONObject jSONObject = (JSONObject) awS103S0400000_5.l3;
        commerceToolsTcmServiceImpl.getClass();
        CommerceToolsTcmServiceImpl.LJIJJ(awemeDraft, jSONObject);
        C189200o6.m2constructorimpl(awemeDraft);
        interfaceC1364105Vn.resumeWith(awemeDraft);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131849978, new AwS103S0400000_5((InterfaceC1364105Vn) awS103S0400000_5.l0, (InterfaceC1364105Vn<? super AwemeDraft>) awS103S0400000_5.l1, (CommerceToolsTcmServiceImpl) awS103S0400000_5.l2, (AwemeDraft) awS103S0400000_5.l3, (JSONObject) 16));
        c1397620mTQ.LJII(2131849977, new AwS584S0100000_5((InterfaceC1364105Vn) awS103S0400000_5.l0, (InterfaceC1364105Vn<? super AwemeDraft>) 1220));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        FrameLayout frameLayout = (FrameLayout) awS103S0400000_5.l1;
        FrameLayout frameLayout2 = (FrameLayout) awS103S0400000_5.l2;
        frameLayout.getContext();
        C388470FKz c388470FKz = new C388470FKz(frameLayout, frameLayout2, new C0FIG(), ((C0FAJ) awS103S0400000_5.l3).LIZIZ, (C1DRG) obj);
        ((C0FAJ) awS103S0400000_5.l0).LIZ.getClass();
        c388470FKz.afterInit$als_release(jUptimeMillis);
        return c388470FKz;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C0EZJ c0ezj = new C0EZJ((C372500Ej2) awS103S0400000_5.l1, (C372480Ej0) awS103S0400000_5.l2, new AwS546S0100000_2((Function1) awS103S0400000_5.l3, (Function1<? super Boolean, Unit>) 882), (C1DRG) obj);
        ((C559610Lx9) awS103S0400000_5.l0).getClass();
        c0ezj.afterInit$als_release(jUptimeMillis);
        return c0ezj;
    }

    public static final Object invoke$4(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C19EG c19eg;
        if (C301730BsB.LIZ()) {
            Activity activity = ((C376610Epf) awS103S0400000_5.l0).LIZIZ.mActivity;
            if (activity instanceof C19EG) {
                c19eg = (C19EG) activity;
            } else {
                c19eg = null;
            }
            C0EHK.LJIIL(c19eg);
        }
        ((C376610Epf) awS103S0400000_5.l0).LJ((Function2) awS103S0400000_5.l1, (C0E48) awS103S0400000_5.l2, (C0ELJ) awS103S0400000_5.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(R.string.fte, new AwS103S0400000_5((C376610Epf) awS103S0400000_5.l0, (C376610Epf) awS103S0400000_5.l1, (Function2<? super Boolean, ? super Boolean, Unit>) awS103S0400000_5.l2, (C0E48) awS103S0400000_5.l3, (C0ELJ) 4));
        c1397620mTQ.LJII(2131830680, AFwS234S0000000_5.get$arr$(373));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        ((Function1) awS103S0400000_5.l0).invoke("upload_authorization_popup_continue");
        if (!((C364240EPu) awS103S0400000_5.l1).LIZ.isLogin()) {
            C364240EPu c364240EPu = (C364240EPu) awS103S0400000_5.l1;
            C19EG c19eg = (C19EG) awS103S0400000_5.l2;
            final IAccountUserService iAccountUserService = c364240EPu.LIZ;
            ILoginService iLoginServiceLIZJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ();
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZ = c19eg;
            c0xqs.LJ = new C0XTR() { // from class: X.0EQH
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj2) {
                    if (i == 1 && i2 == 1) {
                        Keva keva = C357770E0x.LIZ;
                        C357740E0u.LIZ(iAccountUserService.getCurUserId());
                    }
                }
            };
            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
        } else {
            Keva keva = C357770E0x.LIZ;
            C357740E0u.LIZ(((C364240EPu) awS103S0400000_5.l1).LIZ.getCurUserId());
            Function0 function0 = (Function0) awS103S0400000_5.l3;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131833307, new AwS103S0400000_5((Function1) awS103S0400000_5.l0, (Function1<? super String, Unit>) awS103S0400000_5.l1, (C364240EPu) awS103S0400000_5.l2, (C19EG) awS103S0400000_5.l3, (Function0<Unit>) 6));
        c1397620mTQ.LJII(2131833306, new AwS584S0100000_5((Function1) awS103S0400000_5.l0, (Function1<? super NLETrackSlot, Unit>) 943));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        InterfaceC1456070nzh interfaceC1456070nzh = (InterfaceC1456070nzh) awS103S0400000_5.l0;
        if (interfaceC1456070nzh != null) {
            interfaceC1456070nzh.ij((InterfaceC1455860nzM) awS103S0400000_5.l1, (VideoPublishEditModel) awS103S0400000_5.l2);
        }
        ((Function0) awS103S0400000_5.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS103S0400000_5 awS103S0400000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131858283, new AwS103S0400000_5((InterfaceC1456070nzh) awS103S0400000_5.l0, (InterfaceC1456070nzh) awS103S0400000_5.l1, (InterfaceC1455860nzM) awS103S0400000_5.l2, (VideoPublishEditModel) awS103S0400000_5.l3, (Function0<Unit>) 8));
        c1397620mTQ.LJII(2131858282, null);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS103S0400000_5(com.bytedance.ies.nle.editor_jni.NLEModel r3, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, X.C361850EGp r5, com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 14 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.l2 = r4
            r1.l3 = r3
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r6
            r1.l3 = r5
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS103S0400000_5.<init>(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0EGp, com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0400000_5(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn2, CommerceToolsTcmServiceImpl commerceToolsTcmServiceImpl, AwemeDraft awemeDraft, JSONObject jSONObject) {
        super(1);
        this.$t = jSONObject;
        this.l0 = interfaceC1364105Vn;
        this.l1 = interfaceC1364105Vn2;
        this.l2 = commerceToolsTcmServiceImpl;
        this.l3 = awemeDraft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0400000_5(C23260099m c23260099m, CommerceToolsTcmServiceImpl commerceToolsTcmServiceImpl, AwemeDraft awemeDraft, JSONObject jSONObject, int i) {
        super(1);
        this.$t = i;
        this.l0 = c23260099m;
        this.l1 = commerceToolsTcmServiceImpl;
        this.l2 = awemeDraft;
        this.l3 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0400000_5(C0E48 c0e48, C0E48 c0e482, Function1<? super NLETrackSlot, Unit> function1, NLETrackSlot nLETrackSlot, VideoPublishEditModel videoPublishEditModel) {
        super(1);
        this.$t = videoPublishEditModel;
        this.l0 = c0e48;
        this.l1 = c0e482;
        this.l2 = function1;
        this.l3 = nLETrackSlot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0400000_5(C360920EDa c360920EDa, C360690ECd c360690ECd, C357590E0f c357590E0f, C360930EDb c360930EDb, int i) {
        super(1);
        this.$t = i;
        this.l0 = c360920EDa;
        this.l1 = c360690ECd;
        this.l2 = c357590E0f;
        this.l3 = c360930EDb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0400000_5(C0EQZ c0eqz, NLETrackSlot nLETrackSlot, InterfaceC364330EQd interfaceC364330EQd, LyricStickerModel lyricStickerModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0eqz;
        this.l1 = nLETrackSlot;
        this.l2 = interfaceC364330EQd;
        this.l3 = lyricStickerModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0400000_5(C376610Epf c376610Epf, C376610Epf c376610Epf2, Function2<? super Boolean, ? super Boolean, Unit> function2, C0E48 c0e48, C0ELJ c0elj) {
        super(1);
        this.$t = c0elj;
        this.l0 = c376610Epf;
        this.l1 = c376610Epf2;
        this.l2 = function2;
        this.l3 = c0e48;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0400000_5(InterfaceC1456070nzh interfaceC1456070nzh, InterfaceC1446740nke interfaceC1446740nke, VideoPublishEditModel videoPublishEditModel, Function0 function0, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1456070nzh;
        this.l1 = interfaceC1446740nke;
        this.l2 = videoPublishEditModel;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0400000_5(InterfaceC1456070nzh interfaceC1456070nzh, InterfaceC1446740nke interfaceC1446740nke, VideoPublishEditModel videoPublishEditModel, AwS423S0200000_22 awS423S0200000_22, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1456070nzh;
        this.l1 = interfaceC1446740nke;
        this.l2 = videoPublishEditModel;
        this.l3 = awS423S0200000_22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0400000_5(InterfaceC1456070nzh interfaceC1456070nzh, InterfaceC1456070nzh interfaceC1456070nzh2, InterfaceC1455860nzM interfaceC1455860nzM, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = interfaceC1456070nzh;
        this.l1 = interfaceC1456070nzh2;
        this.l2 = interfaceC1455860nzM;
        this.l3 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS103S0400000_5(Function1 function1, Function1<? super String, Unit> function12, C364240EPu c364240EPu, C19EG c19eg, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c364240EPu;
        this.l3 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0400000_5(C0ET4 c0et4, C0FAJ c0faj, FrameLayout frameLayout, FrameLayout frameLayout2, C0FAJ c0faj2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0faj;
        this.l1 = frameLayout;
        this.l2 = frameLayout2;
        this.l3 = c0faj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S0400000_5(C0ET4 c0et4, C559610Lx9 c559610Lx9, C372500Ej2 c372500Ej2, C372480Ej0 c372480Ej0, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = c372500Ej2;
        this.l2 = c372480Ej0;
        this.l3 = function1;
    }
}
