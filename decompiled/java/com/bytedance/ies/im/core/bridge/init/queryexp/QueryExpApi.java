package com.bytedance.ies.im.core.bridge.init.queryexp;

import X.C040I;
import X.C1477305qN;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501330pAh;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpReqBody;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.QueryExpResponse;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes5.dex */
public final class QueryExpApi implements IQueryExpApi {
    public static final QueryExpApi LIZIZ = new QueryExpApi();
    public final /* synthetic */ IQueryExpApi LIZ = (IQueryExpApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1477305qN.LIZJ).build().retrofit.LIZ(IQueryExpApi.class);

    @Override // com.bytedance.ies.im.core.bridge.init.queryexp.IQueryExpApi
    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501170pAR("im/features")
    public Object queryExperiment(@C040I QueryExpReqBody queryExpReqBody, InterfaceC1364105Vn<? super QueryExpResponse> interfaceC1364105Vn) {
        return this.LIZ.queryExperiment(queryExpReqBody, interfaceC1364105Vn);
    }
}
