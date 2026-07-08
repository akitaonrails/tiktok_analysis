package com.ss.android.ugc.gamora.editor.ailive.repo;

import X.C09CT;
import X.C123100dR;
import X.C274160Aoo;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoPromptStruct {

    @C09CT("algo_param")
    public final String algoParam;

    @C09CT("model_prompt")
    public final String modelPrompt;

    @C09CT("model_key")
    public final String modelReqKey;

    @C09CT("text")
    public final String prompt;

    @C09CT("type")
    public final String type;

    public AILivePhotoPromptStruct() {
        this("", "", "", null, "");
    }

    public final PromptModel LIZ(boolean z) {
        String str;
        PromptType promptType;
        String str2 = this.prompt;
        if (C123100dR.LIZ(this.modelPrompt)) {
            str = this.modelPrompt;
        } else {
            str = this.prompt;
        }
        if (Intrinsics.LJFF(this.type, "gpt_recommend")) {
            promptType = PromptType.RECOMMEND_FROM_GPT;
        } else {
            promptType = PromptType.RECOMMEND_PRESET;
        }
        String str3 = this.type;
        String strLIZ = this.modelReqKey;
        if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
            strLIZ = C274160Aoo.LIZ();
        }
        return new PromptModel(str2, str, promptType, str3, strLIZ, this.algoParam, z);
    }

    public AILivePhotoPromptStruct(String str, String str2, String str3, String str4, String str5) {
        this.prompt = str;
        this.modelPrompt = str2;
        this.type = str3;
        this.modelReqKey = str4;
        this.algoParam = str5;
    }
}
