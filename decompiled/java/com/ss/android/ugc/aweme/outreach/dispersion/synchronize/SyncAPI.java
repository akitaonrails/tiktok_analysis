package com.ss.android.ugc.aweme.outreach.dispersion.synchronize;

import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordResponseModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSyncRequestParams;

/* JADX INFO: loaded from: classes32.dex */
public final class SyncAPI {
    public static final SyncAPI LIZ = new SyncAPI();
    public static final String LIZIZ;

    public interface IRecordSyncApi {
        @InterfaceC1501170pAR("tiktok/v1/outreach/record/sync")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        ListenableFuture<OutreachRecordResponseModel> recordSync(@InterfaceC1485405rg OutreachRecordSyncRequestParams outreachRecordSyncRequestParams);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
