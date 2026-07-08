package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class FeedRoomTag implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("content")
    public String content;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("event_tags")
    public Map<String, String> eventTags;

    @C09CT("from_user")
    public LiveShareUser fromUser;

    @C09CT("from_user_list")
    public List<LiveShareUser> fromUserList;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("recommond_info")
    public final String recommendInfo;

    @C09CT("style")
    public int style;

    @C09CT("total_user_list_count")
    public int totalUserListCount;

    public static final class Companion {
    }

    public FeedRoomTag() {
        this(-1L, -1, "", null, null, null, null, null, -1, C2097608Jq.LJ());
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setDaInfo(String str) {
        this.daInfo = str;
    }

    public final void setEventTags(Map<String, String> map) {
        this.eventTags = map;
    }

    public final void setFromUser(LiveShareUser liveShareUser) {
        this.fromUser = liveShareUser;
    }

    public final void setFromUserList(List<LiveShareUser> list) {
        this.fromUserList = list;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setTotalUserListCount(int i) {
        this.totalUserListCount = i;
    }

    public FeedRoomTag(long j, int i, String str, UrlModel urlModel, String str2, String str3, LiveShareUser liveShareUser, List<LiveShareUser> list, int i2, Map<String, String> map) {
        this.id = j;
        this.style = i;
        this.content = str;
        this.icon = urlModel;
        this.daInfo = str2;
        this.recommendInfo = str3;
        this.fromUser = liveShareUser;
        this.fromUserList = list;
        this.totalUserListCount = i2;
        this.eventTags = map;
    }
}
