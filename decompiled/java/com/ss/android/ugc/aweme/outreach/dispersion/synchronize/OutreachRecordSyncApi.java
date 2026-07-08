package com.ss.android.ugc.aweme.outreach.dispersion.synchronize;

import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordResponseModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSyncRequestParams;
import com.ss.android.ugc.aweme.outreach.dispersion.synchronize.SyncAPI;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecordSyncApi implements SyncAPI.IRecordSyncApi {
    public static final OutreachRecordSyncApi LIZIZ = new OutreachRecordSyncApi();
    public final /* synthetic */ SyncAPI.IRecordSyncApi LIZ;

    @Override // com.ss.android.ugc.aweme.outreach.dispersion.synchronize.SyncAPI.IRecordSyncApi
    @InterfaceC1501170pAR("tiktok/v1/outreach/record/sync")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    public ListenableFuture<OutreachRecordResponseModel> recordSync(@InterfaceC1485405rg OutreachRecordSyncRequestParams outreachRecordSyncRequestParams) {
        return this.LIZ.recordSync(outreachRecordSyncRequestParams);
    }

    public OutreachRecordSyncApi() {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        SyncAPI.LIZ.getClass();
        this.LIZ = (SyncAPI.IRecordSyncApi) iRetrofitFactory.LIZ(SyncAPI.LIZIZ).create(SyncAPI.IRecordSyncApi.class);
    }
}
