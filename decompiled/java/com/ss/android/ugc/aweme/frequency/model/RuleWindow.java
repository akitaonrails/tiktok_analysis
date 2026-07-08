package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class RuleWindow implements Serializable {

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final Long value;

    public RuleWindow() {
        this(null, null);
    }

    public final long getValueMs() {
        if (Intrinsics.LJFF(this.type, "second")) {
            Long l = this.value;
            return (l != null ? l.longValue() : 0L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        Long l2 = this.value;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public RuleWindow(String str, Long l) {
        this.type = str;
        this.value = l;
    }
}
