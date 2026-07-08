package com.ss.android.ugc.aweme.bullet.business;

import X.C015P;
import X.C1039060d96;
import X.C1039190d9J;
import X.C1041600dDC;
import X.C1075270e5V;
import X.C1075310e5Z;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1377850lxX;
import X.C20684815ws;
import X.C621180OYa;
import X.C746350TPl;
import X.C786410Ut5;
import X.InterfaceC1366490lfD;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public final class ShareBusiness extends AbsShareBusiness {
    public WebView LJII;

    @Override // com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness
    public final void LIZJ() {
        Object objLIZJ;
        Bundle bundle;
        Activity activity = this.LIZ.getActivity();
        if (activity == null || this.LIZJ == null) {
            return;
        }
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        String str = null;
        C1039060d96 c1039060d96 = c1041600dDC instanceof C1039060d96 ? (C1039060d96) c1041600dDC : null;
        HashMap map = new HashMap();
        map.put("enter_from", "h5_page");
        if (c1039060d96 == null || (objLIZJ = c1039060d96.LJJJLL.LIZJ()) == null) {
            objLIZJ = "";
        }
        map.put("previous_page", objLIZJ);
        map.put("scene_id", "1004");
        C20684815ws.LJIILLIIL("h5_click_more_button", map);
        C1371600lnS c1371600lnS = new C1371600lnS();
        WebSharePackage webSharePackage = this.LIZJ;
        if (webSharePackage != null) {
            ShareDependService.LIZ.getClass();
            ImChannel imChannelLJJJIL = ShareDependServiceImpl.LJJJJI().LJJJIL(webSharePackage, "");
            if (imChannelLJJJIL != null) {
                c1371600lnS.LIZIZ(imChannelLJJJIL);
                C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activity, true);
                c1371600lnS.LJJIIJ = webSharePackage;
                c1371600lnS.LJJIIJZLJL = true;
            }
        }
        String host = UriProtector.parse(this.LJ).getHost();
        ArrayList arrayList = new ArrayList(new ArrayList());
        arrayList.addAll(C746350TPl.LIZ.LJIIJ().LIZ());
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (C015P.LIZ(host, (String) it2.next())) {
                if (!this.LJFF) {
                    break;
                }
            }
        }
        c1371600lnS.LJIILLIIL = true;
        if (((ArrayList) this.LIZLLL).contains("copylink")) {
            c1371600lnS.LIZJ(new C1377850lxX("fromWeb", true));
        }
        if (((ArrayList) this.LIZLLL).contains("refresh")) {
            c1371600lnS.LIZJ(new C1075310e5Z(null, null, this.LJII, 3));
        }
        if (((ArrayList) this.LIZLLL).contains("browser")) {
            c1371600lnS.LIZJ(new C1075270e5V());
        }
        c1371600lnS.LJIIZILJ = true;
        WebSharePackage webSharePackage2 = this.LIZJ;
        if (webSharePackage2 != null && (bundle = webSharePackage2.extras) != null) {
            if (c1039060d96 != null && (str = (String) c1039060d96.LJJJJZI.LIZJ()) == null) {
                str = "";
            }
            C786410Ut5.LJJJI("aweme_id", str, bundle);
        }
        c1371600lnS.LJJIL = new InterfaceC1366490lfD() { // from class: X.0e5K
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
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJII(activity, new C1371590lnR(c1371600lnS), null);
    }

    public ShareBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
    }
}
