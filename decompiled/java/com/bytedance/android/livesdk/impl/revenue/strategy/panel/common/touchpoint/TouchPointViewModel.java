package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.touchpoint;

import X.C1123320fL0;
import X.C1143280frC;
import X.InterfaceC0148002o;
import X.InterfaceC1121530fI7;
import X.InterfaceC1151250g43;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class TouchPointViewModel extends AssemViewModel<C1143280frC> implements TouchPointAbility {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1143280frC(null);
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility
    public final InterfaceC1151250g43 O5() {
        C1123320fL0<InterfaceC1151250g43, InterfaceC1121530fI7> c1123320fL0 = getState().LL;
        if (c1123320fL0 != null) {
            return (InterfaceC1151250g43) c1123320fL0.LIZLLL;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility
    public final Map<String, String> getLogExtra() {
        C1123320fL0<InterfaceC1151250g43, InterfaceC1121530fI7> c1123320fL0 = getState().LL;
        if (c1123320fL0 != null) {
            return c1123320fL0.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility
    public final <T extends InterfaceC1151250g43> T nH0() {
        T t = (T) O5();
        if (t instanceof InterfaceC1151250g43) {
            return t;
        }
        return null;
    }
}
