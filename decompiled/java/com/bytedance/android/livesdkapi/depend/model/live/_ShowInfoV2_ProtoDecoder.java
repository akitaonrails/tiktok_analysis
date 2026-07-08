package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShowInfoV2_ProtoDecoder implements C0IMD<ShowInfoV2> {
    public static ShowInfoV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShowInfoV2 showInfoV2 = new ShowInfoV2();
        showInfoV2.guestInfoList = new ArrayList();
        showInfoV2.anchors = new ArrayList();
        showInfoV2.musicInfoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        showInfoV2.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        showInfoV2.showStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        showInfoV2.showEndTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        showInfoV2.anchors.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        showInfoV2.showIntroduction = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        showInfoV2.showDisplayName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        showInfoV2.guestInfoList.add(_GuestInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        showInfoV2.musicInfoList.add(_MusicInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        showInfoV2.status = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        showInfoV2.maxNotifyNum = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        showInfoV2.currentNotifyNum = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 14:
                        showInfoV2.secondaryPage = _SecondaryPageInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        showInfoV2.bannerInfo = _TopFrameBannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showInfoV2;
            }
        }
    }

    public static void LJ(ShowInfoV2 showInfoV2) {
        List<User> list = showInfoV2.anchors;
        if (list == null) {
            showInfoV2.anchors = new ArrayList();
        } else if (!list.isEmpty()) {
            for (User user : showInfoV2.anchors) {
                if (user != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<GuestInfo> list2 = showInfoV2.guestInfoList;
        if (list2 == null) {
            showInfoV2.guestInfoList = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<GuestInfo> it2 = showInfoV2.guestInfoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<MusicInfo> list3 = showInfoV2.musicInfoList;
        if (list3 == null) {
            showInfoV2.musicInfoList = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (MusicInfo musicInfo : showInfoV2.musicInfoList) {
                if (musicInfo != null) {
                    _MusicInfo_ProtoDecoder.LJ(musicInfo);
                }
            }
        }
        TopFrameBannerInfo topFrameBannerInfo = showInfoV2.bannerInfo;
        if (topFrameBannerInfo != null) {
            _TopFrameBannerInfo_ProtoDecoder.LJ(topFrameBannerInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShowInfoV2 showInfoV2) {
        LJ(showInfoV2);
    }

    @Override // X.C0IMD
    public final ShowInfoV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShowInfoV2 showInfoV2, List list) {
    }
}
