package defpackage;

import X.C1403010mc7;
import X.C19EG;
import android.text.TextUtils;
import g3a.a;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g6 extends a {
    public final String LLIZLLLIL;
    public final String LLJ;
    public final C19EG LLJI;

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        if (TextUtils.isEmpty(this.LLIZLLLIL)) {
            C1403010mc7.LIZ.LJIIIIZZ().LIZ().LIZ(this.LLJI, null, new AwS552S0100000_8(this, 887));
            return;
        }
        String str = this.LLJ;
        if (Intrinsics.LJFF(str, "single")) {
            C1403010mc7.LIZ.LJIIIIZZ().LIZ().LJ(this.LLJI, this.LLIZLLLIL, "singlepiceffect");
            C1403010mc7.LIZ.LJIIIIZZ().LIZ().LJI(this.LLJI);
            LJIIJ();
        } else if (Intrinsics.LJFF(str, "multi")) {
            C1403010mc7.LIZ.LJIIIIZZ().LIZ().LJ(this.LLJI, this.LLIZLLLIL, "slideshoweffect");
            C1403010mc7.LIZ.LJIIIIZZ().LIZ().LJII(this.LLJI);
            LJIIJ();
        } else if (str == null) {
            C1403010mc7.LIZ.LJIIIIZZ().LIZ().LJ(this.LLJI, this.LLIZLLLIL, null);
            C1403010mc7.LIZ.LJIIIIZZ().LIZ().LIZ(this.LLJI, null, null);
            LJIIJ();
        }
    }

    public g6(C19EG c19eg, String str, String str2) {
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = c19eg;
        LJ(AFwS239S0000000_8.get$arr$(249));
    }
}
