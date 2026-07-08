package com.bytedance.otis.attribution.server;

import X.AbstractC842530X3j;
import X.C092G;
import X.C11NZ;
import X.C19354310nl;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes30.dex */
public interface IAnrUploadApi {
    public static final C19354310nl LIZ = C19354310nl.LIZ;

    @C092G
    @InterfaceC1501170pAR("/api/hippo-scalpel/v1/explore/anr")
    C11NZ<String> reportAnr(@InterfaceC1501030pAD("anr_data") AbstractC842530X3j abstractC842530X3j, @InterfaceC1501030pAD("params") AbstractC842530X3j abstractC842530X3j2);

    @C092G
    @InterfaceC1501170pAR("/api/hippo-scalpel/v1/explore/anr")
    C11NZ<String> reportAnrWithFile(@InterfaceC1501030pAD("zip_file\"; filename=\"file.zip") AbstractC842530X3j abstractC842530X3j, @InterfaceC1501030pAD("anr_data") AbstractC842530X3j abstractC842530X3j2, @InterfaceC1501030pAD("params") AbstractC842530X3j abstractC842530X3j3);
}
