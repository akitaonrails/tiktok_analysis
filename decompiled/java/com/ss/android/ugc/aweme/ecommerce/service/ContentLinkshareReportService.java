package com.ss.android.ugc.aweme.ecommerce.service;

import X.C0C64;
import X.C0PEM;
import X.C1365605Wc;
import X.C23250099c;
import X.C786410Ut5;
import X.C817503Hh;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentLinkshareReportService implements IContentLinkshareReportService {
    public static String LIZIZ(Uri uri) {
        String strJ3 = null;
        if (!UriProtector.getQueryParameterNames(uri).contains("chain_key")) {
            return null;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chain_key");
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            try {
                strJ3 = C786410Ut5.J3(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                return strJ3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return strJ3;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IContentLinkshareReportService
    public final void LIZ(String str) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_content_linkshare_chain_key_report_enable", true, true)) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1365605Wc(this, str, null), 2);
    }
}
