package com.tt.appbrandimpl;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PublishExtra {

    @C09CT("alias_id")
    public String aliasId;

    @C09CT(alternate = {"videoTopics"}, value = "hashtag_list")
    public List<String> hashTagList;

    @C09CT("user_list")
    public List<TaskMentionedUser> userList;

    @C09CT("videoPath")
    public String videoPath;

    @C09CT("video_title")
    public String videoTitle;
}
