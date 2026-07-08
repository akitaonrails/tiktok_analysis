package com.ss.android.ugc.aweme.df;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1311205Be;
import X.C1312905Bv;
import X.C1618506Vj;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1320505Et;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupNotifyContainerFragment extends GroupChatDFLoadingFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEqZwHELIOSghJzA8ByAnISM1CiA9PCQlJyohDjctLiI2JjE=";
    public final int LLJI = -2;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131831476);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 142));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1311205Be.LIZ.getClass();
        InterfaceC1320505Et interfaceC1320505Et = (InterfaceC1320505Et) C1311205Be.LIZIZ.getValue();
        if (interfaceC1320505Et != null) {
            interfaceC1320505Et.LIZIZ(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.df.GroupChatDFLoadingFragment
    public final int getHeight() {
        return this.LLJI;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Unit unit;
        super.onViewCreated(view, bundle);
        C1311205Be.LIZ.getClass();
        InterfaceC1320505Et interfaceC1320505Et = (InterfaceC1320505Et) C1311205Be.LIZIZ.getValue();
        if (interfaceC1320505Et != null) {
            interfaceC1320505Et.LIZJ(this);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        IMGroupChatApi.LIZIZ.getClass();
        C1618506Vj.LIZLLL(unit, "open_group_chat_notify_sheet");
        if (unit == null) {
            C1311205Be.LIZJ(this, new C1312905Bv("com.ss.android.ugc.aweme.chatdetail.redesign.notify.GroupNotifyPage", null, this, view, this, bundle), new AwS546S0100000_2(this, 143));
        }
    }

    @Override // com.ss.android.ugc.aweme.df.GroupChatDFLoadingFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView;
        C19GS c19gs;
        C1311205Be.LIZ.getClass();
        InterfaceC1320505Et interfaceC1320505Et = (InterfaceC1320505Et) C1311205Be.LIZIZ.getValue();
        if (interfaceC1320505Et == null || (viewOnCreateView = interfaceC1320505Et.LIZ(layoutInflater, viewGroup)) == null) {
            viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            ViewGroup viewGroup2 = (ViewGroup) viewOnCreateView;
            LinearLayout linearLayout = new LinearLayout(viewGroup2.getContext());
            C786410Ut5.LJLLLLLL(4, linearLayout);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            C786410Ut5.d6(linearLayout, layoutParams);
            linearLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            linearLayout.setOrientation(1);
            for (int i = 0; i < 3; i++) {
                C786410Ut5.Td(layoutInflater, R.layout.cjj, linearLayout, true);
            }
            viewGroup2.addView(linearLayout, 0);
        }
        try {
            ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
            viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewOnCreateView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewOnCreateView;
        }
    }
}
