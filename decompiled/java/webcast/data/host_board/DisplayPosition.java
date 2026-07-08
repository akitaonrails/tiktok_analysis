package webcast.data.host_board;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayPosition {

    @C09CT("alignment")
    public int alignment;

    @C09CT("margin_top")
    public long marginTop;

    public final int hashCode() {
        return (C786410Ut5.Y2(this.marginTop) * 31) + this.alignment;
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
        if (!Intrinsics.LJFF(DisplayPosition.class, cls)) {
            return false;
        }
        DisplayPosition displayPosition = (DisplayPosition) obj;
        if (this.marginTop == displayPosition.marginTop && this.alignment == displayPosition.alignment) {
            return true;
        }
        return false;
    }
}
