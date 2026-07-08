package com.ss.android.ugc.aweme.api.component.idlepreload.eventrack;

import X.AbstractC1023720ckM;
import X.C1001800cB0;
import X.C1023630ckD;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceIdlePreloadEventTracker extends AbstractC1023720ckM implements ICommerceIdlePreloadEventTracker {
    public final C1023630ckD<?>[] LIZ;

    public CommerceIdlePreloadEventTracker() {
        this(new Object[]{null});
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public CommerceIdlePreloadEventTracker(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1001800cB0.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1001800cB0.LIZIZ, AFwS252S0000000_16.get$arr$(83)), new C1023630ckD<>(C1001800cB0.LIZLLL, AFwS252S0000000_16.get$arr$(84)), new C1023630ckD<>(C1001800cB0.LIZJ, AFwS252S0000000_16.get$arr$(85)), new C1023630ckD<>(C1001800cB0.LJII, AFwS252S0000000_16.get$arr$(86)), new C1023630ckD<>(C1001800cB0.LJIIIIZZ, AFwS252S0000000_16.get$arr$(87)), new C1023630ckD<>(C1001800cB0.LJIIJ, AFwS252S0000000_16.get$arr$(88)), new C1023630ckD<>(C1001800cB0.LJIIIZ, AFwS252S0000000_16.get$arr$(89))};
    }
}
