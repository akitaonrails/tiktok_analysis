package com.ss.android.ugc.aweme.inbox.banner;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0PEM;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C624360OeI;
import X.C637060Oym;
import X.EnumC1599580rjA;
import X.EnumC637310OzB;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes10.dex */
public abstract class InboxBannerAssem extends AbstractC738140SxQ {
    public final C2252321DDq LL = C1BNE.LIZ(new Pair(EnumC637310OzB.INIT, null));
    public final C01GW LLILLJJLI;
    public final long LLILLL;

    public void bo(EnumC1599580rjA enumC1599580rjA) {
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void mo243do(C637060Oym c637060Oym) {
    }

    public void fo() {
    }

    public InboxBannerAssem() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1710));
        this.LLILLJJLI = c01gwLIZIZ;
        this.LLILLL = ((Number) c01gwLIZIZ.getValue()).longValue();
    }

    @Override // X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        long jLongValue = ((Number) this.LLILLJJLI.getValue()).longValue();
        long j = this.LLILLL;
        if (jLongValue > j) {
            jLongValue = j;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C624360OeI(jLongValue, this, null), 2);
    }
}
