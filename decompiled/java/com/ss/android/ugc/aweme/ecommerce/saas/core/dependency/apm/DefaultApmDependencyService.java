package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultApmDependencyService implements IApmDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public String newNetworkTraceparent() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public String newTrackingTraceparent() {
        return "";
    }
}
