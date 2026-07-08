package com.ss.android.ugc.aweme.deeplink.tracker;

import X.C10Y1;
import X.C19264110Yd;
import X.C295460Bi4;
import X.C823050WQl;
import Y.ARunnableS104S0100000_4;
import com.bytedance.deeplink.glue.LinkPhase;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService;

/* JADX INFO: loaded from: classes29.dex */
public final class DeeplinkTrackingServiceImpl implements IDeeplinkTrackingService {
    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService
    public final void LIZ() {
        C10Y1 c10y1LIZ = C19264110Yd.LIZ();
        c10y1LIZ.getClass();
        if (C295460Bi4.LIZ()) {
            C823050WQl.LIZJ().execute(new ARunnableS104S0100000_4(c10y1LIZ, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService
    public final String LJ() {
        C10Y1 c10y1LIZ = C19264110Yd.LIZ();
        c10y1LIZ.getClass();
        return !C295460Bi4.LIZ() ? "" : c10y1LIZ.LIZJ.get("tracking_id");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService
    public final boolean isEnable() {
        return C295460Bi4.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService
    public final void LIZIZ(String str) {
        C10Y1 c10y1LIZ = C19264110Yd.LIZ();
        c10y1LIZ.getClass();
        if (C295460Bi4.LIZ()) {
            c10y1LIZ.LIZJ.put("target_page", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService
    public final void LIZJ(LinkPhase linkPhase) {
        C19264110Yd.LIZ().LIZJ(linkPhase);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService
    public final void LIZLLL(LinkPhase linkPhase, long j) {
        C10Y1 c10y1LIZ = C19264110Yd.LIZ();
        c10y1LIZ.getClass();
        if (C295460Bi4.LIZ()) {
            String mobKey = linkPhase.getMobKey();
            if (c10y1LIZ.LIZIZ.get(mobKey) != null) {
                c10y1LIZ.LIZIZ.put(mobKey, Long.valueOf(j));
            } else {
                c10y1LIZ.LIZIZ.put(mobKey, Long.valueOf(j));
            }
        }
    }
}
