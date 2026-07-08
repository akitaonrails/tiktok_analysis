package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class GameFloatWindowMsgStrategyConfig {
    public static final TypeAdapter ADAPTER = new GameFloatWindowMsgStrategyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled_strategy_chat")
    public boolean enableStrategyChat;

    @C09CT("enabled_strategy_gift")
    public boolean enableStrategyGift;

    @C09CT("max_count_chat")
    public int maxCountChat;

    @C09CT("max_count_gift")
    public int maxCountGift;

    @C09CT("strategy_chat_free_time_num")
    public int strategyChatFreeTimeNum;

    @C09CT("strategy_chat_show_time1")
    public long strategyChatShowTimeOne;

    @C09CT("strategy_chat_show_time2")
    public long strategyChatShowTimeTwo;

    public GameFloatWindowMsgStrategyConfig() {
        this(2000L, 1000L, 3, false, false, 3, 3);
    }

    public GameFloatWindowMsgStrategyConfig(long j, long j2, int i, boolean z, boolean z2, int i2, int i3) {
        this.strategyChatShowTimeOne = j;
        this.strategyChatShowTimeTwo = j2;
        this.strategyChatFreeTimeNum = i;
        this.enableStrategyChat = z;
        this.enableStrategyGift = z2;
        this.maxCountGift = i2;
        this.maxCountChat = i3;
    }
}
