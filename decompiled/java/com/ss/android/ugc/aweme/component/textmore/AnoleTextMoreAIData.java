package com.ss.android.ugc.aweme.component.textmore;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleTextMoreAIData implements Serializable {
    public static final int $stable = 8;

    @C09CT("ai_agent")
    public final AnoleTextMoreAIItemData aiAgent;

    public AnoleTextMoreAIData() {
        this(null);
    }

    public final AnoleTextMoreAIItemData getAiAgent() {
        return this.aiAgent;
    }

    public AnoleTextMoreAIData(AnoleTextMoreAIItemData anoleTextMoreAIItemData) {
        this.aiAgent = anoleTextMoreAIItemData;
    }
}
