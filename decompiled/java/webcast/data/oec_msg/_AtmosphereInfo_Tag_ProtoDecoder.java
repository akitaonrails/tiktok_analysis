package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.oec_msg.AtmosphereInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _AtmosphereInfo_Tag_ProtoDecoder implements C0IMD<AtmosphereInfo.Tag> {
    public static AtmosphereInfo.Tag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AtmosphereInfo.Tag tag = new AtmosphereInfo.Tag();
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
                                tag.status = c1516680pZS.LJIIJ();
                            }
                        } else {
                            tag.count = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        tag.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    tag.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tag;
            }
        }
    }

    @Override // X.C0IMD
    public final AtmosphereInfo.Tag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AtmosphereInfo.Tag tag) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AtmosphereInfo.Tag tag, List list) {
    }
}
