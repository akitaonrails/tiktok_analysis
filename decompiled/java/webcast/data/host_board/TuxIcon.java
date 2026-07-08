package webcast.data.host_board;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TuxIcon {

    @C09CT("tux_icon_name")
    public String tuxIconName = "";

    public final int hashCode() {
        return this.tuxIconName.hashCode();
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
        if (!Intrinsics.LJFF(TuxIcon.class, cls)) {
            return false;
        }
        return Intrinsics.LJFF(this.tuxIconName, ((TuxIcon) obj).tuxIconName);
    }
}
