package com.ss.android.ugc.aweme.ecommerce.base.address.common.selectitem;

import X.C049Z;
import X.C098200Yq;
import X.C0OM1;
import X.C10508049a;
import X.C1163330gNX;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1748720vbi;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1164480gPO;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SelectItemFragment<T extends InterfaceC1164480gPO> extends ECBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZy43HELIOSLDcpOjx9KyohJCA9ZjYpJSowPCw4LCJ9GyAgLCwnATEpJAkhKSIhLCEn";
    public TuxNavBar LLILLL;
    public LinearLayout LLILZ;
    public C1163330gNX<T> LLILZIL;
    public long LLIZ;
    public Function1<? super T, Unit> LLILZLL = AFwS256S0000000_18.get$arr$(61);
    public String LLIZLLLIL = "return";

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        String str;
        C1163330gNX<T> c1163330gNX = this.LLILZIL;
        return (c1163330gNX == null || (str = c1163330gNX.LIZLLL) == null) ? "select_country" : str;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1748720vbi.LIZIZ(this, new C10508049a(), new AwS597S0100000_18((SelectItemFragment) this, 68));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS597S0100000_18((SelectItemFragment) this, 67));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        String string;
        super.onViewCreated(view, bundle);
        this.LLIZ = System.currentTimeMillis();
        C1748720vbi.LIZIZ(this, new C049Z(), null);
        C1163330gNX<T> c1163330gNX = this.LLILZIL;
        if ((c1163330gNX == null || (string = c1163330gNX.LJ) == null) && ((context = getContext()) == null || (string = context.getString(2131832704)) == null)) {
            string = "Select";
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL = true;
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, (SelectItemFragment<InterfaceC1164480gPO>) 2698));
        c0om1.LIZIZ(c1251150ifB);
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p12);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18((SelectItemFragment) this, 998), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.alp, viewGroup, false);
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
