package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.service;

import X.C098200Yq;
import X.C0IIC;
import X.C0IJH;
import X.C189200o6;
import X.C288780BTo;
import X.C687700QyG;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.service.ISeaLiveService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaLiveService implements ISeaLiveService {
    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.sea.service.ISeaLiveService
    public final C0IIC LIZ(Fragment fragment, C0IJH c0ijh) {
        SeaLiveDiProvider seaLiveDiProvider = new SeaLiveDiProvider(fragment, c0ijh);
        try {
            if (C288780BTo.LIZ()) {
                C687700QyG.LJIIIIZZ(seaLiveDiProvider);
                return seaLiveDiProvider;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
