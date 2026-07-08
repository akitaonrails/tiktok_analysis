package com.ss.android.ugc.aweme.ad.feed.ibe;

import X.C0CCZ;
import X.C0CG6;
import X.C0VZ0;
import X.C1063130dlv;
import X.C1491980ovc;
import X.C1492020ovg;
import X.C1492050ovj;
import X.C1492060ovk;
import X.C1492090ovn;
import X.C1492110ovp;
import X.C1954807lC;
import X.C1AF0;
import X.EnumC1492080ovm;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public final class IBEPreloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "IBEPreloadTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        Object objLIZJ = C1492110ovp.LIZJ("IBEPreloadBootfinish", new C1492050ovj(), new C1492060ovk(), ((Boolean) C0CG6.LJIIIIZZ.getValue()).booleanValue());
        if (objLIZJ != null) {
            return (EnumC799870VZh) objLIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (context == null) {
            C1AF0.LIZIZ();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1063130dlv(this));
        boolean zBooleanValue = ((Boolean) C0CG6.LJIIIZ.getValue()).booleanValue();
        EnumC1492080ovm enumC1492080ovm = EnumC1492080ovm.SPARSE_BG;
        C1491980ovc c1491980ovc = C1491980ovc.LIZ;
        c1491980ovc.getClass();
        c1491980ovc.LIZLLL(null, null, null);
        if (zBooleanValue) {
            if (C1492090ovn.LIZIZ[enumC1492080ovm.ordinal()] == 1) {
                C1492020ovg c1492020ovg = C1492020ovg.LIZ;
                C1492020ovg.LIZIZ(2000, "IBEPreloadSparse", arrayList);
                return;
            }
            throw new C1954807lC();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
    }
}
