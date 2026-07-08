package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl;

import X.C01GW;
import X.C1896707bp;
import X.C452501pT;
import X.InterfaceC336080DFm;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebFragmentLifecycleService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AdWebFragmentLifecycleServiceImpl implements IAdWebFragmentLifecycleService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(962));

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebFragmentLifecycleService
    public final void LIZ(C1896707bp c1896707bp) {
        Iterator it2 = ((List) this.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC336080DFm) it2.next()).LIZ(c1896707bp);
        }
    }
}
