package com.ss.android.ugc.aweme.services.story.forward;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestCelebrationMaterialResult {
    public final Map<String, String> landingSchema;
    public final int resultCode;

    public final Map<String, String> getLandingSchema() {
        return this.landingSchema;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public RequestCelebrationMaterialResult(int i, Map<String, String> map) {
        this.resultCode = i;
        this.landingSchema = map;
    }
}
