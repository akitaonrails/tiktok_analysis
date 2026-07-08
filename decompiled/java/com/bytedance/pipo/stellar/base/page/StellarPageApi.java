package com.bytedance.pipo.stellar.base.page;

import X.C0X52;
import X.C1719710uqv;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface StellarPageApi {
    public static final C1719710uqv LIZ = C1719710uqv.LIZ;

    @InterfaceC1501170pAR("{request_path}")
    Object getPageData(@InterfaceC1501060pAG(encode = false, value = "request_path") String str, @InterfaceC1501350pAj("pipo-fp-session-id") String str2, @InterfaceC1485405rg StellarPageRequestWrapper stellarPageRequestWrapper, InterfaceC1364105Vn<? super C0X52<BaseResponse<StellarChunk>>> interfaceC1364105Vn);
}
