package com.ss.android.ugc.aweme.im.streak.impl.pet.exp;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;

/* JADX INFO: loaded from: classes3.dex */
public interface IQueryExpApi {
    @InterfaceC1501170pAR("im/features")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object queryExperiment(@InterfaceC1485405rg QueryExpReqBody queryExpReqBody, InterfaceC1364105Vn<? super QueryExpResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("im/features")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object queryGroupExperiment(@InterfaceC1485405rg QueryExpReqBody queryExpReqBody, InterfaceC1364105Vn<? super QueryGroupExpResponse> interfaceC1364105Vn);
}
