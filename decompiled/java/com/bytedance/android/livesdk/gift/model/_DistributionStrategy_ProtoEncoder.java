package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.gift.assets._FaceRecognitionMeta_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _DistributionStrategy_ProtoEncoder implements InterfaceC1132110fZB<DistributionStrategy> {
    public static int LIZJ(DistributionStrategy distributionStrategy) {
        int iLIZIZ;
        AssetBase assetBase = distributionStrategy.assetBase;
        if (assetBase == null) {
            iLIZIZ = 0;
        } else {
            int iLIZIZ2 = _AssetBase_ProtoEncoder.LIZIZ(assetBase);
            iLIZIZ = iLIZIZ2 + C1142350fph.LIZIZ(iLIZIZ2) + C1142350fph.LIZ(1);
        }
        return iLIZIZ + C1142340fpg.LJIIIZ(2, distributionStrategy.resourceType);
    }

    public static void LIZIZ(C1142350fph c1142350fph, DistributionStrategy distributionStrategy) {
        AssetBase assetBase = distributionStrategy.assetBase;
        if (assetBase != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_AssetBase_ProtoEncoder.LIZIZ(assetBase));
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, assetBase.url);
            C1142340fpg.LJFF(c1142350fph, 3, assetBase.md5);
            FaceRecognitionMeta faceRecognitionMeta = assetBase.faceMeta;
            if (faceRecognitionMeta != null) {
                c1142350fph.LIZLLL(4, 2);
                c1142350fph.LJ(_FaceRecognitionMeta_ProtoEncoder.LIZJ(faceRecognitionMeta));
                _FaceRecognitionMeta_ProtoEncoder.LIZIZ(c1142350fph, faceRecognitionMeta);
            }
        }
        int i = distributionStrategy.resourceType;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, DistributionStrategy distributionStrategy) {
        LIZIZ(c1142350fph, distributionStrategy);
    }
}
