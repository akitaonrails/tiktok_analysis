package com.ss.android.ugc.aweme.creative.compileconfig.strategies;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public class CompileStrategyJsonStruct {

    @C09CT("key")
    public final String key;

    @C09CT("priority")
    public final int priority;

    public CompileStrategyJsonStruct() {
        this("default", Integer.MIN_VALUE);
    }

    public CompileStrategyJsonStruct(String str, int i) {
        this.key = str;
        this.priority = i;
    }
}
