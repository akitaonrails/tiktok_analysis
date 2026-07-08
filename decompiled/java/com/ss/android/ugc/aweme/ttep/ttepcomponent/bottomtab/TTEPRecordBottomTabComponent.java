package com.ss.android.ugc.aweme.ttep.ttepcomponent.bottomtab;

import X.C1653070t7R;
import X.C19A3;
import X.C1DRG;
import X.C366700EZg;
import X.InterfaceC1649530t1j;
import X.InterfaceC1653190t7d;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class TTEPRecordBottomTabComponent extends C1653070t7R {
    @Override // X.C1653070t7R, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        showBottomTab(false);
    }

    @Override // X.C1653070t7R, X.InterfaceC1648020szI
    public void showBottomTab(boolean z) {
        InterfaceC1649530t1j interfaceC1649530t1j = (InterfaceC1649530t1j) getDiContainer().LJIIL(null, InterfaceC1649530t1j.class);
        if (interfaceC1649530t1j != null) {
            interfaceC1649530t1j.U7(-C366700EZg.LIZ(28.0d));
        }
        super.showBottomTab(false);
    }

    public TTEPRecordBottomTabComponent(C19A3 c19a3, C1DRG c1drg, List<? extends InterfaceC1653190t7d> list) {
        super(c19a3, c1drg, list);
    }
}
