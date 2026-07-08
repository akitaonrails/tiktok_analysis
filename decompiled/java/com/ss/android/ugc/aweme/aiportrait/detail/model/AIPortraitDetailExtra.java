package com.ss.android.ugc.aweme.aiportrait.detail.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitDetailExtra implements Serializable {
    public static final int $stable = 8;

    @C09CT("follow_prompt_id")
    public String followPromptId;

    @C09CT("gen_type")
    public int genType;

    @C09CT("is_ref_image")
    public Integer isRefImage;

    @C09CT("prompt_source")
    public String promptSource;

    @C09CT("root_prompt_id")
    public String rootPromptId;

    public AIPortraitDetailExtra() {
        this(null, null, null, null, 0);
    }

    public final String getFollowPromptId() {
        return this.followPromptId;
    }

    public final int getGenType() {
        return this.genType;
    }

    public final String getPromptSource() {
        return this.promptSource;
    }

    public final String getRootPromptId() {
        return this.rootPromptId;
    }

    public final Integer isRefImage() {
        return this.isRefImage;
    }

    public final void setFollowPromptId(String str) {
        this.followPromptId = str;
    }

    public final void setGenType(int i) {
        this.genType = i;
    }

    public final void setPromptSource(String str) {
        this.promptSource = str;
    }

    public final void setRefImage(Integer num) {
        this.isRefImage = num;
    }

    public final void setRootPromptId(String str) {
        this.rootPromptId = str;
    }

    public AIPortraitDetailExtra(String str, String str2, Integer num, String str3, int i) {
        this.followPromptId = str;
        this.rootPromptId = str2;
        this.isRefImage = num;
        this.promptSource = str3;
        this.genType = i;
    }
}
