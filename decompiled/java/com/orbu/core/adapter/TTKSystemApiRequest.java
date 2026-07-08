package com.orbu.core.adapter;

import X.C2188811AlT;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuSystemAPIRequestPayload;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes29.dex */
public final class TTKSystemApiRequest implements ITTKOrbuRequest<ITTKOrbuSystemAPIRequestPayload> {
    public final String className;
    public final Map<String, String> metadata;
    public final String methodName;
    public final Map<String, Object> params;
    public final AnonymousClass1 payload = new ITTKOrbuSystemAPIRequestPayload() { // from class: com.orbu.core.adapter.TTKSystemApiRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuSystemAPIRequestPayload
        public String className() {
            return TTKSystemApiRequest.this.className;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuSystemAPIRequestPayload
        public String methodName() {
            return TTKSystemApiRequest.this.methodName;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuSystemAPIRequestPayload
        public Map<String, Object> params() {
            return TTKSystemApiRequest.this.params;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(TTKSystemApiRequest.this.className);
            sbLIZ.append('#');
            sbLIZ.append(TTKSystemApiRequest.this.methodName);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.SYSTEM_API;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuSystemAPIRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKSystemApiRequest$payload$1] */
    public TTKSystemApiRequest(String str, String str2, Map<String, ? extends Object> map, Map<String, String> map2) {
        this.className = str;
        this.methodName = str2;
        this.params = map;
        this.metadata = map2;
    }
}
