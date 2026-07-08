package webcast.data.host_board;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Padding {

    @C09CT("padding_bottom")
    public int paddingBottom;

    @C09CT("padding_left")
    public int paddingLeft;

    @C09CT("padding_right")
    public int paddingRight;

    @C09CT("padding_top")
    public int paddingTop;

    public final int hashCode() {
        return (((((this.paddingLeft * 31) + this.paddingRight) * 31) + this.paddingTop) * 31) + this.paddingBottom;
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
        if (!Intrinsics.LJFF(Padding.class, cls)) {
            return false;
        }
        Padding padding = (Padding) obj;
        if (this.paddingLeft == padding.paddingLeft && this.paddingRight == padding.paddingRight && this.paddingTop == padding.paddingTop && this.paddingBottom == padding.paddingBottom) {
            return true;
        }
        return false;
    }
}
