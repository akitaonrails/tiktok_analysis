package com.ss.android.ugc.aweme.tako.common.router;

import X.AbstractC1864010ybf;
import X.C07CP;
import X.C14EG;
import X.C1864020ybg;
import X.C20233814Fc;
import X.C20269114Sr;
import X.C2189821An6;
import X.EnumC1864410ycJ;
import X.InterfaceC19395910uT;
import X.InterfaceC19396010uU;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.router.ITakoRouterService;
import com.ss.android.ugc.aweme.tako.router.model.TakoChatContainerData;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoRouterServiceImpl implements ITakoRouterService {
    @Override // com.ss.android.ugc.aweme.tako.router.ITakoRouterService
    public final void LIZ(Context context, AbstractC1864010ybf abstractC1864010ybf) {
        C1864020ybg.LIZ.getClass();
        C1864020ybg.LJIILIIL(context, abstractC1864010ybf);
    }

    @Override // com.ss.android.ugc.aweme.tako.router.ITakoRouterService
    public final void LIZIZ(Context context, Aweme aweme, C2189821An6 c2189821An6, String str, Long l, String str2, String str3, EnumC1864410ycJ enumC1864410ycJ, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT, Map<String, String> map, Map<String, String> map2, String str4) {
        boolean z;
        C20269114Sr c20269114Sr = C20269114Sr.LIZ;
        if (context != null) {
            if (str3 == null) {
                str3 = "";
            }
            C14EG c14egLIZ = C20269114Sr.LIZ(c20269114Sr, aweme, c2189821An6, str, l, str4, str2, Collections.singletonList(str3), null, enumC1864410ycJ, interfaceC19396010uU, interfaceC19395910uT, null, null, map, null, map2, null, null, 405888);
            c14egLIZ.LIZLLL(new AwS609S0100000_30(aweme, 51));
            TakoChatContainerData takoChatContainerData = c14egLIZ.LJI;
            if (C07CP.LIZ() && C20233814Fc.LIZ().feedIconSafEnable) {
                z = true;
            } else {
                z = false;
            }
            takoChatContainerData.setOpenBySAF(Boolean.valueOf(z));
            c14egLIZ.LJII(context);
        }
    }
}
