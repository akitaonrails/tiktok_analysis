package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MsgNotifyComponentAvoidRuleV2 {
    public static final TypeAdapter ADAPTER = new MsgNotifyComponentAvoidRuleV2_OptTypeAdapter(NormalGson.singleton());

    @C09CT("avoid_watch_early_ms")
    public long avoidWatchEarlyMs;

    @C09CT("can_be_interrupt")
    public boolean canBeInterrupt;

    @C09CT("component_type")
    public int componentType;

    @C09CT("first_recover_info")
    public MsgNotifyComponentRecoverInfo firstRecoverInfo;

    @C09CT("interrupt_recover_info")
    public MsgNotifyComponentRecoverInfo interruptRecoverInfo;

    @C09CT("max_active_count")
    public int maxActiveCount;

    @C09CT("priority")
    public long priority;

    @C09CT("sub_component_type")
    public int subComponentType;

    @C09CT("avoid_scene")
    public List<String> avoidScene = new ArrayList();

    @C09CT("recover_threshold_ms")
    public long recoverThresholdMs = -1;

    @C09CT("max_recover_remain_ms")
    public long maxRecoverRemainMs = -1;
}
