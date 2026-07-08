package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.Board;

/* JADX INFO: loaded from: classes.dex */
public final class SMBBoardMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public int action;

    @C09CT("board")
    public Board board;

    public SMBBoardMessage() {
        this.type = C001A.S_M_B_BOARD_MESSAGE;
    }
}
