package com.ss.android.ugc.aweme.ui.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FontMultipliers {

    @C09CT("body")
    public final Float bodyMultiplier;

    @C09CT("header")
    public final Float headerMultiplier;

    @C09CT("paragraph")
    public final Float paragraphFactor;

    public FontMultipliers() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontMultipliers)) {
            return false;
        }
        FontMultipliers fontMultipliers = (FontMultipliers) obj;
        return Intrinsics.LJFF(this.headerMultiplier, fontMultipliers.headerMultiplier) && Intrinsics.LJFF(this.bodyMultiplier, fontMultipliers.bodyMultiplier) && Intrinsics.LJFF(this.paragraphFactor, fontMultipliers.paragraphFactor);
    }

    public final int hashCode() {
        Float f = this.headerMultiplier;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.bodyMultiplier;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.paragraphFactor;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FontMultipliers(headerMultiplier=");
        sbLIZ.append(this.headerMultiplier);
        sbLIZ.append(", bodyMultiplier=");
        sbLIZ.append(this.bodyMultiplier);
        sbLIZ.append(", paragraphFactor=");
        sbLIZ.append(this.paragraphFactor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FontMultipliers(Float f, Float f2, Float f3) {
        this.headerMultiplier = f;
        this.bodyMultiplier = f2;
        this.paragraphFactor = f3;
    }
}
