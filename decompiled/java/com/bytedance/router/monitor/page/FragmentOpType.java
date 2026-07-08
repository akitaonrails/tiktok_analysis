package com.bytedance.router.monitor.page;

import X.C08FF;

/* JADX INFO: loaded from: classes33.dex */
public enum FragmentOpType {
    OP_ADD("add"),
    OP_REPLACE("replace"),
    OP_REMOVE("remove"),
    OP_HIDE("hide"),
    OP_SHOW("show"),
    OP_DETACH("detach"),
    OP_ATTACH("attach");

    public final String methodName;

    public static FragmentOpType valueOf(String str) {
        return (FragmentOpType) C08FF.LIZ(FragmentOpType.class, str);
    }

    public final String getMethodName() {
        return this.methodName;
    }

    FragmentOpType(String str) {
        this.methodName = str;
    }
}
