package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.AnonymousClass0621;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IMAIBotApi {
    public static final AnonymousClass0621 LIZ = AnonymousClass0621.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/im/bot/create")
    C11NZ<BotCreateResponse> createBot(@InterfaceC1485405rg BotCreateRequest botCreateRequest);

    @InterfaceC1501170pAR("/tiktok/v1/im/bot/delete")
    C11NZ<BotDeleteResponse> deleteBot(@InterfaceC1485405rg BotDeleteRequest botDeleteRequest);

    @InterfaceC1501160pAQ("/tiktok/v1/im/bot/get")
    C11NZ<Object> getBotById(@InterfaceC1501070pAH("bot_id") long j);

    @InterfaceC1501160pAQ("/tiktok/v1/im/bot/list")
    C11NZ<BotGetBySceneResponse> getBotByScenes(@InterfaceC1501070pAH("scenes") List<Integer> list, @InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2);

    @InterfaceC1501170pAR("/tiktok/v1/im/bot/update")
    C11NZ<BotUpdateResponse> updateBot(@InterfaceC1485405rg BotUpdateRequest botUpdateRequest);
}
