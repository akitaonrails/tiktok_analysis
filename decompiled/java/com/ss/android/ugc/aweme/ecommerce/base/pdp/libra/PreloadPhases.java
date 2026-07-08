package com.ss.android.ugc.aweme.ecommerce.base.pdp.libra;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PreloadPhases {

    @C09CT("container_precreate")
    public final PreloadAction containerPrecreate;

    @C09CT("container_reuse")
    public final PreloadAction containerReuse;

    @C09CT("template_predecode")
    public final PreloadAction templatePredecode;

    public PreloadPhases() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadPhases)) {
            return false;
        }
        PreloadPhases preloadPhases = (PreloadPhases) obj;
        return Intrinsics.LJFF(this.templatePredecode, preloadPhases.templatePredecode) && Intrinsics.LJFF(this.containerPrecreate, preloadPhases.containerPrecreate) && Intrinsics.LJFF(this.containerReuse, preloadPhases.containerReuse);
    }

    public final int hashCode() {
        PreloadAction preloadAction = this.templatePredecode;
        int iHashCode = (preloadAction == null ? 0 : preloadAction.hashCode()) * 31;
        PreloadAction preloadAction2 = this.containerPrecreate;
        int iHashCode2 = (iHashCode + (preloadAction2 == null ? 0 : preloadAction2.hashCode())) * 31;
        PreloadAction preloadAction3 = this.containerReuse;
        return iHashCode2 + (preloadAction3 != null ? preloadAction3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadPhases(templatePredecode=");
        sbLIZ.append(this.templatePredecode);
        sbLIZ.append(", containerPrecreate=");
        sbLIZ.append(this.containerPrecreate);
        sbLIZ.append(", containerReuse=");
        sbLIZ.append(this.containerReuse);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadPhases(PreloadAction preloadAction, PreloadAction preloadAction2, PreloadAction preloadAction3) {
        this.templatePredecode = preloadAction;
        this.containerPrecreate = preloadAction2;
        this.containerReuse = preloadAction3;
    }
}
