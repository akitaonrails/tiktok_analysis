package com.ss.android.ugc.aweme.tako.feed.topicon;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0C5P;
import X.C452501pT;
import X.InterfaceC308010C5n;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoTopIconAssem extends AbstractC738140SxQ {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1297));

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0C5P c0c5pLIZJ = C0C5P.LIZJ();
        Object value = this.LL.getValue();
        if (value == null) {
            c0c5pLIZJ.getClass();
        } else {
            c0c5pLIZJ.LJFF.add((InterfaceC308010C5n) value);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0C5P c0c5pLIZJ = C0C5P.LIZJ();
        Object value = this.LL.getValue();
        if (value == null) {
            c0c5pLIZJ.getClass();
        } else {
            c0c5pLIZJ.LJFF.remove(value);
        }
    }
}
