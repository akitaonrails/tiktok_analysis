package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.C004I;
import X.C098200Yq;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1744200vUQ;
import X.C1748730vbj;
import X.C1765020w20;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2217381BqS;
import X.C786410Ut5;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1737690vJv;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionPickerWrapper extends ECAnimDowngradeFragment implements InterfaceC1171660gay, InterfaceC1075600e62<AnonymousClass0412>, InterfaceC1737690vJv {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZzg6LCIpHELIOSPWEhLSIlJiEjISYnLD19LjctLiI2JjFiGyo0ISoiGSYwIyA+Hj0yODUpOw==";
    public final AnonymousClass0412 LL = new AnonymousClass0412();
    public final lifecycleAwareLazy LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function2<? super List<Region>, ? super AddressBase, Unit> LLILZIL;
    public Function1<? super List<Region>, Unit> LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public List<District> LLJ;
    public String LLJI;

    public RegionPickerWrapper() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DistrictPickerWrapperViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 608);
        this.LLILLJJLI = new lifecycleAwareLazy(this, awS570S0100000_26, new AwS154S0400000_26(this, awS570S0100000_26, c19719912DlLIZ, AFwS313S0000000_26.get$arr$(10), 10));
        this.LLILLL = AFwS215S0000000_26.get$arr$(152);
        this.LLILZ = AFwS215S0000000_26.get$arr$(153);
        this.LLILZIL = AFwS313S0000000_26.get$arr$(9);
        this.LLILZLL = AFwS268S0000000_26.get$arr$(259);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final boolean MR() {
        return true;
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

    public final DistrictPickerWrapperViewModel PR() {
        return (DistrictPickerWrapperViewModel) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        if (getChildFragmentManager().LJLJJI()) {
            return true;
        }
        if (getChildFragmentManager().LJJLIIIJL().size() > 1) {
            getChildFragmentManager().LJLLILLLL();
            return true;
        }
        DistrictPickerWrapperViewModel districtPickerWrapperViewModelPR = PR();
        districtPickerWrapperViewModelPR.getClass();
        districtPickerWrapperViewModelPR.setState(AFwS268S0000000_26.get$arr$(717));
        return false;
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string = arguments.getString("page_info");
        } else {
            string = null;
        }
        this.LLIZ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("defaultRegion");
        }
        this.LLIZLLLIL = string2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LaneParams laneParamsLIZIZ;
        super.onViewCreated(view, bundle);
        DistrictPickerWrapperViewModel districtPickerWrapperViewModelPR = PR();
        String str = this.LLIZ;
        String str2 = this.LLIZLLLIL;
        if (str2 == null) {
            str2 = "unKnown";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
        if (interfaceC1748810vbrLIZ != null && (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrLIZ, "lib_track_builtin_lane_business")) != null) {
            Object obj = laneParamsLIZIZ.get((Object) "biz_type");
            if (obj != null) {
                linkedHashMap.put("biz_type", obj);
            }
            Object obj2 = laneParamsLIZIZ.get((Object) "product_id");
            if (obj2 != null) {
                linkedHashMap.put("product_id", obj2);
            }
        }
        districtPickerWrapperViewModelPR.LLILZIL = new C1744200vUQ(str, str2, null, null, null, false, linkedHashMap, null);
        C11EA.LJII(this, PR(), new C2217381BqS() { // from class: X.0vVW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return Boolean.valueOf(((DistrictPickerWrapperState) obj3).getDone());
            }
        }, new AwS640S0100000_26(this, 134));
        C11EA.LJII(this, PR(), new C2217381BqS() { // from class: X.0vVY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return Boolean.valueOf(((DistrictPickerWrapperState) obj3).getClose());
            }
        }, new AwS640S0100000_26(this, 135));
        C11EA.LJII(this, PR(), new C2217381BqS() { // from class: X.0vVZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return Boolean.valueOf(((DistrictPickerWrapperState) obj3).getTitleBarBack());
            }
        }, new AwS640S0100000_26(this, 136));
        C11EA.LJII(this, PR(), new C2217381BqS() { // from class: X.0vVd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((DistrictPickerWrapperState) obj3).getSelectedRegions();
            }
        }, new AwS640S0100000_26(this, 137));
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        Bundle arguments = getArguments();
        List<District> list = this.LLJ;
        String str3 = this.LLJI;
        RegionPicker regionPicker = new RegionPicker();
        regionPicker.setArguments(arguments);
        if (arguments != null) {
            arguments.putInt("parent_id", R.id.iip);
        }
        regionPicker.LLJIJIL = list;
        regionPicker.LLJILJIL = str3;
        c19ehLJIIJ.LIZIZ(R.id.iip, regionPicker);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
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
