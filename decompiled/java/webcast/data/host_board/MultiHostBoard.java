package webcast.data.host_board;

import X.C09CT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MultiHostBoard {

    @C09CT("foldable")
    public boolean foldable;

    @C09CT("host_board_list")
    public List<HostBoard> hostBoardList = new ArrayList();

    @C09CT("position")
    public DisplayPosition position;

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.foldable) * 31) + this.hostBoardList.hashCode()) * 31;
        DisplayPosition displayPosition = this.position;
        return iZ2 + (displayPosition != null ? displayPosition.hashCode() : 0);
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
        if (!Intrinsics.LJFF(MultiHostBoard.class, cls)) {
            return false;
        }
        MultiHostBoard multiHostBoard = (MultiHostBoard) obj;
        if (this.foldable == multiHostBoard.foldable && Intrinsics.LJFF(this.hostBoardList, multiHostBoard.hostBoardList) && Intrinsics.LJFF(this.position, multiHostBoard.position)) {
            return true;
        }
        return false;
    }
}
