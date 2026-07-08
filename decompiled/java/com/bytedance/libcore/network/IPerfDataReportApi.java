package com.bytedance.libcore.network;

import X.C080U;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IPerfDataReportApi {
    @InterfaceC1501170pAR("/atom/api/v1/perf")
    C11NZ<String> reportPerfData(@InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list);
}
