package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomJsbOptConfigData {

    @C09CT("channels")
    public final EcomCommonOptimizeConfigBean channels;

    @C09CT("default_map")
    public final boolean defaultMap;

    @C09CT("default_thread")
    public final String defaultThread;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("main_channels")
    public final List<String> mainThreadChannels;

    @C09CT("piper_data_jsb")
    public final List<String> piperDataJsb;

    @C09CT("thread_types")
    public final Map<String, String> threadTypes;

    public EcomJsbOptConfigData() {
        this(false, false, null, null, null, null, null, 127, null);
    }

    public EcomJsbOptConfigData(boolean z, boolean z2, String str, Map<String, String> map, List<String> list, EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean, List<String> list2) {
        this.enable = z;
        this.defaultMap = z2;
        this.defaultThread = str;
        this.threadTypes = map;
        this.piperDataJsb = list;
        this.channels = ecomCommonOptimizeConfigBean;
        this.mainThreadChannels = list2;
    }

    public EcomJsbOptConfigData(boolean z, boolean z2, String str, Map map, List list, EcomCommonOptimizeConfigBean ecomCommonOptimizeConfigBean, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : str, (i & 8) != 0 ? C2097608Jq.LJ() : map, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? null : ecomCommonOptimizeConfigBean, (i & 64) == 0 ? list2 : null);
    }
}
