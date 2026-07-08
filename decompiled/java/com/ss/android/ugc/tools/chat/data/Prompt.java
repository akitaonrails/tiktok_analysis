package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Prompt {

    @C09CT("gen_method")
    public final String genMethod;

    @C09CT("is_newly_generated")
    public final Boolean isNewlyGenerated;

    @C09CT("prompt_id")
    public final String promptId;

    public Prompt() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prompt)) {
            return false;
        }
        Prompt prompt = (Prompt) obj;
        return Intrinsics.LJFF(this.promptId, prompt.promptId) && Intrinsics.LJFF(this.genMethod, prompt.genMethod) && Intrinsics.LJFF(this.isNewlyGenerated, prompt.isNewlyGenerated);
    }

    public final int hashCode() {
        String str = this.promptId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.genMethod;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isNewlyGenerated;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prompt(promptId=");
        sbLIZ.append(this.promptId);
        sbLIZ.append(", genMethod=");
        sbLIZ.append(this.genMethod);
        sbLIZ.append(", isNewlyGenerated=");
        sbLIZ.append(this.isNewlyGenerated);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Prompt(String str, String str2, Boolean bool) {
        this.promptId = str;
        this.genMethod = str2;
        this.isNewlyGenerated = bool;
    }
}
