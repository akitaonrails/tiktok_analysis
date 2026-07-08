package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SOVBriefInfo_ProtoDecoder implements C0IMD<SOVBriefInfo> {
    public static SOVBriefInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SOVBriefInfo sOVBriefInfo = new SOVBriefInfo();
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
                                    sOVBriefInfo.awemeId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                sOVBriefInfo.createTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            sOVBriefInfo.lockInfo = c1516680pZS.LJIIJ();
                        }
                    } else {
                        sOVBriefInfo.maskInfo = _SOVMaskInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sOVBriefInfo.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sOVBriefInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SOVBriefInfo sOVBriefInfo) {
        ImageModel imageModel = sOVBriefInfo.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final SOVBriefInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SOVBriefInfo sOVBriefInfo, List list) {
    }
}
