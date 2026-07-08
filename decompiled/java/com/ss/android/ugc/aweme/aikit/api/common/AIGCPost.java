package com.ss.android.ugc.aweme.aikit.api.common;

import X.C09CT;
import X.C2188811AlT;
import X.C547650Ldr;
import X.InterfaceC546090LbL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCPost {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("business_key")
    public final InterfaceC546090LbL businessKey;

    @C09CT("is_story")
    public final Boolean isStory;

    public AIGCPost() {
        this(C547650Ldr.LIZ, "", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCPost)) {
            return false;
        }
        AIGCPost aIGCPost = (AIGCPost) obj;
        return Intrinsics.LJFF(this.businessKey, aIGCPost.businessKey) && Intrinsics.LJFF(this.awemeId, aIGCPost.awemeId) && Intrinsics.LJFF(this.isStory, aIGCPost.isStory);
    }

    public int hashCode() {
        int iHashCode = ((this.businessKey.hashCode() * 31) + this.awemeId.hashCode()) * 31;
        Boolean bool = this.isStory;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCPost(businessKey=");
        sbLIZ.append(this.businessKey);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.isStory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isStory() {
        return this.isStory;
    }

    public AIGCPost(InterfaceC546090LbL interfaceC546090LbL, String str, Boolean bool) {
        this.businessKey = interfaceC546090LbL;
        this.awemeId = str;
        this.isStory = bool;
    }
}
