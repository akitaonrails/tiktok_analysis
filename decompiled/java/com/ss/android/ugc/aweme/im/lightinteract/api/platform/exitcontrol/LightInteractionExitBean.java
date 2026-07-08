package com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol;

import X.C09CT;
import X.C603770NmB;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class LightInteractionExitBean implements Serializable {
    public static final C603770NmB Companion = new Object() { // from class: X.0NmB
    };

    @C09CT("enter_chat_time_second")
    public final Long enterChatTimeSecond;

    @C09CT("exit_label_map")
    public final Map<String, Map<String, Long>> exitLabelMap;

    @C09CT("key")
    public final String key;

    @C09CT("latest_message_create_time")
    public final Long latestMessageCreateTime;

    @C09CT("update_timing_ms")
    public final Long updateTimingMs;

    public LightInteractionExitBean() {
        this("", null, null, null, new LinkedHashMap());
    }

    public final LightInteractionExitBean copy(String str, Long l, Long l2, Long l3, Map<String, Map<String, Long>> map) {
        return new LightInteractionExitBean(str, l, l2, l3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightInteractionExitBean)) {
            return false;
        }
        LightInteractionExitBean lightInteractionExitBean = (LightInteractionExitBean) obj;
        return Intrinsics.LJFF(this.key, lightInteractionExitBean.key) && Intrinsics.LJFF(this.updateTimingMs, lightInteractionExitBean.updateTimingMs) && Intrinsics.LJFF(this.enterChatTimeSecond, lightInteractionExitBean.enterChatTimeSecond) && Intrinsics.LJFF(this.latestMessageCreateTime, lightInteractionExitBean.latestMessageCreateTime) && Intrinsics.LJFF(this.exitLabelMap, lightInteractionExitBean.exitLabelMap);
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l = this.updateTimingMs;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.enterChatTimeSecond;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.latestMessageCreateTime;
        return ((iHashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31) + this.exitLabelMap.hashCode();
    }

    public LightInteractionExitBean(String str, Long l, Long l2, Long l3, Map<String, Map<String, Long>> map) {
        this.key = str;
        this.updateTimingMs = l;
        this.enterChatTimeSecond = l2;
        this.latestMessageCreateTime = l3;
        this.exitLabelMap = map;
    }
}
