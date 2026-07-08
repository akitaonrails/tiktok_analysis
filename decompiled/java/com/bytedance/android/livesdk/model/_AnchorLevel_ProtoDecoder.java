package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _AnchorLevel_ProtoDecoder implements C0IMD<AnchorLevel> {
    public static AnchorLevel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorLevel anchorLevel = new AnchorLevel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorLevel.level = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        anchorLevel.experience = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        anchorLevel.lowestExperienceThisLevel = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        anchorLevel.highestExperienceThisLevel = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        anchorLevel.taskStartExperience = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        anchorLevel.taskStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        anchorLevel.taskDecreaseExperience = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        anchorLevel.taskTargetExperience = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        anchorLevel.taskEndTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        anchorLevel.profileDialogBg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        anchorLevel.profileDialogBackBg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        anchorLevel.stageLevelIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        anchorLevel.levelIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLevel;
            }
        }
    }

    public static void LJ(AnchorLevel anchorLevel) {
        ImageModel imageModel = anchorLevel.profileDialogBg;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = anchorLevel.profileDialogBackBg;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = anchorLevel.stageLevelIcon;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        ImageModel imageModel4 = anchorLevel.levelIcon;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorLevel anchorLevel) {
        LJ(anchorLevel);
    }

    @Override // X.C0IMD
    public final AnchorLevel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorLevel anchorLevel, List list) {
    }
}
