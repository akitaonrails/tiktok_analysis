package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.AnchorSettingsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorSettingsResponse_ResponseData_ProtoDecoder implements C0IMD<AnchorSettingsResponse.ResponseData> {
    public static AnchorSettingsResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorSettingsResponse.ResponseData responseData = new AnchorSettingsResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.userAttrSettings = _UserAttrSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.userStats = _UserStats_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.settings = _RoomBasicSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorSettingsResponse.ResponseData responseData) {
        UserAttrSettings userAttrSettings = responseData.userAttrSettings;
        if (userAttrSettings != null) {
            _UserAttrSettings_ProtoDecoder.LJ(userAttrSettings);
        }
    }

    @Override // X.C0IMD
    public final AnchorSettingsResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorSettingsResponse.ResponseData responseData, List list) {
    }
}
