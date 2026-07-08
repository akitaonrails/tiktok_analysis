package com.ss.android.ugc.aweme.account.login.v2.base;

import X.C1237330iIt;
import X.C1237480iJ8;
import X.C853850XeZ;
import X.InterfaceC1237070iIT;
import X.InterfaceC1237470iJ7;
import X.InterfaceC853790XeT;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountFlowSharedViewModel extends ViewModel {
    public final MutableLiveData<InterfaceC1237470iJ7> LL;
    public final MutableLiveData LLILLJJLI;
    public Bundle LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData LLILZIL;
    public C1237480iJ8 LLILZLL;

    public final boolean yQ2() {
        return this.LLILZLL != null;
    }

    public AccountFlowSharedViewModel() {
        MutableLiveData<InterfaceC1237470iJ7> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLILZ = mutableLiveData2;
        this.LLILZIL = mutableLiveData2;
    }

    public final void xQ2() {
        if (yQ2()) {
            C1237480iJ8 c1237480iJ8 = this.LLILZLL;
            if (c1237480iJ8 == null) {
                c1237480iJ8 = null;
            }
            if (!c1237480iJ8.LIZJ.isEmpty()) {
                c1237480iJ8.LIZJ.pop();
            }
            while ((!c1237480iJ8.LIZJ.isEmpty()) && !(c1237480iJ8.LIZ() instanceof InterfaceC1237070iIT)) {
                c1237480iJ8.LIZJ.pop();
            }
        }
    }

    public final void wQ2(InterfaceC853790XeT<?> interfaceC853790XeT) {
        this.LLILZ.postValue(Boolean.TRUE);
        C1237480iJ8 c1237480iJ8 = this.LLILZLL;
        if (c1237480iJ8 == null) {
            c1237480iJ8 = null;
        }
        c1237480iJ8.LIZ().LIZIZ(interfaceC853790XeT, new C1237330iIt(this, interfaceC853790XeT));
    }

    public final void vQ2(InterfaceC853790XeT<?> interfaceC853790XeT, Bundle bundle) {
        C1237480iJ8 c1237480iJ8 = this.LLILZLL;
        InterfaceC1237470iJ7 interfaceC1237470iJ7LIZ = null;
        if (c1237480iJ8 == null) {
            c1237480iJ8 = null;
        }
        c1237480iJ8.LIZ().LJ();
        String nextStepId = c1237480iJ8.LIZ.getNextStepId(c1237480iJ8.LIZ().getId(), interfaceC853790XeT.getClass().getSimpleName());
        if (nextStepId != null && (interfaceC1237470iJ7LIZ = C853850XeZ.LIZ(nextStepId, c1237480iJ8)) != null) {
            c1237480iJ8.LIZJ.push(interfaceC1237470iJ7LIZ);
            interfaceC1237470iJ7LIZ.LIZLLL();
        }
        this.LLILLL = bundle;
        this.LL.postValue(interfaceC1237470iJ7LIZ);
    }
}
