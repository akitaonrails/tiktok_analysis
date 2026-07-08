package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LevelBadge_ProtoDecoder implements C0IMD<LevelBadge> {
    public static LevelBadge LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LevelBadge levelBadge = new LevelBadge();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 3) {
                    if (iLJI != 4) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        levelBadge.previewImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    levelBadge.originImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return levelBadge;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LevelBadge levelBadge) {
        LevelBadge levelBadge2 = levelBadge;
        ImageModel imageModel = levelBadge2.originImg;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = levelBadge2.previewImg;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final LevelBadge LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LevelBadge levelBadge, List list) {
    }
}
