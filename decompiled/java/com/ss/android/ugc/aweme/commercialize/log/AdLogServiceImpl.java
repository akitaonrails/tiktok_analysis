package com.ss.android.ugc.aweme.commercialize.log;

import X.C098200Yq;
import X.C1017070cZd;
import X.C189200o6;
import X.C2184171Adz;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class AdLogServiceImpl implements IAdLogService {
    @Override // com.ss.android.ugc.aweme.commercialize.log.IAdLogService
    public final void LIZ(Aweme aweme) {
        try {
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ == null) {
                return;
            }
            C2184171Adz.LIZLLL("draw_ad", "receive", awemeRawAdLJJIJLIJ).LJIIIIZZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
