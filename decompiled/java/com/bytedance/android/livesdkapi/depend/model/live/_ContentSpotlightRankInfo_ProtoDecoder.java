package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ContentSpotlightRankInfo_ProtoDecoder implements C0IMD<ContentSpotlightRankInfo> {
    public static ContentSpotlightRankInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ContentSpotlightRankInfo contentSpotlightRankInfo = new ContentSpotlightRankInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        contentSpotlightRankInfo.scoreIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    contentSpotlightRankInfo.score = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return contentSpotlightRankInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ContentSpotlightRankInfo contentSpotlightRankInfo) {
        ImageModel imageModel = contentSpotlightRankInfo.scoreIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ContentSpotlightRankInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ContentSpotlightRankInfo contentSpotlightRankInfo, List list) {
    }
}
