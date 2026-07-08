package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AutofillDisclaimerModel implements Serializable {

    @C09CT("desc")
    public final String desc = "";

    @C09CT("prompt")
    public final String prompt = "";

    @C09CT("learn_more")
    public final String learnMore = "";

    public final String getDesc() {
        return this.desc;
    }

    public final String getLearnMore() {
        return this.learnMore;
    }

    public final String getPrompt() {
        return this.prompt;
    }
}
