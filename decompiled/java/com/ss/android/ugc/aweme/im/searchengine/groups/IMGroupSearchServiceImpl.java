package com.ss.android.ugc.aweme.im.searchengine.groups;

import X.C1240440iNu;
import X.C2296808zG;
import X.C316470Car;
import X.C461720I8s;
import X.C689060R1c;
import com.ss.android.ugc.aweme.im.search.api.IMSearchApi;
import com.ss.android.ugc.aweme.im.search.api.service.IIMGroupSearchService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class IMGroupSearchServiceImpl implements IIMGroupSearchService {
    public String LIZ;
    public C1240440iNu LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.search.api.service.IIMGroupSearchService
    public final Object LIZ(String str, C316470Car c316470Car) {
        IMSearchApi.LIZ.getClass();
        C689060R1c.LIZ().LIZIZ().LIZJ(C2296808zG.LIZ(c316470Car.getContext()));
        String strLIZIZ = C461720I8s.LIZIZ();
        C1240440iNu c1240440iNu = this.LIZIZ;
        if (c1240440iNu == null || !Intrinsics.LJFF(strLIZIZ, this.LIZ)) {
            c1240440iNu = new C1240440iNu(0);
            this.LIZIZ = c1240440iNu;
            this.LIZ = strLIZIZ;
        }
        return c1240440iNu.LIZJ(str, c316470Car);
    }
}
