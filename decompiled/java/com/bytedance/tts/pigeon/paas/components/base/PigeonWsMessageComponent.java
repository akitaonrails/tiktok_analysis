package com.bytedance.tts.pigeon.paas.components.base;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.AbsPigeonGlobalProtocol;

/* JADX INFO: loaded from: classes15.dex */
public final class PigeonWsMessageComponent extends AbsPigeonGlobalProtocol {
    public final GECPigeon LL;

    @Override // X.C0YXB
    public final GECPigeon LJJJJLL() {
        return this.LL;
    }

    public PigeonWsMessageComponent(GECPigeon gECPigeon) {
        this.LL = gECPigeon;
    }

    @Override // com.bytedance.tts.pigeon.container.protocol.AbsPigeonEventProtocol, X.InterfaceC875510YWf
    public final void LJJLIIIIJ(WsChannelMsg wsChannelMsg) {
        int i = wsChannelMsg.method;
        if (i != 1020 && i != 1031 && i != 1032) {
            this.LL.getPigeonIMClient().LJIILJJIL().LIZ(wsChannelMsg.payloadEncoding, wsChannelMsg.LIZ());
        }
    }
}
