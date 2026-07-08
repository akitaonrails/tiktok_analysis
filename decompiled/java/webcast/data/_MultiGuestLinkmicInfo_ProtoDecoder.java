package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MultiGuestLinkmicInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestLinkmicInfo_ProtoDecoder implements C0IMD<MultiGuestLinkmicInfo> {
    public static MultiGuestLinkmicInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestLinkmicInfo multiGuestLinkmicInfo = new MultiGuestLinkmicInfo();
        multiGuestLinkmicInfo.linkedUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 14) {
                        if (iLJI != 8) {
                            if (iLJI != 9) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                multiGuestLinkmicInfo.fanTicketIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            multiGuestLinkmicInfo.requestUserStatus = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        multiGuestLinkmicInfo.hostDisplayInfo = _MultiGuestLinkmicInfo_HostDisplayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    multiGuestLinkmicInfo.linkedUsers.add(_MultiGuestLinkmicInfo_ListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestLinkmicInfo;
            }
        }
    }

    public static void LJ(MultiGuestLinkmicInfo multiGuestLinkmicInfo) {
        List<MultiGuestLinkmicInfo.ListUser> list = multiGuestLinkmicInfo.linkedUsers;
        if (list == null) {
            multiGuestLinkmicInfo.linkedUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (MultiGuestLinkmicInfo.ListUser listUser : multiGuestLinkmicInfo.linkedUsers) {
            if (listUser != null) {
                User user = listUser.user;
                if (user != null) {
                    _User_ProtoDecoder.LJ(user);
                }
                ImageModel imageModel = listUser.blurredAvatar;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestLinkmicInfo multiGuestLinkmicInfo) {
        LJ(multiGuestLinkmicInfo);
    }

    @Override // X.C0IMD
    public final MultiGuestLinkmicInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestLinkmicInfo multiGuestLinkmicInfo, List list) {
    }
}
