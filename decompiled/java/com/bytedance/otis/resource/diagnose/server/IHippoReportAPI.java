package com.bytedance.otis.resource.diagnose.server;

import X.C080U;
import X.C11NZ;
import X.C1C8Y;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface IHippoReportAPI {
    public static final C1C8Y LIZ = C1C8Y.LIZ;

    @InterfaceC1501170pAR("/hippo/diagnosis/api/v1/explore/dropFrame")
    C11NZ<String> reportDropFrameInfo(@InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list);
}
