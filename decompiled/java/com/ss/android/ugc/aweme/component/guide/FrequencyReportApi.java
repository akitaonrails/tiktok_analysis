package com.ss.android.ugc.aweme.component.guide;

import X.C0X52;
import X.C836140Wr6;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501370pAl;

/* JADX INFO: loaded from: classes14.dex */
public interface FrequencyReportApi {
    public static final C836140Wr6 LIZ = C836140Wr6.LIZ;

    @InterfaceC1501170pAR("/wallet/v1/frequency/report")
    Object report(@InterfaceC1501370pAl("pipo-fp-session-id") String str, @InterfaceC1485405rg FrequencyReportRequest frequencyReportRequest, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn);
}
