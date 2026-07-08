package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Behavior {

    @C09CT("action")
    public final int action;

    @C09CT("params")
    public final BehaviorParam params;

    public Behavior(int i, BehaviorParam behaviorParam) {
        this.action = i;
        this.params = behaviorParam;
    }
}
