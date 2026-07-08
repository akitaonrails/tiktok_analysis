package kotlin.jvm.internal;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C05P0;
import X.C05P1;
import X.C098200Yq;
import X.C09AY;
import X.C0ZIK;
import X.C0ZIU;
import X.C1143000fqk;
import X.C1214520hi6;
import X.C1220690hs3;
import X.C1238380iKa;
import X.C12823050b;
import X.C1345700l7g;
import X.C1356330lOp;
import X.C13IQ;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1836680xta;
import X.C189200o6;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C294780Bgy;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C485430J1x;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C827203La;
import X.C844470XAv;
import X.C987103tV;
import X.InterfaceC1214530hi7;
import X.InterfaceC1218670hon;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1679450tnz;
import X.InterfaceC1686540tzQ;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.minis.model.SafeArea;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS79S0500000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS79S0500000_19 awS79S0500000_19) {
        ((InterfaceC1686540tzQ) awS79S0500000_19.l0).LJIJJ(true);
        InterfaceC1679450tnz interfaceC1679450tnz = (InterfaceC1679450tnz) awS79S0500000_19.l1;
        if (interfaceC1679450tnz != null) {
            interfaceC1679450tnz.hide();
        }
        if (Intrinsics.LJFF(((C05P1) awS79S0500000_19.l4).getValue(), C1238380iKa.LIZ)) {
            ((InvitePageViewModel) awS79S0500000_19.l2).yQ2();
        } else {
            ((Function0) awS79S0500000_19.l3).invoke();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 537);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 538);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 539);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS79S0500000_19 awS79S0500000_19) {
        Object c098200Yq;
        boolean z;
        AssemVMLazy assemVMLazy;
        try {
            c098200Yq = C827203La.LIZIZ(((C03K6) awS79S0500000_19.l0).getCurrentLifeCycleOwner());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        CommentContextSource commentContextSource = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment parentFragment = (Fragment) c098200Yq;
        if (parentFragment != null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(parentFragment, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            if (commentContextSource != null && commentContextSource.isRefactorTitlePanel()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (parentFragment != null && !(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (parentFragment != null && parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 757);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(735);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 758), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 759), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 760), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((C03K6) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 9)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 799);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 800);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 801);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 795);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 796), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 797), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 798), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 11)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 822);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 823);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 824);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 818);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 819), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 820), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 821), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 13)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 829);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 830);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 831);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 825);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 826), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 827), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 828), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 15)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 836);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 837);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 838);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 832);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 833), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 834), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 835), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 17)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 843);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 844);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 845);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 533);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 534), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 535), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 536), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 1)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 839);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 840), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 841), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 842), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 19)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 850);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 851);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 852);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 846);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 847), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 848), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 849), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 21)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 1870);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 1871);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 1872);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 1866);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(326);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 1867), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 1868), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 1869), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 23)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AwS79S0500000_19 awS79S0500000_19) {
        Object obj;
        C03K6 c03k6;
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        final Context context = ((C03K6) awS79S0500000_19.l0).getContext();
        final Context contextLJIJJ = C1345700l7g.LJIJJ(context);
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (interfaceC214902198iLJIIIIZZ == null) {
            interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIILLIIL(C827203La.LIZ(contextLJIJJ));
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198iLJIIIIZZ, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        if (C1356330lOp.LIZIZ()) {
            final C03K6 c03k62 = (C03K6) awS79S0500000_19.l0;
            c03k6 = new C03K6() { // from class: X.0hox
                @Override // X.C03K6
                public final Context getContext() {
                    Context context2 = contextLJIJJ;
                    return context2 == null ? context : context2;
                }

                @Override // X.C03K6
                public final LifecycleOwner getCurrentLifeCycleOwner() {
                    return c03k62.getCurrentLifeCycleOwner();
                }
            };
        } else {
            c03k6 = (C03K6) awS79S0500000_19.l0;
        }
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c13iq, 2006);
            AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(713);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c03k6, 2007);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c03k6, 2008);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory3, 2009);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_192, function0, aFwS207S0000000_19, awS563S0100000_193, awS563S0100000_194, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, 2010), null, new AwS563S0100000_19(c03k6, 2011));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c03k6, 2012);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory2, 1988);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c13iq, 1989);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_195, 109));
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 1990);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 1991);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 1992);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ, 1993);
            AwS563S0100000_19 awS563S0100000_1911 = new AwS563S0100000_19(c01gwLIZIZ, 1994);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_196, function0, new C452080Ho6(), awS563S0100000_197, awS563S0100000_198, awS563S0100000_19, function1, awS563S0100000_199, awS563S0100000_1910, awS563S0100000_1911);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1912 = new AwS563S0100000_19(c13iq, 1995);
            AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(711);
            AwS563S0100000_19 awS563S0100000_1913 = new AwS563S0100000_19(c03k6, 1996);
            AwS563S0100000_19 awS563S0100000_1914 = new AwS563S0100000_19(c03k6, 1997);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory, 1998);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1912, function0, aFwS207S0000000_192, awS563S0100000_1913, awS563S0100000_1914, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, 1999), null, new AwS563S0100000_19(c03k6, 2000));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1915 = new AwS563S0100000_19(c13iq, 2001);
            AFwS207S0000000_19 aFwS207S0000000_193 = AFwS207S0000000_19.get$arr$(712);
            AwS563S0100000_19 awS563S0100000_1916 = new AwS563S0100000_19(c03k6, 2002);
            AwS563S0100000_19 awS563S0100000_1917 = new AwS563S0100000_19(c03k6, 2003);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(c03k6, 2004);
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1915, function0, aFwS207S0000000_193, awS563S0100000_1916, awS563S0100000_1917, awS563S0100000_19, function1, null, null, new AwS563S0100000_19(c03k6, 2005));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AwS79S0500000_19 awS79S0500000_19) {
        Object c098200Yq;
        boolean z;
        AssemVMLazy assemVMLazy;
        try {
            c098200Yq = C827203La.LIZIZ(((C03K6) awS79S0500000_19.l0).getCurrentLifeCycleOwner());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        CommentContextSource commentContextSource = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment parentFragment = (Fragment) c098200Yq;
        if (parentFragment != null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(parentFragment, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            if (commentContextSource != null && commentContextSource.isRefactorTitlePanel()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (parentFragment != null && !(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (parentFragment != null && parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 1984);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(735);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 1985), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 1986), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 1987), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((C03K6) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 25)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2041);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 2042);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2043);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 2037);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2038), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 2039), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2040), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 27)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$29(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2688);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 2689);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2690);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 630);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 631);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 632);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 2684);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2685), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 2686), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2687), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 29)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$31(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2890);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 2891);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2892);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$32(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 2886);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2887), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 2888), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2889), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 31)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$33(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2939);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 2940);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 2941);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$34(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 2935);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2936), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 2937), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 2938), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 33)).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014 A[PHI: r2
      0x0014: PHI (r2v1 X.198i) = (r2v5 X.198i), (r2v6 X.198i) binds: [B:3:0x0008, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$35(kotlin.jvm.internal.AwS79S0500000_19 r11) {
        /*
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIIZZ(r0)
            if (r2 != 0) goto L14
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r0)
            if (r2 == 0) goto L52
        L14:
            r1 = 0
            r0 = 1
            boolean r0 = X.C1345700l7g.LJIIJ(r2, r1, r0)
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r5 = r11.l2
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r10 = r11.l3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r9 = r11.l4
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            com.bytedance.assem.arch.viewModel.AssemVMLazy r3 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r4 = X.C724750Sbp.LJIIJ(r2, r0)
            X.0Ho5 r6 = new X.0Ho5
            r6.<init>()
            X.06Wu r7 = X.C724750Sbp.LJII(r2)
            X.0DOt r8 = X.C724750Sbp.LJIIIZ(r2)
            if (r9 != 0) goto L4a
            kotlin.jvm.internal.AwS563S0100000_19 r9 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3143(0xc47, float:4.404E-42)
            r9.<init>(r2, r0)
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.getValue()
            return r0
        L52:
            java.lang.Object r1 = r11.l0
            X.19EG r1 = (X.C19EG) r1
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r4 = r11.l2
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r9 = r11.l3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r8 = r11.l4
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            com.bytedance.assem.arch.viewModel.AssemVMLazy r2 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r3 = X.C724750Sbp.LJIIJ(r1, r0)
            X.0Ho5 r5 = new X.0Ho5
            r5.<init>()
            X.06Wu r6 = X.C724750Sbp.LJII(r1)
            X.0DOt r7 = X.C724750Sbp.LJIIIZ(r1)
            if (r8 != 0) goto L82
            kotlin.jvm.internal.AwS563S0100000_19 r8 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3144(0xc48, float:4.406E-42)
            r8.<init>(r1, r0)
        L82:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r2.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS79S0500000_19.invoke$35(kotlin.jvm.internal.AwS79S0500000_19):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014 A[PHI: r2
      0x0014: PHI (r2v1 X.198i) = (r2v5 X.198i), (r2v6 X.198i) binds: [B:3:0x0008, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$36(kotlin.jvm.internal.AwS79S0500000_19 r11) {
        /*
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIIZZ(r0)
            if (r2 != 0) goto L14
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r0)
            if (r2 == 0) goto L52
        L14:
            r1 = 0
            r0 = 1
            boolean r0 = X.C1345700l7g.LJIIJ(r2, r1, r0)
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r5 = r11.l2
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r10 = r11.l3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r9 = r11.l4
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            com.bytedance.assem.arch.viewModel.AssemVMLazy r3 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r4 = X.C724750Sbp.LJIIJ(r2, r0)
            X.0Ho5 r6 = new X.0Ho5
            r6.<init>()
            X.06Wu r7 = X.C724750Sbp.LJII(r2)
            X.0DOt r8 = X.C724750Sbp.LJIIIZ(r2)
            if (r9 != 0) goto L4a
            kotlin.jvm.internal.AwS563S0100000_19 r9 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3145(0xc49, float:4.407E-42)
            r9.<init>(r2, r0)
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.getValue()
            return r0
        L52:
            java.lang.Object r1 = r11.l0
            X.19EG r1 = (X.C19EG) r1
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r4 = r11.l2
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r9 = r11.l3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r8 = r11.l4
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            com.bytedance.assem.arch.viewModel.AssemVMLazy r2 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r3 = X.C724750Sbp.LJIIJ(r1, r0)
            X.0Ho5 r5 = new X.0Ho5
            r5.<init>()
            X.06Wu r6 = X.C724750Sbp.LJII(r1)
            X.0DOt r7 = X.C724750Sbp.LJIIIZ(r1)
            if (r8 != 0) goto L82
            kotlin.jvm.internal.AwS563S0100000_19 r8 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3146(0xc4a, float:4.408E-42)
            r8.<init>(r1, r0)
        L82:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r2.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS79S0500000_19.invoke$36(kotlin.jvm.internal.AwS79S0500000_19):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014 A[PHI: r2
      0x0014: PHI (r2v1 X.198i) = (r2v5 X.198i), (r2v6 X.198i) binds: [B:3:0x0008, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$37(kotlin.jvm.internal.AwS79S0500000_19 r11) {
        /*
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIIZZ(r0)
            if (r2 != 0) goto L14
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r0)
            if (r2 == 0) goto L52
        L14:
            r1 = 0
            r0 = 1
            boolean r0 = X.C1345700l7g.LJIIJ(r2, r1, r0)
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r5 = r11.l2
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r10 = r11.l3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r9 = r11.l4
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            com.bytedance.assem.arch.viewModel.AssemVMLazy r3 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r4 = X.C724750Sbp.LJIIJ(r2, r0)
            X.0Ho5 r6 = new X.0Ho5
            r6.<init>()
            X.06Wu r7 = X.C724750Sbp.LJII(r2)
            X.0DOt r8 = X.C724750Sbp.LJIIIZ(r2)
            if (r9 != 0) goto L4a
            kotlin.jvm.internal.AwS563S0100000_19 r9 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3147(0xc4b, float:4.41E-42)
            r9.<init>(r2, r0)
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.getValue()
            return r0
        L52:
            java.lang.Object r1 = r11.l0
            X.19EG r1 = (X.C19EG) r1
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r4 = r11.l2
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r9 = r11.l3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r8 = r11.l4
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            com.bytedance.assem.arch.viewModel.AssemVMLazy r2 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r3 = X.C724750Sbp.LJIIJ(r1, r0)
            X.0Ho5 r5 = new X.0Ho5
            r5.<init>()
            X.06Wu r6 = X.C724750Sbp.LJII(r1)
            X.0DOt r7 = X.C724750Sbp.LJIIIZ(r1)
            if (r8 != 0) goto L82
            kotlin.jvm.internal.AwS563S0100000_19 r8 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3148(0xc4c, float:4.411E-42)
            r8.<init>(r1, r0)
        L82:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r2.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS79S0500000_19.invoke$37(kotlin.jvm.internal.AwS79S0500000_19):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$38(AwS79S0500000_19 awS79S0500000_19) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Object obj;
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
        Context context = parentFragment.getContext();
        InterfaceC214902198i interfaceC214902198i = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
                if (parentFragment == null) {
                    break;
                }
            }
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198i, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        Fragment fragment = (Fragment) awS79S0500000_19.l0;
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206Wu = new C1622206Wu(fragment, true);
            C338490DOt c338490DOt = new C338490DOt(fragment, true);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 3198);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, function0, c452070Ho5, c1622206Wu, c338490DOt, awS563S0100000_19, function1, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (obj instanceof InterfaceC451590HnJ) {
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(fragment, 3199);
            }
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c13iq), function0, awS563S0100000_19, function1, null, null, null);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(fragment, c13iq);
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragment, 3200);
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ2, function0, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS563S0100000_19, function1, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$39(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 3194);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(760);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 3195), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 3196), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 3197), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 38)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS79S0500000_19 awS79S0500000_19) {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF((Fragment) awS79S0500000_19.l0, null), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment parentFragment = (Fragment) awS79S0500000_19.l0;
            while (true) {
                if (parentFragment == null) {
                    break;
                }
                if (!(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                } else if (parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 626);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(733);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 627), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 628), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 629), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((Fragment) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 3)).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014 A[PHI: r2
      0x0014: PHI (r2v1 X.198i) = (r2v5 X.198i), (r2v6 X.198i) binds: [B:3:0x0008, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$40(kotlin.jvm.internal.AwS79S0500000_19 r11) {
        /*
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIIZZ(r0)
            if (r2 != 0) goto L14
            java.lang.Object r0 = r11.l0
            X.19EG r0 = (X.C19EG) r0
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r0)
            if (r2 == 0) goto L52
        L14:
            r1 = 0
            r0 = 1
            boolean r0 = X.C1345700l7g.LJIIJ(r2, r1, r0)
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r5 = r11.l2
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r10 = r11.l3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r9 = r11.l4
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            com.bytedance.assem.arch.viewModel.AssemVMLazy r3 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r4 = X.C724750Sbp.LJIIJ(r2, r0)
            X.0Ho5 r6 = new X.0Ho5
            r6.<init>()
            X.06Wu r7 = X.C724750Sbp.LJII(r2)
            X.0DOt r8 = X.C724750Sbp.LJIIIZ(r2)
            if (r9 != 0) goto L4a
            kotlin.jvm.internal.AwS563S0100000_19 r9 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3201(0xc81, float:4.486E-42)
            r9.<init>(r2, r0)
        L4a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.getValue()
            return r0
        L52:
            java.lang.Object r1 = r11.l0
            X.19EG r1 = (X.C19EG) r1
            java.lang.Object r0 = r11.l1
            X.13IQ r0 = (X.C13IQ) r0
            java.lang.Object r4 = r11.l2
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r9 = r11.l3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r8 = r11.l4
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            com.bytedance.assem.arch.viewModel.AssemVMLazy r2 = new com.bytedance.assem.arch.viewModel.AssemVMLazy
            kotlin.jvm.functions.Function0 r3 = X.C724750Sbp.LJIIJ(r1, r0)
            X.0Ho5 r5 = new X.0Ho5
            r5.<init>()
            X.06Wu r6 = X.C724750Sbp.LJII(r1)
            X.0DOt r7 = X.C724750Sbp.LJIIIZ(r1)
            if (r8 != 0) goto L82
            kotlin.jvm.internal.AwS563S0100000_19 r8 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3202(0xc82, float:4.487E-42)
            r8.<init>(r1, r0)
        L82:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r2.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS79S0500000_19.invoke$40(kotlin.jvm.internal.AwS79S0500000_19):java.lang.Object");
    }

    public static final Object invoke$41(AwS79S0500000_19 awS79S0500000_19) {
        String aid;
        Aweme aweme;
        if (((C12823050b) awS79S0500000_19.l0) != null && !((MentionFavoriteVideoVM) awS79S0500000_19.l1).wQ2()) {
            ((IAVPublishService) awS79S0500000_19.l2).setMentionVideoSubType(((MentionFavoriteVideoVM) awS79S0500000_19.l1).getActivity(), 10);
            C0ZIU.LIZ.getClass();
            C0ZIU.LIZJ("favorites");
            C0ZIU.LIZJ = "favorites";
            ((MentionFavoriteVideoVM) awS79S0500000_19.l1).zQ2((View) awS79S0500000_19.l3, ((C12823050b) awS79S0500000_19.l0).LL);
            MentionVideoShareModel mentionVideoShareModel = (MentionVideoShareModel) awS79S0500000_19.l4;
            String aid2 = ((C12823050b) awS79S0500000_19.l0).LL.getAid();
            mentionVideoShareModel.getClass();
            mentionVideoShareModel.setState(new AwS9S1001000_19(aid2, 10, 1));
            IAVPublishService iAVPublishService = (IAVPublishService) awS79S0500000_19.l2;
            C19EG activity = ((MentionFavoriteVideoVM) awS79S0500000_19.l1).getActivity();
            C12823050b c12823050b = (C12823050b) awS79S0500000_19.l0;
            if (c12823050b == null || (aweme = c12823050b.LL) == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            iAVPublishService.toPreview(activity, new C1220690hs3(aid, 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS79S0500000_19 awS79S0500000_19) {
        if (((C12823050b) awS79S0500000_19.l0) != null) {
            if (((MentionFavoriteVideoVM) awS79S0500000_19.l1).wQ2()) {
                ((C05P0) awS79S0500000_19.l4).setValue(Boolean.FALSE);
            } else {
                ((MentionFavoriteVideoVM) awS79S0500000_19.l1).yQ2(true);
                ((C05P0) awS79S0500000_19.l4).setValue(Boolean.TRUE);
                int privateStatus = 0;
                if (((IAVPublishService) awS79S0500000_19.l2).getCurrentUserId().equals(AwemeExtKt.getAuthorUid(((C12823050b) awS79S0500000_19.l0).LL))) {
                    String uniqueId = ((C12823050b) awS79S0500000_19.l0).LL.getAuthor().getUniqueId();
                    if (uniqueId == null) {
                        uniqueId = ((C12823050b) awS79S0500000_19.l0).LL.getAuthor().getShortId();
                    }
                    String nickname = ((C12823050b) awS79S0500000_19.l0).LL.getAuthor().getNickname();
                    String uid = ((C12823050b) awS79S0500000_19.l0).LL.getAuthor().getUid();
                    String secUid = ((C12823050b) awS79S0500000_19.l0).LL.getAuthor().getSecUid();
                    String aid = ((C12823050b) awS79S0500000_19.l0).LL.getAid();
                    AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(((C12823050b) awS79S0500000_19.l0).LL);
                    if (statusSafety != null) {
                        privateStatus = statusSafety.getPrivateStatus();
                    }
                    C0ZIK c0zik = new C0ZIK(uniqueId, nickname, uid, secUid, aid, privateStatus, ((C12823050b) awS79S0500000_19.l0).LL.getAuthor().isAccuratePrivateAccount() ? 1 : 0, 10, "click_panel");
                    ((IAVPublishService) awS79S0500000_19.l2).setChainInfo(((MentionFavoriteVideoVM) awS79S0500000_19.l1).getActivity(), c0zik);
                    MentionVideoShareModel mentionVideoShareModel = (MentionVideoShareModel) awS79S0500000_19.l3;
                    mentionVideoShareModel.getClass();
                    mentionVideoShareModel.setState(new AwS598S0100000_19(c0zik, 595));
                } else if (((MentionFavoriteVideoVM) awS79S0500000_19.l1).getActivity() != null) {
                    ((IAVPublishService) awS79S0500000_19.l2).setMentionVideoSubType(((MentionFavoriteVideoVM) awS79S0500000_19.l1).getActivity(), 10);
                    ((IAVPublishService) awS79S0500000_19.l2).showMentionVideoLoading(((MentionFavoriteVideoVM) awS79S0500000_19.l1).getActivity());
                    ((MentionVideoShareModel) awS79S0500000_19.l3).wQ2(10);
                    MentionVideoShareModel mentionVideoShareModel2 = (MentionVideoShareModel) awS79S0500000_19.l3;
                    mentionVideoShareModel2.getClass();
                    mentionVideoShareModel2.setState(new AwS33S0010000_19(16));
                    C0ZIU c0ziu = C0ZIU.LIZ;
                    C19EG activity = ((MentionFavoriteVideoVM) awS79S0500000_19.l1).getActivity();
                    if (activity != null) {
                        String aid2 = ((C12823050b) awS79S0500000_19.l0).LL.getAid();
                        c0ziu.getClass();
                        C0ZIU.LIZ(activity, aid2, "click_panel", false);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C0ZIU.LIZ.getClass();
                C0ZIU.LIZJ("favorites");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS79S0500000_19 awS79S0500000_19) {
        float measuredWidth;
        if (((AtomicInteger) awS79S0500000_19.l0).incrementAndGet() == 2) {
            C1214520hi6 c1214520hi6 = (C1214520hi6) awS79S0500000_19.l1;
            View view = (View) awS79S0500000_19.l2;
            View view2 = (View) awS79S0500000_19.l3;
            c1214520hi6.getClass();
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int[] iArr2 = new int[2];
            if (view2 != null) {
                view2.getLocationOnScreen(iArr2);
            }
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr2[0] - i;
            int i4 = iArr2[1] - i2;
            float measuredHeight = 0.0f;
            if (view2 != null) {
                measuredWidth = view2.getMeasuredWidth();
                measuredHeight = view2.getMeasuredHeight();
            } else {
                measuredWidth = 0.0f;
            }
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            int i5 = (int) measuredWidth;
            int i6 = (int) measuredHeight;
            c1214520hi6.LIZ = new SafeArea(Integer.valueOf(i3), Integer.valueOf(i3 + i5), Integer.valueOf(i4), Integer.valueOf(i4 + i6), Integer.valueOf(i5), Integer.valueOf(i6));
            int i7 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("computeOnViewDrawn, operationPanelSafeArea:");
            sbLIZ.append(c1214520hi6.LIZ);
            sbLIZ.append(" leftMargin:");
            sbLIZ.append(i3);
            sbLIZ.append(", topMargin:");
            sbLIZ.append(i4);
            sbLIZ.append(" measuredWidth:");
            sbLIZ.append(measuredWidth);
            sbLIZ.append(", measuredHeight:");
            sbLIZ.append(measuredHeight);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1214530hi7 interfaceC1214530hi7 = (InterfaceC1214530hi7) awS79S0500000_19.l4;
            if (interfaceC1214530hi7 != null) {
                interfaceC1214530hi7.LIZ(((C1214520hi6) awS79S0500000_19.l1).LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS79S0500000_19 awS79S0500000_19) {
        Object obj;
        C03K6 c03k6;
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        final Context context = ((C03K6) awS79S0500000_19.l0).getContext();
        final Context contextLJIJJ = C1345700l7g.LJIJJ(context);
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (interfaceC214902198iLJIIIIZZ == null) {
            interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIILLIIL(C827203La.LIZ(contextLJIJJ));
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198iLJIIIIZZ, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        if (C1356330lOp.LIZIZ()) {
            final C03K6 c03k62 = (C03K6) awS79S0500000_19.l0;
            c03k6 = new C03K6() { // from class: X.0hou
                @Override // X.C03K6
                public final Context getContext() {
                    Context context2 = contextLJIJJ;
                    return context2 == null ? context : context2;
                }

                @Override // X.C03K6
                public final LifecycleOwner getCurrentLifeCycleOwner() {
                    return c03k62.getCurrentLifeCycleOwner();
                }
            };
        } else {
            c03k6 = (C03K6) awS79S0500000_19.l0;
        }
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c13iq, 696);
            AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(713);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c03k6, 697);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c03k6, 698);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory3, 699);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_192, function0, aFwS207S0000000_19, awS563S0100000_193, awS563S0100000_194, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, OppoPermissionPopupMaskDelayExp.DEFAULT), null, new AwS563S0100000_19(c03k6, 701));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c03k6, 702);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory2, 678);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c13iq, 679);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_195, 30));
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 680);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 681);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 682);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ, 683);
            AwS563S0100000_19 awS563S0100000_1911 = new AwS563S0100000_19(c01gwLIZIZ, 684);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_196, function0, new C452080Ho6(), awS563S0100000_197, awS563S0100000_198, awS563S0100000_19, function1, awS563S0100000_199, awS563S0100000_1910, awS563S0100000_1911);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1912 = new AwS563S0100000_19(c13iq, 685);
            AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(711);
            AwS563S0100000_19 awS563S0100000_1913 = new AwS563S0100000_19(c03k6, 686);
            AwS563S0100000_19 awS563S0100000_1914 = new AwS563S0100000_19(c03k6, 687);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory, 688);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1912, function0, aFwS207S0000000_192, awS563S0100000_1913, awS563S0100000_1914, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, 689), null, new AwS563S0100000_19(c03k6, 690));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1915 = new AwS563S0100000_19(c13iq, 691);
            AFwS207S0000000_19 aFwS207S0000000_193 = AFwS207S0000000_19.get$arr$(712);
            AwS563S0100000_19 awS563S0100000_1916 = new AwS563S0100000_19(c03k6, 692);
            AwS563S0100000_19 awS563S0100000_1917 = new AwS563S0100000_19(c03k6, 693);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(c03k6, 694);
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1915, function0, aFwS207S0000000_193, awS563S0100000_1916, awS563S0100000_1917, awS563S0100000_19, function1, null, null, new AwS563S0100000_19(c03k6, 695));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS79S0500000_19 awS79S0500000_19) {
        Object c098200Yq;
        boolean z;
        AssemVMLazy assemVMLazy;
        try {
            c098200Yq = C827203La.LIZIZ(((C03K6) awS79S0500000_19.l0).getCurrentLifeCycleOwner());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        CommentContextSource commentContextSource = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment parentFragment = (Fragment) c098200Yq;
        if (parentFragment != null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(parentFragment, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            if (commentContextSource != null && commentContextSource.isRefactorTitlePanel()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (parentFragment != null && !(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (parentFragment != null && parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 674);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(735);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 675), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 676), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 677), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((C03K6) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 5)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS79S0500000_19 awS79S0500000_19) {
        Object obj;
        C03K6 c03k6;
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        final Context context = ((C03K6) awS79S0500000_19.l0).getContext();
        final Context contextLJIJJ = C1345700l7g.LJIJJ(context);
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (interfaceC214902198iLJIIIIZZ == null) {
            interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIILLIIL(C827203La.LIZ(contextLJIJJ));
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198iLJIIIIZZ, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        if (C1356330lOp.LIZIZ()) {
            final C03K6 c03k62 = (C03K6) awS79S0500000_19.l0;
            c03k6 = new C03K6() { // from class: X.0hov
                @Override // X.C03K6
                public final Context getContext() {
                    Context context2 = contextLJIJJ;
                    return context2 == null ? context : context2;
                }

                @Override // X.C03K6
                public final LifecycleOwner getCurrentLifeCycleOwner() {
                    return c03k62.getCurrentLifeCycleOwner();
                }
            };
        } else {
            c03k6 = (C03K6) awS79S0500000_19.l0;
        }
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c13iq, 725);
            AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(713);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c03k6, 726);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c03k6, 727);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory3, 728);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_192, function0, aFwS207S0000000_19, awS563S0100000_193, awS563S0100000_194, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, 729), null, new AwS563S0100000_19(c03k6, 730));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c03k6, 731);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory2, 707);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c13iq, 708);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_195, 32));
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 709);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 710);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 711);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ, 712);
            AwS563S0100000_19 awS563S0100000_1911 = new AwS563S0100000_19(c01gwLIZIZ, 713);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_196, function0, new C452080Ho6(), awS563S0100000_197, awS563S0100000_198, awS563S0100000_19, function1, awS563S0100000_199, awS563S0100000_1910, awS563S0100000_1911);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1912 = new AwS563S0100000_19(c13iq, 714);
            AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(711);
            AwS563S0100000_19 awS563S0100000_1913 = new AwS563S0100000_19(c03k6, 715);
            AwS563S0100000_19 awS563S0100000_1914 = new AwS563S0100000_19(c03k6, 716);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory, 717);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1912, function0, aFwS207S0000000_192, awS563S0100000_1913, awS563S0100000_1914, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, 718), null, new AwS563S0100000_19(c03k6, 719));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1915 = new AwS563S0100000_19(c13iq, 720);
            AFwS207S0000000_19 aFwS207S0000000_193 = AFwS207S0000000_19.get$arr$(712);
            AwS563S0100000_19 awS563S0100000_1916 = new AwS563S0100000_19(c03k6, 721);
            AwS563S0100000_19 awS563S0100000_1917 = new AwS563S0100000_19(c03k6, 722);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(c03k6, 723);
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1915, function0, aFwS207S0000000_193, awS563S0100000_1916, awS563S0100000_1917, awS563S0100000_19, function1, null, null, new AwS563S0100000_19(c03k6, 724));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return assemVMLazy.getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS79S0500000_19 awS79S0500000_19) {
        Object c098200Yq;
        boolean z;
        AssemVMLazy assemVMLazy;
        try {
            c098200Yq = C827203La.LIZIZ(((C03K6) awS79S0500000_19.l0).getCurrentLifeCycleOwner());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        CommentContextSource commentContextSource = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment parentFragment = (Fragment) c098200Yq;
        if (parentFragment != null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(parentFragment, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
            if (commentContextSource != null && commentContextSource.isRefactorTitlePanel()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (parentFragment != null && !(parentFragment instanceof InterfaceC1218670hon)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (parentFragment != null && parentFragment.isAdded()) {
                    C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 703);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(735);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 704), aFwS257S0000000_19, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new AwS563S0100000_19(parentFragment, 705), aFwS257S0000000_19, null, null, null);
                    } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) parentFragment, 706), aFwS257S0000000_19, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS79S0500000_19((C03K6) awS79S0500000_19.l0, (C13IQ) awS79S0500000_19.l1, (Function0) awS79S0500000_19.l2, (Function1) awS79S0500000_19.l3, (Function0) awS79S0500000_19.l4, 7)).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS79S0500000_19 awS79S0500000_19) {
        Object obj;
        C03K6 c03k6;
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        final Context context = ((C03K6) awS79S0500000_19.l0).getContext();
        final Context contextLJIJJ = C1345700l7g.LJIJJ(context);
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (interfaceC214902198iLJIIIIZZ == null) {
            interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIILLIIL(C827203La.LIZ(contextLJIJJ));
        }
        if (C1345700l7g.LJIIJ(interfaceC214902198iLJIIIIZZ, false, true)) {
            obj = C485430J1x.LIZ;
        } else {
            obj = C01D1.LIZ;
        }
        if (C1356330lOp.LIZIZ()) {
            final C03K6 c03k62 = (C03K6) awS79S0500000_19.l0;
            c03k6 = new C03K6() { // from class: X.0how
                @Override // X.C03K6
                public final Context getContext() {
                    Context context2 = contextLJIJJ;
                    return context2 == null ? context : context2;
                }

                @Override // X.C03K6
                public final LifecycleOwner getCurrentLifeCycleOwner() {
                    return c03k62.getCurrentLifeCycleOwner();
                }
            };
        } else {
            c03k6 = (C03K6) awS79S0500000_19.l0;
        }
        C13IQ c13iq = (C13IQ) awS79S0500000_19.l1;
        Function0 function0 = (Function0) awS79S0500000_19.l2;
        Function1 function1 = (Function1) awS79S0500000_19.l3;
        Function0 awS563S0100000_19 = (Function0) awS79S0500000_19.l4;
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c13iq, 779);
            AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(713);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c03k6, 780);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c03k6, 781);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory3, 782);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_192, function0, aFwS207S0000000_19, awS563S0100000_193, awS563S0100000_194, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, 783), null, new AwS563S0100000_19(c03k6, 784));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c03k6, 785);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory2, 761);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c13iq, 762);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_195, 34));
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 763);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 764);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 765);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ, 766);
            AwS563S0100000_19 awS563S0100000_1911 = new AwS563S0100000_19(c01gwLIZIZ, 767);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_196, function0, new C452080Ho6(), awS563S0100000_197, awS563S0100000_198, awS563S0100000_19, function1, awS563S0100000_199, awS563S0100000_1910, awS563S0100000_1911);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1912 = new AwS563S0100000_19(c13iq, 768);
            AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(711);
            AwS563S0100000_19 awS563S0100000_1913 = new AwS563S0100000_19(c03k6, 769);
            AwS563S0100000_19 awS563S0100000_1914 = new AwS563S0100000_19(c03k6, 770);
            if (awS563S0100000_19 == null) {
                if ((c03k6 instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) c03k6) != null) {
                    awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory, 771);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1912, function0, aFwS207S0000000_192, awS563S0100000_1913, awS563S0100000_1914, awS563S0100000_19, function1, new AwS563S0100000_19(c03k6, 772), null, new AwS563S0100000_19(c03k6, 773));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            AwS563S0100000_19 awS563S0100000_1915 = new AwS563S0100000_19(c13iq, 774);
            AFwS207S0000000_19 aFwS207S0000000_193 = AFwS207S0000000_19.get$arr$(712);
            AwS563S0100000_19 awS563S0100000_1916 = new AwS563S0100000_19(c03k6, 775);
            AwS563S0100000_19 awS563S0100000_1917 = new AwS563S0100000_19(c03k6, 776);
            if (awS563S0100000_19 == null) {
                awS563S0100000_19 = new AwS563S0100000_19(c03k6, 777);
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1915, function0, aFwS207S0000000_193, awS563S0100000_1916, awS563S0100000_1917, awS563S0100000_19, function1, null, null, new AwS563S0100000_19(c03k6, 778));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return assemVMLazy.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0500000_19(C03K6 c03k6, C13IQ c13iq, Function0 function0, Function1 function1, Function0 function02, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03k6;
        this.l1 = c13iq;
        this.l2 = function0;
        this.l3 = function1;
        this.l4 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0500000_19(C12823050b c12823050b, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, View view, MentionVideoShareModel mentionVideoShareModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c12823050b;
        this.l1 = mentionFavoriteVideoVM;
        this.l2 = iAVPublishService;
        this.l3 = view;
        this.l4 = mentionVideoShareModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS79S0500000_19(C12823050b c12823050b, C12823050b c12823050b2, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, MentionVideoShareModel mentionVideoShareModel, C05P0<Boolean> c05p0) {
        super(0);
        this.$t = c05p0;
        this.l0 = c12823050b;
        this.l1 = c12823050b2;
        this.l2 = mentionFavoriteVideoVM;
        this.l3 = iAVPublishService;
        this.l4 = mentionVideoShareModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0500000_19(C05P1 c05p1, InterfaceC1686540tzQ interfaceC1686540tzQ, InterfaceC1679450tnz interfaceC1679450tnz, InvitePageViewModel invitePageViewModel, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1686540tzQ;
        this.l1 = interfaceC1679450tnz;
        this.l2 = invitePageViewModel;
        this.l3 = function0;
        this.l4 = c05p1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0500000_19(C19EG c19eg, C13IQ c13iq, Function0 function0, Function1 function1, Function0 function02, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c13iq;
        this.l2 = function0;
        this.l3 = function1;
        this.l4 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0500000_19(Fragment fragment, C13IQ c13iq, Function0 function0, Function1 function1, Function0 function02, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c13iq;
        this.l2 = function0;
        this.l3 = function1;
        this.l4 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0500000_19(AtomicInteger atomicInteger, C1214520hi6 c1214520hi6, View view, C1836680xta c1836680xta, InterfaceC1214530hi7 interfaceC1214530hi7, int i) {
        super(0);
        this.$t = i;
        this.l0 = atomicInteger;
        this.l1 = c1214520hi6;
        this.l2 = view;
        this.l3 = c1836680xta;
        this.l4 = interfaceC1214530hi7;
    }
}
