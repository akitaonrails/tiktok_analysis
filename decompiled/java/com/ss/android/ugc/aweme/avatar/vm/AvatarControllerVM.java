package com.ss.android.ugc.aweme.avatar.vm;

import X.C01GW;
import X.C1608750rxx;
import X.C1608980ryK;
import X.C1608990ryL;
import X.C1609060ryS;
import X.C23250099c;
import X.C314101Jr;
import X.C452501pT;
import X.EnumC1607270rvZ;
import X.InterfaceC1608820ry4;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS20S0410000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarControllerVM extends ViewModel {
    public String LL;
    public C1608750rxx LLILLL;
    public AwS603S0100000_24 LLILZ;
    public WeakReference<LifecycleOwner> LLJ;
    public final MutableLiveData<C1608990ryL> LLJI;
    public final MutableLiveData LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(63));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(59));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(60));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(61));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(62));

    public final Map<EnumC1607270rvZ, InterfaceC1608820ry4<?, ?>> vQ2() {
        return (Map) this.LLIZLLLIL.getValue();
    }

    public AvatarControllerVM() {
        MutableLiveData<C1608990ryL> mutableLiveData = new MutableLiveData<>();
        this.LLJI = mutableLiveData;
        this.LLJIJIL = mutableLiveData;
    }

    public static void wQ2(AvatarControllerVM avatarControllerVM, String str, Object obj, boolean z, EnumC1607270rvZ enumC1607270rvZ, boolean z2, int i) {
        EnumC1607270rvZ enumC1607270rvZ2 = enumC1607270rvZ;
        boolean z3 = z;
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            enumC1607270rvZ2 = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        if (!avatarControllerVM.LLJILJIL && (str == null || !Intrinsics.LJFF(str, avatarControllerVM.LL))) {
            return;
        }
        System.currentTimeMillis();
        AwS603S0100000_24 awS603S0100000_24 = avatarControllerVM.LLILZ;
        if (awS603S0100000_24 != null) {
            awS603S0100000_24.invoke(Boolean.TRUE);
        }
        C1608980ryK c1608980ryK = (C1608980ryK) avatarControllerVM.LLILLJJLI.getValue();
        C1609060ryS c1609060ryS = new C1609060ryS(avatarControllerVM, str, z2);
        c1608980ryK.getClass();
        AwS20S0410000_24 awS20S0410000_24 = new AwS20S0410000_24(c1608980ryK, z3, obj, enumC1607270rvZ2, c1609060ryS, 1);
        if (z2) {
            awS20S0410000_24.invoke();
        } else {
            C23250099c.LIZLLL(c1608980ryK.LJI, null, null, new C314101Jr(awS20S0410000_24, null), 3);
        }
    }
}
