package com.bytedance.jedi.arch.ext.list;

import X.C11NZ;
import X.C1761680vwc;
import com.bytedance.jedi.arch.ext.list.IListState;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class CommonListViewModel<T, S extends IListState<T, C1761680vwc>> extends ListViewModel<T, C1761680vwc, S> {
    public Function1<S, C11NZ<Pair<List<T>, C1761680vwc>>> oR2() {
        return null;
    }

    public abstract Function1<S, C11NZ<Pair<List<T>, C1761680vwc>>> pR2();

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final AwS608S0100000_29 jR2() {
        return new AwS608S0100000_29(this, (CommonListViewModel<Object, IListState<Object, C1761680vwc>>) 649);
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final Function1<S, C11NZ<Pair<List<T>, C1761680vwc>>> iR2() {
        Function1<S, C11NZ<Pair<List<T>, C1761680vwc>>> function1OR2 = oR2();
        if (function1OR2 != null) {
            return new AwS608S0100000_29(function1OR2, 43);
        }
        return null;
    }
}
