package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class JsLogInterceptRule {

    @C09CT("rule_name")
    public final String ruleName;

    @C09CT("selector")
    public final List<JsLogSelector> selector;

    public JsLogInterceptRule() {
        this("", null);
    }

    public JsLogInterceptRule(String str, List<JsLogSelector> list) {
        this.ruleName = str;
        this.selector = list;
    }
}
