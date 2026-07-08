package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ViewerEntranceInfo implements Serializable {

    @C09CT("can_show_entrance")
    public boolean canShowEntrance;

    @C09CT("latest_viewer_avatar_thumb_list")
    public List<UrlModel> latestViewerAvatarThumbList;

    @C09CT("latest_viewer_uid_list")
    public List<String> latestViewerAvatarUidList;

    @C09CT("unread_viewer_count")
    public int unReadViewerCount;

    public final boolean getCanShowEntrance() {
        return this.canShowEntrance;
    }

    public final List<UrlModel> getLatestViewerAvatarThumbList() {
        return this.latestViewerAvatarThumbList;
    }

    public final List<String> getLatestViewerAvatarUidList() {
        return this.latestViewerAvatarUidList;
    }

    public final int getUnReadViewerCount() {
        return this.unReadViewerCount;
    }

    public final void setCanShowEntrance(boolean z) {
        this.canShowEntrance = z;
    }

    public final void setLatestViewerAvatarThumbList(List<UrlModel> list) {
        this.latestViewerAvatarThumbList = list;
    }

    public final void setLatestViewerAvatarUidList(List<String> list) {
        this.latestViewerAvatarUidList = list;
    }

    public final void setUnReadViewerCount(int i) {
        this.unReadViewerCount = i;
    }
}
