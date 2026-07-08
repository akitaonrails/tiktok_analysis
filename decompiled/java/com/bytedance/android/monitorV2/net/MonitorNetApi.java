package com.bytedance.android.monitorV2.net;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174808fa;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface MonitorNetApi {
    @InterfaceC1501170pAR("/monitor_web/settings/hybrid-settings")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C0X9S<String> doPost(@InterfaceC2174808fa List<C080U> list, @InterfaceC1485405rg n nVar);
}
