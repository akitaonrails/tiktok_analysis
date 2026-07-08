package com.ss.android.ugc.aweme.feed.model.prompt;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class LocalPromptOption implements Serializable {
    public final String action;
    public final String content;
    public final String entityInfo;
    public final String instructionId;
    public final String isI2I;
    public final String userContent;

    public final String isI2I() {
        return this.isI2I;
    }

    public LocalPromptOption(String str, String str2, String str3, String str4, String str5, String str6) {
        this.content = str;
        this.userContent = str2;
        this.entityInfo = str3;
        this.instructionId = str4;
        this.isI2I = str5;
        this.action = str6;
    }
}
