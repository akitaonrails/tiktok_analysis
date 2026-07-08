package ttp.orbu.sdk;

import java.util.Map;
import ttp.orbu.sdk.ITTPOrbuRequestPayload;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTPOrbuRequest<T extends ITTPOrbuRequestPayload> {
    Channel channel();

    String description();

    Map<String, String> metadata();

    T payload();
}
