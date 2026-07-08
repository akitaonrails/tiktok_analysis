package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment;

import X.AnonymousClass0317;
import X.C034S;
import X.C03DI;
import X.C098200Yq;
import X.C0OM1;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1257480ipO;
import X.C1389890mGx;
import X.C13LE;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C178200mK;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2371409Qy;
import X.C723850SaN;
import X.C786410Ut5;
import X.C877703br;
import X.C926303jh;
import X.C927003jo;
import X.C927303jr;
import X.InterfaceC1164530gPT;
import X.InterfaceC883003ci;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer.OSPHalfDialogContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubPaymentListFragment extends Fragment implements InterfaceC883003ci, InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGHELIOSs8KDY+LSs4ZzwmKjUtMCI2JjFiGjoxGCQ1JCo9PAklOjsVOiQrJCo9PA==";
    public TuxNavBar LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public C926303jh LLILLL;
    public boolean LLILZIL;
    public boolean LLIZLLLIL;
    public String LLILZ = "";
    public String LLILZLL = "";
    public C927003jo LLIZ = new C927003jo(new C927303jr(13, Integer.valueOf(R.raw.icon_arrow_left_ltr), null, null), false, false, 14);

    @Override // X.InterfaceC883003ci
    public final boolean uH() {
        return false;
    }

    public final Function0<Unit> MR() {
        OSPHalfDialogContainerFragment oSPHalfDialogContainerFragmentLIZ = C877703br.LIZ(this);
        return oSPHalfDialogContainerFragmentLIZ == null ? new AwS545S0100000_1(this, 1206) : new AwS545S0100000_1(oSPHalfDialogContainerFragmentLIZ, 1207);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        super.onDestroy();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        String str = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() ? "close" : "return";
        C926303jh c926303jh = this.LLILLL;
        if (c926303jh != null) {
            c926303jh.LIZIZ(str);
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_payment_change", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        if (Intrinsics.LJFF(str, "ec_payment_change")) {
            ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str2);
            if (concurrentHashMapLIZ != null) {
                obj = concurrentHashMapLIZ.get("payment_change_reason");
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(obj, Integer.valueOf(C03DI.REIMBURSEMENT_VOUCHER.getValue()))) {
                MR().invoke();
                return;
            }
            C19EG activity = getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131833145);
                c1389890mGx.LJIIJJI();
            }
            MR().invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PaymentMethod paymentMethod;
        EnterParams enterParams;
        String string;
        Integer num;
        Integer num2;
        Type type;
        Type type2;
        super.onViewCreated(view, bundle);
        View viewFindViewById = null;
        String string2 = C1257480ipO.LIZ.getString("sub_payment_list_parent_payment_method", null);
        boolean z = true;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type2 = C2371409Qy.LIZJ(C13LE.LJ(PaymentMethod.class));
            } else {
                type2 = new TypeToken<PaymentMethod>() { // from class: X.03jm
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string2, type2);
            if (!(objFromJson instanceof PaymentMethod)) {
                objFromJson = null;
            }
            paymentMethod = (PaymentMethod) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            paymentMethod = null;
        }
        String string3 = C1257480ipO.LIZ.getString("sub_payment_list_enter_params", null);
        try {
            Gson gsonLJFF2 = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJ(EnterParams.class));
            } else {
                type = new TypeToken<EnterParams>() { // from class: X.03jn
                }.getType();
            }
            Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, string3, type);
            if (!(objFromJson2 instanceof EnterParams)) {
                objFromJson2 = null;
            }
            enterParams = (EnterParams) objFromJson2;
        } catch (s e2) {
            TryCatchGuardChecker.doCheck(e2);
            enterParams = null;
        }
        if (paymentMethod != null && enterParams != null) {
            C926303jh c926303jh = new C926303jh(enterParams, this.LLILZIL);
            C1018703yb.LIZIZ("tiktokec_enter_page", c926303jh.LIZ);
            c926303jh.LIZIZ = System.currentTimeMillis();
            this.LLILLL = c926303jh;
            C723850SaN.LIZ(this, false, null, new AwS100S0400000_1(this, paymentMethod, enterParams, c926303jh, 9), 3);
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter != null) {
                iEventCenter.LIZLLL("ec_payment_change", this);
            }
            C0OM1 c0om1 = new C0OM1();
            C927303jr c927303jr = this.LLIZ.LIZ;
            if (c927303jr == null || (string = c927303jr.LIZ) == null) {
                string = getResources().getString(2131833067);
            }
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            c0om1.LIZJ = c1250250idj;
            C927303jr c927303jr2 = this.LLIZ.LIZ;
            if (c927303jr2 != null && (num2 = c927303jr2.LIZIZ) != null) {
                int iIntValue = num2.intValue();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = iIntValue;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1606));
                c0om1.LJ(c1251150ifB);
            }
            C927303jr c927303jr3 = this.LLIZ.LIZ;
            if (c927303jr3 != null && (num = c927303jr3.LIZJ) != null) {
                int iIntValue2 = num.intValue();
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = iIntValue2;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZJ(new AwS545S0100000_1(this, 1607));
                c0om1.LIZIZ(c1251150ifB2);
            }
            C927303jr c927303jr4 = this.LLIZ.LIZ;
            if (c927303jr4 != null) {
                z = c927303jr4.LIZLLL;
            }
            c0om1.LIZLLL = z;
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.p12);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (TuxNavBar) viewFindViewById2;
            }
            ((TuxNavBar) viewFindViewById2).setNavActions(c0om1);
            View view3 = this.LLILLJJLI;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.qjx);
                }
                this.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
                view3 = viewFindViewById;
            }
            ((RecyclerView) view3).setNestedScrollingEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ar0, viewGroup, false);
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
