package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class IABHistory implements Serializable {

    @C09CT("history_function_status")
    public final Integer historyFunctionStatus;

    @C09CT("show_history_user_guide")
    public final Boolean showHistoryUserGuide;

    public IABHistory() {
        this(0, Boolean.TRUE);
    }

    public IABHistory(Integer num, Boolean bool) {
        this.historyFunctionStatus = num;
        this.showHistoryUserGuide = bool;
    }
}
