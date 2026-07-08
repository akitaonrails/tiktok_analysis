package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveTaskCardData {
    public final C01GW LIZ;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("content")
    public final String content;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("delay_time")
    public final Long delayTime;

    @C09CT("schema")
    public final String schema;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("title")
    public final String title;

    public LiveTaskCardData() {
        this(null, null, null, null, null, null, null);
    }

    public LiveTaskCardData(String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        this.taskId = str;
        this.title = str2;
        this.content = str3;
        this.buttonText = str4;
        this.schema = str5;
        this.delayTime = l;
        this.daInfo = str6;
        this.LIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 187));
    }
}
