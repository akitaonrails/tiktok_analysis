package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiViewDetailResponse {

    @C09CT("action_user_list")
    public final List<BulletinEmojiActionUser> actionUserList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("nav_tab_list")
    public final List<BulletinEmojiTab> navTabList;

    @C09CT("next_cursor")
    public final String nextCursor;

    @C09CT("selected_tab")
    public final String selectedEmoji;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("total")
    public final Long total;

    @C09CT("wall_time")
    public final Long wallTime;

    public BulletinEmojiViewDetailResponse(Integer num, String str, Long l, String str2, Boolean bool, String str3, List<BulletinEmojiTab> list, List<BulletinEmojiActionUser> list2, Long l2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.total = l;
        this.nextCursor = str2;
        this.hasMore = bool;
        this.selectedEmoji = str3;
        this.navTabList = list;
        this.actionUserList = list2;
        this.wallTime = l2;
    }
}
