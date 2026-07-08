package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.SMBLivePreview;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.AILiveSummary;
import webcast.data._AILiveSummary_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBLivePreview_ProtoDecoder implements C0IMD<SMBLivePreview> {
    public static SMBLivePreview LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBLivePreview sMBLivePreview = new SMBLivePreview();
        sMBLivePreview.previewItem = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                sMBLivePreview.createTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            sMBLivePreview.displayInterval = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        sMBLivePreview.aiSummary = _AILiveSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sMBLivePreview.previewItem.add(_SMBLivePreview_PreviewItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBLivePreview;
            }
        }
    }

    public static void LJ(SMBLivePreview sMBLivePreview) {
        List<SMBLivePreview.PreviewItem> list = sMBLivePreview.previewItem;
        if (list == null) {
            sMBLivePreview.previewItem = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<SMBLivePreview.PreviewItem> it2 = sMBLivePreview.previewItem.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        AILiveSummary aILiveSummary = sMBLivePreview.aiSummary;
        if (aILiveSummary != null && aILiveSummary.aiSummaryList == null) {
            aILiveSummary.aiSummaryList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBLivePreview sMBLivePreview) {
        LJ(sMBLivePreview);
    }

    @Override // X.C0IMD
    public final SMBLivePreview LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBLivePreview sMBLivePreview, List list) {
    }
}
