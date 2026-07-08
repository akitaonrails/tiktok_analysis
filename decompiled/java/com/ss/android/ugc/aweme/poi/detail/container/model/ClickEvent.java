package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ClickEvent implements Serializable {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("params")
    public final Map<String, Object> params;

    public ClickEvent() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickEvent)) {
            return false;
        }
        ClickEvent clickEvent = (ClickEvent) obj;
        return Intrinsics.LJFF(this.actionType, clickEvent.actionType) && Intrinsics.LJFF(this.params, clickEvent.params);
    }

    public ClickEvent(String str, Map<String, ? extends Object> map) {
        this.actionType = str;
        this.params = map;
    }
}
