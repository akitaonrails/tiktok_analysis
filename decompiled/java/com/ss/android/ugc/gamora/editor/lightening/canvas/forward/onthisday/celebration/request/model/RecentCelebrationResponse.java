package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.celebration.CelebrationParam;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class RecentCelebrationResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("celebration_params")
    public final List<CelebrationParam> celebrationParams;

    public RecentCelebrationResponse() {
        this(null);
    }

    public final RecentCelebrationResponse copy(List<CelebrationParam> list) {
        return new RecentCelebrationResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecentCelebrationResponse) && Intrinsics.LJFF(this.celebrationParams, ((RecentCelebrationResponse) obj).celebrationParams);
    }

    public int hashCode() {
        List<CelebrationParam> list = this.celebrationParams;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecentCelebrationResponse(celebrationParams=");
        sbLIZ.append(this.celebrationParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<CelebrationParam> getCelebrationParams() {
        return this.celebrationParams;
    }

    public RecentCelebrationResponse(List<CelebrationParam> list) {
        this.celebrationParams = list;
    }
}
