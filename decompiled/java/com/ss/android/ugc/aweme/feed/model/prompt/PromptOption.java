package com.ss.android.ugc.aweme.feed.model.prompt;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PromptOption implements Serializable {

    @C09CT("effective_name")
    public String effectiveName;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("interactive_rec_tag_type")
    public long interactiveRecTagType;
    public LocalPromptOption localPromptOption;

    @C09CT("name")
    public String name;

    @C09CT("prompt_type")
    public int promptType;

    public PromptOption() {
        this(0, "", "", 0, 0L, null);
    }

    public final void setEffectiveName(String str) {
        this.effectiveName = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setInteractiveRecTagType(long j) {
        this.interactiveRecTagType = j;
    }

    public final void setLocalPromptOption(LocalPromptOption localPromptOption) {
        this.localPromptOption = localPromptOption;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPromptType(int i) {
        this.promptType = i;
    }

    public PromptOption(int i, String str, String str2, int i2, long j, LocalPromptOption localPromptOption) {
        this.id = i;
        this.name = str;
        this.effectiveName = str2;
        this.promptType = i2;
        this.interactiveRecTagType = j;
        this.localPromptOption = localPromptOption;
    }
}
