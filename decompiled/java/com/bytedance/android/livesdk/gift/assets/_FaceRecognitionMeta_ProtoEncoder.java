package com.bytedance.android.livesdk.gift.assets;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _FaceRecognitionMeta_ProtoEncoder implements InterfaceC1132110fZB<FaceRecognitionMeta> {
    public static int LIZJ(FaceRecognitionMeta faceRecognitionMeta) {
        if (faceRecognitionMeta == null) {
            return 0;
        }
        int iLJIILL = C1142340fpg.LJIILL(1, faceRecognitionMeta.version);
        List<String> list = faceRecognitionMeta.requirements;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < faceRecognitionMeta.requirements.size(); i++) {
                iLJIILL += C1142340fpg.LJIILL(2, (String) ListProtector.get(faceRecognitionMeta.requirements, i));
            }
        }
        return iLJIILL + C1142340fpg.LJIILL(3, faceRecognitionMeta.modelNames) + C1142340fpg.LJIILL(4, faceRecognitionMeta.sdkExtra);
    }

    public static void LIZIZ(C1142350fph c1142350fph, FaceRecognitionMeta faceRecognitionMeta) {
        C1142340fpg.LJFF(c1142350fph, 1, faceRecognitionMeta.version);
        List<String> list = faceRecognitionMeta.requirements;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < faceRecognitionMeta.requirements.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 2, (String) ListProtector.get(faceRecognitionMeta.requirements, i));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 3, faceRecognitionMeta.modelNames);
        C1142340fpg.LJFF(c1142350fph, 4, faceRecognitionMeta.sdkExtra);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, FaceRecognitionMeta faceRecognitionMeta) {
        LIZIZ(c1142350fph, faceRecognitionMeta);
    }
}
