package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.im.CohostContent;
import webcast.im._CohostContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BusinessContent_ProtoDecoder implements C0IMD<BusinessContent> {
    public static BusinessContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BusinessContent businessContent = new BusinessContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 100) {
                        if (iLJI != 200) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            businessContent.cohostContent = _CohostContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        businessContent.multiLiveContent = _MultiLiveContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    businessContent.overLength = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return businessContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BusinessContent businessContent) {
        BusinessContent businessContent2 = businessContent;
        MultiLiveContent multiLiveContent = businessContent2.multiLiveContent;
        if (multiLiveContent != null) {
            _MultiLiveContent_ProtoDecoder.LJ(multiLiveContent);
        }
        CohostContent cohostContent = businessContent2.cohostContent;
        if (cohostContent != null) {
            _CohostContent_ProtoDecoder.LJ(cohostContent);
        }
    }

    @Override // X.C0IMD
    public final BusinessContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BusinessContent businessContent, List list) {
    }
}
