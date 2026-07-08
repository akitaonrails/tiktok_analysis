package com.ss.android.ugc.aweme.service;

import X.AbstractC19484711Kz;
import X.AnonymousClass1440;
import X.C0CQT;
import X.C11S5;
import X.C19260310Wr;
import X.InterfaceC19260210Wq;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.UgCommonResponse;
import com.ss.android.ugc.aweme.UgCommonResponseExtra;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes29.dex */
public final class AttributionService implements IAttributionService {
    @Override // com.ss.android.ugc.aweme.service.IAttributionService
    public final AbstractC19484711Kz<UgCommonResponse> LIZ(C19260310Wr c19260310Wr, boolean z) {
        if (c19260310Wr != null) {
            InterfaceC19260210Wq interfaceC19260210Wq = (InterfaceC19260210Wq) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC19260210Wq.class);
            String str = c19260310Wr.LIZJ;
            String str2 = c19260310Wr.LIZIZ;
            String str3 = c19260310Wr.LIZ;
            String str4 = c19260310Wr.LJ;
            String str5 = c19260310Wr.LIZLLL;
            String str6 = c19260310Wr.LJFF;
            String str7 = c19260310Wr.LJI;
            String str8 = c19260310Wr.LJII;
            String strLIZJ = AnonymousClass1440.LIZJ();
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            return interfaceC19260210Wq.LIZ(str, str2, str3, str4, str5, str6, str7, str8, z ? 1 : 0, strLIZJ).LJJIJIIJI(C11S5.LIZ());
        }
        return AbstractC19484711Kz.LJIJJLI(new UgCommonResponse(-1, new UgCommonResponseExtra("request canceled")));
    }
}
