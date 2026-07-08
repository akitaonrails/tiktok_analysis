package com.ss.android.ugc.aweme.ecommerce.search.entrance.api;

import X.C1499810p8F;
import X.C1AF0;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ecommerce.search.entrance.api.EcSearchEntranceConfigApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class EcSearchEntranceConfigPreload implements InterfaceC727570SgN<EcSearchEntranceConfigApi.RealApi, n> {
    public static final int $stable = 0;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 5000, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public n preload2(Bundle bundle, Function1<? super Class<EcSearchEntranceConfigApi.RealApi>, ? extends EcSearchEntranceConfigApi.RealApi> function1) {
        String string;
        if (bundle != null && (string = bundle.getString("source")) != null) {
            try {
                return function1.invoke(EcSearchEntranceConfigApi.RealApi.class).fetchEcSearchEntranceConfig(string).get();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                return new n();
            }
        }
        C1AF0.LIZJ("EcSearchEntranceConfigPreload preload with empty source");
        return new n();
    }
}
