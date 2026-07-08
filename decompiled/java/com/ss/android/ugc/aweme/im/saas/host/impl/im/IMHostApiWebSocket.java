package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C01GW;
import X.C1BM5;
import X.C452501pT;
import X.InterfaceC2203441BLq;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket;

/* JADX INFO: loaded from: classes35.dex */
public final class IMHostApiWebSocket implements IIMHostApiWebSocket {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1BM5());

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket
    public final void LIZLLL() {
        LJFF().LJFF("token_invalid");
    }

    public final InterfaceC2203441BLq LJFF() {
        return (InterfaceC2203441BLq) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket
    public final String LIZJ() {
        return LJFF().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket
    public final boolean isConnected() {
        return LJFF().isConnected();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        LJFF().LIZ(wsChannelMsg);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket
    public final void LIZIZ(WsDependImpl wsDependImpl) {
        LJFF().LJI(-10000, -10000, wsDependImpl);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMHostApiWebSocket
    public final void LJ(WsDependImpl wsDependImpl) {
        LJFF().LIZLLL(wsDependImpl);
    }
}
