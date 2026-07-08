package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SearchRivalsResponse_ProtoDecoder implements C0IMD<SearchRivalsResponse> {
    @Override // X.C0IMD
    public final void LIZ(SearchRivalsResponse searchRivalsResponse) {
        SearchRivalsResponse.ResponseData responseData = searchRivalsResponse.data;
        if (responseData != null) {
            _SearchRivalsResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final SearchRivalsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SearchRivalsResponse searchRivalsResponse = new SearchRivalsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    searchRivalsResponse.data = _SearchRivalsResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return searchRivalsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SearchRivalsResponse searchRivalsResponse, List list) {
    }
}
