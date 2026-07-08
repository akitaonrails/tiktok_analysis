package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitBizContent_ProtoDecoder implements C0IMD<PermitBizContent> {
    public static PermitBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PermitBizContent permitBizContent = new PermitBizContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        permitBizContent.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        permitBizContent.expireTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        permitBizContent.operatorUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        permitBizContent.operatorLinkAdminType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        permitBizContent.linkUserType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        permitBizContent.isApplyAutoApproved = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        permitBizContent.linkTypePermission = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        permitBizContent.isFullPositionPreApproved = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        permitBizContent.isQuickCallAutoApproved = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PermitBizContent permitBizContent) {
        User user = permitBizContent.operatorUserInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final PermitBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitBizContent permitBizContent, List list) {
    }
}
