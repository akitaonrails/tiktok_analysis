package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event;

import X.AbstractC1023470cjx;
import X.C1002930cCp;
import X.C1023630ckD;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdLiteEventLogger extends AbstractC1023470cjx implements ISearchAdLiteEventLogger {
    public final C1023630ckD<?>[] LIZ;

    public SearchAdLiteEventLogger() {
        this(new Object[]{null});
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public SearchAdLiteEventLogger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1002930cCp.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1002930cCp.LIZIZ, AFwS252S0000000_16.get$arr$(58)), new C1023630ckD<>(C1002930cCp.LIZJ, AFwS252S0000000_16.get$arr$(59)), new C1023630ckD<>(C1002930cCp.LIZLLL, AFwS252S0000000_16.get$arr$(60)), new C1023630ckD<>(C1002930cCp.LJ, AFwS252S0000000_16.get$arr$(61)), new C1023630ckD<>(C1002930cCp.LJIIIIZZ, AFwS252S0000000_16.get$arr$(62)), new C1023630ckD<>(C1002930cCp.LJII, AFwS252S0000000_16.get$arr$(63))};
    }
}
