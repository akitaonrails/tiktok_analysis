package com.ss.android.ugc.aweme.log;

import X.AbstractC1023470cjx;
import X.C1023630ckD;
import X.C1043500dGG;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLynxEventLoger extends AbstractC1023470cjx implements IAdLynxEventLogger {
    public final C1023630ckD<?>[] LIZ;

    public AdLynxEventLoger() {
        this(new Object[]{null});
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public AdLynxEventLoger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1043500dGG.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1043500dGG.LJIILIIL, AFwS252S0000000_16.get$arr$(155)), new C1023630ckD<>(C1043500dGG.LJJJJZ, AFwS252S0000000_16.get$arr$(156))};
    }
}
