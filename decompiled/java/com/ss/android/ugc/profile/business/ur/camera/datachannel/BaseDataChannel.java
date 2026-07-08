package com.ss.android.ugc.profile.business.ur.camera.datachannel;

import X.C01GW;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC21514819Hu;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class BaseDataChannel extends ViewModel {
    public final Map<Class<?>, InterfaceC21514819Hu<?>> LL = new ConcurrentHashMap();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(299));

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ConcurrentHashMap) this.LL).clear();
    }

    public final boolean wQ2() {
        return C786410Ut5.u3() != this.LLILLJJLI.getValue();
    }

    public final synchronized <T extends InterfaceC21514819Hu<O>, O> T vQ2(Class<T> cls) {
        T tNewInstance;
        InterfaceC21514819Hu interfaceC21514819Hu = (InterfaceC21514819Hu) ((ConcurrentHashMap) this.LL).get(cls);
        if (interfaceC21514819Hu == null || (tNewInstance = cls.cast(interfaceC21514819Hu)) == null) {
            try {
                tNewInstance = cls.newInstance();
                ((ConcurrentHashMap) this.LL).put(cls, tNewInstance);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("class ");
                sbLIZ.append(cls);
                sbLIZ.append(" init fail");
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
            } catch (InstantiationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("class ");
                sbLIZ2.append(cls);
                sbLIZ2.append(" init fail");
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
            }
        }
        return tNewInstance;
    }
}
