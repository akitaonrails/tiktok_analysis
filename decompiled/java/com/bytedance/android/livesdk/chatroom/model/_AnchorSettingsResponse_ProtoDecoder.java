package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.AnchorSettingsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorSettingsResponse_ProtoDecoder implements C0IMD<AnchorSettingsResponse> {
    @Override // X.C0IMD
    public final void LIZ(AnchorSettingsResponse anchorSettingsResponse) {
        UserAttrSettings userAttrSettings;
        AnchorSettingsResponse.ResponseData responseData = anchorSettingsResponse.data;
        if (responseData != null && (userAttrSettings = responseData.userAttrSettings) != null) {
            _UserAttrSettings_ProtoDecoder.LJ(userAttrSettings);
        }
    }

    @Override // X.C0IMD
    public final AnchorSettingsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorSettingsResponse anchorSettingsResponse = new AnchorSettingsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorSettingsResponse.data = _AnchorSettingsResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorSettingsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorSettingsResponse anchorSettingsResponse, List list) {
    }
}
