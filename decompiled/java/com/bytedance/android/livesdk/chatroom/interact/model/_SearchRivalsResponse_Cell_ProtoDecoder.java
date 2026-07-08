package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SearchRivalsResponse_Cell_ProtoDecoder implements C0IMD<SearchRivalsResponse.Cell> {
    public static SearchRivalsResponse.Cell LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SearchRivalsResponse.Cell cell = new SearchRivalsResponse.Cell();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        cell.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cell.cellType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cell;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SearchRivalsResponse.Cell cell) {
        Room room = cell.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final SearchRivalsResponse.Cell LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SearchRivalsResponse.Cell cell, List list) {
    }
}
