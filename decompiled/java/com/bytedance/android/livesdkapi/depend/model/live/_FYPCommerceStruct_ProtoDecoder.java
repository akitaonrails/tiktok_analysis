package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FYPCommerceStruct_ProtoDecoder implements C0IMD<FYPCommerceStruct> {
    public static FYPCommerceStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FYPCommerceStruct fYPCommerceStruct = new FYPCommerceStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    fYPCommerceStruct.oecLivePreviewRoomData = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                fYPCommerceStruct.popProductId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            fYPCommerceStruct.commercePermission = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        fYPCommerceStruct.productNum = c1516680pZS.LJIIJJI();
                    }
                } else {
                    fYPCommerceStruct.previewProductCardInfo = _PreviewProductCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fYPCommerceStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FYPCommerceStruct fYPCommerceStruct) {
    }

    @Override // X.C0IMD
    public final FYPCommerceStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FYPCommerceStruct fYPCommerceStruct, List list) {
    }
}
