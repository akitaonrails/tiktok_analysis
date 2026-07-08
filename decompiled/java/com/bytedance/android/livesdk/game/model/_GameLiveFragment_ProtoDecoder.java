package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameLiveFragment_ProtoDecoder implements C0IMD<GameLiveFragment> {
    public static GameLiveFragment LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameLiveFragment gameLiveFragment = new GameLiveFragment();
        gameLiveFragment.spriteList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gameLiveFragment.fragmentId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        gameLiveFragment.fragmentIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        gameLiveFragment.roomId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 4:
                        gameLiveFragment.fragmentType = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 5:
                        gameLiveFragment.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        gameLiveFragment.downloadUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        gameLiveFragment.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        gameLiveFragment.ownerUserId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        gameLiveFragment.startTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        gameLiveFragment.endTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        gameLiveFragment.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        gameLiveFragment.createTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        gameLiveFragment.updateTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 14:
                        gameLiveFragment.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        gameLiveFragment.status = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 16:
                        gameLiveFragment.markTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        gameLiveFragment.opTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        gameLiveFragment.streamUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        gameLiveFragment.previewPicUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        gameLiveFragment.roomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        gameLiveFragment.ownerUserIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        gameLiveFragment.replayCreateTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 23:
                        gameLiveFragment.isEdit = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        gameLiveFragment.spriteList.add(_Sprite_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 25:
                        gameLiveFragment.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        gameLiveFragment.encodeStatus = c1516680pZS.LJIIJ();
                        break;
                    case 27:
                        gameLiveFragment.isMuted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 28:
                        gameLiveFragment.showInfo = _LiveFragmentShowInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 29:
                        gameLiveFragment.replayRelativeTime = c1516680pZS.LJIIJJI();
                        break;
                    case 30:
                        gameLiveFragment.autocutRelationInfo = _AutocutRelationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 31:
                        gameLiveFragment.roomStarLiveTimestsamp = c1516680pZS.LJIIJJI();
                        break;
                    case 32:
                        gameLiveFragment.autocutLogInfo = _AutocutLogInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        gameLiveFragment.gameHighlightType = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        gameLiveFragment.postByScene = c1516680pZS.LJIIJ();
                        break;
                    case 35:
                        gameLiveFragment.isPosted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        gameLiveFragment.itemIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameLiveFragment;
            }
        }
    }

    public static void LJ(GameLiveFragment gameLiveFragment) {
        List<Sprite> list = gameLiveFragment.spriteList;
        if (list == null) {
            gameLiveFragment.spriteList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<Sprite> it2 = gameLiveFragment.spriteList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameLiveFragment gameLiveFragment) {
        LJ(gameLiveFragment);
    }

    @Override // X.C0IMD
    public final GameLiveFragment LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameLiveFragment gameLiveFragment, List list) {
    }
}
