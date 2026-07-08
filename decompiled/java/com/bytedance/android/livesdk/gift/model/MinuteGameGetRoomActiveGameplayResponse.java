package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.minute_game.model.MinuteGameGameplay;

/* JADX INFO: loaded from: classes.dex */
public final class MinuteGameGetRoomActiveGameplayResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gameplay")
        public MinuteGameGameplay gameplay;
    }
}
