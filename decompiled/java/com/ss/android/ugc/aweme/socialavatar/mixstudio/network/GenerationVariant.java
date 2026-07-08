package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class GenerationVariant {

    @C09CT("generation_type")
    public final int generationType;

    @C09CT("output_type")
    public final int outputType;

    public GenerationVariant() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerationVariant)) {
            return false;
        }
        GenerationVariant generationVariant = (GenerationVariant) obj;
        return this.generationType == generationVariant.generationType && this.outputType == generationVariant.outputType;
    }

    public final int hashCode() {
        return (this.generationType * 31) + this.outputType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerationVariant(generationType=");
        sbLIZ.append(this.generationType);
        sbLIZ.append(", outputType=");
        sbLIZ.append(this.outputType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GenerationVariant(int i, int i2) {
        this.generationType = i;
        this.outputType = i2;
    }
}
