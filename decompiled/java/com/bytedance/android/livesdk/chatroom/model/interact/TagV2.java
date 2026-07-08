package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TagV2 {

    @C09CT("cohost_history_day")
    public long cohostHistoryDay;

    @C09CT("second_degree_relation_content")
    public SecondDegreeRelationContent secondDegreeRelationContent;

    @C09CT("similar_interest_content")
    public SimilarInterestContent similarInterestContent;

    @C09CT("tag_classification")
    public int tagClassification;

    @C09CT("tag_type")
    public int tagType;

    @C09CT("tag_value")
    public String tagValue = "";

    @C09CT("starling_key")
    public String starlingKey = "";

    public static final class SecondDegreeRelationContent {

        @C09CT("related_users")
        public List<UserInfo> relatedUsers = new ArrayList();

        @C09CT("total_related_user_cnt")
        public long totalRelatedUserCnt;

        public static final class UserInfo {

            @C09CT("avatar_thumb")
            public ImageModel avatarThumb;

            @C09CT("nick_name")
            public String nickName = "";

            @C09CT("user_id")
            public long userId;
        }
    }

    public static final class SimilarInterestContent {

        @C09CT("content_id")
        public long contentId;

        @C09CT("display_text")
        public String displayText = "";
    }
}
