package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomReplayMoment_ProtoDecoder implements C0IMD<RoomReplayMoment> {
    public static RoomReplayMoment LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomReplayMoment roomReplayMoment = new RoomReplayMoment();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomReplayMoment.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomReplayMoment.momentStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        roomReplayMoment.momentEndTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        roomReplayMoment.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        roomReplayMoment.pushStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        roomReplayMoment.reason = _RoomReplayReason_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        roomReplayMoment.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        roomReplayMoment.playUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomReplayMoment;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomReplayMoment roomReplayMoment) {
        ImageModel imageModel;
        RoomReplayMoment roomReplayMoment2 = roomReplayMoment;
        RoomReplayReason roomReplayReason = roomReplayMoment2.reason;
        if (roomReplayReason != null && (imageModel = roomReplayReason.typeIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = roomReplayMoment2.cover;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final RoomReplayMoment LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomReplayMoment roomReplayMoment, List list) {
    }
}
