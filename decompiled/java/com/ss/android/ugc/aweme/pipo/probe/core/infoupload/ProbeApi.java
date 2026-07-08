package com.ss.android.ugc.aweme.pipo.probe.core.infoupload;

import X.C067G;
import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes3.dex */
public interface ProbeApi {
    public static final C067G LIZ = C067G.LIZ;

    @InterfaceC1501170pAR("/security/v1/psd/sample_info")
    Object riskAssessment(@InterfaceC1485405rg ProbeUploadRequest probeUploadRequest, InterfaceC1364105Vn<? super C0X52<ProbeUploadResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/security/v1/psd/sample_info")
    Object uploadInfos(@InterfaceC1485405rg ProbeUploadRequest probeUploadRequest, InterfaceC1364105Vn<? super C0X52<ProbeUploadResponse>> interfaceC1364105Vn);
}
