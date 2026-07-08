package com.ss.android.ugc.aweme.compliance.consent.termsconditions.changeregion;

import X.C01GW;
import X.C098200Yq;
import X.C1251150ifB;
import X.C14EU;
import X.C14SL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C484220Iyq;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class ChangeAccountRegionTermsConditionsPage extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KyoiOio9PGs4LD0+OyYjJys6PCHELIOSwjJzx9Ky0tJyg2OiArICA9ZgYkKCE0LQQvKiAmJjEeLCg6JysYLD0+OwYjJys6PCwjJzwDKSIp";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(104), "enter_from", String.class);
    public C14SL LLIZLLLIL;
    public boolean LLJ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS257S0000000_19.get$arr$(105));
        this.LLIZLLLIL = new C14SL(ComplianceServiceProvider.LJJII().LIZIZ(), new AwS598S0100000_19(this, 572), new AwS598S0100000_19(this, 573), new AwS598S0100000_19(this, 574), new AwS598S0100000_19(this, 575), new AwS563S0100000_19(this, 2839), false);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLIZ.getValue());
        C20684815ws.LJIILLIIL("register_terms_show", c2344009Gk.LIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcast(C484220Iyq c484220Iyq) {
        C19EG activity;
        String string = JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName");
        if (string != null && Intrinsics.LJFF(string, "closeKRConsentBox") && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    public final void SR(String str, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLIZ.getValue());
        c2344009Gk.LJIIIIZZ("content", str);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c2344009Gk.LIZJ(i, "click_type");
        C20684815ws.LJIILLIIL("register_terms_click", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y08);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 133));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.LJIIZILJ(false);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 107), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bcn, viewGroup, false);
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
