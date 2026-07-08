package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideKeywordsResponse_Data_ProtoDecoder implements C0IMD<GuideKeywordsResponse.Data> {
    public static GuideKeywordsResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideKeywordsResponse.Data data = new GuideKeywordsResponse.Data();
        data.keywordsLibrary = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            data.keywordsLibrary.add(_KeywordsLibrary_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        data.userInfo = _GuideKeywordsResponse_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    data.version = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(GuideKeywordsResponse.Data data) {
        List<KeywordsLibrary> list = data.keywordsLibrary;
        if (list == null) {
            data.keywordsLibrary = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (KeywordsLibrary keywordsLibrary : data.keywordsLibrary) {
            if (keywordsLibrary != null) {
                _KeywordsLibrary_ProtoDecoder.LJ(keywordsLibrary);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideKeywordsResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final GuideKeywordsResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideKeywordsResponse.Data data, List list) {
    }
}
