package org.chromium.wschannel;

import X.InterfaceC847340XLw;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class PrivateProtocolCallbackImpl implements InterfaceC847340XLw {
    public IWsChannelClient mClient;
    public CronetFrontierConnection mConnection;

    public static int privateProtocolStateAdapter(int i) {
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        return i;
    }

    public static String extractConnectionId(String str) {
        try {
            return new JSONObject(str).optString("connection_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    private boolean shouldIgnoreStateCallback(int i) {
        if (!this.mConnection.privateProtocolProxyEnabled()) {
            return false;
        }
        if ((i != 2 && i != 3 && i != 4) || !this.mConnection.isFallbackTaskRunning()) {
            return false;
        }
        Logger.debug();
        return true;
    }

    public PrivateProtocolCallbackImpl(IWsChannelClient iWsChannelClient, CronetFrontierConnection cronetFrontierConnection) {
        this.mClient = iWsChannelClient;
        this.mConnection = cronetFrontierConnection;
    }

    @Override // X.InterfaceC847340XLw
    public void onConnectionStateChanged(int i, String str) {
        int iPrivateProtocolStateAdapter = privateProtocolStateAdapter(i);
        Logger.debug();
        if (iPrivateProtocolStateAdapter == 4) {
            this.mConnection.setFirstStreamReady(false);
        }
        if (shouldIgnoreStateCallback(iPrivateProtocolStateAdapter)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("private_protocol_enable", 1);
            jSONObject.put("state", iPrivateProtocolStateAdapter);
            jSONObject.put("url", str);
            this.mClient.onConnection(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC847340XLw
    public void onConnectionError(int i, String str, String str2) {
        int iPrivateProtocolStateAdapter = privateProtocolStateAdapter(i);
        Logger.debug();
        if (shouldIgnoreStateCallback(iPrivateProtocolStateAdapter)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 0);
            jSONObject.put("private_protocol_enable", 1);
            jSONObject.put("state", iPrivateProtocolStateAdapter);
            jSONObject.put("url", str);
            jSONObject.put("error", str2);
            if (DestroyTimeoutControl.isConnectionTimeout(str2, false)) {
                jSONObject.put("error_code", -192);
                Logger.debug();
            }
            this.mClient.onConnection(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC847340XLw
    public void onTrafficChanged(String str, long j, long j2, boolean z) {
        try {
            TrafficChangedObservable.inst().onTrafficChanged(str, j, j2, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
