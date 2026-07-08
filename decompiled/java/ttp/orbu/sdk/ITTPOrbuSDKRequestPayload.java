package ttp.orbu.sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTPOrbuSDKRequestPayload extends ITTPOrbuRequestPayload {
    String methodName();

    Map<String, Object> params();

    String sdkDescriptor();
}
