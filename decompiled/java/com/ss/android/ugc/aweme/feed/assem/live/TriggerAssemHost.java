package com.ss.android.ugc.aweme.feed.assem.live;

import X.C01GW;
import X.C11NJ;
import X.C11NZ;
import X.C452501pT;
import Y.AfS180S0100000_11;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TriggerAssemHost implements ITriggerAssemHost {
    public final C11NJ LL = new C11NJ();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(92));

    @Override // com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost
    public final void LLLILZ(Function1<? super String, Unit> function1) {
        this.LL.LJ();
        this.LL.LIZ(((C11NZ) this.LLILLJJLI.getValue()).LJJLJLI(new AfS180S0100000_11((AwS590S0100000_11) function1, 1)));
    }
}
