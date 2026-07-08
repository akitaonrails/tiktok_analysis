package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AnonymousClass0317;
import X.C034S;
import X.C03WK;
import X.C098200Yq;
import X.C09AY;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1257480ipO;
import X.C1389600mGU;
import X.C13LE;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AQS;
import X.C2371409Qy;
import X.C786410Ut5;
import X.C842503Qx;
import X.C914303hl;
import X.C928203k0;
import X.C960603pE;
import X.DialogC1743800vTm;
import X.InterfaceC1164530gPT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1748810vbr;
import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.event.PaymentResultReceivedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.PipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentHalfFragment extends CommerceBottomSheetDialogFragment implements InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExHELIOSKTYpZyAgOGs8KDY+LSs4Zx8yMSgpJzsbKSkqDz0yLygpJzs=";
    public FrameLayout LLJI;
    public EnterParams LLJIJIL;
    public InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit> LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public Function1<? super PaymentMethod, Unit> LLJILLL;
    public String LLJJ;
    public C09AY LLJJI;
    public Function2<? super ChangeInfo, ? super InterfaceC1364105Vn<? super C842503Qx>, ? extends Object> LLJJIII;

    public PaymentHalfFragment() {
        super(0);
        this.LLJIJIL = new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
        this.LLJILJIL = AFwS326S0000000_1.get$arr$(3);
        this.LLJILJILJ = AFwS185S0000000_1.get$arr$(52);
        this.LLJILLL = AFwS228S0000000_1.get$arr$(159);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final boolean MR() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer VR() {
        Integer num;
        HashMap<String, Object> map = this.LLJIJIL.trackParams;
        Object obj = map != null ? map.get("sea_one_step_type") : null;
        if ((obj instanceof Integer) && (num = (Integer) obj) != null && num.intValue() > 0) {
            return Integer.valueOf(C928203k0.LJIIJJI(C928203k0.LIZ));
        }
        EnterParams enterParams = this.LLJIJIL;
        Integer num2 = enterParams.LJJIII;
        if (num2 != null) {
            return num2;
        }
        C928203k0 c928203k0 = C928203k0.LIZ;
        HashMap<String, Object> map2 = enterParams.trackParams;
        String strValueOf = String.valueOf(map2 != null ? map2.get("checkout_type") : null);
        HashMap<String, Object> map3 = this.LLJIJIL.trackParams;
        String strValueOf2 = String.valueOf(map3 != null ? map3.get("source_page_type") : null);
        c928203k0.getClass();
        Integer numLJIIL = C928203k0.LJIIL(null, strValueOf, strValueOf2);
        if (numLJIIL != null) {
            return numLJIIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return TrackNodeStore.LIZLLL(this.LLJJ, this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final int getTheme() {
        Integer num;
        HashMap<String, Object> map = this.LLJIJIL.trackParams;
        Object obj = map != null ? map.get("sea_one_step_type") : null;
        if ((obj instanceof Integer) && (num = (Integer) obj) != null && num.intValue() > 0) {
            return super.getTheme();
        }
        HashMap<String, Object> map2 = this.LLJIJIL.trackParams;
        Object obj2 = map2 != null ? map2.get("checkout_type") : null;
        return (Intrinsics.LJFF(obj2, "one_step_checkout") || Intrinsics.LJFF(obj2, "multi_express_checkout")) ? R.style.aad : super.getTheme();
    }

    @Override // androidx.fragment.app.DialogFragment
    /* JADX INFO: renamed from: cS, reason: merged with bridge method [inline-methods] */
    public final DialogC1743800vTm getDialog() {
        Dialog dialog = super.getDialog();
        if (dialog instanceof DialogC1743800vTm) {
            return (DialogC1743800vTm) dialog;
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C914303hl.LIZ.getClass();
        C914303hl.LIZJ(this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_payment_change", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_payment_page_refresh_data", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_order_result_received", this);
        }
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZJ("ec_pipo_change_payment_method", this);
        }
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin;
        boolean z;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        super.onCreate(bundle);
        String name3 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name2 = iECommerceHostService.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name4, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isOffline()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name5 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!((IApplicationDependencyService) iECommerceHostService2).isRegressionTest()) {
                return;
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = PipoOfflineDependencyService.createIPipoOfflineDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name6 = IPipoOfflineDependencyService.class.getName();
            if (anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null) {
                name3 = anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name3, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPipoOfflineDependencyService.class);
        }
        ((IPipoOfflineDependencyService) anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin).postPipoCashierShowWindowLaterEvent();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Object obj;
        Dialog dialogOnCreateDialog;
        View decorView;
        Integer num;
        HashMap<String, Object> map = this.LLJIJIL.trackParams;
        Object obj2 = null;
        if (map != null) {
            obj = map.get("sea_one_step_type");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null && num.intValue() > 0) {
            dialogOnCreateDialog = new DialogC1743800vTm(requireContext(), getTheme());
        } else {
            HashMap<String, Object> map2 = this.LLJIJIL.trackParams;
            if (map2 != null) {
                obj2 = map2.get("checkout_type");
            }
            if (!Intrinsics.LJFF(obj2, "one_step_checkout") && !Intrinsics.LJFF(obj2, "multi_express_checkout")) {
                dialogOnCreateDialog = new DialogC1743800vTm(requireContext(), getTheme());
            } else {
                dialogOnCreateDialog = super.onCreateDialog(bundle);
            }
        }
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        switch (str.hashCode()) {
            case -1342066716:
                if (str.equals("ec_payment_page_refresh_data") && C03WK.LIZ(this.LLJIJIL)) {
                    dismissAllowingStateLoss();
                    break;
                }
                break;
            case -63025501:
                if (str.equals("ec_pipo_change_payment_method")) {
                    dismissAllowingStateLoss();
                }
                break;
            case 412057034:
                if (str.equals("ec_payment_change")) {
                    if (!this.LLJIJIL.LIZLLL() || !Intrinsics.LJFF(this.LLJIJIL.paySource, "ordersubmit")) {
                        dismissAllowingStateLoss();
                    }
                }
                break;
            case 1256753137:
                if (str.equals("ec_order_result_received")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(PaymentResultReceivedEvent.class));
                        } else {
                            type = new TypeToken<PaymentResultReceivedEvent>() { // from class: X.03cg
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                        if (!(objFromJson instanceof PaymentResultReceivedEvent)) {
                            objFromJson = null;
                        }
                        PaymentResultReceivedEvent paymentResultReceivedEvent = (PaymentResultReceivedEvent) objFromJson;
                        if (paymentResultReceivedEvent != null && paymentResultReceivedEvent.closePage && C03WK.LIZ(this.LLJIJIL)) {
                            dismissAllowingStateLoss();
                            break;
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PaymentFragment paymentFragment = new PaymentFragment();
        C1257480ipO.LIZ.erase("PAYMENT_STATE");
        paymentFragment.LLL = this.LLJJIII;
        paymentFragment.LLJJL = new AwS650S0100000_1(this, 5);
        paymentFragment.LLJJLIIIJLLLLLLLZ = new AwS545S0100000_1(this, 931);
        paymentFragment.LLJL = new AwS580S0100000_1(this, 131);
        paymentFragment.LLJZIJLIL = C960603pE.LIZLLL(view);
        EnterParams enterParams = this.LLJIJIL;
        enterParams.LIZ = true;
        paymentFragment.LLJJJJLIIL = enterParams;
        paymentFragment.LLJLIL = new AwS367S0200000_1(this, view, 81);
        paymentFragment.LLJLL = new AwS545S0100000_1(this, 932);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.iip);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (FrameLayout) viewFindViewById;
        }
        c19ehLJIIJ.LIZIZ(viewFindViewById.getId(), paymentFragment);
        c19ehLJIIJ.LJIIJ();
        C914303hl.LIZ.getClass();
        C914303hl.LJ("payment_method");
        C914303hl.LIZLLL(this, "payment_method");
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_payment_change", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_payment_page_refresh_data", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZLLL("ec_order_result_received", this);
        }
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZLLL("ec_pipo_change_payment_method", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.amt, viewGroup, false);
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
