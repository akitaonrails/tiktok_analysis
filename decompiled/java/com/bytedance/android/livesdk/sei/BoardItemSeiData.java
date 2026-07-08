package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BoardItemSeiData {

    @C09CT("board_pos")
    public final BoardPosSeiData boardPos;

    @C09CT("board_size")
    public final BoardSizeSeiData boardSize;

    @C09CT("native_render")
    public final Boolean nativeRender;

    public BoardItemSeiData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardItemSeiData)) {
            return false;
        }
        BoardItemSeiData boardItemSeiData = (BoardItemSeiData) obj;
        return Intrinsics.LJFF(this.boardPos, boardItemSeiData.boardPos) && Intrinsics.LJFF(this.boardSize, boardItemSeiData.boardSize) && Intrinsics.LJFF(this.nativeRender, boardItemSeiData.nativeRender);
    }

    public final int hashCode() {
        BoardPosSeiData boardPosSeiData = this.boardPos;
        int iHashCode = (boardPosSeiData == null ? 0 : boardPosSeiData.hashCode()) * 31;
        BoardSizeSeiData boardSizeSeiData = this.boardSize;
        int iHashCode2 = (iHashCode + (boardSizeSeiData == null ? 0 : boardSizeSeiData.hashCode())) * 31;
        Boolean bool = this.nativeRender;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardItemSeiData(boardPos=");
        sbLIZ.append(this.boardPos);
        sbLIZ.append(", boardSize=");
        sbLIZ.append(this.boardSize);
        sbLIZ.append(", nativeRender=");
        sbLIZ.append(this.nativeRender);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BoardItemSeiData(BoardPosSeiData boardPosSeiData, BoardSizeSeiData boardSizeSeiData, Boolean bool) {
        this.boardPos = boardPosSeiData;
        this.boardSize = boardSizeSeiData;
        this.nativeRender = bool;
    }
}
