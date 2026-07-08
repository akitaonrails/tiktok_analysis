package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._SubscribeInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_FansClubInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_OwnRoom_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomCreateUserInfo_ProtoDecoder implements C0IMD<RoomCreateUserInfo> {
    public static RoomCreateUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomCreateUserInfo roomCreateUserInfo = new RoomCreateUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            roomCreateUserInfo.subscribeInfo = _SubscribeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        roomCreateUserInfo.fansClubInfo = _User_FansClubInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomCreateUserInfo.ownRoom = _User_OwnRoom_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomCreateUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomCreateUserInfo roomCreateUserInfo) {
        ImageModel imageModel;
        RoomCreateUserInfo roomCreateUserInfo2 = roomCreateUserInfo;
        User.OwnRoom ownRoom = roomCreateUserInfo2.ownRoom;
        if (ownRoom != null && ownRoom.roomIdList == null) {
            ownRoom.roomIdList = new ArrayList();
        }
        User.FansClubInfo fansClubInfo = roomCreateUserInfo2.fansClubInfo;
        if (fansClubInfo != null && (imageModel = fansClubInfo.badge) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        SubscribeInfo subscribeInfo = roomCreateUserInfo2.subscribeInfo;
        if (subscribeInfo != null) {
            _SubscribeInfo_ProtoDecoder.LJ(subscribeInfo);
        }
    }

    @Override // X.C0IMD
    public final RoomCreateUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomCreateUserInfo roomCreateUserInfo, List list) {
    }
}
