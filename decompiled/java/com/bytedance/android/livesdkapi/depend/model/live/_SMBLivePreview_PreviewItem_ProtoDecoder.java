package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.SMBLivePreview;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBLivePreview_PreviewItem_ProtoDecoder implements C0IMD<SMBLivePreview.PreviewItem> {
    public static SMBLivePreview.PreviewItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBLivePreview.PreviewItem previewItem = new SMBLivePreview.PreviewItem();
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
                                previewItem.iconToken = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            previewItem.content = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        previewItem.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    previewItem.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewItem;
            }
        }
    }

    @Override // X.C0IMD
    public final SMBLivePreview.PreviewItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SMBLivePreview.PreviewItem previewItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBLivePreview.PreviewItem previewItem, List list) {
    }
}
