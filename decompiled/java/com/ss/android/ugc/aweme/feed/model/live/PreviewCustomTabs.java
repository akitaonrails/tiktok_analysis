package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewCustomTabs implements Serializable {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("begin_time")
    public long beginTime;

    @C09CT("custom_tab_list")
    public List<PreviewCustomTab> customTabList = new ArrayList();

    @C09CT("default_tab_index")
    public long defaultTabIndex;

    @C09CT("end_time")
    public long endTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("room_id")
    public long roomId;
}
