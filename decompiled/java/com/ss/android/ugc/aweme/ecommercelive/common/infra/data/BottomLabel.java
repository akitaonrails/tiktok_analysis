package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class BottomLabel {

    @C09CT("count_down_format_text")
    public final String cdtFormatText;

    @C09CT("end_time_ms")
    public final String endTimeMs;

    @C09CT("label_color")
    public final String labelColor;

    @C09CT("label_text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public BottomLabel() {
        this(null, null, null, null, null);
    }

    public BottomLabel(Integer num, String str, String str2, String str3, String str4) {
        this.type = num;
        this.text = str;
        this.endTimeMs = str2;
        this.labelColor = str3;
        this.cdtFormatText = str4;
    }
}
