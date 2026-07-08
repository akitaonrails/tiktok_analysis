package com.bytedance.pipo.googlepay.pushprovisioning.api;

import X.C0X52;
import X.C836120Wr4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;

/* JADX INFO: loaded from: classes14.dex */
public interface TokenizeCardApi {
    public static final C836120Wr4 LIZ = C836120Wr4.LIZ;

    @InterfaceC1501170pAR("/wallet_home/v1/web/ttcard/get_ephemeral_key")
    Object getEphermeralKey(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg CreateEphemeralKeyRequest createEphemeralKeyRequest, InterfaceC1364105Vn<? super C0X52<EphemeralKeyResponse>> interfaceC1364105Vn);
}
