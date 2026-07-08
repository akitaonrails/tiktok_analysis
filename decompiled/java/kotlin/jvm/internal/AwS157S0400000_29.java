package kotlin.jvm.internal;

import X.C036E;
import X.C09AY;
import X.C09R7;
import X.C0CHQ;
import X.C0FLC;
import X.C1067090dsJ;
import X.C11ES;
import X.C11G7;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13IQ;
import X.C1428470nHB;
import X.C1429500nIq;
import X.C1456770o0p;
import X.C194349111v;
import X.C19510811Va;
import X.C19510911Vb;
import X.C19512911Vv;
import X.C19513311Vz;
import X.C19513411Wa;
import X.C19513511Wb;
import X.C19568211hA;
import X.C19582211jQ;
import X.C19582411jS;
import X.C19600411mM;
import X.C19600511mN;
import X.C19600811mQ;
import X.C19601311mV;
import X.C19628611qu;
import X.C19EG;
import X.C19GS;
import X.C20612915lH;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import X.C547790Le5;
import X.C705930RmZ;
import X.C785410UrT;
import X.EnumC1430380nKG;
import X.EnumC19513211Vy;
import X.InterfaceC1075600e62;
import X.InterfaceC1766500w4O;
import X.InterfaceC19511611Vi;
import X.InterfaceC19568511hD;
import X.InterfaceC20613315lL;
import X.InterfaceC710290Rtb;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.p;
import com.google.gson.q;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import com.ss.android.ugc.aweme.services.IArticleModeAnchorService;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.audioservice.service.debugtool.SamiDebugToolServiceImpl;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsViewModel;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS157S0400000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x099d  */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.ss.android.ugc.aweme.topic.movie.IMovieTokService] */
    /* JADX WARN: Type inference failed for: r2v54, types: [com.ss.android.ugc.aweme.topic.book.IBookTokService] */
    /* JADX WARN: Type inference failed for: r3v65, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v39, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$7(kotlin.jvm.internal.AwS157S0400000_29 r32) throws org.json.JSONException, java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 4638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS157S0400000_29.invoke$7(kotlin.jvm.internal.AwS157S0400000_29):java.lang.Object");
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_MultiAnchorPublishEditPostExtension$onAddClick$2$1$1_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable$0(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_MultiAnchorPublishExtension$onAddClick$6$1$1_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable$1(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final Object invoke$0(AwS157S0400000_29 awS157S0400000_29) {
        Context context = (Context) awS157S0400000_29.l0;
        C19582211jQ c19582211jQ = (C19582211jQ) awS157S0400000_29.l1;
        return new C19582411jS(context, c19582211jQ, (InteractStickerStruct) awS157S0400000_29.l2, (C705930RmZ) awS157S0400000_29.l3, c19582211jQ.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS157S0400000_29 awS157S0400000_29) {
        Fragment fragment = (Fragment) awS157S0400000_29.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS157S0400000_29.l1).invoke(), C09R7.LIZ((C13IQ) awS157S0400000_29.l2));
        Function2 function2 = (Function2) awS157S0400000_29.l3;
        Fragment fragment2 = (Fragment) awS157S0400000_29.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(ChallengeDetailJediViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS395S0200000_29(function2, fragment2, 9));
        return jediViewModel;
    }

    public static final Object invoke$10(AwS157S0400000_29 awS157S0400000_29) {
        boolean z;
        final C19628611qu c19628611qu = (C19628611qu) awS157S0400000_29.l0;
        C20612915lH c20612915lH = C20612915lH.LIZIZ;
        final Function1 function1 = (Function1) awS157S0400000_29.l3;
        InterfaceC20613315lL interfaceC20613315lL = new InterfaceC20613315lL() { // from class: X.11qw
            @Override // X.InterfaceC20613315lL
            public final void Af() {
            }

            @Override // X.InterfaceC20613315lL
            public final void M8(String str, String str2, C316530Cax c316530Cax, String str3) {
            }

            @Override // X.InterfaceC20613315lL
            public final void Wj(String str, C316530Cax c316530Cax, String str2) {
            }

            @Override // X.InterfaceC20613315lL
            public final void g1(String str, boolean z2) {
            }

            @Override // X.InterfaceC20613315lL
            public final void ld(int i) {
            }

            @Override // X.InterfaceC20613315lL
            public final void qj(User user) {
            }

            @Override // X.InterfaceC20613315lL
            public final void LLJI() {
                InterfaceC1356670lPN interfaceC1356670lPN = c19628611qu.LLILLJJLI;
                if (interfaceC1356670lPN != null) {
                    interfaceC1356670lPN.LLJI();
                }
            }

            @Override // X.InterfaceC20613315lL
            public final String getCreationId() {
                return c19628611qu.getEditModel().getCreationId();
            }

            @Override // X.InterfaceC20613315lL
            public final int lk() {
                return c19628611qu.getEditModel().creativeModel.storyModel.getPrivateAccountAllowReshareStoryType();
            }

            @Override // X.InterfaceC20613315lL
            public final void r6(int i) {
                c19628611qu.getEditModel().creativeModel.storyModel.setPrivateAccountAllowReshareStoryType(i);
            }

            @Override // X.InterfaceC20613315lL
            public final void Mi(User user, boolean z2, String str, String str2, int i) {
                function1.invoke(user);
            }
        };
        C19EG c19eg = (C19EG) awS157S0400000_29.l1;
        int id = ((ViewGroup) awS157S0400000_29.l2).getId();
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        String appId = SamiDebugToolServiceImpl.LIZ().getAppId();
        String str = ((C19628611qu) awS157S0400000_29.l0).getEditModel().mShootWay;
        String strLJIILIIL = C1428470nHB.LJIILIIL(((C19628611qu) awS157S0400000_29.l0).getEditModel());
        String strLJIILL = C1428470nHB.LJIILL(((C19628611qu) awS157S0400000_29.l0).getEditModel());
        C1456770o0p c1456770o0pX1 = ((C19628611qu) awS157S0400000_29.l0).X1();
        if (c1456770o0pX1 != null && c1456770o0pX1.LIZ) {
            z = true;
        } else {
            z = false;
        }
        c19628611qu.LLILLJJLI = c20612915lH.LJIIIZ(interfaceC20613315lL, c19eg, id, currentUserID, appId, str, strLJIILIIL, strLJIILL, z, null, null);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$11(AwS157S0400000_29 awS157S0400000_29) {
        Fragment fragment = (Fragment) awS157S0400000_29.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS157S0400000_29.l1).invoke(), C09R7.LIZ((C13IQ) awS157S0400000_29.l2));
        Function2 function2 = (Function2) awS157S0400000_29.l3;
        Fragment fragment2 = (Fragment) awS157S0400000_29.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(EffectProfileListViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS395S0200000_29(function2, fragment2, 48));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$12(AwS157S0400000_29 awS157S0400000_29) {
        Fragment fragment = (Fragment) awS157S0400000_29.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS157S0400000_29.l1).invoke(), C09R7.LIZ((C13IQ) awS157S0400000_29.l2));
        Function2 function2 = (Function2) awS157S0400000_29.l3;
        Fragment fragment2 = (Fragment) awS157S0400000_29.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(PushSettingNotificationChoiceViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS395S0200000_29(function2, fragment2, 49));
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$13(AwS157S0400000_29 awS157S0400000_29) {
        Fragment fragment = (Fragment) awS157S0400000_29.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS157S0400000_29.l1).invoke(), C09R7.LIZ((C13IQ) awS157S0400000_29.l2));
        Function2 function2 = (Function2) awS157S0400000_29.l3;
        Fragment fragment2 = (Fragment) awS157S0400000_29.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(PostNotificationSettingsViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS395S0200000_29(function2, fragment2, 51));
        return jediViewModel;
    }

    public static final Object invoke$14(AwS157S0400000_29 awS157S0400000_29) {
        Object obj = awS157S0400000_29.l0;
        if (obj != null) {
            InterfaceC19568511hD interfaceC19568511hD = (InterfaceC19568511hD) awS157S0400000_29.l2;
            C19568211hA c19568211hA = (C19568211hA) awS157S0400000_29.l3;
            if (interfaceC19568511hD != null) {
                c19568211hA.LJ().put(obj, interfaceC19568511hD);
            }
        }
        Function0 function0 = (Function0) awS157S0400000_29.l1;
        if (function0 != null) {
            function0.invoke();
            return function0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AwS157S0400000_29 awS157S0400000_29) {
        String stickerId;
        Challenge challenge = (Challenge) ((ListenableFuture) awS157S0400000_29.l0).get();
        if (challenge != null) {
            stickerId = challenge.getStickerId();
        } else {
            stickerId = null;
        }
        ((SmartRoute) ((C259800zU) awS157S0400000_29.l1).element).withParam("is_bundled", !TextUtils.isEmpty(stickerId) ? 1 : 0);
        ((SmartRoute) ((C259800zU) awS157S0400000_29.l1).element).open();
        ((C11ES) awS157S0400000_29.l2).I5(((StringBuilder) awS157S0400000_29.l3).toString(), stickerId);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS157S0400000_29 awS157S0400000_29) {
        Context context = (Context) awS157S0400000_29.l0;
        C19601311mV c19601311mV = (C19601311mV) awS157S0400000_29.l1;
        return new C19600411mM(context, c19601311mV, c19601311mV.LJIIIZ, (C705930RmZ) awS157S0400000_29.l2, c19601311mV.LJIIJ);
    }

    public static final Object invoke$17(AwS157S0400000_29 awS157S0400000_29) {
        Context context = (Context) awS157S0400000_29.l0;
        C19600811mQ c19600811mQ = (C19600811mQ) awS157S0400000_29.l1;
        return new C19600511mN(context, c19600811mQ, c19600811mQ.LJIIIZ, (C705930RmZ) awS157S0400000_29.l2, c19600811mQ.LJIIJ, (View) awS157S0400000_29.l3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$2(AwS157S0400000_29 awS157S0400000_29) {
        Fragment fragment = (Fragment) awS157S0400000_29.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS157S0400000_29.l1).invoke(), C09R7.LIZ((C13IQ) awS157S0400000_29.l2));
        Function2 function2 = (Function2) awS157S0400000_29.l3;
        Fragment fragment2 = (Fragment) awS157S0400000_29.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(TrendsTabViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS395S0200000_29(function2, fragment2, 10));
        return jediViewModel;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS157S0400000_29 awS157S0400000_29) {
        String str;
        String strLIZ;
        String str2;
        C19512911Vv c19512911VvLIZIZ;
        MobParam mobParam;
        MobParam mobParam2;
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_MultiAnchorPublishEditPostExtension$onAddClick$2$1$1_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable$0(((View) awS157S0400000_29.l0).getContext())) {
            C1389890mGx c1389890mGx = new C1389890mGx((View) awS157S0400000_29.l0);
            c1389890mGx.LJIIIZ(2131829876);
            c1389890mGx.LJIIJJI();
            C11G7 c11g7 = ((C19510911Vb) awS157S0400000_29.l1).LLIZ;
            if (c11g7 != null) {
                c11g7.dismiss();
                C785410UrT.LIZ(c11g7);
            }
        } else {
            C11G7 c11g72 = ((C19510911Vb) awS157S0400000_29.l1).LLIZ;
            boolean zEnableToastCenter = false;
            if (c11g72 != null && c11g72.LJLI()) {
                IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
                if (iAVPublishPageUIRefactorService != null) {
                    zEnableToastCenter = iAVPublishPageUIRefactorService.enableToastCenter();
                }
                if (zEnableToastCenter) {
                    C1389880mGw c1389880mGw = new C1389880mGw(c11g72);
                    c1389880mGw.LJIIIIZZ(2131826558);
                    c1389880mGw.LIZ(true);
                    c1389880mGw.LJIIJ();
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c11g72);
                    c1389890mGx2.LJIIIZ(2131826558);
                    c1389890mGx2.LIZ(true);
                    c1389890mGx2.LJIIJJI();
                }
            } else {
                C2344009Gk c2344009Gk = new C2344009Gk();
                ExtensionMisc extensionMisc = ((C19510911Vb) awS157S0400000_29.l1).LLILLL;
                String str3 = null;
                if (extensionMisc != null && (mobParam2 = extensionMisc.mobParam) != null) {
                    str = mobParam2.enterFrom;
                } else {
                    str = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LIZJ(((AnchorPublishStruct) awS157S0400000_29.l2).type, "business_type");
                c2344009Gk.LIZJ(((AnchorPublishStruct) awS157S0400000_29.l2).isNew ? 1 : 0, "new_tag");
                if (((AnchorPublishStruct) awS157S0400000_29.l2).type == EnumC1430380nKG.THIRD_PART_GENERAL.getTYPE()) {
                    AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) awS157S0400000_29.l2;
                    strLIZ = anchorPublishStruct.subtype;
                    if (strLIZ == null) {
                        strLIZ = C1429500nIq.LIZ(anchorPublishStruct.type);
                    }
                } else {
                    strLIZ = C1429500nIq.LIZ(((AnchorPublishStruct) awS157S0400000_29.l2).type);
                }
                c2344009Gk.LJIIIIZZ("anchor_type", strLIZ);
                String str4 = ((AnchorPublishStruct) awS157S0400000_29.l2).subtype;
                if (str4 == null) {
                    str4 = "";
                }
                c2344009Gk.LJIIIIZZ("sub_type", str4);
                if (C1067090dsJ.LIZ(((AnchorPublishStruct) awS157S0400000_29.l2).type)) {
                    str2 = "Lemon8 | app";
                } else {
                    str2 = ((AnchorPublishStruct) awS157S0400000_29.l2).title;
                }
                c2344009Gk.LJIIIIZZ("anchor_name", str2);
                ExtensionMisc extensionMisc2 = ((C19510911Vb) awS157S0400000_29.l1).LLILLL;
                if (extensionMisc2 != null && (mobParam = extensionMisc2.mobParam) != null) {
                    str3 = mobParam.shootWay;
                }
                c2344009Gk.LJIIIIZZ("shoot_way", str3);
                c2344009Gk.LIZJ(1, "is_editing_post");
                C20684815ws.LJIILLIIL("add_label", c2344009Gk.LIZ);
                int i = ((AnchorPublishStruct) awS157S0400000_29.l2).type;
                EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.NEWS;
                if (i == enumC1430380nKG.getTYPE()) {
                    C19510911Vb c19510911Vb = (C19510911Vb) awS157S0400000_29.l1;
                    List list = (List) awS157S0400000_29.l3;
                    Integer numValueOf = Integer.valueOf(enumC1430380nKG.getTYPE());
                    c19510911Vb.getClass();
                    if (list != null && !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int i2 = ((AnchorPublishStruct) it2.next()).type;
                            if (numValueOf != null && i2 == numValueOf.intValue()) {
                                View view = (View) awS157S0400000_29.l0;
                                C19510911Vb c19510911Vb2 = (C19510911Vb) awS157S0400000_29.l1;
                                AnchorPublishStruct anchorPublishStruct2 = (AnchorPublishStruct) awS157S0400000_29.l2;
                                InterfaceC710290Rtb interfaceC710290RtbLIZ = C19513411Wa.LIZ();
                                if (interfaceC710290RtbLIZ != null && (c19512911VvLIZIZ = ((C19513511Wb) interfaceC710290RtbLIZ).LIZIZ()) != null) {
                                    c19512911VvLIZIZ.LJFF(view.getContext(), new AwS430S0200000_29(c19510911Vb2, anchorPublishStruct2, 20));
                                }
                            }
                        }
                    }
                    C11G7 c11g73 = ((C19510911Vb) awS157S0400000_29.l1).LLIZ;
                    if (c11g73 != null) {
                        c11g73.dismiss();
                        C785410UrT.LIZ(c11g73);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS157S0400000_29 awS157S0400000_29) {
        View view;
        Context context;
        C19512911Vv c19512911VvLIZIZ;
        if (((AnchorTransData) awS157S0400000_29.l0).businessType == EnumC1430380nKG.NEWS.getTYPE() && (view = ((C19510911Vb) awS157S0400000_29.l1).LLILZ) != null && (context = view.getContext()) != null) {
            C19510911Vb c19510911Vb = (C19510911Vb) awS157S0400000_29.l1;
            UrlModel urlModel = (UrlModel) awS157S0400000_29.l2;
            List list = (List) awS157S0400000_29.l3;
            AnchorTransData anchorTransData = (AnchorTransData) awS157S0400000_29.l0;
            InterfaceC710290Rtb interfaceC710290RtbLIZ = C19513411Wa.LIZ();
            if (interfaceC710290RtbLIZ != null && (c19512911VvLIZIZ = ((C19513511Wb) interfaceC710290RtbLIZ).LIZIZ()) != null) {
                c19512911VvLIZIZ.LJFF(context, new AwS157S0400000_29(c19510911Vb, urlModel, anchorTransData, list, 5));
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$5(AwS157S0400000_29 awS157S0400000_29) {
        boolean z;
        Object next;
        InterfaceC19511611Vi interfaceC19511611Vi;
        String str = "";
        EnumC19513211Vy enumC19513211Vy = EnumC19513211Vy.EDIT;
        ExtensionMisc extensionMisc = ((C19510911Vb) awS157S0400000_29.l0).LLILLL;
        if (extensionMisc != null && (interfaceC19511611Vi = extensionMisc.publishExtensionDataContainer) != null && interfaceC19511611Vi.LJJIIJZLJL()) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        UrlModel urlModel = (UrlModel) awS157S0400000_29.l1;
        List list = (List) awS157S0400000_29.l2;
        String str2 = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((AnchorPublishStruct) next).type == EnumC1430380nKG.NEWS.getTYPE()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) next;
            if (anchorPublishStruct != null) {
                str2 = anchorPublishStruct.content;
            }
        }
        AnchorTransData anchorTransData = (AnchorTransData) awS157S0400000_29.l3;
        String str3 = anchorTransData.title;
        String str4 = anchorTransData.url;
        C19510911Vb c19510911Vb = (C19510911Vb) awS157S0400000_29.l0;
        String str5 = anchorTransData.anchorContent;
        c19510911Vb.getClass();
        try {
            new p();
            if (str5 == null) {
                str5 = "";
            }
            q qVarLJJIJIIJI = p.LIZJ(str5).LJIILIIL().LJJIJIIJI("is_user_custom_title");
            if (qVarLJJIJIIJI != null) {
                String strLJIL = qVarLJJIJIIJI.LJIL();
                if (strLJIL != null) {
                    str = strLJIL;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new C19513311Vz(enumC19513211Vy, boolValueOf, urlModel, str2, null, str3, str4, Boolean.valueOf(Intrinsics.LJFF(str, "true")), Boolean.TRUE, 16);
    }

    public static final Object invoke$6(AwS157S0400000_29 awS157S0400000_29) {
        boolean z;
        IAIPortraitCreationService iAIPortraitCreationServiceLJFF;
        C19512911Vv c19512911VvLIZIZ;
        View view = null;
        if (((AnchorTransData) awS157S0400000_29.l0).businessType == EnumC1430380nKG.ARTICLE_PHOTO_MODE.getTYPE()) {
            String str = ((AnchorTransData) awS157S0400000_29.l0).url;
            if (str != null) {
                C19510811Va c19510811Va = (C19510811Va) awS157S0400000_29.l1;
                IArticleModeAnchorService articleAnchorService = ArticleModeService.INSTANCE.getArticleAnchorService();
                View view2 = c19510811Va.LLILZIL;
                if (view2 != null) {
                    view = view2;
                }
                articleAnchorService.previewArticle(view.getContext(), str);
            }
        } else if (((AnchorTransData) awS157S0400000_29.l0).businessType == EnumC1430380nKG.NEWS.getTYPE()) {
            InterfaceC710290Rtb interfaceC710290RtbLIZ = C19513411Wa.LIZ();
            if (interfaceC710290RtbLIZ != null && (c19512911VvLIZIZ = ((C19513511Wb) interfaceC710290RtbLIZ).LIZIZ()) != null) {
                View view3 = ((C19510811Va) awS157S0400000_29.l1).LLILZIL;
                if (view3 != null) {
                    view = view3;
                }
                c19512911VvLIZIZ.LJFF(view.getContext(), new AwS157S0400000_29((C19510811Va) awS157S0400000_29.l1, (UrlModel) awS157S0400000_29.l2, (AnchorTransData) awS157S0400000_29.l0, (List) awS157S0400000_29.l3, 9));
            }
        } else if (((AnchorTransData) awS157S0400000_29.l0).businessType == EnumC1430380nKG.AI_PORTRAIT_ANCHOR_TYPE.getTYPE()) {
            Fragment fragment = ((C19510811Va) awS157S0400000_29.l1).LLILLL;
            if (fragment == null) {
                fragment = null;
            }
            C19EG activity = fragment.getActivity();
            if ((activity instanceof C19EG) && activity != null) {
                IAIPortraitFeatureService.LIZ.getClass();
                IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
                if (iAIPortraitFeatureServiceLIZ != null && (iAIPortraitCreationServiceLJFF = iAIPortraitFeatureServiceLIZ.LJFF()) != null) {
                    iAIPortraitCreationServiceLJFF.LIZJ(activity);
                }
            }
        } else {
            z = false;
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$8(AwS157S0400000_29 awS157S0400000_29) {
        C19GS c19gs = (C19GS) awS157S0400000_29.l0;
        ViewModel viewModel = ViewModelProviders.of(c19gs, ((InterfaceC1075600e62) c19gs).jl()).get(C09R7.LIZ((C13IQ) awS157S0400000_29.l3).getName(), C09R7.LIZ((C13IQ) awS157S0400000_29.l1));
        Function2 function2 = (Function2) awS157S0400000_29.l2;
        C19GS c19gs2 = (C19GS) awS157S0400000_29.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(ShoutoutsPlayViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS391S0200000_25(function2, c19gs2, 70));
        return jediViewModel;
    }

    public static final Object invoke$9(AwS157S0400000_29 awS157S0400000_29) {
        boolean z;
        Object next;
        String str = "";
        EnumC19513211Vy enumC19513211Vy = EnumC19513211Vy.EDIT;
        InterfaceC19511611Vi interfaceC19511611Vi = ((C19510811Va) awS157S0400000_29.l0).LJIILL().publishExtensionDataContainer;
        if (interfaceC19511611Vi != null && interfaceC19511611Vi.LJJIIJZLJL()) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        UrlModel urlModel = (UrlModel) awS157S0400000_29.l1;
        List list = (List) awS157S0400000_29.l2;
        String str2 = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((AnchorPublishStruct) next).type == EnumC1430380nKG.NEWS.getTYPE()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) next;
            if (anchorPublishStruct != null) {
                str2 = anchorPublishStruct.content;
            }
        }
        AnchorTransData anchorTransData = (AnchorTransData) awS157S0400000_29.l3;
        String str3 = anchorTransData.title;
        String str4 = anchorTransData.url;
        C19510811Va c19510811Va = (C19510811Va) awS157S0400000_29.l0;
        String str5 = anchorTransData.anchorContent;
        c19510811Va.getClass();
        try {
            new p();
            if (str5 == null) {
                str5 = "";
            }
            q qVarLJJIJIIJI = p.LIZJ(str5).LJIILIIL().LJJIJIIJI("is_user_custom_title");
            if (qVarLJJIJIIJI != null) {
                String strLJIL = qVarLJJIJIIJI.LJIL();
                if (strLJIL != null) {
                    str = strLJIL;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new C19513311Vz(enumC19513211Vy, boolValueOf, urlModel, str2, null, str3, str4, Boolean.valueOf(Intrinsics.LJFF(str, "true")), null, 272);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS157S0400000_29(X.C19510811Va r3, com.ss.android.ugc.aweme.base.model.UrlModel r4, com.ss.android.ugc.aweme.creative.model.AnchorTransData r5, java.util.List r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 6 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r5
            r0 = 0
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r6
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS157S0400000_29.<init>(X.11Va, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.creative.model.AnchorTransData, java.util.List, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS157S0400000_29(X.C19510911Vb r3, com.ss.android.ugc.aweme.base.model.UrlModel r4, com.ss.android.ugc.aweme.creative.model.AnchorTransData r5, java.util.List r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 4 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r5
            r0 = 0
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r6
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS157S0400000_29.<init>(X.11Vb, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.creative.model.AnchorTransData, java.util.List, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0400000_29(C19628611qu c19628611qu, C19EG c19eg, ViewGroup viewGroup, C0FLC c0flc, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19628611qu;
        this.l1 = c19eg;
        this.l2 = viewGroup;
        this.l3 = c0flc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0400000_29(C19GS c19gs, C13IQ c13iq, Function2 function2, C13IQ c13iq2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19gs;
        this.l1 = c13iq;
        this.l2 = function2;
        this.l3 = c13iq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0400000_29(Context context, C19582211jQ c19582211jQ, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c19582211jQ;
        this.l2 = interactStickerStruct;
        this.l3 = c705930RmZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0400000_29(Context context, C19600811mQ c19600811mQ, C705930RmZ c705930RmZ, C194349111v c194349111v, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c19600811mQ;
        this.l2 = c705930RmZ;
        this.l3 = c194349111v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0400000_29(Context context, C19601311mV c19601311mV, C705930RmZ c705930RmZ, C194349111v c194349111v, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c19601311mV;
        this.l2 = c705930RmZ;
        this.l3 = c194349111v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS157S0400000_29(View view, View view2, C19510811Va c19510811Va, AnchorPublishStruct anchorPublishStruct, List<AnchorPublishStruct> list) {
        super(0);
        this.$t = list;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = c19510811Va;
        this.l3 = anchorPublishStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS157S0400000_29(View view, View view2, C19510911Vb c19510911Vb, AnchorPublishStruct anchorPublishStruct, List<AnchorPublishStruct> list) {
        super(0);
        this.$t = list;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = c19510911Vb;
        this.l3 = anchorPublishStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS157S0400000_29(Fragment fragment, Function0 function0, C13IQ c13iq, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = function0;
        this.l2 = c13iq;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS157S0400000_29(ListenableFuture listenableFuture, ListenableFuture<Challenge> listenableFuture2, C259800zU<SmartRoute> c259800zU, C11ES c11es, StringBuilder sb) {
        super(0);
        this.$t = sb;
        this.l0 = listenableFuture;
        this.l1 = listenableFuture2;
        this.l2 = c259800zU;
        this.l3 = c11es;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS157S0400000_29(Object obj, Object obj2, Function0<? extends Object> function0, InterfaceC19568511hD<Object, Object> interfaceC19568511hD, C19568211hA<Object, Object> c19568211hA) {
        super(0);
        this.$t = c19568211hA;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = function0;
        this.l3 = interfaceC19568511hD;
    }
}
