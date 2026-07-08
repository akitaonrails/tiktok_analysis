package com.ss.android.ugc.aweme.ecommerce.preloader.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ECDispatchResourceCondition {

    @C09CT("cpu")
    public final ECDispatchResourceConditionItem cpu;

    @C09CT("memory")
    public final ECDispatchResourceConditionItem memory;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    @C09CT("net")
    public final ECDispatchResourceConditionItem f356net;

    public ECDispatchResourceCondition() {
        this(null, null, null);
    }

    public ECDispatchResourceCondition(ECDispatchResourceConditionItem eCDispatchResourceConditionItem, ECDispatchResourceConditionItem eCDispatchResourceConditionItem2, ECDispatchResourceConditionItem eCDispatchResourceConditionItem3) {
        this.cpu = eCDispatchResourceConditionItem;
        this.memory = eCDispatchResourceConditionItem2;
        this.f356net = eCDispatchResourceConditionItem3;
    }
}
