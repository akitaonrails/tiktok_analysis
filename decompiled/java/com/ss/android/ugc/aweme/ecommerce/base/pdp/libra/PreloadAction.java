package com.ss.android.ugc.aweme.ecommerce.base.pdp.libra;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PreloadAction {

    @C09CT("async_create_container")
    public final Integer asyncCreateContainer;

    @C09CT("count")
    public final int count;

    @C09CT("enabled")
    public final Boolean enabled;

    @C09CT("triggers")
    public final List<String> triggers;

    public PreloadAction() {
        this(null, null, 0, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadAction)) {
            return false;
        }
        PreloadAction preloadAction = (PreloadAction) obj;
        return Intrinsics.LJFF(this.enabled, preloadAction.enabled) && Intrinsics.LJFF(this.triggers, preloadAction.triggers) && this.count == preloadAction.count && Intrinsics.LJFF(this.asyncCreateContainer, preloadAction.asyncCreateContainer);
    }

    public final int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (((((bool == null ? 0 : bool.hashCode()) * 31) + this.triggers.hashCode()) * 31) + this.count) * 31;
        Integer num = this.asyncCreateContainer;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadAction(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", triggers=");
        sbLIZ.append(this.triggers);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", asyncCreateContainer=");
        sbLIZ.append(this.asyncCreateContainer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadAction(Boolean bool, List<String> list, int i, Integer num) {
        this.enabled = bool;
        this.triggers = list;
        this.count = i;
        this.asyncCreateContainer = num;
    }

    public PreloadAction(Boolean bool, List list, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Boolean.FALSE : bool, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? null : num);
    }
}
