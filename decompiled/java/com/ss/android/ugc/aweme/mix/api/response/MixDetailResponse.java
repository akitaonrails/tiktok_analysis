package com.ss.android.ugc.aweme.mix.api.response;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;

/* JADX INFO: loaded from: classes19.dex */
public final class MixDetailResponse extends BaseResponse implements InterfaceC1201180hMa {
    public C1494600ozq<?> LL;

    @C09CT("is_collect")
    public boolean isCollected;

    @C09CT("mix")
    public MixStruct mixDetail;

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq<?> getRequestInfo() {
        return this.LL;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        if (c1494600ozq != null) {
            this.LL = c1494600ozq;
        }
    }
}
