package com.ss.android.ugc.aweme.feed.model.prompt;

/* JADX INFO: loaded from: classes36.dex */
public final class PromptStructure {
    public String action;
    public String effectiveName;
    public long instructionId;
    public String name;
    public int num;

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setEffectiveName(String str) {
        this.effectiveName = str;
    }

    public final void setInstructionId(long j) {
        this.instructionId = j;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public PromptStructure(int i, String str, String str2, long j, String str3) {
        this.num = i;
        this.name = str;
        this.effectiveName = str2;
        this.instructionId = j;
        this.action = str3;
    }
}
