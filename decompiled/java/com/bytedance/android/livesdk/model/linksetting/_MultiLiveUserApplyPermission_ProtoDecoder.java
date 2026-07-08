package com.bytedance.android.livesdk.model.linksetting;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _MultiLiveUserApplyPermission_ProtoDecoder implements C0IMD<MultiLiveUserApplyPermission> {
    public static MultiLiveUserApplyPermission LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiLiveUserApplyPermission multiLiveUserApplyPermission = new MultiLiveUserApplyPermission();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiLiveUserApplyPermission.multiLiveApplyPermission = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        multiLiveUserApplyPermission.applierSortSetting = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        multiLiveUserApplyPermission.applierSortGiftScoreThreshold = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        multiLiveUserApplyPermission.multiGuestAllowRequestFromFriends = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        multiLiveUserApplyPermission.multiGuestAllowRequestFromFollowers = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        multiLiveUserApplyPermission.multiGuestAllowRequestFromOthers = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        multiLiveUserApplyPermission.multiGuestDisableVideoLinkmic = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        multiLiveUserApplyPermission.multiGuestApplyAutoApprove = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        multiLiveUserApplyPermission.multiGuestResetPointAfterLeave = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        multiLiveUserApplyPermission.multiGuestDisableGuestOpenCamera = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiLiveUserApplyPermission;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiLiveUserApplyPermission LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiLiveUserApplyPermission multiLiveUserApplyPermission) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiLiveUserApplyPermission multiLiveUserApplyPermission, List list) {
    }
}
