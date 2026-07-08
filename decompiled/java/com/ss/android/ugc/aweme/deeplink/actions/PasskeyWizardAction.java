package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class PasskeyWizardAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        if (!((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LIZJ()) {
            ((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIILLIIL(true);
            return new Pair<>("aweme://main", map);
        }
        map.putAll(((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIIJJI());
        return new Pair<>("//account/login/flow/common", map);
    }
}
