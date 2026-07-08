package com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo;

import X.C09CT;
import X.C0QKF;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SuggestReason implements Serializable {

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("query_text_option")
    public final int queryTextOption;

    @C09CT("reason")
    public final String reason;

    @C09CT("reason_position")
    public final int reasonPosition;

    @C09CT("type")
    public final int type;
    public static final C0QKF Companion = new Object() { // from class: X.0QKF
    };
    public static final int $stable = 8;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestReason)) {
            return false;
        }
        SuggestReason suggestReason = (SuggestReason) obj;
        return Intrinsics.LJFF(this.reason, suggestReason.reason) && this.type == suggestReason.type && Intrinsics.LJFF(this.extra, suggestReason.extra) && this.queryTextOption == suggestReason.queryTextOption && this.reasonPosition == suggestReason.reasonPosition;
    }

    public final boolean needDeduplicate() {
        return this.type == 2;
    }

    public SuggestReason(String str, int i, Map<String, String> map, int i2, int i3) {
        this.reason = str;
        this.type = i;
        this.extra = map;
        this.queryTextOption = i2;
        this.reasonPosition = i3;
    }
}
