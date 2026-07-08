package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SlotInfo implements Serializable {

    @C09CT("raw_data")
    public String rawData;

    @C09CT("slot_config")
    public SlotConfig slotConfig;

    public SlotInfo() {
        this(null, null);
    }

    public SlotInfo(SlotConfig slotConfig, String str) {
        this.slotConfig = slotConfig;
        this.rawData = str;
    }
}
