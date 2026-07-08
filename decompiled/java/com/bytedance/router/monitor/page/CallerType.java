package com.bytedance.router.monitor.page;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum CallerType {
    Activity,
    Fragment;

    public static CallerType valueOf(String str) {
        return (CallerType) C08FF.LIZ(CallerType.class, str);
    }
}
