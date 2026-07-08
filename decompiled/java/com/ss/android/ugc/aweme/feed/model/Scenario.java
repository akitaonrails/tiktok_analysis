package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Scenario implements Serializable {

    @C09CT("key")
    public String key;

    @C09CT("slot_info_list")
    public List<SlotInfo> slotInfoList;

    public Scenario() {
        this(null, null);
    }

    public Scenario(String str, List<SlotInfo> list) {
        this.key = str;
        this.slotInfoList = list;
    }
}
