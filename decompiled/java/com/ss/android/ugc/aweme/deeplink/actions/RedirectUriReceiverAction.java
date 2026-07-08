package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class RedirectUriReceiverAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "create-account-sg-singpass";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            return new Pair<>("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass-test", map);
        }
        return new Pair<>("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass", map);
    }
}
