package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C909270Zll;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarTransferConf {
    public static final C909270Zll Companion = new Object() { // from class: X.0Zll
    };

    @C09CT("operation_type")
    public final String action;

    @C09CT("state")
    public final ActionBarButtonStrategyConf resultButton;

    @C09CT("from_button_id")
    public final String targetButtonId;

    public ActionBarTransferConf() {
        this(null, null, null);
    }

    public ActionBarTransferConf(String str, String str2, ActionBarButtonStrategyConf actionBarButtonStrategyConf) {
        this.action = str;
        this.targetButtonId = str2;
        this.resultButton = actionBarButtonStrategyConf;
    }
}
