package com.bytedance.ies.xbridge.base.runtime.depend;

/* JADX INFO: loaded from: classes29.dex */
public final class OnPermissionsGrantResult {
    public final String permission;
    public final int result;

    public final String getPermission() {
        return this.permission;
    }

    public final int getResult() {
        return this.result;
    }

    public OnPermissionsGrantResult(String str, int i) {
        this.permission = str;
        this.result = i;
    }
}
