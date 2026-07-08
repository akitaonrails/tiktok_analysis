package com.bytedance.helios.apimonitor.permission;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PermissionPopUpConfig {

    @C09CT("enable")
    public final boolean enable;

    public PermissionPopUpConfig() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PermissionPopUpConfig) && this.enable == ((PermissionPopUpConfig) obj).enable;
    }

    public PermissionPopUpConfig(boolean z) {
        this.enable = z;
    }
}
