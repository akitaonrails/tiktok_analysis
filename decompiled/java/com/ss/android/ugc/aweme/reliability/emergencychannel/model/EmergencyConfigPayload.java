package com.ss.android.ugc.aweme.reliability.emergencychannel.model;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes4.dex */
public final class EmergencyConfigPayload {

    @C09CT("domain")
    public final EmergencyConfigDomain _domain;

    @C09CT("config_id")
    public final String configId;

    @C09CT("content")
    public final n content;

    @C09CT("payload_max_age_millis")
    public final long payloadMaxAgeMillis;

    public EmergencyConfigPayload() {
        this("", EmergencyConfigDomain.UNKNOWN, new n(), 86400000L);
    }

    public static EmergencyConfigPayload LIZ(EmergencyConfigPayload emergencyConfigPayload, n nVar) {
        return new EmergencyConfigPayload(emergencyConfigPayload.configId, emergencyConfigPayload._domain, nVar, emergencyConfigPayload.payloadMaxAgeMillis);
    }

    public EmergencyConfigPayload(String str, EmergencyConfigDomain emergencyConfigDomain, n nVar, long j) {
        this.configId = str;
        this._domain = emergencyConfigDomain;
        this.content = nVar;
        this.payloadMaxAgeMillis = j;
    }
}
