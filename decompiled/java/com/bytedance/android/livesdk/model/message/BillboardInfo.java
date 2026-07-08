package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BillboardInfo {

    @C09CT("billboard_type")
    public int billboardType;

    @C09CT("billboard_version")
    public int billboardVersion;

    @C09CT("source_from")
    public int sourceFrom;

    @C09CT("billboard_ids")
    public List<String> billboardIds = new ArrayList();

    @C09CT("born_time_ms")
    public String bornTimeMs = "";

    @C09CT("da_info")
    public Map<String, String> daInfo = new LinkedHashMap();
}
