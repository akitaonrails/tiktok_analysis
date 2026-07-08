package com.bytedance.vcloud.strategy.drm;

/* JADX INFO: loaded from: classes35.dex */
public final class ProvisionResult {
    public final boolean requestedProvision;
    public final boolean success;
    public final int widevineCode;

    public static ProvisionResult readyAfterRequest() {
        return new ProvisionResult(true, 1, true);
    }

    public static ProvisionResult readyWithoutRequest() {
        return new ProvisionResult(true, 0, false);
    }

    public static ProvisionResult failed(int i, boolean z) {
        return new ProvisionResult(false, i, z);
    }

    public ProvisionResult(boolean z, int i, boolean z2) {
        this.success = z;
        this.widevineCode = i;
        this.requestedProvision = z2;
    }
}
