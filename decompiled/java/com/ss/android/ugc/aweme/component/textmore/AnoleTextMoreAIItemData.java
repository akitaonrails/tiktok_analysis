package com.ss.android.ugc.aweme.component.textmore;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleTextMoreAIItemData implements Serializable {
    public static final int $stable = 8;

    @C09CT("bot_config")
    public final BotConfig botConfig;

    @C09CT("enable_auto_show")
    public final boolean enableAutoShow;

    @C09CT("question")
    public final String question;

    @C09CT("title")
    public final String title;

    public AnoleTextMoreAIItemData() {
        this(null, true, null, null);
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

    public final String getTitle() {
        return this.title;
    }

    public AnoleTextMoreAIItemData(String str, boolean z, String str2, BotConfig botConfig) {
        this.title = str;
        this.enableAutoShow = z;
        this.question = str2;
        this.botConfig = botConfig;
    }
}
