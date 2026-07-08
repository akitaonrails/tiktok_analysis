package ttp.orbu.sdk;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface ITTPOrbuNetworkRequestPayload extends ITTPOrbuRequestPayload {
    byte[] data();

    Map<String, List<String>> headers();

    String method();

    String url();
}
