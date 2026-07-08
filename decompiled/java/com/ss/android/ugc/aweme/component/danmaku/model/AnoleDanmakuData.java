package com.ss.android.ugc.aweme.component.danmaku.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleDanmakuData implements Serializable {
    public static final int $stable = 8;

    @C09CT("bot_config")
    public final BotConfig botConfig;

    @C09CT("danmaku_list")
    public final List<Danmu> danmuList;

    @C09CT("ec_agent_schema")
    public final String ecAgentSchema;

    @C09CT("jump_model")
    public final CRouterCoreModel jumpModel;

    @C09CT("line_count")
    public final Integer lineCount;

    public AnoleDanmakuData() {
        this(null, null, null, null, null);
    }

    public final BotConfig getBotConfig() {
        return this.botConfig;
    }

    public final List<Danmu> getDanmuList() {
        return this.danmuList;
    }

    public final String getEcAgentSchema() {
        return this.ecAgentSchema;
    }

    public final CRouterCoreModel getJumpModel() {
        return this.jumpModel;
    }

    public final Integer getLineCount() {
        return this.lineCount;
    }

    public final BotConfig resolveBotConfig(Danmu danmu) {
        BotConfig botConfig = danmu.botConfig;
        if (botConfig == null) {
            return this.botConfig;
        }
        return botConfig;
    }

    public final String resolveEcAgentSchema(Danmu danmu) {
        String str = danmu.ecAgentSchema;
        if (str == null) {
            return this.ecAgentSchema;
        }
        return str;
    }

    public final CRouterCoreModel resolveJumpModel(Danmu danmu) {
        CRouterCoreModel cRouterCoreModel = danmu.jumpModel;
        if (cRouterCoreModel == null) {
            return this.jumpModel;
        }
        return cRouterCoreModel;
    }

    public AnoleDanmakuData(List<Danmu> list, Integer num, BotConfig botConfig, CRouterCoreModel cRouterCoreModel, String str) {
        this.danmuList = list;
        this.lineCount = num;
        this.botConfig = botConfig;
        this.jumpModel = cRouterCoreModel;
        this.ecAgentSchema = str;
    }
}
