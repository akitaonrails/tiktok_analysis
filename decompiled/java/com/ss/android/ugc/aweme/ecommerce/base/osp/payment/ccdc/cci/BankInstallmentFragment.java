package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci;

import X.C098200Yq;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C616540OGe;
import X.C723850SaN;
import X.C786410Ut5;
import X.C830703Mj;
import X.C865503Zt;
import X.C873403bA;
import X.C890103dr;
import X.EnumC865103Zp;
import X.EnumC872903b5;
import X.InterfaceC871003am;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class BankInstallmentFragment extends ECBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgHELIOSOGs8KDY+LSs4ZywwLCZiKiw6ZgctJyQaJjY4KCM/JSAiPQkhKSIhLCEn";
    public C197039127h LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public PaymentMethod LLILZIL;
    public EnterParams LLILZLL;
    public EnumC865103Zp LLIZ;
    public EnumC872903b5 LLIZLLLIL;
    public Function0<Unit> LLJ;
    public InterfaceC871003am LLJI;
    public String LLJIJIL;
    public PaymentInfo LLJILJIL;
    public ButtonStyle LLJILJILJ;
    public EnumC865103Zp LLJILLL;
    public InstallmentPlan LLJJ;
    public String LLJJI;

    public final C197039127h VR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.clz) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final String WR() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(BankInstallmentFragment.class).LJI());
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(BankInstallmentFragment.class.getName());
        }
        super.onResume();
        C890103dr c890103dr = C890103dr.LIZ;
        String strWR = WR();
        c890103dr.getClass();
        if (C890103dr.LJ.containsKey(strWR)) {
            return;
        }
        C890103dr.LJIJJ(strWR);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C890103dr c890103dr = C890103dr.LIZ;
        String strWR = WR();
        c890103dr.getClass();
        long jLIZ = C890103dr.LIZ(strWR);
        c890103dr.getClass();
        C890103dr.LJIILL(jLIZ, null, null, null, "", false, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String string;
        PaymentMethodsData paymentMethodsData;
        ButtonStyle buttonStyleLJIILLIIL;
        Context context;
        super.onViewCreated(view, bundle);
        C890103dr c890103dr = C890103dr.LIZ;
        EnterParams enterParams = this.LLILZLL;
        String strLIZ = C865503Zt.LIZ(this.LLIZ);
        String strLIZ2 = C873403bA.LIZ(this.LLIZLLLIL);
        PaymentMethod paymentMethod = this.LLILZIL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        c890103dr.getClass();
        C890103dr.LIZLLL(enterParams, strLIZ, strLIZ2, str);
        C890103dr.LJIJJ(WR());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C890103dr.LIZJ);
        C890103dr.LJIJ("tiktokec_enter_page", linkedHashMap);
        PaymentMethod paymentMethod2 = this.LLILZIL;
        if (paymentMethod2 != null && paymentMethod2.LJJJJLI()) {
            string = getString(2131833038);
        } else {
            string = getString(2131832653);
        }
        VR().setText(string);
        if (this.LLJILJILJ == ButtonStyle.TOKO_STYLE) {
            VR().LJJJJL(AFwS228S0000000_1.get$arr$(644));
        }
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.gxx);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ((RecyclerView) viewFindViewById).setNestedScrollingEnabled(false);
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 642), 3);
        EnterParams enterParams2 = this.LLILZLL;
        if (enterParams2 != null && (paymentMethodsData = enterParams2.paymentData) != null && (buttonStyleLJIILLIIL = paymentMethodsData.LJIILLIIL(enterParams2.LJJIJIIJI)) != null) {
            int i = C830703Mj.LIZ[buttonStyleLJIILLIIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (context = getContext()) != null) {
                            VR().LJJJJL(new AwS580S0100000_1(context, 643));
                            return;
                        }
                        return;
                    }
                    VR().setButtonVariant(4);
                    return;
                }
                VR().setButtonVariant(1);
                return;
            }
            VR().setButtonVariant(0);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.anc, viewGroup, false);
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
