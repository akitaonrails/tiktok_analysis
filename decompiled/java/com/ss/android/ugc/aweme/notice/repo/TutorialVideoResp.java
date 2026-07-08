package com.ss.android.ugc.aweme.notice.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TutorialVideoResp extends BaseResponse {

    @C09CT("msg_info")
    public final TutorialVideoInfo info;

    public TutorialVideoResp() {
        this(null);
    }

    public final TutorialVideoResp copy(TutorialVideoInfo tutorialVideoInfo) {
        return new TutorialVideoResp(tutorialVideoInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TutorialVideoResp) && Intrinsics.LJFF(this.info, ((TutorialVideoResp) obj).info);
    }

    public int hashCode() {
        TutorialVideoInfo tutorialVideoInfo = this.info;
        if (tutorialVideoInfo == null) {
            return 0;
        }
        return tutorialVideoInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TutorialVideoResp(info=");
        sbLIZ.append(this.info);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final TutorialVideoInfo getInfo() {
        return this.info;
    }

    public TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo) {
        this.info = tutorialVideoInfo;
    }
}
