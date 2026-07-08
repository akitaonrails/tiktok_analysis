package org.chromium.wschannel;

import X.AbstractC1498430p61;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.k0;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class WebSocketCallbackImpl extends AbstractC1498430p61 {
    public IWsChannelClient mClient;

    public WebSocketCallbackImpl(IWsChannelClient iWsChannelClient) {
        this.mClient = iWsChannelClient;
    }

    @Override // X.AbstractC1498430p61
    public void onConnectionStateChanged(k0 k0Var, int i, String str) {
        int iCronetToWsStateAdapter = WsUtils.cronetToWsStateAdapter(i);
        Logger.debug();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("state", iCronetToWsStateAdapter);
            jSONObject.put("url", str);
            this.mClient.onConnection(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC1498430p61
    public void onMessageReceived(k0 k0Var, ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[byteBuffer.capacity()];
        try {
            byteBuffer.get(bArr);
            this.mClient.onMessage(bArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC1498430p61
    public void onConnectionError(k0 k0Var, int i, String str, String str2) {
        int iCronetToWsStateAdapter = WsUtils.cronetToWsStateAdapter(i);
        Logger.debug();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 0);
            jSONObject.put("state", iCronetToWsStateAdapter);
            jSONObject.put("url", str);
            jSONObject.put("error", str2);
            if (DestroyTimeoutControl.isConnectionTimeout(str2, true)) {
                jSONObject.put("error_code", -192);
                Logger.debug();
            }
            this.mClient.onConnection(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC1498430p61
    public void onTrafficChanged(k0 k0Var, String str, long j, long j2, boolean z) {
        try {
            TrafficChangedObservable.inst().onTrafficChanged(str, j, j2, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
