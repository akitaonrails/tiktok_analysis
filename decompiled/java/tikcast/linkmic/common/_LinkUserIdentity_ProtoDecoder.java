package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkUserIdentity_ProtoDecoder implements C0IMD<LinkUserIdentity> {
    public static LinkUserIdentity LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkUserIdentity linkUserIdentity = new LinkUserIdentity();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkUserIdentity.channelId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkUserIdentity.linkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkUserIdentity.player = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkUserIdentity;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkUserIdentity linkUserIdentity) {
    }

    @Override // X.C0IMD
    public final LinkUserIdentity LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkUserIdentity linkUserIdentity, List list) {
    }
}
