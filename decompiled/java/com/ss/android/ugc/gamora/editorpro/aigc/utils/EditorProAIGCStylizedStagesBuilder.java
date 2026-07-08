package com.ss.android.ugc.gamora.editorpro.aigc.utils;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.C2292508yZ;
import X.C2537009wu;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCStylizedAiStage;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProAIGCStylizedStagesBuilder {
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

    public static List LIZ(AIGCGenerationParam aIGCGenerationParam) {
        EditorProAIGCStylizedAiStage editorProAIGCStylizedAiStage;
        EditorProAIGCStylizedAiStage next;
        if (aIGCGenerationParam.aiCreateStylizedType == AICreateStylizedType.NONE) {
            return C13BV.INSTANCE;
        }
        if (!aIGCGenerationParam.stylizedStages.isEmpty()) {
            Iterator<EditorProAIGCStylizedAiStage> it2 = aIGCGenerationParam.stylizedStages.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getStageIndex() == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            editorProAIGCStylizedAiStage = next;
            if (editorProAIGCStylizedAiStage == null) {
                editorProAIGCStylizedAiStage = (EditorProAIGCStylizedAiStage) C13LP.LJJJJZI(aIGCGenerationParam.stylizedStages);
            }
        } else {
            String str = aIGCGenerationParam.aspectRatio;
            if (a0.LJJJIL(str)) {
                str = "keep_ratio";
            }
            String strLIZ = C2537009wu.LIZ();
            String str2 = aIGCGenerationParam.stylePrompt.i2iPrompt;
            if (a0.LJJJIL(str2)) {
                str2 = aIGCGenerationParam.stylePrompt.defaultPrompt;
            }
            String str3 = aIGCGenerationParam.stylePrompt.i2iPrompt;
            if (a0.LJJJIL(str3)) {
                str3 = aIGCGenerationParam.stylePrompt.defaultPrompt;
            }
            String strLIZJ = C2292508yZ.LIZJ(new StageReqJson(str, str3, 3));
            String str4 = aIGCGenerationParam.styleEffectId;
            if (a0.LJJJIL(str4)) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            editorProAIGCStylizedAiStage = new EditorProAIGCStylizedAiStage(0, strLIZ, strLIZJ, str2, str4, 1);
        }
        EditorProAIGCStylizedAiStage editorProAIGCStylizedAiStageCopy = editorProAIGCStylizedAiStage.copy(0, editorProAIGCStylizedAiStage.reqKey, editorProAIGCStylizedAiStage.reqJson, editorProAIGCStylizedAiStage.promptText, editorProAIGCStylizedAiStage.effectId, editorProAIGCStylizedAiStage.outputCount);
        if (!(!a0.LJJJIL(editorProAIGCStylizedAiStageCopy.getPromptText()))) {
            String str5 = aIGCGenerationParam.stylePrompt.i2iPrompt;
            if (a0.LJJJIL(str5)) {
                str5 = aIGCGenerationParam.stylePrompt.defaultPrompt;
            }
            if (!a0.LJJJIL(str5)) {
                editorProAIGCStylizedAiStageCopy = editorProAIGCStylizedAiStageCopy.copy(editorProAIGCStylizedAiStageCopy.stageIndex, editorProAIGCStylizedAiStageCopy.reqKey, editorProAIGCStylizedAiStageCopy.reqJson, str5, editorProAIGCStylizedAiStageCopy.effectId, editorProAIGCStylizedAiStageCopy.outputCount);
            }
        }
        return Collections.singletonList(editorProAIGCStylizedAiStageCopy);
    }
}
