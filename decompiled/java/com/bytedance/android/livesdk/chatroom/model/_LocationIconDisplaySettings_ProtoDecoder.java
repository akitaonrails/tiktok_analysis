package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LocationIconDisplaySettings_ProtoDecoder implements C0IMD<LocationIconDisplaySettings> {
    public static LocationIconDisplaySettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LocationIconDisplaySettings locationIconDisplaySettings = new LocationIconDisplaySettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        locationIconDisplaySettings.location = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    locationIconDisplaySettings.hideIcon = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return locationIconDisplaySettings;
            }
        }
    }

    @Override // X.C0IMD
    public final LocationIconDisplaySettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LocationIconDisplaySettings locationIconDisplaySettings) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LocationIconDisplaySettings locationIconDisplaySettings, List list) {
    }
}
