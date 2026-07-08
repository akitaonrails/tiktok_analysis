package com.bytedance.android.livesdk.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookReq;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookResp;

/* JADX INFO: loaded from: classes.dex */
public interface LivePlayBookApi {
    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor/golive/anchor/playbook/")
    Object fetchPlayBook(@InterfaceC1485405rg GetGoLIVEAnchorPlaybookReq getGoLIVEAnchorPlaybookReq, InterfaceC1364105Vn<? super C470590Icr<GetGoLIVEAnchorPlaybookResp.Data>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor/golive/anchor/playbook/")
    C11NZ<C470590Icr<GetGoLIVEAnchorPlaybookResp.Data>> fetchPlayBookNew(@InterfaceC1485405rg GetGoLIVEAnchorPlaybookReq getGoLIVEAnchorPlaybookReq);
}
