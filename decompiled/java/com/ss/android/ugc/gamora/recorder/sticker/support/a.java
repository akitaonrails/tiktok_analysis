package com.ss.android.ugc.gamora.recorder.sticker.support;

import X.AbstractC1622390sJx;
import X.C1623370sLX;
import X.C1627370sRz;
import X.InterfaceC1621550sIb;
import X.InterfaceC1623110sL7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class a extends AbstractC1622390sJx implements InterfaceC1623110sL7 {
    public final List<InterfaceC1621550sIb> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        Iterator it2 = new ArrayList(this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1621550sIb) it2.next()).LIZ();
        }
    }
}
