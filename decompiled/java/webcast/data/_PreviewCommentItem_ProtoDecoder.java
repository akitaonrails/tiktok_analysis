package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PreviewCommentItem_ProtoDecoder implements C0IMD<PreviewCommentItem> {
    public static PreviewCommentItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreviewCommentItem previewCommentItem = new PreviewCommentItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        previewCommentItem.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        previewCommentItem.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        previewCommentItem.itemType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        previewCommentItem.contentType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        previewCommentItem.userAvatar = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        previewCommentItem.commentTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewCommentItem;
            }
        }
    }

    @Override // X.C0IMD
    public final PreviewCommentItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PreviewCommentItem previewCommentItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewCommentItem previewCommentItem, List list) {
    }
}
