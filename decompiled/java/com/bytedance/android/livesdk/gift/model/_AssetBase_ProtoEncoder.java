package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.gift.assets._FaceRecognitionMeta_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _AssetBase_ProtoEncoder implements InterfaceC1132110fZB<AssetBase> {
    public static int LIZIZ(AssetBase assetBase) {
        int iLIZ = 0;
        int iLJ = _ImageModel_ProtoEncoder.LJ(2, assetBase.url) + C1142340fpg.LJIILL(3, assetBase.md5);
        FaceRecognitionMeta faceRecognitionMeta = assetBase.faceMeta;
        if (faceRecognitionMeta != null) {
            int iLIZJ = _FaceRecognitionMeta_ProtoEncoder.LIZJ(faceRecognitionMeta);
            iLIZ = C1142350fph.LIZ(4) + iLIZJ + C1142350fph.LIZIZ(iLIZJ);
        }
        return iLJ + iLIZ;
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, AssetBase assetBase) {
        AssetBase assetBase2 = assetBase;
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, assetBase2.url);
        C1142340fpg.LJFF(c1142350fph, 3, assetBase2.md5);
        FaceRecognitionMeta faceRecognitionMeta = assetBase2.faceMeta;
        if (faceRecognitionMeta != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_FaceRecognitionMeta_ProtoEncoder.LIZJ(faceRecognitionMeta));
            _FaceRecognitionMeta_ProtoEncoder.LIZIZ(c1142350fph, faceRecognitionMeta);
        }
    }
}
