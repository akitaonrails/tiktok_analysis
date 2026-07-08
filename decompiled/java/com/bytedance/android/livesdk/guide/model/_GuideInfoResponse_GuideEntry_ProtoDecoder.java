package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideInfoResponse_GuideEntry_ProtoDecoder implements C0IMD<GuideInfoResponse.GuideEntry> {
    public static GuideInfoResponse.GuideEntry LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideInfoResponse.GuideEntry guideEntry = new GuideInfoResponse.GuideEntry();
        guideEntry.guidePageResources = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 10) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guideEntry.guidePageResources.add(_GuideInfoResponse_GuidePageResource_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideEntry;
            }
        }
    }

    public static void LJ(GuideInfoResponse.GuideEntry guideEntry) {
        List<GuideInfoResponse.GuidePageResource> list = guideEntry.guidePageResources;
        if (list == null) {
            guideEntry.guidePageResources = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GuideInfoResponse.GuidePageResource guidePageResource : guideEntry.guidePageResources) {
            if (guidePageResource != null) {
                _GuideInfoResponse_GuidePageResource_ProtoDecoder.LJ(guidePageResource);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideInfoResponse.GuideEntry guideEntry) {
        LJ(guideEntry);
    }

    @Override // X.C0IMD
    public final GuideInfoResponse.GuideEntry LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideInfoResponse.GuideEntry guideEntry, List list) {
    }
}
