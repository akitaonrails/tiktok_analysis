package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdk.replay.proto._PublishPageParams_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto._SpriteImageItem_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _LiveFragmentDetail_ProtoDecoder implements C0IMD<LiveFragmentDetail> {
    public static LiveFragmentDetail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveFragmentDetail liveFragmentDetail = new LiveFragmentDetail();
        liveFragmentDetail.spriteList = new ArrayList();
        liveFragmentDetail.coverThemeColor = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveFragmentDetail.fragmentId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        liveFragmentDetail.fragmentIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveFragmentDetail.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        liveFragmentDetail.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveFragmentDetail.downloadUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveFragmentDetail.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        liveFragmentDetail.ownerUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        liveFragmentDetail.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveFragmentDetail.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveFragmentDetail.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveFragmentDetail.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveFragmentDetail.updateTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        liveFragmentDetail.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        liveFragmentDetail.markTime = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        liveFragmentDetail.opTime = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        liveFragmentDetail.streamUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        liveFragmentDetail.previewPicUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        liveFragmentDetail.roomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        liveFragmentDetail.ownerUserIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        liveFragmentDetail.replayCreateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 21:
                        liveFragmentDetail.isEdit = c1516680pZS.LJIIJ();
                        break;
                    case 22:
                        liveFragmentDetail.isPosted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 23:
                        liveFragmentDetail.fragmentType = c1516680pZS.LJIIJ();
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        liveFragmentDetail.height = c1516680pZS.LJIIJJI();
                        break;
                    case 25:
                        liveFragmentDetail.witdh = c1516680pZS.LJIIJJI();
                        break;
                    case 26:
                        liveFragmentDetail.isMuted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 27:
                        liveFragmentDetail.businessExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 28:
                        liveFragmentDetail.businessScore = c1516680pZS.LJIIJJI();
                        break;
                    case 29:
                        liveFragmentDetail.videoSize = c1516680pZS.LJIIJJI();
                        break;
                    case 30:
                        liveFragmentDetail.videoDuration = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 31:
                        liveFragmentDetail.forecastGenNeedTime = c1516680pZS.LJIIJJI();
                        break;
                    case 32:
                        liveFragmentDetail.replayRelativeTime = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        liveFragmentDetail.showInfo = _LiveFragmentShowInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        liveFragmentDetail.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 35:
                        liveFragmentDetail.fragmentTypeNew = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        liveFragmentDetail.spriteList.add(_SpriteImageItem_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 37:
                        liveFragmentDetail.publishPageParams = _PublishPageParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 38:
                        liveFragmentDetail.businessId = c1516680pZS.LJIIJJI();
                        break;
                    case 39:
                        liveFragmentDetail.subType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 40:
                        liveFragmentDetail.fragmentIdEncode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 41:
                        liveFragmentDetail.rendered = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 42:
                        liveFragmentDetail.resolutionChanged = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 43:
                        liveFragmentDetail.videoStatus = c1516680pZS.LJIIJ();
                        break;
                    case 44:
                        liveFragmentDetail.messageContentPb = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 45:
                        liveFragmentDetail.originalVid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 46:
                        liveFragmentDetail.originalMp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 47:
                        liveFragmentDetail.messageShareScene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 48:
                        liveFragmentDetail.postStatus = c1516680pZS.LJIIJ();
                        break;
                    case 49:
                        liveFragmentDetail.revertStatus = c1516680pZS.LJIIJ();
                        break;
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                        liveFragmentDetail.showRevertVideo = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 51:
                        liveFragmentDetail.revertMp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 52:
                        liveFragmentDetail.revertVid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 53:
                    case 54:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 55:
                        liveFragmentDetail.videoQualityStrategy = c1516680pZS.LJIIJ();
                        break;
                    case 56:
                        liveFragmentDetail.gifCoverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 57:
                        liveFragmentDetail.postByScene = c1516680pZS.LJIIJ();
                        break;
                    case 58:
                        liveFragmentDetail.itemIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 59:
                        liveFragmentDetail.isGifCover = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 60:
                        liveFragmentDetail.smallCoverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 61:
                        liveFragmentDetail.coverThemeColor.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BaseNotice.CREATOR /* 62 */:
                        liveFragmentDetail.hasDetectedMusic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 63:
                        liveFragmentDetail.longTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 64:
                        liveFragmentDetail.aiClipWidget = _AiClipWidget_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveFragmentDetail;
            }
        }
    }

    public static void LJ(LiveFragmentDetail liveFragmentDetail) {
        LiveFragmentShowInfo liveFragmentShowInfo = liveFragmentDetail.showInfo;
        List<SpriteImageItem> list = liveFragmentDetail.spriteList;
        if (list == null) {
            liveFragmentDetail.spriteList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<SpriteImageItem> it2 = liveFragmentDetail.spriteList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        PublishPageParams publishPageParams = liveFragmentDetail.publishPageParams;
        if (publishPageParams != null) {
            _PublishPageParams_ProtoDecoder.LJ(publishPageParams);
        }
        if (liveFragmentDetail.coverThemeColor == null) {
            liveFragmentDetail.coverThemeColor = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveFragmentDetail liveFragmentDetail) {
        LJ(liveFragmentDetail);
    }

    @Override // X.C0IMD
    public final LiveFragmentDetail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveFragmentDetail liveFragmentDetail, List list) {
    }
}
