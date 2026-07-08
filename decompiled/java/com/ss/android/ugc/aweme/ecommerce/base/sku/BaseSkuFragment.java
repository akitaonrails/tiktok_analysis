package com.ss.android.ugc.aweme.ecommerce.base.sku;

import X.AnonymousClass0431;
import X.C01GW;
import X.C043B;
import X.C046D;
import X.C04UA;
import X.C098200Yq;
import X.C1019703yl;
import X.C1020203yq;
import X.C1389600mGU;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1752360vha;
import X.C189200o6;
import X.C19EG;
import X.C20161913uj;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.C958103op;
import X.C993603uY;
import X.DialogC1743780vTk;
import X.EnumC1752350vhZ;
import X.InterfaceC1164530gPT;
import Y.ACListenerS136S0100000_1;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseSkuFragment<VM extends C043B<?>> extends CommerceBottomSheetDialogFragment implements InterfaceC1164530gPT {
    public View LLJI;
    public final C1019703yl LLJIJIL;
    public KeyBoardVisibilityUtil LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    public BaseSkuFragment() {
        super(0);
        this.LLJIJIL = new C1019703yl();
        this.LLJILJILJ = C452501pT.LIZIZ(new C046D(this));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1((BaseSkuFragment) this, 1395));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final boolean MR() {
        return true;
    }

    public void clearFromXmlViewCache() {
        this.LLJI = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        gS(false);
        super.onStop();
    }

    public final View cS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cfz) : null;
            this.LLJI = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final VM dS() {
        return (VM) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        C1752360vha c1752360vha = EnumC1752350vhZ.Companion;
        Integer numValueOf = Integer.valueOf(dS().Zf2().LJIIJ());
        c1752360vha.getClass();
        return C1752360vha.LIZ(numValueOf);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer VR() {
        return Integer.valueOf((int) (dS().Zf2().LJIIJJI() * C958103op.LIZJ()));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AnonymousClass0431 anonymousClass0431Jt = dS().Jt();
        if (anonymousClass0431Jt != null) {
            anonymousClass0431Jt.LIZJ();
        }
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJILJIL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LLJILJIL = null;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_ocp_close_page", this);
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        gS(true);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1739450vMl
    public boolean Pp(Map<String, String> map) {
        return dS().Pp(map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1((BaseSkuFragment) this, 259));
        dS().Q3(c1748770vbn);
    }

    public final void gS(boolean z) {
        String string;
        Map<String, Object> map;
        Object obj;
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = dS().LLIIIJ();
        if (skuEnterParamsLLIIIJ != null && (map = skuEnterParamsLLIIIJ.trackParams) != null && (obj = map.get("source_page_type")) != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, "live")) {
            return;
        }
        int iIntValue = VR().intValue();
        ILiveStreamAdaptService.LIZ.getClass();
        C04UA.LIZ().LIZ(iIntValue, "ttec_us_sku_panel", z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View view;
        View viewFindViewById;
        ViewParent parent;
        C19EG c19eg;
        super.onActivityCreated(bundle);
        Context context = getContext();
        Object parent2 = null;
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
            this.LLJILJIL = new KeyBoardVisibilityUtil(c19eg, C20161913uj.LIZIZ(c19eg), AFwS284S0000000_1.get$arr$(8));
        }
        View view2 = getView();
        if (view2 != null && (parent = view2.getParent()) != null) {
            parent2 = parent.getParent();
        }
        if ((parent2 instanceof View) && (view = (View) parent2) != null && (viewFindViewById = view.findViewById(R.id.yg_)) != null) {
            C786410Ut5.I7(new ACListenerS136S0100000_1(this, 8), viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        dS().ER1((SkuPanelStarter.SkuEnterParams) C993603uY.LIZIZ(this, "enter_params"));
        C043B c043bDS = dS();
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = dS().LLIIIJ();
        AnonymousClass0431 anonymousClass0431Remove = null;
        if (skuEnterParamsLLIIIJ != null && (str = skuEnterParamsLLIIIJ.addToCartDelegateKey) != null) {
            anonymousClass0431Remove = C1020203yq.LIZ.remove(str);
        }
        c043bDS.bo0(anonymousClass0431Remove);
        AnonymousClass0431 anonymousClass0431Jt = dS().Jt();
        if (anonymousClass0431Jt != null) {
            anonymousClass0431Jt.LIZIZ();
        }
        dS().s60(new C2217371BqR() { // from class: X.045t
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getShowLoadingSpinner();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((SkuState) obj).setShowLoadingSpinner((Boolean) obj2);
            }
        }, new AwS580S0100000_1((BaseSkuFragment) this, 260));
        dS().s60(new C2217381BqS() { // from class: X.045s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getExceptionUX();
            }
        }, new AwS580S0100000_1((BaseSkuFragment) this, 261));
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_ocp_close_page", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        DialogC1743780vTk dialogC1743780vTk = new DialogC1743780vTk(requireContext(), getTheme());
        Window window = dialogC1743780vTk.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1743780vTk);
        return dialogC1743780vTk;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_ocp_close_page")) {
            try {
                dismiss();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
