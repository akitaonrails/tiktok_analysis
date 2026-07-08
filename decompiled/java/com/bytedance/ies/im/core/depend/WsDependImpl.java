package com.bytedance.ies.im.core.depend;

import X.C01GW;
import X.C0XE1;
import X.C0XEZ;
import X.C0Z40;
import X.C0Z42;
import X.C0Z46;
import X.C300810Bqh;
import X.C452501pT;
import X.C821280WJq;
import X.C883500YlI;
import X.C893680Z4c;
import X.C897870ZKf;
import X.C897900ZKi;
import X.InterfaceC486470J5x;
import X.InterfaceC883440YlC;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.im.core.api.depend.IWsDepend;
import com.bytedance.ies.im.core.global.action.GlobalActionExecutor;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class WsDependImpl implements IWsDepend, InterfaceC486470J5x, C0XEZ {
    public static final WsDependImpl LL;
    public static final C01GW LLILLJJLI;
    public static C0Z46 LLILLL;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Service implements IWsDepend {
        public Service() {
            WsDependImpl wsDependImpl = WsDependImpl.LL;
        }
    }

    static {
        WsDependImpl wsDependImpl = new WsDependImpl();
        LL = wsDependImpl;
        LLILLJJLI = C452501pT.LIZIZ(new C883500YlI());
        if (C893680Z4c.LIZIZ.LIZ()) {
            return;
        }
        IIMHostApiWebSocket.LIZ.getClass();
        IIMHostApiWebSocket iIMHostApiWebSocketLIZ = C0Z42.LIZ();
        if (iIMHostApiWebSocketLIZ != null) {
            iIMHostApiWebSocketLIZ.LIZIZ(wsDependImpl);
        }
        IIMHostApiWebSocket iIMHostApiWebSocketLIZ2 = C0Z42.LIZ();
        if (iIMHostApiWebSocketLIZ2 != null) {
            iIMHostApiWebSocketLIZ2.LJ(wsDependImpl);
        }
    }

    public final boolean LIZJ() {
        IIMHostApiWebSocket.LIZ.getClass();
        IIMHostApiWebSocket iIMHostApiWebSocketLIZ = C0Z42.LIZ();
        return iIMHostApiWebSocketLIZ != null && iIMHostApiWebSocketLIZ.isConnected();
    }

    public final void LIZLLL() {
        IIMHostApiWebSocket.LIZ.getClass();
        IIMHostApiWebSocket iIMHostApiWebSocketLIZ = C0Z42.LIZ();
        if (iIMHostApiWebSocketLIZ != null) {
            iIMHostApiWebSocketLIZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        Iterator it2 = ((CopyOnWriteArraySet) LLILLJJLI.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC883440YlC) it2.next()).LJI(wsChannelMsg);
        }
    }

    public final void LJ(InterfaceC883440YlC interfaceC883440YlC) {
        ((CopyOnWriteArraySet) LLILLJJLI.getValue()).add(interfaceC883440YlC);
    }

    public final void LJFF(WsChannelMsg wsChannelMsg) {
        if (C893680Z4c.LIZIZ.LIZ()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IMSaasHostOfflineDebugService.LIZ.getClass();
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ = C0Z40.LIZIZ();
        if (iMSaasHostOfflineDebugServiceLIZIZ != null) {
            iMSaasHostOfflineDebugServiceLIZIZ.isPPEEnable();
            iMSaasHostOfflineDebugServiceLIZIZ.enableBoe();
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
            WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
            msgHeader.key = (String) entry.getKey();
            msgHeader.value = (String) entry.getValue();
            list.add(msgHeader);
        }
        IIMHostApiWebSocket.LIZ.getClass();
        IIMHostApiWebSocket iIMHostApiWebSocketLIZ = C0Z42.LIZ();
        if (iIMHostApiWebSocketLIZ != null) {
            iIMHostApiWebSocketLIZ.LIZ(wsChannelMsg);
        }
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        String strLIZJ;
        C0XE1 c0xe1 = c821280WJq.LIZIZ;
        IIMHostApiWebSocket.LIZ.getClass();
        IIMHostApiWebSocket iIMHostApiWebSocketLIZ = C0Z42.LIZ();
        if (iIMHostApiWebSocketLIZ != null) {
            strLIZJ = iIMHostApiWebSocketLIZ.LIZJ();
        } else {
            strLIZJ = null;
        }
        LLILLL = new C0Z46(c0xe1, strLIZJ, null);
        Iterator it2 = ((CopyOnWriteArraySet) LLILLJJLI.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC883440YlC) it2.next()).LIZ(LLILLL);
        }
        C0Z46 c0z46 = LLILLL;
        if (C300810Bqh.LIZ() && c0z46 != null && c0z46.LIZ == C0XE1.CONNECTED) {
            Iterator it3 = ((ArrayList) ((C897870ZKf) GlobalActionExecutor.LLILZ.getValue()).LIZIZ()).iterator();
            while (it3.hasNext()) {
                ((C897900ZKi) it3.next()).LIZ.invoke();
            }
        }
    }
}
