package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkmicShareRevenueSettingStruct_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteBizContent_ProtoDecoder implements C0IMD<InviteBizContent> {
    public static InviteBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InviteBizContent inviteBizContent = new InviteBizContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        inviteBizContent.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        inviteBizContent.inviteSource = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        inviteBizContent.operatorUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        inviteBizContent.operatorLinkAdminType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        inviteBizContent.inviteeUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        inviteBizContent.shareRevenueSetting = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        inviteBizContent.shareRevenueSettingStruct = _LinkmicShareRevenueSettingStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(InviteBizContent inviteBizContent) {
        InviteBizContent inviteBizContent2 = inviteBizContent;
        User user = inviteBizContent2.operatorUserInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = inviteBizContent2.inviteeUserInfo;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
    }

    @Override // X.C0IMD
    public final InviteBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteBizContent inviteBizContent, List list) {
    }
}
