package com.ss.android.ugc.aweme.main;

import X.C823050WQl;
import X.InterfaceC494301wD;
import Y.ARunnableS109S0100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public interface IPerformanceAbility extends InterfaceC494301wD {
    void dt2(Function0<Unit> function0);

    /* JADX INFO: loaded from: classes10.dex */
    public static final class AsyncDefault implements IPerformanceAbility {
        public static final AsyncDefault LL = new AsyncDefault();

        @Override // com.ss.android.ugc.aweme.main.IPerformanceAbility
        public final void dt2(Function0<Unit> function0) {
            C823050WQl.LIZIZ().execute(new ARunnableS109S0100000_9(function0, 96));
        }
    }

    public static final class Default implements IPerformanceAbility {
        public static final Default LL = new Default();

        @Override // com.ss.android.ugc.aweme.main.IPerformanceAbility
        public final void dt2(Function0<Unit> function0) {
            function0.invoke();
        }
    }
}
