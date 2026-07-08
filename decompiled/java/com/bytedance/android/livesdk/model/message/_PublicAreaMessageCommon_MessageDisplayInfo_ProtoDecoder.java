package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_MessageDisplayInfo_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.MessageDisplayInfo> {
    public static PublicAreaMessageCommon.MessageDisplayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo = new PublicAreaMessageCommon.MessageDisplayInfo();
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
                                messageDisplayInfo.stayStyle = c1516680pZS.LJIIJ();
                            }
                        } else {
                            messageDisplayInfo.incrDurationMs = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        messageDisplayInfo.showDurationMs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    messageDisplayInfo.durationType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return messageDisplayInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.MessageDisplayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo, List list) {
    }
}
