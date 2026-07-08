package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplaceInfo implements Serializable {

    @C09CT("covers")
    public List<List<String>> covers;

    @C09CT("instructions")
    public List<Long> instructions;

    @C09CT("question")
    public Question question;

    @C09CT("returned_prompts")
    public List<String> returnedPrompt;

    public ReplaceInfo() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplaceInfo(question=");
        sbLIZ.append(this.question);
        sbLIZ.append(", returnedPrompt=");
        sbLIZ.append(this.returnedPrompt);
        sbLIZ.append(", covers=");
        sbLIZ.append(this.covers);
        sbLIZ.append(", instructions=");
        sbLIZ.append(this.instructions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setCovers(List<List<String>> list) {
        this.covers = list;
    }

    public final void setInstructions(List<Long> list) {
        this.instructions = list;
    }

    public final void setQuestion(Question question) {
        this.question = question;
    }

    public final void setReturnedPrompt(List<String> list) {
        this.returnedPrompt = list;
    }

    public ReplaceInfo(Question question, List<String> list, List<List<String>> list2, List<Long> list3) {
        this.question = question;
        this.returnedPrompt = list;
        this.covers = list2;
        this.instructions = list3;
    }
}
