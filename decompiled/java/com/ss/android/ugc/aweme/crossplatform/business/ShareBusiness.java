package com.ss.android.ugc.aweme.crossplatform.business;

import X.C015P;
import X.C1075270e5V;
import X.C1075310e5Z;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1377850lxX;
import X.C1388190mED;
import X.C1968907nT;
import X.C1D0F;
import X.C20684815ws;
import X.C2214201BlK;
import X.C621180OYa;
import X.C746350TPl;
import X.C786410Ut5;
import X.InterfaceC1366490lfD;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public final class ShareBusiness extends AbsShareBusiness {
    @Override // com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness
    public final void LIZJ() {
        String strLIZ;
        if ((this.LIZJ instanceof Activity) && this.LIZLLL != null) {
            HashMap map = new HashMap();
            map.put("enter_from", "h5_page");
            map.put("previous_page", this.LIZIZ.LIZ.LJ);
            map.put("scene_id", "1004");
            C1D0F c1d0f = C1D0F.LIZ;
            if (c1d0f == null || (strLIZ = c1d0f.LIZ()) == null) {
                strLIZ = "";
            }
            map.put(strLIZ, String.valueOf(c1d0f != null ? Boolean.valueOf(c1d0f.isConnected()) : null));
            C20684815ws.LJIILLIIL("h5_click_more_button", map);
            C1371600lnS c1371600lnS = new C1371600lnS();
            ShareDependService.LIZ.getClass();
            ImChannel imChannelLJJJIL = ShareDependServiceImpl.LJJJJI().LJJJIL(this.LIZLLL, "");
            if (imChannelLJJJIL != null) {
                c1371600lnS.LIZIZ(imChannelLJJJIL);
            }
            C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, C1388190mED.LIZ(this.LIZJ), true);
            c1371600lnS.LJJIIJ = this.LIZLLL;
            c1371600lnS.LJJIIJZLJL = true;
            String host = UriProtector.parse(this.LJI).getHost();
            ArrayList arrayList = new ArrayList(new ArrayList());
            arrayList.addAll(C746350TPl.LIZ.LJIIJ().LIZ());
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (C015P.LIZ(host, (String) it2.next())) {
                    if (!this.LIZ.LJI()) {
                        break;
                    }
                }
            }
            c1371600lnS.LJIILLIIL = true;
            if (((ArrayList) this.LJ).contains("copylink")) {
                c1371600lnS.LIZJ(new C1377850lxX("fromWeb", true));
            }
            if (((ArrayList) this.LJ).contains("refresh")) {
                c1371600lnS.LIZJ(new C1075310e5Z(this.LIZ, null, null, 6));
            }
            if (((ArrayList) this.LJ).contains("browser")) {
                c1371600lnS.LIZJ(new C1075270e5V());
            }
            c1371600lnS.LJIIZILJ = true;
            C786410Ut5.LJJJI("aweme_id", this.LIZIZ.LIZ.LJI, this.LIZLLL.extras);
            c1371600lnS.LJJIL = new InterfaceC1366490lfD() { // from class: X.0e5L
                @Override // X.InterfaceC1366490lfD
                public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJ(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJI(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                    if (interfaceC1370310llN instanceof C1377850lxX) {
                        ShareBusiness shareBusiness = this.LIZ;
                        interfaceC1370310llN.getClass();
                        shareBusiness.LIZIZ("copy");
                    }
                }

                @Override // X.InterfaceC1361850lXj
                public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                    this.LIZ.LIZIZ(interfaceC1369790lkX.key());
                }

                @Override // X.InterfaceC1361850lXj
                public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Unit unit = Unit.LIZ;
                    C099R.LJFF();
                    return unit;
                }
            };
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF == null || activityLJFF.isFinishing()) {
                return;
            }
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJII(activityLJFF, new C1371590lnR(c1371600lnS), null);
        }
    }

    public ShareBusiness(C1968907nT c1968907nT) {
        super(c1968907nT);
    }
}
