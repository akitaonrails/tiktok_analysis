package ttp.orbu.sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTPOrbuWebRequestPayload extends ITTPOrbuRequestPayload {
    byte[] data();

    Map<String, String> headers();

    String method();

    String url();
}
