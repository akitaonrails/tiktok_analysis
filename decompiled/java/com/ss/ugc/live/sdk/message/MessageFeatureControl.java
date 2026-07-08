package com.ss.ugc.live.sdk.message;

import X.C01GW;
import X.C2221711BxR;
import X.C2222321ByQ;
import X.C452501pT;
import X.InterfaceC2222101By4;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class MessageFeatureControl {
    public final C01GW expConfig$delegate = C452501pT.LIZIZ(new AwS578S0100000_34(this, 99));
    public final InterfaceC2222101By4 portal;

    private final C2221711BxR getExpConfig() {
        return (C2221711BxR) this.expConfig$delegate.getValue();
    }

    public final void releaseMessageDispatch() {
        this.portal.LJ().LIZIZ.remove(C2222321ByQ.class);
    }

    public final void holdMessageDispatch() {
        if (getExpConfig().LIZJ.LIZ) {
            this.portal.LJ().LIZIZ(new C2222321ByQ(getExpConfig().LIZJ.LIZIZ));
        }
    }

    public final InterfaceC2222101By4 getPortal() {
        return this.portal;
    }

    public MessageFeatureControl(InterfaceC2222101By4 interfaceC2222101By4) {
        this.portal = interfaceC2222101By4;
    }
}
