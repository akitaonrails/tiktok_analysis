package com.ss.android.ugc.aweme.commercialize_x.service;

import X.AbstractC1066520drO;
import X.C04PK;
import X.C1017250cZv;
import X.C1017750caj;
import X.C1025250cmp;
import X.C1051490dT9;
import X.C1066490drL;
import X.C1AF0;
import X.InterfaceC1025290cmt;
import X.InterfaceC1029520cti;
import X.InterfaceC1029540ctk;
import X.InterfaceC1294060jmO;
import X.InterfaceC988160bp0;
import X.InterfaceC988500bpY;
import android.content.Context;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;

/* JADX INFO: loaded from: classes17.dex */
public final class CommercializeAdServiceImpl implements ICommercializeAdService {
    public final C1051490dT9 LIZ = new C1051490dT9(new C04PK());
    public boolean LIZIZ;

    public final InterfaceC1029520cti LIZ(InterfaceC1029540ctk interfaceC1029540ctk) {
        Class<? extends InterfaceC1029520cti> cls;
        if (!this.LIZIZ) {
            synchronized (this) {
                try {
                    if (!this.LIZIZ) {
                        C1017750caj.LIZ();
                        this.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        int type = interfaceC1029540ctk.getType();
        try {
            SparseArray<InterfaceC1029520cti> sparseArray = C1017750caj.LIZIZ;
            InterfaceC1029520cti interfaceC1029520ctiNewInstance = sparseArray.get(type);
            if (interfaceC1029520ctiNewInstance == null && (cls = C1017750caj.LIZ.get(type)) != null) {
                interfaceC1029520ctiNewInstance = cls.newInstance();
                sparseArray.put(type, interfaceC1029520ctiNewInstance);
            }
            return interfaceC1029520ctiNewInstance;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    @InterfaceC1294060jmO
    public final void N(boolean z) {
        this.LIZ.LIZIZ(C1025250cmp.LIZ);
        if (z && !this.LIZIZ) {
            synchronized (this) {
                try {
                    if (!this.LIZIZ) {
                        C1017750caj.LIZ();
                        this.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final boolean O(C1017250cZv c1017250cZv) {
        InterfaceC1029520cti interfaceC1029520ctiLIZ = LIZ(c1017250cZv);
        if (interfaceC1029520ctiLIZ != null && interfaceC1029520ctiLIZ.O(c1017250cZv)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final InterfaceC988500bpY Q(int i) {
        SparseArray<InterfaceC988500bpY> sparseArrayLIZ;
        InterfaceC1025290cmt interfaceC1025290cmt = (InterfaceC1025290cmt) this.LIZ.LIZ();
        if (interfaceC1025290cmt != null && (sparseArrayLIZ = interfaceC1025290cmt.LIZ()) != null) {
            return sparseArrayLIZ.get(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final InterfaceC988160bp0 P(Context context, InterfaceC1029540ctk interfaceC1029540ctk) {
        InterfaceC1029520cti interfaceC1029520ctiLIZ = LIZ(interfaceC1029540ctk);
        if (interfaceC1029520ctiLIZ != null) {
            return interfaceC1029520ctiLIZ.LIZ(interfaceC1029540ctk);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService
    public final AbstractC1066520drO R(Context context, C1066490drL c1066490drL) {
        InterfaceC1029520cti interfaceC1029520ctiLIZ = LIZ(c1066490drL);
        if (interfaceC1029520ctiLIZ != null) {
            return interfaceC1029520ctiLIZ.LIZIZ(context, c1066490drL);
        }
        return null;
    }
}
