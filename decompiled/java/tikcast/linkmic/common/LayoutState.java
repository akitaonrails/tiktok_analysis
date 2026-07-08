package tikcast.linkmic.common;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutState {

    @C09CT("cohost_layout_extra")
    public CohostTypeLayoutExtra cohostLayoutExtra;

    @C09CT("cohost_layout_non_sei_extra")
    public CohostTypeLayoutNonSeiExtra cohostLayoutNonSeiExtra;

    @C09CT("layout_id")
    public String layoutId = "";

    @C09CT("layout_key")
    public String layoutKey = "";

    @C09CT("multi_guest_layout_extra")
    public MultiGuestLayoutExtra multiGuestLayoutExtra;

    @C09CT("multi_guest_layout_non_sei_extra")
    public MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra;

    public final int hashCode() {
        return this.layoutId.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LayoutState) {
            return Intrinsics.LJFF(this.layoutId, ((LayoutState) obj).layoutId);
        }
        return false;
    }
}
