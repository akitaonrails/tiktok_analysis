package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment;

import X.C019F;
import X.C01D1;
import X.C034S;
import X.C098200Yq;
import X.C1018503yZ;
import X.C1120604Zw;
import X.C1280004ze;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1722170uut;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC911603hK;
import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class GeneralPostPaymentGuideFragment extends CommerceBottomSheetDialogFragment {
    public static final C1722170uut LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs8KDY+LSs4HELIOSZyg2JiA+KCMjJzY4OS4qJSAiPWEULSspOy4/GCo/PR8yMSgpJzsUPSwoLAkhKSIhLCEn";
    public final AssemVMLazy LLJI;
    public Map<String, ? extends Object> LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GeneralPostPaymentGuideFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/generalpostpayment/GeneralPostPaymentAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new C1722170uut();
        new AtomicInteger(0);
    }

    public GeneralPostPaymentGuideFragment() {
        AssemVMLazy assemVMLazy;
        super(0);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GeneralPostPaymentAssemViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 288);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(207);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 395), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS570S0100000_26((Fragment) this, 396), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 397), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
        this.LLJIJIL = C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer VR() {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(624)));
    }

    public final GeneralPostPaymentAssemViewModel cS() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (GeneralPostPaymentAssemViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() throws JSONException {
        super.onDestroyView();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", "backup_payment");
            jSONObject.put("action", "skip");
            jSONObject.put("result", false);
            iEventCenter.LIZ("ec_checkout_guide_exit", C786410Ut5.J3(jSONObject));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String string;
        IECommerceHostService iECommerceHostService;
        super.onStop();
        long jCurrentTimeMillis = System.currentTimeMillis() - cS().LLILLJJLI;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("key_action")) == null) {
            string = "BACKUP_PAYMENT";
        }
        if (Intrinsics.LJFF(string, "VISA_PAYMENT_SIGNAL")) {
            Object obj = cS().LL.get("previous_page");
            Object obj2 = obj instanceof String ? obj : null;
            if (obj2 == null) {
                obj2 = "";
            }
            Map<String, Object> mapWQ2 = cS().wQ2("authorize_payment_signal", "");
            mapWQ2.remove("previous_page_id");
            mapWQ2.put("previous_id", obj2);
            mapWQ2.put("stay_time", Integer.valueOf((int) jCurrentTimeMillis));
            C1018503yZ.LIZIZ("pipo_page_stay", mapWQ2, true);
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        String str = (rootPageMonitor == null || !rootPageMonitor.LJFF()) ? cS().LLILLL : "close";
        GeneralPostPaymentAssemViewModel generalPostPaymentAssemViewModelCS = cS();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(generalPostPaymentAssemViewModelCS.xQ2());
        generalPostPaymentAssemViewModelCS.vQ2(linkedHashMap);
        linkedHashMap.put("page_name", "active_backup_payment");
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(jCurrentTimeMillis));
        C1018503yZ.LIZIZ("tiktokec_stay_page", linkedHashMap, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel;
        String string;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key_material_content")) != null) {
            generalPostPaymentGuideModel = (GeneralPostPaymentGuideModel) C1280004ze.LIZ(string, GeneralPostPaymentGuideModel.class);
        } else {
            generalPostPaymentGuideModel = null;
        }
        C723850SaN.LIZ(this, false, null, new AwS390S0200000_24(this, generalPostPaymentGuideModel, 3), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("key_action")) == null) {
            string = "BACKUP_PAYMENT";
        }
        boolean zLJFF = Intrinsics.LJFF(string, "VISA_PAYMENT_SIGNAL");
        cS().LLILLJJLI = System.currentTimeMillis();
        cS().LL = new LinkedHashMap(this.LLJIJIL);
        cS().LLILLL = "return";
        cS().LL.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C19GS c19gs = null;
        if (zLJFF) {
            Object obj = cS().LL.get("previous_page");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            C1018503yZ.LIZIZ("pipo_page_show", cS().wQ2("authorize_payment_signal", str), true);
        } else {
            cS().LL.put("page_name", "active_backup_payment");
            GeneralPostPaymentAssemViewModel generalPostPaymentAssemViewModelCS = cS();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(generalPostPaymentAssemViewModelCS.xQ2());
            generalPostPaymentAssemViewModelCS.vQ2(linkedHashMap);
            C1018503yZ.LIZIZ("tiktokec_enter_page", linkedHashMap, true);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aq7, viewGroup, false);
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
