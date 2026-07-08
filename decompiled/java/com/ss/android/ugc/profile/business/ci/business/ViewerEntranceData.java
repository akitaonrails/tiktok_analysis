package com.ss.android.ugc.profile.business.ci.business;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ViewerEntranceData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("latest_viewer_avatar_thumb_list")
    public List<UrlModel> latestViewerAvatarThumbList;

    @C09CT("latest_viewer_uid_list")
    public List<String> latestViewerAvatarUidList;

    @C09CT("sub_describe")
    public String subTitle;

    @C09CT("unread_count")
    public Integer unReadCount;

    public final List<UrlModel> getLatestViewerAvatarThumbList() {
        return this.latestViewerAvatarThumbList;
    }

    public final List<String> getLatestViewerAvatarUidList() {
        return this.latestViewerAvatarUidList;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final Integer getUnReadCount() {
        return this.unReadCount;
    }

    public final void setLatestViewerAvatarThumbList(List<UrlModel> list) {
        this.latestViewerAvatarThumbList = list;
    }

    public final void setLatestViewerAvatarUidList(List<String> list) {
        this.latestViewerAvatarUidList = list;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setUnReadCount(Integer num) {
        this.unReadCount = num;
    }
}
