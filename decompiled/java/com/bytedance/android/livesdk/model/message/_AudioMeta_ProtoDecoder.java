package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AudioMeta_ProtoDecoder implements C0IMD<AudioMeta> {
    public static AudioMeta LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AudioMeta audioMeta = new AudioMeta();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        audioMeta.codec = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        audioMeta.sampleRateHz = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        audioMeta.bitsPerSample = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        audioMeta.channels = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        audioMeta.bitrateKbps = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        audioMeta.bitrateMode = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        audioMeta.frameDurationMs = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        audioMeta.audioDurationMs = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audioMeta;
            }
        }
    }

    @Override // X.C0IMD
    public final AudioMeta LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AudioMeta audioMeta) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AudioMeta audioMeta, List list) {
    }
}
