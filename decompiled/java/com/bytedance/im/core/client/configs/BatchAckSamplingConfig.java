package com.bytedance.im.core.client.configs;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchAckSamplingConfig {

    @C09CT("imsdk_e2e_latency_event_cmd_message_type")
    public final List<Integer> cmdMessageTypes;

    @C09CT("imsdk_e2e_latency_event_common_cmd_type")
    public final List<Integer> commonCmdTypes;

    @C09CT("imsdk_e2e_latency_event_divisor")
    public final int divisor;

    @C09CT("imsdk_e2e_latency_event_normal_message_type")
    public final List<Integer> normalMessageTypes;

    public BatchAckSamplingConfig() {
        this(0, null, null, null, 15, null);
    }

    public BatchAckSamplingConfig(int i, List<Integer> list, List<Integer> list2, List<Integer> list3) {
        this.divisor = i;
        this.normalMessageTypes = list;
        this.cmdMessageTypes = list2;
        this.commonCmdTypes = list3;
    }

    public BatchAckSamplingConfig(int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i, (i2 & 2) != 0 ? C1697810uHb.LJIIJJI(5, 7, 8, 15, 1021) : list, (i2 & 4) != 0 ? C1697810uHb.LJIIJJI(50001, 50005) : list2, (i2 & 8) != 0 ? Collections.singletonList(7) : list3);
    }
}
