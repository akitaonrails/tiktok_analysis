package com.ss.android.ugc.aweme;

import X.C04TD;
import X.C2277881EDy;
import X.EnumC1254690ikt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: loaded from: classes25.dex */
public class PreloadApiServiceImpl implements IPreloadApiService {
    public static IPreloadApiService LIZJ() {
        Object objLIZ = C04TD.LIZ(IPreloadApiService.class, false);
        if (objLIZ != null) {
            return (IPreloadApiService) objLIZ;
        }
        if (C04TD.LJJLJ == null) {
            synchronized (IPreloadApiService.class) {
                if (C04TD.LJJLJ == null) {
                    C04TD.LJJLJ = new PreloadApiServiceImpl();
                }
            }
        }
        return C04TD.LJJLJ;
    }

    @Override // com.ss.android.ugc.aweme.IPreloadApiService
    public final void LIZIZ(Aweme aweme, String str) {
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        c2277881EDy.queryUserResponse(c2277881EDy.userUrl(null, AwemeExtKt.getAuthorUid(aweme), null, 0, EnumC1254690ikt.OTHER_OLD), true, str);
    }

    @Override // com.ss.android.ugc.aweme.IPreloadApiService
    public final void LIZ(String str, String str2, String str3) {
        C2277881EDy.LIZIZ.queryAwemeWithID(true, str, str2, 0, 0L, 20, str3, 0, 0);
    }
}
