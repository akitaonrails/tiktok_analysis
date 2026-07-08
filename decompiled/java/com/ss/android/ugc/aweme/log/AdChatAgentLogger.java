package com.ss.android.ugc.aweme.log;

import X.AbstractC1023470cjx;
import X.C1023630ckD;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class AdChatAgentLogger extends AbstractC1023470cjx implements IAdChatAgentLogger {
    public static final int $stable = 8;
    public final C1023630ckD<?>[] internalLogics;

    public AdChatAgentLogger() {
        this(null);
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public C1023630ckD<?>[] getInternalLogics() {
        return this.internalLogics;
    }

    public AdChatAgentLogger(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.internalLogics = new C1023630ckD[0];
    }
}
