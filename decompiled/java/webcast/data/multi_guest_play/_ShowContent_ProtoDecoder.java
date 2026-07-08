package webcast.data.multi_guest_play;

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

/* JADX INFO: loaded from: classes.dex */
public final class _ShowContent_ProtoDecoder implements C0IMD<ShowContent> {
    public static ShowContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShowContent showContent = new ShowContent();
        showContent.showingAndReadyList = new ArrayList();
        showContent.finishedList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        showContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        showContent.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        showContent.showId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        showContent.showStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        showContent.version = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        showContent.showCreateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        showContent.showConfig = _ShowConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        showContent.showingAndReadyList.add(_ShowListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        showContent.finishedList.add(_ShowListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        showContent.transitionInfo = _TransitionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showContent;
            }
        }
    }

    public static void LJ(ShowContent showContent) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        List<ShowListUser> list = showContent.showingAndReadyList;
        if (list == null) {
            showContent.showingAndReadyList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ShowListUser showListUser : showContent.showingAndReadyList) {
                if (showListUser != null && (imageModel = showListUser.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<ShowListUser> list2 = showContent.finishedList;
        if (list2 == null) {
            showContent.finishedList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (ShowListUser showListUser2 : showContent.finishedList) {
                if (showListUser2 != null && (imageModel2 = showListUser2.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        TransitionInfo transitionInfo = showContent.transitionInfo;
        if (transitionInfo != null && (imageModel3 = transitionInfo.avatarThumb) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShowContent showContent) {
        LJ(showContent);
    }

    @Override // X.C0IMD
    public final ShowContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShowContent showContent, List list) {
    }
}
