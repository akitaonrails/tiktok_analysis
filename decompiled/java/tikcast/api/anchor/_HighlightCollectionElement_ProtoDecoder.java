package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto._PublishPageParams_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighlightCollectionElement_ProtoDecoder implements C0IMD<HighlightCollectionElement> {
    public static HighlightCollectionElement LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighlightCollectionElement highlightCollectionElement = new HighlightCollectionElement();
        highlightCollectionElement.videoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        highlightCollectionElement.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        highlightCollectionElement.type = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        highlightCollectionElement.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        highlightCollectionElement.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        highlightCollectionElement.videoList.add(_HighlightCollectionVideo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        highlightCollectionElement.publishPageParams = _PublishPageParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        highlightCollectionElement.isPosted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        highlightCollectionElement.id = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        highlightCollectionElement.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        highlightCollectionElement.videoStatus = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        highlightCollectionElement.messageContentPb = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        highlightCollectionElement.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        highlightCollectionElement.originalVid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        highlightCollectionElement.originalVideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        highlightCollectionElement.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        highlightCollectionElement.roomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        highlightCollectionElement.messageShareScene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        highlightCollectionElement.postStatus = c1516680pZS.LJIIJ();
                        break;
                    case 19:
                        highlightCollectionElement.videoQualityStrategy = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        highlightCollectionElement.gifCoverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        highlightCollectionElement.isGifCover = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 22:
                        highlightCollectionElement.smallCoverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highlightCollectionElement;
            }
        }
    }

    public static void LJ(HighlightCollectionElement highlightCollectionElement) {
        List<HighlightCollectionVideo> list = highlightCollectionElement.videoList;
        if (list == null) {
            highlightCollectionElement.videoList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<HighlightCollectionVideo> it2 = highlightCollectionElement.videoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        PublishPageParams publishPageParams = highlightCollectionElement.publishPageParams;
        if (publishPageParams != null) {
            _PublishPageParams_ProtoDecoder.LJ(publishPageParams);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighlightCollectionElement highlightCollectionElement) {
        LJ(highlightCollectionElement);
    }

    @Override // X.C0IMD
    public final HighlightCollectionElement LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighlightCollectionElement highlightCollectionElement, List list) {
    }
}
