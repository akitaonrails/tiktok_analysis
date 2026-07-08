package com.ss.android.ugc.aweme.ecommerce.base.address.map2;

import X.AnonymousClass0317;
import X.C019F;
import X.C01D1;
import X.C034S;
import X.C03UB;
import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C1019103yf;
import X.C1120604Zw;
import X.C1177960gl8;
import X.C1179470gnZ;
import X.C1203050hPb;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1388190mED;
import X.C13LE;
import X.C15438062q;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C1745180vW0;
import X.C1746600vYI;
import X.C1746620vYK;
import X.C1746690vYR;
import X.C1746730vYV;
import X.C1746840vYg;
import X.C1747440vZe;
import X.C1747460vZg;
import X.C1749260vca;
import X.C1775680wJC;
import X.C1848410yCV;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AQS;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2439609hC;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616540OGe;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C948503nH;
import X.C987103tV;
import X.C992303uL;
import X.EnumC1014603xw;
import X.EnumC1203090hPf;
import X.InterfaceC1747020vYy;
import X.InterfaceC21506019Ek;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailFragment2;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.map.PoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import g1c.AjS12S0000000_26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS57S0100100_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressMapDetailFragment2 extends ECBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZy43LDcpOjx9JSQ8e2ESLCE+LDwgBSQ8DSonKSwgDz0yLygpJzth";
    public final AssemVMLazy LLILLL;
    public AddressPageStarter.AddressMapDetailEnterParams LLILZ;
    public InterfaceC1747020vYy LLILZIL;
    public C1177960gl8 LLILZLL;
    public C03UB LLIZ;
    public C1177960gl8 LLIZLLLIL;
    public TuxNavBar LLJ;
    public TuxIconView LLJI;
    public TuxTextView LLJIJIL;
    public ViewGroup LLJILJIL;
    public View LLJILJILJ;
    public ViewGroup LLJILLL;
    public TuxIconView LLJJ;
    public ViewGroup LLJJI;
    public C1749260vca LLJJIII;
    public FrameLayout LLJJIJI;
    public final BPEAHandler LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public AwS570S0100000_26 LLJJJIL;
    public final C1746620vYK LLJJJJ;
    public C1746730vYV LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddressMapDetailFragment2.class, "viewModel", "getViewModel$ecommerce_transaction_release()Lcom/ss/android/ugc/aweme/ecommerce/base/address/map2/AddressMapDetailViewModel2;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final FragmentManager VR() {
        FragmentManager parentFragmentManager = null;
        try {
            if (isAdded() && !isDetached()) {
                parentFragmentManager = getParentFragmentManager();
                return parentFragmentManager;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR20009, e, null);
        }
        return parentFragmentManager;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0vYK] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0vYV] */
    public AddressMapDetailFragment2() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressMapDetailViewModel2.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 178);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(166);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 179), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 180), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 181), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLL = assemVMLazy;
        this.LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJJ = new InterfaceC21506019Ek() { // from class: X.0vYK
            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeCancelled() {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
            }

            @Override // X.InterfaceC21506019Ek
            public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
            }

            @Override // X.InterfaceC21506019Ek
            public final void onBackStackChanged() {
                Integer numValueOf;
                InterfaceC988103tf interfaceC988103tfLJJLI;
                AddressMapDetailFragment2 addressMapDetailFragment2 = this.LL;
                addressMapDetailFragment2.getClass();
                try {
                    FragmentManager fragmentManagerVR = addressMapDetailFragment2.VR();
                    if (fragmentManagerVR == null || (numValueOf = Integer.valueOf(fragmentManagerVR.LJJLIIIIJ())) == null) {
                        return;
                    }
                    numValueOf.intValue();
                    if (numValueOf.intValue() >= 1) {
                        FragmentManager fragmentManagerVR2 = addressMapDetailFragment2.VR();
                        if (!Intrinsics.LJFF((fragmentManagerVR2 == null || (interfaceC988103tfLJJLI = fragmentManagerVR2.LJJLI(numValueOf.intValue() - 1)) == null) ? null : interfaceC988103tfLJJLI.getName(), "address_map_detail_fragment")) {
                            return;
                        }
                    }
                    this.LL.WR().LLILZIL = null;
                    this.LL.WR().LLILZ = System.currentTimeMillis();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1019103yf.LIZ(EnumC1014603xw.ERR20006, th, null);
                }
            }
        };
        this.LLJJJJJIL = new C1747460vZg() { // from class: X.0vYV
            @Override // X.C1747460vZg, X.InterfaceC1747220vZI
            public final void LIZJ(Address address, String str, Integer num, String str2, int i, Integer num2, String str3) {
                C1747440vZe.LIZ().LIZ(address, Boolean.TRUE, "map_pin", str3, num2, str, num, str2);
                if (num2 != null && num2.intValue() == 2) {
                    this.LIZ.WR().LLILZIL = "click_suggested_address";
                    this.LIZ.WR().vQ2();
                }
            }
        };
    }

    public final AddressMapDetailViewModel2 WR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (AddressMapDetailViewModel2) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FragmentManager fragmentManagerVR = VR();
        if (fragmentManagerVR != null) {
            fragmentManagerVR.LLD(this.LLJJJJ);
        }
        C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
        C1746730vYV c1746730vYV = this.LLJJJJJIL;
        if (c1746730vYV != null) {
            ((ArrayList) c1746840vYgLIZ.LIZ).remove(c1746730vYV);
        } else {
            c1746840vYgLIZ.getClass();
        }
        this.LLJJJJJIL = null;
        WR().withState(new AwS605S0100000_26(new AwS605S0100000_26(this, 183), 802));
        this.LLJJIJIIJIL.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddressMapDetailFragment2.class.getName());
        }
        super.onResume();
        WR().LLILZ = System.currentTimeMillis();
        if (WR().LLIZ) {
            return;
        }
        WR().LLIZ = true;
        WR().LLILZ = System.currentTimeMillis();
        C1746690vYR.LIZ.getClass();
        C1746690vYR.LIZJ("tiktokec_enter_page", new LinkedHashMap());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams;
        C19EG c19egLIZIZ;
        Window window;
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (window = c19egLIZIZ.getWindow()) != null) {
            window.setStatusBarColor(0);
        }
        if (bundle != null && (addressMapDetailEnterParams = (AddressPageStarter.AddressMapDetailEnterParams) bundle.getParcelable("enter_params")) != null) {
            this.LLILZ = addressMapDetailEnterParams;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJIJL(bundle, "enter_params", this.LLILZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.0wBP] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.05Vn, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.HashMap<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ?? r8;
        ?? r9;
        ?? r11;
        ?? r12;
        ?? r14;
        AnonymousClass0317 anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin;
        Fragment fragmentLIZIZ;
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        boolean z;
        ?? name;
        TuxNavBar tuxNavBar;
        OnBackPressedDispatcher onBackPressedDispatcher;
        C0I7D editTextView;
        Address addressLIZIZ;
        ?? LJIIJ;
        String string;
        String str;
        Object obj;
        String string2;
        Object obj2;
        String str2;
        ArrayList arrayList;
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = this.LLILZ;
        LocationUseBar locationUseBar = null;
        if (addressMapDetailEnterParams != null) {
            AddressMapDetailViewModel2 addressMapDetailViewModel2WR = WR();
            addressMapDetailViewModel2WR.LL = addressMapDetailEnterParams;
            Address address = addressMapDetailEnterParams.address;
            String str3 = "";
            if (address != null) {
                List<AddressItem> list = address.items;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (AddressItem addressItem : list) {
                        if (Intrinsics.LJFF(addressItem.key, "address")) {
                            addressItem = new AddressItem(addressItem.key, "");
                        }
                        arrayList.add(addressItem);
                    }
                } else {
                    arrayList = null;
                }
                locationUseBar = null;
                addressLIZIZ = Address.LIZIZ(address, arrayList, null, null, null, null, null, null, 4093);
            } else {
                addressLIZIZ = null;
            }
            addressMapDetailViewModel2WR.LLILLJJLI = addressLIZIZ;
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams2 = addressMapDetailViewModel2WR.LL;
            if (addressMapDetailEnterParams2 != null && (str2 = addressMapDetailEnterParams2.trackParams) != null) {
                LJIIJ = C1741890vQh.LJIIJ(str2);
            } else {
                LJIIJ = locationUseBar;
            }
            addressMapDetailViewModel2WR.LLILZLL = LJIIJ;
            C1746690vYR c1746690vYR = C1746690vYR.LIZ;
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams3 = this.LLILZ;
            HashMap<String, Object> map = WR().LLILZLL;
            c1746690vYR.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_name", "trajectory_map_for_address");
            linkedHashMap.put("address_authorization_type", C1745180vW0.LIZJ());
            if (map == null || (obj2 = map.get("entrance_info")) == null || (string = obj2.toString()) == null) {
                string = "";
            }
            linkedHashMap.put("entrance_info", string);
            if (addressMapDetailEnterParams3 == null || (str = addressMapDetailEnterParams3.previousPage) == null) {
                str = "";
            }
            linkedHashMap.put("previous_page", str);
            linkedHashMap.put("trigger_event", "click_map_pin");
            if (map != null && (obj = map.get("fill_type")) != null && (string2 = obj.toString()) != null) {
                str3 = string2;
            }
            linkedHashMap.put("fill_type", str3);
            C1746690vYR.LIZIZ = linkedHashMap;
        }
        this.LLJ = (TuxNavBar) view.findViewById(R.id.y08);
        this.LLJI = (TuxIconView) view.findViewById(R.id.qgh);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.qgy);
        this.LLJILJIL = (ViewGroup) view.findViewById(R.id.qh0);
        this.LLJILJILJ = view.findViewById(R.id.qgz);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.nod);
        this.LLJJ = (TuxIconView) view.findViewById(R.id.noc);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.nzi);
        this.LLJJIII = (C1749260vca) view.findViewById(R.id.nzr);
        this.LLJJIJI = (FrameLayout) view.findViewById(R.id.cbb);
        C1749260vca c1749260vca = this.LLJJIII;
        if (c1749260vca != null) {
            c1749260vca.setFocusable(false);
        }
        C1749260vca c1749260vca2 = this.LLJJIII;
        if (c1749260vca2 != null) {
            c1749260vca2.setFocusableInTouchMode(false);
        }
        C1749260vca c1749260vca3 = this.LLJJIII;
        if (c1749260vca3 != null) {
            c1749260vca3.clearFocus();
        }
        C1749260vca c1749260vca4 = this.LLJJIII;
        if (c1749260vca4 != null && (editTextView = c1749260vca4.getEditTextView()) != null) {
            editTextView.setFocusable(false);
            editTextView.setFocusableInTouchMode(false);
            editTextView.setCursorVisible(false);
            editTextView.setInputType(0);
            C786410Ut5.d9(editTextView, new ACListenerS160S0100000_26(this, 77));
            editTextView.setHint(editTextView.getContext().getString(2131850347));
        }
        C1749260vca c1749260vca5 = this.LLJJIII;
        if (c1749260vca5 != null) {
            View.OnClickListener aCListenerS160S0100000_26 = new ACListenerS160S0100000_26(this, 78);
            if (C1848410yCV.LIZ) {
                aCListenerS160S0100000_26 = new f(aCListenerS160S0100000_26);
            }
            a aVar = new a(aCListenerS160S0100000_26);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1749260vca5);
            }
            c1749260vca5.setOnClickListener(aVar);
        }
        C1746690vYR.LIZIZ(C1746690vYR.LIZ, "search");
        Address address2 = WR().LLILLJJLI;
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams4 = WR().LL;
        if (addressMapDetailEnterParams4 != null) {
            r8 = addressMapDetailEnterParams4.trackParams;
        } else {
            r8 = locationUseBar;
        }
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams5 = this.LLILZ;
        if (addressMapDetailEnterParams5 != null) {
            r9 = addressMapDetailEnterParams5.previousPage;
        } else {
            r9 = locationUseBar;
        }
        String str4 = "trajectory_map_for_address";
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams6 = WR().LL;
        if (addressMapDetailEnterParams6 != null) {
            r11 = addressMapDetailEnterParams6.containerId;
        } else {
            r11 = locationUseBar;
        }
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams7 = WR().LL;
        if (addressMapDetailEnterParams7 != null) {
            r12 = addressMapDetailEnterParams7.isFullPage;
        } else {
            r12 = locationUseBar;
        }
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams8 = WR().LL;
        if (addressMapDetailEnterParams8 != null) {
            r14 = addressMapDetailEnterParams8.needUpdateDistricts;
        } else {
            r14 = locationUseBar;
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams = new AddressPageStarter.AddressAssociateEnterParams(address2, r8, r9, str4, r11, r12, locationUseBar, r14, 2, "trajectory_map_for_address", 64);
        AddressAssociateFragment addressAssociateFragment = new AddressAssociateFragment();
        addressAssociateFragment.LLJJIJIIJIL = addressAssociateEnterParams;
        C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ2.LJIJ(R.id.cbb, addressAssociateFragment, "address_associate_fragment");
        c19ehLJIIJ2.LJIIIZ();
        WR().LLILZ = System.currentTimeMillis();
        FragmentManager fragmentManagerVR = VR();
        if (fragmentManagerVR != null) {
            fragmentManagerVR.LJFF(this.LLJJJJ);
        }
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new C1775680wJC(this, 3));
        }
        C786410Ut5.I7(new AjS12S0000000_26(2), view);
        Context context = getContext();
        if (context != null && (tuxNavBar = this.LLJ) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1552));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131850348);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
        ?? r112 = locationUseBar;
        ?? r13 = locationUseBar;
        AssemViewModel.selectSubscribe$default(WR(), new C2217381BqS() { // from class: X.0qkr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C1556630qbt) obj3).LLILLJJLI;
            }
        }, r112, this, r13, new AwS605S0100000_26(new AwS605S0100000_26(this, 800), 801), 10, r13);
        C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
        C1746730vYV c1746730vYV = this.LLJJJJJIL;
        if (c1746730vYV != null) {
            ((ArrayList) c1746840vYgLIZ.LIZ).add(c1746730vYV);
        } else {
            c1746840vYgLIZ.getClass();
        }
        if (this.LLIZ == null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin = PoiMapDependencyService.createIPoiMapDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IPoiMapDependencyService.class.getName();
                if (anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = r13;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPoiMapDependencyService.class);
            }
            C1179470gnZ c1179470gnZ = new C1179470gnZ();
            c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
            c1179470gnZ.LIZ = Double.valueOf(6.0d);
            c1179470gnZ.LIZJ = false;
            c1179470gnZ.LJ = false;
            c1179470gnZ.LJII = false;
            c1179470gnZ.LJI = C2439609hC.LIZ(getContext());
            C03UB iMapManager = ((IPoiMapDependencyService) anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin).getIMapManager(new C1203050hPb(c1179470gnZ));
            this.LLIZ = iMapManager;
            if (iMapManager != null && (fragmentLIZIZ = iMapManager.LIZIZ()) != null && (childFragmentManager = getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LIZIZ(R.id.nzi, fragmentLIZIZ);
                c19ehLJIIJ.LJIIIZ();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C03UB c03ub = this.LLIZ;
            if (c03ub != null) {
                c03ub.X(new AwS57S0100100_26(this, jCurrentTimeMillis, 6));
            }
        }
        C948503nH.LJ(C948503nH.LIZIZ(this), C2107308Nj.LIZ, new C1746600vYI(this, r13));
    }

    public static void ZR(AddressMapDetailFragment2 addressMapDetailFragment2, C1177960gl8 c1177960gl8, Float f) {
        addressMapDetailFragment2.LLJJIJIL = true;
        InterfaceC1747020vYy interfaceC1747020vYy = addressMapDetailFragment2.LLILZIL;
        if (interfaceC1747020vYy != null) {
            interfaceC1747020vYy.LIZIZ(c1177960gl8, f, null);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        C19GS c19gs = null;
        if (viewGroup != null) {
            viewLIZ = C992303uL.LIZ(layoutInflater.getContext(), R.layout.aj4, viewGroup);
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
