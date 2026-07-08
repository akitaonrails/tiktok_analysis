package com.ss.android.ugc.aweme.crossplatform.business;

import X.C1027990crF;
import X.C1041550dD7;
import X.C1041660dDI;
import X.C1968907nT;
import X.C786410Ut5;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

/* JADX INFO: loaded from: classes17.dex */
public class XpathBusiness extends BusinessService.Business {
    public XpathBusiness(C1968907nT c1968907nT) {
        super(c1968907nT);
    }

    public void xpathDirect(C1041660dDI c1041660dDI, WebView webView) {
        if (c1041660dDI == null) {
            return;
        }
        C1041550dD7 c1041550dD7 = c1041660dDI.LIZIZ;
        long j = c1041550dD7.LL;
        String str = c1041550dD7.LLJJIJI;
        if (j > 0 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(null) && webView != null) {
            C786410Ut5.ue(webView, null);
        }
        C1027990crF.LIZ.getClass();
    }
}
