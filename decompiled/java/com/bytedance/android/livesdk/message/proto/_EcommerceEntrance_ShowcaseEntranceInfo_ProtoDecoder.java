package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_CreatorScoreProfile_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder implements C0IMD<EcommerceEntrance.ShowcaseEntranceInfo> {
    public static EcommerceEntrance.ShowcaseEntranceInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = new EcommerceEntrance.ShowcaseEntranceInfo();
        showcaseEntranceInfo.sellingPoint = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 11) {
                                if (iLJI != 12) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    showcaseEntranceInfo.creatorScoreProfile = _User_CreatorScoreProfile_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                showcaseEntranceInfo.sellingPoint.add(_EcommerceEntrance_SellingPoint_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            showcaseEntranceInfo.showcaseName = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        showcaseEntranceInfo.soldCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    showcaseEntranceInfo.formatSoldCount = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showcaseEntranceInfo;
            }
        }
    }

    public static void LJ(EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo) {
        User.CreatorScoreLabelInfo creatorScoreLabelInfo;
        List<EcommerceEntrance.SellingPoint> list = showcaseEntranceInfo.sellingPoint;
        if (list == null) {
            showcaseEntranceInfo.sellingPoint = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<EcommerceEntrance.SellingPoint> it2 = showcaseEntranceInfo.sellingPoint.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        User.CreatorScoreProfile creatorScoreProfile = showcaseEntranceInfo.creatorScoreProfile;
        if (creatorScoreProfile != null) {
            User.CreatorScoreDisplayInfo creatorScoreDisplayInfo = creatorScoreProfile.displayInfo;
            if (creatorScoreDisplayInfo != null && (creatorScoreLabelInfo = creatorScoreDisplayInfo.ecommerceEntranceLabel) != null) {
                ImageModel imageModel = creatorScoreLabelInfo.logoDark;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
                ImageModel imageModel2 = creatorScoreLabelInfo.logoLight;
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
            if (creatorScoreProfile.scoreInfoExtra == null) {
                creatorScoreProfile.scoreInfoExtra = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo) {
        LJ(showcaseEntranceInfo);
    }

    @Override // X.C0IMD
    public final EcommerceEntrance.ShowcaseEntranceInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo, List list) {
    }
}
