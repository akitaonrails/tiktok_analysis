package com.bytedance.android.livesdk.api.revenue.enigma;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.network.response.BaseResponse;
import tikcast.api.privilege.PrivilegeReportRequest;
import tikcast.api.privilege.PrivilegeReportResponse;
import tikcast.api.privilege.enigma.EnigmaPurchaseRequest;
import tikcast.api.privilege.enigma.EnigmaPurchaseResponse;
import tikcast.api.privilege.enigma.EnigmaToggleWearRequest;
import tikcast.api.privilege.enigma.EnigmaToggleWearResponse;
import tikcast.api.privilege.enigma.EnigmaWhisperRequest;
import tikcast.api.privilege.enigma.EnigmaWhisperResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface IEnigmaApi {
    @InterfaceC1501170pAR("/webcast/privilege/enigma/purchase_subscription/")
    C11NZ<BaseResponse<EnigmaPurchaseResponse.Data, EnigmaPurchaseResponse.Extra>> purchaseEnigma(@InterfaceC1485405rg EnigmaPurchaseRequest enigmaPurchaseRequest);

    @InterfaceC1501170pAR("/webcast/privilege/report/")
    C11NZ<PrivilegeReportResponse> reportPrivilegeCenter(@InterfaceC1485405rg PrivilegeReportRequest privilegeReportRequest);

    @InterfaceC1501170pAR("/webcast/privilege/enigma/whisper/")
    C11NZ<C470590Icr<EnigmaWhisperResponse.Data>> sendWhisperMessage(@InterfaceC1485405rg EnigmaWhisperRequest enigmaWhisperRequest);

    @InterfaceC1501170pAR("/webcast/privilege/enigma/toggle_wear/")
    C11NZ<EnigmaToggleWearResponse> toggleWear(@InterfaceC1485405rg EnigmaToggleWearRequest enigmaToggleWearRequest);
}
