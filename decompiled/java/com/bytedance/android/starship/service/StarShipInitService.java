package com.bytedance.android.starship.service;

import X.C0PEM;
import X.C1306510k6T;
import X.C1306520k6U;
import X.C1306770k6t;
import X.C1DFK;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.EnumC1006310cIH;
import com.bytedance.android.starship.engine.reasoning.IStarShipInit;
import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.android.starship.strategy.graph.CancelableJobImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class StarShipInitService implements IStarShipInit {
    @Override // com.bytedance.android.starship.engine.reasoning.IStarShipInit
    public final void LIZIZ() {
        ((Boolean) C1306520k6U.LJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.starship.engine.reasoning.IStarShipInit
    public final void LIZJ() {
        C1306520k6U.LIZJ();
    }

    @Override // com.bytedance.android.starship.engine.reasoning.IStarShipInit
    public final CancelableJob LIZ(Function1<? super Boolean, Unit> function1) {
        C1306510k6T.LIZ.getClass();
        if (C1306510k6T.LIZIZ.getValue() != EnumC1006310cIH.UNINITIALIZED) {
            function1.invoke(Boolean.TRUE);
            C1DFK c1dfkLIZ = C23118094a.LIZ();
            c1dfkLIZ.LJFF();
            return new CancelableJobImpl(c1dfkLIZ);
        }
        return new CancelableJobImpl(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1306770k6t(function1, null), 3));
    }
}
