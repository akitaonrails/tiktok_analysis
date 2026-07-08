package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.ShowInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TopFrameSummary {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_pre_recorded")
    public boolean isPreRecorded;

    @C09CT("schema")
    public String schema;

    @C09CT("show_list")
    public List<ShowInfo> showList;

    @C09CT("title")
    public String title;

    @C09CT("pre_recorded_badge_text")
    public String preRecordedBadgeText = "";

    @C09CT("id_str")
    public String idStr = "";
}
