package com.ss.android.ugc.aweme.im.saas.host.impl.main;

import X.C0J5E;
import X.C199Y;
import X.C19EG;
import X.C20629915o1;
import X.InterfaceC1670800ta2;
import X.InterfaceC1711206n0;
import X.InterfaceC20622815ms;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle;

/* JADX INFO: loaded from: classes8.dex */
public final class IMMainSAFLifecycleImpl implements IMMainSAFLifecycle {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle
    public final LifecycleOwner LIZ(LifecycleOwner lifecycleOwner) {
        Object objLIZ;
        if ((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0)) {
            InterfaceC1670800ta2 interfaceC1670800ta2 = (C19EG) lifecycleOwner;
            if (!(interfaceC1670800ta2 instanceof C199Y) || (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) interfaceC1670800ta2)) == null || !(objLIZ instanceof C0J5E)) {
                return null;
            }
            return (Fragment) objLIZ;
        }
        return lifecycleOwner;
    }
}
