package com.bytedance.android.livesdk.model;

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
public final class _Board_ProtoDecoder implements C0IMD<Board> {
    public static Board LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Board board = new Board();
        board.boardItemList = new ArrayList();
        board.previewImageUriList = new ArrayList();
        board.previewImageList = new ArrayList();
        board.smbReviewInterceptionReasons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        board.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        board.boardItemList.add(_BoardItem_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        board.previewImageUri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        board.previewImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        board.status = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        board.reviewId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        board.previewImageUriList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        board.previewImageList.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        board.version = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        board.violationId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        board.templateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        board.recommendBoardInfo = _RecommendBoardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        board.smbReviewId = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        board.smbReviewInterceptionReasons.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 16:
                        board.previewBgColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        board.dslVersion = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        board.minCompatibleDslVersion = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return board;
            }
        }
    }

    public static void LJ(Board board) {
        List<BoardItem> list = board.boardItemList;
        if (list == null) {
            board.boardItemList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (BoardItem boardItem : board.boardItemList) {
                if (boardItem != null) {
                    _BoardItem_ProtoDecoder.LJ(boardItem);
                }
            }
        }
        ImageModel imageModel = board.previewImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (board.previewImageUriList == null) {
            board.previewImageUriList = new ArrayList();
        }
        List<ImageModel> list2 = board.previewImageList;
        if (list2 == null) {
            board.previewImageList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (ImageModel imageModel2 : board.previewImageList) {
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
        if (board.smbReviewInterceptionReasons == null) {
            board.smbReviewInterceptionReasons = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Board board) {
        LJ(board);
    }

    @Override // X.C0IMD
    public final Board LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Board board, List list) {
    }
}
