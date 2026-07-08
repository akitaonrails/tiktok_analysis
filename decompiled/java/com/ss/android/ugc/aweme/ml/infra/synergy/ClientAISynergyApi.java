package com.ss.android.ugc.aweme.ml.infra.synergy;

import X.C01GW;
import X.C0X9S;
import X.C452501pT;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class ClientAISynergyApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(96));

    public interface ClientAISynergyService {
        @InterfaceC1501170pAR("/tiktok_client_ai/inference/callback/v1")
        @InterfaceC1501310pAf({"Content-Type: application/json; charset=utf-8"})
        C0X9S<ReportAndCallbackResponse> pollCloudResults(@InterfaceC1485405rg CallBackRequestParams callBackRequestParams);

        @InterfaceC1501170pAR("/tiktok_client_ai/inference/report/v1")
        @InterfaceC1501310pAf({"Content-Type: application/json; charset=utf-8"})
        C0X9S<ReportAndCallbackResponse> report2Cloud(@InterfaceC1485405rg ReportRequestParams reportRequestParams);
    }
}
