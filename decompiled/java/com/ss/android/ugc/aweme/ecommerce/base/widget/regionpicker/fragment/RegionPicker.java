package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC1252750ihl;
import X.AbstractC21673619ry;
import X.AnonymousClass0317;
import X.AnonymousClass0412;
import X.C004I;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C0HI3;
import X.C0OM1;
import X.C1058220de0;
import X.C1120604Zw;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1744200vUQ;
import X.C1744890vVX;
import X.C1744920vVa;
import X.C1749280vcc;
import X.C1765020w20;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C20136513qd;
import X.C20642515q3;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionPicker extends Fragment implements InterfaceC1171660gay, InterfaceC1075600e62<AnonymousClass0412> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZzHELIOSg6LCIpPWEhLSIlJiEjISYnLD19LjctLiI2JjFiGyo0ISoiGSYwIyA+";
    public C0HI3 LL;
    public C1749280vcc LLILLJJLI;
    public C197039127h LLILLL;
    public TuxNavBar LLILZ;
    public final AnonymousClass0412 LLILZIL = new AnonymousClass0412();
    public final C01GW LLILZLL;
    public final lifecycleAwareLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public final AwS570S0100000_26 LLJI;
    public List<District> LLJIJIL;
    public String LLJILJIL;

    public RegionPicker() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DistrictPickerWrapperViewModel.class);
        this.LLILZLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 84));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(DistrictPickerViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ2, 607);
        this.LLIZ = new lifecycleAwareLazy(this, awS570S0100000_26, new AwS154S0400000_26(this, awS570S0100000_26, c19719912DlLIZ2, AFwS313S0000000_26.get$arr$(8), 9));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 606));
        this.LLJI = new AwS570S0100000_26(this, 605);
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

    public final C197039127h NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.g30) : null;
            this.LLILLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C0HI3 OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LL = (C0HI3) viewFindViewById;
        }
        return (C0HI3) viewFindViewById;
    }

    public final DistrictPickerViewModel PR() {
        return (DistrictPickerViewModel) this.LLIZ.getValue();
    }

    public final DistrictPickerWrapperViewModel RR() {
        return (DistrictPickerWrapperViewModel) this.LLILZLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        List<Fragment> listLJJLIIIJL;
        List<Fragment> listLJJLIIIJL2;
        super.onDestroy();
        FragmentManager fragmentManager = getFragmentManager();
        int i = 0;
        int size = (fragmentManager == null || (listLJJLIIIJL2 = fragmentManager.LJJLIIIJL()) == null) ? 0 : listLJJLIIIJL2.size();
        FragmentManager fragmentManager2 = getFragmentManager();
        if (fragmentManager2 == null || (listLJJLIIIJL = fragmentManager2.LJJLIIIJL()) == null) {
            return;
        }
        for (Fragment fragment : listLJJLIIIJL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (Intrinsics.LJFF(fragment, this) && i == size - 1) {
                SR("return");
            }
            i = i2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LLD(new C1744890vVX(this.LLJI));
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1744200vUQ c1744200vUQ = RR().LLILZIL;
        if (c1744200vUQ != null) {
            c1744200vUQ.LIZLLL = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        FragmentManager fragmentManager;
        List<Fragment> listLJJLIIIJL;
        List<Fragment> listLJJLIIIJL2;
        List<Fragment> listLJJLIIIJL3;
        super.onStop();
        int i = 0;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        if (!((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() || (fragmentManager = getFragmentManager()) == null || (listLJJLIIIJL = fragmentManager.LJJLIIIJL()) == null || listLJJLIIIJL.isEmpty()) {
            return;
        }
        FragmentManager fragmentManager2 = getFragmentManager();
        int size = (fragmentManager2 == null || (listLJJLIIIJL3 = fragmentManager2.LJJLIIIJL()) == null) ? 0 : listLJJLIIIJL3.size();
        FragmentManager fragmentManager3 = getFragmentManager();
        if (fragmentManager3 == null || (listLJJLIIIJL2 = fragmentManager3.LJJLIIIJL()) == null) {
            return;
        }
        for (Fragment fragment : listLJJLIIIJL2) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (Intrinsics.LJFF(fragment, this) && i == size - 1) {
                SR("close");
            }
            i = i2;
        }
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLILZIL;
    }

    public final void SR(String str) {
        withState(PR(), new AwS140S1100000_26(this, str, 15));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            DistrictPickerViewModel districtPickerViewModelPR = PR();
            int i = arguments.getInt("parent_id");
            C20136513qd c20136513qd = districtPickerViewModelPR.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DistrictPickerViewModel.LLJILJIL;
            c20136513qd.LL = Integer.valueOf(i);
            PR().LLILZIL = arguments.getStringArray("geoname_ids");
            PR().LLILZLL = (OrderSKUDTO) arguments.getParcelable("order_sku");
            DistrictPickerViewModel districtPickerViewModelPR2 = PR();
            districtPickerViewModelPR2.LLIZ.LL = Integer.valueOf(arguments.getInt("number_of_remaining_level", Integer.MAX_VALUE));
            PR().LLJIJIL = Integer.valueOf(arguments.getInt("address_entrance_scene", 0));
            this.LLJ = arguments.getBoolean("show_back_icon");
        }
        DistrictPickerViewModel districtPickerViewModelPR3 = PR();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (arrayList = arguments2.getParcelableArrayList("current_selected_region_list")) == null) {
            arrayList = new ArrayList();
        }
        districtPickerViewModelPR3.getClass();
        districtPickerViewModelPR3.LLJ = new ArrayList<>(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new AjS70S0100000_26(this, 88), NR());
        OR().setAdapter((AbstractC21673619ry) this.LLIZLLLIL.getValue());
        OR().setLayoutManager(new LinearLayoutManager(getContext()));
        Context context = getContext();
        if (context != null) {
            OR().addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, context), 0, C12ES.LIZJ(16.0f, context), 2));
        }
        C0OM1 c0om1 = new C0OM1();
        if (!this.LLJ) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1504));
            c0om1.LJ(c1251150ifB);
        }
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LJIIIIZZ = C20642515q3.LJI(2131823173);
        c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1505));
        c0om1.LIZIZ(c1251150ifB2);
        c0om1.LIZLLL = true;
        Context context2 = getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context2)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0om1.LIZJ(iIntValue);
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.xzl);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJFF(new C1744890vVX(this.LLJI));
        }
        C11EA.LJII(this, PR(), new C2217381BqS() { // from class: X.0vVb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DistrictPickerState) obj).getSelectedDistrict();
            }
        }, new AwS640S0100000_26(this, 138));
        C11EA.LJII(this, PR(), new C2217381BqS() { // from class: X.0vVV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DistrictPickerState) obj).getDistrictList();
            }
        }, new AwS640S0100000_26(this, 131));
        C11EA.LJII(this, PR(), new C2217381BqS() { // from class: X.0vVT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DistrictPickerState) obj).getStatus());
            }
        }, new AwS640S0100000_26(this, 133));
        List<District> list = this.LLJIJIL;
        if (list != null) {
            DistrictPickerViewModel districtPickerViewModelPR = PR();
            String str = this.LLJILJIL;
            districtPickerViewModelPR.LLJI = false;
            districtPickerViewModelPR.setState(new AwS109S1200000_26(districtPickerViewModelPR, (DistrictPickerViewModel) list, (List<District>) str, (String) 35));
            return;
        }
        DistrictPickerViewModel districtPickerViewModelPR2 = PR();
        getContext();
        districtPickerViewModelPR2.iR2();
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return (Animation) withState(RR(), new C1744920vVa(this, i, z, i2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aut, viewGroup, false);
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
