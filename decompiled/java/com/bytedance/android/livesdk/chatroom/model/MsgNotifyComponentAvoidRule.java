package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MsgNotifyComponentAvoidRule {

    @C09CT("component_type")
    public int componentType;

    @C09CT("max_recover_remain_ms")
    public long maxRecoverRemainMs;

    @C09CT("recover_threshold_ms")
    public long recoverThresholdMs;

    @C09CT("exclusive_queue")
    public List<String> exclusiveQueue = new ArrayList();

    @C09CT("timeline_queue")
    public List<String> timelineQueue = new ArrayList();
}
