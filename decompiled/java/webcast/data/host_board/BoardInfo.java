package webcast.data.host_board;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BoardInfo {

    @C09CT("board_name")
    public String boardName = "";

    @C09CT("board_delete_title")
    public String boardDeleteTitle = "";

    @C09CT("board_delete_subtitle")
    public String boardDeleteSubtitle = "";

    public final int hashCode() {
        return (((this.boardName.hashCode() * 31) + this.boardDeleteTitle.hashCode()) * 31) + this.boardDeleteSubtitle.hashCode();
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
        if (!Intrinsics.LJFF(BoardInfo.class, cls)) {
            return false;
        }
        BoardInfo boardInfo = (BoardInfo) obj;
        if (Intrinsics.LJFF(this.boardName, boardInfo.boardName) && Intrinsics.LJFF(this.boardDeleteTitle, boardInfo.boardDeleteTitle) && Intrinsics.LJFF(this.boardDeleteSubtitle, boardInfo.boardDeleteSubtitle)) {
            return true;
        }
        return false;
    }
}
