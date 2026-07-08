package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C723850SaN;
import X.C786410Ut5;
import X.C886903dL;
import X.C887503dR;
import X.C888603dc;
import X.C914303hl;
import X.EnumC887103dN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCFillCVVHalfFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOSAgOGs8KDY+LSs4ZywwLCZiCgwXCwMlJSMQHhMEKCM1DjctLiI2JjE=";
    public TuxNavBar LLIZ;
    public PaymentMethod LLIZLLLIL;
    public EnterParams LLJ;
    public Function0<Unit> LLJI;
    public Function1<? super C886903dL, Unit> LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    public final void SR(EnumC887103dN enumC887103dN) {
        C887503dR c887503dR;
        String str;
        String str2;
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        EnterParams enterParams = this.LLJ;
        if (enterParams != null) {
            c887503dR = enterParams.LJJIJL;
        } else {
            c887503dR = null;
        }
        C888603dc c888603dc = C888603dc.LIZ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("result", enumC887103dN.getValue());
        String str3 = "";
        if (c887503dR == null || (str = c887503dR.LJFF) == null) {
            str = "";
        }
        pairArr[1] = new Pair("entrance", str);
        if (c887503dR != null && (str2 = c887503dR.LJ) != null) {
            str3 = str2;
        }
        pairArr[2] = new Pair("agreement_id", str3);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c888603dc.getClass();
        C888603dc.LIZJ("cvv_result", mapLJIIIIZZ);
        Function1<? super C886903dL, Unit> function1 = this.LLJIJIL;
        if (function1 != null) {
            function1.invoke(new C886903dL(enumC887103dN, this.LLJILLL, this.LLJJ));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS228S0000000_1.get$arr$(195));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZIZ = "close";
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1600));
        c0om1.LIZIZ(c1251150ifB);
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 606), 3);
        C914303hl.LIZ.getClass();
        C914303hl.LIZLLL(this, "ccdc_card_fill_cvv");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ala, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
