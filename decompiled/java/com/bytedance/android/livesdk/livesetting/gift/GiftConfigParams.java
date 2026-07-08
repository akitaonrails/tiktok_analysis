package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftConfigParams {
    public static final TypeAdapter ADAPTER = new GiftConfigParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("anchor_side")
    public GiftConfig _anchorSide;

    @C09CT("enable_config")
    public boolean _enableConfig;

    @C09CT("other_queue_size_stairs")
    public List<MsgStair> _otherQueueStairs;

    @C09CT("other_side")
    public GiftConfig _otherSide;

    @C09CT("self_queue_size_stairs")
    public List<MsgStair> _selfQueueStairs;

    @C09CT("self_side")
    public GiftConfig _selfSide;

    public GiftConfigParams() {
        GiftConfig giftConfig = GiftConfig.LIZ;
        GiftConfig giftConfig2 = GiftConfig.LIZ;
        this._selfSide = giftConfig2;
        this._anchorSide = giftConfig2;
        this._otherSide = giftConfig2;
        C13BV c13bv = C13BV.INSTANCE;
        this._selfQueueStairs = c13bv;
        this._otherQueueStairs = c13bv;
    }
}
