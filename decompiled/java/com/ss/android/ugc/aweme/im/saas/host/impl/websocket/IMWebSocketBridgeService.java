package com.ss.android.ugc.aweme.im.saas.host.impl.websocket;

import X.C0XE1;
import X.C0XEZ;
import X.C0YOP;
import X.C2203431BLp;
import X.C892280YzS;
import com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi;

/* JADX INFO: loaded from: classes15.dex */
public final class IMWebSocketBridgeService implements IMWebSocketBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi
    public final void LIZ() {
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        if (c2203431BLp.getState() != C0XE1.CONNECTED) {
            if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN) {
                c2203431BLp.LJ("external_share_reflow");
            }
            C0YOP.LIZ("external_share_reflow_enter_quick_chat", false, -2, null, 26);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi
    public final boolean isConnected() {
        return C2203431BLp.LIZIZ.isConnected();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi
    public final void LIZIZ(C892280YzS c892280YzS) {
        C2203431BLp.LIZIZ.LJIIJJI(c892280YzS);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi
    public final void LIZLLL(C0XEZ c0xez) {
        C2203431BLp.LIZIZ.LIZLLL(c0xez);
    }
}
