package com.ss.android.ugc.aweme.crossplatform.business;

import X.C1075140e5I;
import X.C1075190e5N;
import X.C1075260e5U;
import X.C1075310e5Z;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1388190mED;
import X.C1968907nT;
import X.C2214201BlK;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1364520lc2;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingShareBusiness extends AbsShareBusiness {
    @Override // com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness
    public final void LIZJ() {
        Bundle bundle;
        if ((this.LIZJ instanceof Activity) && this.LIZLLL != null) {
            C1371600lnS c1371600lnS = new C1371600lnS();
            ShareDependService.LIZ.getClass();
            ImChannel imChannelLJJJIL = ShareDependServiceImpl.LJJJJI().LJJJIL(this.LIZLLL, "");
            if (imChannelLJJJIL != null) {
                c1371600lnS.LIZIZ(imChannelLJJJIL);
            }
            C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, C1388190mED.LIZ(this.LIZJ), true);
            WebSharePackage webSharePackage = this.LIZLLL;
            c1371600lnS.LJJIIJ = webSharePackage;
            c1371600lnS.LJJIIJZLJL = true;
            c1371600lnS.LJJIZ = new InterfaceC1364520lc2() { // from class: X.0e5G
                @Override // X.InterfaceC1364520lc2
                public final void LIZIZ(HashMap<String, String> map) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LIZLLL(HashMap<String, String> map) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJ(HashMap<String, String> map) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJFF(Dialog dialog) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJI(Dialog dialog) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJII(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJIIJJI(BaseSharePackage baseSharePackage, String str) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJIIL(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJIILIIL(BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJIIJ() {
                    ShareDependService.LIZ.getClass();
                    ShareDependServiceImpl.LJJJJI().LIZLLL();
                }

                @Override // X.InterfaceC1364520lc2
                public final void LJIIIIZZ(BaseSharePackage baseSharePackage) {
                    ShareDependService.LIZ.getClass();
                    ShareDependServiceImpl.LJJJJI().LJIIJ(this.LIZ.LIZIZ.LIZ.LJI, baseSharePackage);
                }
            };
            c1371600lnS.LJIILLIIL = true;
            C786410Ut5.LJJJI("aweme_id", this.LIZIZ.LIZ.LJI, webSharePackage.extras);
            C786410Ut5.LJJJI("current_url", this.LIZIZ.LIZIZ.LLLL, this.LIZLLL.extras);
            this.LIZLLL.extras.putInt("first_page", this.LIZIZ.LIZIZ.LLLLII);
            WebSharePackage webSharePackage2 = this.LIZLLL;
            if (webSharePackage2 != null && (bundle = webSharePackage2.extras) != null) {
                bundle.putInt("anchor_type", this.LIZIZ.LIZIZ.LLLLLJIL);
            }
            if (this.LIZIZ.LIZJ.LIZLLL) {
                c1371600lnS.LIZJ(new C1075260e5U());
            }
            if (((ArrayList) this.LJ).contains("refresh")) {
                c1371600lnS.LIZJ(new C1075310e5Z(this.LIZ, null, null, 6));
            }
            if (((ArrayList) this.LJ).contains("browser")) {
                c1371600lnS.LIZJ(new C1075190e5N());
            }
            if (((ArrayList) this.LJ).contains("copylink")) {
                c1371600lnS.LIZJ(new C1075140e5I());
            }
            c1371600lnS.LJIIZILJ = true;
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                ShareDependServiceImpl.LJJJJI().LJII(activityLJFF, new C1371590lnR(c1371600lnS), null);
            }
        }
    }

    public LandingShareBusiness(C1968907nT c1968907nT) {
        super(c1968907nT);
    }
}
