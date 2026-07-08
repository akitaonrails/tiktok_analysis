package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class _MGModuleInteraction_ProtoDecoder implements C0IMD<MGModuleInteraction> {
    public static MGModuleInteraction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGModuleInteraction mGModuleInteraction = new MGModuleInteraction();
        mGModuleInteraction.avatars = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        mGModuleInteraction.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        mGModuleInteraction.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        mGModuleInteraction.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        mGModuleInteraction.btnTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 6:
                        mGModuleInteraction.avatars.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        mGModuleInteraction.friendUid = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        mGModuleInteraction.friendAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        mGModuleInteraction.innerFeedMgAggId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        mGModuleInteraction.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        mGModuleInteraction.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        mGModuleInteraction.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        mGModuleInteraction.count = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGModuleInteraction;
            }
        }
    }

    public static void LJ(MGModuleInteraction mGModuleInteraction) {
        List<ImageModel> list = mGModuleInteraction.avatars;
        if (list == null) {
            mGModuleInteraction.avatars = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ImageModel imageModel : mGModuleInteraction.avatars) {
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        ImageModel imageModel2 = mGModuleInteraction.friendAvatar;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = mGModuleInteraction.icon;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MGModuleInteraction mGModuleInteraction) {
        LJ(mGModuleInteraction);
    }

    @Override // X.C0IMD
    public final MGModuleInteraction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGModuleInteraction mGModuleInteraction, List list) {
    }
}
