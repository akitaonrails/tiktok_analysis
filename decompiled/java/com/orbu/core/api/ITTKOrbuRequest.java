package com.orbu.core.api;

import com.orbu.core.api.ITTKOrbuRequestPayload;
import java.util.Map;
import ttp.orbu.sdk.Channel;
import ttp.orbu.sdk.ITTPOrbuRequest;

/* JADX INFO: loaded from: classes14.dex */
public interface ITTKOrbuRequest<T extends ITTKOrbuRequestPayload> extends ITTPOrbuRequest<T> {
    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    Channel channel();

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    String description();

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    Map<String, String> metadata();

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    T payload();
}
