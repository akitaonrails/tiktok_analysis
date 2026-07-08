package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalExtraInfo_Tag_ProtoDecoder implements C0IMD<RivalExtraInfo.Tag> {
    public static RivalExtraInfo.Tag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalExtraInfo.Tag tag = new RivalExtraInfo.Tag();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            tag.tagText = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        tag.tagValue = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    tag.tagType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tag;
            }
        }
    }

    @Override // X.C0IMD
    public final RivalExtraInfo.Tag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RivalExtraInfo.Tag tag) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalExtraInfo.Tag tag, List list) {
    }
}
