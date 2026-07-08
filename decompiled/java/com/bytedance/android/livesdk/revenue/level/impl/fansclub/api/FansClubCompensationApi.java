package com.bytedance.android.livesdk.revenue.level.impl.fansclub.api;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import webcast.api.fans.FansTaskOperateRequest;
import webcast.api.fans.FansTaskOperateResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface FansClubCompensationApi {
    @InterfaceC1501170pAR("/webcast/privilege/fans_task_operate/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    AbstractC19484711Kz<C470590Icr<FansTaskOperateResponse.Data>> fansTaskOperate(@InterfaceC1485405rg FansTaskOperateRequest fansTaskOperateRequest);
}
