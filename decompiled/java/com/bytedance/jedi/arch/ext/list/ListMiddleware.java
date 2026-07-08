package com.bytedance.jedi.arch.ext.list;

import X.C004I;
import X.C01GW;
import X.C11DN;
import X.C11DO;
import X.C11E1;
import X.C11E5;
import X.C11E9;
import X.C11NZ;
import X.C1761680vwc;
import X.C1761690vwd;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC1294060jmO;
import X.InterfaceC19464611Dg;
import X.InterfaceC874803bO;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS306S0300000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC1294060jmO
public final class ListMiddleware<S extends C004I, T, P extends C1761680vwc> extends C11E5<S, ListState<T, P>> implements InterfaceC19464611Dg {
    public final Function1<S, C11NZ<Pair<List<T>, P>>> LLILZIL;
    public final Function1<S, C11NZ<Pair<List<T>, P>>> LLILZLL;
    public final Function2<List<? extends T>, List<? extends T>, List<T>> LLIZ;
    public final Function2<List<? extends T>, List<? extends T>, List<T>> LLIZLLLIL;
    public final C01GW<C11E1> LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 41));

    public final void loadMore() {
        Function1<S, C11NZ<Pair<List<T>, P>>> function1 = this.LLILZLL;
        if (function1 != null) {
            LIZLLL().gR2(new AwS395S0200000_29(new AwS306S0300000_29((ListMiddleware) this, (ListMiddleware<C004I, Object, C1761680vwc>) function1, (Function1<C004I, ? extends C11NZ<Pair<List<Object>, C1761680vwc>>>) this.LLIZLLLIL, (Function2<? super List<Object>, ? super List<Object>, ? extends List<Object>>) 5), this, 84));
        }
    }

    public final void refresh() {
        LIZLLL().gR2(new AwS395S0200000_29(new AwS306S0300000_29((ListMiddleware) this, (ListMiddleware<C004I, Object, C1761680vwc>) this.LLILZIL, (Function1<C004I, ? extends C11NZ<Pair<List<Object>, C1761680vwc>>>) this.LLIZ, (Function2<? super List<Object>, ? super List<Object>, ? extends List<Object>>) 6), this, 84));
    }

    @Override // X.InterfaceC19464611Dg
    public final void W30(int i) {
        this.LLJ.getValue().W30(i);
    }

    public final C1761690vwd LJFF(ListState<T, P> listState, List<? extends T> list) {
        boolean zIsEmpty = list.isEmpty();
        if (zIsEmpty == listState.isEmpty().LIZ) {
            return listState.isEmpty();
        }
        return new C1761690vwd(zIsEmpty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListMiddleware(Function1<? super S, ? extends C11NZ<Pair<List<T>, P>>> function1, Function1<? super S, ? extends C11NZ<Pair<List<T>, P>>> function12, Function2<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> function2, Function2<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> function22) {
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = function2;
        this.LLIZLLLIL = function22;
    }

    public final <RECEIVER extends InterfaceC874803bO> void subscribe(C11E9<? extends RECEIVER> c11e9, C11DO<T> c11do, boolean z, boolean z2, C11DN<T, RECEIVER> c11dn, C11DN<T, RECEIVER> c11dn2, Function2<? super RECEIVER, ? super Boolean, Unit> function2, Function2<? super RECEIVER, ? super Boolean, Unit> function22, Function1<? super RECEIVER, Unit> function1, Function2<? super RECEIVER, ? super P, Unit> function23) {
        if (function23 != null) {
            LJ(c11e9, new C2217381BqS() { // from class: X.11E4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) obj).getPayload();
                }
            }, z2, z, new AwS643S0100000_29(function23, 8));
        }
        if (function2 != null) {
            LJ(c11e9, new C2217381BqS() { // from class: X.11Dy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) obj).getHasMore();
                }
            }, z2, z, new AwS643S0100000_29(function2, 9));
        }
        if (function22 != null) {
            LJ(c11e9, new C2217381BqS() { // from class: X.11Dz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) obj).isEmpty();
                }
            }, z2, z, new AwS643S0100000_29(function22, 10));
        }
        if (c11dn != null) {
            LIZ(c11e9, new C2217381BqS() { // from class: X.11E2
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) obj).getRefresh();
                }
            }, z2, z, new AwS643S0100000_29(c11dn, 11), new AwS608S0100000_29(c11dn, 44), new AwS643S0100000_29(c11dn, 12));
        }
        if (c11dn2 != null) {
            LIZ(c11e9, new C2217381BqS() { // from class: X.11E3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) obj).getLoadMore();
                }
            }, z2, z, new AwS643S0100000_29(c11dn2, 13), new AwS608S0100000_29(c11dn2, 45), new AwS643S0100000_29(c11dn2, 14));
        }
        if (c11do != null) {
            LJ(c11e9, new C2217381BqS() { // from class: X.0vdq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ListState) obj).getList();
                }
            }, z2, z, new AwS464S0200000_29(c11do, function1, 0));
        }
    }
}
