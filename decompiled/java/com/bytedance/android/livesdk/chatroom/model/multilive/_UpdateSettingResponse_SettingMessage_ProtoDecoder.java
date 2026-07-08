package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateSettingResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateSettingResponse_SettingMessage_ProtoDecoder implements C0IMD<UpdateSettingResponse.SettingMessage> {
    public static UpdateSettingResponse.SettingMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UpdateSettingResponse.SettingMessage settingMessage = new UpdateSettingResponse.SettingMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                settingMessage.shareRevenueSettingRatio = c1516680pZS.LJIIJ();
                            }
                        } else {
                            settingMessage.shareRevenueSettingVersion = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        settingMessage.shareRevenueSetting = c1516680pZS.LJIIJ();
                    }
                } else {
                    settingMessage.updateScene = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return settingMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final UpdateSettingResponse.SettingMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UpdateSettingResponse.SettingMessage settingMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateSettingResponse.SettingMessage settingMessage, List list) {
    }
}
