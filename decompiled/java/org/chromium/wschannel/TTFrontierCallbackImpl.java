package org.chromium.wschannel;

import X.AbstractC847290XLr;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.TTFrontierConnection;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTFrontierCallbackImpl extends AbstractC847290XLr {
    public final IWsChannelClient mClient;
    public final TTFrontierClient mFrontierClient;

    public TTFrontierCallbackImpl(TTFrontierClient tTFrontierClient, IWsChannelClient iWsChannelClient) {
        this.mFrontierClient = tTFrontierClient;
        this.mClient = iWsChannelClient;
    }

    @Override // X.AbstractC847290XLr
    public void onAllServiceReady(TTFrontierConnection tTFrontierConnection, boolean z) {
        Logger.debug();
    }

    @Override // X.AbstractC847290XLr
    public void onConnectionMode(TTFrontierConnection tTFrontierConnection, int i) {
        Logger.debug();
        this.mFrontierClient.onConnectionModeReady(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMessageReceived$0(boolean z, byte[] bArr, int i, Map map) {
        try {
            if (!z) {
                this.mClient.onMessage(bArr);
                return;
            }
            WsChannelMsg wsChannelMsgConstructWsChannelMsg = WsUtils.constructWsChannelMsg(i, map, bArr);
            Logger.debug();
            this.mClient.onMessage(wsChannelMsgConstructWsChannelMsg);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC847290XLr
    public void onConnectionError(TTFrontierConnection tTFrontierConnection, int i, String str, String str2) {
        int iCronetToWsStateAdapter = WsUtils.cronetToWsStateAdapter(i);
        Logger.debug();
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            jSONObject.put("type", 0);
            jSONObject.put("state", iCronetToWsStateAdapter);
            jSONObject.put("url", str);
            jSONObject.put("error", str2);
            if (this.mFrontierClient.privateProtocolEnabled()) {
                i2 = 1;
            }
            jSONObject.put("private_protocol_enable", i2);
            this.mClient.onConnection(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC847290XLr
    public void onConnectionStateChanged(TTFrontierConnection tTFrontierConnection, int i, String str, String str2) {
        int iCronetToWsStateAdapter = WsUtils.cronetToWsStateAdapter(i);
        Logger.debug();
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = 1;
            jSONObject.put("type", 1);
            jSONObject.put("state", iCronetToWsStateAdapter);
            jSONObject.put("url", str);
            if (!this.mFrontierClient.privateProtocolEnabled()) {
                i2 = 0;
            }
            jSONObject.put("private_protocol_enable", i2);
            this.mClient.onConnection(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC847290XLr
    public void onMessageReceived(TTFrontierConnection tTFrontierConnection, final int i, ByteBuffer byteBuffer, final Map<String, String> map, final boolean z) {
        Logger.debug();
        try {
            final byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            this.mFrontierClient.getExecutor().execute(new Runnable() { // from class: org.chromium.wschannel.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$onMessageReceived$0(z, bArr, i, map);
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
