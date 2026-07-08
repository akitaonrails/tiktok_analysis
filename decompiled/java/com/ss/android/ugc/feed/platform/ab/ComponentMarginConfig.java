package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class ComponentMarginConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("standardize_bottom_space")
    public final float bottomGap;

    @C09CT("standardize_top_space")
    public final float topGap;

    public ComponentMarginConfig() {
        this(0.0f, 8.0f);
    }

    public final ComponentMarginConfig copy(float f, float f2) {
        return new ComponentMarginConfig(f, f2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentMarginConfig(bottomGap=");
        sbLIZ.append(this.bottomGap);
        sbLIZ.append(", topGap=");
        sbLIZ.append(this.topGap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ComponentMarginConfig(float f, float f2) {
        this.bottomGap = f;
        this.topGap = f2;
    }
}
