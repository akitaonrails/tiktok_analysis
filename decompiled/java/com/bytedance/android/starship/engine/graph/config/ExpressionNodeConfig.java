package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ExpressionNodeConfig {

    @C09CT("expression")
    public final String expression;

    @C09CT("extra_inputs")
    public final String extraInputs;

    @C09CT("models")
    public final List<String> models;

    public ExpressionNodeConfig(String str, String str2, List<String> list) {
        this.expression = str;
        this.extraInputs = str2;
        this.models = list;
    }
}
