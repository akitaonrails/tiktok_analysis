package com.ss.android.ugc.aweme.tablet.foldable;

import X.C01GW;
import X.C452501pT;
import X.EnumC1779870wPx;
import X.InterfaceC1779880wPy;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import com.ss.android.ugc.aweme.tablet.api.IFoldableService;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class FoldableServiceImpl implements IFoldableService {
    public static final CopyOnWriteArrayList<WeakReference<InterfaceC1779880wPy>> LIZ = new CopyOnWriteArrayList<>();
    public static final C01GW<IDeviceCapability> LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(164));
    public static volatile EnumC1779870wPx LIZJ;

    public FoldableServiceImpl() {
        IDeviceCapability value;
        C01GW<IDeviceCapability> c01gw = LIZIZ;
        IDeviceCapability value2 = c01gw.getValue();
        EnumC1779870wPx enumC1779870wPx = null;
        if (value2 != null && value2.k(null) && (value = c01gw.getValue()) != null) {
            int iH = value.h();
            enumC1779870wPx = iH != 0 ? iH != 1 ? EnumC1779870wPx.UNKNOWN : EnumC1779870wPx.UNFOLDED : EnumC1779870wPx.FOLDED;
        }
        LIZJ = enumC1779870wPx;
    }
}
