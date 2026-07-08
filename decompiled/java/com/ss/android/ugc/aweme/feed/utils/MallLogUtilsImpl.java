package com.ss.android.ugc.aweme.feed.utils;

import X.C04TD;
import X.C0T1S;

/* JADX INFO: loaded from: classes13.dex */
public final class MallLogUtilsImpl implements MallLogUtilsApi {
    public static MallLogUtilsApi LIZIZ() {
        Object objLIZ = C04TD.LIZ(MallLogUtilsApi.class, false);
        if (objLIZ != null) {
            return (MallLogUtilsApi) objLIZ;
        }
        if (C04TD.B0 == null) {
            synchronized (MallLogUtilsApi.class) {
                if (C04TD.B0 == null) {
                    C04TD.B0 = new MallLogUtilsImpl();
                }
            }
        }
        return C04TD.B0;
    }

    @Override // com.ss.android.ugc.aweme.feed.utils.MallLogUtilsApi
    public final void LIZ() {
        C0T1S.LIZIZ = 0L;
        C0T1S.LIZJ = 0;
        C0T1S.LIZLLL = "";
        C0T1S.LJ = "";
        C0T1S.LJFF = 0;
        C0T1S.LJI = false;
        C0T1S.LJII = false;
        C0T1S.LJIIIIZZ = false;
        C0T1S.LJIIIZ = false;
        C0T1S.LJIIJ = false;
    }
}
