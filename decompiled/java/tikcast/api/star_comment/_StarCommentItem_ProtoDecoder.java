package tikcast.api.star_comment;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message._StarCommentMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentItem_ProtoDecoder implements C0IMD<StarCommentItem> {
    public static StarCommentItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentItem starCommentItem = new StarCommentItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        starCommentItem.starComment = _StarCommentMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        starCommentItem.coins = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        starCommentItem.roomUserCount = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        starCommentItem.forceInsert = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        starCommentItem.startCommentStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        starCommentItem.serverToShowTimestampMs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarCommentItem starCommentItem) {
        StarCommentMessage starCommentMessage = starCommentItem.starComment;
        if (starCommentMessage != null) {
            _StarCommentMessage_ProtoDecoder.LJ(starCommentMessage);
        }
    }

    @Override // X.C0IMD
    public final StarCommentItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentItem starCommentItem, List list) {
    }
}
