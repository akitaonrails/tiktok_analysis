package com.ss.android.ugc.aweme.recommend.users;

import X.C2222691Bz1;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;

/* JADX INFO: loaded from: classes29.dex */
public final class IRecommendUsersDependentServiceImpl implements IRecommendUsersDependentService {
    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final boolean LIZ() {
        if (!TextUtils.isEmpty(C2222691Bz1.LJ())) {
            C2222691Bz1 c2222691Bz1 = C2222691Bz1.LIZ;
            String strLJ = C2222691Bz1.LJ();
            c2222691Bz1.getClass();
            return !C2222691Bz1.LJII(strLJ);
        }
        if (TextUtils.isEmpty(C2222691Bz1.LIZIZ())) {
            return !SharePrefCache.inst().getIsEuropeCountry().LIZ().booleanValue();
        }
        C2222691Bz1 c2222691Bz12 = C2222691Bz1.LIZ;
        String strLIZIZ = C2222691Bz1.LIZIZ();
        c2222691Bz12.getClass();
        return !C2222691Bz1.LJII(strLIZIZ);
    }
}
