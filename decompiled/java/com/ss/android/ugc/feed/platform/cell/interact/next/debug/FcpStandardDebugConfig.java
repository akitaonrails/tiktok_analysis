package com.ss.android.ugc.feed.platform.cell.interact.next.debug;

import X.C09CT;
import X.C1697810uHb;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpStandardDebugConfig {
    public static final int $stable = 8;

    @C09CT("enable_debug")
    public final boolean enable;

    @C09CT("global_standard_list")
    public final List<StandardSignal> globalStandardList;

    @C09CT("standard_template_data")
    public final Map<String, StdStandardTemplateData> standardTemplateData;

    public FcpStandardDebugConfig() {
        this(false, C1697810uHb.LJIILJJIL(new StandardSignal(-1, "bottom_button_test1", true), new StandardSignal(-1, "high_tag_test_one", true)), C2097608Jq.LJ());
    }

    public FcpStandardDebugConfig(boolean z, List<StandardSignal> list, Map<String, StdStandardTemplateData> map) {
        this.enable = z;
        this.globalStandardList = list;
        this.standardTemplateData = map;
    }
}
