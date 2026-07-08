package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaCommon_ProtoDecoder implements C0IMD<PublicAreaCommon> {
    public static PublicAreaCommon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaCommon publicAreaCommon = new PublicAreaCommon();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        publicAreaCommon.userConsumeInRoom = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    publicAreaCommon.userLabel = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return publicAreaCommon;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaCommon publicAreaCommon) {
        ImageModel imageModel = publicAreaCommon.userLabel;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PublicAreaCommon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaCommon publicAreaCommon, List list) {
    }
}
