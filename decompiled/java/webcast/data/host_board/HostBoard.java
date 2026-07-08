package webcast.data.host_board;

import X.C09CT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HostBoard {

    @C09CT("board_info")
    public BoardInfo boardInfo;

    @C09CT("click_action")
    public ClickAction clickAction;

    @C09CT("non_clippable")
    public boolean nonClippable;

    @C09CT("non_deletable")
    public boolean nonDeletable;

    @C09CT("non_foldable")
    public boolean nonFoldable;

    @C09CT("padding")
    public Padding padding;

    @C09CT("params_data")
    public byte[] paramsData;

    @C09CT("priority")
    public int priority;

    @C09CT("biz_type")
    public String bizType = "";

    @C09CT("sub_biz_type")
    public String subBizType = "";

    @C09CT("board_id")
    public String boardId = "";

    @C09CT("template_id")
    public String templateId = "";

    @C09CT("biz_template_id")
    public String bizTemplateId = "";

    @C09CT("cell_list")
    public List<BoardCell> cellList = new ArrayList();

    public final int hashCode() {
        int iHashCode = ((((((((((this.priority * 31) + this.bizType.hashCode()) * 31) + this.subBizType.hashCode()) * 31) + this.boardId.hashCode()) * 31) + this.templateId.hashCode()) * 31) + this.bizTemplateId.hashCode()) * 31;
        ClickAction clickAction = this.clickAction;
        int iHashCode2 = (((iHashCode + (clickAction != null ? clickAction.hashCode() : 0)) * 31) + this.cellList.hashCode()) * 31;
        Padding padding = this.padding;
        int iHashCode3 = (iHashCode2 + (padding != null ? padding.hashCode() : 0)) * 31;
        byte[] bArr = this.paramsData;
        int iHashCode4 = (((((((iHashCode3 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + C786410Ut5.Z2(this.nonClippable)) * 31) + C786410Ut5.Z2(this.nonFoldable)) * 31) + C786410Ut5.Z2(this.nonDeletable)) * 31;
        BoardInfo boardInfo = this.boardInfo;
        return iHashCode4 + (boardInfo != null ? boardInfo.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(HostBoard.class, cls)) {
            return false;
        }
        HostBoard hostBoard = (HostBoard) obj;
        if (this.priority == hostBoard.priority && Intrinsics.LJFF(this.bizType, hostBoard.bizType) && Intrinsics.LJFF(this.subBizType, hostBoard.subBizType) && Intrinsics.LJFF(this.boardId, hostBoard.boardId) && Intrinsics.LJFF(this.templateId, hostBoard.templateId) && Intrinsics.LJFF(this.bizTemplateId, hostBoard.bizTemplateId) && Intrinsics.LJFF(this.clickAction, hostBoard.clickAction) && Intrinsics.LJFF(this.cellList, hostBoard.cellList) && Intrinsics.LJFF(this.padding, hostBoard.padding) && Arrays.equals(this.paramsData, hostBoard.paramsData) && this.nonClippable == hostBoard.nonClippable && this.nonFoldable == hostBoard.nonFoldable && this.nonDeletable == hostBoard.nonDeletable && Intrinsics.LJFF(this.boardInfo, hostBoard.boardInfo)) {
            return true;
        }
        return false;
    }
}
