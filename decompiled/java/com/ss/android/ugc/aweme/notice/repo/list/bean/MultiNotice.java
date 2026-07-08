package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C08JS;
import X.C09CT;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class MultiNotice implements Serializable {

    @C09CT("count")
    public final int count;

    @C09CT("first_read_time_in_session")
    public long firstReadTime;

    @C09CT("first_read_time_in_session_for_friend")
    public long firstReadTimeInFriendsTab;

    @C09CT("group")
    public final int group;

    @C09CT("is_mark_read")
    public final int markRead;

    @C09CT("max_time")
    public final long maxTime;

    @C09CT("min_time")
    public final long minTime;

    @C09CT("cursor")
    public String cursor = "";

    @C09CT("ab_settings")
    public final Map<String, Integer> abSettingExtra = new LinkedHashMap();

    public final String toReqStr() {
        return C08JS.LIZLLL(Collections.singletonList(this));
    }

    public final MultiNotice mayWithMergedTTShopArg(boolean z) {
        if (z) {
            this.abSettingExtra.put("ec_merged_tiktok_shop", 1);
        }
        return this;
    }

    public final void setCursor(String str) {
        this.cursor = str;
    }

    public final void setFirstReadTime(long j) {
        this.firstReadTime = j;
    }

    public final void setFirstReadTimeInFriendsTab(long j) {
        this.firstReadTimeInFriendsTab = j;
    }

    public MultiNotice(int i, long j, long j2, int i2, int i3) {
        this.group = i;
        this.maxTime = j;
        this.minTime = j2;
        this.count = i2;
        this.markRead = i3;
    }
}
