package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message._StarCommentMessage_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentQueue_ProtoDecoder implements C0IMD<StarCommentQueue> {
    public static StarCommentQueue LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentQueue starCommentQueue = new StarCommentQueue();
        starCommentQueue.starCommentList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        starCommentQueue.queueVersion = c1516680pZS.LJIIJ();
                    }
                } else {
                    starCommentQueue.starCommentList.add(_StarCommentItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentQueue;
            }
        }
    }

    public static void LJ(StarCommentQueue starCommentQueue) {
        StarCommentMessage starCommentMessage;
        List<StarCommentItem> list = starCommentQueue.starCommentList;
        if (list == null) {
            starCommentQueue.starCommentList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (StarCommentItem starCommentItem : starCommentQueue.starCommentList) {
            if (starCommentItem != null && (starCommentMessage = starCommentItem.starComment) != null) {
                _StarCommentMessage_ProtoDecoder.LJ(starCommentMessage);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarCommentQueue starCommentQueue) {
        LJ(starCommentQueue);
    }

    @Override // X.C0IMD
    public final StarCommentQueue LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentQueue starCommentQueue, List list) {
    }
}
