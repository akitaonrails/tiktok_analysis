package com.ss.android.ugc.aweme.ecommerce;

import X.C1120604Zw;
import X.C1121904a9;
import X.C1331660kl2;
import X.C1332160klq;
import X.InterfaceC1329940kiG;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECBusinessInitService;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes3.dex */
public final class ECLightenInit implements IECBusinessInitService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECBusinessInitService
    public final void init() {
        C1332160klq c1332160klqLIZJ;
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LIZJ || (c1332160klqLIZJ = new InterfaceC1329940kiG() { // from class: X.0kls
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(175));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(177));
            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(176));
            public volatile C1332160klq LIZLLL;

            @Override // X.InterfaceC1329940kiG
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1329940kiG
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1329940kiG
            public final int LIZIZ() {
                return ((Boolean) this.LIZJ.getValue()).booleanValue() ? 2 : 5;
            }

            @Override // X.InterfaceC1329940kiG
            public final C1332160klq LIZJ() {
                if (this.LIZLLL == null) {
                    synchronized (this) {
                        try {
                            if (this.LIZLLL == null) {
                                C1332170klr c1332170klr = new C1332170klr((Context) this.LIZ.getValue());
                                c1332170klr.LJIJ = true;
                                c1332170klr.LJIILJJIL = false;
                                c1332170klr.LJII = Bitmap.Config.RGB_565;
                                c1332170klr.LJIIIIZZ = 5;
                                c1332170klr.LJFF = LIZIZ();
                                c1332170klr.LJIL = ((Boolean) this.LIZIZ.getValue()).booleanValue();
                                c1332170klr.LJIIJJI = true;
                                c1332170klr.LJIIIZ = true;
                                c1332170klr.LJIJJ = true;
                                c1332170klr.LJIIJ = false;
                                c1332170klr.LJIILL = true;
                                c1332170klr.LJIILLIIL = true;
                                if (Build.VERSION.SDK_INT >= 28) {
                                    c1332170klr.LJIJJLI = true;
                                }
                                this.LIZLLL = new C1332160klq(c1332170klr);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1329940kiG
            public final Context getContext() {
                return (Context) this.LIZ.getValue();
            }
        }.LIZJ()) == null) {
            return;
        }
        C1331660kl2.LJ(c1332160klqLIZJ);
    }
}
