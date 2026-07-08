package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AudioStruct_ProtoDecoder implements C0IMD<AudioStruct> {
    public static AudioStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AudioStruct audioStruct = new AudioStruct();
        audioStruct.audioUrls = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        audioStruct.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        audioStruct.duration = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        audioStruct.audioFormat = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        audioStruct.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        audioStruct.audioUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        audioStruct.volumeLoudnessLufs = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case 7:
                        audioStruct.volumeAmplitudePeak = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audioStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AudioStruct audioStruct) {
        AudioStruct audioStruct2 = audioStruct;
        if (audioStruct2.audioUrls == null) {
            audioStruct2.audioUrls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AudioStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AudioStruct audioStruct, List list) {
    }
}
