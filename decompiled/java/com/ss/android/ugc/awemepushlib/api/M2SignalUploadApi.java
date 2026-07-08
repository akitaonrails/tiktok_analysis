package com.ss.android.ugc.awemepushlib.api;

import X.C11NZ;
import X.C1366305Wj;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.google.gson.n;
import com.ss.android.ugc.awemepushlib.model.M2SignalUploadResp;

/* JADX INFO: loaded from: classes3.dex */
public interface M2SignalUploadApi {
    public static final C1366305Wj LIZ = C1366305Wj.LIZ;

    @InterfaceC1501170pAR("/cloudpush/m2_guide")
    @InterfaceC1501310pAf({"Content-Type: application/json; charset=utf-8"})
    C11NZ<M2SignalUploadResp> doUploadSignals(@InterfaceC1485405rg n nVar);
}
