package com.bytedance.pipo.security;

import X.C1697810uHb;
import X.C1726500v1s;
import X.C1726720v2E;
import X.C1726810v2N;
import X.C1726820v2O;
import X.C452501pT;
import X.InterfaceC1063710dmr;
import X.InterfaceC1726640v26;
import X.InterfaceC1726700v2C;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoSecuritySdk implements IPipoSecuritySdk {
    @Override // com.bytedance.pipo.security.IPipoSecuritySdk
    public final List<Class<? extends InterfaceC1063710dmr>> provideXBridgetIDLMethodList() {
        return C1697810uHb.LJIIJJI(C1726810v2N.class, C1726820v2O.class);
    }

    @Override // com.bytedance.pipo.security.IPipoSecuritySdk
    public final C1726500v1s LIZ(Context context, String str, String str2, InterfaceC1726640v26 interfaceC1726640v26) {
        return new C1726500v1s(str, str2, interfaceC1726640v26, (InterfaceC1726700v2C) C452501pT.LIZIZ(new C1726720v2E(context)).getValue());
    }
}
