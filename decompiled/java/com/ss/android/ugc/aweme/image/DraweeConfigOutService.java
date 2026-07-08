package com.ss.android.ugc.aweme.image;

import X.AbstractC1320720kTO;
import X.C1320820kTY;
import X.C1320860kTc;
import X.C1320870kTd;
import X.C1330560kjG;
import X.C2213981Bky;
import X.InterfaceC1320070kSL;
import com.fackbook.drawee.IDraweeConfigOutService;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public class DraweeConfigOutService implements IDraweeConfigOutService {
    @Override // com.fackbook.drawee.IDraweeConfigOutService
    public final InterfaceC1320070kSL<? extends AbstractC1320720kTO<?, ?, ?, ?>> LIZ() {
        C1320870kTd c1320870kTd = new C1320870kTd();
        C1330560kjG c1330560kjG = new C1330560kjG();
        if (c1320870kTd.LIZ == null) {
            c1320870kTd.LIZ = new HashSet();
        }
        ((HashSet) c1320870kTd.LIZ).add(c1330560kjG);
        return new C1320820kTY(C2213981Bky.LIZIZ.getApplicationContext(), new C1320860kTc(c1320870kTd));
    }
}
