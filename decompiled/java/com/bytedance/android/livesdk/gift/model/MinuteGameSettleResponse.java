package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.minute_game.model.Contributor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MinuteGameSettleResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("gameplay_id")
        public long gameplayId;

        @C09CT("settlement_data")
        public SettlementData settlementData;
    }

    public static final class SettlementData {

        @C09CT("initiator")
        public Contributor initiator;

        @C09CT("top_contributors")
        public List<Contributor> topContributors = new ArrayList();
    }
}
