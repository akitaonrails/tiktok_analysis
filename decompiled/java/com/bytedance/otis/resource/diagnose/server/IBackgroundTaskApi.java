package com.bytedance.otis.resource.diagnose.server;

import X.C080U;
import X.C11NZ;
import X.C1C8X;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface IBackgroundTaskApi {
    public static final C1C8X LIZ = C1C8X.LIZ;

    @InterfaceC1501170pAR("/hippo/diagnosis/api/v1/explore/backgroundTask")
    C11NZ<String> reportBackgroundTask(@InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC1501170pAR("/hippo/diagnosis/api/v1/explore/cpu")
    C11NZ<String> reportCPUInfo(@InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list);
}
