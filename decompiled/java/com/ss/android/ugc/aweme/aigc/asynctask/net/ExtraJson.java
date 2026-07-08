package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C09JK;
import X.C2188811AlT;
import X.C2292508yZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes9.dex */
public final class ExtraJson {

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("rewrite_type")
    public final String rewriteType;

    @C09CT("is_ai_video_tool")
    public final int shouldPersistImage;

    public ExtraJson() {
        this("", 0, "");
    }

    public final String LIZ() {
        try {
            return C2292508yZ.LIZJ(this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RequestJson toJsonStr: ");
            sbLIZ.append(e);
            sbLIZ.append(" -");
            C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }

    public ExtraJson(String str, int i, String str2) {
        this.creationId = str;
        this.shouldPersistImage = i;
        this.rewriteType = str2;
    }
}
