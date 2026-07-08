package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.vm;

import X.C01GW;
import X.C06JN;
import X.C06K0;
import X.C0JQJ;
import X.C0JRV;
import X.C1554960qZC;
import X.C1588806Jy;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class EmotePollStartVM extends AssemViewModel<C06JN> {
    public C0JRV LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0JQJ LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1588806Jy(this));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C06JN(0);
    }

    public final C0JQJ vQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            C0JQJ c0jqj = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JQJ.class, null)) != null) {
                c0jqj = (C0JQJ) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c0jqj;
        }
        return this.LLILLL;
    }

    public final C06K0 wQ2() {
        return (C06K0) this.LLILZ.getValue();
    }
}
