package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicListResponse_ProtoDecoder implements C0IMD<LinkmicListResponse> {
    @Override // X.C0IMD
    public final void LIZ(LinkmicListResponse linkmicListResponse) {
        ImageModel imageModel;
        LinkmicListResponse linkmicListResponse2 = linkmicListResponse;
        List<CohostListUser> list = linkmicListResponse2.users;
        if (list == null) {
            linkmicListResponse2.users = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CohostListUser cohostListUser : linkmicListResponse2.users) {
            if (cohostListUser != null && (imageModel = cohostListUser.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final LinkmicListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkmicListResponse linkmicListResponse = new LinkmicListResponse();
        linkmicListResponse.users = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkmicListResponse.users.add(_CohostListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    linkmicListResponse.totalPositionCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicListResponse linkmicListResponse, List list) {
    }
}
