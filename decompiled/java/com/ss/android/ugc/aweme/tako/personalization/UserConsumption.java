package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class UserConsumption {

    @C09CT("watch_history")
    public final List<AwemeConsumeSignal> watchHistory;

    public UserConsumption() {
        this(null);
    }

    public UserConsumption(List<AwemeConsumeSignal> list) {
        this.watchHistory = list;
    }
}
