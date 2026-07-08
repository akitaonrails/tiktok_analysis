package com.orbu.core.mob;

import com.orbu.core.api.ITTKOrbuRequest;
import org.json.JSONObject;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes14.dex */
public interface ITTKEventReport {

    public static final class DefaultImpls {
        public static boolean shouldReportPayload(ITTKEventReport iTTKEventReport, Channel channel, int i, String str) {
            return false;
        }
    }

    boolean hitSampleDrop(String str);

    void onError(Throwable th);

    void onEvent(String str, JSONObject jSONObject);

    void onTTKRequest(ITTKOrbuRequest<?> iTTKOrbuRequest, boolean z);

    boolean shouldReportPayload(Channel channel, int i, String str);
}
