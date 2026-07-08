package com.bytedance.common.wschannel.client;

import X.C0XE1;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.C821280WJq;
import X.InterfaceC810750VrF;
import android.content.Context;
import android.util.Log;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class WsClientService extends AbsWsClientService {
    @Override // com.bytedance.common.wschannel.client.AbsWsClientService
    public final void replySendMsgResult(WsChannelMsg wsChannelMsg, boolean z) {
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC821190WJh
    public final void onReceive(WsChannelMsg wsChannelMsg) {
        boolean zLJI = MethodIDManager.LJI(71760);
        if (wsChannelMsg != null) {
            try {
                InterfaceC810750VrF listener = WsConstants.getListener(wsChannelMsg.channelId);
                if (listener != null && !wsChannelMsg.isAckMsg) {
                    listener.LIZ(wsChannelMsg);
                } else {
                    WsConstants.getMessageAckListener();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC821190WJh
    public final void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent) {
        if (serviceConnectEvent == null) {
            return;
        }
        WsConstants.setServiceState(serviceConnectEvent);
        WsConstants.getServiceConnectListener();
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC821190WJh
    public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) {
        InterfaceC810750VrF listener;
        if (c821280WJq != null && (listener = WsConstants.getListener(c821280WJq.LIZLLL)) != null) {
            listener.onReceiveConnectEvent(c821280WJq, jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC821190WJh
    public final void onSendResult(String str, boolean z) {
        super.onSendResult(str, z);
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC821190WJh
    public final void syncState(int i, C0XE1 c0xe1, boolean z) {
        WsConstants.setConnectionState(i, c0xe1, z);
    }
}
