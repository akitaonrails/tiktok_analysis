package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateRoomLayoutSettings_ProtoDecoder implements C0IMD<UpdateRoomLayoutSettings> {
    @Override // X.C0IMD
    public final void LIZ(UpdateRoomLayoutSettings updateRoomLayoutSettings) {
    }

    @Override // X.C0IMD
    public final UpdateRoomLayoutSettings LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateRoomLayoutSettings updateRoomLayoutSettings = new UpdateRoomLayoutSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        updateRoomLayoutSettings.settingMessage = _UpdateSettingResponse_SettingMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    updateRoomLayoutSettings.rtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateRoomLayoutSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateRoomLayoutSettings updateRoomLayoutSettings, List list) {
    }
}
