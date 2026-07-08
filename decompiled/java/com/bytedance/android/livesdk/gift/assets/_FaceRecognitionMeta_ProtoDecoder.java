package com.bytedance.android.livesdk.gift.assets;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FaceRecognitionMeta_ProtoDecoder implements C0IMD<FaceRecognitionMeta> {
    public static FaceRecognitionMeta LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FaceRecognitionMeta faceRecognitionMeta = new FaceRecognitionMeta();
        faceRecognitionMeta.requirements = new ArrayList();
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
                                faceRecognitionMeta.sdkExtra = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            faceRecognitionMeta.modelNames = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        faceRecognitionMeta.requirements.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    faceRecognitionMeta.version = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return faceRecognitionMeta;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FaceRecognitionMeta faceRecognitionMeta) {
        FaceRecognitionMeta faceRecognitionMeta2 = faceRecognitionMeta;
        if (faceRecognitionMeta2.requirements == null) {
            faceRecognitionMeta2.requirements = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final FaceRecognitionMeta LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FaceRecognitionMeta faceRecognitionMeta, List list) {
    }
}
