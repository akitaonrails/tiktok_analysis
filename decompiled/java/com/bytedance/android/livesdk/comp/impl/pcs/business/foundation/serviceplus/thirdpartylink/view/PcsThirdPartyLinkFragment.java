package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1217670hnB;
import X.C1217700hnE;
import X.C1218500hoW;
import X.C1218510hoX;
import X.C1218570hod;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1821460xV2;
import X.C1821490xV5;
import X.C1821500xV6;
import X.C1821550xVB;
import X.C1821560xVC;
import X.C1821570xVD;
import X.C1821580xVE;
import X.C1821620xVI;
import X.C1821830xVd;
import X.C1821860xVg;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C489600JHy;
import X.C517510KRh;
import X.C517520KRi;
import X.C517550KRl;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1822080xW2;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.viewmodel.PcsThirdPartyLinkVm;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsThirdPartyLinkFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC1822080xW2 {
    public static final C1821560xVC LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISHELIOSoiZzw2OjMlKiojJDA/Zzs7ITcoOS4hPDwgICE4ZjMlLDh9GCY/HSc6OiEcKD0nMQklJyQVOiQrJCo9PA==";
    public PcsThirdPartyLinkData LL;
    public final AssemVMLazy LLILLJJLI;
    public IPcsLoadingAbility LLILLL;
    public boolean LLILZ;
    public C1821460xV2 LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsThirdPartyLinkFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/thirdpartylink/viewmodel/PcsThirdPartyLinkVm;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new C1821560xVC();
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public PcsThirdPartyLinkFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsThirdPartyLinkVm.class);
        C1217700hnE c1217700hnE = new C1217700hnE(c19719912DlLIZ);
        C1821580xVE c1821580xVE = new C1821580xVE();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217700hnE, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1218500hoW(this), c1821580xVE, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217700hnE, new C1218570hod(this), c1821580xVE, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217700hnE, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1218510hoX(this), c1821580xVE, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final PcsThirdPartyLinkVm NR() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (PcsThirdPartyLinkVm) assemVMLazy.getValue();
    }

    public final boolean OR() {
        C1821830xVd c1821830xVd = NR().LLILZIL;
        boolean zBooleanValue = c1821830xVd != null ? ((Boolean) c1821830xVd.invoke()).booleanValue() : false;
        C1821500xV6.LIZIZ("click", "return", !zBooleanValue, NR().wQ2());
        return zBooleanValue;
    }

    @Override // X.InterfaceC1822080xW2
    public final boolean ad() {
        return OR();
    }

    @Override // X.InterfaceC1822080xW2
    public final boolean mJ() {
        PcsThirdPartyLinkVm pcsThirdPartyLinkVmNR = NR();
        C1821550xVB c1821550xVB = pcsThirdPartyLinkVmNR.LLILZ;
        if (c1821550xVB != null) {
            if (!c1821550xVB.LJFF) {
                c1821550xVB.LJ++;
            }
            c1821550xVB.LJII = true;
            InterfaceC517590KRp interfaceC517590KRp = c1821550xVB.LIZLLL;
            if (interfaceC517590KRp != null) {
                interfaceC517590KRp.LJFF(new C517550KRl(c1821550xVB.LIZ));
            }
            c1821550xVB.LJI = true;
        }
        C1821860xVg c1821860xVg = pcsThirdPartyLinkVmNR.LLIZ;
        if (c1821860xVg != null) {
            c1821860xVg.invoke();
        }
        C1821500xV6.LIZIZ("click", "refresh", false, NR().wQ2());
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1821550xVB c1821550xVB = NR().LLILZ;
        if (c1821550xVB != null) {
            String str = NR().wQ2().LJ;
            InterfaceC517590KRp interfaceC517590KRp = c1821550xVB.LIZLLL;
            if (interfaceC517590KRp != null) {
                int i = c1821550xVB.LIZ;
                Map<String, String> mapLIZ = c1821550xVB.LIZ(str);
                mapLIZ.put("is_loading", String.valueOf(c1821550xVB.LJI));
                interfaceC517590KRp.LJIIJJI(new C517520KRi(i, mapLIZ));
            }
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC1822080xW2
    public final void yI() {
        C1821500xV6.LIZIZ("click", "caution", false, NR().wQ2());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        PcsThirdPartyLinkData pcsThirdPartyLinkData;
        super.onCreate(bundle);
        if (this.LL == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                pcsThirdPartyLinkData = (PcsThirdPartyLinkData) arguments.getParcelable("third_party_link_page_params");
            } else {
                pcsThirdPartyLinkData = null;
            }
            this.LL = pcsThirdPartyLinkData;
        }
        if (!this.LLILZ) {
            Bundle arguments2 = getArguments();
            boolean z = false;
            if (arguments2 != null) {
                z = arguments2.getBoolean("show_header", false);
            }
            this.LLILZ = z;
        }
        PcsThirdPartyLinkData pcsThirdPartyLinkData2 = this.LL;
        C1821570xVD c1821570xVD = new C1821570xVD(pcsThirdPartyLinkData2);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1821570xVD, C1821570xVD.class, "source_default_key");
        NR().LL = C1558360qeg.LJFF(this, null);
        PcsThirdPartyLinkVm pcsThirdPartyLinkVmNR = NR();
        int iHashCode = hashCode();
        if (pcsThirdPartyLinkData2 == null || (str = pcsThirdPartyLinkData2.showEntrance) == null) {
            str = "";
        }
        C1821550xVB c1821550xVB = new C1821550xVB(iHashCode, str, c1821570xVD);
        InterfaceC517590KRp interfaceC517590KRp = c1821550xVB.LIZLLL;
        if (interfaceC517590KRp != null) {
            interfaceC517590KRp.LJIIIIZZ("PCSThirdParty", new C517510KRh(c1821550xVB.LIZ, c1821550xVB.LIZIZ, 1017));
        }
        c1821550xVB.LJII = true;
        c1821550xVB.LJI = true;
        pcsThirdPartyLinkVmNR.LLILZ = c1821550xVB;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("data: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showHeader: ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("PcsThirdPartyLinkFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PcsGenericLoadingVM pcsGenericLoadingVMDj1 = null;
        C723850SaN.LIZ(this, false, null, new C1217670hnB(this), 3);
        IPcsLoadingAbility iPcsLoadingAbility = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPcsLoadingAbility.class, null);
        if (iPcsLoadingAbility != null) {
            pcsGenericLoadingVMDj1 = iPcsLoadingAbility.dj1(C489600JHy.LIZ, false);
        }
        this.LLILLL = pcsGenericLoadingVMDj1;
        C736680Sv4.LJIIIIZZ(this, NR(), new C2217381BqS() { // from class: X.0xVX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1821680xVO) obj).LLILLJJLI;
            }
        }, null, new C1821620xVI(this), 6);
        C736680Sv4.LJIIIZ(this, NR(), new C2217381BqS() { // from class: X.0xVV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1821680xVO) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0xVW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1821680xVO) obj).LLILZ);
            }
        }, null, new C1821490xV5(this), 12);
        NR().vQ2();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gkz, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
