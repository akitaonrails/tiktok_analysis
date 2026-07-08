package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UserPreferVideoModel extends BaseResponse {

    @C09CT("video_list")
    public List<UserPreferVideo> videoList;

    public List<UserPreferVideo> getVideoList() {
        return this.videoList;
    }
}
