package com.ss.android.ugc.aweme.bullet.business;

import X.C1027990crF;
import X.C1028040crK;
import X.C1038730d8Z;
import X.C1039190d9J;
import X.C1041600dDC;
import X.C1041880dDe;
import X.C786410Ut5;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;

/* JADX INFO: loaded from: classes17.dex */
public final class XpathBusiness extends BulletBusinessService.Business {
    public XpathBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
    }

    public final void xpathDirect(WebView webView) {
        C1038730d8Z c1038730d8Z;
        long jLongValue;
        C1038730d8Z c1038730d8Z2;
        C1041880dDe c1041880dDe;
        C1028040crK c1028040crK;
        Long lLIZJ;
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        String str = null;
        if (c1041600dDC instanceof C1038730d8Z) {
            c1038730d8Z = (C1038730d8Z) c1041600dDC;
        } else {
            c1038730d8Z = null;
        }
        if (c1038730d8Z != null && (c1028040crK = c1038730d8Z.LJJLL) != null && (lLIZJ = c1028040crK.LIZJ()) != null) {
            jLongValue = lLIZJ.longValue();
        } else {
            jLongValue = 0;
        }
        C1041600dDC c1041600dDC2 = this.LIZ.LIZIZ;
        if ((c1041600dDC2 instanceof C1038730d8Z) && (c1038730d8Z2 = (C1038730d8Z) c1041600dDC2) != null && (c1041880dDe = c1038730d8Z2.LJLLJ) != null) {
            str = (String) c1041880dDe.LIZJ();
        }
        if (jLongValue > 0 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty("") && webView != null) {
            C786410Ut5.ue(webView, "");
        }
        C1027990crF.LIZ.getClass();
    }
}
