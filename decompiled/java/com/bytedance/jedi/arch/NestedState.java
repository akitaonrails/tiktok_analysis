package com.bytedance.jedi.arch;

import X.C004I;

/* JADX INFO: loaded from: classes30.dex */
public interface NestedState<SUB extends C004I> extends C004I {
    SUB getSubstate();

    NestedState<SUB> newSubstate(SUB sub);
}
