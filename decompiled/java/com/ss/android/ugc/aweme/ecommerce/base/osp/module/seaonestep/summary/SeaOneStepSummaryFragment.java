package com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.summary;

import X.C019F;
import X.C01D1;
import X.C038N;
import X.C03O0;
import X.C03PI;
import X.C03SE;
import X.C04JT;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1018503yZ;
import X.C1308910kAL;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C2217381BqS;
import X.C338490DOt;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C443120HZe;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C722002rq;
import X.C722102rr;
import X.C722302rt;
import X.C724750Sbp;
import X.C7806033c;
import X.C786410Ut5;
import X.C814420VxA;
import X.C832403Na;
import X.C832503Nb;
import X.C963303pf;
import X.C987103tV;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaOneStepSummaryFragment extends ECBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGshJismHELIOSJCBiOioyJyspOjs2OGs/PCI+KTc1Zxw2KQoiLBwnLTUfPCI+KTc1Dz0yLygpJzs=";
    public final AssemVMLazy LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public boolean LLILZIL;
    public C722302rt LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOneStepSummaryFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeaOneStepSummaryFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 473);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(102);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 474), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 475), aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 476), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLL = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final void WR() {
        View view = getView();
        if (view != null && view.getHeight() > 0) {
            view.animate().cancel();
            if (view.getTranslationY() == 0.0f) {
                C786410Ut5.ed(view, view.getHeight());
            }
            view.animate().translationY(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        String strLIZ;
        String strLIZ2;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/ecommerce/base/osp/module/seaonestep/summary/SeaOneStepSummaryFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70x0q03LozzJlRhMJYBZ871g+IknGa/e8Z+vqGjSILgXAdSjDQY1Vcln2gyhRYhJkxzG20=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            WR();
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = VR().hi1(false);
            C722302rt c722302rt = this.LLILZLL;
            if (c722302rt != null && (strLIZ2 = C722102rr.LIZ(c722302rt)) != null) {
                mapHi1.put("summary_info", strLIZ2);
            }
            Map<String, String> mapLJIIJJI = C7806033c.LJIIJJI(VR().LLJJI);
            Map<String, Object> mapLIZ = VR().LLLZLZ.LIZ("c35430.d0");
            c03o0.getClass();
            C03O0.LJLLILLLL(mapHi1, mapLJIIJJI, mapLIZ);
            return;
        }
        C03O0 c03o02 = C03O0.LIZ;
        HashMap<String, Object> mapHi12 = VR().hi1(false);
        C722302rt c722302rt2 = this.LLILZLL;
        if (c722302rt2 != null && (strLIZ = C722102rr.LIZ(c722302rt2)) != null) {
            mapHi12.put("summary_info", strLIZ);
        }
        Map<String, String> mapLJIIJJI2 = C7806033c.LJIIJJI(VR().LLJJI);
        Map<String, Object> mapLIZ2 = VR().LLLZLZ.LIZ("c35430.d0");
        c03o02.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C03O0.LIZIZ);
        linkedHashMap.putAll(mapHi12);
        linkedHashMap.put("page_name", "order_summary");
        linkedHashMap.put("previous_page", "order_submit");
        C03O0.LIZJ(linkedHashMap, mapLJIIJJI2);
        C038N.LIZ(linkedHashMap, mapLIZ2);
        C1018503yZ.LIZIZ("tiktokec_stay_page", linkedHashMap, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLIZ;
        C20600815jK<InterfaceC1891350zJl> state;
        super.onViewCreated(view, bundle);
        C786410Ut5.LJLLLLLL(4, view);
        if (!this.LLILZIL) {
            this.LLILZIL = true;
            View view2 = getView();
            if (view2 != null) {
                C786410Ut5.y3(view2.getViewTreeObserver(), new C04JT(view2, this, 0));
            }
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.u4v);
        if (tuxIconView != null) {
            Context context = getContext();
            if (context != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZ = R.raw.icon_x_mark_small;
                c419910GdJ.LIZLLL = numLIZJ;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
            }
            C786410Ut5.I7(new AjS60S0100000_1(this, 20), tuxIconView);
        }
        TextView textView = (TextView) view.findViewById(R.id.u4w);
        this.LLILZ = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        if (C963303pf.LIZIZ()) {
            C832503Nb c832503Nb = C832503Nb.LIZ;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
            c832503Nb.getClass();
            C832503Nb.LIZ(viewOnAttachStateChangeListenerC20604515jv);
        } else {
            C832403Na.LIZIZ(this.LLILZ);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
        }
        BillInfoData billInfoData = VR().LLJJI;
        ArrayList arrayList = new ArrayList();
        textView.setText(view.getContext().getString(2131832990));
        if (billInfoData != null) {
            C03SE c03se = C03PI.LJIJI;
            PaymentInfo paymentInfo = VR().LLJJJ;
            PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
            c03se.getClass();
            C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
            C722302rt c722302rtLIZIZ = C722302rt.LIZIZ(C722002rq.LJFF(billInfoData, (String) c443120HZeLJJJIL.getSecond(), ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue(), 0, (List) c443120HZeLJJJIL.getThird(), null, null, 52), null, false, true, 3145727);
            this.LLILZLL = c722302rtLIZIZ;
            arrayList.add(c722302rtLIZIZ);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILZ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
            state.LJIILL(arrayList, null);
        }
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> mapHi1 = VR().hi1(false);
        C722302rt c722302rt = this.LLILZLL;
        if (c722302rt != null && (strLIZ = C722102rr.LIZ(c722302rt)) != null) {
            mapHi1.put("summary_info", strLIZ);
        }
        Map<String, String> mapLJIIJJI = C7806033c.LJIIJJI(VR().LLJJI);
        Map<String, Object> mapLIZ = VR().LLLZLZ.LIZ("c35430.d0");
        c03o0.getClass();
        C03O0.LJLLILLLL(mapHi1, mapLJIIJJI, mapLIZ);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(activity), R.layout.avr, viewGroup, false);
            C786410Ut5.ed(viewTd, viewTd.getResources().getDisplayMetrics().heightPixels);
            C786410Ut5.LJLLLLLL(4, viewTd);
        } else {
            viewTd = null;
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
