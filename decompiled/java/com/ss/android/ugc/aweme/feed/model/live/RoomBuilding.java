package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class RoomBuilding extends BaseResponse implements Serializable {

    @C09CT("activity_h5_url")
    public String activityH5Url;

    @C09CT("activity_icon_url")
    public UrlModel activityIconUrl;

    @C09CT("begin_time")
    public long beginTime;

    @C09CT("end_time")
    public long endTime;

    @C09CT("show_h5")
    public boolean showH5;

    @C09CT("show_h5_url")
    public String showH5Url;
}
