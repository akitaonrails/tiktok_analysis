package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomReplayReason_ProtoDecoder implements C0IMD<RoomReplayReason> {
    public static RoomReplayReason LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomReplayReason roomReplayReason = new RoomReplayReason();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomReplayReason.reason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomReplayReason.value = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        roomReplayReason.type = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        roomReplayReason.promotionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        roomReplayReason.typeName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        roomReplayReason.typeIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomReplayReason;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomReplayReason roomReplayReason) {
        ImageModel imageModel = roomReplayReason.typeIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final RoomReplayReason LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomReplayReason roomReplayReason, List list) {
    }
}
