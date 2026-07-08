package com.ss.android.ugc.aweme.commercialize.promote.logging;

import X.AbstractC1023720ckM;
import X.C1023630ckD;
import X.C2249121D1i;
import X.C2249131D1j;
import X.C2249141D1k;
import X.C2249151D1l;
import X.C2249161D1m;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class CommercePromoteLogger extends AbstractC1023720ckM implements ICommercePromoteLogger {
    public final C1023630ckD<?>[] LIZ;

    public CommercePromoteLogger() {
        super(new Object[0]);
        C2249131D1j.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C2249131D1j.LIZIZ, AFwS229S0000000_2.get$arr$(134)), new C1023630ckD<>(C2249131D1j.LIZJ, AFwS229S0000000_2.get$arr$(135)), new C1023630ckD<>(C2249131D1j.LIZLLL, AFwS283S0000000_35.get$arr$(16)), new C1023630ckD<>(C2249131D1j.LJI, AFwS283S0000000_35.get$arr$(17)), new C1023630ckD<>(C2249131D1j.LJII, AFwS283S0000000_35.get$arr$(18)), new C1023630ckD<>(C2249131D1j.LJFF, AFwS283S0000000_35.get$arr$(19)), new C1023630ckD<>(C2249131D1j.LJIIJJI, AFwS283S0000000_35.get$arr$(20)), new C1023630ckD<>(C2249131D1j.LJIILIIL, AFwS283S0000000_35.get$arr$(21))};
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger
    public final void LJIIIZ(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6) {
        LJIIIIZZ(aweme, str, str2, str3, str4, str5, str6, AFwS283S0000000_35.get$arr$(198));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger
    public final void LJIIIIZZ(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1) {
        C2249121D1i.LIZ.getClass();
        log(C2249121D1i.LIZJ, new C2249141D1k(aweme, str, str2, str3, str5, str4, str6, function1));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger
    public final void LJIIJJI(String str, Aweme aweme, String str2, String str3, String str4, String str5, String str6, Integer num) {
        LJIIJ(aweme, num, str, str2, str3, str4, str5, str6, AFwS283S0000000_35.get$arr$(22));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger
    public final void LJIJJ(Aweme aweme, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        C2249121D1i.LIZ.getClass();
        log(C2249121D1i.LIZLLL, new C2249151D1l(aweme, l, str, str2, str3, str4, str5, str6));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger
    public final void LJIIJ(Aweme aweme, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1) {
        C2249121D1i.LIZ.getClass();
        log(C2249121D1i.LIZIZ, new C2249161D1m(aweme, num, str, str2, str3, str5, str4, str6, function1));
    }
}
