package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.story.feed.StoryGuideCardInfo;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class MixRankSkylightInsertParams implements Serializable {

    @C09CT("insert_card_info")
    public final StoryGuideCardInfo insertCardInfo;

    @C09CT("insert_index")
    public final Integer insertIndex;

    @C09CT("insert_room_id_str")
    public final String insertRoomId;

    @C09CT("insert_story")
    public final InsertStory insertStory;

    public MixRankSkylightInsertParams() {
        this(null, null, null, null);
    }

    public MixRankSkylightInsertParams(Integer num, InsertStory insertStory, String str, StoryGuideCardInfo storyGuideCardInfo) {
        this.insertIndex = num;
        this.insertStory = insertStory;
        this.insertRoomId = str;
        this.insertCardInfo = storyGuideCardInfo;
    }
}
