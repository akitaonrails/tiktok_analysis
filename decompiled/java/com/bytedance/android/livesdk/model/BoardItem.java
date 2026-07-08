package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BoardItem {

    @C09CT("board_item_layout")
    public BoardItemLayout boardItemLayout;

    @C09CT("board_item_type")
    public int boardItemType;

    @C09CT("canvas_item_layout")
    public BoardItemLayout canvasItemLayout;

    @C09CT("canvas_position")
    public BoardItemPosition canvasPosition;

    @C09CT("draggable")
    public boolean draggable;

    @C09CT("editor_mode")
    public int editorMode;

    @C09CT("fully_customized_setting")
    public FullyCustomizedSetting fullyCustomizedSetting;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("matting")
    public boolean matting;

    @C09CT("overlay_image")
    public ImageContent overlayImage;

    @C09CT("position")
    public BoardItemPosition position;

    @C09CT("rich_text_content")
    public RichTextContent richTextContent;

    @C09CT("scenery_content")
    public SceneryContent sceneryContent;

    @C09CT("style")
    public BoardItemStyle style;

    @C09CT("transform")
    public BoardItemTransform transform;

    @C09CT("board_item_template_list")
    public List<BoardItemTemplate> boardItemTemplateList = new ArrayList();

    @C09CT("board_item_content_list")
    public List<BoardItemContent> boardItemContentList = new ArrayList();

    @C09CT("fully_customized_content")
    public String fullyCustomizedContent = "";

    public final BoardItem LIZ() {
        BoardItemPosition boardItemPosition;
        BoardItem boardItem = new BoardItem();
        boardItem.id = this.id;
        boardItem.boardItemType = this.boardItemType;
        Iterator<BoardItemTemplate> it2 = this.boardItemTemplateList.iterator();
        while (it2.hasNext()) {
            boardItem.boardItemTemplateList.add(it2.next());
        }
        for (BoardItemContent boardItemContent : this.boardItemContentList) {
            List<BoardItemContent> list = boardItem.boardItemContentList;
            boardItemContent.getClass();
            BoardItemContent boardItemContent2 = new BoardItemContent();
            boardItemContent2.content = boardItemContent.content;
            boardItemContent2.contentText0 = boardItemContent.contentText0;
            boardItemContent2.contentText1 = boardItemContent.contentText1;
            boardItemContent2.contentText2 = boardItemContent.contentText2;
            list.add(boardItemContent2);
        }
        BoardItemPosition boardItemPosition2 = this.position;
        BoardItemPosition boardItemPosition3 = null;
        if (boardItemPosition2 != null) {
            boardItemPosition = new BoardItemPosition();
            boardItemPosition.x = boardItemPosition2.x;
            boardItemPosition.y = boardItemPosition2.y;
            boardItemPosition.percentageX = boardItemPosition2.percentageX;
            boardItemPosition.percentageY = boardItemPosition2.percentageY;
        } else {
            boardItemPosition = null;
        }
        boardItem.position = boardItemPosition;
        BoardItemStyle boardItemStyle = this.style;
        boardItem.style = boardItemStyle != null ? boardItemStyle.LIZ() : null;
        boardItem.fullyCustomizedContent = this.fullyCustomizedContent;
        boardItem.fullyCustomizedSetting = this.fullyCustomizedSetting;
        boardItem.transform = this.transform;
        boardItem.richTextContent = this.richTextContent;
        boardItem.sceneryContent = this.sceneryContent;
        boardItem.matting = this.matting;
        boardItem.draggable = this.draggable;
        boardItem.boardItemLayout = this.boardItemLayout;
        boardItem.canvasItemLayout = this.canvasItemLayout;
        BoardItemPosition boardItemPosition4 = this.canvasPosition;
        if (boardItemPosition4 != null) {
            boardItemPosition3 = new BoardItemPosition();
            boardItemPosition3.x = boardItemPosition4.x;
            boardItemPosition3.y = boardItemPosition4.y;
            boardItemPosition3.percentageX = boardItemPosition4.percentageX;
            boardItemPosition3.percentageY = boardItemPosition4.percentageY;
        }
        boardItem.canvasPosition = boardItemPosition3;
        boardItem.overlayImage = this.overlayImage;
        boardItem.editorMode = this.editorMode;
        return boardItem;
    }
}
