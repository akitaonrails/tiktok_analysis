package com.ss.android.ugc.aweme.relation.ffp.nearby.ui;

import X.C1153970g8R;
import X.C13Z4;
import X.C13ZC;
import X.C1559260qg8;
import X.C1669670tYD;
import X.C1670410tZP;
import X.C1687630u1B;
import X.C20030013Ys;
import X.C723590SZx;
import X.InterfaceC1680500tpg;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class PermissionDeniedAssem extends ConnectNowBasePage {
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C1153970g8R.class, null), checkSupervisorPrepared());

    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final void Co(C1687630u1B c1687630u1B, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(585309352);
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1670410tZP.LIZ(C1669670tYD.LIZJ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(79874435, new AwS639S0100000_25(this, 37), c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1687630u1B, i, 30);
        }
    }
}
