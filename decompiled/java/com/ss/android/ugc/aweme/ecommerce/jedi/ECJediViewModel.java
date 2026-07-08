package com.ss.android.ugc.aweme.ecommerce.jedi;

import X.C004I;
import X.C2217381BqS;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECJediViewModel<S extends C004I> extends JediViewModel<S> {
    public final void iR2(Function1<? super S, Unit> function1) {
        function1.invoke(FQ2());
    }

    public final void hR2(C2217381BqS c2217381BqS, Function1 function1) {
        JediViewModel.bR2(this, c2217381BqS, null, function1, 2, null);
    }
}
