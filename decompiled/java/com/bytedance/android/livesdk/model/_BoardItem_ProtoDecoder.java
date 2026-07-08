package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoardItem_ProtoDecoder implements C0IMD<BoardItem> {
    public static BoardItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoardItem boardItem = new BoardItem();
        boardItem.boardItemContentList = new ArrayList();
        boardItem.boardItemTemplateList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        boardItem.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        boardItem.boardItemType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        boardItem.boardItemTemplateList.add(_BoardItemTemplate_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        boardItem.boardItemContentList.add(_BoardItemContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 6:
                        boardItem.position = _BoardItemPosition_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        boardItem.style = _BoardItemStyle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        boardItem.fullyCustomizedContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        boardItem.fullyCustomizedSetting = _FullyCustomizedSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        boardItem.transform = _BoardItemTransform_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        boardItem.richTextContent = _RichTextContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        boardItem.sceneryContent = _SceneryContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        boardItem.matting = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        boardItem.draggable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                        boardItem.boardItemLayout = _BoardItemLayout_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        boardItem.canvasPosition = _BoardItemPosition_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        boardItem.canvasItemLayout = _BoardItemLayout_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        boardItem.editorMode = c1516680pZS.LJIIJ();
                        break;
                    case 19:
                        boardItem.overlayImage = _ImageContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boardItem;
            }
        }
    }

    public static void LJ(BoardItem boardItem) {
        List<BoardItemTemplate> list = boardItem.boardItemTemplateList;
        if (list == null) {
            boardItem.boardItemTemplateList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<BoardItemTemplate> it2 = boardItem.boardItemTemplateList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<BoardItemContent> list2 = boardItem.boardItemContentList;
        if (list2 == null) {
            boardItem.boardItemContentList = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<BoardItemContent> it3 = boardItem.boardItemContentList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        BoardItemStyle boardItemStyle = boardItem.style;
        if (boardItemStyle != null && boardItemStyle.fonts == null) {
            boardItemStyle.fonts = new ArrayList();
        }
        RichTextContent richTextContent = boardItem.richTextContent;
        if (richTextContent != null) {
            _RichTextContent_ProtoDecoder.LJ(richTextContent);
        }
        SceneryContent sceneryContent = boardItem.sceneryContent;
        if (sceneryContent != null) {
            ImageContent imageContent = sceneryContent.imageContent;
            if (imageContent != null) {
                _ImageContent_ProtoDecoder.LJ(imageContent);
            }
            ImageContent imageContent2 = sceneryContent.templateImageContent;
            if (imageContent2 != null) {
                _ImageContent_ProtoDecoder.LJ(imageContent2);
            }
        }
        ImageContent imageContent3 = boardItem.overlayImage;
        if (imageContent3 != null) {
            _ImageContent_ProtoDecoder.LJ(imageContent3);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BoardItem boardItem) {
        LJ(boardItem);
    }

    @Override // X.C0IMD
    public final BoardItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoardItem boardItem, List list) {
    }
}
