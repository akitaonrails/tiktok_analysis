package com.ss.android.ugc.aweme.ecommerce.jsb.threadopt;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcJsbSparkChannels {

    @C09CT("channels")
    public final List<String> channels;

    @C09CT("default_thread")
    public final String defaultThread;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("thread_types")
    public final Map<String, String> threadTypes;

    public EcJsbSparkChannels() {
        this(false, null, null, null, 15, null);
    }

    public EcJsbSparkChannels(boolean z, String str, Map<String, String> map, List<String> list) {
        this.enable = z;
        this.defaultThread = str;
        this.threadTypes = map;
        this.channels = list;
    }

    public EcJsbSparkChannels(boolean z, String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C2097608Jq.LJ() : map, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
