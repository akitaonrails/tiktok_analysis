package com.ss.android.ugc.aweme.feed.model.prompt;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PromptResult implements Serializable {

    @C09CT("negative_prompt_details")
    public PromptDetail negativePromptDetails;

    @C09CT("positive_prompt_details")
    public PromptDetail positivePromptDetails;

    public PromptResult() {
        this(null, null);
    }

    public final void setNegativePromptDetails(PromptDetail promptDetail) {
        this.negativePromptDetails = promptDetail;
    }

    public final void setPositivePromptDetails(PromptDetail promptDetail) {
        this.positivePromptDetails = promptDetail;
    }

    public PromptResult(PromptDetail promptDetail, PromptDetail promptDetail2) {
        this.positivePromptDetails = promptDetail;
        this.negativePromptDetails = promptDetail2;
        if (promptDetail != null) {
            promptDetail.setDetailActionType(PromptDetailActionType.MORE);
        }
        PromptDetail promptDetail3 = this.negativePromptDetails;
        if (promptDetail3 != null) {
            promptDetail3.setDetailActionType(PromptDetailActionType.FEWER);
        }
    }
}
