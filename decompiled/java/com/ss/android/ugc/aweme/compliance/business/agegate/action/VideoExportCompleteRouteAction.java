package com.ss.android.ugc.aweme.compliance.business.agegate.action;

import X.C0XQZ;
import X.C2214201BlK;
import X.C844470XAv;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class VideoExportCompleteRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "is_kids_mode");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                C0XQZ.LIZIZ(false);
                C0XQZ.LIZJ(false);
                C0XQZ.LIZJ(false);
                Context contextLJFF = C2214201BlK.LJFF();
                if (contextLJFF == null) {
                    C844470XAv.LIZ.getClass();
                    contextLJFF = C844470XAv.LIZ();
                }
                ComplianceServiceProvider.LJII().LJJI(contextLJFF);
                ShareService shareService = (ShareService) ServiceManager.get().getService(ShareService.class);
                C844470XAv.LIZ.getClass();
                shareService.LJIILLIIL(C844470XAv.LIZ(), true);
            } else {
                IAgeGateService iAgeGateServiceLIZLLL = ComplianceServiceProvider.LIZLLL();
                String strLIZIZ = iAgeGateServiceLIZLLL.LIZIZ();
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                iAgeGateServiceLIZLLL.LJIIIZ(strLIZIZ);
                ShareService shareService2 = (ShareService) ServiceManager.get().getService(ShareService.class);
                C844470XAv.LIZ.getClass();
                shareService2.LJIILLIIL(C844470XAv.LIZ(), false);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
