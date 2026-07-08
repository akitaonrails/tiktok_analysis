package webcast.data.host_board;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoardCell_ProtoDecoder implements C0IMD<BoardCell> {
    public static BoardCell LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoardCell boardCell = new BoardCell();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        boardCell.type = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        boardCell.text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        boardCell.icon = _TuxIcon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        boardCell.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        boardCell.alignment = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        boardCell.bottomPadding = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        boardCell.clickAction = _ClickAction_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        boardCell.nonfoldable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        boardCell.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        boardCell.padding = _Padding_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        boardCell.textStyle = _TextStyle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        boardCell.imageStyle = _ImageStyle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        boardCell.paramsData = c1516680pZS.LJII();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boardCell;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BoardCell boardCell) {
        ImageModel imageModel = boardCell.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final BoardCell LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoardCell boardCell, List list) {
    }
}
