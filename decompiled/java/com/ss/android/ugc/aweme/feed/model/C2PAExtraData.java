package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class C2PAExtraData {

    @C09CT("aigc_percentage_type")
    public final int aigcPercentageType;

    @C09CT("fingerprint_id")
    public final String fingerprintID;

    @C09CT("gcmark_content_producer")
    public final List<String> gcMarkContentProducerList;

    @C09CT("has_invisible_watermark")
    public final int hasInvisibleWatermark;

    @C09CT("iptc_type")
    public final List<String> iptcTypeList;

    public C2PAExtraData() {
        this(0, "", 2, new CopyOnWriteArrayList(), new CopyOnWriteArrayList());
    }

    public C2PAExtraData(int i, String str, int i2, List<String> list, List<String> list2) {
        this.aigcPercentageType = i;
        this.fingerprintID = str;
        this.hasInvisibleWatermark = i2;
        this.gcMarkContentProducerList = list;
        this.iptcTypeList = list2;
    }
}
