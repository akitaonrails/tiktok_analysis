package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AggregationData_ProtoDecoder implements C0IMD<AggregationData> {
    public static AggregationData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AggregationData aggregationData = new AggregationData();
        aggregationData.successlist = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        aggregationData.successlist.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                    }
                } else {
                    aggregationData.audience = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aggregationData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AggregationData aggregationData) {
        AggregationData aggregationData2 = aggregationData;
        User user = aggregationData2.audience;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        if (aggregationData2.successlist == null) {
            aggregationData2.successlist = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AggregationData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AggregationData aggregationData, List list) {
    }
}
