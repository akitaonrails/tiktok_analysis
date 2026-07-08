package com.orbu.core.adapter;

import X.C2188811AlT;
import com.orbu.core.api.ITTKOrbuLiveSEIRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes21.dex */
public final class TTKLiveSEIRequest implements ITTKOrbuRequest<ITTKOrbuLiveSEIRequestPayload> {
    public final Map<String, String> metadata;
    public final AnonymousClass1 payload = new ITTKOrbuLiveSEIRequestPayload() { // from class: com.orbu.core.adapter.TTKLiveSEIRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuLiveSEIRequestPayload
        public String seiKey() {
            return TTKLiveSEIRequest.this.seiKey;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuLiveSEIRequestPayload
        public Object seiValue() {
            return TTKLiveSEIRequest.this.seiValue;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(TTKLiveSEIRequest.this.seiKey);
            sbLIZ.append(", ");
            sbLIZ.append(TTKLiveSEIRequest.this.seiValue);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public final String seiKey;
    public final Object seiValue;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.LIVE_SEI;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuLiveSEIRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKLiveSEIRequest$payload$1] */
    public TTKLiveSEIRequest(String str, Object obj, Map<String, String> map) {
        this.seiKey = str;
        this.seiValue = obj;
        this.metadata = map;
    }
}
