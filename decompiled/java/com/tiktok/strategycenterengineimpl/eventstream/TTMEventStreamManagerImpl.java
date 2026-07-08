package com.tiktok.strategycenterengineimpl.eventstream;

import X.C1954807lC;
import X.C829820Wgu;
import X.C829880Wh0;
import X.C829900Wh2;
import X.C829910Wh3;
import X.C830790WiT;
import X.EnumC829810Wgt;
import X.InterfaceC830810WiV;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStreamManager;

/* JADX INFO: loaded from: classes14.dex */
public final class TTMEventStreamManagerImpl implements ITTMEventStreamManager {
    @Override // com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStreamManager
    public final C830790WiT LIZJ() {
        return new C830790WiT("SlardarLog", true);
    }

    @Override // com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStreamManager
    public final ITTMEventStream LIZ(EnumC829810Wgt enumC829810Wgt) {
        int i = C829820Wgu.LIZ[enumC829810Wgt.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C829910Wh3.LIZ;
            }
            throw new C1954807lC();
        }
        return C829900Wh2.LIZ;
    }

    @Override // com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStreamManager
    public final void LIZIZ(InterfaceC830810WiV interfaceC830810WiV) {
        if (interfaceC830810WiV == null) {
            return;
        }
        C829880Wh0.LIZ("SlardarLog", interfaceC830810WiV);
    }
}
