package com.ss.android.ugc.aweme.changeregion.util;

import X.C0X52;
import X.C0XMB;
import X.C100C;
import X.C13LQ;
import X.C1494590ozp;
import X.C2097908Jt;
import X.C2188811AlT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class StoreRegionInterceptor implements InterfaceC1904907d9 {
    public static final StoreRegionInterceptor LL = new StoreRegionInterceptor();
    public static final Set<String> LLILLJJLI = C13LQ.LJLIIL(new String[]{"/passport/mobile/send_code/v1", "/passport/mobile/send_voice_code", "/passport/mobile/sms_login_only", "/passport/user/check_email_registered", "/passport/password/check", "/passport/email/send_code", "/passport/email/check_code", "/passport/auth/login", "/passport/username/register", "/passport/mobile/register", "/passport/mobile/sms_login", "/passport/mobile/sms_login_continue", "/passport/email/register", "/passport/email/register/v2", "/passport/email/register_verify", "/passport/email/register_verify_login", "/passport/app/email/register/ticket_register", "/passport/totp/register", "/passport/login_name/register", "/tiktok/v1/calculate/age", "/aweme/v3/verification/age", "/passport/app/region", "/passport/auth/only_login", "/passport/auth/login_only", "/passport/mobile/can_send_voice_code", "/passport/app/region/register_region_list", "/passport/auth/get_nonce"});

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        if (LLILLJJLI.contains(a0.LJLJJI(request.getPath().toLowerCase(Locale.ROOT), '/'))) {
            String url = request.getUrl();
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService != null) {
                String storeRegion = iPNSChangeRegionService.getStoreRegion();
                if (storeRegion != null) {
                    if (a0.LJJIIZI(url, "?", false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(url);
                        sbLIZ.append("&reg_store_region=");
                        sbLIZ.append(storeRegion);
                        url = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(url);
                        sbLIZ2.append("?reg_store_region=");
                        sbLIZ2.append(storeRegion);
                        url = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                if (iPNSChangeRegionService.LJIIJJI()) {
                    int iLJIIL = iPNSChangeRegionService.LJIIL();
                    if (a0.LJJIIZI(url, "?", false)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(url);
                        sbLIZ3.append("&user_selected_region=");
                        sbLIZ3.append(iLJIIL);
                        url = C2188811AlT.LIZIZ(sbLIZ3);
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(url);
                        sbLIZ4.append("?user_selected_region=");
                        sbLIZ4.append(iLJIIL);
                        url = C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    C100C c100c = C100C.LIZ;
                    c100c.LIZJ().LIZ("sign_up_store_region_source_client", C2097908Jt.LIZJ(new Pair("source_client", String.valueOf(iPNSChangeRegionService.LJIIL()))));
                    c100c.LIZJ().LIZ("sign_up_store_region_source_api", C2097908Jt.LIZJ(new Pair("source_client", String.valueOf(iPNSChangeRegionService.LJIILIIL()))));
                }
            }
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ(url);
            return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
        }
        return c1494590ozp.LIZ(request);
    }
}
