package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FeedCard_ProtoDecoder implements C0IMD<FeedCard> {
    public static FeedCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FeedCard feedCard = new FeedCard();
        feedCard.linkedUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    feedCard.currentTime = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                feedCard.aiLiveSummary = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            feedCard.linkedUserList.add(_LinkedUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        feedCard.hitFypExperiment = c1516680pZS.LJIIJJI();
                    }
                } else {
                    feedCard.previewCardStyle = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return feedCard;
            }
        }
    }

    public static void LJ(FeedCard feedCard) {
        User user;
        List<LinkedUserInfo> list = feedCard.linkedUserList;
        if (list == null) {
            feedCard.linkedUserList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (LinkedUserInfo linkedUserInfo : feedCard.linkedUserList) {
            if (linkedUserInfo != null && (user = linkedUserInfo.userInfo) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FeedCard feedCard) {
        LJ(feedCard);
    }

    @Override // X.C0IMD
    public final FeedCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeedCard feedCard, List list) {
    }
}
