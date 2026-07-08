package com.bytedance.jedi.arch.ext.list;

import X.C01GW;
import X.C11DM;
import X.C11DN;
import X.C11E9;
import X.C11EA;
import X.C11NZ;
import X.C1750050vdr;
import X.C1761680vwc;
import X.C1761690vwd;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC19464611Dg;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class ListViewModel<T, P extends C1761680vwc, S extends IListState<T, P>> extends JediViewModel<S> implements InterfaceC19464611Dg {
    public final AFwS285S0000000_2 LLILZIL = AFwS285S0000000_2.get$arr$(51);
    public final AFwS285S0000000_2 LLILZLL = AFwS285S0000000_2.get$arr$(50);
    public final C01GW<C11DM> LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29((ListViewModel) this, 42));

    public Function1<S, C11NZ<Pair<List<T>, P>>> iR2() {
        return null;
    }

    public abstract AwS608S0100000_29 jR2();

    public final void nR2() {
        Function1<S, C11NZ<Pair<List<T>, P>>> function1IR2 = iR2();
        if (function1IR2 != null) {
            withState(new AwS238S0300000_29((ListViewModel) this, (ListViewModel<Object, C1761680vwc, IListState<Object, Object>>) function1IR2, (Function1<IListState<Object, Object>, ? extends C11NZ<Pair<List<Object>, C1761680vwc>>>) kR2(), (Function2<? super List<Object>, ? super List<Object>, ? extends List<Object>>) 26));
        }
    }

    public final void refresh() {
        withState(new AwS238S0300000_29((ListViewModel) this, (ListViewModel<Object, C1761680vwc, IListState<Object, Object>>) jR2(), (Function1<IListState<Object, Object>, ? extends C11NZ<Pair<List<Object>, C1761680vwc>>>) lR2(), (Function2<? super List<Object>, ? super List<Object>, ? extends List<Object>>) 27));
    }

    public Function2<List<? extends T>, List<? extends T>, List<T>> kR2() {
        return this.LLILZLL;
    }

    public Function2<List<? extends T>, List<? extends T>, List<T>> lR2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19464611Dg
    public final void W30(int i) {
        this.LLIZ.getValue().W30(i);
    }

    public final C1761690vwd hR2(ListState<T, P> listState, List<? extends T> list) {
        boolean zIsEmpty = list.isEmpty();
        if (zIsEmpty == listState.isEmpty().LIZ) {
            return listState.isEmpty();
        }
        return new C1761690vwd(zIsEmpty);
    }

    public static void mR2(CommonListViewModel commonListViewModel, C11E9 c11e9, C1750050vdr c1750050vdr, C11DN c11dn, C11DN c11dn2, int i) {
        if ((i & 2) != 0) {
            c1750050vdr = null;
        }
        if ((i & 4) != 0) {
            c11dn = null;
        }
        if ((i & 8) != 0) {
            c11dn2 = null;
        }
        commonListViewModel.getClass();
        if (c11dn != null) {
            C11EA.LIZIZ(c11e9, commonListViewModel, new C2217381BqS() { // from class: X.11Cn
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) ((NestedState) obj).getSubstate()).getRefresh();
                }
            }, new AwS643S0100000_29(c11dn, 101), new AwS608S0100000_29(c11dn, 650), new AwS643S0100000_29(c11dn, 102), 2);
        }
        if (c11dn2 != null) {
            C11EA.LIZIZ(c11e9, commonListViewModel, new C2217381BqS() { // from class: X.11Cm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) ((NestedState) obj).getSubstate()).getLoadMore();
                }
            }, new AwS643S0100000_29(c11dn2, 103), new AwS608S0100000_29(c11dn2, 651), new AwS643S0100000_29(c11dn2, 104), 2);
        }
        if (c1750050vdr != null) {
            C11EA.LJII(c11e9, commonListViewModel, new C2217381BqS() { // from class: X.11Cr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) ((NestedState) obj).getSubstate()).getList();
                }
            }, new AwS464S0200000_29(c1750050vdr, (Function1) null, 16));
        }
    }
}
