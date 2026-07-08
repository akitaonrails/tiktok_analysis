package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGetABInfosResp_ProtoDecoder implements C0IMD<MGetABInfosResp> {
    @Override // X.C0IMD
    public final void LIZ(MGetABInfosResp mGetABInfosResp) {
        MGetABInfosResp mGetABInfosResp2 = mGetABInfosResp;
        List<ABInfos> list = mGetABInfosResp2.infos;
        if (list == null) {
            mGetABInfosResp2.infos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<ABInfos> it2 = mGetABInfosResp2.infos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LinkMicCommonResp linkMicCommonResp = mGetABInfosResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final MGetABInfosResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MGetABInfosResp mGetABInfosResp = new MGetABInfosResp();
        mGetABInfosResp.infos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        mGetABInfosResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    mGetABInfosResp.infos.add(_ABInfos_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGetABInfosResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGetABInfosResp mGetABInfosResp, List list) {
    }
}
