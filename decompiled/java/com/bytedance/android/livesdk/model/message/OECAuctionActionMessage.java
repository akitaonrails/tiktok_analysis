package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OECAuctionActionMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("auction_config")
    public AuctionConfig auctionConfig;

    @C09CT("auction_trace")
    public Map<String, String> auctionTrace;

    @C09CT("timestamp")
    public long timestamp;

    public OECAuctionActionMessage() {
        this.type = C001A.O_E_C_AUCTION_ACTION_MESSAGE;
        this.auctionTrace = new LinkedHashMap();
    }
}
