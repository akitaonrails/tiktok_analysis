package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ViewerPicksInfo_ProtoDecoder implements C0IMD<ViewerPicksInfo> {
    public static ViewerPicksInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ViewerPicksInfo viewerPicksInfo = new ViewerPicksInfo();
        viewerPicksInfo.giftPickList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        viewerPicksInfo.viewerPicksId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        viewerPicksInfo.giftPickList.add(_GiftPickWithScore_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        viewerPicksInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        viewerPicksInfo.roundDurationSec = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        viewerPicksInfo.startTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        viewerPicksInfo.endTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        viewerPicksInfo.hasDuration = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        viewerPicksInfo.hasScore = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        viewerPicksInfo.enableAutoRestart = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        viewerPicksInfo.startedFromAutoRestart = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        viewerPicksInfo.viewerPicksIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        viewerPicksInfo.displayMode = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        viewerPicksInfo.scene = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        viewerPicksInfo.headerImage = _ViewerPicksHeaderImage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        viewerPicksInfo.anchorParam = _ViewerPickAnchorParam_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        viewerPicksInfo.extra = _ProfileExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        viewerPicksInfo.startedFromAutoStart = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return viewerPicksInfo;
            }
        }
    }

    public static void LJ(ViewerPicksInfo viewerPicksInfo) {
        GiftPick giftPick;
        ProfileExtraGameTricks profileExtraGameTricks;
        ProfileExtraGameTricksStorage profileExtraGameTricksStorage;
        GameTricksShortcut gameTricksShortcut;
        ImageModel imageModel;
        List<GiftPickWithScore> list = viewerPicksInfo.giftPickList;
        if (list == null) {
            viewerPicksInfo.giftPickList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftPickWithScore giftPickWithScore : viewerPicksInfo.giftPickList) {
                if (giftPickWithScore != null && (giftPick = giftPickWithScore.giftPick) != null) {
                    _GiftPick_ProtoDecoder.LJ(giftPick);
                }
            }
        }
        ViewerPicksHeaderImage viewerPicksHeaderImage = viewerPicksInfo.headerImage;
        if (viewerPicksHeaderImage != null && (imageModel = viewerPicksHeaderImage.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ProfileExtra profileExtra = viewerPicksInfo.extra;
        if (profileExtra != null && (profileExtraGameTricks = profileExtra.gameTricks) != null && (profileExtraGameTricksStorage = profileExtraGameTricks.storage) != null && (gameTricksShortcut = profileExtraGameTricksStorage.gameTricksShortcut) != null) {
            _GameTricksShortcut_ProtoDecoder.LJ(gameTricksShortcut);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ViewerPicksInfo viewerPicksInfo) {
        LJ(viewerPicksInfo);
    }

    @Override // X.C0IMD
    public final ViewerPicksInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ViewerPicksInfo viewerPicksInfo, List list) {
    }
}
