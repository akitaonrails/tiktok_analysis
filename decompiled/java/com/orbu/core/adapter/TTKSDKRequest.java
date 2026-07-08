package com.orbu.core.adapter;

import X.C2188811AlT;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuSDKRequestPayload;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes29.dex */
public final class TTKSDKRequest implements ITTKOrbuRequest<ITTKOrbuSDKRequestPayload> {
    public final Map<String, String> metadata;
    public final String methodName;
    public final Map<String, Object> params;
    public final AnonymousClass1 payload = new ITTKOrbuSDKRequestPayload() { // from class: com.orbu.core.adapter.TTKSDKRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuSDKRequestPayload
        public String methodName() {
            return TTKSDKRequest.this.methodName;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuSDKRequestPayload
        public Map<String, Object> params() {
            return TTKSDKRequest.this.params;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuSDKRequestPayload
        public String sdkDescriptor() {
            return TTKSDKRequest.this.sdkDescriptor;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(TTKSDKRequest.this.sdkDescriptor);
            sbLIZ.append('#');
            sbLIZ.append(TTKSDKRequest.this.methodName);
            sbLIZ.append('#');
            sbLIZ.append(TTKSDKRequest.this.params);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public final String sdkDescriptor;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.SDK;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuSDKRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKSDKRequest$payload$1] */
    public TTKSDKRequest(String str, String str2, Map<String, ? extends Object> map, Map<String, String> map2) {
        this.sdkDescriptor = str;
        this.methodName = str2;
        this.params = map;
        this.metadata = map2;
    }
}
