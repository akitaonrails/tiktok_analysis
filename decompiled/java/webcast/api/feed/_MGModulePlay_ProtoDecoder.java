package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGModulePlay_ProtoDecoder implements C0IMD<MGModulePlay> {
    public static MGModulePlay LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MGModulePlay mGModulePlay = new MGModulePlay();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            switch (iLJI) {
                                case 7:
                                    mGModulePlay.innerFeedMgAggId = c1516680pZS.LJIIJJI();
                                    break;
                                case 8:
                                    mGModulePlay.name = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    mGModulePlay.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    mGModulePlay.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    mGModulePlay.count = c1516680pZS.LJIIJJI();
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            mGModulePlay.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        mGModulePlay.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    mGModulePlay.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGModulePlay;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MGModulePlay mGModulePlay) {
        ImageModel imageModel = mGModulePlay.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final MGModulePlay LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGModulePlay mGModulePlay, List list) {
    }
}
