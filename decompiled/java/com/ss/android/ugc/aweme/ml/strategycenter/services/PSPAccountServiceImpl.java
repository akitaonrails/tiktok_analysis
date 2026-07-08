package com.ss.android.ugc.aweme.ml.strategycenter.services;

import X.C829920Wh4;
import X.InterfaceC586170Myt;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tiktok.strategycenterengine.account.IPSPAccountService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class PSPAccountServiceImpl implements IPSPAccountService {
    public final IAccountService LIZ = (IAccountService) ServiceManager.get().getService(IAccountService.class);

    @Override // com.tiktok.strategycenterengine.account.IPSPAccountService
    public final String LIZ() {
        return this.LIZ.LJIIJ().getCurUserId();
    }

    @Override // com.tiktok.strategycenterengine.account.IPSPAccountService
    public final void LIZIZ(final C829920Wh4 c829920Wh4) {
        this.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.05I3
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid;
                Function2<Boolean, String, Unit> function2 = c829920Wh4;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (user == null || (uid = user.getUid()) == null) {
                    uid = CardStruct.IStatusCode.DEFAULT;
                }
                function2.invoke(boolValueOf, uid);
            }
        });
    }
}
