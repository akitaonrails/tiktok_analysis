package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CreateThoughtResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("thought_info")
    public final ThoughtInfo thoughtInfo;

    public CreateThoughtResponse() {
        this(null);
    }

    public final CreateThoughtResponse copy(ThoughtInfo thoughtInfo) {
        return new CreateThoughtResponse(thoughtInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateThoughtResponse) && Intrinsics.LJFF(this.thoughtInfo, ((CreateThoughtResponse) obj).thoughtInfo);
    }

    public int hashCode() {
        ThoughtInfo thoughtInfo = this.thoughtInfo;
        if (thoughtInfo == null) {
            return 0;
        }
        return thoughtInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateThoughtResponse(thoughtInfo=");
        sbLIZ.append(this.thoughtInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ThoughtInfo getThoughtInfo() {
        return this.thoughtInfo;
    }

    public CreateThoughtResponse(ThoughtInfo thoughtInfo) {
        this.thoughtInfo = thoughtInfo;
    }
}
