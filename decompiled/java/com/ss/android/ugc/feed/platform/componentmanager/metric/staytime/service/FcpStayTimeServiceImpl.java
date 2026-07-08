package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.service;

import X.C18KJ;
import X.C1954807lC;
import X.C699540RcG;
import X.C704180Rjk;
import X.C708970RrT;
import X.EnumC1430380nKG;
import X.EnumC708980RrU;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import com.ss.android.ugc.feed.platform.staytime.IFcpStayTimeService;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpStayTimeServiceImpl implements IFcpStayTimeService {
    @Override // com.ss.android.ugc.feed.platform.staytime.IFcpStayTimeService
    public final void LIZIZ(String str, EnumC708980RrU enumC708980RrU) {
        int i = C708970RrT.LIZ[enumC708980RrU.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (a0.LJJIIZI(str, "capcut", false)) {
                    C18KJ.LIZ.getClass();
                    C18KJ.LIZ();
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        if (str.length() <= 0 || !a0.LJJIIZI(str, ".onelink.me", false) || !a0.LJJIIZI(String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "deep_link_value")), EnumC1430380nKG.CAPCUT.getTYPENAME(), false)) {
            return;
        }
        C18KJ.LIZ.getClass();
        C18KJ.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.staytime.IFcpStayTimeService
    public final void LIZ(Object obj, Aweme aweme, String str, String str2, Map map, Integer num) {
        FcpAwemeInfo fcpAwemeInfoLIZ;
        C704180Rjk c704180Rjk = C704180Rjk.LIZ;
        if (aweme != null) {
            fcpAwemeInfoLIZ = C699540RcG.LIZ(aweme, str2, "video");
        } else {
            fcpAwemeInfoLIZ = null;
        }
        c704180Rjk.getClass();
        C704180Rjk.LIZJ(fcpAwemeInfoLIZ, num, obj, str, "anchor", map);
    }
}
