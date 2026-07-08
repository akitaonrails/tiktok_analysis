package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_PortraitInfo_PortraitTag_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.PortraitInfo.PortraitTag> {
    public static PublicAreaMessageCommon.PortraitInfo.PortraitTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag = new PublicAreaMessageCommon.PortraitInfo.PortraitTag();
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
                                portraitTag.showArgs = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            portraitTag.showValue = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        portraitTag.priority = c1516680pZS.LJIIJJI();
                    }
                } else {
                    portraitTag.tagId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return portraitTag;
            }
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.PortraitInfo.PortraitTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.PortraitInfo.PortraitTag portraitTag, List list) {
    }
}
