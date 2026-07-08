package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeFrequencyControlConfig {

    @C09CT("behavior")
    public final Behavior behavior;

    @C09CT("condition")
    public final Condition condition;

    @C09CT("user_action")
    public final int userAction;

    public NoticeFrequencyControlConfig(int i, Condition condition, Behavior behavior) {
        this.userAction = i;
        this.condition = condition;
        this.behavior = behavior;
    }
}
