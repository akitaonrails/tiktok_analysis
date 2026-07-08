package org.chromium.wschannel;

import X.C1494230ozF;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class DestroyTimeoutControl {
    public static long sDestroyDeltaMillis = 100;
    public static volatile boolean sEnabled;
    public volatile boolean mFallbackToWebsocket;
    public long mPrivateProtocolTimeout;
    public long mWebsocketTimeout;

    public long getPrivateProtocolTimeout() {
        if (sEnabled) {
            return this.mPrivateProtocolTimeout;
        }
        return 0L;
    }

    public long getWebsocketTimeout() {
        if (sEnabled) {
            return this.mWebsocketTimeout;
        }
        return 0L;
    }

    public boolean shouldFallbackToWebSocket() {
        if (sEnabled) {
            return this.mFallbackToWebsocket;
        }
        return true;
    }

    public DestroyTimeoutControl(Map<String, Object> map, boolean z) {
        this.mFallbackToWebsocket = true;
        int i = C1494230ozF.LJIJJ;
        if (i <= 0) {
            Logger.debug();
            return;
        }
        sDestroyDeltaMillis = i;
        long configTimeoutMilliSeconds = getConfigTimeoutMilliSeconds(map, "destroy_timeout_millis", 0L);
        if (configTimeoutMilliSeconds < 1000) {
            Logger.debug();
            return;
        }
        sEnabled = true;
        if (z) {
            this.mWebsocketTimeout = configTimeoutMilliSeconds - sDestroyDeltaMillis;
            Logger.debug();
            return;
        }
        long configTimeoutMilliSeconds2 = getConfigTimeoutMilliSeconds(map, "fallback_timeout_mills", 10000L);
        Logger.debug();
        if (configTimeoutMilliSeconds2 >= configTimeoutMilliSeconds) {
            this.mFallbackToWebsocket = false;
            Logger.debug();
            this.mPrivateProtocolTimeout = configTimeoutMilliSeconds - sDestroyDeltaMillis;
            return;
        }
        long j = sDestroyDeltaMillis;
        this.mPrivateProtocolTimeout = configTimeoutMilliSeconds2 - j;
        long j2 = (configTimeoutMilliSeconds - configTimeoutMilliSeconds2) - j;
        this.mWebsocketTimeout = j2;
        if (j2 < 0) {
            Logger.debug();
            this.mFallbackToWebsocket = false;
        }
    }

    public static boolean isConnectionTimeout(String str, boolean z) {
        if (!sEnabled || TextUtils.isEmpty(str)) {
            return false;
        }
        if (z) {
            if (!str.contains("\\\"net_error\\\":-7") || !str.contains("WebSocket opening handshake timed out")) {
                return false;
            }
            return true;
        }
        if (!str.contains("\"error_code\":-193") && (!str.contains("\"error_code\":-356") || !str.contains("\\\"internal_error\\\":67"))) {
            return false;
        }
        return true;
    }

    public static long getConfigTimeoutMilliSeconds(Map<String, Object> map, String str, long j) {
        Map map2 = (Map) map.get("custom_headers");
        if (map2 != null && !map2.isEmpty()) {
            if (!map2.containsKey(str)) {
                return j;
            }
            String str2 = (String) map2.get(str);
            if (TextUtils.isEmpty(str2)) {
                return j;
            }
            try {
                int iIntValue = CastIntegerProtector.valueOf(str2).intValue();
                if (iIntValue > 0) {
                    j = iIntValue;
                    return j;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return j;
    }
}
