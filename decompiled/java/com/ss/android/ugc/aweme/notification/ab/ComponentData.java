package com.ss.android.ugc.aweme.notification.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ComponentData {
    public static final int $stable = 0;

    @C09CT("component_key")
    public final String componentKey;

    @C09CT("is_server_driven")
    public final Boolean isServerDriven;

    public ComponentData() {
        this(null, Boolean.FALSE);
    }

    public final Boolean isServerDriven() {
        return this.isServerDriven;
    }

    public ComponentData(String str, Boolean bool) {
        this.componentKey = str;
        this.isServerDriven = bool;
    }
}
