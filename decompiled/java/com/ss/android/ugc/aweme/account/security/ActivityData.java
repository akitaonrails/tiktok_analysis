package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityData implements Serializable {
    public static final int $stable = 8;

    @C09CT("display_order")
    public final int displayOrder;

    @C09CT("suspicious_logins")
    public final List<Map<Object, Object>> suspiciousLogins;

    public ActivityData() {
        this(null, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityData(List<? extends Map<Object, ? extends Object>> list, int i) {
        this.suspiciousLogins = list;
        this.displayOrder = i;
    }
}
