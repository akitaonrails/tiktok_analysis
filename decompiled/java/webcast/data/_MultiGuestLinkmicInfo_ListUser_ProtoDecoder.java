package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.MultiGuestLinkmicInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestLinkmicInfo_ListUser_ProtoDecoder implements C0IMD<MultiGuestLinkmicInfo.ListUser> {
    public static MultiGuestLinkmicInfo.ListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestLinkmicInfo.ListUser listUser = new MultiGuestLinkmicInfo.ListUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                if (iLJI != 7) {
                                    if (iLJI != 10) {
                                        if (iLJI != 11) {
                                            C1516700pZU.LJ(c1516680pZS);
                                        } else {
                                            listUser.blurredAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        listUser.fanTicketIconType = c1516680pZS.LJIIJ();
                                    }
                                } else {
                                    listUser.fanTicket = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                listUser.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            listUser.roleType = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        listUser.modifyTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    listUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return listUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestLinkmicInfo.ListUser listUser) {
        MultiGuestLinkmicInfo.ListUser listUser2 = listUser;
        User user = listUser2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        ImageModel imageModel = listUser2.blurredAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final MultiGuestLinkmicInfo.ListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestLinkmicInfo.ListUser listUser, List list) {
    }
}
