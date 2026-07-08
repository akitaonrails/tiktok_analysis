package com.orbu.core.adapter;

import com.orbu.core.api.ITTKOrbuAppToAppRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.Map;
import org.json.JSONObject;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes29.dex */
public final class TTKAppToAppRequest implements ITTKOrbuRequest<ITTKOrbuAppToAppRequestPayload> {
    public final Map<String, String> metadata;
    public final AnonymousClass1 payload = new ITTKOrbuAppToAppRequestPayload() { // from class: com.orbu.core.adapter.TTKAppToAppRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuAppToAppRequestPayload
        public JSONObject sharedData() {
            return TTKAppToAppRequest.this.sharedData;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuAppToAppRequestPayload
        public String targetAppName() {
            return TTKAppToAppRequest.this.targetAppName;
        }

        public String toString() {
            return String.valueOf(TTKAppToAppRequest.this.targetAppName);
        }
    };
    public final JSONObject sharedData;
    public final String targetAppName;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.APP_TO_APP;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuAppToAppRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKAppToAppRequest$payload$1] */
    public TTKAppToAppRequest(JSONObject jSONObject, String str, Map<String, String> map) {
        this.sharedData = jSONObject;
        this.targetAppName = str;
        this.metadata = map;
    }
}
