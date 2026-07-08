package com.ss.android.ugc.aweme.im.streak.impl.pet.exp;

import X.C1477305qN;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class QueryExpApi implements IQueryExpApi {
    public static final QueryExpApi LIZIZ = new QueryExpApi();
    public final /* synthetic */ IQueryExpApi LIZ = (IQueryExpApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1477305qN.LIZJ).build().retrofit.LIZ(IQueryExpApi.class);

    @Override // com.ss.android.ugc.aweme.im.streak.impl.pet.exp.IQueryExpApi
    @InterfaceC1501170pAR("im/features")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    public Object queryExperiment(@InterfaceC1485405rg QueryExpReqBody queryExpReqBody, InterfaceC1364105Vn<? super QueryExpResponse> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137875);
        Object objQueryExperiment = this.LIZ.queryExperiment(queryExpReqBody, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objQueryExperiment;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.impl.pet.exp.IQueryExpApi
    @InterfaceC1501170pAR("im/features")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    public Object queryGroupExperiment(@InterfaceC1485405rg QueryExpReqBody queryExpReqBody, InterfaceC1364105Vn<? super QueryGroupExpResponse> interfaceC1364105Vn) {
        return this.LIZ.queryGroupExperiment(queryExpReqBody, interfaceC1364105Vn);
    }
}
