package ttp.orbu.sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTPOrbuSystemAPIRequestPayload extends ITTPOrbuRequestPayload {
    String className();

    String methodName();

    Map<String, Object> params();
}
