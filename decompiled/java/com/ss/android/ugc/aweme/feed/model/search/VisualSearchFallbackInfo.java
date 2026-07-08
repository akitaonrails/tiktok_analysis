package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class VisualSearchFallbackInfo implements Serializable {

    @C09CT("fallback_vtag_action_type")
    public Integer fallbackVtagActionType;

    @C09CT("fallback_vtag_name")
    public String fallbackVtagName;

    @C09CT("tag_type")
    public String tagType;

    public VisualSearchFallbackInfo() {
        this(0, null, null);
    }

    public final FallbackActionType getFallbackTagType() {
        FallbackActionType next;
        Iterator<FallbackActionType> it2 = FallbackActionType.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int value = next.getValue();
            Integer num = this.fallbackVtagActionType;
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        FallbackActionType fallbackActionType = next;
        return fallbackActionType == null ? FallbackActionType.DEFAULT : fallbackActionType;
    }

    public VisualSearchFallbackInfo(Integer num, String str, String str2) {
        this.fallbackVtagActionType = num;
        this.fallbackVtagName = str;
        this.tagType = str2;
    }
}
