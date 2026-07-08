package com.ss.android.ugc.aweme.pipo.auth;

import X.C0X52;
import X.C1723240uwc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface PipoAuthApi {
    public static final C1723240uwc LIZ = C1723240uwc.LIZ;

    @InterfaceC1501170pAR("{request_path}")
    Object pipoAuth(@InterfaceC1501060pAG(encode = false, value = "request_path") String str, @InterfaceC1485405rg PipoAuthRequest pipoAuthRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<PipoAuthResponse>>> interfaceC1364105Vn);
}
