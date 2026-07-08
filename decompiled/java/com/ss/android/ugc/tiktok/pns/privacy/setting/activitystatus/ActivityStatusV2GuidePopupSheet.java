package com.ss.android.ugc.tiktok.pns.privacy.setting.activitystatus;

import X.C098200Yq;
import X.C0OM1;
import X.C103L;
import X.C104L;
import X.C106M;
import X.C106V;
import X.C1163504gr;
import X.C1251150ifB;
import X.C1361400lX0;
import X.C1388190mED;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C191848103q;
import X.C191859104b;
import X.C191862104e;
import X.C191871104n;
import X.C19727912Gn;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C23250099c;
import X.C347701Wp;
import X.C427660Gpo;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import X.InterfaceC989510brB;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ActivityStatusV2GuidePopupSheet extends Fragment implements InterfaceC344240DeY, InterfaceC989510brB<PrivacyUserSettingsV2>, IRouteAction {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnISsrZyHELIOS4wPCw6IDsqOzEtPTogZgQvPSYlITE1GjsyPDA/H30UPSwoLB88ODA8Gic2LTE=";
    public ConstraintLayout LL;
    public C19727912Gn LLILLJJLI;
    public Integer LLILLL;
    public Integer LLILZ;
    public TuxSheet LLILZIL;
    public C103L LLILZLL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 628));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String string;
        C106M c106m = C106M.LIZ;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_method")) == null) {
            string = "unknown";
        }
        Integer num = this.LLILLL;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.LLILZ;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        c106m.getClass();
        C1163504gr.LIZIZ.onEventV3("activity_status_pop_up_close", C2097608Jq.LJIIIIZZ(new Pair("enter_method", string), new Pair("original_status", C106M.LIZ(iIntValue, true)), new Pair("to_status", C106M.LIZ(iIntValue2, true))));
        C191862104e.LIZ.getClass();
        C191862104e.LIZLLL(this);
        super.onDestroy();
    }

    @Override // X.InterfaceC989510brB
    public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        Integer numLIZ;
        PrivacyUserSettingsV2 privacyUserSettingsV22 = privacyUserSettingsV2;
        if (privacyUserSettingsV22 != null && (numLIZ = privacyUserSettingsV22.LIZ("activity_status_v2")) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C347701Wp(this, numLIZ.intValue(), null), 3);
        }
    }

    public final void MR(Integer num) {
        C19727912Gn c19727912Gn = this.LLILLJJLI;
        if (c19727912Gn != null) {
            if (num != null && num.intValue() == 5) {
                c19727912Gn.setActive(false);
                C786410Ut5.d0(c19727912Gn, 8);
            } else {
                c19727912Gn.setActive(true);
                C786410Ut5.d0(c19727912Gn, 0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        C191862104e.LIZ.getClass();
        C191862104e.LIZJ(this);
        C106M c106m = C106M.LIZ;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_method")) == null) {
            string = "unknown";
        }
        c106m.getClass();
        C1163504gr.LIZIZ.onEventV3("activity_status_pop_up_show", C2097908Jt.LIZJ(new Pair("enter_method", string)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C427660Gpo c427660GpoLJIJ;
        List list;
        this.LL = (ConstraintLayout) view.findViewById(R.id.user_avatar_view_holder);
        String str = null;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        Integer numLIZ = null;
        if (iPrivacySettingsDepService != null) {
            c427660GpoLJIJ = iPrivacySettingsDepService.LJIJ(view.getContext());
        } else {
            c427660GpoLJIJ = null;
        }
        if (c427660GpoLJIJ != null && this.LL != null) {
            C19ME c19me = new C19ME(-2, -2);
            c19me.startToStart = 0;
            c19me.topToTop = 0;
            C786410Ut5.W5(c427660GpoLJIJ, c19me);
            C19727912Gn c19727912Gn = (C19727912Gn) view.findViewById(R.id.a68);
            this.LLILLJJLI = c19727912Gn;
            if (c19727912Gn != null) {
                c427660GpoLJIJ.setElevation(c19727912Gn.getElevation() - 1.0f);
            }
            ConstraintLayout constraintLayout = this.LL;
            if (constraintLayout != null) {
                constraintLayout.addView(c427660GpoLJIJ);
            }
            ConstraintLayout constraintLayout2 = this.LL;
            if (constraintLayout2 != null) {
                C786410Ut5.LL(0, constraintLayout2);
            }
        } else {
            ConstraintLayout constraintLayout3 = this.LL;
            if (constraintLayout3 != null) {
                C786410Ut5.LL(8, constraintLayout3);
            }
        }
        view.findViewById(R.id.title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.a6f);
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            C106V.LIZ.getClass();
            TPSCRenderManager tPSCRenderManagerLIZJ = C106V.LIZJ();
            C1361400lX0 c1361400lX0 = new C1361400lX0(view.getContext(), R.style.abe);
            ViewModelStoreOwner activity = getActivity();
            if (activity == null) {
                activity = this;
            }
            C103L c103l = this.LLILZLL;
            if (c103l != null) {
                str = c103l.LIZ;
            }
            C191848103q c191848103q = new C191848103q(c1361400lX0, activity, this, str, getArguments(), null, null, 224);
            C103L c103l2 = this.LLILZLL;
            if (c103l2 == null || (list = c103l2.LJ) == null) {
                list = C13BV.INSTANCE;
            }
            tPSCRenderManagerLIZJ.getClass();
            recyclerView.setAdapter(TPSCRenderManager.LIZJ(c191848103q, list));
        }
        C191871104n.LJ().getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LIZJ = C191859104b.LIZJ();
        if (privacyUserSettingsV2LIZJ != null) {
            numLIZ = privacyUserSettingsV2LIZJ.LIZ("activity_status_v2");
        }
        this.LLILLL = numLIZ;
        MR(numLIZ);
        this.LLILZ = this.LLILLL;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bdc, viewGroup, false);
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

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        C19EG c19egLIZIZ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C104L.LIZ(c19egLIZIZ, "activity_status_v2_popup", new AwS394S0200000_28(c19egLIZIZ, bundle, 44));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
