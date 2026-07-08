package com.orbu.core.adapter;

import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuSettingsRequestPayload;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKSettingsRequest implements ITTKOrbuRequest<ITTKOrbuSettingsRequestPayload> {
    public final Map<String, String> metadata;
    public final AnonymousClass1 payload = new ITTKOrbuSettingsRequestPayload() { // from class: com.orbu.core.adapter.TTKSettingsRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuSettingsRequestPayload
        public String settingsResponse() {
            return TTKSettingsRequest.this.settingsResponse;
        }
    };
    public final String settingsResponse;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.SETTINGS;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuSettingsRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKSettingsRequest$payload$1] */
    public TTKSettingsRequest(String str, Map<String, String> map) {
        this.settingsResponse = str;
        this.metadata = map;
    }
}
