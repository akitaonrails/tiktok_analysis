package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubOnlyVideosBriefInfo_ProtoDecoder implements C0IMD<SubOnlyVideosBriefInfo> {
    public static SubOnlyVideosBriefInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = new SubOnlyVideosBriefInfo();
        subOnlyVideosBriefInfo.sovBriefInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subOnlyVideosBriefInfo.totalCountStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        subOnlyVideosBriefInfo.totalCount = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        subOnlyVideosBriefInfo.sovBriefInfo.add(_SOVBriefInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        subOnlyVideosBriefInfo.creatorStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        subOnlyVideosBriefInfo.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        subOnlyVideosBriefInfo.isSovAdjustmentsEnabledForConsumer = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        subOnlyVideosBriefInfo.newSovCount = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subOnlyVideosBriefInfo;
            }
        }
    }

    public static void LJ(SubOnlyVideosBriefInfo subOnlyVideosBriefInfo) {
        ImageModel imageModel;
        List<SOVBriefInfo> list = subOnlyVideosBriefInfo.sovBriefInfo;
        if (list == null) {
            subOnlyVideosBriefInfo.sovBriefInfo = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (SOVBriefInfo sOVBriefInfo : subOnlyVideosBriefInfo.sovBriefInfo) {
            if (sOVBriefInfo != null && (imageModel = sOVBriefInfo.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubOnlyVideosBriefInfo subOnlyVideosBriefInfo) {
        LJ(subOnlyVideosBriefInfo);
    }

    @Override // X.C0IMD
    public final SubOnlyVideosBriefInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubOnlyVideosBriefInfo subOnlyVideosBriefInfo, List list) {
    }
}
