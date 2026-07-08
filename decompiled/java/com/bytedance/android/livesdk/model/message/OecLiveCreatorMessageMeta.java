package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveCreatorMessageMeta {

    @C09CT("server_send_ns")
    public long serverSendNs;

    @C09CT("source_operate_ns")
    public long sourceOperateNs;

    @C09CT("reason")
    public String reason = "";

    @C09CT("trace_info_map")
    public Map<String, String> traceInfoMap = new LinkedHashMap();
}
