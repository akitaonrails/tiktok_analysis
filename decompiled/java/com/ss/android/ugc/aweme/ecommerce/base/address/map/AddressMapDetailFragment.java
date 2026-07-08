package com.ss.android.ugc.aweme.ecommerce.base.address.map;

import X.AbstractC1252750ihl;
import X.AnonymousClass0317;
import X.C004I;
import X.C01GW;
import X.C034S;
import X.C03UB;
import X.C098200Yq;
import X.C1019103yf;
import X.C1120604Zw;
import X.C1177960gl8;
import X.C1179470gnZ;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1203050hPb;
import X.C1388190mED;
import X.C1389880mGw;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1745180vW0;
import X.C1746280vXm;
import X.C1746590vYH;
import X.C1746610vYJ;
import X.C1746840vYg;
import X.C1747440vZe;
import X.C1747460vZg;
import X.C1749280vcc;
import X.C1765020w20;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AQS;
import X.C21651819oS;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C2439609hC;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C992303uL;
import X.DialogC1389620mGW;
import X.EnumC1014603xw;
import X.EnumC1203090hPf;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1747020vYy;
import X.InterfaceC21506019Ek;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailState;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.map.PoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS57S0100100_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressMapDetailFragment extends ECBaseFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZy43LDcpOjx9JSQ8Zw43LDcpOjweKTUILDsyISkKOy40JSAiPQ==";
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 177));
    public final lifecycleAwareLazy LLILZ;
    public AddressPageStarter.AddressMapDetailEnterParams LLILZIL;
    public InterfaceC1747020vYy LLILZLL;
    public C1177960gl8 LLIZ;
    public C03UB LLIZLLLIL;
    public C1177960gl8 LLJ;
    public TuxNavBar LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public ViewGroup LLJILJILJ;
    public View LLJILLL;
    public ViewGroup LLJJ;
    public TuxIconView LLJJI;
    public ViewGroup LLJJIII;
    public ViewGroup LLJJIJI;
    public TextView LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public ViewGroup LLJJJ;
    public RecyclerView LLJJJIL;
    public View LLJJJJ;
    public C197039127h LLJJJJJIL;
    public C1749280vcc LLJJJJLIIL;
    public C1746280vXm LLJJL;
    public C21651819oS LLJJLIIIJLLLLLLLZ;
    public final BPEAHandler LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Function0<Unit> LLJLL;
    public float LLJLLIL;
    public final C01GW LLJLLL;
    public final C1746610vYJ LLJZ;
    public C1746590vYH LLJZIJLIL;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0vYJ] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0vYH] */
    public AddressMapDetailFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressMapDetailViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 176);
        this.LLILZ = new lifecycleAwareLazy(this, awS570S0100000_26, new AwS154S0400000_26(this, awS570S0100000_26, c19719912DlLIZ, AFwS313S0000000_26.get$arr$(5), 5));
        this.LLJL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLLIL = 19.0f;
        this.LLJLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 175));
        this.LLJZ = new InterfaceC21506019Ek() { // from class: X.0vYJ
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
                AddressMapDetailFragment addressMapDetailFragment = this.LL;
                addressMapDetailFragment.getClass();
                try {
                    FragmentManager fragmentManagerWR = addressMapDetailFragment.WR();
                    if (fragmentManagerWR == null || (numValueOf = Integer.valueOf(fragmentManagerWR.LJJLIIIIJ())) == null) {
                        return;
                    }
                    numValueOf.intValue();
                    if (numValueOf.intValue() >= 1) {
                        FragmentManager fragmentManagerWR2 = addressMapDetailFragment.WR();
                        if (!Intrinsics.LJFF((fragmentManagerWR2 == null || (interfaceC988103tfLJJLI = fragmentManagerWR2.LJJLI(numValueOf.intValue() - 1)) == null) ? null : interfaceC988103tfLJJLI.getName(), "address_map_detail_fragment")) {
                            return;
                        }
                    }
                    this.LL.ZR().LLJJ = null;
                    this.LL.ZR().LLJILJIL = System.currentTimeMillis();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1019103yf.LIZ(EnumC1014603xw.ERR20006, th, null);
                }
            }
        };
        this.LLJZIJLIL = new C1747460vZg() { // from class: X.0vYH
            @Override // X.C1747460vZg, X.InterfaceC1747220vZI
            public final void LIZJ(Address address, String str, Integer num, String str2, int i, Integer num2, String str3) {
                AddressMapDetailViewModel addressMapDetailViewModelZR = this.LIZ.ZR();
                addressMapDetailViewModelZR.LLJ = str;
                addressMapDetailViewModelZR.LLJI = num;
                addressMapDetailViewModelZR.LLJIJIL = str2;
                AddressMapDetailViewModel.lR2(this.LIZ.ZR(), address, null, 2);
                C786410Ut5.J4(this.LIZ.VR());
                AddressMapDetailViewModel.jR2(this.LIZ.ZR(), Integer.valueOf(i), true, null, 4);
                FragmentManager fragmentManagerWR = this.LIZ.WR();
                if (C07EQ.LIZ()) {
                    if (fragmentManagerWR != null) {
                        AddressMapDetailFragment addressMapDetailFragment = this.LIZ;
                        if (!fragmentManagerWR.LJLJJI()) {
                            fragmentManagerWR.LJLLJ(0, "address_map_detail_fragment");
                            return;
                        } else {
                            C786410Ut5.LJJZZIII(addressMapDetailFragment.LLJL, new ARunnableS126S0100000_26(fragmentManagerWR, 22));
                            return;
                        }
                    }
                    return;
                }
                if (fragmentManagerWR == null) {
                    return;
                }
                fragmentManagerWR.LJLLJ(0, "address_map_detail_fragment");
            }
        };
    }

    public final FragmentManager WR() {
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

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final DialogC1389620mGW VR() {
        return (DialogC1389620mGW) this.LLJLLL.getValue();
    }

    public final AddressMapDetailViewModel ZR() {
        return (AddressMapDetailViewModel) this.LLILZ.getValue();
    }

    public final void bS() {
        AnonymousClass0317 anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin;
        Fragment fragmentLIZIZ;
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        if (this.LLIZLLLIL != null) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin = PoiMapDependencyService.createIPoiMapDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IPoiMapDependencyService.class.getName(), anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPoiMapDependencyService.class);
        }
        C1179470gnZ c1179470gnZ = new C1179470gnZ();
        c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
        c1179470gnZ.LIZ = Double.valueOf(6.0d);
        c1179470gnZ.LIZJ = false;
        c1179470gnZ.LJ = false;
        c1179470gnZ.LIZIZ = false;
        c1179470gnZ.LJIIIIZZ = Boolean.FALSE;
        c1179470gnZ.LJII = false;
        c1179470gnZ.LJI = C2439609hC.LIZ(getContext());
        C03UB iMapManager = ((IPoiMapDependencyService) anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin).getIMapManager(new C1203050hPb(c1179470gnZ));
        this.LLIZLLLIL = iMapManager;
        if (iMapManager != null && (fragmentLIZIZ = iMapManager.LIZIZ()) != null && (childFragmentManager = getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
            c19ehLJIIJ.LIZIZ(R.id.nzi, fragmentLIZIZ);
            c19ehLJIIJ.LJIIIZ();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C03UB c03ub = this.LLIZLLLIL;
        if (c03ub != null) {
            c03ub.X(new AwS57S0100100_26(jCurrentTimeMillis, this, 0));
        }
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (ViewModelProvider.Factory) this.LLILLL.getValue();
    }

    public final void cS() {
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vXx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressMapDetailState) obj).getInputItemVOList();
            }
        }, new AwS640S0100000_26(this, 9));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZ0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressMapDetailState) obj).getPageState();
            }
        }, new AwS640S0100000_26(this, 10));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZ1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressMapDetailState) obj).getMapLocationVO();
            }
        }, new AwS640S0100000_26(this, 11));
        C11EA.LJII(this, ZR(), new C2217381BqS() { // from class: X.0vZ2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressMapDetailState) obj).getSaveLoadingStatus();
            }
        }, new AwS640S0100000_26(this, 12));
        C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
        C1746590vYH c1746590vYH = this.LLJZIJLIL;
        if (c1746590vYH != null) {
            ((ArrayList) c1746840vYgLIZ.LIZ).add(c1746590vYH);
        } else {
            c1746840vYgLIZ.getClass();
        }
    }

    public final void gS() {
        if (VR().isShowing()) {
            C786410Ut5.LJIIJ(VR());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FragmentManager fragmentManagerWR = WR();
        if (fragmentManagerWR != null) {
            fragmentManagerWR.LLD(this.LLJZ);
        }
        C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
        C1746590vYH c1746590vYH = this.LLJZIJLIL;
        if (c1746590vYH != null) {
            ((ArrayList) c1746840vYgLIZ.LIZ).remove(c1746590vYH);
        } else {
            c1746840vYgLIZ.getClass();
        }
        this.LLJZIJLIL = null;
        withState(ZR(), new AwS605S0100000_26(this, 180));
        this.LLJL.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AddressMapDetailFragment.class.getName());
        }
        super.onResume();
        ZR().LLJILJIL = System.currentTimeMillis();
    }

    public final void aS(Integer num) {
        if (num != null) {
            if (num.intValue() == -1) {
                gS();
                return;
            }
            if (num.intValue() == 0) {
                C786410Ut5.J4(VR());
                return;
            }
            if (num.intValue() != 2) {
                return;
            }
            gS();
            AddressMapDetailViewModel addressMapDetailViewModelZR = ZR();
            String string = addressMapDetailViewModelZR.LLJJIII;
            if (string == null) {
                string = null;
            }
            addressMapDetailViewModelZR.LLJJIII = null;
            if (string == null || a0.LJJJIL(string)) {
                string = getString(2131848087);
            }
            C1389880mGw c1389880mGw = new C1389880mGw(this);
            c1389880mGw.LJIIIZ(string);
            c1389880mGw.LJIIJ();
        }
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
            this.LLILZIL = addressMapDetailEnterParams;
        }
        AddressMapDetailViewModel addressMapDetailViewModelZR = ZR();
        addressMapDetailViewModelZR.getClass();
        AwS675S0100000_26 awS675S0100000_26 = new AwS675S0100000_26(addressMapDetailViewModelZR, 35);
        CertProviderManagerKt.findCert("bpea-ecom_address_map_locate", 1476395008, "svfi");
        try {
            C1745180vW0.LIZ(null, awS675S0100000_26);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJIJL(bundle, "enter_params", this.LLILZIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x03a7  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public static void dS(AddressMapDetailFragment addressMapDetailFragment, C1177960gl8 c1177960gl8, Float f) {
        float fFloatValue;
        addressMapDetailFragment.LLJLILLLLZIIL = true;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = addressMapDetailFragment.LLJLLIL;
        }
        addressMapDetailFragment.LLJLLIL = fFloatValue;
        InterfaceC1747020vYy interfaceC1747020vYy = addressMapDetailFragment.LLILZLL;
        if (interfaceC1747020vYy != null) {
            interfaceC1747020vYy.LIZIZ(c1177960gl8, Float.valueOf(fFloatValue), null);
        }
        C21651819oS c21651819oS = addressMapDetailFragment.LLJJLIIIJLLLLLLLZ;
        if (c21651819oS != null) {
            c21651819oS.LLILLJJLI = fFloatValue;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        C19GS c19gs = null;
        if (viewGroup != null) {
            viewLIZ = C992303uL.LIZ(layoutInflater.getContext(), R.layout.aj3, viewGroup);
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

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
