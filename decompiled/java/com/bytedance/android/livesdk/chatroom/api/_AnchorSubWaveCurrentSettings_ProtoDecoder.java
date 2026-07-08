package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorSubWaveCurrentSettings_ProtoDecoder implements C0IMD<AnchorSubWaveCurrentSettings> {
    public static AnchorSubWaveCurrentSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorSubWaveCurrentSettings anchorSubWaveCurrentSettings = new AnchorSubWaveCurrentSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorSubWaveCurrentSettings.anchorSubWaveChallengeSettings = _AnchorSubWaveChallengeSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorSubWaveCurrentSettings.anchorSubWaveTriggerSettings = _AnchorSubWaveTriggerSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorSubWaveCurrentSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorSubWaveCurrentSettings anchorSubWaveCurrentSettings) {
        AnchorSubWaveChallengeSettings anchorSubWaveChallengeSettings = anchorSubWaveCurrentSettings.anchorSubWaveChallengeSettings;
        if (anchorSubWaveChallengeSettings != null) {
            _AnchorSubWaveChallengeSettings_ProtoDecoder.LJ(anchorSubWaveChallengeSettings);
        }
    }

    @Override // X.C0IMD
    public final AnchorSubWaveCurrentSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorSubWaveCurrentSettings anchorSubWaveCurrentSettings, List list) {
    }
}
