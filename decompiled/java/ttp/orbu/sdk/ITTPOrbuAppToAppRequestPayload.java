package ttp.orbu.sdk;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTPOrbuAppToAppRequestPayload extends ITTPOrbuRequestPayload {
    JSONObject sharedData();

    String targetAppName();
}
