package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MgActivityBannerContent_ProtoDecoder implements C0IMD<MgActivityBannerContent> {
    public static MgActivityBannerContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MgActivityBannerContent mgActivityBannerContent = new MgActivityBannerContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        mgActivityBannerContent.activityCurrent = _ActivityCurrent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        mgActivityBannerContent.applyState = _UserApplyState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        mgActivityBannerContent.multiPhaseTaskOwnerState = _UserMultiPhaseTaskOwnerState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        mgActivityBannerContent.optOutState = _UserOptOutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        mgActivityBannerContent.rankPlayerState = _UserRankPlayerState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        mgActivityBannerContent.taskOwnerState = _UserTaskOwnerState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        mgActivityBannerContent.activityInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mgActivityBannerContent;
            }
        }
    }

    public static void LJ(MgActivityBannerContent mgActivityBannerContent) {
        ActivityCurrent activityCurrent = mgActivityBannerContent.activityCurrent;
        if (activityCurrent != null && activityCurrent.pushActionTypes == null) {
            activityCurrent.pushActionTypes = new ArrayList();
        }
        UserMultiPhaseTaskOwnerState userMultiPhaseTaskOwnerState = mgActivityBannerContent.multiPhaseTaskOwnerState;
        if (userMultiPhaseTaskOwnerState != null) {
            _UserMultiPhaseTaskOwnerState_ProtoDecoder.LJ(userMultiPhaseTaskOwnerState);
        }
        UserRankPlayerState userRankPlayerState = mgActivityBannerContent.rankPlayerState;
        if (userRankPlayerState != null) {
            _UserRankPlayerState_ProtoDecoder.LJ(userRankPlayerState);
        }
        UserTaskOwnerState userTaskOwnerState = mgActivityBannerContent.taskOwnerState;
        if (userTaskOwnerState != null) {
            _UserTaskOwnerState_ProtoDecoder.LJ(userTaskOwnerState);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MgActivityBannerContent mgActivityBannerContent) {
        LJ(mgActivityBannerContent);
    }

    @Override // X.C0IMD
    public final MgActivityBannerContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MgActivityBannerContent mgActivityBannerContent, List list) {
    }
}
