package org.chromium.wschannel;

import X.C0WZX;
import X.C2163108dh;
import X.C2188811AlT;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MySelfChannelImpl implements IWsChannelClient, WeakHandler.IHandler {
    public static String WSCHANNEL_ACTION_BACK;
    public static String WSCHANNEL_ACTION_FORE;
    public static String sPackageName;
    public static volatile String sUserAgent;
    public Context mContext;
    public TTFrontierClient mFrontierClient;
    public CronetFrontierConnection mFrontierConnection;
    public IWsChannelClient mWsChannelClient;

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
    }

    private boolean shouldUseProxy() {
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            return tTFrontierClient.privateProtocolProxyEnabled();
        }
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        return cronetFrontierConnection != null && cronetFrontierConnection.privateProtocolEnabled() && this.mFrontierConnection.privateProtocolProxyEnabled();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            tTFrontierClient.destroyConnection();
            this.mFrontierClient.destroy();
        }
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            cronetFrontierConnection.destroyConnection();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            return tTFrontierClient.isConnected();
        }
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            return cronetFrontierConnection.isConnected();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolEnabled() {
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            return tTFrontierClient.privateProtocolEnabled();
        }
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            return cronetFrontierConnection.privateProtocolEnabled();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean privateProtocolProxyEnabled() {
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            return tTFrontierClient.privateProtocolProxyEnabled();
        }
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            return cronetFrontierConnection.privateProtocolProxyEnabled();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            tTFrontierClient.stopConnection();
        }
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            cronetFrontierConnection.stopConnection();
        }
    }

    public static String getDefaultUserAgent() {
        return sUserAgent;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Logger.debug();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) throws Throwable {
        Intent intent = new Intent();
        if (i == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            C2204961BRm.LJJJJI(this.mContext, intent, new C0WZX("ey15EgEyTcXRXEIsCwWXZdW7yrt+WkeXNw+7NgAVrVd2IQdmThdryQ==", null));
            return;
        }
        if (i != 2) {
            return;
        }
        intent.setAction(WSCHANNEL_ACTION_BACK);
        if (!TextUtils.isEmpty(sPackageName)) {
            intent.setPackage(sPackageName);
        }
        C2204961BRm.LJJJJI(this.mContext, intent, new C0WZX("ey15EgEyTcXRXEIsCwWXZdW7yrt+WkeXNw+7NgAVrVd2IQdmThdryQ==", null));
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put("channel_type", 1);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(WsChannelMsg wsChannelMsg) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void registerService(int i) {
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            cronetFrontierConnection.registerService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        Logger.debug();
        if (this.mFrontierConnection == null && this.mFrontierClient == null) {
            return false;
        }
        boolean zShouldUseProxy = shouldUseProxy();
        Logger.debug();
        if (zShouldUseProxy) {
            TTFrontierClient tTFrontierClient = this.mFrontierClient;
            if (tTFrontierClient != null) {
                return tTFrontierClient.sendMessageWithPrivateProtocolProxy(bArr);
            }
            return this.mFrontierConnection.sendMessageWithPrivateProtocolProxy(bArr);
        }
        TTFrontierClient tTFrontierClient2 = this.mFrontierClient;
        if (tTFrontierClient2 != null) {
            return tTFrontierClient2.sendMessageWithWebSocket(bArr);
        }
        return this.mFrontierConnection.sendMessageWithWebSocket(bArr);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void unregisterService(int i) {
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            cronetFrontierConnection.unregisterService(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(WsChannelMsg wsChannelMsg) {
        Logger.debug();
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection == null && this.mFrontierClient == null) {
            return false;
        }
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            return tTFrontierClient.sendMessageWithPrivateProtocol(wsChannelMsg);
        }
        return cronetFrontierConnection.sendMessageWithPrivateProtocol(wsChannelMsg);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        stopConnection();
        openConnection(map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map<String, Object> map, List<String> list) {
        TTFrontierClient tTFrontierClient = this.mFrontierClient;
        if (tTFrontierClient != null) {
            tTFrontierClient.startConnection(map, list);
            return;
        }
        CronetFrontierConnection cronetFrontierConnection = this.mFrontierConnection;
        if (cronetFrontierConnection != null) {
            cronetFrontierConnection.startConnection(map, list);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient, String str) {
        Logger.debug();
        this.mContext = context;
        sPackageName = context.getPackageName();
        this.mWsChannelClient = iWsChannelClient;
        if (WsUtils.isFrontierDomainEnabled(str)) {
            try {
                this.mFrontierClient = new TTFrontierClient(this.mWsChannelClient);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mFrontierClient = null;
            }
        }
        if (this.mFrontierClient == null) {
            this.mFrontierConnection = new CronetFrontierConnection(this);
        }
        if (TextUtils.isEmpty(sUserAgent)) {
            try {
                sUserAgent = C2163108dh.LIZ(context);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mContext.getPackageName());
        sbLIZ.append(".wschannel.APP_BACKGROUND");
        WSCHANNEL_ACTION_BACK = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.mContext.getPackageName());
        sbLIZ2.append(".wschannel.APP_FOREGROUND");
        WSCHANNEL_ACTION_FORE = C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onServiceConnectEvent(int i, boolean z, String str) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onServiceConnectEvent(i, z, str);
        }
    }
}
