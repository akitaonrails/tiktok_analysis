package com.ss.android.ugc.aweme.login;

import X.AbstractC1387200mCc;
import X.C1436005ji;
import X.C1440005kM;
import X.C1906580ziK;
import X.C19276710bF;
import X.InterfaceC1711206n0;
import android.os.Bundle;
import androidx.fragment.app.SAFTikTokFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginUtilsService implements ILoginUtilsService {
    @Override // com.ss.android.ugc.aweme.login.ILoginUtilsService
    public final void LIZ(Bundle bundle) {
        C19276710bF.LJ(bundle);
    }

    @Override // com.ss.android.ugc.aweme.login.ILoginUtilsService
    public final void LIZIZ(Bundle bundle) {
        SAFTikTokFragment sAFTikTokFragment;
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        for (int length = abstractC1387200mCcArrLJII.length - 1; -1 < length; length--) {
            AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[length];
            Object obj = abstractC1387200mCc.LIZ;
            if (obj instanceof InterfaceC1711206n0) {
                if ((obj instanceof SAFTikTokFragment) && (sAFTikTokFragment = (SAFTikTokFragment) obj) != null) {
                    sAFTikTokFragment.ZR();
                }
                C1440005kM.LIZIZ(new C1436005ji(bundle));
            } else {
                abstractC1387200mCc.LIZ();
            }
        }
    }
}
