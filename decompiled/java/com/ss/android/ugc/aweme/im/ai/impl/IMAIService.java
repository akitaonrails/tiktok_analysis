package com.ss.android.ugc.aweme.im.ai.impl;

import X.C01GW;
import X.C062N;
import X.C15390060u;
import X.C15408061m;
import X.C452501pT;
import X.InterfaceC1491705sh;
import X.InterfaceC1693306k7;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAIService implements IMAIServiceAPI {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(332));
    public final C15390060u LIZJ = C15390060u.LL;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(331));

    @Override // com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI
    public final InterfaceC1491705sh LIZIZ() {
        return (C15408061m) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI
    public final C062N LIZJ() {
        return (C062N) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI
    public final InterfaceC1693306k7 LIZ() {
        return this.LIZJ;
    }
}
