package com.ss.android.ugc.aweme.main;

import X.InterfaceC1385905bd;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class InterceptHomeBackPressServiceImpl implements InterceptHomeBackPressService {
    public final CopyOnWriteArrayList<InterfaceC1385905bd> LIZ = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService
    public final boolean LIZIZ() {
        boolean z;
        Iterator<InterfaceC1385905bd> it2 = this.LIZ.iterator();
        while (true) {
            while (it2.hasNext()) {
                z = it2.next().onBackPress() || z;
            }
            return z;
        }
    }

    @Override // com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService
    public final void LIZ(InterfaceC1385905bd interfaceC1385905bd) {
        this.LIZ.remove(interfaceC1385905bd);
    }

    @Override // com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService
    public final void LIZJ(InterfaceC1385905bd interfaceC1385905bd) {
        this.LIZ.add(interfaceC1385905bd);
    }
}
