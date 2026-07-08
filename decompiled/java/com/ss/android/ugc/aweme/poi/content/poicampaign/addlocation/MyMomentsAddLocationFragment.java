package com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C1180060goW;
import X.C1180880gpq;
import X.C1198130hHf;
import X.C1198200hHm;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1584506Ih;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C18JG;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1198390hI5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.content.poicampaign.FullPageStatusAssem;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class MyMomentsAddLocationFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC1740760vOs {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEwJys4LCEnZjUjICwyJTUtHELIOSICg9ZiQoLSM8KyQ4ICA9Zgg1BCA+LSs4Og43LAkjKi4nISoiDz0yLygpJzs=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(290), "enter_from", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(291), "from_user_id", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(289), "challenge_id", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(293), "user_type", Integer.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(292), "hide_shoot", Integer.class);
    public ConstraintLayout LLJILJIL;
    public FrameLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxTextView LLJJ;
    public final AssemVMLazy LLJJI;
    public final MyMomentsAddLocationFragment$ability$1 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MyMomentsAddLocationFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/content/poicampaign/addlocation/AddLocationVideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "a4257.b52713";
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

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.MyMomentsAddLocationFragment$ability$1] */
    public MyMomentsAddLocationFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddLocationVideoViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 960);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(310);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 961), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 962), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 963), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
        this.LLJJIII = new IMyMomentsAbility() { // from class: com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.MyMomentsAddLocationFragment$ability$1
            @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.IMyMomentsAbility
            public final void lu1() {
                AssemVMLazy assemVMLazy2 = this.LL.LLJJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MyMomentsAddLocationFragment.LLJJIJI;
                AddLocationVideoViewModel addLocationVideoViewModel = (AddLocationVideoViewModel) assemVMLazy2.getValue();
                addLocationVideoViewModel.setState(new C1198130hHf((String) this.LL.LLIZLLLIL.getValue(), this.LL.SR(), this.LL.getEnterFrom()));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(addLocationVideoViewModel), null, null, new C1198200hHm(addLocationVideoViewModel, null), 3);
            }
        };
    }

    public final int SR() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void UR(EnumC1198390hI5 enumC1198390hI5) {
        String str;
        VR(this.LLJILJILJ, Collections.singletonList(C13LE.LIZ(FullPageStatusAssem.class)));
        C1584506Ih.LIZIZ(this.LLJILJILJ);
        EnumC1198390hI5 enumC1198390hI52 = EnumC1198390hI5.LOADING;
        if (enumC1198390hI5 != enumC1198390hI52) {
            C1180880gpq c1180880gpq = C1180880gpq.LIZ;
            String enterFrom = getEnterFrom();
            if (Intrinsics.LJFF(getEnterFrom(), "my_year_campaign_post_page")) {
                str = "no_data_share";
            } else {
                str = "add_location";
            }
            Integer numValueOf = Integer.valueOf(SR());
            c1180880gpq.getClass();
            C1180880gpq.LIZJ(this, numValueOf, enterFrom, str);
        }
        if (enumC1198390hI5 == enumC1198390hI52) {
            TuxIconView tuxIconView = this.LLJILLL;
            if (tuxIconView != null && tuxIconView.getVisibility() != 8) {
                C786410Ut5.LJLLLLLL(8, tuxIconView);
            }
        } else if (enumC1198390hI5 == EnumC1198390hI5.NO_CONTENT) {
            C1584506Ih.LIZIZ(this.LLJJ);
        }
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(enumC1198390hI5, this, 80), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(309));
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this.LLJJIII, IMyMomentsAbility.class, null, this);
        C18JG.LJII(this, getBtmPageCode(), null);
    }

    public final void VR(ViewGroup viewGroup, List<? extends C13IQ<? extends AbstractC738140SxQ>> list) {
        if (viewGroup != null) {
            if (viewGroup.getVisibility() != 8) {
                C786410Ut5.LJLLLLLL(8, viewGroup);
            }
            C786410Ut5.LJJJJI(viewGroup);
        }
        Iterator<? extends C13IQ<? extends AbstractC738140SxQ>> it2 = list.iterator();
        while (it2.hasNext()) {
            C723850SaN.LJIIIIZZ(this, it2.next());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxIconView tuxIconView;
        String string;
        super.onViewCreated(view, bundle);
        this.LLJILJIL = (ConstraintLayout) view.findViewById(R.id.eq0);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.trr);
        this.LLJILLL = (TuxIconView) view.findViewById(R.id.j2p);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.y01);
        this.LLJJ = tuxTextView;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131823066);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        TuxTextView tuxTextView2 = this.LLJJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(23);
        }
        Context context2 = getContext();
        if (context2 != null && (tuxIconView = this.LLJILLL) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(C1180060goW.LJII("#57000000"));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LJ = Integer.valueOf(C1180060goW.LJII("#33FFFFFF"));
            tuxIconView.setBackground(c384050F3z.LIZ(context2));
        }
        TuxIconView tuxIconView2 = this.LLJILLL;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 53), tuxIconView2);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hHg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1198080hHa) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 227), 6);
        AddLocationVideoViewModel addLocationVideoViewModel = (AddLocationVideoViewModel) this.LLJJI.getValue();
        addLocationVideoViewModel.setState(new C1198130hHf((String) this.LLIZLLLIL.getValue(), SR(), getEnterFrom()));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(addLocationVideoViewModel), null, null, new C1198200hHm(addLocationVideoViewModel, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dxl, viewGroup, false);
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
