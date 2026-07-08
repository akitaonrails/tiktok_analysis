package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C03SY;
import X.C098200Yq;
import X.C123100dR;
import X.C1331750klB;
import X.C13LE;
import X.C189200o6;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C724240Sb0;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C882703cf;
import X.C889703dn;
import X.EnumC865603Zu;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PaymentPromotionBottomSheetTitleSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsBonusPromotionSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.SparkNavigationFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCPromotionBannerViewHolder extends PowerCell<C889703dn> implements C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1148));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1136));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1147));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1135));
    public final AssemVMLazy LLILZLL;
    public final int LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCPromotionBannerViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    public CCDCPromotionBannerViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1150);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(207);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1139), awS545S0100000_1, AFwS207S0000000_19.get$arr$(219), new AwS545S0100000_1((C03K6) this, 1140), new AwS545S0100000_1((C03K6) this, 1142), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1144), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1341), null, new AwS545S0100000_1((C03K6) this, 1146));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1141);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1143);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1145);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 82));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1342);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1343);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1344);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1345);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1346);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1149), awS545S0100000_1, AFwS207S0000000_19.get$arr$(220), new AwS545S0100000_1((C03K6) this, 1151), new AwS545S0100000_1((C03K6) this, 1152), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1153), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1347), null, new AwS545S0100000_1((C03K6) this, 1154));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1155), awS545S0100000_1, AFwS207S0000000_19.get$arr$(221), new AwS545S0100000_1((C03K6) this, 1156), new AwS545S0100000_1((C03K6) this, 1134), new AwS545S0100000_1((C03K6) this, 1137), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1138));
        }
        this.LLILZLL = assemVMLazy;
        this.LLIZ = C679280Qkg.LIZ(18);
        C679280Qkg.LIZ(12);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C679280Qkg.LIZ(2);
        c1331750klB.LIZ();
    }

    public final TuxTextView L5() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public final ViewFlipper N5() {
        return (ViewFlipper) this.LLILLJJLI.getValue();
    }

    public final CCDCAddCardViewModel P5() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void dispatchDestroy() {
        super.dispatchDestroy();
        try {
            if (N5().isFlipping()) {
                N5().stopFlipping();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final PaymentPromotion I5(PaymentMethod paymentMethod) {
        PaymentPromotion paymentPromotionLJIIL;
        EnterParams enterParams;
        String str;
        PaymentInfo paymentInfo;
        boolean z = false;
        if (PipoTtsBonusPromotionSettings.LIZ() && ((enterParams = P5().LLILLJJLI) == null || (paymentInfo = enterParams.paymentInfo) == null || !paymentInfo.LJI())) {
            C03SY c03sy = C03SY.LIZ;
            String str2 = paymentMethod.id;
            c03sy.getClass();
            if (C03SY.LJIJI(str2) || ((str = paymentMethod.id) != null && u.LJJIIJZLJL(str, "pm_pi_ccdc_", false))) {
                z = true;
            }
        }
        if (!z || (paymentPromotionLJIIL = paymentMethod.LJIIL()) == null || !C123100dR.LIZ(paymentPromotionLJIIL.getDescByCondition())) {
            return null;
        }
        return paymentPromotionLJIIL;
    }

    public final void R5(String str) {
        Fragment fragmentLJI;
        Object c098200Yq;
        LifecycleOwner parent = getParent();
        if (parent != null && (fragmentLJI = C724240Sb0.LJI(parent)) != null) {
            try {
                c098200Yq = fragmentLJI.getChildFragmentManager();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            EnumC865603Zu enumC865603Zu = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            FragmentManager fragmentManager = (FragmentManager) c098200Yq;
            if (fragmentManager == null) {
                return;
            }
            SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
            sparkNavigationFragment.LLILLL = str;
            sparkNavigationFragment.LLILZ = PaymentPromotionBottomSheetTitleSettings.LIZ(this.itemView.getContext());
            sparkNavigationFragment.LLILZIL = true;
            sparkNavigationFragment.LLILZLL = false;
            EnterParams enterParams = P5().LLILLJJLI;
            if (enterParams != null && enterParams.LJ) {
                enumC865603Zu = EnumC865603Zu.HEIGHT_73;
            }
            C882703cf.LIZ(fragmentManager, sparkNavigationFragment, null, enumC865603Zu, false, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(X.C889703dn r30) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCPromotionBannerViewHolder.S5(X.03dn):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0375  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r23) {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCPromotionBannerViewHolder.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aqu, viewGroup, false);
    }
}
