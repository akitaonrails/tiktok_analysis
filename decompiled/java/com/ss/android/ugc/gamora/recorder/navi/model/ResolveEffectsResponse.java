package com.ss.android.ugc.gamora.recorder.navi.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ResolveEffectsResponse extends BaseResponse {

    @C09CT("navi_resolved_effects")
    public final List<ResolvedEffect> resolvedEffects;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResolveEffectsResponse) && Intrinsics.LJFF(this.resolvedEffects, ((ResolveEffectsResponse) obj).resolvedEffects);
    }

    public final int hashCode() {
        List<ResolvedEffect> list = this.resolvedEffects;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolveEffectsResponse(resolvedEffects=");
        sbLIZ.append(this.resolvedEffects);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResolveEffectsResponse(List<ResolvedEffect> list) {
        this.resolvedEffects = list;
    }
}
