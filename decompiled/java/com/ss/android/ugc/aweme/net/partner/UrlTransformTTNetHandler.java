package com.ss.android.ugc.aweme.net.partner;

import X.C0XLM;
import X.C0XM9;
import X.C1499330p7T;
import X.C718040SEo;
import X.C792850V8h;
import X.C844470XAv;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class UrlTransformTTNetHandler implements NetworkPartner.RequestHandler {
    public static final UrlTransformTTNetHandler LIZ = new UrlTransformTTNetHandler();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        String str;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("debug_replace_http_to_https", true)) {
            return;
        }
        if (SharePrefCache.inst().getUseHttps().LIZ().booleanValue() && !Intrinsics.LJFF("vas_ad_track", c0xm9.LJIIIZ)) {
            c0xm9.LIZJ.LIZ = "https";
        }
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        C0XLM c0xlm = c0xm9.LIZJ.LJI;
        if (!a0.LJJIIZI(strLIZ, "/passport/auth/login/", false) && !a0.LJJIIZI(strLIZ, "/passport/auth/login_only/", false)) {
            if (!a0.LJJIIZI(strLIZ, "/service/settings/v2/", false) && !a0.LJJIIZI(strLIZ, "/service/settings/v3/", false)) {
                if (a0.LJJIIZI(strLIZ, "push/get_service_addrs", false)) {
                    c0xm9.LIZJ.LIZLLL(C844470XAv.LJIIIIZZ.LIZ);
                }
                if (a0.LJJIIZI(strLIZ, "/service/settings/v2", false)) {
                    if (C792850V8h.LIZ()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c0xlm.LIZIZ("googleServiceEnable", str);
                    return;
                }
                return;
            }
            c0xm9.LIZJ.LIZLLL(C844470XAv.LJIIIIZZ.LIZ);
            return;
        }
        String strLIZJ = c0xlm.LIZJ("access_token");
        if (strLIZJ != null && !a0.LJJJIL(strLIZJ)) {
            c0xlm.LJ("access_token", PatternProtector.compile(" ").matcher(strLIZJ).replaceAll("+"));
        }
    }
}
