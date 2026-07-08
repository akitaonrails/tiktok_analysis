package com.bytedance.tt.reliability.monitor.viewchecker.model;

import X.C08FF;

/* JADX INFO: loaded from: classes13.dex */
public enum TargetType {
    DIALOG,
    POPUP;

    public static TargetType valueOf(String str) {
        return (TargetType) C08FF.LIZ(TargetType.class, str);
    }
}
