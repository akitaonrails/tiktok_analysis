package com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.subpage;

import X.C03DX;
import X.C098200Yq;
import X.C10512049e;
import X.C10513049f;
import X.C1685300txQ;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23260099m;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.InterfaceC1748810vbr;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class OcpPolicyFragment extends ECBaseFragment {
    public static C23260099m LLILZIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZyA9LSYgICw4OCQ1ZzwmKjUtLip9ByY8GSA/ISY1Dz0yLygpJzs=";
    public C03DX LLILLL;
    public LinearLayout LLILZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "ocp_policy";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C23260099m c23260099m = LLILZIL;
        if (c23260099m != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c23260099m.resumeWith(unit);
        }
        LLILZIL = null;
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
        C1748720vbi.LIZIZ(this, new C10512049e(), new AwS580S0100000_1(this, 79));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        LaneParams laneParamsLIZIZ;
        String string;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.tf8);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (C03DX) viewFindViewById;
        }
        C03DX c03dx = (C03DX) viewFindViewById;
        if (c03dx != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                string = arguments.getString("title");
            } else {
                string = null;
            }
            c03dx.e0(null, null, String.valueOf(string));
            Integer numValueOf = Integer.valueOf(R.raw.icon_x_mark_small);
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 98);
            if (numValueOf != null) {
                c03dx.getNavEndIconFromXml().setIconRes(numValueOf.intValue());
            }
            C786410Ut5.I7(new AjS60S0100000_1((Function0) awS545S0100000_1, 61), c03dx.getNavEndIconFromXml());
        }
        InterfaceC1748810vbr interfaceC1748810vbrD8 = d8();
        if (interfaceC1748810vbrD8 != null && (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrD8, "lib_track_builtin_lane_business")) != null) {
            obj = laneParamsLIZIZ.get((Object) "policy_text");
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            TuxTextView tuxTextView = new TuxTextView(view.getContext(), null, 6, 0);
            View view3 = this.LLILZ;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.u2r);
                }
                this.LLILZ = (LinearLayout) viewFindViewById2;
                view3 = viewFindViewById2;
            }
            ((ViewGroup) view3).addView(tuxTextView);
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(51);
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), false, 16);
        }
        C1748720vbi.LIZIZ(this, new C10513049f(), AFwS228S0000000_1.get$arr$(55));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            viewLIZ = C954703oH.LIZ(context, R.layout.arh, viewGroup, false);
        } else {
            viewLIZ = null;
        }
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
