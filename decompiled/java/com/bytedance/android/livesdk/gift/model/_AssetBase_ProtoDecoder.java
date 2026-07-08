package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.gift.assets._FaceRecognitionMeta_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AssetBase_ProtoDecoder implements C0IMD<AssetBase> {
    public static AssetBase LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AssetBase assetBase = new AssetBase();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            assetBase.faceMeta = _FaceRecognitionMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        assetBase.md5 = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    assetBase.url = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return assetBase;
            }
        }
    }

    public static void LJ(AssetBase assetBase) {
        ImageModel imageModel = assetBase.url;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        FaceRecognitionMeta faceRecognitionMeta = assetBase.faceMeta;
        if (faceRecognitionMeta != null && faceRecognitionMeta.requirements == null) {
            faceRecognitionMeta.requirements = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AssetBase assetBase) {
        LJ(assetBase);
    }

    @Override // X.C0IMD
    public final AssetBase LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AssetBase assetBase, List list) {
    }
}
