package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.BeansArtifacts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BeansArtifacts_ProtoDecoder implements C0IMD<BeansArtifacts> {
    public static BeansArtifacts LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BeansArtifacts beansArtifacts = new BeansArtifacts();
        beansArtifacts.anchorsInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    beansArtifacts.anchorsInfo.add(_BeansArtifacts_AnchorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return beansArtifacts;
            }
        }
    }

    public static void LJ(BeansArtifacts beansArtifacts) {
        List<BeansArtifacts.AnchorInfo> list = beansArtifacts.anchorsInfo;
        if (list == null) {
            beansArtifacts.anchorsInfo = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BeansArtifacts.AnchorInfo anchorInfo : beansArtifacts.anchorsInfo) {
            if (anchorInfo != null) {
                _BeansArtifacts_AnchorInfo_ProtoDecoder.LJ(anchorInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BeansArtifacts beansArtifacts) {
        LJ(beansArtifacts);
    }

    @Override // X.C0IMD
    public final BeansArtifacts LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BeansArtifacts beansArtifacts, List list) {
    }
}
