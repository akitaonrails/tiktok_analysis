package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AiAgentConfig implements Serializable {

    @C09CT("bot_config")
    public final BotConfig botConfig;

    @C09CT("enable_auto_show")
    public final boolean enableAutoShow;

    @C09CT("question")
    public final String question;

    public AiAgentConfig() {
        this(false, null, null);
    }

    public final BotConfig getBotConfig() {
        return this.botConfig;
    }

    public final boolean getEnableAutoShow() {
        return this.enableAutoShow;
    }

    public final String getQuestion() {
        return this.question;
    }

    public AiAgentConfig(boolean z, String str, BotConfig botConfig) {
        this.enableAutoShow = z;
        this.question = str;
        this.botConfig = botConfig;
    }
}
