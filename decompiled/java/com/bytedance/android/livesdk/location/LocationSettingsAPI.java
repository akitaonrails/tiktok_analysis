package com.bytedance.android.livesdk.location;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import tikcast.api.anchor.AnchorLocationSettingsReadResponse;
import tikcast.api.anchor.AnchorLocationSettingsUpdateRequest;
import tikcast.api.anchor.AnchorLocationSettingsUpdateResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface LocationSettingsAPI {
    @InterfaceC1501160pAQ("/webcast/anchor/location/settings/read/")
    Object getLocationSettings(InterfaceC1364105Vn<? super C470590Icr<AnchorLocationSettingsReadResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/location/settings/update/")
    C11NZ<AnchorLocationSettingsUpdateResponse> updateLocationSettings(@InterfaceC1485405rg AnchorLocationSettingsUpdateRequest anchorLocationSettingsUpdateRequest);
}
