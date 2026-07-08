package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerWebAnalysisSettingInfo {

    @C09CT("allow_list")
    public final List<String> allowList;

    @C09CT("block_list")
    public final List<String> blockList;

    @C09CT("collect_delay")
    public final Long collectDelay;

    @C09CT("request_url")
    public final String requestUrl;

    @C09CT("sample_rate")
    public final Integer sampleRate;

    @C09CT("state")
    public final int state;

    public PipoContainerWebAnalysisSettingInfo() {
        this(0, null, null, 2500L, 0, null);
    }

    public PipoContainerWebAnalysisSettingInfo(int i, List<String> list, List<String> list2, Long l, Integer num, String str) {
        this.state = i;
        this.allowList = list;
        this.blockList = list2;
        this.collectDelay = l;
        this.sampleRate = num;
        this.requestUrl = str;
    }
}
