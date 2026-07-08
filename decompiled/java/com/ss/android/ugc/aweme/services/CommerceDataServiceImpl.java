package com.ss.android.ugc.aweme.services;

import X.C0CLW;
import X.C1AF0;
import X.C316660CbA;
import X.InterfaceC1029580cto;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public class CommerceDataServiceImpl implements InterfaceC1029580cto {
    @Override // X.InterfaceC1029580cto
    public boolean shouldShowCard() {
        boolean zBooleanValue = true;
        try {
            zBooleanValue = true ^ C0CLW.LIZIZ.LIZ.getShopping().getDisableCard().booleanValue();
            return zBooleanValue;
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return zBooleanValue;
        }
    }
}
