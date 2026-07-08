package com.ss.android.ugc.gamora.editor.ailive.repo;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoPromptsResponse {

    @C09CT("default_prompt")
    public final AILivePhotoPromptStruct defaultPrompt;

    @C09CT("prompts")
    public final List<AILivePhotoPromptStruct> prompts;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public AILivePhotoPromptsResponse() {
        this(null, null, 0, null, 15, null);
    }

    public AILivePhotoPromptsResponse(List<AILivePhotoPromptStruct> list, AILivePhotoPromptStruct aILivePhotoPromptStruct, int i, String str) {
        this.prompts = list;
        this.defaultPrompt = aILivePhotoPromptStruct;
        this.statusCode = i;
        this.statusMessage = str;
    }

    public AILivePhotoPromptsResponse(List list, AILivePhotoPromptStruct aILivePhotoPromptStruct, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? null : aILivePhotoPromptStruct, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? "" : str);
    }
}
