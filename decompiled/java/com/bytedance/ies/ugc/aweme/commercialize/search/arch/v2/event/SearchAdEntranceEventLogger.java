package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event;

import X.AbstractC1023470cjx;
import X.C1023630ckD;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdEntranceEventLogger extends AbstractC1023470cjx implements ISearchAdEntranceEventLogger {
    public final C1023630ckD<?>[] LIZ;

    public SearchAdEntranceEventLogger() {
        this(new Object[]{null});
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public SearchAdEntranceEventLogger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }
}
