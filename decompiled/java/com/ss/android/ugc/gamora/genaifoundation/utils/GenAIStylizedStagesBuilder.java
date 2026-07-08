package com.ss.android.ugc.gamora.genaifoundation.utils;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class GenAIStylizedStagesBuilder {
    public static final /* synthetic */ int LIZ = 0;

    public static final class StageReqJson {

        @C09CT("duration")
        public final int duration;

        @C09CT("ratio")
        public final String ratio;

        @C09CT("style_prompt")
        public final String stylePrompt;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StageReqJson)) {
                return false;
            }
            StageReqJson stageReqJson = (StageReqJson) obj;
            return Intrinsics.LJFF(this.ratio, stageReqJson.ratio) && Intrinsics.LJFF(this.stylePrompt, stageReqJson.stylePrompt) && this.duration == stageReqJson.duration;
        }

        public final int hashCode() {
            return (((this.ratio.hashCode() * 31) + this.stylePrompt.hashCode()) * 31) + this.duration;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StageReqJson(ratio=");
            sbLIZ.append(this.ratio);
            sbLIZ.append(", stylePrompt=");
            sbLIZ.append(this.stylePrompt);
            sbLIZ.append(", duration=");
            sbLIZ.append(this.duration);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public StageReqJson() {
            this("", "", 0);
        }

        public StageReqJson(String str, String str2, int i) {
            this.ratio = str;
            this.stylePrompt = str2;
            this.duration = i;
        }
    }
}
