package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaWhisperSwitchSettings_ProtoDecoder implements C0IMD<EnigmaWhisperSwitchSettings> {
    public static EnigmaWhisperSwitchSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaWhisperSwitchSettings enigmaWhisperSwitchSettings = new EnigmaWhisperSwitchSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    enigmaWhisperSwitchSettings.enigmaWhisper = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaWhisperSwitchSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final EnigmaWhisperSwitchSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnigmaWhisperSwitchSettings enigmaWhisperSwitchSettings) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaWhisperSwitchSettings enigmaWhisperSwitchSettings, List list) {
    }
}
