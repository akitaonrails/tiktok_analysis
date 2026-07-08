package com.ss.android.ugc.aweme.account.experiment;

import X.C08EH;
import X.C0XQ7;
import X.C0XW1;
import X.C1873680yrG;
import X.C19EG;
import X.C848230XPh;
import X.C854760Xg2;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class MultiAccountService implements IMultiAccountService {
    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final void LIZ() {
        C0XQ7.LIZJ().uploadAccountNum(false);
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final boolean LIZLLL() {
        C848230XPh.LL.getClass();
        UserStore.LIZ.getClass();
        List<String> listLIZIZ = UserStore.LIZIZ();
        ArrayList arrayList = new ArrayList();
        for (String str : listLIZIZ) {
            C848230XPh.LL.getClass();
            SignificantUserInfo significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(str);
            if (significantUserInfoLJIIJJI != null) {
                arrayList.add(significantUserInfoLJIIJJI);
            }
        }
        return arrayList.size() >= 8;
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final String LJ() {
        return C08EH.LIZ().getString(2131825106, 8);
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final void LIZJ(C19EG c19eg, String str, String str2, Bundle bundle, C1873680yrG c1873680yrG) {
        C0XW1.LIZ(c19eg, str, str2, bundle, new C854760Xg2(c1873680yrG, 2));
    }
}
