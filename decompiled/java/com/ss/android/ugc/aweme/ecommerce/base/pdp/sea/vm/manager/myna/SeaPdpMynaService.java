package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1765240w2M;
import X.InterfaceC665370Q7z;
import android.content.Context;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpMynaService implements ISeaPdpPageService {
    public final Context LL;
    public final InterfaceC665370Q7z LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 436));

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna.ISeaPdpPageService
    public final InterfaceC1765240w2M Hn1() {
        return (InterfaceC1765240w2M) this.LLILLL.getValue();
    }

    public SeaPdpMynaService(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = context;
        this.LLILLJJLI = interfaceC665370Q7z;
    }
}
