package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm;

import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface IApmDependencyService extends IECommerceHostService {
    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);

    String newNetworkTraceparent();

    String newTrackingTraceparent();
}
