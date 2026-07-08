package com.bytedance.ies.ugc.aweme.commercialize.splash.report;

import X.AbstractC1023470cjx;
import X.C04TD;
import X.C1018070cbF;
import X.C1023630ckD;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class TopViewAdEventLogger extends AbstractC1023470cjx implements ITopViewAdEventLogger {
    public final C1023630ckD<?>[] LIZ;

    public TopViewAdEventLogger() {
        this(new Object[]{null});
    }

    public static ITopViewAdEventLogger LJJIIZ() {
        Object objLIZ = C04TD.LIZ(ITopViewAdEventLogger.class, false);
        return objLIZ != null ? (ITopViewAdEventLogger) objLIZ : new TopViewAdEventLogger();
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public TopViewAdEventLogger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1018070cbF.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1018070cbF.LJIILJJIL, AFwS252S0000000_16.get$arr$(65)), new C1023630ckD<>(C1018070cbF.LJIILIIL, AFwS252S0000000_16.get$arr$(66)), new C1023630ckD<>(C1018070cbF.LJJ, AFwS252S0000000_16.get$arr$(67)), new C1023630ckD<>(C1018070cbF.LIZJ, AFwS252S0000000_16.get$arr$(68)), new C1023630ckD<>(C1018070cbF.LIZLLL, AFwS252S0000000_16.get$arr$(69)), new C1023630ckD<>(C1018070cbF.LJFF, AFwS252S0000000_16.get$arr$(70)), new C1023630ckD<>(C1018070cbF.LJIIJ, AFwS252S0000000_16.get$arr$(71)), new C1023630ckD<>(C1018070cbF.LJJIIJZLJL, AFwS252S0000000_16.get$arr$(72)), new C1023630ckD<>(C1018070cbF.LJJIIZ, AFwS252S0000000_16.get$arr$(73)), new C1023630ckD<>(C1018070cbF.LJJIIZI, AFwS252S0000000_16.get$arr$(64))};
    }
}
