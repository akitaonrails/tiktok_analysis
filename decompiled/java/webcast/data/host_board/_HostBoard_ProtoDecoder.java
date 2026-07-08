package webcast.data.host_board;

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
public final class _HostBoard_ProtoDecoder implements C0IMD<HostBoard> {
    public static HostBoard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HostBoard hostBoard = new HostBoard();
        hostBoard.cellList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        hostBoard.bizType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        hostBoard.subBizType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        hostBoard.boardId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        hostBoard.templateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        hostBoard.bizTemplateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        hostBoard.priority = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        hostBoard.clickAction = _ClickAction_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        hostBoard.cellList.add(_BoardCell_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        hostBoard.padding = _Padding_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        hostBoard.paramsData = c1516680pZS.LJII();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        hostBoard.nonClippable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        hostBoard.nonFoldable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        hostBoard.nonDeletable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        hostBoard.boardInfo = _BoardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hostBoard;
            }
        }
    }

    public static void LJ(HostBoard hostBoard) {
        ImageModel imageModel;
        List<BoardCell> list = hostBoard.cellList;
        if (list == null) {
            hostBoard.cellList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BoardCell boardCell : hostBoard.cellList) {
            if (boardCell != null && (imageModel = boardCell.image) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HostBoard hostBoard) {
        LJ(hostBoard);
    }

    @Override // X.C0IMD
    public final HostBoard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostBoard hostBoard, List list) {
    }
}
