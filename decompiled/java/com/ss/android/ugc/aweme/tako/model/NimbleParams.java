package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class NimbleParams implements Serializable {
    public static final int $stable = 8;

    @C09CT("data_repeat_key")
    public String dateRepeatKey;

    @C09CT("nimble_card_type")
    public final Integer nimbleCardType;

    @C09CT("nimble_data")
    public final Map<String, Object> nimbleData;

    @C09CT("nimble_gecko_key")
    public final String nimbleGeckoKey;

    @C09CT("nimble_key")
    public final String nimbleKey;

    @C09CT("nimble_offset")
    public final Float nimbleOffset;

    @C09CT("nimble_offset_index")
    public final Integer nimbleOffsetIndex;
    public transient String nimbleOffsetMessageUUID;

    @C09CT("nimble_offset_position_node")
    public final String nimbleOffsetPositionNode;

    @C09CT("storage_key")
    public String storageKey;

    public NimbleParams() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final void setDateRepeatKey(String str) {
        this.dateRepeatKey = str;
    }

    public final void setNimbleOffsetMessageUUID(String str) {
        this.nimbleOffsetMessageUUID = str;
    }

    public final void setStorageKey(String str) {
        this.storageKey = str;
    }

    public NimbleParams(String str, Map<String, ? extends Object> map, Integer num, String str2, Integer num2, String str3, Float f, String str4, String str5, String str6) {
        this.nimbleKey = str;
        this.nimbleData = map;
        this.nimbleCardType = num;
        this.nimbleGeckoKey = str2;
        this.nimbleOffsetIndex = num2;
        this.nimbleOffsetPositionNode = str3;
        this.nimbleOffset = f;
        this.nimbleOffsetMessageUUID = str4;
        this.storageKey = str5;
        this.dateRepeatKey = str6;
    }
}
