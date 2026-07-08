package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GenerationDetails {

    @C09CT("music_id")
    public final String musicId;

    @C09CT("prompt")
    public final Prompt prompt;

    public GenerationDetails() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerationDetails)) {
            return false;
        }
        GenerationDetails generationDetails = (GenerationDetails) obj;
        return Intrinsics.LJFF(this.prompt, generationDetails.prompt) && Intrinsics.LJFF(this.musicId, generationDetails.musicId);
    }

    public final int hashCode() {
        Prompt prompt = this.prompt;
        int iHashCode = (prompt == null ? 0 : prompt.hashCode()) * 31;
        String str = this.musicId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerationDetails(prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GenerationDetails(Prompt prompt, String str) {
        this.prompt = prompt;
        this.musicId = str;
    }
}
