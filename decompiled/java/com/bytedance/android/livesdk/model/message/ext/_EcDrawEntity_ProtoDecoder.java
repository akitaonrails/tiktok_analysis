package com.bytedance.android.livesdk.model.message.ext;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcDrawEntity_ProtoDecoder implements C0IMD<EcDrawEntity> {
    public static EcDrawEntity LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcDrawEntity ecDrawEntity = new EcDrawEntity();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 11) {
                                if (iLJI != 12) {
                                    if (iLJI != 20) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        ecDrawEntity.schema = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    ecDrawEntity.incentiveRecordId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                ecDrawEntity.incentiveImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            ecDrawEntity.activityId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        ecDrawEntity.subType = c1516680pZS.LJIIJ();
                    }
                } else {
                    ecDrawEntity.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecDrawEntity;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcDrawEntity ecDrawEntity) {
        ImageModel imageModel = ecDrawEntity.incentiveImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final EcDrawEntity LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcDrawEntity ecDrawEntity, List list) {
    }
}
