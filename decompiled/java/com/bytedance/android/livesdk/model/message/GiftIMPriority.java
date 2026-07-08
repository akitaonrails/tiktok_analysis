package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GiftIMPriority {

    @C09CT("priority")
    public int priority;

    @C09CT("queue_sizes")
    public List<Long> queueSizes;

    @C09CT("self_queue_priority")
    public long selfQueuePriority;
}
