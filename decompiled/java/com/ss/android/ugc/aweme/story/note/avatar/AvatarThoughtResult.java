package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class AvatarThoughtResult {

    @C09CT("avatar_uri")
    public final String avatarUri;

    @C09CT("avatar_urls")
    public final List<String> avatarUrls;

    @C09CT("remaining_time_in_ms")
    public final Long remainingTimeInMs;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("task_status")
    public final Integer taskStatus;

    public AvatarThoughtResult(Integer num, String str, String str2, List<String> list, Integer num2, Long l, String str3) {
        this.statusCode = num;
        this.statusMsg = str;
        this.taskId = str2;
        this.avatarUrls = list;
        this.taskStatus = num2;
        this.remainingTimeInMs = l;
        this.avatarUri = str3;
    }
}
