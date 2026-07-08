package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomMatchContent_UserGroup_UserInfo_ProtoDecoder implements C0IMD<RandomMatchContent.UserGroup.UserInfo> {
    public static RandomMatchContent.UserGroup.UserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomMatchContent.UserGroup.UserInfo userInfo = new RandomMatchContent.UserGroup.UserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    userInfo.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                userInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            userInfo.invitationRoleType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        userInfo.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RandomMatchContent.UserGroup.UserInfo userInfo) {
        ImageModel imageModel = userInfo.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final RandomMatchContent.UserGroup.UserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomMatchContent.UserGroup.UserInfo userInfo, List list) {
    }
}
