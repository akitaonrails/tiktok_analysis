package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TopFrameV2Summary {

    @C09CT("config_version")
    public long configVersion;

    @C09CT("end_time")
    public long endTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("operate_version")
    public long operateVersion;

    @C09CT("start_time")
    public long startTime;

    @C09CT("time_travel_offset_sec")
    public long timeTravelOffsetSec;

    @C09CT("type")
    public int type;

    @C09CT("title")
    public String title = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("show_list")
    public List<ShowInfoV2> showList = new ArrayList();

    @C09CT("resource_configs")
    public Map<String, ResourceConfig> resourceConfigs = new LinkedHashMap();
}
