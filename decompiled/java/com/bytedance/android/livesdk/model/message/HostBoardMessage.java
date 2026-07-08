package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: loaded from: classes.dex */
public final class HostBoardMessage extends AbstractC1136060ffY {

    @C09CT("board")
    public MultiHostBoard board;

    public HostBoardMessage() {
        this.type = C001A.HOST_BOARD_MESSAGE;
    }
}
