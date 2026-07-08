package com.bytedance.ies.im.core.bridge.init.queryexp;

import X.C040I;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501330pAh;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpReqBody;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface IQueryExpApi {
    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501170pAR("im/features")
    Object queryExperiment(@C040I QueryExpReqBody queryExpReqBody, InterfaceC1364105Vn<? super QueryExpResponse> interfaceC1364105Vn);
}
