package com.ss.android.ugc.aweme.log;

import X.AbstractC1023470cjx;
import X.C098200Yq;
import X.C1023630ckD;
import X.C1029380ctU;
import X.C189200o6;
import X.C1954807lC;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandingPageResizeLogger extends AbstractC1023470cjx implements IAdLandingPageResizeLogger {
    public final ArrayList<C1023630ckD<?>> LIZ;
    public final C1023630ckD<?>[] LIZIZ;

    public AdLandingPageResizeLogger() {
        this(new Object[]{null});
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public AdLandingPageResizeLogger(Object[] objArr) {
        Object c098200Yq;
        boolean z;
        Bundle bundle;
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new ArrayList<>();
        try {
            Object obj = objArr[0];
            if ((obj instanceof Bundle) && (bundle = (Bundle) obj) != null && bundle.containsKey("click_count")) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        boolean zBooleanValue = ((Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? Boolean.FALSE : c098200Yq)).booleanValue();
        ArrayList<C1023630ckD<?>> arrayList = this.LIZ;
        C1029380ctU.LIZ.getClass();
        arrayList.add(new C1023630ckD<>(C1029380ctU.LIZIZ, AFwS252S0000000_16.get$arr$(150)));
        this.LIZ.add(new C1023630ckD<>(C1029380ctU.LIZLLL, AFwS252S0000000_16.get$arr$(151)));
        this.LIZ.add(new C1023630ckD<>(C1029380ctU.LJ, AFwS252S0000000_16.get$arr$(152)));
        this.LIZ.add(new C1023630ckD<>(C1029380ctU.LJFF, AFwS252S0000000_16.get$arr$(153)));
        if (zBooleanValue) {
            this.LIZ.add(new C1023630ckD<>(C1029380ctU.LIZJ, AFwS252S0000000_16.get$arr$(154)));
        } else if (zBooleanValue) {
            throw new C1954807lC();
        }
        this.LIZIZ = (C1023630ckD[]) this.LIZ.toArray(new C1023630ckD[0]);
    }
}
