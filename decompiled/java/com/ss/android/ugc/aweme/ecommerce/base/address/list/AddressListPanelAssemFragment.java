package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C1120604Zw;
import X.C1391190mJ3;
import X.C13LE;
import X.C1685300txQ;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2217381BqS;
import X.C23260099m;
import X.C343970De7;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C770702zh;
import X.C7740030o;
import X.C786410Ut5;
import X.C862003Yk;
import X.C958103op;
import X.C973303rH;
import X.C976703rp;
import X.C992303uL;
import X.InterfaceC1002303vx;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC988703tl;
import X.InterfaceC990303u1;
import X.InterfaceC990403u2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressListPanelAssemFragment extends ECBaseFragment implements InterfaceC988703tl, InterfaceC1164530gPT {
    public static final C976703rp LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZy43HELIOSLDcpOjx9JCw/PWESLCE+LDwgBCw/PR8yJiAgCDwgLSgKOy40JSAiPQ==";
    public ViewStub LLILLL;
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddressListPanelAssemFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/address/list/AddressListAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new C976703rp();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "shipping_info";
    }

    public final AddressListAssemViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (AddressListAssemViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC988703tl
    public final boolean onBackPressed() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(22);
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ == null || (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC990403u2) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC990403u2) it2.next()).Cb(aFwS185S0000000_1);
        }
        return true;
    }

    public AddressListPanelAssemFragment() {
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 56);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressListAssemViewModel.class);
        this.LLILZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS545S0100000_1(c19719912DlLIZ, 55), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS545S0100000_1, AFwS228S0000000_1.get$arr$(40));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 54));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        if (VR().LLJJJJJIL.LIZ) {
            return;
        }
        Bundle arguments = getArguments();
        AddressPageStarter.AddressListEnterParams addressListEnterParams = arguments != null ? (AddressPageStarter.AddressListEnterParams) arguments.getParcelable("enter_params") : null;
        VR().LLJJJJJIL.LIZJ = addressListEnterParams != null ? addressListEnterParams.getBtmToken() : null;
        VR().LLJJJJJIL.LJIIL(this, "a2270.b3894", null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        ((InterfaceC1002303vx) this.LLILZIL.getValue()).onDestroy();
        AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
        Address address = VR().LLJJIJIL;
        if (address == null || (str = address.id) == null) {
            str = "";
        }
        AddressPageStarter.AddressEvent addressEvent = new AddressPageStarter.AddressEvent(str, 3, null, null, null, null);
        addressPageStarter.getClass();
        C23260099m c23260099m = AddressPageStarter.LIZJ;
        if (c23260099m != null) {
            C189200o6.m2constructorimpl(addressEvent);
            c23260099m.resumeWith(addressEvent);
            AddressPageStarter.LIZJ = null;
        }
        C973303rH.LL.getClass();
        C973303rH.LLILZ.clear();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_address_select", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_live_end_event", this);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        Object obj = null;
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC990303u1) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((InterfaceC990303u1) next).K4(map)) {
                    obj = next;
                    break;
                }
            }
            InterfaceC990303u1 interfaceC990303u1 = (InterfaceC990303u1) obj;
            if (interfaceC990303u1 != null) {
                return interfaceC990303u1.K4(map);
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        HashMap<String, Object> map = VR().LLILZIL;
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1((HashMap) map, (HashMap<String, Object>) 59));
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", new AwS580S0100000_1((HashMap) map, (HashMap<String, Object>) 60));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((InterfaceC1002303vx) this.LLILZIL.getValue()).LIZIZ(this, getActivity(), VR(), null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        super.onConfigurationChanged(configuration);
        if (getParentFragment() instanceof TuxSheet) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isPad()) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJIILLIIL((int) C958103op.LIZIZ(), this);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("unavailable_address_ids");
        } else {
            string = null;
        }
        if (C770702zh.LIZ(string)) {
            C973303rH.LL.getClass();
            ArrayList<String> arrayList = C973303rH.LLILZ;
            arrayList.clear();
            arrayList.addAll((Collection) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, new TypeToken<List<? extends String>>() { // from class: X.03u0
            }.getType()));
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_address_select", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_live_end_event", this);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_address_select")) {
            C862003Yk.LIZ(str2);
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        } else {
            if (!Intrinsics.LJFF(str, "ec_live_end_event")) {
                return;
            }
            String str4 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.rn5);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (ViewStub) viewFindViewById;
        }
        C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
        InterfaceC1002303vx interfaceC1002303vx = (InterfaceC1002303vx) this.LLILZIL.getValue();
        VR();
        interfaceC1002303vx.LIZ(view);
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 61), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        C19GS c19gs = null;
        if (viewGroup != null) {
            viewLIZ = C992303uL.LIZ(layoutInflater.getContext(), R.layout.aiv, viewGroup);
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
