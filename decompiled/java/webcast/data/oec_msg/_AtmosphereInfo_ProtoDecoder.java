package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.oec_msg.AtmosphereInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _AtmosphereInfo_ProtoDecoder implements C0IMD<AtmosphereInfo> {
    public static AtmosphereInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AtmosphereInfo atmosphereInfo = new AtmosphereInfo();
        atmosphereInfo.tags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    atmosphereInfo.tags.add(_AtmosphereInfo_Tag_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return atmosphereInfo;
            }
        }
    }

    public static void LJ(AtmosphereInfo atmosphereInfo) {
        List<AtmosphereInfo.Tag> list = atmosphereInfo.tags;
        if (list == null) {
            atmosphereInfo.tags = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<AtmosphereInfo.Tag> it2 = atmosphereInfo.tags.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AtmosphereInfo atmosphereInfo) {
        LJ(atmosphereInfo);
    }

    @Override // X.C0IMD
    public final AtmosphereInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AtmosphereInfo atmosphereInfo, List list) {
    }
}
