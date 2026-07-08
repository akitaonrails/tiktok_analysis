package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class RealtimeComponentConfig implements Serializable {

    @C09CT("show_info_reset_components")
    public List<GlobalComponentData> componentDataList;

    @C09CT("component_preload_configs")
    public List<ComponentPreloadConfig> componentPreloadConfig;

    @C09CT("disable_components")
    public List<String> disableComponents;

    @C09CT("final_filter_components")
    public List<String> finalFilterComponents;

    @C09CT("global_show_limit")
    public int globalShowLimit;

    @C09CT("reranked_components")
    public List<String> rerankedComponents;

    @C09CT("server_event_tracking_extra")
    public String serverTrackExtra;

    @C09CT("container_strategy")
    public FcpSlotStrategy slotStrategy;

    public RealtimeComponentConfig() {
        this(0, null, null, null, null, null, null, null, 255, null);
    }

    public final RealtimeComponentConfig copy(int i, List<String> list, List<String> list2, List<GlobalComponentData> list3, List<String> list4, String str, List<ComponentPreloadConfig> list5, FcpSlotStrategy fcpSlotStrategy) {
        return new RealtimeComponentConfig(i, list, list2, list3, list4, str, list5, fcpSlotStrategy);
    }

    public final void setRerankedComponents(List<String> list) {
        this.rerankedComponents = list;
    }

    public RealtimeComponentConfig(int i, List<String> list, List<String> list2, List<GlobalComponentData> list3, List<String> list4, String str, List<ComponentPreloadConfig> list5, FcpSlotStrategy fcpSlotStrategy) {
        this.globalShowLimit = i;
        this.disableComponents = list;
        this.rerankedComponents = list2;
        this.componentDataList = list3;
        this.finalFilterComponents = list4;
        this.serverTrackExtra = str;
        this.componentPreloadConfig = list5;
        this.slotStrategy = fcpSlotStrategy;
    }

    public RealtimeComponentConfig(int i, List list, List list2, List list3, List list4, String str, List list5, FcpSlotStrategy fcpSlotStrategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? C13BV.INSTANCE : list3, (i2 & 16) != 0 ? C13BV.INSTANCE : list4, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : list5, (i2 & 128) == 0 ? fcpSlotStrategy : null);
    }
}
