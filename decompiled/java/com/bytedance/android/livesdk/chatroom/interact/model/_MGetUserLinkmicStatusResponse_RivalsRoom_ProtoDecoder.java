package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live._RoomLinkInfo_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGetUserLinkmicStatusResponse_RivalsRoom_ProtoDecoder implements C0IMD<MGetUserLinkmicStatusResponse.RivalsRoom> {
    public static MGetUserLinkmicStatusResponse.RivalsRoom LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGetUserLinkmicStatusResponse.RivalsRoom rivalsRoom = new MGetUserLinkmicStatusResponse.RivalsRoom();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rivalsRoom.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        rivalsRoom.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        rivalsRoom.owner = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        rivalsRoom.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        rivalsRoom.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        rivalsRoom.userCount = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        rivalsRoom.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        rivalsRoom.withLinkmic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rivalsRoom.linkMic = _RoomLinkInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalsRoom;
            }
        }
    }

    public static void LJ(MGetUserLinkmicStatusResponse.RivalsRoom rivalsRoom) {
        User user = rivalsRoom.owner;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        ImageModel imageModel = rivalsRoom.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        RoomLinkInfo roomLinkInfo = rivalsRoom.linkMic;
        if (roomLinkInfo != null) {
            _RoomLinkInfo_ProtoDecoder.LJ(roomLinkInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MGetUserLinkmicStatusResponse.RivalsRoom rivalsRoom) {
        LJ(rivalsRoom);
    }

    @Override // X.C0IMD
    public final MGetUserLinkmicStatusResponse.RivalsRoom LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGetUserLinkmicStatusResponse.RivalsRoom rivalsRoom, List list) {
    }
}
