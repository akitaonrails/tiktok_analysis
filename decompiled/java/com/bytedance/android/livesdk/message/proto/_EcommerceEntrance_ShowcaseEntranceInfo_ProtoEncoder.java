package com.bytedance.android.livesdk.message.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_CreatorScoreProfile_ProtoEncoder;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _EcommerceEntrance_ShowcaseEntranceInfo_ProtoEncoder implements InterfaceC1132110fZB<EcommerceEntrance.ShowcaseEntranceInfo> {
    public static int LIZJ(EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo) {
        int iLIZIZ;
        int iLIZ = 0;
        int iLJIILL = C1142340fpg.LJIILL(1, showcaseEntranceInfo.formatSoldCount) + C1142340fpg.LJIIL(2, showcaseEntranceInfo.soldCount) + C1142340fpg.LJIILL(3, showcaseEntranceInfo.showcaseName);
        List<EcommerceEntrance.SellingPoint> list = showcaseEntranceInfo.sellingPoint;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < showcaseEntranceInfo.sellingPoint.size(); i++) {
                EcommerceEntrance.SellingPoint sellingPoint = (EcommerceEntrance.SellingPoint) ListProtector.get(showcaseEntranceInfo.sellingPoint, i);
                if (sellingPoint == null) {
                    iLIZIZ = 0;
                } else {
                    int iLJIILL2 = C1142340fpg.LJIILL(1, sellingPoint.showText) + C1142340fpg.LJIIIZ(2, sellingPoint.sellingPointType);
                    iLIZIZ = iLJIILL2 + C1142350fph.LIZIZ(iLJIILL2) + C1142350fph.LIZ(11);
                }
                iLJIILL += iLIZIZ;
            }
        }
        User.CreatorScoreProfile creatorScoreProfile = showcaseEntranceInfo.creatorScoreProfile;
        if (creatorScoreProfile != null) {
            int iLIZJ = _User_CreatorScoreProfile_ProtoEncoder.LIZJ(creatorScoreProfile);
            iLIZ = C1142350fph.LIZ(12) + iLIZJ + C1142350fph.LIZIZ(iLIZJ);
        }
        return iLJIILL + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo) {
        C1142340fpg.LJFF(c1142350fph, 1, showcaseEntranceInfo.formatSoldCount);
        long j = showcaseEntranceInfo.soldCount;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 3, showcaseEntranceInfo.showcaseName);
        List<EcommerceEntrance.SellingPoint> list = showcaseEntranceInfo.sellingPoint;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < showcaseEntranceInfo.sellingPoint.size(); i++) {
                EcommerceEntrance.SellingPoint sellingPoint = (EcommerceEntrance.SellingPoint) ListProtector.get(showcaseEntranceInfo.sellingPoint, i);
                if (sellingPoint != null) {
                    c1142350fph.LIZLLL(11, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, sellingPoint.showText) + C1142340fpg.LJIIIZ(2, sellingPoint.sellingPointType));
                    C1142340fpg.LJFF(c1142350fph, 1, sellingPoint.showText);
                    int i2 = sellingPoint.sellingPointType;
                    c1142350fph.LIZLLL(2, 0);
                    c1142350fph.LIZJ(i2);
                }
            }
        }
        User.CreatorScoreProfile creatorScoreProfile = showcaseEntranceInfo.creatorScoreProfile;
        if (creatorScoreProfile != null) {
            c1142350fph.LIZLLL(12, 2);
            c1142350fph.LJ(_User_CreatorScoreProfile_ProtoEncoder.LIZJ(creatorScoreProfile));
            _User_CreatorScoreProfile_ProtoEncoder.LIZIZ(c1142350fph, creatorScoreProfile);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo) {
        LIZIZ(c1142350fph, showcaseEntranceInfo);
    }
}
